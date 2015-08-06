package parser;

import model.Activity;
import model.AndroidAppFactory;
import model.AndroidApplication;
import model.BroadcastReceiver;
import model.GCMBroadcastReceiver;
import model.GCMIntentService;
import model.Model;
import model.Service;
import model.TopicManager;
import parser.DroidModelerParser.ActivityDefinitionContext;
import parser.DroidModelerParser.AppDefinitionContext;
import parser.DroidModelerParser.BroadcastReceiverDefinitionContext;
import parser.DroidModelerParser.GcmFeatureDefinitionContext;
import parser.DroidModelerParser.GroupDefinitionContext;
import parser.DroidModelerParser.PackageDefinitionContext;
import parser.DroidModelerParser.ServiceDefinitionContext;
import parser.DroidModelerParser.TopicDefinitionContext;

public class TreeParser extends DroidModelerBaseListener {
	private AndroidAppFactory factory = new AndroidAppFactory();
	private Model model = factory.createModel();
	private AndroidApplication app;
	private boolean inGcmDefinition = false;
	private boolean GroupsOn = false;

	private GCMBroadcastReceiver lastGCMRecv = null;
	private GCMIntentService lastGCMIntentServ = null;

	@Override
	public void enterAppDefinition(AppDefinitionContext ctx) {
		app = factory.createAndroidApplication();
		model.getAndroidApps().add(app);
		app.setName(ctx.name.getText());
		if (ctx.minSDK != null) {
			int minSDK = Integer.parseInt(ctx.minSDK.getText());
			app.setMinSDK(minSDK);
		} else {
			app.setMinSDK(16);
		}
		if (ctx.targetSDK != null) {
			int targetSDK = Integer.parseInt(ctx.targetSDK.getText());
			app.setTargetSDK(targetSDK);
		} else {
			app.setTargetSDK(16);
		}
	}

	@Override
	public void enterPackageDefinition(PackageDefinitionContext ctx) {
		app.setJavaName(ctx.name.getText());
	}

	@Override
	public void enterServiceDefinition(ServiceDefinitionContext ctx) {
		Service service;
		if (!inGcmDefinition) {
			service = factory.createService();
		} else {
			lastGCMIntentServ = factory.createGCMIntentService();
			service = lastGCMIntentServ;
		}
		service.setName(ctx.name.getText());
		app.addComponent(service);
	}

	@Override
	public void enterBroadcastReceiverDefinition(
			BroadcastReceiverDefinitionContext ctx) {
		BroadcastReceiver broadcastReceiver = null;
		if (!inGcmDefinition) {
			broadcastReceiver = factory
					.createBroadcastReceiver();
		} else {
			lastGCMRecv = factory
					.createGCMBroadcastReceiver();
			broadcastReceiver = lastGCMRecv;
		}
		broadcastReceiver.setName(ctx.name.getText());
		app.addComponent(broadcastReceiver);
	}

	@Override
	public void enterActivityDefinition(ActivityDefinitionContext ctx) {
		Activity activity = null;
		if (!inGcmDefinition) {
			activity = factory.createActivity();
		} else {
			if (GroupsOn)
				activity = factory.createGCMActivity(true);
			else
				activity = factory.createGCMActivity();
		}
		activity.setName(ctx.name.getText());
		app.addComponent(activity);
	}

	@Override
	public void enterGcmFeatureDefinition(GcmFeatureDefinitionContext ctx) {
		inGcmDefinition = true;
		lastGCMIntentServ = null;
		lastGCMRecv = null;
	}

	@Override
	public void exitGcmFeatureDefinition(GcmFeatureDefinitionContext ctx) {
		inGcmDefinition = false;

		if (lastGCMIntentServ != null)
			lastGCMRecv.setStartIntentService(lastGCMIntentServ);
	}
	
	@Override
	public void enterTopicDefinition(TopicDefinitionContext ctx) {
		TopicManager topics = null;
		if (inGcmDefinition) {
			topics = factory.createTopicManager();
			topics.setName(ctx.name.getText());
			app.addFeature(topics);
		}
	}

	@Override
	public void enterGroupDefinition(GroupDefinitionContext ctx) {
		GroupsOn = true;
	}

	public Model getModel() {
		return model;
	}
}