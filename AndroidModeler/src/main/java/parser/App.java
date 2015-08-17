package parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import model.AndroidApplication;
import model.Component;
import model.Feature;
import model.JavaApplication;
import model.JavaComponent;
import model.Model;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import templates.ComponentTemplate;
import templates.GradleTemplate;
import templates.JavaComponentTemplate;
import templates.ManifestTemplate;
import templates.FeatureTemplate;
import util.*;

public class App {
	public static void err(String errMsg) {
		System.err.println(errMsg);
		System.exit(-1);
	}

	public static void main(String[] args) {
		if (args.length != 1)
			err("Usage: java App <input-file>");
		File file = new File(args[0]);

		if (!file.exists())
			err("Specific input file does not exists.");

		CharStream charStream = null;
		try {
			charStream = new ANTLRFileStream(args[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}

		DroidModelerLexer lexer = new DroidModelerLexer(charStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DroidModelerParser parser = new DroidModelerParser(tokens);

		ParserRuleContext tree = parser.appDefinition();
		ParseTreeWalker walker = new ParseTreeWalker();
		TreeParser listener = new TreeParser();
		walker.walk(listener, tree);
		Model model = listener.getModel();

		AndroidApplication app = null;
		JavaApplication japp = null;
		Path classDir = null;
		try {
			app = model.getAndroidApps().get(0);
			japp = model.getJavaApps().get(0);
			if (app != null){
				Path basePath = Paths.get("generated-client");
				Files.createDirectories(basePath);
				
				Path gradleFile = basePath.resolve("build.gradle");
				writeToFile(gradleFile, GradleTemplate.getInstance().generate(app));
	
				Path mainSourceDir = basePath.resolve("src/main");
				Files.createDirectories(mainSourceDir);
				Path manifestFile = mainSourceDir.resolve("AndroidManifest.xml");
				String manifestXml = ManifestTemplate.getInstance().generate(app);
				writeToFile(manifestFile, XMLFormatter.format(manifestXml));
	
				Path javaDir = mainSourceDir.resolve("java");
				classDir = javaDir.resolve(app.getJavaName().replace(".", "/"));
				Files.createDirectories(classDir);
			}
			if (japp != null){
				Path basePath = Paths.get("generated-server");
				Files.createDirectories(basePath);
					
				Path mainSourceDir = basePath.resolve("src/main");
				Files.createDirectories(mainSourceDir);
				//Path manifestFile = mainSourceDir.resolve("AndroidManifest.xml");
				//String manifestXml = ManifestTemplate.getInstance().generate(japp);
				//writeToFile(manifestFile, XMLFormatter.format(manifestXml));
	
				Path javaDir = mainSourceDir.resolve("java");
				classDir = javaDir.resolve(japp.getJavaName().replace(".", "/"));
				Files.createDirectories(classDir);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		for (Component c : app.getComponents()) {
			ComponentTemplate template = c.getTemplate();
			String code = template.generate(app, c);
			Path classFile = classDir.resolve(c.getName() + ".java");
			writeToFile(classFile, code);
		}
		
		for (Feature f : app.getFeature()) {
			FeatureTemplate template = f.getTemplate();
			String code = template.generate(app, f);
			Path classFile = classDir.resolve(f.getName() + ".java");
			writeToFile(classFile, code);
		}
		
		for (JavaComponent j : japp.getComponents()) {
			JavaComponentTemplate template = j.getTemplate();
			String code = template.generate(japp, j);
			Path classFile = classDir.resolve(j.getName() + ".java");
			writeToFile(classFile, code);
		}
	}

	public static void writeToFile(Path path, String content) {
		try (FileOutputStream ostream = new FileOutputStream(path.toFile());) {
			ostream.write(content.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
