package templates

import model.JavaApplication
import model.JavaComponent

interface JavaComponentTemplate {
	def String generate(JavaApplication app, JavaComponent jc);
}