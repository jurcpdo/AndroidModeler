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
 * <em><b>Android Application</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link model.AndroidApplication#getDependencies <em>Dependencies</em>}</li>
 * <li>{@link model.AndroidApplication#getComponents <em>Components</em>}</li>
 * <li>{@link model.AndroidApplication#getUses <em>Uses</em>}</li>
 * <li>{@link model.AndroidApplication#getDefines <em>Defines</em>}</li>
 * <li>{@link model.AndroidApplication#getName <em>Name</em>}</li>
 * <li>{@link model.AndroidApplication#getMinSDK <em>Min SDK</em>}</li>
 * <li>{@link model.AndroidApplication#getTargetSDK <em>Target SDK</em>}</li>
 * <li>{@link model.AndroidApplication#getMetadatas <em>Metadatas</em>}</li>
 * <li>{@link model.AndroidApplication#getJavaName <em>Java Name</em>}</li>
 * <li>{@link model.AndroidApplication#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroidApplication extends MinimalEObjectImpl.Container implements
		EObject {
	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}
	 * ' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> dependencies;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> uses;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> defines;

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
	 * The cached value of the '{@link #getMetadatas() <em>Metadatas</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMetadatas()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadatas;

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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AndroidApplication() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidAppPackage.eINSTANCE.getAndroidApplication();
	}

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link model.Library}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @generated
	 */
	public EList<Library> getDependencies() {
		if (dependencies == null) {
			dependencies = new BasicInternalEList<Library>(Library.class);
		}
		return dependencies;
	}

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list. The
	 * list contents are of type {@link model.Component}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Components</em>' reference list.
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new BasicInternalEList<Component>(Component.class);
		}
		return components;
	}

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list. The list
	 * contents are of type {@link model.Permission}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @generated
	 */
	public EList<Permission> getUses() {
		if (uses == null) {
			uses = new BasicInternalEList<Permission>(Permission.class);
		}
		return uses;
	}

	/**
	 * Returns the value of the '<em><b>Defines</b></em>' reference list. The
	 * list contents are of type {@link model.Permission}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Defines</em>' reference list.
	 * @generated
	 */
	public EList<Permission> getDefines() {
		if (defines == null) {
			defines = new BasicInternalEList<Permission>(Permission.class);
		}
		return defines;
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
	 * Sets the value of the '{@link model.AndroidApplication#getName
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
	 * Sets the value of the '{@link model.AndroidApplication#getMinSDK
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
	 * Sets the value of the '{@link model.AndroidApplication#getTargetSDK
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
	 * Returns the value of the '<em><b>Metadatas</b></em>' reference list. The
	 * list contents are of type {@link model.Metadata}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadatas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Metadatas</em>' reference list.
	 * @generated
	 */
	public EList<Metadata> getMetadatas() {
		if (metadatas == null) {
			metadatas = new BasicInternalEList<Metadata>(Metadata.class);
		}
		return metadatas;
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
	 * Sets the value of the '{@link model.AndroidApplication#getJavaName
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
	 * Returns the value of the '<em><b>Feature</b></em>' reference list. The
	 * list contents are of type {@link model.Feature}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new BasicInternalEList<Feature>(Feature.class);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addComponent(Component component) {
		getComponents().add(component);
		component.componentAddedTo(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void definesPermission(Permission permission) {
		getDefines().add(permission);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void usesPermission(Permission permission) {
		getUses().add(permission);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void dependsOn(Library library) {
		getDependencies().add(library);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addFeature(Feature feature) {
		getFeature().add(feature);
		feature.componentAddedTo(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AndroidAppPackage.ANDROID_APPLICATION__DEPENDENCIES:
			return getDependencies();
		case AndroidAppPackage.ANDROID_APPLICATION__COMPONENTS:
			return getComponents();
		case AndroidAppPackage.ANDROID_APPLICATION__USES:
			return getUses();
		case AndroidAppPackage.ANDROID_APPLICATION__DEFINES:
			return getDefines();
		case AndroidAppPackage.ANDROID_APPLICATION__NAME:
			return getName();
		case AndroidAppPackage.ANDROID_APPLICATION__MIN_SDK:
			return getMinSDK();
		case AndroidAppPackage.ANDROID_APPLICATION__TARGET_SDK:
			return getTargetSDK();
		case AndroidAppPackage.ANDROID_APPLICATION__METADATAS:
			return getMetadatas();
		case AndroidAppPackage.ANDROID_APPLICATION__JAVA_NAME:
			return getJavaName();
		case AndroidAppPackage.ANDROID_APPLICATION__FEATURE:
			return getFeature();
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
		case AndroidAppPackage.ANDROID_APPLICATION__DEPENDENCIES:
			getDependencies().clear();
			getDependencies().addAll((Collection<? extends Library>) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Permission>) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__DEFINES:
			getDefines().clear();
			getDefines().addAll((Collection<? extends Permission>) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__NAME:
			setName((String) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__MIN_SDK:
			setMinSDK((Integer) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__TARGET_SDK:
			setTargetSDK((Integer) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__METADATAS:
			getMetadatas().clear();
			getMetadatas().addAll((Collection<? extends Metadata>) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__JAVA_NAME:
			setJavaName((String) newValue);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__FEATURE:
			getFeature().clear();
			getFeature().addAll((Collection<? extends Feature>) newValue);
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
		case AndroidAppPackage.ANDROID_APPLICATION__DEPENDENCIES:
			getDependencies().clear();
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__COMPONENTS:
			getComponents().clear();
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__USES:
			getUses().clear();
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__DEFINES:
			getDefines().clear();
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__MIN_SDK:
			setMinSDK(MIN_SDK_EDEFAULT);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__TARGET_SDK:
			setTargetSDK(TARGET_SDK_EDEFAULT);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__METADATAS:
			getMetadatas().clear();
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__JAVA_NAME:
			setJavaName(JAVA_NAME_EDEFAULT);
			return;
		case AndroidAppPackage.ANDROID_APPLICATION__FEATURE:
			getFeature().clear();
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
		case AndroidAppPackage.ANDROID_APPLICATION__DEPENDENCIES:
			return dependencies != null && !dependencies.isEmpty();
		case AndroidAppPackage.ANDROID_APPLICATION__COMPONENTS:
			return components != null && !components.isEmpty();
		case AndroidAppPackage.ANDROID_APPLICATION__USES:
			return uses != null && !uses.isEmpty();
		case AndroidAppPackage.ANDROID_APPLICATION__DEFINES:
			return defines != null && !defines.isEmpty();
		case AndroidAppPackage.ANDROID_APPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case AndroidAppPackage.ANDROID_APPLICATION__MIN_SDK:
			return minSDK != MIN_SDK_EDEFAULT;
		case AndroidAppPackage.ANDROID_APPLICATION__TARGET_SDK:
			return targetSDK != TARGET_SDK_EDEFAULT;
		case AndroidAppPackage.ANDROID_APPLICATION__METADATAS:
			return metadatas != null && !metadatas.isEmpty();
		case AndroidAppPackage.ANDROID_APPLICATION__JAVA_NAME:
			return JAVA_NAME_EDEFAULT == null ? javaName != null
					: !JAVA_NAME_EDEFAULT.equals(javaName);
		case AndroidAppPackage.ANDROID_APPLICATION__FEATURE:
			return feature != null && !feature.isEmpty();
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
		case AndroidAppPackage.ANDROID_APPLICATION___ADD_COMPONENT__COMPONENT:
			addComponent((Component) arguments.get(0));
			return null;
		case AndroidAppPackage.ANDROID_APPLICATION___DEFINES_PERMISSION__PERMISSION:
			definesPermission((Permission) arguments.get(0));
			return null;
		case AndroidAppPackage.ANDROID_APPLICATION___USES_PERMISSION__PERMISSION:
			usesPermission((Permission) arguments.get(0));
			return null;
		case AndroidAppPackage.ANDROID_APPLICATION___DEPENDS_ON__LIBRARY:
			dependsOn((Library) arguments.get(0));
			return null;
		case AndroidAppPackage.ANDROID_APPLICATION___ADD_FEATURE__FEATURE:
			addFeature((Feature) arguments.get(0));
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
		result.append(", minSDK: ");
		result.append(minSDK);
		result.append(", targetSDK: ");
		result.append(targetSDK);
		result.append(", javaName: ");
		result.append(javaName);
		result.append(')');
		return result.toString();
	}

} // AndroidApplication
