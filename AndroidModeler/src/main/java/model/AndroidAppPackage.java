/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import templates.ComponentTemplate;
import templates.FeatureTemplate;
import templates.JavaComponentTemplate;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see model.AndroidAppFactory
 * @generated
 */
public class AndroidAppPackage extends EPackageImpl {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String eNAME = "model";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String eNS_URI = "android";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String eNS_PREFIX = "android";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final AndroidAppPackage eINSTANCE = model.AndroidAppPackage
			.init();

	/**
	 * The meta object id for the '{@link model.AndroidApplication
	 * <em>Android Application</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.AndroidApplication
	 * @see model.AndroidAppPackage#getAndroidApplication()
	 * @generated
	 */
	public static final int ANDROID_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__USES = 2;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__DEFINES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Min SDK</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__MIN_SDK = 5;

	/**
	 * The feature id for the '<em><b>Target SDK</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__TARGET_SDK = 6;

	/**
	 * The feature id for the '<em><b>Metadatas</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__METADATAS = 7;

	/**
	 * The feature id for the '<em><b>Java Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__JAVA_NAME = 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION__FEATURE = 9;

	/**
	 * The number of structural features of the '<em>Android Application</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Add Component</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION___ADD_COMPONENT__COMPONENT = 0;

	/**
	 * The operation id for the '<em>Defines Permission</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION___DEFINES_PERMISSION__PERMISSION = 1;

	/**
	 * The operation id for the '<em>Uses Permission</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION___USES_PERMISSION__PERMISSION = 2;

	/**
	 * The operation id for the '<em>Depends On</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION___DEPENDS_ON__LIBRARY = 3;

	/**
	 * The operation id for the '<em>Add Feature</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION___ADD_FEATURE__FEATURE = 4;

	/**
	 * The number of operations of the '<em>Android Application</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ANDROID_APPLICATION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link model.Library <em>Library</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.Library
	 * @see model.AndroidAppPackage#getLibrary()
	 * @generated
	 */
	public static final int LIBRARY = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Library</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Component <em>Component</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.Component
	 * @see model.AndroidAppPackage#getComponent()
	 * @generated
	 */
	public static final int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Intent Filters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT__INTENT_FILTERS = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = 0;

	/**
	 * The operation id for the '<em>Get XML Tag</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___GET_XML_TAG = 1;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT___GET_TEMPLATE = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.Permission <em>Permission</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.Permission
	 * @see model.AndroidAppPackage#getPermission()
	 * @generated
	 */
	public static final int PERMISSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Protection Level</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION__PROTECTION_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Permission</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Service <em>Service</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.Service
	 * @see model.AndroidAppPackage#getService()
	 * @generated
	 */
	public static final int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Intent Filters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE__INTENT_FILTERS = COMPONENT__INTENT_FILTERS;

	/**
	 * The number of structural features of the '<em>Service</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = COMPONENT___COMPONENT_ADDED_TO__ANDROIDAPPLICATION;

	/**
	 * The operation id for the '<em>Get XML Tag</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE___GET_XML_TAG = COMPONENT___GET_XML_TAG;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE___GET_TEMPLATE = COMPONENT___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>Service</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.Activity <em>Activity</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.Activity
	 * @see model.AndroidAppPackage#getActivity()
	 * @generated
	 */
	public static final int ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Intent Filters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY__INTENT_FILTERS = COMPONENT__INTENT_FILTERS;

	/**
	 * The number of structural features of the '<em>Activity</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = COMPONENT___COMPONENT_ADDED_TO__ANDROIDAPPLICATION;

	/**
	 * The operation id for the '<em>Get XML Tag</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY___GET_XML_TAG = COMPONENT___GET_XML_TAG;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY___GET_TEMPLATE = COMPONENT___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>Activity</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.BroadcastReceiver
	 * <em>Broadcast Receiver</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.BroadcastReceiver
	 * @see model.AndroidAppPackage#getBroadcastReceiver()
	 * @generated
	 */
	public static final int BROADCAST_RECEIVER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_RECEIVER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Intent Filters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_RECEIVER__INTENT_FILTERS = COMPONENT__INTENT_FILTERS;

	/**
	 * The number of structural features of the '<em>Broadcast Receiver</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_RECEIVER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_RECEIVER___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = COMPONENT___COMPONENT_ADDED_TO__ANDROIDAPPLICATION;

	/**
	 * The operation id for the '<em>Get XML Tag</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_RECEIVER___GET_XML_TAG = COMPONENT___GET_XML_TAG;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_RECEIVER___GET_TEMPLATE = COMPONENT___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>Broadcast Receiver</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_RECEIVER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.IntentFilter
	 * <em>Intent Filter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see model.IntentFilter
	 * @see model.AndroidAppPackage#getIntentFilter()
	 * @generated
	 */
	public static final int INTENT_FILTER = 7;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_FILTER__CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_FILTER__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_FILTER__DATAS = 2;

	/**
	 * The number of structural features of the '<em>Intent Filter</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_FILTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Intent Filter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.IntentCategory
	 * <em>Intent Category</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.IntentCategory
	 * @see model.AndroidAppPackage#getIntentCategory()
	 * @generated
	 */
	public static final int INTENT_CATEGORY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_CATEGORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Intent Category</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Intent Category</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.IntentAction
	 * <em>Intent Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see model.IntentAction
	 * @see model.AndroidAppPackage#getIntentAction()
	 * @generated
	 */
	public static final int INTENT_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_ACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Intent Action</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Intent Action</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.IntentData <em>Intent Data</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.IntentData
	 * @see model.AndroidAppPackage#getIntentData()
	 * @generated
	 */
	public static final int INTENT_DATA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_DATA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Intent Data</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Intent Data</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int INTENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Model <em>Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.Model
	 * @see model.AndroidAppPackage#getModel()
	 * @generated
	 */
	public static final int MODEL = 11;

