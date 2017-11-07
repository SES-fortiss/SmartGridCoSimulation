/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaintenanceDataSet extends ProcedureDataSet {
	/**
	 * The default value of the '{@link #getConditionAfter() <em>Condition After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionAfter() <em>Condition After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionAfter()
	 * @generated
	 * @ordered
	 */
	protected String conditionAfter = CONDITION_AFTER_EDEFAULT;

	/**
	 * This is true if the Condition After attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionAfterESet;

	/**
	 * The default value of the '{@link #getConditionBefore() <em>Condition Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionBefore() <em>Condition Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionBefore()
	 * @generated
	 * @ordered
	 */
	protected String conditionBefore = CONDITION_BEFORE_EDEFAULT;

	/**
	 * This is true if the Condition Before attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionBeforeESet;

	/**
	 * The default value of the '{@link #getMaintCode() <em>Maint Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintCode()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintCode() <em>Maint Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintCode()
	 * @generated
	 * @ordered
	 */
	protected String maintCode = MAINT_CODE_EDEFAULT;

	/**
	 * This is true if the Maint Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maintCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenanceDataSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.MAINTENANCE_DATA_SET;
	}

	/**
	 * Returns the value of the '<em><b>Condition After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition After</em>' attribute.
	 * @see #isSetConditionAfter()
	 * @see #unsetConditionAfter()
	 * @see #setConditionAfter(String)
	 * @generated
	 */
	public String getConditionAfter() {
		return conditionAfter;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition After</em>' attribute.
	 * @see #isSetConditionAfter()
	 * @see #unsetConditionAfter()
	 * @see #getConditionAfter()
	 * @generated
	 */
	public void setConditionAfter(String newConditionAfter) {
		conditionAfter = newConditionAfter;
		conditionAfterESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionAfter()
	 * @see #getConditionAfter()
	 * @see #setConditionAfter(String)
	 * @generated
	 */
	public void unsetConditionAfter() {
		conditionAfter = CONDITION_AFTER_EDEFAULT;
		conditionAfterESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionAfter <em>Condition After</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition After</em>' attribute is set.
	 * @see #unsetConditionAfter()
	 * @see #getConditionAfter()
	 * @see #setConditionAfter(String)
	 * @generated
	 */
	public boolean isSetConditionAfter() {
		return conditionAfterESet;
	}

	/**
	 * Returns the value of the '<em><b>Condition Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Before</em>' attribute.
	 * @see #isSetConditionBefore()
	 * @see #unsetConditionBefore()
	 * @see #setConditionBefore(String)
	 * @generated
	 */
	public String getConditionBefore() {
		return conditionBefore;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Before</em>' attribute.
	 * @see #isSetConditionBefore()
	 * @see #unsetConditionBefore()
	 * @see #getConditionBefore()
	 * @generated
	 */
	public void setConditionBefore(String newConditionBefore) {
		conditionBefore = newConditionBefore;
		conditionBeforeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionBefore()
	 * @see #getConditionBefore()
	 * @see #setConditionBefore(String)
	 * @generated
	 */
	public void unsetConditionBefore() {
		conditionBefore = CONDITION_BEFORE_EDEFAULT;
		conditionBeforeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getConditionBefore <em>Condition Before</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition Before</em>' attribute is set.
	 * @see #unsetConditionBefore()
	 * @see #getConditionBefore()
	 * @see #setConditionBefore(String)
	 * @generated
	 */
	public boolean isSetConditionBefore() {
		return conditionBeforeESet;
	}

	/**
	 * Returns the value of the '<em><b>Maint Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Code</em>' attribute.
	 * @see #isSetMaintCode()
	 * @see #unsetMaintCode()
	 * @see #setMaintCode(String)
	 * @generated
	 */
	public String getMaintCode() {
		return maintCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Code</em>' attribute.
	 * @see #isSetMaintCode()
	 * @see #unsetMaintCode()
	 * @see #getMaintCode()
	 * @generated
	 */
	public void setMaintCode(String newMaintCode) {
		maintCode = newMaintCode;
		maintCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaintCode()
	 * @see #getMaintCode()
	 * @see #setMaintCode(String)
	 * @generated
	 */
	public void unsetMaintCode() {
		maintCode = MAINT_CODE_EDEFAULT;
		maintCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.MaintenanceDataSet#getMaintCode <em>Maint Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maint Code</em>' attribute is set.
	 * @see #unsetMaintCode()
	 * @see #getMaintCode()
	 * @see #setMaintCode(String)
	 * @generated
	 */
	public boolean isSetMaintCode() {
		return maintCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
				return getConditionAfter();
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
				return getConditionBefore();
			case InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
				return getMaintCode();
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
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
				setConditionAfter((String)newValue);
				return;
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
				setConditionBefore((String)newValue);
				return;
			case InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
				setMaintCode((String)newValue);
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
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
				unsetConditionAfter();
				return;
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
				unsetConditionBefore();
				return;
			case InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
				unsetMaintCode();
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
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_AFTER:
				return isSetConditionAfter();
			case InfWorkPackage.MAINTENANCE_DATA_SET__CONDITION_BEFORE:
				return isSetConditionBefore();
			case InfWorkPackage.MAINTENANCE_DATA_SET__MAINT_CODE:
				return isSetMaintCode();
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
		result.append(" (conditionAfter: ");
		if (conditionAfterESet) result.append(conditionAfter); else result.append("<unset>");
		result.append(", conditionBefore: ");
		if (conditionBeforeESet) result.append(conditionBefore); else result.append("<unset>");
		result.append(", maintCode: ");
		if (maintCodeESet) result.append(maintCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // MaintenanceDataSet
