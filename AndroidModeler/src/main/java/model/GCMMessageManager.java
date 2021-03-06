/**
 */
package model;

import org.eclipse.emf.ecore.EClass;

import templates.GCMMessageManagerTemplate;
import templates.JavaComponentTemplate;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GCM Message Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class GCMMessageManager extends JavaComponent {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GCMMessageManager() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidAppPackage.eINSTANCE.getGCMMessageManager();
	}

	@Override
	public JavaComponentTemplate getTemplate() {
		return GCMMessageManagerTemplate.getInstance();
	}

} // GCMMessageManager
