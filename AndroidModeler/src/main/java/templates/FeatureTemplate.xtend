package templates

import model.AndroidApplication
import model.Feature

interface FeatureTemplate {
	def String generate(AndroidApplication app, Feature f);
}