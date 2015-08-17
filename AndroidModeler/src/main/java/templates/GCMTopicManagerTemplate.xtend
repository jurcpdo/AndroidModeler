package templates

import model.JavaApplication
import model.JavaComponent

class GCMTopicManagerTemplate implements JavaComponentTemplate {
	private static var GCMTopicManagerTemplate INSTANCE = null;
	
	def static public GCMTopicManagerTemplate getInstance() {
		if (INSTANCE == null)
			INSTANCE = new GCMTopicManagerTemplate
		return INSTANCE
	}
	
	override generate(JavaApplication app, JavaComponent jc) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}