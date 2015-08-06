/**
 */
package model;

import org.eclipse.emf.ecore.EClass;

import templates.FeatureTemplate;
import templates.TopicManagerTemplate;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Topic Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class TopicManager extends Feature {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TopicManager() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidAppPackage.eINSTANCE.getTopicManager();
	}

	@Override
	public FeatureTemplate getTemplate() {
		return TopicManagerTemplate.getInstance();
	}

} // TopicManager
