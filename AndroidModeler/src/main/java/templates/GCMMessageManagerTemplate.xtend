package templates

import model.JavaApplication
import model.JavaComponent

class GCMMessageManagerTemplate implements JavaComponentTemplate {
	private static var GCMMessageManagerTemplate INSTANCE = null;
	
	def static public GCMMessageManagerTemplate getInstance() {
		if (INSTANCE == null)
			INSTANCE = new GCMMessageManagerTemplate
		return INSTANCE
	}
	
	override generate(JavaApplication app, JavaComponent jc) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}