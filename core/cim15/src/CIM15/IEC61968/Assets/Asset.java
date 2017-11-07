/**
 */
package CIM15.IEC61968.Assets;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.CommonPackage;
import CIM15.IEC61968.Common.ElectronicAddress;
import CIM15.IEC61968.Common.Location;
import CIM15.IEC61968.Common.Status;
import CIM15.IEC61968.Common.UserAttribute;

import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Informative.InfAssets.AssetAssetRole;
import CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve;
import CIM15.IEC61970.Informative.InfAssets.DocAssetRole;
import CIM15.IEC61970.Informative.InfAssets.FinancialInfo;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM15.IEC61970.Informative.InfAssets.Medium;
import CIM15.IEC61970.Informative.InfAssets.OrgAssetRole;
import CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo;

import CIM15.IEC61970.Informative.InfCommon.ScheduledEvent;

import CIM15.IEC61970.Informative.InfERPSupport.ErpInventory;
import CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster;
import CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM15.IEC61970.Informative.InfOperations.ChangeItem;

import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM15.IEC61970.Informative.InfWork.WorkTask;

import CIM15.IEC61970.Meas.Measurement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getMediums <em>Mediums</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getErpRecDeliveryItems <em>Erp Rec Delivery Items</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getRatings <em>Ratings</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getToAssetRoles <em>To Asset Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getFromAssetRoles <em>From Asset Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getAssetFunctions <em>Asset Functions</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getErpItemMaster <em>Erp Item Master</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getErpInventory <em>Erp Inventory</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getReliabilityInfos <em>Reliability Infos</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getUtcNumber <em>Utc Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getAssetInfo <em>Asset Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getAssetContainer <em>Asset Container</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getAssetPropertyCurves <em>Asset Property Curves</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#isCritical <em>Critical</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getApplication <em>Application</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getPurchasePrice <em>Purchase Price</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getInitialLossOfLife <em>Initial Loss Of Life</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getManufacturedDate <em>Manufactured Date</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getFinancialInfo <em>Financial Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getInstallationDate <em>Installation Date</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getProperties <em>Properties</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Asset#getLotNumber <em>Lot Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Asset extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getDocumentRoles() <em>Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocAssetRole> documentRoles;

	/**
	 * The cached value of the '{@link #getMediums() <em>Mediums</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediums()
	 * @generated
	 * @ordered
	 */
	protected EList<Medium> mediums;

	/**
	 * The cached value of the '{@link #getErpRecDeliveryItems() <em>Erp Rec Delivery Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecDeliveryItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecDelvLineItem> erpRecDeliveryItems;

	/**
	 * The cached value of the '{@link #getRatings() <em>Ratings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> ratings;

	/**
	 * The cached value of the '{@link #getToAssetRoles() <em>To Asset Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAssetRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetAssetRole> toAssetRoles;

	/**
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

	/**
	 * The cached value of the '{@link #getFromAssetRoles() <em>From Asset Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAssetRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetAssetRole> fromAssetRoles;

	/**
	 * The cached value of the '{@link #getAssetFunctions() <em>Asset Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetFunction> assetFunctions;

	/**
	 * The cached value of the '{@link #getErpItemMaster() <em>Erp Item Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpItemMaster()
	 * @generated
	 * @ordered
	 */
	protected ErpItemMaster erpItemMaster;

	/**
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * This is true if the Corporate Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean corporateCodeESet;

	/**
	 * The cached value of the '{@link #getErpInventory() <em>Erp Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInventory()
	 * @generated
	 * @ordered
	 */
	protected ErpInventory erpInventory;

	/**
	 * The cached value of the '{@link #getReliabilityInfos() <em>Reliability Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ReliabilityInfo> reliabilityInfos;

	/**
	 * The default value of the '{@link #getUtcNumber() <em>Utc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String UTC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtcNumber() <em>Utc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcNumber()
	 * @generated
	 * @ordered
	 */
	protected String utcNumber = UTC_NUMBER_EDEFAULT;

	/**
	 * This is true if the Utc Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean utcNumberESet;

	/**
	 * The cached value of the '{@link #getAssetInfo() <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetInfo()
	 * @generated
	 * @ordered
	 */
	protected AssetInfo assetInfo;

	/**
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * The default value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected String initialCondition = INITIAL_CONDITION_EDEFAULT;

	/**
	 * This is true if the Initial Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialConditionESet;

	/**
	 * The cached value of the '{@link #getAcceptanceTest() <em>Acceptance Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceTest()
	 * @generated
	 * @ordered
	 */
	protected AcceptanceTest acceptanceTest;

	/**
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgAssetRole> erpOrganisationRoles;

	/**
	 * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduledEvent> scheduledEvents;

	/**
	 * The cached value of the '{@link #getAssetContainer() <em>Asset Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetContainer()
	 * @generated
	 * @ordered
	 */
	protected AssetContainer assetContainer;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet;

	/**
	 * The cached value of the '{@link #getAssetPropertyCurves() <em>Asset Property Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetPropertyCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetPropertyCurve> assetPropertyCurves;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * This is true if the Serial Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serialNumberESet;

	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

	/**
	 * The cached value of the '{@link #getActivityRecords() <em>Activity Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityRecord> activityRecords;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected boolean critical = CRITICAL_EDEFAULT;

	/**
	 * This is true if the Critical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean criticalESet;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * This is true if the Application attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicationESet;

	/**
	 * The default value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchasePrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PURCHASE_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPurchasePrice() <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchasePrice()
	 * @generated
	 * @ordered
	 */
	protected float purchasePrice = PURCHASE_PRICE_EDEFAULT;

	/**
	 * This is true if the Purchase Price attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purchasePriceESet;

	/**
	 * The default value of the '{@link #getInitialLossOfLife() <em>Initial Loss Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLossOfLife()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_LOSS_OF_LIFE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialLossOfLife() <em>Initial Loss Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLossOfLife()
	 * @generated
	 * @ordered
	 */
	protected float initialLossOfLife = INITIAL_LOSS_OF_LIFE_EDEFAULT;

	/**
	 * This is true if the Initial Loss Of Life attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialLossOfLifeESet;

	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

	/**
	 * The default value of the '{@link #getManufacturedDate() <em>Manufactured Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturedDate() <em>Manufactured Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedDate()
	 * @generated
	 * @ordered
	 */
	protected String manufacturedDate = MANUFACTURED_DATE_EDEFAULT;

	/**
	 * This is true if the Manufactured Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean manufacturedDateESet;

	/**
	 * The cached value of the '{@link #getFinancialInfo() <em>Financial Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialInfo()
	 * @generated
	 * @ordered
	 */
	protected FinancialInfo financialInfo;

	/**
	 * The default value of the '{@link #getInstallationDate() <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALLATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallationDate() <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallationDate()
	 * @generated
	 * @ordered
	 */
	protected String installationDate = INSTALLATION_DATE_EDEFAULT;

	/**
	 * This is true if the Installation Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean installationDateESet;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> properties;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * The default value of the '{@link #getLotNumber() <em>Lot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LOT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected String lotNumber = LOT_NUMBER_EDEFAULT;

	/**
	 * This is true if the Lot Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lotNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Asset() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.ASSET;
	}

	/**
	 * Returns the value of the '<em><b>Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.DocAssetRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.DocAssetRole#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.DocAssetRole#getAsset
	 * @generated
	 */
	public EList<DocAssetRole> getDocumentRoles() {
		if (documentRoles == null) {
			documentRoles = new BasicInternalEList<DocAssetRole>(DocAssetRole.class);
		}
		return documentRoles;
	}

	/**
	 * Returns the value of the '<em><b>Mediums</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Medium}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Medium#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediums</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediums</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Medium#getAssets
	 * @generated
	 */
	public EList<Medium> getMediums() {
		if (mediums == null) {
			mediums = new BasicInternalEList<Medium>(Medium.class);
		}
		return mediums;
	}

	/**
	 * Returns the value of the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Delivery Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Delivery Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getAssets
	 * @generated
	 */
	public EList<ErpRecDelvLineItem> getErpRecDeliveryItems() {
		if (erpRecDeliveryItems == null) {
			erpRecDeliveryItems = new BasicInternalEList<ErpRecDelvLineItem>(ErpRecDelvLineItem.class);
		}
		return erpRecDeliveryItems;
	}

	/**
	 * Returns the value of the '<em><b>Ratings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.UserAttribute#getRatingAssets <em>Rating Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratings</em>' reference list.
	 * @see CIM15.IEC61968.Common.UserAttribute#getRatingAssets
	 * @generated
	 */
	public EList<UserAttribute> getRatings() {
		if (ratings == null) {
			ratings = new BasicInternalEList<UserAttribute>(UserAttribute.class);
		}
		return ratings;
	}

	/**
	 * Returns the value of the '<em><b>To Asset Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset <em>From Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Asset Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Asset Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset
	 * @generated
	 */
	public EList<AssetAssetRole> getToAssetRoles() {
		if (toAssetRoles == null) {
			toAssetRoles = new BasicInternalEList<AssetAssetRole>(AssetAssetRole.class);
		}
		return toAssetRoles;
	}

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' containment reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicAddress(ElectronicAddress newElectronicAddress, NotificationChain msgs) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getElectronicAddress <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' containment reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		if (newElectronicAddress != electronicAddress) {
			NotificationChain msgs = null;
			if (electronicAddress != null)
				msgs = ((InternalEObject)electronicAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssetsPackage.ASSET__ELECTRONIC_ADDRESS, null, msgs);
			if (newElectronicAddress != null)
				msgs = ((InternalEObject)newElectronicAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssetsPackage.ASSET__ELECTRONIC_ADDRESS, null, msgs);
			msgs = basicSetElectronicAddress(newElectronicAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>From Asset Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset <em>To Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Asset Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Asset Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset
	 * @generated
	 */
	public EList<AssetAssetRole> getFromAssetRoles() {
		if (fromAssetRoles == null) {
			fromAssetRoles = new BasicInternalEList<AssetAssetRole>(AssetAssetRole.class);
		}
		return fromAssetRoles;
	}

	/**
	 * Returns the value of the '<em><b>Asset Functions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.AssetFunction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetFunction#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Functions</em>' reference list.
	 * @see CIM15.IEC61968.Assets.AssetFunction#getAsset
	 * @generated
	 */
	public EList<AssetFunction> getAssetFunctions() {
		if (assetFunctions == null) {
			assetFunctions = new BasicInternalEList<AssetFunction>(AssetFunction.class);
		}
		return assetFunctions;
	}

	/**
	 * Returns the value of the '<em><b>Erp Item Master</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Item Master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Item Master</em>' reference.
	 * @see #setErpItemMaster(ErpItemMaster)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster#getAsset
	 * @generated
	 */
	public ErpItemMaster getErpItemMaster() {
		if (erpItemMaster != null && erpItemMaster.eIsProxy()) {
			InternalEObject oldErpItemMaster = (InternalEObject)erpItemMaster;
			erpItemMaster = (ErpItemMaster)eResolveProxy(oldErpItemMaster);
			if (erpItemMaster != oldErpItemMaster) {
			}
		}
		return erpItemMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpItemMaster basicGetErpItemMaster() {
		return erpItemMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpItemMaster(ErpItemMaster newErpItemMaster, NotificationChain msgs) {
		ErpItemMaster oldErpItemMaster = erpItemMaster;
		erpItemMaster = newErpItemMaster;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getErpItemMaster <em>Erp Item Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Item Master</em>' reference.
	 * @see #getErpItemMaster()
	 * @generated
	 */
	public void setErpItemMaster(ErpItemMaster newErpItemMaster) {
		if (newErpItemMaster != erpItemMaster) {
			NotificationChain msgs = null;
			if (erpItemMaster != null)
				msgs = ((InternalEObject)erpItemMaster).eInverseRemove(this, InfERPSupportPackage.ERP_ITEM_MASTER__ASSET, ErpItemMaster.class, msgs);
			if (newErpItemMaster != null)
				msgs = ((InternalEObject)newErpItemMaster).eInverseAdd(this, InfERPSupportPackage.ERP_ITEM_MASTER__ASSET, ErpItemMaster.class, msgs);
			msgs = basicSetErpItemMaster(newErpItemMaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #isSetCorporateCode()
	 * @see #unsetCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #isSetCorporateCode()
	 * @see #unsetCorporateCode()
	 * @see #getCorporateCode()
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		corporateCode = newCorporateCode;
		corporateCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCorporateCode()
	 * @see #getCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public void unsetCorporateCode() {
		corporateCode = CORPORATE_CODE_EDEFAULT;
		corporateCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getCorporateCode <em>Corporate Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Corporate Code</em>' attribute is set.
	 * @see #unsetCorporateCode()
	 * @see #getCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public boolean isSetCorporateCode() {
		return corporateCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Inventory</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventory#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Inventory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Inventory</em>' reference.
	 * @see #setErpInventory(ErpInventory)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventory#getAsset
	 * @generated
	 */
	public ErpInventory getErpInventory() {
		if (erpInventory != null && erpInventory.eIsProxy()) {
			InternalEObject oldErpInventory = (InternalEObject)erpInventory;
			erpInventory = (ErpInventory)eResolveProxy(oldErpInventory);
			if (erpInventory != oldErpInventory) {
			}
		}
		return erpInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInventory basicGetErpInventory() {
		return erpInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpInventory(ErpInventory newErpInventory, NotificationChain msgs) {
		ErpInventory oldErpInventory = erpInventory;
		erpInventory = newErpInventory;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getErpInventory <em>Erp Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Inventory</em>' reference.
	 * @see #getErpInventory()
	 * @generated
	 */
	public void setErpInventory(ErpInventory newErpInventory) {
		if (newErpInventory != erpInventory) {
			NotificationChain msgs = null;
			if (erpInventory != null)
				msgs = ((InternalEObject)erpInventory).eInverseRemove(this, InfERPSupportPackage.ERP_INVENTORY__ASSET, ErpInventory.class, msgs);
			if (newErpInventory != null)
				msgs = ((InternalEObject)newErpInventory).eInverseAdd(this, InfERPSupportPackage.ERP_INVENTORY__ASSET, ErpInventory.class, msgs);
			msgs = basicSetErpInventory(newErpInventory, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Reliability Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets
	 * @generated
	 */
	public EList<ReliabilityInfo> getReliabilityInfos() {
		if (reliabilityInfos == null) {
			reliabilityInfos = new BasicInternalEList<ReliabilityInfo>(ReliabilityInfo.class);
		}
		return reliabilityInfos;
	}

	/**
	 * Returns the value of the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utc Number</em>' attribute.
	 * @see #isSetUtcNumber()
	 * @see #unsetUtcNumber()
	 * @see #setUtcNumber(String)
	 * @generated
	 */
	public String getUtcNumber() {
		return utcNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getUtcNumber <em>Utc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utc Number</em>' attribute.
	 * @see #isSetUtcNumber()
	 * @see #unsetUtcNumber()
	 * @see #getUtcNumber()
	 * @generated
	 */
	public void setUtcNumber(String newUtcNumber) {
		utcNumber = newUtcNumber;
		utcNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getUtcNumber <em>Utc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUtcNumber()
	 * @see #getUtcNumber()
	 * @see #setUtcNumber(String)
	 * @generated
	 */
	public void unsetUtcNumber() {
		utcNumber = UTC_NUMBER_EDEFAULT;
		utcNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getUtcNumber <em>Utc Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Utc Number</em>' attribute is set.
	 * @see #unsetUtcNumber()
	 * @see #getUtcNumber()
	 * @see #setUtcNumber(String)
	 * @generated
	 */
	public boolean isSetUtcNumber() {
		return utcNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Asset Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetInfo#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Info</em>' reference.
	 * @see #setAssetInfo(AssetInfo)
	 * @see CIM15.IEC61968.Assets.AssetInfo#getAssets
	 * @generated
	 */
	public AssetInfo getAssetInfo() {
		if (assetInfo != null && assetInfo.eIsProxy()) {
			InternalEObject oldAssetInfo = (InternalEObject)assetInfo;
			assetInfo = (AssetInfo)eResolveProxy(oldAssetInfo);
			if (assetInfo != oldAssetInfo) {
			}
		}
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetInfo basicGetAssetInfo() {
		return assetInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetInfo(AssetInfo newAssetInfo, NotificationChain msgs) {
		AssetInfo oldAssetInfo = assetInfo;
		assetInfo = newAssetInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getAssetInfo <em>Asset Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Info</em>' reference.
	 * @see #getAssetInfo()
	 * @generated
	 */
	public void setAssetInfo(AssetInfo newAssetInfo) {
		if (newAssetInfo != assetInfo) {
			NotificationChain msgs = null;
			if (assetInfo != null)
				msgs = ((InternalEObject)assetInfo).eInverseRemove(this, AssetsPackage.ASSET_INFO__ASSETS, AssetInfo.class, msgs);
			if (newAssetInfo != null)
				msgs = ((InternalEObject)newAssetInfo).eInverseAdd(this, AssetsPackage.ASSET_INFO__ASSETS, AssetInfo.class, msgs);
			msgs = basicSetAssetInfo(newAssetInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getAssets
	 * @generated
	 */
	public WorkTask getWorkTask() {
		if (workTask != null && workTask.eIsProxy()) {
			InternalEObject oldWorkTask = (InternalEObject)workTask;
			workTask = (WorkTask)eResolveProxy(oldWorkTask);
			if (workTask != oldWorkTask) {
			}
		}
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask basicGetWorkTask() {
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTask(WorkTask newWorkTask, NotificationChain msgs) {
		WorkTask oldWorkTask = workTask;
		workTask = newWorkTask;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	public void setWorkTask(WorkTask newWorkTask) {
		if (newWorkTask != workTask) {
			NotificationChain msgs = null;
			if (workTask != null)
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__ASSETS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__ASSETS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Condition</em>' attribute.
	 * @see #isSetInitialCondition()
	 * @see #unsetInitialCondition()
	 * @see #setInitialCondition(String)
	 * @generated
	 */
	public String getInitialCondition() {
		return initialCondition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getInitialCondition <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Condition</em>' attribute.
	 * @see #isSetInitialCondition()
	 * @see #unsetInitialCondition()
	 * @see #getInitialCondition()
	 * @generated
	 */
	public void setInitialCondition(String newInitialCondition) {
		initialCondition = newInitialCondition;
		initialConditionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getInitialCondition <em>Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialCondition()
	 * @see #getInitialCondition()
	 * @see #setInitialCondition(String)
	 * @generated
	 */
	public void unsetInitialCondition() {
		initialCondition = INITIAL_CONDITION_EDEFAULT;
		initialConditionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getInitialCondition <em>Initial Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Condition</em>' attribute is set.
	 * @see #unsetInitialCondition()
	 * @see #getInitialCondition()
	 * @see #setInitialCondition(String)
	 * @generated
	 */
	public boolean isSetInitialCondition() {
		return initialConditionESet;
	}

	/**
	 * Returns the value of the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Test</em>' containment reference.
	 * @see #setAcceptanceTest(AcceptanceTest)
	 * @generated
	 */
	public AcceptanceTest getAcceptanceTest() {
		return acceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptanceTest(AcceptanceTest newAcceptanceTest, NotificationChain msgs) {
		AcceptanceTest oldAcceptanceTest = acceptanceTest;
		acceptanceTest = newAcceptanceTest;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getAcceptanceTest <em>Acceptance Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Test</em>' containment reference.
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	public void setAcceptanceTest(AcceptanceTest newAcceptanceTest) {
		if (newAcceptanceTest != acceptanceTest) {
			NotificationChain msgs = null;
			if (acceptanceTest != null)
				msgs = ((InternalEObject)acceptanceTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssetsPackage.ASSET__ACCEPTANCE_TEST, null, msgs);
			if (newAcceptanceTest != null)
				msgs = ((InternalEObject)newAcceptanceTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssetsPackage.ASSET__ACCEPTANCE_TEST, null, msgs);
			msgs = basicSetAcceptanceTest(newAcceptanceTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset
	 * @generated
	 */
	public EList<OrgAssetRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new BasicInternalEList<OrgAssetRole>(OrgAssetRole.class);
		}
		return erpOrganisationRoles;
	}

	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getAssets
	 * @generated
	 */
	public EList<ScheduledEvent> getScheduledEvents() {
		if (scheduledEvents == null) {
			scheduledEvents = new BasicInternalEList<ScheduledEvent>(ScheduledEvent.class);
		}
		return scheduledEvents;
	}

	/**
	 * Returns the value of the '<em><b>Asset Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetContainer#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Container</em>' reference.
	 * @see #setAssetContainer(AssetContainer)
	 * @see CIM15.IEC61968.Assets.AssetContainer#getAssets
	 * @generated
	 */
	public AssetContainer getAssetContainer() {
		if (assetContainer != null && assetContainer.eIsProxy()) {
			InternalEObject oldAssetContainer = (InternalEObject)assetContainer;
			assetContainer = (AssetContainer)eResolveProxy(oldAssetContainer);
			if (assetContainer != oldAssetContainer) {
			}
		}
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetContainer basicGetAssetContainer() {
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetContainer(AssetContainer newAssetContainer, NotificationChain msgs) {
		AssetContainer oldAssetContainer = assetContainer;
		assetContainer = newAssetContainer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getAssetContainer <em>Asset Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Container</em>' reference.
	 * @see #getAssetContainer()
	 * @generated
	 */
	public void setAssetContainer(AssetContainer newAssetContainer) {
		if (newAssetContainer != assetContainer) {
			NotificationChain msgs = null;
			if (assetContainer != null)
				msgs = ((InternalEObject)assetContainer).eInverseRemove(this, AssetsPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs);
			if (newAssetContainer != null)
				msgs = ((InternalEObject)newAssetContainer).eInverseAdd(this, AssetsPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs);
			msgs = basicSetAssetContainer(newAssetContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	public void setCategory(String newCategory) {
		category = newCategory;
		categoryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public void unsetCategory() {
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * Returns the value of the '<em><b>Asset Property Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Property Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Property Curves</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets
	 * @generated
	 */
	public EList<AssetPropertyCurve> getAssetPropertyCurves() {
		if (assetPropertyCurves == null) {
			assetPropertyCurves = new BasicInternalEList<AssetPropertyCurve>(AssetPropertyCurve.class);
		}
		return assetPropertyCurves;
	}

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #isSetSerialNumber()
	 * @see #unsetSerialNumber()
	 * @see #setSerialNumber(String)
	 * @generated
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #isSetSerialNumber()
	 * @see #unsetSerialNumber()
	 * @see #getSerialNumber()
	 * @generated
	 */
	public void setSerialNumber(String newSerialNumber) {
		serialNumber = newSerialNumber;
		serialNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSerialNumber()
	 * @see #getSerialNumber()
	 * @see #setSerialNumber(String)
	 * @generated
	 */
	public void unsetSerialNumber() {
		serialNumber = SERIAL_NUMBER_EDEFAULT;
		serialNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getSerialNumber <em>Serial Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Serial Number</em>' attribute is set.
	 * @see #unsetSerialNumber()
	 * @see #getSerialNumber()
	 * @see #setSerialNumber(String)
	 * @generated
	 */
	public boolean isSetSerialNumber() {
		return serialNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getAsset
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicInternalEList<ChangeItem>(ChangeItem.class);
		}
		return changeItems;
	}

	/**
	 * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.ActivityRecord}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.ActivityRecord#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Records</em>' reference list.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getAssets
	 * @generated
	 */
	public EList<ActivityRecord> getActivityRecords() {
		if (activityRecords == null) {
			activityRecords = new BasicInternalEList<ActivityRecord>(ActivityRecord.class);
		}
		return activityRecords;
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM15.IEC61968.Common.Location#getAssets
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__ASSETS, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CommonPackage.LOCATION__ASSETS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see #isSetCritical()
	 * @see #unsetCritical()
	 * @see #setCritical(boolean)
	 * @generated
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see #isSetCritical()
	 * @see #unsetCritical()
	 * @see #isCritical()
	 * @generated
	 */
	public void setCritical(boolean newCritical) {
		critical = newCritical;
		criticalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCritical()
	 * @see #isCritical()
	 * @see #setCritical(boolean)
	 * @generated
	 */
	public void unsetCritical() {
		critical = CRITICAL_EDEFAULT;
		criticalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#isCritical <em>Critical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Critical</em>' attribute is set.
	 * @see #unsetCritical()
	 * @see #isCritical()
	 * @see #setCritical(boolean)
	 * @generated
	 */
	public boolean isSetCritical() {
		return criticalESet;
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssetsPackage.ASSET__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssetsPackage.ASSET__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #isSetApplication()
	 * @see #unsetApplication()
	 * @see #setApplication(String)
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #isSetApplication()
	 * @see #unsetApplication()
	 * @see #getApplication()
	 * @generated
	 */
	public void setApplication(String newApplication) {
		application = newApplication;
		applicationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplication()
	 * @see #getApplication()
	 * @see #setApplication(String)
	 * @generated
	 */
	public void unsetApplication() {
		application = APPLICATION_EDEFAULT;
		applicationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getApplication <em>Application</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Application</em>' attribute is set.
	 * @see #unsetApplication()
	 * @see #getApplication()
	 * @see #setApplication(String)
	 * @generated
	 */
	public boolean isSetApplication() {
		return applicationESet;
	}

	/**
	 * Returns the value of the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Price</em>' attribute.
	 * @see #isSetPurchasePrice()
	 * @see #unsetPurchasePrice()
	 * @see #setPurchasePrice(float)
	 * @generated
	 */
	public float getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getPurchasePrice <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Price</em>' attribute.
	 * @see #isSetPurchasePrice()
	 * @see #unsetPurchasePrice()
	 * @see #getPurchasePrice()
	 * @generated
	 */
	public void setPurchasePrice(float newPurchasePrice) {
		purchasePrice = newPurchasePrice;
		purchasePriceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getPurchasePrice <em>Purchase Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurchasePrice()
	 * @see #getPurchasePrice()
	 * @see #setPurchasePrice(float)
	 * @generated
	 */
	public void unsetPurchasePrice() {
		purchasePrice = PURCHASE_PRICE_EDEFAULT;
		purchasePriceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getPurchasePrice <em>Purchase Price</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purchase Price</em>' attribute is set.
	 * @see #unsetPurchasePrice()
	 * @see #getPurchasePrice()
	 * @see #setPurchasePrice(float)
	 * @generated
	 */
	public boolean isSetPurchasePrice() {
		return purchasePriceESet;
	}

	/**
	 * Returns the value of the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Loss Of Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Loss Of Life</em>' attribute.
	 * @see #isSetInitialLossOfLife()
	 * @see #unsetInitialLossOfLife()
	 * @see #setInitialLossOfLife(float)
	 * @generated
	 */
	public float getInitialLossOfLife() {
		return initialLossOfLife;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getInitialLossOfLife <em>Initial Loss Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Loss Of Life</em>' attribute.
	 * @see #isSetInitialLossOfLife()
	 * @see #unsetInitialLossOfLife()
	 * @see #getInitialLossOfLife()
	 * @generated
	 */
	public void setInitialLossOfLife(float newInitialLossOfLife) {
		initialLossOfLife = newInitialLossOfLife;
		initialLossOfLifeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getInitialLossOfLife <em>Initial Loss Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialLossOfLife()
	 * @see #getInitialLossOfLife()
	 * @see #setInitialLossOfLife(float)
	 * @generated
	 */
	public void unsetInitialLossOfLife() {
		initialLossOfLife = INITIAL_LOSS_OF_LIFE_EDEFAULT;
		initialLossOfLifeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getInitialLossOfLife <em>Initial Loss Of Life</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Loss Of Life</em>' attribute is set.
	 * @see #unsetInitialLossOfLife()
	 * @see #getInitialLossOfLife()
	 * @see #setInitialLossOfLife(float)
	 * @generated
	 */
	public boolean isSetInitialLossOfLife() {
		return initialLossOfLifeESet;
	}

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getAssets
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new BasicInternalEList<PowerSystemResource>(PowerSystemResource.class);
		}
		return powerSystemResources;
	}

	/**
	 * Returns the value of the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufactured Date</em>' attribute.
	 * @see #isSetManufacturedDate()
	 * @see #unsetManufacturedDate()
	 * @see #setManufacturedDate(String)
	 * @generated
	 */
	public String getManufacturedDate() {
		return manufacturedDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getManufacturedDate <em>Manufactured Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Date</em>' attribute.
	 * @see #isSetManufacturedDate()
	 * @see #unsetManufacturedDate()
	 * @see #getManufacturedDate()
	 * @generated
	 */
	public void setManufacturedDate(String newManufacturedDate) {
		manufacturedDate = newManufacturedDate;
		manufacturedDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getManufacturedDate <em>Manufactured Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManufacturedDate()
	 * @see #getManufacturedDate()
	 * @see #setManufacturedDate(String)
	 * @generated
	 */
	public void unsetManufacturedDate() {
		manufacturedDate = MANUFACTURED_DATE_EDEFAULT;
		manufacturedDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getManufacturedDate <em>Manufactured Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manufactured Date</em>' attribute is set.
	 * @see #unsetManufacturedDate()
	 * @see #getManufacturedDate()
	 * @see #setManufacturedDate(String)
	 * @generated
	 */
	public boolean isSetManufacturedDate() {
		return manufacturedDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Financial Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Financial Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financial Info</em>' reference.
	 * @see #setFinancialInfo(FinancialInfo)
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAsset
	 * @generated
	 */
	public FinancialInfo getFinancialInfo() {
		if (financialInfo != null && financialInfo.eIsProxy()) {
			InternalEObject oldFinancialInfo = (InternalEObject)financialInfo;
			financialInfo = (FinancialInfo)eResolveProxy(oldFinancialInfo);
			if (financialInfo != oldFinancialInfo) {
			}
		}
		return financialInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialInfo basicGetFinancialInfo() {
		return financialInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinancialInfo(FinancialInfo newFinancialInfo, NotificationChain msgs) {
		FinancialInfo oldFinancialInfo = financialInfo;
		financialInfo = newFinancialInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getFinancialInfo <em>Financial Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financial Info</em>' reference.
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public void setFinancialInfo(FinancialInfo newFinancialInfo) {
		if (newFinancialInfo != financialInfo) {
			NotificationChain msgs = null;
			if (financialInfo != null)
				msgs = ((InternalEObject)financialInfo).eInverseRemove(this, InfAssetsPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs);
			if (newFinancialInfo != null)
				msgs = ((InternalEObject)newFinancialInfo).eInverseAdd(this, InfAssetsPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs);
			msgs = basicSetFinancialInfo(newFinancialInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation Date</em>' attribute.
	 * @see #isSetInstallationDate()
	 * @see #unsetInstallationDate()
	 * @see #setInstallationDate(String)
	 * @generated
	 */
	public String getInstallationDate() {
		return installationDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getInstallationDate <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation Date</em>' attribute.
	 * @see #isSetInstallationDate()
	 * @see #unsetInstallationDate()
	 * @see #getInstallationDate()
	 * @generated
	 */
	public void setInstallationDate(String newInstallationDate) {
		installationDate = newInstallationDate;
		installationDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getInstallationDate <em>Installation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstallationDate()
	 * @see #getInstallationDate()
	 * @see #setInstallationDate(String)
	 * @generated
	 */
	public void unsetInstallationDate() {
		installationDate = INSTALLATION_DATE_EDEFAULT;
		installationDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getInstallationDate <em>Installation Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Installation Date</em>' attribute is set.
	 * @see #unsetInstallationDate()
	 * @see #getInstallationDate()
	 * @see #setInstallationDate(String)
	 * @generated
	 */
	public boolean isSetInstallationDate() {
		return installationDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.UserAttribute#getPropertyAssets <em>Property Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see CIM15.IEC61968.Common.UserAttribute#getPropertyAssets
	 * @generated
	 */
	public EList<UserAttribute> getProperties() {
		if (properties == null) {
			properties = new BasicInternalEList<UserAttribute>(UserAttribute.class);
		}
		return properties;
	}

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Measurement#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Measurement#getAsset
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new BasicInternalEList<Measurement>(Measurement.class);
		}
		return measurements;
	}

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot Number</em>' attribute.
	 * @see #isSetLotNumber()
	 * @see #unsetLotNumber()
	 * @see #setLotNumber(String)
	 * @generated
	 */
	public String getLotNumber() {
		return lotNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Asset#getLotNumber <em>Lot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' attribute.
	 * @see #isSetLotNumber()
	 * @see #unsetLotNumber()
	 * @see #getLotNumber()
	 * @generated
	 */
	public void setLotNumber(String newLotNumber) {
		lotNumber = newLotNumber;
		lotNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Asset#getLotNumber <em>Lot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLotNumber()
	 * @see #getLotNumber()
	 * @see #setLotNumber(String)
	 * @generated
	 */
	public void unsetLotNumber() {
		lotNumber = LOT_NUMBER_EDEFAULT;
		lotNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Asset#getLotNumber <em>Lot Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lot Number</em>' attribute is set.
	 * @see #unsetLotNumber()
	 * @see #getLotNumber()
	 * @see #setLotNumber(String)
	 * @generated
	 */
	public boolean isSetLotNumber() {
		return lotNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentRoles()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__MEDIUMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMediums()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecDeliveryItems()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__RATINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRatings()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToAssetRoles()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromAssetRoles()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetFunctions()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				if (erpItemMaster != null)
					msgs = ((InternalEObject)erpItemMaster).eInverseRemove(this, InfERPSupportPackage.ERP_ITEM_MASTER__ASSET, ErpItemMaster.class, msgs);
				return basicSetErpItemMaster((ErpItemMaster)otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_INVENTORY:
				if (erpInventory != null)
					msgs = ((InternalEObject)erpInventory).eInverseRemove(this, InfERPSupportPackage.ERP_INVENTORY__ASSET, ErpInventory.class, msgs);
				return basicSetErpInventory((ErpInventory)otherEnd, msgs);
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReliabilityInfos()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_INFO:
				if (assetInfo != null)
					msgs = ((InternalEObject)assetInfo).eInverseRemove(this, AssetsPackage.ASSET_INFO__ASSETS, AssetInfo.class, msgs);
				return basicSetAssetInfo((AssetInfo)otherEnd, msgs);
			case AssetsPackage.ASSET__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__ASSETS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledEvents()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				if (assetContainer != null)
					msgs = ((InternalEObject)assetContainer).eInverseRemove(this, AssetsPackage.ASSET_CONTAINER__ASSETS, AssetContainer.class, msgs);
				return basicSetAssetContainer((AssetContainer)otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetPropertyCurves()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRecords()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__ASSETS, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				if (financialInfo != null)
					msgs = ((InternalEObject)financialInfo).eInverseRemove(this, InfAssetsPackage.FINANCIAL_INFO__ASSET, FinancialInfo.class, msgs);
				return basicSetFinancialInfo((FinancialInfo)otherEnd, msgs);
			case AssetsPackage.ASSET__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case AssetsPackage.ASSET__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				return ((InternalEList<?>)getDocumentRoles()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__MEDIUMS:
				return ((InternalEList<?>)getMediums()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				return ((InternalEList<?>)getErpRecDeliveryItems()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__RATINGS:
				return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				return ((InternalEList<?>)getToAssetRoles()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				return basicSetElectronicAddress(null, msgs);
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				return ((InternalEList<?>)getFromAssetRoles()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				return ((InternalEList<?>)getAssetFunctions()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				return basicSetErpItemMaster(null, msgs);
			case AssetsPackage.ASSET__ERP_INVENTORY:
				return basicSetErpInventory(null, msgs);
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				return ((InternalEList<?>)getReliabilityInfos()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_INFO:
				return basicSetAssetInfo(null, msgs);
			case AssetsPackage.ASSET__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				return basicSetAcceptanceTest(null, msgs);
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				return ((InternalEList<?>)getScheduledEvents()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				return basicSetAssetContainer(null, msgs);
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				return ((InternalEList<?>)getAssetPropertyCurves()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				return ((InternalEList<?>)getActivityRecords()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__LOCATION:
				return basicSetLocation(null, msgs);
			case AssetsPackage.ASSET__STATUS:
				return basicSetStatus(null, msgs);
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				return basicSetFinancialInfo(null, msgs);
			case AssetsPackage.ASSET__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case AssetsPackage.ASSET__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				return getDocumentRoles();
			case AssetsPackage.ASSET__MEDIUMS:
				return getMediums();
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				return getErpRecDeliveryItems();
			case AssetsPackage.ASSET__RATINGS:
				return getRatings();
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				return getToAssetRoles();
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				return getElectronicAddress();
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				return getFromAssetRoles();
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				return getAssetFunctions();
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				if (resolve) return getErpItemMaster();
				return basicGetErpItemMaster();
			case AssetsPackage.ASSET__CORPORATE_CODE:
				return getCorporateCode();
			case AssetsPackage.ASSET__ERP_INVENTORY:
				if (resolve) return getErpInventory();
				return basicGetErpInventory();
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				return getReliabilityInfos();
			case AssetsPackage.ASSET__UTC_NUMBER:
				return getUtcNumber();
			case AssetsPackage.ASSET__ASSET_INFO:
				if (resolve) return getAssetInfo();
				return basicGetAssetInfo();
			case AssetsPackage.ASSET__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case AssetsPackage.ASSET__INITIAL_CONDITION:
				return getInitialCondition();
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				return getAcceptanceTest();
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				return getScheduledEvents();
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				if (resolve) return getAssetContainer();
				return basicGetAssetContainer();
			case AssetsPackage.ASSET__CATEGORY:
				return getCategory();
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				return getAssetPropertyCurves();
			case AssetsPackage.ASSET__SERIAL_NUMBER:
				return getSerialNumber();
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				return getChangeItems();
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				return getActivityRecords();
			case AssetsPackage.ASSET__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case AssetsPackage.ASSET__CRITICAL:
				return isCritical();
			case AssetsPackage.ASSET__STATUS:
				return getStatus();
			case AssetsPackage.ASSET__APPLICATION:
				return getApplication();
			case AssetsPackage.ASSET__PURCHASE_PRICE:
				return getPurchasePrice();
			case AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE:
				return getInitialLossOfLife();
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case AssetsPackage.ASSET__MANUFACTURED_DATE:
				return getManufacturedDate();
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				if (resolve) return getFinancialInfo();
				return basicGetFinancialInfo();
			case AssetsPackage.ASSET__INSTALLATION_DATE:
				return getInstallationDate();
			case AssetsPackage.ASSET__PROPERTIES:
				return getProperties();
			case AssetsPackage.ASSET__MEASUREMENTS:
				return getMeasurements();
			case AssetsPackage.ASSET__LOT_NUMBER:
				return getLotNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				getDocumentRoles().addAll((Collection<? extends DocAssetRole>)newValue);
				return;
			case AssetsPackage.ASSET__MEDIUMS:
				getMediums().clear();
				getMediums().addAll((Collection<? extends Medium>)newValue);
				return;
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				getErpRecDeliveryItems().clear();
				getErpRecDeliveryItems().addAll((Collection<? extends ErpRecDelvLineItem>)newValue);
				return;
			case AssetsPackage.ASSET__RATINGS:
				getRatings().clear();
				getRatings().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				getToAssetRoles().clear();
				getToAssetRoles().addAll((Collection<? extends AssetAssetRole>)newValue);
				return;
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				getFromAssetRoles().clear();
				getFromAssetRoles().addAll((Collection<? extends AssetAssetRole>)newValue);
				return;
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				getAssetFunctions().clear();
				getAssetFunctions().addAll((Collection<? extends AssetFunction>)newValue);
				return;
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				setErpItemMaster((ErpItemMaster)newValue);
				return;
			case AssetsPackage.ASSET__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case AssetsPackage.ASSET__ERP_INVENTORY:
				setErpInventory((ErpInventory)newValue);
				return;
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				getReliabilityInfos().clear();
				getReliabilityInfos().addAll((Collection<? extends ReliabilityInfo>)newValue);
				return;
			case AssetsPackage.ASSET__UTC_NUMBER:
				setUtcNumber((String)newValue);
				return;
			case AssetsPackage.ASSET__ASSET_INFO:
				setAssetInfo((AssetInfo)newValue);
				return;
			case AssetsPackage.ASSET__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case AssetsPackage.ASSET__INITIAL_CONDITION:
				setInitialCondition((String)newValue);
				return;
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				setAcceptanceTest((AcceptanceTest)newValue);
				return;
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends OrgAssetRole>)newValue);
				return;
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				getScheduledEvents().addAll((Collection<? extends ScheduledEvent>)newValue);
				return;
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				setAssetContainer((AssetContainer)newValue);
				return;
			case AssetsPackage.ASSET__CATEGORY:
				setCategory((String)newValue);
				return;
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				getAssetPropertyCurves().clear();
				getAssetPropertyCurves().addAll((Collection<? extends AssetPropertyCurve>)newValue);
				return;
			case AssetsPackage.ASSET__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				getActivityRecords().addAll((Collection<? extends ActivityRecord>)newValue);
				return;
			case AssetsPackage.ASSET__LOCATION:
				setLocation((Location)newValue);
				return;
			case AssetsPackage.ASSET__CRITICAL:
				setCritical((Boolean)newValue);
				return;
			case AssetsPackage.ASSET__STATUS:
				setStatus((Status)newValue);
				return;
			case AssetsPackage.ASSET__APPLICATION:
				setApplication((String)newValue);
				return;
			case AssetsPackage.ASSET__PURCHASE_PRICE:
				setPurchasePrice((Float)newValue);
				return;
			case AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE:
				setInitialLossOfLife((Float)newValue);
				return;
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case AssetsPackage.ASSET__MANUFACTURED_DATE:
				setManufacturedDate((String)newValue);
				return;
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				setFinancialInfo((FinancialInfo)newValue);
				return;
			case AssetsPackage.ASSET__INSTALLATION_DATE:
				setInstallationDate((String)newValue);
				return;
			case AssetsPackage.ASSET__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case AssetsPackage.ASSET__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case AssetsPackage.ASSET__LOT_NUMBER:
				setLotNumber((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				return;
			case AssetsPackage.ASSET__MEDIUMS:
				getMediums().clear();
				return;
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				getErpRecDeliveryItems().clear();
				return;
			case AssetsPackage.ASSET__RATINGS:
				getRatings().clear();
				return;
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				getToAssetRoles().clear();
				return;
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				getFromAssetRoles().clear();
				return;
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				getAssetFunctions().clear();
				return;
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				setErpItemMaster((ErpItemMaster)null);
				return;
			case AssetsPackage.ASSET__CORPORATE_CODE:
				unsetCorporateCode();
				return;
			case AssetsPackage.ASSET__ERP_INVENTORY:
				setErpInventory((ErpInventory)null);
				return;
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				getReliabilityInfos().clear();
				return;
			case AssetsPackage.ASSET__UTC_NUMBER:
				unsetUtcNumber();
				return;
			case AssetsPackage.ASSET__ASSET_INFO:
				setAssetInfo((AssetInfo)null);
				return;
			case AssetsPackage.ASSET__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case AssetsPackage.ASSET__INITIAL_CONDITION:
				unsetInitialCondition();
				return;
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				setAcceptanceTest((AcceptanceTest)null);
				return;
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				return;
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				setAssetContainer((AssetContainer)null);
				return;
			case AssetsPackage.ASSET__CATEGORY:
				unsetCategory();
				return;
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				getAssetPropertyCurves().clear();
				return;
			case AssetsPackage.ASSET__SERIAL_NUMBER:
				unsetSerialNumber();
				return;
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				return;
			case AssetsPackage.ASSET__LOCATION:
				setLocation((Location)null);
				return;
			case AssetsPackage.ASSET__CRITICAL:
				unsetCritical();
				return;
			case AssetsPackage.ASSET__STATUS:
				setStatus((Status)null);
				return;
			case AssetsPackage.ASSET__APPLICATION:
				unsetApplication();
				return;
			case AssetsPackage.ASSET__PURCHASE_PRICE:
				unsetPurchasePrice();
				return;
			case AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE:
				unsetInitialLossOfLife();
				return;
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case AssetsPackage.ASSET__MANUFACTURED_DATE:
				unsetManufacturedDate();
				return;
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				setFinancialInfo((FinancialInfo)null);
				return;
			case AssetsPackage.ASSET__INSTALLATION_DATE:
				unsetInstallationDate();
				return;
			case AssetsPackage.ASSET__PROPERTIES:
				getProperties().clear();
				return;
			case AssetsPackage.ASSET__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case AssetsPackage.ASSET__LOT_NUMBER:
				unsetLotNumber();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssetsPackage.ASSET__DOCUMENT_ROLES:
				return documentRoles != null && !documentRoles.isEmpty();
			case AssetsPackage.ASSET__MEDIUMS:
				return mediums != null && !mediums.isEmpty();
			case AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS:
				return erpRecDeliveryItems != null && !erpRecDeliveryItems.isEmpty();
			case AssetsPackage.ASSET__RATINGS:
				return ratings != null && !ratings.isEmpty();
			case AssetsPackage.ASSET__TO_ASSET_ROLES:
				return toAssetRoles != null && !toAssetRoles.isEmpty();
			case AssetsPackage.ASSET__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case AssetsPackage.ASSET__FROM_ASSET_ROLES:
				return fromAssetRoles != null && !fromAssetRoles.isEmpty();
			case AssetsPackage.ASSET__ASSET_FUNCTIONS:
				return assetFunctions != null && !assetFunctions.isEmpty();
			case AssetsPackage.ASSET__ERP_ITEM_MASTER:
				return erpItemMaster != null;
			case AssetsPackage.ASSET__CORPORATE_CODE:
				return isSetCorporateCode();
			case AssetsPackage.ASSET__ERP_INVENTORY:
				return erpInventory != null;
			case AssetsPackage.ASSET__RELIABILITY_INFOS:
				return reliabilityInfos != null && !reliabilityInfos.isEmpty();
			case AssetsPackage.ASSET__UTC_NUMBER:
				return isSetUtcNumber();
			case AssetsPackage.ASSET__ASSET_INFO:
				return assetInfo != null;
			case AssetsPackage.ASSET__WORK_TASK:
				return workTask != null;
			case AssetsPackage.ASSET__INITIAL_CONDITION:
				return isSetInitialCondition();
			case AssetsPackage.ASSET__ACCEPTANCE_TEST:
				return acceptanceTest != null;
			case AssetsPackage.ASSET__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case AssetsPackage.ASSET__SCHEDULED_EVENTS:
				return scheduledEvents != null && !scheduledEvents.isEmpty();
			case AssetsPackage.ASSET__ASSET_CONTAINER:
				return assetContainer != null;
			case AssetsPackage.ASSET__CATEGORY:
				return isSetCategory();
			case AssetsPackage.ASSET__ASSET_PROPERTY_CURVES:
				return assetPropertyCurves != null && !assetPropertyCurves.isEmpty();
			case AssetsPackage.ASSET__SERIAL_NUMBER:
				return isSetSerialNumber();
			case AssetsPackage.ASSET__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case AssetsPackage.ASSET__ACTIVITY_RECORDS:
				return activityRecords != null && !activityRecords.isEmpty();
			case AssetsPackage.ASSET__LOCATION:
				return location != null;
			case AssetsPackage.ASSET__CRITICAL:
				return isSetCritical();
			case AssetsPackage.ASSET__STATUS:
				return status != null;
			case AssetsPackage.ASSET__APPLICATION:
				return isSetApplication();
			case AssetsPackage.ASSET__PURCHASE_PRICE:
				return isSetPurchasePrice();
			case AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE:
				return isSetInitialLossOfLife();
			case AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case AssetsPackage.ASSET__MANUFACTURED_DATE:
				return isSetManufacturedDate();
			case AssetsPackage.ASSET__FINANCIAL_INFO:
				return financialInfo != null;
			case AssetsPackage.ASSET__INSTALLATION_DATE:
				return isSetInstallationDate();
			case AssetsPackage.ASSET__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case AssetsPackage.ASSET__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case AssetsPackage.ASSET__LOT_NUMBER:
				return isSetLotNumber();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (corporateCode: ");
		if (corporateCodeESet) result.append(corporateCode); else result.append("<unset>");
		result.append(", utcNumber: ");
		if (utcNumberESet) result.append(utcNumber); else result.append("<unset>");
		result.append(", initialCondition: ");
		if (initialConditionESet) result.append(initialCondition); else result.append("<unset>");
		result.append(", category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(", serialNumber: ");
		if (serialNumberESet) result.append(serialNumber); else result.append("<unset>");
		result.append(", critical: ");
		if (criticalESet) result.append(critical); else result.append("<unset>");
		result.append(", application: ");
		if (applicationESet) result.append(application); else result.append("<unset>");
		result.append(", purchasePrice: ");
		if (purchasePriceESet) result.append(purchasePrice); else result.append("<unset>");
		result.append(", initialLossOfLife: ");
		if (initialLossOfLifeESet) result.append(initialLossOfLife); else result.append("<unset>");
		result.append(", manufacturedDate: ");
		if (manufacturedDateESet) result.append(manufacturedDate); else result.append("<unset>");
		result.append(", installationDate: ");
		if (installationDateESet) result.append(installationDate); else result.append("<unset>");
		result.append(", lotNumber: ");
		if (lotNumberESet) result.append(lotNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Asset
