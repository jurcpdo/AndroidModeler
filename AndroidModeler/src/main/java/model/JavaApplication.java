/**
 */
package model;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Java Application</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link model.JavaApplication#getName <em>Name</em>}</li>
 * <li>{@link model.JavaApplication#getJavaName <em>Java Name</em>}</li>
 * <li>{@link model.JavaApplication#getComponents <em>Components</em>}</li>
 * <li>{@link model.JavaApplication#getMinSDK <em>Min SDK</em>}</li>
 * <li>{@link model.JavaApplication#getTargetSDK <em>Target SDK</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaApplication extends MinimalEObjectImpl.Container implements
		EObject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaName() <em>Java Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getJavaName()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaName() <em>Java Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getJavaName()
	 * @generated
	 * @ordered
	 */
	protected String javaName = JAVA_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaComponent> components;

	/**
	 * The default value of the '{@link #getMinSDK() <em>Min SDK</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinSDK()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SDK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSDK() <em>Min SDK</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinSDK()
	 * @generated
	 * @ordered
	 */
	protected int minSDK = MIN_SDK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSDK() <em>Target SDK</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetSDK()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_SDK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetSDK() <em>Target SDK</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetSDK()
	 * @generated
	 * @ordered
	 */
	protected int targetSDK = TARGET_SDK_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected JavaApplication() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidAppPackage.eINSTANCE.getJavaApplication();
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link model.JavaApplication#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Java Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Java Name</em>' attribute.
	 * @see #setJavaName(String)
	 * @generated
	 */
	public String getJavaName() {
		return javaName;
	}

	/**
	 * Sets the value of the '{@link model.JavaApplication#getJavaName
	 * <em>Java Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Java Name</em>' attribute.
	 * @see #getJavaName()
	 * @generated
	 */
	public void setJavaName(String newJavaName) {
		javaName = newJavaName;
	}

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list. The
	 * list contents are of type {@link model.JavaComponent}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Components</em>' reference list.
	 * @generated
	 */
	public EList<JavaComponent> getComponents() {
		if (components == null) {
			components = new BasicInternalEList<JavaComponent>(
					JavaComponent.class);
		}
		return components;
	}

	/**
	 * Returns the value of the '<em><b>Min SDK</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min SDK</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Min SDK</em>' attribute.
	 * @see #setMinSDK(int)
	 * @generated
	 */
	public int getMinSDK() {
		return minSDK;
	}

	/**
	 * Sets the value of the '{@link model.JavaApplication#getMinSDK
	 * <em>Min SDK</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Min SDK</em>' attribute.
	 * @see #getMinSDK()
	 * @generated
	 */
	public void setMinSDK(int newMinSDK) {
		minSDK = newMinSDK;
	}

	/**
	 * Returns the value of the '<em><b>Target SDK</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target SDK</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target SDK</em>' attribute.
	 * @see #setTargetSDK(int)
	 * @generated
	 */
	public int getTargetSDK() {
		return targetSDK;
	}

	/**
	 * Sets the value of the '{@link model.JavaApplication#getTargetSDK
	 * <em>Target SDK</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target SDK</em>' attribute.
	 * @see #getTargetSDK()
	 * @generated
	 */
	public void setTargetSDK(int newTargetSDK) {
		targetSDK = newTargetSDK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addJavaComponent(JavaComponent jcomponent) {
		getComponents().add(jcomponent);
		jcomponent.componentAddedTo(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dependsOn(Library library) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AndroidAppPackage.JAVA_APPLICATION__NAME:
			return getName();
		case AndroidAppPackage.JAVA_APPLICATION__JAVA_NAME:
			return getJavaName();
		case AndroidAppPackage.JAVA_APPLICATION__COMPONENTS:
			return getComponents();
		case AndroidAppPackage.JAVA_APPLICATION__MIN_SDK:
			return getMinSDK();
		case AndroidAppPackage.JAVA_APPLICATION__TARGET_SDK:
			return getTargetSDK();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AndroidAppPackage.JAVA_APPLICATION__NAME:
			setName((String) newValue);
			return;
		case AndroidAppPackage.JAVA_APPLICATION__JAVA_NAME:
			setJavaName((String) newValue);
			return;
		case AndroidAppPackage.JAVA_APPLICATION__COMPONENTS:
			getComponents().clear();
			getComponents().addAll(
					(Collection<? extends JavaComponent>) newValue);
			return;
		case AndroidAppPackage.JAVA_APPLICATION__MIN_SDK:
			setMinSDK((Integer) newValue);
			return;
		case AndroidAppPackage.JAVA_APPLICATION__TARGET_SDK:
			setTargetSDK((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AndroidAppPackage.JAVA_APPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AndroidAppPackage.JAVA_APPLICATION__JAVA_NAME:
			setJavaName(JAVA_NAME_EDEFAULT);
			return;
		case AndroidAppPackage.JAVA_APPLICATION__COMPONENTS:
			getComponents().clear();
			return;
		case AndroidAppPackage.JAVA_APPLICATION__MIN_SDK:
			setMinSDK(MIN_SDK_EDEFAULT);
			return;
		case AndroidAppPackage.JAVA_APPLICATION__TARGET_SDK:
			setTargetSDK(TARGET_SDK_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AndroidAppPackage.JAVA_APPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case AndroidAppPackage.JAVA_APPLICATION__JAVA_NAME:
			return JAVA_NAME_EDEFAULT == null ? javaName != null
					: !JAVA_NAME_EDEFAULT.equals(javaName);
		case AndroidAppPackage.JAVA_APPLICATION__COMPONENTS:
			return components != null && !components.isEmpty();
		case AndroidAppPackage.JAVA_APPLICATION__MIN_SDK:
			return minSDK != MIN_SDK_EDEFAULT;
		case AndroidAppPackage.JAVA_APPLICATION__TARGET_SDK:
			return targetSDK != TARGET_SDK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case AndroidAppPackage.JAVA_APPLICATION___ADD_JAVA_COMPONENT__JAVACOMPONENT:
			addJavaComponent((JavaComponent) arguments.get(0));
			return null;
		case AndroidAppPackage.JAVA_APPLICATION___DEPENDS_ON__LIBRARY:
			dependsOn((Library) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", javaName: ");
		result.append(javaName);
		result.append(", minSDK: ");
		result.append(minSDK);
		result.append(", targetSDK: ");
		result.append(targetSDK);
		result.append(')');
		return result.toString();
	}

} // JavaApplication