	/**
	 * The feature id for the '<em><b>Android Apps</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__ANDROID_APPS = 0;

	/**
	 * The feature id for the '<em><b>Java Apps</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__JAVA_APPS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Metadata <em>Metadata</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.Metadata
	 * @see model.AndroidAppPackage#getMetadata()
	 * @generated
	 */
	public static final int METADATA = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int METADATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int METADATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadata</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.GCMIntentService
	 * <em>GCM Intent Service</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.GCMIntentService
	 * @see model.AndroidAppPackage#getGCMIntentService()
	 * @generated
	 */
	public static final int GCM_INTENT_SERVICE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_INTENT_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Intent Filters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_INTENT_SERVICE__INTENT_FILTERS = SERVICE__INTENT_FILTERS;

	/**
	 * The number of structural features of the '<em>GCM Intent Service</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_INTENT_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_INTENT_SERVICE___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = SERVICE___COMPONENT_ADDED_TO__ANDROIDAPPLICATION;

	/**
	 * The operation id for the '<em>Get XML Tag</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_INTENT_SERVICE___GET_XML_TAG = SERVICE___GET_XML_TAG;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_INTENT_SERVICE___GET_TEMPLATE = SERVICE___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>GCM Intent Service</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_INTENT_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.GCMBroadcastReceiver
	 * <em>GCM Broadcast Receiver</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.GCMBroadcastReceiver
	 * @see model.AndroidAppPackage#getGCMBroadcastReceiver()
	 * @generated
	 */
	public static final int GCM_BROADCAST_RECEIVER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_BROADCAST_RECEIVER__NAME = BROADCAST_RECEIVER__NAME;

	/**
	 * The feature id for the '<em><b>Intent Filters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_BROADCAST_RECEIVER__INTENT_FILTERS = BROADCAST_RECEIVER__INTENT_FILTERS;

	/**
	 * The feature id for the '<em><b>Start Intent Service</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_BROADCAST_RECEIVER__START_INTENT_SERVICE = BROADCAST_RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GCM Broadcast Receiver</em>
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_BROADCAST_RECEIVER_FEATURE_COUNT = BROADCAST_RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_BROADCAST_RECEIVER___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = BROADCAST_RECEIVER___COMPONENT_ADDED_TO__ANDROIDAPPLICATION;

	/**
	 * The operation id for the '<em>Get XML Tag</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_BROADCAST_RECEIVER___GET_XML_TAG = BROADCAST_RECEIVER___GET_XML_TAG;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_BROADCAST_RECEIVER___GET_TEMPLATE = BROADCAST_RECEIVER___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>GCM Broadcast Receiver</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_BROADCAST_RECEIVER_OPERATION_COUNT = BROADCAST_RECEIVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.GCMActivity
	 * <em>GCM Activity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see model.GCMActivity
	 * @see model.AndroidAppPackage#getGCMActivity()
	 * @generated
	 */
	public static final int GCM_ACTIVITY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Intent Filters</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_ACTIVITY__INTENT_FILTERS = ACTIVITY__INTENT_FILTERS;

	/**
	 * The number of structural features of the '<em>GCM Activity</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_ACTIVITY___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = ACTIVITY___COMPONENT_ADDED_TO__ANDROIDAPPLICATION;

	/**
	 * The operation id for the '<em>Get XML Tag</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_ACTIVITY___GET_XML_TAG = ACTIVITY___GET_XML_TAG;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_ACTIVITY___GET_TEMPLATE = ACTIVITY___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>GCM Activity</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.Feature <em>Feature</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see model.Feature
	 * @see model.AndroidAppPackage#getFeature()
	 * @generated
	 */
	public static final int FEATURE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = 0;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE___GET_TEMPLATE = 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.TopicManager
	 * <em>Topic Manager</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see model.TopicManager
	 * @see model.AndroidAppPackage#getTopicManager()
	 * @generated
	 */
	public static final int TOPIC_MANAGER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TOPIC_MANAGER__NAME = FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Topic Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TOPIC_MANAGER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TOPIC_MANAGER___COMPONENT_ADDED_TO__ANDROIDAPPLICATION = FEATURE___COMPONENT_ADDED_TO__ANDROIDAPPLICATION;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TOPIC_MANAGER___GET_TEMPLATE = FEATURE___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>Topic Manager</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int TOPIC_MANAGER_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.JavaApplication
	 * <em>Java Application</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.JavaApplication
	 * @see model.AndroidAppPackage#getJavaApplication()
	 * @generated
	 */
	public static final int JAVA_APPLICATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Java Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION__JAVA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Min SDK</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION__MIN_SDK = 3;

	/**
	 * The feature id for the '<em><b>Target SDK</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION__TARGET_SDK = 4;

	/**
	 * The number of structural features of the '<em>Java Application</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Add Component</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION___ADD_COMPONENT__COMPONENT = 0;

	/**
	 * The operation id for the '<em>Depends On</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION___DEPENDS_ON__LIBRARY = 1;

	/**
	 * The number of operations of the '<em>Java Application</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_APPLICATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.JavaComponent
	 * <em>Java Component</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.JavaComponent
	 * @see model.AndroidAppPackage#getJavaComponent()
	 * @generated
	 */
	public static final int JAVA_COMPONENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Java Component</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPONENT___COMPONENT_ADDED_TO__JAVAAPPLICATION = 0;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPONENT___GET_TEMPLATE = 1;

