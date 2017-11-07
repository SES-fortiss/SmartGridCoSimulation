/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Misc Cost Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit <em>Cost Per Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID <em>External Ref ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getAccount <em>Account</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail <em>Work Cost Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiscCostItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getDesignLocation() <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocation()
	 * @generated
	 * @ordered
	 */
	protected DesignLocation designLocation;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getCostPerUnit() <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUnit()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_PER_UNIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostPerUnit() <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUnit()
	 * @generated
	 * @ordered
	 */
	protected float costPerUnit = COST_PER_UNIT_EDEFAULT;

	/**
	 * This is true if the Cost Per Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costPerUnitESet;

	/**
	 * The default value of the '{@link #getExternalRefID() <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRefID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalRefID() <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRefID()
	 * @generated
	 * @ordered
	 */
	protected String externalRefID = EXTERNAL_REF_ID_EDEFAULT;

	/**
	 * This is true if the External Ref ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean externalRefIDESet;

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
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * The cached value of the '{@link #getWorkCostDetail() <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetail()
	 * @generated
	 * @ordered
	 */
	protected WorkCostDetail workCostDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiscCostItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.MISC_COST_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Design Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location</em>' reference.
	 * @see #setDesignLocation(DesignLocation)
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems
	 * @generated
	 */
	public DesignLocation getDesignLocation() {
		if (designLocation != null && designLocation.eIsProxy()) {
			InternalEObject oldDesignLocation = (InternalEObject)designLocation;
			designLocation = (DesignLocation)eResolveProxy(oldDesignLocation);
			if (designLocation != oldDesignLocation) {
			}
		}
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation basicGetDesignLocation() {
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignLocation(DesignLocation newDesignLocation, NotificationChain msgs) {
		DesignLocation oldDesignLocation = designLocation;
		designLocation = newDesignLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Location</em>' reference.
	 * @see #getDesignLocation()
	 * @generated
	 */
	public void setDesignLocation(DesignLocation newDesignLocation) {
		if (newDesignLocation != designLocation) {
			NotificationChain msgs = null;
			if (designLocation != null)
				msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS, DesignLocation.class, msgs);
			if (newDesignLocation != null)
				msgs = ((InternalEObject)newDesignLocation).eInverseAdd(this, InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS, DesignLocation.class, msgs);
			msgs = basicSetDesignLocation(newDesignLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getQuantity <em>Quantity</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getQuantity <em>Quantity</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getQuantity <em>Quantity</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.MISC_COST_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.MISC_COST_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cost Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Per Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Per Unit</em>' attribute.
	 * @see #isSetCostPerUnit()
	 * @see #unsetCostPerUnit()
	 * @see #setCostPerUnit(float)
	 * @generated
	 */
	public float getCostPerUnit() {
		return costPerUnit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Unit</em>' attribute.
	 * @see #isSetCostPerUnit()
	 * @see #unsetCostPerUnit()
	 * @see #getCostPerUnit()
	 * @generated
	 */
	public void setCostPerUnit(float newCostPerUnit) {
		costPerUnit = newCostPerUnit;
		costPerUnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit <em>Cost Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostPerUnit()
	 * @see #getCostPerUnit()
	 * @see #setCostPerUnit(float)
	 * @generated
	 */
	public void unsetCostPerUnit() {
		costPerUnit = COST_PER_UNIT_EDEFAULT;
		costPerUnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostPerUnit <em>Cost Per Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Per Unit</em>' attribute is set.
	 * @see #unsetCostPerUnit()
	 * @see #getCostPerUnit()
	 * @see #setCostPerUnit(float)
	 * @generated
	 */
	public boolean isSetCostPerUnit() {
		return costPerUnitESet;
	}

	/**
	 * Returns the value of the '<em><b>External Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ref ID</em>' attribute.
	 * @see #isSetExternalRefID()
	 * @see #unsetExternalRefID()
	 * @see #setExternalRefID(String)
	 * @generated
	 */
	public String getExternalRefID() {
		return externalRefID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Ref ID</em>' attribute.
	 * @see #isSetExternalRefID()
	 * @see #unsetExternalRefID()
	 * @see #getExternalRefID()
	 * @generated
	 */
	public void setExternalRefID(String newExternalRefID) {
		externalRefID = newExternalRefID;
		externalRefIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID <em>External Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternalRefID()
	 * @see #getExternalRefID()
	 * @see #setExternalRefID(String)
	 * @generated
	 */
	public void unsetExternalRefID() {
		externalRefID = EXTERNAL_REF_ID_EDEFAULT;
		externalRefIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getExternalRefID <em>External Ref ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>External Ref ID</em>' attribute is set.
	 * @see #unsetExternalRefID()
	 * @see #getExternalRefID()
	 * @see #setExternalRefID(String)
	 * @generated
	 */
	public boolean isSetExternalRefID() {
		return externalRefIDESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getAccount <em>Account</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getAccount <em>Account</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getAccount <em>Account</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostType <em>Cost Type</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostType <em>Cost Type</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getCostType <em>Cost Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask <em>Work Task</em>}' reference.
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
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__MISC_COST_ITEMS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__MISC_COST_ITEMS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems <em>Misc Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Detail</em>' reference.
	 * @see #setWorkCostDetail(WorkCostDetail)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems
	 * @generated
	 */
	public WorkCostDetail getWorkCostDetail() {
		if (workCostDetail != null && workCostDetail.eIsProxy()) {
			InternalEObject oldWorkCostDetail = (InternalEObject)workCostDetail;
			workCostDetail = (WorkCostDetail)eResolveProxy(oldWorkCostDetail);
			if (workCostDetail != oldWorkCostDetail) {
			}
		}
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostDetail basicGetWorkCostDetail() {
		return workCostDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkCostDetail(WorkCostDetail newWorkCostDetail, NotificationChain msgs) {
		WorkCostDetail oldWorkCostDetail = workCostDetail;
		workCostDetail = newWorkCostDetail;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail <em>Work Cost Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Detail</em>' reference.
	 * @see #getWorkCostDetail()
	 * @generated
	 */
	public void setWorkCostDetail(WorkCostDetail newWorkCostDetail) {
		if (newWorkCostDetail != workCostDetail) {
			NotificationChain msgs = null;
			if (workCostDetail != null)
				msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS, WorkCostDetail.class, msgs);
			if (newWorkCostDetail != null)
				msgs = ((InternalEObject)newWorkCostDetail).eInverseAdd(this, InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS, WorkCostDetail.class, msgs);
			msgs = basicSetWorkCostDetail(newWorkCostDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				if (designLocation != null)
					msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS, DesignLocation.class, msgs);
				return basicSetDesignLocation((DesignLocation)otherEnd, msgs);
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__MISC_COST_ITEMS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				if (workCostDetail != null)
					msgs = ((InternalEObject)workCostDetail).eInverseRemove(this, InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS, WorkCostDetail.class, msgs);
				return basicSetWorkCostDetail((WorkCostDetail)otherEnd, msgs);
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
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				return basicSetDesignLocation(null, msgs);
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				return basicSetWorkCostDetail(null, msgs);
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
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				if (resolve) return getDesignLocation();
				return basicGetDesignLocation();
			case InfWorkPackage.MISC_COST_ITEM__QUANTITY:
				return getQuantity();
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				return getStatus();
			case InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT:
				return getCostPerUnit();
			case InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID:
				return getExternalRefID();
			case InfWorkPackage.MISC_COST_ITEM__ACCOUNT:
				return getAccount();
			case InfWorkPackage.MISC_COST_ITEM__COST_TYPE:
				return getCostType();
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				if (resolve) return getWorkCostDetail();
				return basicGetWorkCostDetail();
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
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT:
				setCostPerUnit((Float)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID:
				setExternalRefID((String)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__ACCOUNT:
				setAccount((String)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__COST_TYPE:
				setCostType((String)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)newValue);
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
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)null);
				return;
			case InfWorkPackage.MISC_COST_ITEM__QUANTITY:
				unsetQuantity();
				return;
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT:
				unsetCostPerUnit();
				return;
			case InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID:
				unsetExternalRefID();
				return;
			case InfWorkPackage.MISC_COST_ITEM__ACCOUNT:
				unsetAccount();
				return;
			case InfWorkPackage.MISC_COST_ITEM__COST_TYPE:
				unsetCostType();
				return;
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				setWorkCostDetail((WorkCostDetail)null);
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
			case InfWorkPackage.MISC_COST_ITEM__DESIGN_LOCATION:
				return designLocation != null;
			case InfWorkPackage.MISC_COST_ITEM__QUANTITY:
				return isSetQuantity();
			case InfWorkPackage.MISC_COST_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.MISC_COST_ITEM__COST_PER_UNIT:
				return isSetCostPerUnit();
			case InfWorkPackage.MISC_COST_ITEM__EXTERNAL_REF_ID:
				return isSetExternalRefID();
			case InfWorkPackage.MISC_COST_ITEM__ACCOUNT:
				return isSetAccount();
			case InfWorkPackage.MISC_COST_ITEM__COST_TYPE:
				return isSetCostType();
			case InfWorkPackage.MISC_COST_ITEM__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.MISC_COST_ITEM__WORK_COST_DETAIL:
				return workCostDetail != null;
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
		result.append(" (quantity: ");
		if (quantityESet) result.append(quantity); else result.append("<unset>");
		result.append(", costPerUnit: ");
		if (costPerUnitESet) result.append(costPerUnit); else result.append("<unset>");
		result.append(", externalRefID: ");
		if (externalRefIDESet) result.append(externalRefID); else result.append("<unset>");
		result.append(", account: ");
		if (accountESet) result.append(account); else result.append("<unset>");
		result.append(", costType: ");
		if (costTypeESet) result.append(costType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // MiscCostItem
