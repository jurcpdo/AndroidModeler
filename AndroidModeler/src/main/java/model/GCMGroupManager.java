/**
 */
package model;

import org.eclipse.emf.ecore.EClass;

import templates.JavaComponentTemplate;
import templates.GCMGroupManagerTemplate;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GCM Group Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class GCMGroupManager extends JavaComponent {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GCMGroupManager() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidAppPackage.eINSTANCE.getGCMGroupManager();
	}

	@Override
	public JavaComponentTemplate getTemplate() {
		return GCMGroupManagerTemplate.getInstance();
	}

} // GCMGroupManager
