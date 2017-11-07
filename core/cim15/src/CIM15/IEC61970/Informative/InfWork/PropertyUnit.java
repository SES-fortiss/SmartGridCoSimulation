/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage <em>Accounting Usage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount <em>Property Account</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems <em>CU Material Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails <em>Work Cost Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyUnit extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getAccountingUsage() <em>Accounting Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNTING_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountingUsage() <em>Accounting Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingUsage()
	 * @generated
	 * @ordered
	 */
	protected String accountingUsage = ACCOUNTING_USAGE_EDEFAULT;

	/**
	 * This is true if the Accounting Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accountingUsageESet;

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
	 * The default value of the '{@link #getPropertyAccount() <em>Property Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyAccount() <em>Property Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAccount()
	 * @generated
	 * @ordered
	 */
	protected String propertyAccount = PROPERTY_ACCOUNT_EDEFAULT;

	/**
	 * This is true if the Property Account attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyAccountESet;

	/**
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * The default value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected static final WorkActionKind ACTIVITY_CODE_EDEFAULT = WorkActionKind.INSTALL;

	/**
	 * The cached value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected WorkActionKind activityCode = ACTIVITY_CODE_EDEFAULT;

	/**
	 * This is true if the Activity Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activityCodeESet;

	/**
	 * The cached value of the '{@link #getCUMaterialItems() <em>CU Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUMaterialItem> cuMaterialItems;

	/**
	 * The cached value of the '{@link #getWorkCostDetails() <em>Work Cost Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCostDetail> workCostDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.PROPERTY_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>Accounting Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounting Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Usage</em>' attribute.
	 * @see #isSetAccountingUsage()
	 * @see #unsetAccountingUsage()
	 * @see #setAccountingUsage(String)
	 * @generated
	 */
	public String getAccountingUsage() {
		return accountingUsage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage <em>Accounting Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Usage</em>' attribute.
	 * @see #isSetAccountingUsage()
	 * @see #unsetAccountingUsage()
	 * @see #getAccountingUsage()
	 * @generated
	 */
	public void setAccountingUsage(String newAccountingUsage) {
		accountingUsage = newAccountingUsage;
		accountingUsageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage <em>Accounting Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccountingUsage()
	 * @see #getAccountingUsage()
	 * @see #setAccountingUsage(String)
	 * @generated
	 */
	public void unsetAccountingUsage() {
		accountingUsage = ACCOUNTING_USAGE_EDEFAULT;
		accountingUsageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getAccountingUsage <em>Accounting Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accounting Usage</em>' attribute is set.
	 * @see #unsetAccountingUsage()
	 * @see #getAccountingUsage()
	 * @see #setAccountingUsage(String)
	 * @generated
	 */
	public boolean isSetAccountingUsage() {
		return accountingUsageESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.PROPERTY_UNIT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.PROPERTY_UNIT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Property Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Account</em>' attribute.
	 * @see #isSetPropertyAccount()
	 * @see #unsetPropertyAccount()
	 * @see #setPropertyAccount(String)
	 * @generated
	 */
	public String getPropertyAccount() {
		return propertyAccount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount <em>Property Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Account</em>' attribute.
	 * @see #isSetPropertyAccount()
	 * @see #unsetPropertyAccount()
	 * @see #getPropertyAccount()
	 * @generated
	 */
	public void setPropertyAccount(String newPropertyAccount) {
		propertyAccount = newPropertyAccount;
		propertyAccountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount <em>Property Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyAccount()
	 * @see #getPropertyAccount()
	 * @see #setPropertyAccount(String)
	 * @generated
	 */
	public void unsetPropertyAccount() {
		propertyAccount = PROPERTY_ACCOUNT_EDEFAULT;
		propertyAccountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getPropertyAccount <em>Property Account</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Account</em>' attribute is set.
	 * @see #unsetPropertyAccount()
	 * @see #getPropertyAccount()
	 * @see #setPropertyAccount(String)
	 * @generated
	 */
	public boolean isSetPropertyAccount() {
		return propertyAccountESet;
	}

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new BasicInternalEList<CompatibleUnit>(CompatibleUnit.class);
		}
		return compatibleUnits;
	}

	/**
	 * Returns the value of the '<em><b>Activity Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfWork.WorkActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Code</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkActionKind
	 * @see #isSetActivityCode()
	 * @see #unsetActivityCode()
	 * @see #setActivityCode(WorkActionKind)
	 * @generated
	 */
	public WorkActionKind getActivityCode() {
		return activityCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Code</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkActionKind
	 * @see #isSetActivityCode()
	 * @see #unsetActivityCode()
	 * @see #getActivityCode()
	 * @generated
	 */
	public void setActivityCode(WorkActionKind newActivityCode) {
		activityCode = newActivityCode == null ? ACTIVITY_CODE_EDEFAULT : newActivityCode;
		activityCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivityCode()
	 * @see #getActivityCode()
	 * @see #setActivityCode(WorkActionKind)
	 * @generated
	 */
	public void unsetActivityCode() {
		activityCode = ACTIVITY_CODE_EDEFAULT;
		activityCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getActivityCode <em>Activity Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activity Code</em>' attribute is set.
	 * @see #unsetActivityCode()
	 * @see #getActivityCode()
	 * @see #setActivityCode(WorkActionKind)
	 * @generated
	 */
	public boolean isSetActivityCode() {
		return activityCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>CU Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits <em>Property Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Material Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits
	 * @generated
	 */
	public EList<CUMaterialItem> getCUMaterialItems() {
		if (cuMaterialItems == null) {
			cuMaterialItems = new BasicInternalEList<CUMaterialItem>(CUMaterialItem.class);
		}
		return cuMaterialItems;
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits <em>Property Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new BasicInternalEList<WorkCostDetail>(WorkCostDetail.class);
		}
		return workCostDetails;
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
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				return ((InternalEList<?>)getCUMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE:
				return getAccountingUsage();
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				return getStatus();
			case InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT:
				return getPropertyAccount();
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE:
				return getActivityCode();
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				return getCUMaterialItems();
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				return getWorkCostDetails();
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
			case InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE:
				setAccountingUsage((String)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT:
				setPropertyAccount((String)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE:
				setActivityCode((WorkActionKind)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				getCUMaterialItems().addAll((Collection<? extends CUMaterialItem>)newValue);
				return;
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
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
			case InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE:
				unsetAccountingUsage();
				return;
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT:
				unsetPropertyAccount();
				return;
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE:
				unsetActivityCode();
				return;
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				return;
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
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
			case InfWorkPackage.PROPERTY_UNIT__ACCOUNTING_USAGE:
				return isSetAccountingUsage();
			case InfWorkPackage.PROPERTY_UNIT__STATUS:
				return status != null;
			case InfWorkPackage.PROPERTY_UNIT__PROPERTY_ACCOUNT:
				return isSetPropertyAccount();
			case InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.PROPERTY_UNIT__ACTIVITY_CODE:
				return isSetActivityCode();
			case InfWorkPackage.PROPERTY_UNIT__CU_MATERIAL_ITEMS:
				return cuMaterialItems != null && !cuMaterialItems.isEmpty();
			case InfWorkPackage.PROPERTY_UNIT__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
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
		result.append(" (accountingUsage: ");
		if (accountingUsageESet) result.append(accountingUsage); else result.append("<unset>");
		result.append(", propertyAccount: ");
		if (propertyAccountESet) result.append(propertyAccount); else result.append("<unset>");
		result.append(", activityCode: ");
		if (activityCodeESet) result.append(activityCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PropertyUnit
