/**
 */
package CIM15.IEC61970.Equivalents;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentInjection#isRegulationCapability <em>Regulation Capability</em>}</li>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getMaxP <em>Max P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentInjection#isRegulationStatus <em>Regulation Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}</li>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getMinP <em>Min P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentInjection extends EquivalentEquipment {
	/**
	 * The default value of the '{@link #isRegulationCapability() <em>Regulation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationCapability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGULATION_CAPABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegulationCapability() <em>Regulation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationCapability()
	 * @generated
	 * @ordered
	 */
	protected boolean regulationCapability = REGULATION_CAPABILITY_EDEFAULT;

	/**
	 * This is true if the Regulation Capability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regulationCapabilityESet;

	/**
	 * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxP()
	 * @generated
	 * @ordered
	 */
	protected float maxP = MAX_P_EDEFAULT;

	/**
	 * This is true if the Max P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxPESet;

	/**
	 * The default value of the '{@link #isRegulationStatus() <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGULATION_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegulationStatus() <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulationStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean regulationStatus = REGULATION_STATUS_EDEFAULT;

	/**
	 * This is true if the Regulation Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regulationStatusESet;

	/**
	 * The default value of the '{@link #getRegulationTarget() <em>Regulation Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationTarget()
	 * @generated
	 * @ordered
	 */
	protected static final float REGULATION_TARGET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRegulationTarget() <em>Regulation Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationTarget()
	 * @generated
	 * @ordered
	 */
	protected float regulationTarget = REGULATION_TARGET_EDEFAULT;

	/**
	 * This is true if the Regulation Target attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regulationTargetESet;

	/**
	 * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinP()
	 * @generated
	 * @ordered
	 */
	protected float minP = MIN_P_EDEFAULT;

	/**
	 * This is true if the Min P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minPESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentInjection() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquivalentsPackage.Literals.EQUIVALENT_INJECTION;
	}

	/**
	 * Returns the value of the '<em><b>Regulation Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Capability</em>' attribute.
	 * @see #isSetRegulationCapability()
	 * @see #unsetRegulationCapability()
	 * @see #setRegulationCapability(boolean)
	 * @generated
	 */
	public boolean isRegulationCapability() {
		return regulationCapability;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#isRegulationCapability <em>Regulation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Capability</em>' attribute.
	 * @see #isSetRegulationCapability()
	 * @see #unsetRegulationCapability()
	 * @see #isRegulationCapability()
	 * @generated
	 */
	public void setRegulationCapability(boolean newRegulationCapability) {
		regulationCapability = newRegulationCapability;
		regulationCapabilityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#isRegulationCapability <em>Regulation Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegulationCapability()
	 * @see #isRegulationCapability()
	 * @see #setRegulationCapability(boolean)
	 * @generated
	 */
	public void unsetRegulationCapability() {
		regulationCapability = REGULATION_CAPABILITY_EDEFAULT;
		regulationCapabilityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#isRegulationCapability <em>Regulation Capability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regulation Capability</em>' attribute is set.
	 * @see #unsetRegulationCapability()
	 * @see #isRegulationCapability()
	 * @see #setRegulationCapability(boolean)
	 * @generated
	 */
	public boolean isSetRegulationCapability() {
		return regulationCapabilityESet;
	}

	/**
	 * Returns the value of the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max P</em>' attribute.
	 * @see #isSetMaxP()
	 * @see #unsetMaxP()
	 * @see #setMaxP(float)
	 * @generated
	 */
	public float getMaxP() {
		return maxP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getMaxP <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max P</em>' attribute.
	 * @see #isSetMaxP()
	 * @see #unsetMaxP()
	 * @see #getMaxP()
	 * @generated
	 */
	public void setMaxP(float newMaxP) {
		maxP = newMaxP;
		maxPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getMaxP <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxP()
	 * @see #getMaxP()
	 * @see #setMaxP(float)
	 * @generated
	 */
	public void unsetMaxP() {
		maxP = MAX_P_EDEFAULT;
		maxPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getMaxP <em>Max P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max P</em>' attribute is set.
	 * @see #unsetMaxP()
	 * @see #getMaxP()
	 * @see #setMaxP(float)
	 * @generated
	 */
	public boolean isSetMaxP() {
		return maxPESet;
	}

	/**
	 * Returns the value of the '<em><b>Regulation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Status</em>' attribute.
	 * @see #isSetRegulationStatus()
	 * @see #unsetRegulationStatus()
	 * @see #setRegulationStatus(boolean)
	 * @generated
	 */
	public boolean isRegulationStatus() {
		return regulationStatus;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#isRegulationStatus <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Status</em>' attribute.
	 * @see #isSetRegulationStatus()
	 * @see #unsetRegulationStatus()
	 * @see #isRegulationStatus()
	 * @generated
	 */
	public void setRegulationStatus(boolean newRegulationStatus) {
		regulationStatus = newRegulationStatus;
		regulationStatusESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#isRegulationStatus <em>Regulation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegulationStatus()
	 * @see #isRegulationStatus()
	 * @see #setRegulationStatus(boolean)
	 * @generated
	 */
	public void unsetRegulationStatus() {
		regulationStatus = REGULATION_STATUS_EDEFAULT;
		regulationStatusESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#isRegulationStatus <em>Regulation Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regulation Status</em>' attribute is set.
	 * @see #unsetRegulationStatus()
	 * @see #isRegulationStatus()
	 * @see #setRegulationStatus(boolean)
	 * @generated
	 */
	public boolean isSetRegulationStatus() {
		return regulationStatusESet;
	}

	/**
	 * Returns the value of the '<em><b>Regulation Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Target</em>' attribute.
	 * @see #isSetRegulationTarget()
	 * @see #unsetRegulationTarget()
	 * @see #setRegulationTarget(float)
	 * @generated
	 */
	public float getRegulationTarget() {
		return regulationTarget;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Target</em>' attribute.
	 * @see #isSetRegulationTarget()
	 * @see #unsetRegulationTarget()
	 * @see #getRegulationTarget()
	 * @generated
	 */
	public void setRegulationTarget(float newRegulationTarget) {
		regulationTarget = newRegulationTarget;
		regulationTargetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegulationTarget()
	 * @see #getRegulationTarget()
	 * @see #setRegulationTarget(float)
	 * @generated
	 */
	public void unsetRegulationTarget() {
		regulationTarget = REGULATION_TARGET_EDEFAULT;
		regulationTargetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regulation Target</em>' attribute is set.
	 * @see #unsetRegulationTarget()
	 * @see #getRegulationTarget()
	 * @see #setRegulationTarget(float)
	 * @generated
	 */
	public boolean isSetRegulationTarget() {
		return regulationTargetESet;
	}

	/**
	 * Returns the value of the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min P</em>' attribute.
	 * @see #isSetMinP()
	 * @see #unsetMinP()
	 * @see #setMinP(float)
	 * @generated
	 */
	public float getMinP() {
		return minP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getMinP <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min P</em>' attribute.
	 * @see #isSetMinP()
	 * @see #unsetMinP()
	 * @see #getMinP()
	 * @generated
	 */
	public void setMinP(float newMinP) {
		minP = newMinP;
		minPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getMinP <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinP()
	 * @see #getMinP()
	 * @see #setMinP(float)
	 * @generated
	 */
	public void unsetMinP() {
		minP = MIN_P_EDEFAULT;
		minPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentInjection#getMinP <em>Min P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min P</em>' attribute is set.
	 * @see #unsetMinP()
	 * @see #getMinP()
	 * @see #setMinP(float)
	 * @generated
	 */
	public boolean isSetMinP() {
		return minPESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
				return isRegulationCapability();
			case EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P:
				return getMaxP();
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
				return isRegulationStatus();
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
				return getRegulationTarget();
			case EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P:
				return getMinP();
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
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
				setRegulationCapability((Boolean)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P:
				setMaxP((Float)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
				setRegulationStatus((Boolean)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
				setRegulationTarget((Float)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P:
				setMinP((Float)newValue);
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
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
				unsetRegulationCapability();
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P:
				unsetMaxP();
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
				unsetRegulationStatus();
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
				unsetRegulationTarget();
				return;
			case EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P:
				unsetMinP();
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
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
				return isSetRegulationCapability();
			case EquivalentsPackage.EQUIVALENT_INJECTION__MAX_P:
				return isSetMaxP();
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
				return isSetRegulationStatus();
			case EquivalentsPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
				return isSetRegulationTarget();
			case EquivalentsPackage.EQUIVALENT_INJECTION__MIN_P:
				return isSetMinP();
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
		result.append(" (regulationCapability: ");
		if (regulationCapabilityESet) result.append(regulationCapability); else result.append("<unset>");
		result.append(", maxP: ");
		if (maxPESet) result.append(maxP); else result.append("<unset>");
		result.append(", regulationStatus: ");
		if (regulationStatusESet) result.append(regulationStatus); else result.append("<unset>");
		result.append(", regulationTarget: ");
		if (regulationTargetESet) result.append(regulationTarget); else result.append("<unset>");
		result.append(", minP: ");
		if (minPESet) result.append(minP); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EquivalentInjection
