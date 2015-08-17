/**
 */
package model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import templates.ComponentTemplate;
import templates.FeatureTemplate;
import templates.JavaComponentTemplate;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @generated
 */
public class AndroidAppFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final AndroidAppFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final AndroidAppFactory INSTANCE = model.AndroidAppFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static AndroidAppFactory init() {
		try {
			AndroidAppFactory theAndroidAppFactory = (AndroidAppFactory) EPackage.Registry.INSTANCE
					.getEFactory(AndroidAppPackage.eNS_URI);
			if (theAndroidAppFactory != null) {
				return theAndroidAppFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AndroidAppFactory();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public AndroidAppFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AndroidAppPackage.ANDROID_APPLICATION:
			return createAndroidApplication();
		case AndroidAppPackage.LIBRARY:
			return createLibrary();
		case AndroidAppPackage.PERMISSION:
			return createPermission();
		case AndroidAppPackage.SERVICE:
			return createService();
		case AndroidAppPackage.ACTIVITY:
			return createActivity();
		case AndroidAppPackage.BROADCAST_RECEIVER:
			return createBroadcastReceiver();
		case AndroidAppPackage.INTENT_FILTER:
			return createIntentFilter();
		case AndroidAppPackage.INTENT_CATEGORY:
			return createIntentCategory();
		case AndroidAppPackage.INTENT_ACTION:
			return createIntentAction();
		case AndroidAppPackage.INTENT_DATA:
			return createIntentData();
		case AndroidAppPackage.MODEL:
			return createModel();
		case AndroidAppPackage.METADATA:
			return createMetadata();
		case AndroidAppPackage.GCM_INTENT_SERVICE:
			return createGCMIntentService();
		case AndroidAppPackage.GCM_BROADCAST_RECEIVER:
			return createGCMBroadcastReceiver();
		case AndroidAppPackage.GCM_ACTIVITY:
			return createGCMActivity();
		case AndroidAppPackage.TOPIC_MANAGER:
			return createTopicManager();
		case AndroidAppPackage.JAVA_APPLICATION:
			return createJavaApplication();
		case AndroidAppPackage.GCM_TOPIC_MANAGER:
			return createGCMTopicManager();
		case AndroidAppPackage.GCM_GROUP_MANAGER:
			return createGCMGroupManager();
		case AndroidAppPackage.GCM_MESSAGE_MANAGER:
			return createGCMMessageManager();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AndroidAppPackage.COMPONENT_TEMPLATE:
			return createComponentTemplateFromString(eDataType, initialValue);
		case AndroidAppPackage.FEATURE_TEMPLATE:
			return createFeatureTemplateFromString(eDataType, initialValue);
		case AndroidAppPackage.JAVA_COMPONENT_TEMPLATE:
			return createJavaComponentTemplateFromString(eDataType,
					initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AndroidAppPackage.COMPONENT_TEMPLATE:
			return convertComponentTemplateToString(eDataType, instanceValue);
		case AndroidAppPackage.FEATURE_TEMPLATE:
			return convertFeatureTemplateToString(eDataType, instanceValue);
		case AndroidAppPackage.JAVA_COMPONENT_TEMPLATE:
			return convertJavaComponentTemplateToString(eDataType,
					instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AndroidApplication createAndroidApplication() {
		AndroidApplication androidApplication = new AndroidApplication();
		return androidApplication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Library createLibrary() {
		Library library = new Library();
		return library;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Permission createPermission() {
		Permission permission = new Permission();
		return permission;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Service createService() {
		Service service = new Service();
		return service;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Activity createActivity() {
		Activity activity = new Activity();
		return activity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BroadcastReceiver createBroadcastReceiver() {
		BroadcastReceiver broadcastReceiver = new BroadcastReceiver();
		return broadcastReceiver;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntentFilter createIntentFilter() {
		IntentFilter intentFilter = new IntentFilter();
		return intentFilter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntentCategory createIntentCategory() {
		IntentCategory intentCategory = new IntentCategory();
		return intentCategory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntentAction createIntentAction() {
		IntentAction intentAction = new IntentAction();
		return intentAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntentData createIntentData() {
		IntentData intentData = new IntentData();
		return intentData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Model createModel() {
		Model model = new Model();
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Metadata createMetadata() {
		Metadata metadata = new Metadata();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GCMIntentService createGCMIntentService() {
		GCMIntentService gcmIntentService = new GCMIntentService();
		return gcmIntentService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GCMBroadcastReceiver createGCMBroadcastReceiver() {
		GCMBroadcastReceiver gcmBroadcastReceiver = new GCMBroadcastReceiver();
		return gcmBroadcastReceiver;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GCMActivity createGCMActivity() {
		GCMActivity gcmActivity = new GCMActivity();
		return gcmActivity;
	}

	public GCMActivity createGCMActivity(boolean GroupsOn) {
		GCMActivity gcmActivity = new GCMActivity(true);
		return gcmActivity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TopicManager createTopicManager() {
		TopicManager topicManager = new TopicManager();
		return topicManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaApplication createJavaApplication() {
		JavaApplication javaApplication = new JavaApplication();
		return javaApplication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GCMTopicManager createGCMTopicManager() {
		GCMTopicManager gcmTopicManager = new GCMTopicManager();
		return gcmTopicManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GCMGroupManager createGCMGroupManager() {
		GCMGroupManager gcmGroupManager = new GCMGroupManager();
		return gcmGroupManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GCMMessageManager createGCMMessageManager() {
		GCMMessageManager gcmMessageManager = new GCMMessageManager();
		return gcmMessageManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentTemplate createComponentTemplateFromString(
			EDataType eDataType, String initialValue) {
		return (ComponentTemplate) super.createFromString(eDataType,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertComponentTemplateToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureTemplate createFeatureTemplateFromString(EDataType eDataType,
			String initialValue) {
		return (FeatureTemplate) super
				.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFeatureTemplateToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaComponentTemplate createJavaComponentTemplateFromString(
			EDataType eDataType, String initialValue) {
		return (JavaComponentTemplate) super.createFromString(eDataType,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertJavaComponentTemplateToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AndroidAppPackage getAndroidAppPackage() {
		return (AndroidAppPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AndroidAppPackage getPackage() {
		return AndroidAppPackage.eINSTANCE;
	}

} // AndroidAppFactory
