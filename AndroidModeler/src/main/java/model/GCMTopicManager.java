/**
 */
package model;

import org.eclipse.emf.ecore.EClass;

import templates.GCMTopicManagerTemplate;
import templates.JavaComponentTemplate;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GCM Topic Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class GCMTopicManager extends JavaComponent {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GCMTopicManager() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidAppPackage.eINSTANCE.getGCMTopicManager();
	}

	@Override
	public JavaComponentTemplate getTemplate() {
		return GCMTopicManagerTemplate.getInstance();
	}

} // GCMTopicManager
