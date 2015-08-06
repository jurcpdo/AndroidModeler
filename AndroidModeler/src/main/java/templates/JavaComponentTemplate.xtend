package templates

import model.AndroidApplication
import model.JavaComponent

interface JavaComponentTemplate {
	def String generate(AndroidApplication app, JavaComponent jc);
}