/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.Location;
import CIM15.IEC61968.Common.Organisation;

import CIM15.IEC61970.Informative.InfAssets.OrgAssetRole;

import CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole;

import CIM15.IEC61970.Informative.InfOperations.ChangeItem;
import CIM15.IEC61970.Informative.InfOperations.OrgPsrRole;

import CIM15.IEC61970.Informative.InfWork.Crew;
import CIM15.IEC61970.Informative.InfWork.Request;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode <em>Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID <em>Industry ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID <em>Government ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getAssetRoles <em>Asset Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getRequests <em>Requests</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut <em>Opt Out</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter <em>Is Cost Center</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter <em>Is Profit Center</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles <em>Parent Organisation Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations <em>Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles <em>Child Organisation Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles <em>Land Property Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpOrganisation extends Organisation {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet;

	/**
	 * The default value of the '{@link #getIndustryID() <em>Industry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustryID()
	 * @generated
	 * @ordered
	 */
	protected static final String INDUSTRY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndustryID() <em>Industry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustryID()
	 * @generated
	 * @ordered
	 */
	protected String industryID = INDUSTRY_ID_EDEFAULT;

	/**
	 * This is true if the Industry ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean industryIDESet;

	/**
	 * The default value of the '{@link #getGovernmentID() <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernmentID()
	 * @generated
	 * @ordered
	 */
	protected static final String GOVERNMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGovernmentID() <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernmentID()
	 * @generated
	 * @ordered
	 */
	protected String governmentID = GOVERNMENT_ID_EDEFAULT;

	/**
	 * This is true if the Government ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean governmentIDESet;

	/**
	 * The cached value of the '{@link #getAssetRoles() <em>Asset Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgAssetRole> assetRoles;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

	/**
	 * The default value of the '{@link #isOptOut() <em>Opt Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPT_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptOut() <em>Opt Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptOut()
	 * @generated
	 * @ordered
	 */
	protected boolean optOut = OPT_OUT_EDEFAULT;

	/**
	 * This is true if the Opt Out attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optOutESet;

	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

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
	 * The cached value of the '{@link #getErpPersonRoles() <em>Erp Person Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgErpPersonRole> erpPersonRoles;

	/**
	 * The default value of the '{@link #isIsCostCenter() <em>Is Cost Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCostCenter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COST_CENTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCostCenter() <em>Is Cost Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCostCenter()
	 * @generated
	 * @ordered
	 */
	protected boolean isCostCenter = IS_COST_CENTER_EDEFAULT;

	/**
	 * This is true if the Is Cost Center attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCostCenterESet;

	/**
	 * The default value of the '{@link #isIsProfitCenter() <em>Is Profit Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProfitCenter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROFIT_CENTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProfitCenter() <em>Is Profit Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProfitCenter()
	 * @generated
	 * @ordered
	 */
	protected boolean isProfitCenter = IS_PROFIT_CENTER_EDEFAULT;

	/**
	 * This is true if the Is Profit Center attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isProfitCenterESet;

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
	 * The cached value of the '{@link #getParentOrganisationRoles() <em>Parent Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgOrgRole> parentOrganisationRoles;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getChildOrganisationRoles() <em>Child Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgOrgRole> childOrganisationRoles;

	/**
	 * The cached value of the '{@link #getPowerSystemResourceRoles() <em>Power System Resource Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResourceRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgPsrRole> powerSystemResourceRoles;

	/**
	 * The cached value of the '{@link #getLandPropertyRoles() <em>Land Property Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandPropertyRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgPropertyRole> landPropertyRoles;

	/**
	 * The cached value of the '{@link #getDocumentRoles() <em>Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocOrgRole> documentRoles;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpOrganisation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_ORGANISATION;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory <em>Category</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory <em>Category</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCategory <em>Category</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	public void setCode(String newCode) {
		code = newCode;
		codeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public void unsetCode() {
		code = CODE_EDEFAULT;
		codeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * Returns the value of the '<em><b>Industry ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Industry ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Industry ID</em>' attribute.
	 * @see #isSetIndustryID()
	 * @see #unsetIndustryID()
	 * @see #setIndustryID(String)
	 * @generated
	 */
	public String getIndustryID() {
		return industryID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID <em>Industry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Industry ID</em>' attribute.
	 * @see #isSetIndustryID()
	 * @see #unsetIndustryID()
	 * @see #getIndustryID()
	 * @generated
	 */
	public void setIndustryID(String newIndustryID) {
		industryID = newIndustryID;
		industryIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID <em>Industry ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndustryID()
	 * @see #getIndustryID()
	 * @see #setIndustryID(String)
	 * @generated
	 */
	public void unsetIndustryID() {
		industryID = INDUSTRY_ID_EDEFAULT;
		industryIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getIndustryID <em>Industry ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Industry ID</em>' attribute is set.
	 * @see #unsetIndustryID()
	 * @see #getIndustryID()
	 * @see #setIndustryID(String)
	 * @generated
	 */
	public boolean isSetIndustryID() {
		return industryIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Government ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Government ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Government ID</em>' attribute.
	 * @see #isSetGovernmentID()
	 * @see #unsetGovernmentID()
	 * @see #setGovernmentID(String)
	 * @generated
	 */
	public String getGovernmentID() {
		return governmentID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Government ID</em>' attribute.
	 * @see #isSetGovernmentID()
	 * @see #unsetGovernmentID()
	 * @see #getGovernmentID()
	 * @generated
	 */
	public void setGovernmentID(String newGovernmentID) {
		governmentID = newGovernmentID;
		governmentIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID <em>Government ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGovernmentID()
	 * @see #getGovernmentID()
	 * @see #setGovernmentID(String)
	 * @generated
	 */
	public void unsetGovernmentID() {
		governmentID = GOVERNMENT_ID_EDEFAULT;
		governmentIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getGovernmentID <em>Government ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Government ID</em>' attribute is set.
	 * @see #unsetGovernmentID()
	 * @see #getGovernmentID()
	 * @see #setGovernmentID(String)
	 * @generated
	 */
	public boolean isSetGovernmentID() {
		return governmentIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Asset Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation
	 * @generated
	 */
	public EList<OrgAssetRole> getAssetRoles() {
		if (assetRoles == null) {
			assetRoles = new BasicInternalEList<OrgAssetRole>(OrgAssetRole.class);
		}
		return assetRoles;
	}

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Request}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Request#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getOrganisation
	 * @generated
	 */
	public EList<Request> getRequests() {
		if (requests == null) {
			requests = new BasicInternalEList<Request>(Request.class);
		}
		return requests;
	}

	/**
	 * Returns the value of the '<em><b>Opt Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Out</em>' attribute.
	 * @see #isSetOptOut()
	 * @see #unsetOptOut()
	 * @see #setOptOut(boolean)
	 * @generated
	 */
	public boolean isOptOut() {
		return optOut;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut <em>Opt Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Out</em>' attribute.
	 * @see #isSetOptOut()
	 * @see #unsetOptOut()
	 * @see #isOptOut()
	 * @generated
	 */
	public void setOptOut(boolean newOptOut) {
		optOut = newOptOut;
		optOutESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut <em>Opt Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptOut()
	 * @see #isOptOut()
	 * @see #setOptOut(boolean)
	 * @generated
	 */
	public void unsetOptOut() {
		optOut = OPT_OUT_EDEFAULT;
		optOutESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isOptOut <em>Opt Out</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Opt Out</em>' attribute is set.
	 * @see #unsetOptOut()
	 * @see #isOptOut()
	 * @see #setOptOut(boolean)
	 * @generated
	 */
	public boolean isSetOptOut() {
		return optOutESet;
	}

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getOrganisations
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new BasicInternalEList<Crew>(Crew.class);
		}
		return crews;
	}

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicInternalEList<ChangeItem>(ChangeItem.class);
		}
		return changeItems;
	}

	/**
	 * Returns the value of the '<em><b>Erp Person Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation
	 * @generated
	 */
	public EList<OrgErpPersonRole> getErpPersonRoles() {
		if (erpPersonRoles == null) {
			erpPersonRoles = new BasicInternalEList<OrgErpPersonRole>(OrgErpPersonRole.class);
		}
		return erpPersonRoles;
	}

	/**
	 * Returns the value of the '<em><b>Is Cost Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cost Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cost Center</em>' attribute.
	 * @see #isSetIsCostCenter()
	 * @see #unsetIsCostCenter()
	 * @see #setIsCostCenter(boolean)
	 * @generated
	 */
	public boolean isIsCostCenter() {
		return isCostCenter;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter <em>Is Cost Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cost Center</em>' attribute.
	 * @see #isSetIsCostCenter()
	 * @see #unsetIsCostCenter()
	 * @see #isIsCostCenter()
	 * @generated
	 */
	public void setIsCostCenter(boolean newIsCostCenter) {
		isCostCenter = newIsCostCenter;
		isCostCenterESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter <em>Is Cost Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCostCenter()
	 * @see #isIsCostCenter()
	 * @see #setIsCostCenter(boolean)
	 * @generated
	 */
	public void unsetIsCostCenter() {
		isCostCenter = IS_COST_CENTER_EDEFAULT;
		isCostCenterESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsCostCenter <em>Is Cost Center</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Cost Center</em>' attribute is set.
	 * @see #unsetIsCostCenter()
	 * @see #isIsCostCenter()
	 * @see #setIsCostCenter(boolean)
	 * @generated
	 */
	public boolean isSetIsCostCenter() {
		return isCostCenterESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Profit Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Profit Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Profit Center</em>' attribute.
	 * @see #isSetIsProfitCenter()
	 * @see #unsetIsProfitCenter()
	 * @see #setIsProfitCenter(boolean)
	 * @generated
	 */
	public boolean isIsProfitCenter() {
		return isProfitCenter;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter <em>Is Profit Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Profit Center</em>' attribute.
	 * @see #isSetIsProfitCenter()
	 * @see #unsetIsProfitCenter()
	 * @see #isIsProfitCenter()
	 * @generated
	 */
	public void setIsProfitCenter(boolean newIsProfitCenter) {
		isProfitCenter = newIsProfitCenter;
		isProfitCenterESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter <em>Is Profit Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsProfitCenter()
	 * @see #isIsProfitCenter()
	 * @see #setIsProfitCenter(boolean)
	 * @generated
	 */
	public void unsetIsProfitCenter() {
		isProfitCenter = IS_PROFIT_CENTER_EDEFAULT;
		isProfitCenterESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#isIsProfitCenter <em>Is Profit Center</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Profit Center</em>' attribute is set.
	 * @see #unsetIsProfitCenter()
	 * @see #isIsProfitCenter()
	 * @see #setIsProfitCenter(boolean)
	 * @generated
	 */
	public boolean isSetIsProfitCenter() {
		return isProfitCenterESet;
	}

	/**
	 * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.ActivityRecord}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.ActivityRecord#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Records</em>' reference list.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getOrganisations
	 * @generated
	 */
	public EList<ActivityRecord> getActivityRecords() {
		if (activityRecords == null) {
			activityRecords = new BasicInternalEList<ActivityRecord>(ActivityRecord.class);
		}
		return activityRecords;
	}

	/**
	 * Returns the value of the '<em><b>Parent Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation <em>Child Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Organisation Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation
	 * @generated
	 */
	public EList<OrgOrgRole> getParentOrganisationRoles() {
		if (parentOrganisationRoles == null) {
			parentOrganisationRoles = new BasicInternalEList<OrgOrgRole>(OrgOrgRole.class);
		}
		return parentOrganisationRoles;
	}

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getErpOrganisations <em>Erp Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see CIM15.IEC61968.Common.Location#getErpOrganisations
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new BasicInternalEList<Location>(Location.class);
		}
		return locations;
	}

	/**
	 * Returns the value of the '<em><b>Child Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation <em>Parent Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Organisation Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation
	 * @generated
	 */
	public EList<OrgOrgRole> getChildOrganisationRoles() {
		if (childOrganisationRoles == null) {
			childOrganisationRoles = new BasicInternalEList<OrgOrgRole>(OrgOrgRole.class);
		}
		return childOrganisationRoles;
	}

	/**
	 * Returns the value of the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OrgPsrRole#getErpOrganisation
	 * @generated
	 */
	public EList<OrgPsrRole> getPowerSystemResourceRoles() {
		if (powerSystemResourceRoles == null) {
			powerSystemResourceRoles = new BasicInternalEList<OrgPsrRole>(OrgPsrRole.class);
		}
		return powerSystemResourceRoles;
	}

	/**
	 * Returns the value of the '<em><b>Land Property Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation
	 * @generated
	 */
	public EList<OrgPropertyRole> getLandPropertyRoles() {
		if (landPropertyRoles == null) {
			landPropertyRoles = new BasicInternalEList<OrgPropertyRole>(OrgPropertyRole.class);
		}
		return landPropertyRoles;
	}

	/**
	 * Returns the value of the '<em><b>Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole#getErpOrganisation
	 * @generated
	 */
	public EList<DocOrgRole> getDocumentRoles() {
		if (documentRoles == null) {
			documentRoles = new BasicInternalEList<DocOrgRole>(DocOrgRole.class);
		}
		return documentRoles;
	}

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(String)
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	public void setMode(String newMode) {
		mode = newMode;
		modeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(String)
	 * @generated
	 */
	public void unsetMode() {
		mode = MODE_EDEFAULT;
		modeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(String)
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
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
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequests()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersonRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRecords()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOrganisationRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildOrganisationRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResourceRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandPropertyRoles()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentRoles()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				return ((InternalEList<?>)getAssetRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				return ((InternalEList<?>)getErpPersonRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				return ((InternalEList<?>)getActivityRecords()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				return ((InternalEList<?>)getParentOrganisationRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				return ((InternalEList<?>)getChildOrganisationRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				return ((InternalEList<?>)getPowerSystemResourceRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				return ((InternalEList<?>)getLandPropertyRoles()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				return ((InternalEList<?>)getDocumentRoles()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_ORGANISATION__CATEGORY:
				return getCategory();
			case InfERPSupportPackage.ERP_ORGANISATION__CODE:
				return getCode();
			case InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID:
				return getIndustryID();
			case InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID:
				return getGovernmentID();
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				return getAssetRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				return getRequests();
			case InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT:
				return isOptOut();
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				return getCrews();
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				return getChangeItems();
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				return getErpPersonRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER:
				return isIsCostCenter();
			case InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER:
				return isIsProfitCenter();
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				return getActivityRecords();
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				return getParentOrganisationRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				return getLocations();
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				return getChildOrganisationRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				return getPowerSystemResourceRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				return getLandPropertyRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				return getDocumentRoles();
			case InfERPSupportPackage.ERP_ORGANISATION__MODE:
				return getMode();
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
			case InfERPSupportPackage.ERP_ORGANISATION__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CODE:
				setCode((String)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID:
				setIndustryID((String)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID:
				setGovernmentID((String)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				getAssetRoles().clear();
				getAssetRoles().addAll((Collection<? extends OrgAssetRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT:
				setOptOut((Boolean)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				getErpPersonRoles().addAll((Collection<? extends OrgErpPersonRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER:
				setIsCostCenter((Boolean)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER:
				setIsProfitCenter((Boolean)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				getActivityRecords().addAll((Collection<? extends ActivityRecord>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				getParentOrganisationRoles().clear();
				getParentOrganisationRoles().addAll((Collection<? extends OrgOrgRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				getChildOrganisationRoles().clear();
				getChildOrganisationRoles().addAll((Collection<? extends OrgOrgRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				getPowerSystemResourceRoles().clear();
				getPowerSystemResourceRoles().addAll((Collection<? extends OrgPsrRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				getLandPropertyRoles().clear();
				getLandPropertyRoles().addAll((Collection<? extends OrgPropertyRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				getDocumentRoles().addAll((Collection<? extends DocOrgRole>)newValue);
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__MODE:
				setMode((String)newValue);
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
			case InfERPSupportPackage.ERP_ORGANISATION__CATEGORY:
				unsetCategory();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CODE:
				unsetCode();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID:
				unsetIndustryID();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID:
				unsetGovernmentID();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				getAssetRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				getRequests().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT:
				unsetOptOut();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				getCrews().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER:
				unsetIsCostCenter();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER:
				unsetIsProfitCenter();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				getParentOrganisationRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				getLocations().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				getChildOrganisationRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				getPowerSystemResourceRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				getLandPropertyRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				return;
			case InfERPSupportPackage.ERP_ORGANISATION__MODE:
				unsetMode();
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
			case InfERPSupportPackage.ERP_ORGANISATION__CATEGORY:
				return isSetCategory();
			case InfERPSupportPackage.ERP_ORGANISATION__CODE:
				return isSetCode();
			case InfERPSupportPackage.ERP_ORGANISATION__INDUSTRY_ID:
				return isSetIndustryID();
			case InfERPSupportPackage.ERP_ORGANISATION__GOVERNMENT_ID:
				return isSetGovernmentID();
			case InfERPSupportPackage.ERP_ORGANISATION__ASSET_ROLES:
				return assetRoles != null && !assetRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__REQUESTS:
				return requests != null && !requests.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__OPT_OUT:
				return isSetOptOut();
			case InfERPSupportPackage.ERP_ORGANISATION__CREWS:
				return crews != null && !crews.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES:
				return erpPersonRoles != null && !erpPersonRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__IS_COST_CENTER:
				return isSetIsCostCenter();
			case InfERPSupportPackage.ERP_ORGANISATION__IS_PROFIT_CENTER:
				return isSetIsProfitCenter();
			case InfERPSupportPackage.ERP_ORGANISATION__ACTIVITY_RECORDS:
				return activityRecords != null && !activityRecords.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES:
				return parentOrganisationRoles != null && !parentOrganisationRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES:
				return childOrganisationRoles != null && !childOrganisationRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__POWER_SYSTEM_RESOURCE_ROLES:
				return powerSystemResourceRoles != null && !powerSystemResourceRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES:
				return landPropertyRoles != null && !landPropertyRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__DOCUMENT_ROLES:
				return documentRoles != null && !documentRoles.isEmpty();
			case InfERPSupportPackage.ERP_ORGANISATION__MODE:
				return isSetMode();
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
		result.append(" (category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(", code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(", industryID: ");
		if (industryIDESet) result.append(industryID); else result.append("<unset>");
		result.append(", governmentID: ");
		if (governmentIDESet) result.append(governmentID); else result.append("<unset>");
		result.append(", optOut: ");
		if (optOutESet) result.append(optOut); else result.append("<unset>");
		result.append(", isCostCenter: ");
		if (isCostCenterESet) result.append(isCostCenter); else result.append("<unset>");
		result.append(", isProfitCenter: ");
		if (isProfitCenterESet) result.append(isProfitCenter); else result.append("<unset>");
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpOrganisation
