/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;
import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Financial Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAccount <em>Account</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue <em>Financial Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinancialInfo extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getWarrantyEndDateTime() <em>Warranty End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date WARRANTY_END_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarrantyEndDateTime() <em>Warranty End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date warrantyEndDateTime = WARRANTY_END_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Warranty End Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warrantyEndDateTimeESet;

	/**
	 * The default value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected String costDescription = COST_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Cost Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costDescriptionESet;

	/**
	 * The default value of the '{@link #getPurchaseDateTime() <em>Purchase Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PURCHASE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseDateTime() <em>Purchase Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date purchaseDateTime = PURCHASE_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Purchase Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purchaseDateTimeESet;

	/**
	 * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected String account = ACCOUNT_EDEFAULT;

	/**
	 * This is true if the Account attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accountESet;

	/**
	 * The default value of the '{@link #getFinancialValue() <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialValue()
	 * @generated
	 * @ordered
	 */
	protected static final float FINANCIAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFinancialValue() <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinancialValue()
	 * @generated
	 * @ordered
	 */
	protected float financialValue = FINANCIAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Financial Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean financialValueESet;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The default value of the '{@link #getPurchaseOrderNumber() <em>Purchase Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCHASE_ORDER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseOrderNumber() <em>Purchase Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected String purchaseOrderNumber = PURCHASE_ORDER_NUMBER_EDEFAULT;

	/**
	 * This is true if the Purchase Order Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purchaseOrderNumberESet;

	/**
	 * The default value of the '{@link #getPlantTransferDateTime() <em>Plant Transfer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantTransferDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PLANT_TRANSFER_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlantTransferDateTime() <em>Plant Transfer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantTransferDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date plantTransferDateTime = PLANT_TRANSFER_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Plant Transfer Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plantTransferDateTimeESet;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quantity = QUANTITY_EDEFAULT;

	/**
	 * This is true if the Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantityESet;

	/**
	 * The default value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALUE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDateTime() <em>Value Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date valueDateTime = VALUE_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Value Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueDateTimeESet;

	/**
	 * The default value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected String costType = COST_TYPE_EDEFAULT;

	/**
	 * This is true if the Cost Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costTypeESet;

	/**
	 * The default value of the '{@link #getActualPurchaseCost() <em>Actual Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPurchaseCost()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTUAL_PURCHASE_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActualPurchaseCost() <em>Actual Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPurchaseCost()
	 * @generated
	 * @ordered
	 */
	protected float actualPurchaseCost = ACTUAL_PURCHASE_COST_EDEFAULT;

	/**
	 * This is true if the Actual Purchase Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actualPurchaseCostESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinancialInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getFinancialInfo();
	}

	/**
	 * Returns the value of the '<em><b>Warranty End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warranty End Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warranty End Date Time</em>' attribute.
	 * @see #isSetWarrantyEndDateTime()
	 * @see #unsetWarrantyEndDateTime()
	 * @see #setWarrantyEndDateTime(Date)
	 * @generated
	 */
	public Date getWarrantyEndDateTime() {
		return warrantyEndDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty End Date Time</em>' attribute.
	 * @see #isSetWarrantyEndDateTime()
	 * @see #unsetWarrantyEndDateTime()
	 * @see #getWarrantyEndDateTime()
	 * @generated
	 */
	public void setWarrantyEndDateTime(Date newWarrantyEndDateTime) {
		warrantyEndDateTime = newWarrantyEndDateTime;
		warrantyEndDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarrantyEndDateTime()
	 * @see #getWarrantyEndDateTime()
	 * @see #setWarrantyEndDateTime(Date)
	 * @generated
	 */
	public void unsetWarrantyEndDateTime() {
		warrantyEndDateTime = WARRANTY_END_DATE_TIME_EDEFAULT;
		warrantyEndDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warranty End Date Time</em>' attribute is set.
	 * @see #unsetWarrantyEndDateTime()
	 * @see #getWarrantyEndDateTime()
	 * @see #setWarrantyEndDateTime(Date)
	 * @generated
	 */
	public boolean isSetWarrantyEndDateTime() {
		return warrantyEndDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' attribute.
	 * @see #isSetCostDescription()
	 * @see #unsetCostDescription()
	 * @see #setCostDescription(String)
	 * @generated
	 */
	public String getCostDescription() {
		return costDescription;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' attribute.
	 * @see #isSetCostDescription()
	 * @see #unsetCostDescription()
	 * @see #getCostDescription()
	 * @generated
	 */
	public void setCostDescription(String newCostDescription) {
		costDescription = newCostDescription;
		costDescriptionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostDescription()
	 * @see #getCostDescription()
	 * @see #setCostDescription(String)
	 * @generated
	 */
	public void unsetCostDescription() {
		costDescription = COST_DESCRIPTION_EDEFAULT;
		costDescriptionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription <em>Cost Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Description</em>' attribute is set.
	 * @see #unsetCostDescription()
	 * @see #getCostDescription()
	 * @see #setCostDescription(String)
	 * @generated
	 */
	public boolean isSetCostDescription() {
		return costDescriptionESet;
	}

	/**
	 * Returns the value of the '<em><b>Purchase Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Date Time</em>' attribute.
	 * @see #isSetPurchaseDateTime()
	 * @see #unsetPurchaseDateTime()
	 * @see #setPurchaseDateTime(Date)
	 * @generated
	 */
	public Date getPurchaseDateTime() {
		return purchaseDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Date Time</em>' attribute.
	 * @see #isSetPurchaseDateTime()
	 * @see #unsetPurchaseDateTime()
	 * @see #getPurchaseDateTime()
	 * @generated
	 */
	public void setPurchaseDateTime(Date newPurchaseDateTime) {
		purchaseDateTime = newPurchaseDateTime;
		purchaseDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurchaseDateTime()
	 * @see #getPurchaseDateTime()
	 * @see #setPurchaseDateTime(Date)
	 * @generated
	 */
	public void unsetPurchaseDateTime() {
		purchaseDateTime = PURCHASE_DATE_TIME_EDEFAULT;
		purchaseDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purchase Date Time</em>' attribute is set.
	 * @see #unsetPurchaseDateTime()
	 * @see #getPurchaseDateTime()
	 * @see #setPurchaseDateTime(Date)
	 * @generated
	 */
	public boolean isSetPurchaseDateTime() {
		return purchaseDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' attribute.
	 * @see #isSetAccount()
	 * @see #unsetAccount()
	 * @see #setAccount(String)
	 * @generated
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' attribute.
	 * @see #isSetAccount()
	 * @see #unsetAccount()
	 * @see #getAccount()
	 * @generated
	 */
	public void setAccount(String newAccount) {
		account = newAccount;
		accountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccount()
	 * @see #getAccount()
	 * @see #setAccount(String)
	 * @generated
	 */
	public void unsetAccount() {
		account = ACCOUNT_EDEFAULT;
		accountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAccount <em>Account</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Account</em>' attribute is set.
	 * @see #unsetAccount()
	 * @see #getAccount()
	 * @see #setAccount(String)
	 * @generated
	 */
	public boolean isSetAccount() {
		return accountESet;
	}

	/**
	 * Returns the value of the '<em><b>Financial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Financial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Financial Value</em>' attribute.
	 * @see #isSetFinancialValue()
	 * @see #unsetFinancialValue()
	 * @see #setFinancialValue(float)
	 * @generated
	 */
	public float getFinancialValue() {
		return financialValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Financial Value</em>' attribute.
	 * @see #isSetFinancialValue()
	 * @see #unsetFinancialValue()
	 * @see #getFinancialValue()
	 * @generated
	 */
	public void setFinancialValue(float newFinancialValue) {
		financialValue = newFinancialValue;
		financialValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue <em>Financial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinancialValue()
	 * @see #getFinancialValue()
	 * @see #setFinancialValue(float)
	 * @generated
	 */
	public void unsetFinancialValue() {
		financialValue = FINANCIAL_VALUE_EDEFAULT;
		financialValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue <em>Financial Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Financial Value</em>' attribute is set.
	 * @see #unsetFinancialValue()
	 * @see #getFinancialValue()
	 * @see #setFinancialValue(float)
	 * @generated
	 */
	public boolean isSetFinancialValue() {
		return financialValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getFinancialInfo <em>Financial Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see CIM15.IEC61968.Assets.Asset#getFinancialInfo
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, AssetsPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Purchase Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Order Number</em>' attribute.
	 * @see #isSetPurchaseOrderNumber()
	 * @see #unsetPurchaseOrderNumber()
	 * @see #setPurchaseOrderNumber(String)
	 * @generated
	 */
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Order Number</em>' attribute.
	 * @see #isSetPurchaseOrderNumber()
	 * @see #unsetPurchaseOrderNumber()
	 * @see #getPurchaseOrderNumber()
	 * @generated
	 */
	public void setPurchaseOrderNumber(String newPurchaseOrderNumber) {
		purchaseOrderNumber = newPurchaseOrderNumber;
		purchaseOrderNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurchaseOrderNumber()
	 * @see #getPurchaseOrderNumber()
	 * @see #setPurchaseOrderNumber(String)
	 * @generated
	 */
	public void unsetPurchaseOrderNumber() {
		purchaseOrderNumber = PURCHASE_ORDER_NUMBER_EDEFAULT;
		purchaseOrderNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purchase Order Number</em>' attribute is set.
	 * @see #unsetPurchaseOrderNumber()
	 * @see #getPurchaseOrderNumber()
	 * @see #setPurchaseOrderNumber(String)
	 * @generated
	 */
	public boolean isSetPurchaseOrderNumber() {
		return purchaseOrderNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Plant Transfer Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Transfer Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Transfer Date Time</em>' attribute.
	 * @see #isSetPlantTransferDateTime()
	 * @see #unsetPlantTransferDateTime()
	 * @see #setPlantTransferDateTime(Date)
	 * @generated
	 */
	public Date getPlantTransferDateTime() {
		return plantTransferDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Transfer Date Time</em>' attribute.
	 * @see #isSetPlantTransferDateTime()
	 * @see #unsetPlantTransferDateTime()
	 * @see #getPlantTransferDateTime()
	 * @generated
	 */
	public void setPlantTransferDateTime(Date newPlantTransferDateTime) {
		plantTransferDateTime = newPlantTransferDateTime;
		plantTransferDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlantTransferDateTime()
	 * @see #getPlantTransferDateTime()
	 * @see #setPlantTransferDateTime(Date)
	 * @generated
	 */
	public void unsetPlantTransferDateTime() {
		plantTransferDateTime = PLANT_TRANSFER_DATE_TIME_EDEFAULT;
		plantTransferDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plant Transfer Date Time</em>' attribute is set.
	 * @see #unsetPlantTransferDateTime()
	 * @see #getPlantTransferDateTime()
	 * @see #setPlantTransferDateTime(Date)
	 * @generated
	 */
	public boolean isSetPlantTransferDateTime() {
		return plantTransferDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public BigInteger getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @generated
	 */
	public void setQuantity(BigInteger newQuantity) {
		quantity = newQuantity;
		quantityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public void unsetQuantity() {
		quantity = QUANTITY_EDEFAULT;
		quantityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity <em>Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantity</em>' attribute is set.
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public boolean isSetQuantity() {
		return quantityESet;
	}

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date Time</em>' attribute.
	 * @see #isSetValueDateTime()
	 * @see #unsetValueDateTime()
	 * @see #setValueDateTime(Date)
	 * @generated
	 */
	public Date getValueDateTime() {
		return valueDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime <em>Value Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' attribute.
	 * @see #isSetValueDateTime()
	 * @see #unsetValueDateTime()
	 * @see #getValueDateTime()
	 * @generated
	 */
	public void setValueDateTime(Date newValueDateTime) {
		valueDateTime = newValueDateTime;
		valueDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime <em>Value Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueDateTime()
	 * @see #getValueDateTime()
	 * @see #setValueDateTime(Date)
	 * @generated
	 */
	public void unsetValueDateTime() {
		valueDateTime = VALUE_DATE_TIME_EDEFAULT;
		valueDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime <em>Value Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Date Time</em>' attribute is set.
	 * @see #unsetValueDateTime()
	 * @see #getValueDateTime()
	 * @see #setValueDateTime(Date)
	 * @generated
	 */
	public boolean isSetValueDateTime() {
		return valueDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' attribute.
	 * @see #isSetCostType()
	 * @see #unsetCostType()
	 * @see #setCostType(String)
	 * @generated
	 */
	public String getCostType() {
		return costType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' attribute.
	 * @see #isSetCostType()
	 * @see #unsetCostType()
	 * @see #getCostType()
	 * @generated
	 */
	public void setCostType(String newCostType) {
		costType = newCostType;
		costTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostType <em>Cost Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostType()
	 * @see #getCostType()
	 * @see #setCostType(String)
	 * @generated
	 */
	public void unsetCostType() {
		costType = COST_TYPE_EDEFAULT;
		costTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostType <em>Cost Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Type</em>' attribute is set.
	 * @see #unsetCostType()
	 * @see #getCostType()
	 * @see #setCostType(String)
	 * @generated
	 */
	public boolean isSetCostType() {
		return costTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Actual Purchase Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Purchase Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Purchase Cost</em>' attribute.
	 * @see #isSetActualPurchaseCost()
	 * @see #unsetActualPurchaseCost()
	 * @see #setActualPurchaseCost(float)
	 * @generated
	 */
	public float getActualPurchaseCost() {
		return actualPurchaseCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Purchase Cost</em>' attribute.
	 * @see #isSetActualPurchaseCost()
	 * @see #unsetActualPurchaseCost()
	 * @see #getActualPurchaseCost()
	 * @generated
	 */
	public void setActualPurchaseCost(float newActualPurchaseCost) {
		actualPurchaseCost = newActualPurchaseCost;
		actualPurchaseCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActualPurchaseCost()
	 * @see #getActualPurchaseCost()
	 * @see #setActualPurchaseCost(float)
	 * @generated
	 */
	public void unsetActualPurchaseCost() {
		actualPurchaseCost = ACTUAL_PURCHASE_COST_EDEFAULT;
		actualPurchaseCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actual Purchase Cost</em>' attribute is set.
	 * @see #unsetActualPurchaseCost()
	 * @see #getActualPurchaseCost()
	 * @see #setActualPurchaseCost(float)
	 * @generated
	 */
	public boolean isSetActualPurchaseCost() {
		return actualPurchaseCostESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__FINANCIAL_INFO, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
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
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				return basicSetAsset(null, msgs);
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
			case InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
				return getWarrantyEndDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION:
				return getCostDescription();
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
				return getPurchaseDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__ACCOUNT:
				return getAccount();
			case InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
				return getFinancialValue();
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
				return getPurchaseOrderNumber();
			case InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
				return getPlantTransferDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__QUANTITY:
				return getQuantity();
			case InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
				return getValueDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__COST_TYPE:
				return getCostType();
			case InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
				return getActualPurchaseCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
				setWarrantyEndDateTime((Date)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION:
				setCostDescription((String)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
				setPurchaseDateTime((Date)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ACCOUNT:
				setAccount((String)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
				setFinancialValue((Float)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				setAsset((Asset)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
				setPurchaseOrderNumber((String)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
				setPlantTransferDateTime((Date)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
				setValueDateTime((Date)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__COST_TYPE:
				setCostType((String)newValue);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
				setActualPurchaseCost((Float)newValue);
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
			case InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
				unsetWarrantyEndDateTime();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION:
				unsetCostDescription();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
				unsetPurchaseDateTime();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ACCOUNT:
				unsetAccount();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
				unsetFinancialValue();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				setAsset((Asset)null);
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
				unsetPurchaseOrderNumber();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
				unsetPlantTransferDateTime();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__QUANTITY:
				unsetQuantity();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
				unsetValueDateTime();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__COST_TYPE:
				unsetCostType();
				return;
			case InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
				unsetActualPurchaseCost();
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
			case InfAssetsPackage.FINANCIAL_INFO__WARRANTY_END_DATE_TIME:
				return isSetWarrantyEndDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__COST_DESCRIPTION:
				return isSetCostDescription();
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_DATE_TIME:
				return isSetPurchaseDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__ACCOUNT:
				return isSetAccount();
			case InfAssetsPackage.FINANCIAL_INFO__FINANCIAL_VALUE:
				return isSetFinancialValue();
			case InfAssetsPackage.FINANCIAL_INFO__ASSET:
				return asset != null;
			case InfAssetsPackage.FINANCIAL_INFO__PURCHASE_ORDER_NUMBER:
				return isSetPurchaseOrderNumber();
			case InfAssetsPackage.FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME:
				return isSetPlantTransferDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__QUANTITY:
				return isSetQuantity();
			case InfAssetsPackage.FINANCIAL_INFO__VALUE_DATE_TIME:
				return isSetValueDateTime();
			case InfAssetsPackage.FINANCIAL_INFO__COST_TYPE:
				return isSetCostType();
			case InfAssetsPackage.FINANCIAL_INFO__ACTUAL_PURCHASE_COST:
				return isSetActualPurchaseCost();
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
		result.append(" (warrantyEndDateTime: ");
		if (warrantyEndDateTimeESet) result.append(warrantyEndDateTime); else result.append("<unset>");
		result.append(", costDescription: ");
		if (costDescriptionESet) result.append(costDescription); else result.append("<unset>");
		result.append(", purchaseDateTime: ");
		if (purchaseDateTimeESet) result.append(purchaseDateTime); else result.append("<unset>");
		result.append(", account: ");
		if (accountESet) result.append(account); else result.append("<unset>");
		result.append(", financialValue: ");
		if (financialValueESet) result.append(financialValue); else result.append("<unset>");
		result.append(", purchaseOrderNumber: ");
		if (purchaseOrderNumberESet) result.append(purchaseOrderNumber); else result.append("<unset>");
		result.append(", plantTransferDateTime: ");
		if (plantTransferDateTimeESet) result.append(plantTransferDateTime); else result.append("<unset>");
		result.append(", quantity: ");
		if (quantityESet) result.append(quantity); else result.append("<unset>");
		result.append(", valueDateTime: ");
		if (valueDateTimeESet) result.append(valueDateTime); else result.append("<unset>");
		result.append(", costType: ");
		if (costTypeESet) result.append(costType); else result.append("<unset>");
		result.append(", actualPurchaseCost: ");
		if (actualPurchaseCostESet) result.append(actualPurchaseCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // FinancialInfo