	/**
	 * The number of operations of the '<em>Java Component</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPONENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.GCMTopicManager
	 * <em>GCM Topic Manager</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.GCMTopicManager
	 * @see model.AndroidAppPackage#getGCMTopicManager()
	 * @generated
	 */
	public static final int GCM_TOPIC_MANAGER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_TOPIC_MANAGER__NAME = JAVA_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>GCM Topic Manager</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_TOPIC_MANAGER_FEATURE_COUNT = JAVA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_TOPIC_MANAGER___COMPONENT_ADDED_TO__JAVAAPPLICATION = JAVA_COMPONENT___COMPONENT_ADDED_TO__JAVAAPPLICATION;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_TOPIC_MANAGER___GET_TEMPLATE = JAVA_COMPONENT___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>GCM Topic Manager</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_TOPIC_MANAGER_OPERATION_COUNT = JAVA_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.GCMGroupManager
	 * <em>GCM Group Manager</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.GCMGroupManager
	 * @see model.AndroidAppPackage#getGCMGroupManager()
	 * @generated
	 */
	public static final int GCM_GROUP_MANAGER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_GROUP_MANAGER__NAME = JAVA_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>GCM Group Manager</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_GROUP_MANAGER_FEATURE_COUNT = JAVA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_GROUP_MANAGER___COMPONENT_ADDED_TO__JAVAAPPLICATION = JAVA_COMPONENT___COMPONENT_ADDED_TO__JAVAAPPLICATION;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_GROUP_MANAGER___GET_TEMPLATE = JAVA_COMPONENT___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>GCM Group Manager</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_GROUP_MANAGER_OPERATION_COUNT = JAVA_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.GCMMessageManager
	 * <em>GCM Message Manager</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see model.GCMMessageManager
	 * @see model.AndroidAppPackage#getGCMMessageManager()
	 * @generated
	 */
	public static final int GCM_MESSAGE_MANAGER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_MESSAGE_MANAGER__NAME = JAVA_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>GCM Message Manager</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_MESSAGE_MANAGER_FEATURE_COUNT = JAVA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Component Added To</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_MESSAGE_MANAGER___COMPONENT_ADDED_TO__JAVAAPPLICATION = JAVA_COMPONENT___COMPONENT_ADDED_TO__JAVAAPPLICATION;

	/**
	 * The operation id for the '<em>Get Template</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_MESSAGE_MANAGER___GET_TEMPLATE = JAVA_COMPONENT___GET_TEMPLATE;

	/**
	 * The number of operations of the '<em>GCM Message Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	public static final int GCM_MESSAGE_MANAGER_OPERATION_COUNT = JAVA_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Component Template</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see generator.ComponentTemplate
	 * @see model.AndroidAppPackage#getComponentTemplate()
	 * @generated
	 */
	public static final int COMPONENT_TEMPLATE = 23;

	/**
	 * The meta object id for the '<em>Feature Template</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see templates.FeatureTemplate
	 * @see model.AndroidAppPackage#getFeatureTemplate()
	 * @generated
	 */
	public static final int FEATURE_TEMPLATE = 24;

	/**
	 * The meta object id for the '<em>Java Component Template</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see templates.JavaComponentTemplate
	 * @see model.AndroidAppPackage#getJavaComponentTemplate()
	 * @generated
	 */
	public static final int JAVA_COMPONENT_TEMPLATE = 25;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass androidApplicationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass topicManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaApplicationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaComponentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gcmTopicManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gcmGroupManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gcmMessageManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass broadcastReceiverEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass intentFilterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass intentCategoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass intentActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass intentDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gcmIntentServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gcmBroadcastReceiverEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass gcmActivityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType componentTemplateEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType featureTemplateEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType javaComponentTemplateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.AndroidAppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AndroidAppPackage() {
		super(eNS_URI, AndroidAppFactory.INSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link AndroidAppPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AndroidAppPackage init() {
		if (isInited)
			return (AndroidAppPackage) EPackage.Registry.INSTANCE
					.getEPackage(AndroidAppPackage.eNS_URI);

		// Obtain or create and register package
		AndroidAppPackage theAndroidAppPackage = (AndroidAppPackage) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof AndroidAppPackage ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new AndroidAppPackage());

		isInited = true;

		// Create package meta-data objects
		theAndroidAppPackage.createPackageContents();

		// Initialize created meta-data
		theAndroidAppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAndroidAppPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AndroidAppPackage.eNS_URI,
				theAndroidAppPackage);
		return theAndroidAppPackage;
	}

	/**
	 * Returns the meta object for class '{@link model.AndroidApplication
	 * <em>Android Application</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Android Application</em>'.
	 * @see model.AndroidApplication
	 * @generated
	 */
	public EClass getAndroidApplication() {
		return androidApplicationEClass;
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.AndroidApplication#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see model.AndroidApplication#getDependencies()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EReference getAndroidApplication_Dependencies() {
		return (EReference) androidApplicationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.AndroidApplication#getComponents <em>Components</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see model.AndroidApplication#getComponents()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EReference getAndroidApplication_Components() {
		return (EReference) androidApplicationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.AndroidApplication#getUses <em>Uses</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see model.AndroidApplication#getUses()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EReference getAndroidApplication_Uses() {
		return (EReference) androidApplicationEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.AndroidApplication#getDefines <em>Defines</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Defines</em>'.
	 * @see model.AndroidApplication#getDefines()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EReference getAndroidApplication_Defines() {
		return (EReference) androidApplicationEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.AndroidApplication#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.AndroidApplication#getName()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EAttribute getAndroidApplication_Name() {
		return (EAttribute) androidApplicationEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.AndroidApplication#getMinSDK <em>Min SDK</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Min SDK</em>'.
	 * @see model.AndroidApplication#getMinSDK()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EAttribute getAndroidApplication_MinSDK() {
		return (EAttribute) androidApplicationEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.AndroidApplication#getTargetSDK <em>Target SDK</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Target SDK</em>'.
	 * @see model.AndroidApplication#getTargetSDK()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EAttribute getAndroidApplication_TargetSDK() {
		return (EAttribute) androidApplicationEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.AndroidApplication#getMetadatas <em>Metadatas</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Metadatas</em>'.
	 * @see model.AndroidApplication#getMetadatas()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EReference getAndroidApplication_Metadatas() {
		return (EReference) androidApplicationEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.AndroidApplication#getJavaName <em>Java Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Java Name</em>'.
	 * @see model.AndroidApplication#getJavaName()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EAttribute getAndroidApplication_JavaName() {
		return (EAttribute) androidApplicationEClass.getEStructuralFeatures()
				.get(8);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.AndroidApplication#getFeature <em>Feature</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see model.AndroidApplication#getFeature()
	 * @see #getAndroidApplication()
	 * @generated
	 */
	public EReference getAndroidApplication_Feature() {
		return (EReference) androidApplicationEClass.getEStructuralFeatures()
				.get(9);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.AndroidApplication#addComponent(model.Component)
	 * <em>Add Component</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Add Component</em>' operation.
	 * @see model.AndroidApplication#addComponent(model.Component)
	 * @generated
	 */
	public EOperation getAndroidApplication__AddComponent__Component() {
		return androidApplicationEClass.getEOperations().get(0);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.AndroidApplication#definesPermission(model.Permission)
	 * <em>Defines Permission</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Defines Permission</em>' operation.
	 * @see model.AndroidApplication#definesPermission(model.Permission)
	 * @generated
	 */
	public EOperation getAndroidApplication__DefinesPermission__Permission() {
		return androidApplicationEClass.getEOperations().get(1);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.AndroidApplication#usesPermission(model.Permission)
	 * <em>Uses Permission</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Uses Permission</em>' operation.
	 * @see model.AndroidApplication#usesPermission(model.Permission)
	 * @generated
	 */
	public EOperation getAndroidApplication__UsesPermission__Permission() {
		return androidApplicationEClass.getEOperations().get(2);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.AndroidApplication#dependsOn(model.Library)
	 * <em>Depends On</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Depends On</em>' operation.
	 * @see model.AndroidApplication#dependsOn(model.Library)
	 * @generated
	 */
	public EOperation getAndroidApplication__DependsOn__Library() {
		return androidApplicationEClass.getEOperations().get(3);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.AndroidApplication#addFeature(model.Feature)
	 * <em>Add Feature</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Add Feature</em>' operation.
	 * @see model.AndroidApplication#addFeature(model.Feature)
	 * @generated
	 */
	public EOperation getAndroidApplication__AddFeature__Feature() {
		return androidApplicationEClass.getEOperations().get(4);
	}

	/**
	 * Returns the meta object for class '{@link model.Library <em>Library</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Library</em>'.
	 * @see model.Library
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.Component
	 * <em>Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Component</em>'.
	 * @see model.Component
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.Component#getName <em>Name</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.Component#getIntentFilters <em>Intent Filters</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Intent Filters</em>'.
	 * @see model.Component#getIntentFilters()
	 * @see #getComponent()
	 * @generated
	 */
	public EReference getComponent_IntentFilters() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.Component#componentAddedTo(model.AndroidApplication)
	 * <em>Component Added To</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Component Added To</em>' operation.
	 * @see model.Component#componentAddedTo(model.AndroidApplication)
	 * @generated
	 */
	public EOperation getComponent__ComponentAddedTo__AndroidApplication() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * Returns the meta object for the '{@link model.Component#getXMLTag()
	 * <em>Get XML Tag</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get XML Tag</em>' operation.
	 * @see model.Component#getXMLTag()
	 * @generated
	 */
	public EOperation getComponent__GetXMLTag() {
		return componentEClass.getEOperations().get(1);
	}

	/**
	 * Returns the meta object for the '{@link model.Component#getTemplate()
	 * <em>Get Template</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Template</em>' operation.
	 * @see model.Component#getTemplate()
	 * @generated
	 */
	public EOperation getComponent__GetTemplate() {
		return componentEClass.getEOperations().get(2);
	}

	/**
	 * Returns the meta object for class '{@link model.Permission
	 * <em>Permission</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see model.Permission
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.Permission#getName <em>Name</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Permission#getName()
	 * @see #getPermission()
	 * @generated
	 */
	public EAttribute getPermission_Name() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.Permission#getProtectionLevel <em>Protection Level</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Protection Level</em>'.
	 * @see model.Permission#getProtectionLevel()
	 * @see #getPermission()
	 * @generated
	 */
	public EAttribute getPermission_ProtectionLevel() {
		return (EAttribute) permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.Service <em>Service</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Service</em>'.
	 * @see model.Service
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.Activity
	 * <em>Activity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see model.Activity
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.BroadcastReceiver
	 * <em>Broadcast Receiver</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Broadcast Receiver</em>'.
	 * @see model.BroadcastReceiver
	 * @generated
	 */
	public EClass getBroadcastReceiver() {
		return broadcastReceiverEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.IntentFilter
	 * <em>Intent Filter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Intent Filter</em>'.
	 * @see model.IntentFilter
	 * @generated
	 */
	public EClass getIntentFilter() {
		return intentFilterEClass;
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.IntentFilter#getCategories <em>Categories</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see model.IntentFilter#getCategories()
	 * @see #getIntentFilter()
	 * @generated
	 */
	public EReference getIntentFilter_Categories() {
		return (EReference) intentFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.IntentFilter#getActions <em>Actions</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see model.IntentFilter#getActions()
	 * @see #getIntentFilter()
	 * @generated
	 */
	public EReference getIntentFilter_Actions() {
		return (EReference) intentFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.IntentFilter#getDatasList <em>Datas</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Datas</em>'.
	 * @see model.IntentFilter#getDatasList()
	 * @see #getIntentFilter()
	 * @generated
	 */
	public EReference getIntentFilter_Datas() {
		return (EReference) intentFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link model.IntentCategory
	 * <em>Intent Category</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Intent Category</em>'.
	 * @see model.IntentCategory
	 * @generated
	 */
	public EClass getIntentCategory() {
		return intentCategoryEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.IntentCategory#getName <em>Name</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.IntentCategory#getName()
	 * @see #getIntentCategory()
	 * @generated
	 */
	public EAttribute getIntentCategory_Name() {
		return (EAttribute) intentCategoryEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the meta object for class '{@link model.IntentAction
	 * <em>Intent Action</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Intent Action</em>'.
	 * @see model.IntentAction
	 * @generated
	 */
	public EClass getIntentAction() {
		return intentActionEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.IntentAction#getName <em>Name</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.IntentAction#getName()
	 * @see #getIntentAction()
	 * @generated
	 */
	public EAttribute getIntentAction_Name() {
		return (EAttribute) intentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link model.IntentData
	 * <em>Intent Data</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Intent Data</em>'.
	 * @see model.IntentData
	 * @generated
	 */
	public EClass getIntentData() {
		return intentDataEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.IntentData#getName <em>Name</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.IntentData#getName()
	 * @see #getIntentData()
	 * @generated
	 */
	public EAttribute getIntentData_Name() {
		return (EAttribute) intentDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Model</em>'.
	 * @see model.Model
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link model.Model#getAndroidApps <em>Android Apps</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Android Apps</em>'.
	 * @see model.Model#getAndroidApps()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_AndroidApps() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link model.Model#getJavaApps <em>Java Apps</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Java Apps</em>'.
	 * @see model.Model#getJavaApps()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_JavaApps() {
		return (EReference) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.Metadata
	 * <em>Metadata</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see model.Metadata
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Metadata#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Metadata#getName()
	 * @see #getMetadata()
	 * @generated
	 */
	public EAttribute getMetadata_Name() {
		return (EAttribute) metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.Metadata#getValue <em>Value</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.Metadata#getValue()
	 * @see #getMetadata()
	 * @generated
	 */
	public EAttribute getMetadata_Value() {
		return (EAttribute) metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.GCMIntentService
	 * <em>GCM Intent Service</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>GCM Intent Service</em>'.
	 * @see model.GCMIntentService
	 * @generated
	 */
	public EClass getGCMIntentService() {
		return gcmIntentServiceEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.GCMBroadcastReceiver
	 * <em>GCM Broadcast Receiver</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>GCM Broadcast Receiver</em>'.
	 * @see model.GCMBroadcastReceiver
	 * @generated
	 */
	public EClass getGCMBroadcastReceiver() {
		return gcmBroadcastReceiverEClass;
	}

	/**
	 * Returns the meta object for the reference '
	 * {@link model.GCMBroadcastReceiver#getStartIntentService
	 * <em>Start Intent Service</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Start Intent Service</em>
	 *         '.
	 * @see model.GCMBroadcastReceiver#getStartIntentService()
	 * @see #getGCMBroadcastReceiver()
	 * @generated
	 */
	public EReference getGCMBroadcastReceiver_StartIntentService() {
		return (EReference) gcmBroadcastReceiverEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * Returns the meta object for class '{@link model.GCMActivity
	 * <em>GCM Activity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>GCM Activity</em>'.
	 * @see model.GCMActivity
	 * @generated
	 */
	public EClass getGCMActivity() {
		return gcmActivityEClass;
	}

	/**
	 * Returns the meta object for data type '
	 * {@link generator.ComponentTemplate <em>Component Template</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Component Template</em>'.
	 * @see generator.ComponentTemplate
	 * @generated
	 */
	public EDataType getComponentTemplate() {
		return componentTemplateEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link templates.FeatureTemplate
	 * <em>Feature Template</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for data type '<em>Feature Template</em>'.
	 * @see templates.FeatureTemplate
	 * @generated
	 */
	public EDataType getFeatureTemplate() {
		return featureTemplateEDataType;
	}

	/**
	 * Returns the meta object for data type '
	 * {@link templates.JavaComponentTemplate <em>Java Component Template</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Java Component Template</em>'.
	 * @see templates.JavaComponentTemplate
	 * @generated
	 */
	public EDataType getJavaComponentTemplate() {
		return javaComponentTemplateEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public AndroidAppFactory getAndroidAppFactory() {
		return (AndroidAppFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		androidApplicationEClass = createEClass(ANDROID_APPLICATION);
		createEReference(androidApplicationEClass,
				ANDROID_APPLICATION__DEPENDENCIES);
		createEReference(androidApplicationEClass,
				ANDROID_APPLICATION__COMPONENTS);
		createEReference(androidApplicationEClass, ANDROID_APPLICATION__USES);
		createEReference(androidApplicationEClass, ANDROID_APPLICATION__DEFINES);
		createEAttribute(androidApplicationEClass, ANDROID_APPLICATION__NAME);
		createEAttribute(androidApplicationEClass, ANDROID_APPLICATION__MIN_SDK);
		createEAttribute(androidApplicationEClass,
				ANDROID_APPLICATION__TARGET_SDK);
		createEReference(androidApplicationEClass,
				ANDROID_APPLICATION__METADATAS);
		createEAttribute(androidApplicationEClass,
				ANDROID_APPLICATION__JAVA_NAME);
		createEReference(androidApplicationEClass, ANDROID_APPLICATION__FEATURE);
		createEOperation(androidApplicationEClass,
				ANDROID_APPLICATION___ADD_COMPONENT__COMPONENT);
		createEOperation(androidApplicationEClass,
				ANDROID_APPLICATION___DEFINES_PERMISSION__PERMISSION);
		createEOperation(androidApplicationEClass,
				ANDROID_APPLICATION___USES_PERMISSION__PERMISSION);
		createEOperation(androidApplicationEClass,
				ANDROID_APPLICATION___DEPENDS_ON__LIBRARY);
		createEOperation(androidApplicationEClass,
				ANDROID_APPLICATION___ADD_FEATURE__FEATURE);

		libraryEClass = createEClass(LIBRARY);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__INTENT_FILTERS);
		createEOperation(componentEClass,
				COMPONENT___COMPONENT_ADDED_TO__ANDROIDAPPLICATION);
		createEOperation(componentEClass, COMPONENT___GET_XML_TAG);
		createEOperation(componentEClass, COMPONENT___GET_TEMPLATE);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__NAME);
		createEAttribute(permissionEClass, PERMISSION__PROTECTION_LEVEL);

		serviceEClass = createEClass(SERVICE);

		activityEClass = createEClass(ACTIVITY);

		broadcastReceiverEClass = createEClass(BROADCAST_RECEIVER);

		intentFilterEClass = createEClass(INTENT_FILTER);
		createEReference(intentFilterEClass, INTENT_FILTER__CATEGORIES);
		createEReference(intentFilterEClass, INTENT_FILTER__ACTIONS);
		createEReference(intentFilterEClass, INTENT_FILTER__DATAS);

		intentCategoryEClass = createEClass(INTENT_CATEGORY);
		createEAttribute(intentCategoryEClass, INTENT_CATEGORY__NAME);

		intentActionEClass = createEClass(INTENT_ACTION);
		createEAttribute(intentActionEClass, INTENT_ACTION__NAME);

		intentDataEClass = createEClass(INTENT_DATA);
		createEAttribute(intentDataEClass, INTENT_DATA__NAME);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ANDROID_APPS);
		createEReference(modelEClass, MODEL__JAVA_APPS);

		metadataEClass = createEClass(METADATA);
		createEAttribute(metadataEClass, METADATA__NAME);
		createEAttribute(metadataEClass, METADATA__VALUE);

		gcmIntentServiceEClass = createEClass(GCM_INTENT_SERVICE);

		gcmBroadcastReceiverEClass = createEClass(GCM_BROADCAST_RECEIVER);
		createEReference(gcmBroadcastReceiverEClass,
				GCM_BROADCAST_RECEIVER__START_INTENT_SERVICE);

		gcmActivityEClass = createEClass(GCM_ACTIVITY);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEOperation(featureEClass,
				FEATURE___COMPONENT_ADDED_TO__ANDROIDAPPLICATION);
		createEOperation(featureEClass, FEATURE___GET_TEMPLATE);

		topicManagerEClass = createEClass(TOPIC_MANAGER);

		javaApplicationEClass = createEClass(JAVA_APPLICATION);
		createEAttribute(javaApplicationEClass, JAVA_APPLICATION__NAME);
		createEAttribute(javaApplicationEClass, JAVA_APPLICATION__JAVA_NAME);
		createEReference(javaApplicationEClass, JAVA_APPLICATION__COMPONENTS);
		createEAttribute(javaApplicationEClass, JAVA_APPLICATION__MIN_SDK);
		createEAttribute(javaApplicationEClass, JAVA_APPLICATION__TARGET_SDK);
		createEOperation(javaApplicationEClass,
				JAVA_APPLICATION___ADD_COMPONENT__COMPONENT);
		createEOperation(javaApplicationEClass,
				JAVA_APPLICATION___DEPENDS_ON__LIBRARY);

		javaComponentEClass = createEClass(JAVA_COMPONENT);
		createEAttribute(javaComponentEClass, JAVA_COMPONENT__NAME);
		createEOperation(javaComponentEClass,
				JAVA_COMPONENT___COMPONENT_ADDED_TO__JAVAAPPLICATION);
		createEOperation(javaComponentEClass, JAVA_COMPONENT___GET_TEMPLATE);

		gcmTopicManagerEClass = createEClass(GCM_TOPIC_MANAGER);

		gcmGroupManagerEClass = createEClass(GCM_GROUP_MANAGER);

		gcmMessageManagerEClass = createEClass(GCM_MESSAGE_MANAGER);

		// Create data types
		componentTemplateEDataType = createEDataType(COMPONENT_TEMPLATE);
		featureTemplateEDataType = createEDataType(FEATURE_TEMPLATE);
		javaComponentTemplateEDataType = createEDataType(JAVA_COMPONENT_TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceEClass.getESuperTypes().add(this.getComponent());
		activityEClass.getESuperTypes().add(this.getComponent());
		broadcastReceiverEClass.getESuperTypes().add(this.getComponent());
		gcmIntentServiceEClass.getESuperTypes().add(this.getService());
		gcmBroadcastReceiverEClass.getESuperTypes().add(
				this.getBroadcastReceiver());
		gcmActivityEClass.getESuperTypes().add(this.getActivity());
		topicManagerEClass.getESuperTypes().add(this.getFeature());
		gcmTopicManagerEClass.getESuperTypes().add(this.getJavaComponent());
		gcmGroupManagerEClass.getESuperTypes().add(this.getJavaComponent());
		gcmMessageManagerEClass.getESuperTypes().add(this.getJavaComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(androidApplicationEClass, AndroidApplication.class,
				"AndroidApplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndroidApplication_Dependencies(), this.getLibrary(),
				null, "dependencies", null, 0, -1, AndroidApplication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAndroidApplication_Components(), this.getComponent(),
				null, "components", null, 0, -1, AndroidApplication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAndroidApplication_Uses(), this.getPermission(),
				null, "uses", null, 0, -1, AndroidApplication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAndroidApplication_Defines(), this.getPermission(),
				null, "defines", null, 0, -1, AndroidApplication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAndroidApplication_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, AndroidApplication.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndroidApplication_MinSDK(), ecorePackage.getEInt(),
				"minSDK", null, 0, 1, AndroidApplication.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndroidApplication_TargetSDK(),
				ecorePackage.getEInt(), "targetSDK", null, 0, 1,
				AndroidApplication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAndroidApplication_Metadatas(), this.getMetadata(),
				null, "metadatas", null, 0, -1, AndroidApplication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAndroidApplication_JavaName(),
				ecorePackage.getEString(), "javaName", null, 0, 1,
				AndroidApplication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAndroidApplication_Feature(), this.getFeature(),
				null, "feature", null, 0, -1, AndroidApplication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(
				getAndroidApplication__AddComponent__Component(), null,
				"addComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponent(), "component", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAndroidApplication__DefinesPermission__Permission(), null,
				"definesPermission", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPermission(), "permission", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAndroidApplication__UsesPermission__Permission(), null,
				"usesPermission", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPermission(), "permission", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAndroidApplication__DependsOn__Library(), null,
				"dependsOn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLibrary(), "library", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAndroidApplication__AddFeature__Feature(), null,
				"addFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getComponent_IntentFilters(), this.getIntentFilter(),
				null, "intentFilters", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(
				getComponent__ComponentAddedTo__AndroidApplication(), null,
				"componentAddedTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAndroidApplication(), "app", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getComponent__GetXMLTag(), ecorePackage.getEString(),
				"getXMLTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComponent__GetTemplate(),
				this.getComponentTemplate(), "getTemplate", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPermission_ProtectionLevel(),
				ecorePackage.getEString(), "protectionLevel", null, 0, 1,
				Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(broadcastReceiverEClass, BroadcastReceiver.class,
				"BroadcastReceiver", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(intentFilterEClass, IntentFilter.class, "IntentFilter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntentFilter_Categories(), this.getIntentCategory(),
				null, "categories", null, 0, -1, IntentFilter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIntentFilter_Actions(), this.getIntentAction(), null,
				"actions", null, 0, -1, IntentFilter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntentFilter_Datas(), this.getIntentData(), null,
				"datas", null, 0, -1, IntentFilter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intentCategoryEClass, IntentCategory.class,
				"IntentCategory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentCategory_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, IntentCategory.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(intentActionEClass, IntentAction.class, "IntentAction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentAction_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, IntentAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(intentDataEClass, IntentData.class, "IntentData",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentData_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, IntentData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_AndroidApps(), this.getAndroidApplication(),
				null, "androidApps", null, 0, -1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_JavaApps(), this.getJavaApplication(), null,
				"javaApps", null, 0, -1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMetadata_Value(), ecorePackage.getEString(), "value",
				null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gcmIntentServiceEClass, GCMIntentService.class,
				"GCMIntentService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gcmBroadcastReceiverEClass, GCMBroadcastReceiver.class,
				"GCMBroadcastReceiver", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGCMBroadcastReceiver_StartIntentService(),
				this.getGCMIntentService(), null, "startIntentService", null,
				0, 1, GCMBroadcastReceiver.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gcmActivityEClass, GCMActivity.class, "GCMActivity",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getFeature__ComponentAddedTo__AndroidApplication(),
				null, "componentAddedTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAndroidApplication(), "app", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getFeature__GetTemplate(), this.getFeatureTemplate(),
				"getTemplate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(topicManagerEClass, TopicManager.class, "TopicManager",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaApplicationEClass, JavaApplication.class,
				"JavaApplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaApplication_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, JavaApplication.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaApplication_JavaName(),
				ecorePackage.getEString(), "javaName", null, 0, 1,
				JavaApplication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJavaApplication_Components(),
				this.getJavaComponent(), null, "components", null, 0, -1,
				JavaApplication.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaApplication_MinSDK(), ecorePackage.getEInt(),
				"minSDK", null, 0, 1, JavaApplication.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaApplication_TargetSDK(), ecorePackage.getEInt(),
				"targetSDK", null, 0, 1, JavaApplication.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJavaApplication__AddComponent__Component(),
				null, "addComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponent(), "component", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getJavaApplication__DependsOn__Library(), null,
				"dependsOn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLibrary(), "library", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(javaComponentEClass, JavaComponent.class, "JavaComponent",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaComponent_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, JavaComponent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(
				getJavaComponent__ComponentAddedTo__JavaApplication(), null,
				"componentAddedTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaApplication(), "app", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getJavaComponent__GetTemplate(),
				this.getJavaComponentTemplate(), "getTemplate", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(gcmTopicManagerEClass, GCMTopicManager.class,
				"GCMTopicManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gcmGroupManagerEClass, GCMGroupManager.class,
				"GCMGroupManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(gcmMessageManagerEClass, GCMMessageManager.class,
				"GCMMessageManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(componentTemplateEDataType, ComponentTemplate.class,
				"ComponentTemplate", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(featureTemplateEDataType, FeatureTemplate.class,
				"FeatureTemplate", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaComponentTemplateEDataType,
				JavaComponentTemplate.class, "JavaComponentTemplate",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Feature#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.Feature#componentAddedTo(model.AndroidApplication)
	 * <em>Component Added To</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Component Added To</em>' operation.
	 * @see model.Feature#componentAddedTo(model.AndroidApplication)
	 * @generated
	 */
	public EOperation getFeature__ComponentAddedTo__AndroidApplication() {
		return featureEClass.getEOperations().get(0);
	}

	/**
	 * Returns the meta object for the '{@link model.Feature#getTemplate()
	 * <em>Get Template</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Template</em>' operation.
	 * @see model.Feature#getTemplate()
	 * @generated
	 */
	public EOperation getFeature__GetTemplate() {
		return featureEClass.getEOperations().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.TopicManager
	 * <em>Topic Manager</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Topic Manager</em>'.
	 * @see model.TopicManager
	 * @generated
	 */
	public EClass getTopicManager() {
		return topicManagerEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.JavaApplication
	 * <em>Java Application</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Java Application</em>'.
	 * @see model.JavaApplication
	 * @generated
	 */
	public EClass getJavaApplication() {
		return javaApplicationEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.JavaApplication#getName <em>Name</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.JavaApplication#getName()
	 * @see #getJavaApplication()
	 * @generated
	 */
	public EAttribute getJavaApplication_Name() {
		return (EAttribute) javaApplicationEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.JavaApplication#getJavaName <em>Java Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Java Name</em>'.
	 * @see model.JavaApplication#getJavaName()
	 * @see #getJavaApplication()
	 * @generated
	 */
	public EAttribute getJavaApplication_JavaName() {
		return (EAttribute) javaApplicationEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * Returns the meta object for the reference list '
	 * {@link model.JavaApplication#getComponents <em>Components</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see model.JavaApplication#getComponents()
	 * @see #getJavaApplication()
	 * @generated
	 */
	public EReference getJavaApplication_Components() {
		return (EReference) javaApplicationEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.JavaApplication#getMinSDK <em>Min SDK</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Min SDK</em>'.
	 * @see model.JavaApplication#getMinSDK()
	 * @see #getJavaApplication()
	 * @generated
	 */
	public EAttribute getJavaApplication_MinSDK() {
		return (EAttribute) javaApplicationEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.JavaApplication#getTargetSDK <em>Target SDK</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Target SDK</em>'.
	 * @see model.JavaApplication#getTargetSDK()
	 * @see #getJavaApplication()
	 * @generated
	 */
	public EAttribute getJavaApplication_TargetSDK() {
		return (EAttribute) javaApplicationEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.JavaApplication#addComponent(model.Component)
	 * <em>Add Component</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Add Component</em>' operation.
	 * @see model.JavaApplication#addComponent(model.Component)
	 * @generated
	 */
	public EOperation getJavaApplication__AddComponent__Component() {
		return javaApplicationEClass.getEOperations().get(0);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.JavaApplication#dependsOn(model.Library)
	 * <em>Depends On</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Depends On</em>' operation.
	 * @see model.JavaApplication#dependsOn(model.Library)
	 * @generated
	 */
	public EOperation getJavaApplication__DependsOn__Library() {
		return javaApplicationEClass.getEOperations().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.JavaComponent
	 * <em>Java Component</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Java Component</em>'.
	 * @see model.JavaComponent
	 * @generated
	 */
	public EClass getJavaComponent() {
		return javaComponentEClass;
	}

	/**
	 * Returns the meta object for the attribute '
	 * {@link model.JavaComponent#getName <em>Name</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.JavaComponent#getName()
	 * @see #getJavaComponent()
	 * @generated
	 */
	public EAttribute getJavaComponent_Name() {
		return (EAttribute) javaComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.JavaComponent#componentAddedTo(model.JavaApplication)
	 * <em>Component Added To</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Component Added To</em>' operation.
	 * @see model.JavaComponent#componentAddedTo(model.JavaApplication)
	 * @generated
	 */
	public EOperation getJavaComponent__ComponentAddedTo__JavaApplication() {
		return javaComponentEClass.getEOperations().get(0);
	}

	/**
	 * Returns the meta object for the '
	 * {@link model.JavaComponent#getTemplate() <em>Get Template</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Get Template</em>' operation.
	 * @see model.JavaComponent#getTemplate()
	 * @generated
	 */
	public EOperation getJavaComponent__GetTemplate() {
		return javaComponentEClass.getEOperations().get(1);
	}

	/**
	 * Returns the meta object for class '{@link model.GCMTopicManager
	 * <em>GCM Topic Manager</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>GCM Topic Manager</em>'.
	 * @see model.GCMTopicManager
	 * @generated
	 */
	public EClass getGCMTopicManager() {
		return gcmTopicManagerEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.GCMGroupManager
	 * <em>GCM Group Manager</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>GCM Group Manager</em>'.
	 * @see model.GCMGroupManager
	 * @generated
	 */
	public EClass getGCMGroupManager() {
		return gcmGroupManagerEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.GCMMessageManager
	 * <em>GCM Message Manager</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>GCM Message Manager</em>'.
	 * @see model.GCMMessageManager
	 * @generated
	 */
	public EClass getGCMMessageManager() {
		return gcmMessageManagerEClass;
	}

} // AndroidAppPackage
