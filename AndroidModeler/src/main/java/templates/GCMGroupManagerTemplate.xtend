package templates

import model.JavaApplication
import model.JavaComponent

class GCMGroupManagerTemplate implements JavaComponentTemplate{
	private static var GCMGroupManagerTemplate INSTANCE = null;
	
	def static public GCMGroupManagerTemplate getInstance() {
		if (INSTANCE == null)
			INSTANCE = new GCMGroupManagerTemplate
		return INSTANCE
	}	
	
	override generate(JavaApplication app, JavaComponent jc) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	
}