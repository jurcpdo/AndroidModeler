/**
 */
package model;

import org.eclipse.emf.ecore.EClass;

import templates.ComponentTemplate;
import templates.GCMActivityTemplate;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GCM Activity</b></em>'. <!-- end-user-doc -->
 *
 *
 * @generated
 */
public class GCMActivity extends Activity {
	
	private boolean GroupFlag = false;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GCMActivity() {
		super();
	}
	
	protected GCMActivity(boolean GroupsOn) {
		super();
		setGroupFlag(true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidAppPackage.eINSTANCE.getGCMActivity();
	}

	@Override
	public ComponentTemplate getTemplate() {
		return GCMActivityTemplate.getInstance();
	}

	public boolean isGroupFlag() {
		return GroupFlag;
	}

	public void setGroupFlag(boolean groupFlag) {
		GroupFlag = groupFlag;
	}

} // GCMActivity
