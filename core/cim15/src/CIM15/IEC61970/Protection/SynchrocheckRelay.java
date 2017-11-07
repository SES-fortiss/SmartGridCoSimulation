/**
 */
package CIM15.IEC61970.Protection;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchrocheck Relay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchrocheckRelay extends ProtectionEquipment {
	/**
	 * The default value of the '{@link #getMaxFreqDiff() <em>Max Freq Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFreqDiff()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_FREQ_DIFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxFreqDiff() <em>Max Freq Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFreqDiff()
	 * @generated
	 * @ordered
	 */
	protected float maxFreqDiff = MAX_FREQ_DIFF_EDEFAULT;

	/**
	 * This is true if the Max Freq Diff attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxFreqDiffESet;

	/**
	 * The default value of the '{@link #getMaxAngleDiff() <em>Max Angle Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAngleDiff()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ANGLE_DIFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxAngleDiff() <em>Max Angle Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAngleDiff()
	 * @generated
	 * @ordered
	 */
	protected float maxAngleDiff = MAX_ANGLE_DIFF_EDEFAULT;

	/**
	 * This is true if the Max Angle Diff attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxAngleDiffESet;

	/**
	 * The default value of the '{@link #getMaxVoltDiff() <em>Max Volt Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltDiff()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VOLT_DIFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxVoltDiff() <em>Max Volt Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltDiff()
	 * @generated
	 * @ordered
	 */
	protected float maxVoltDiff = MAX_VOLT_DIFF_EDEFAULT;

	/**
	 * This is true if the Max Volt Diff attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxVoltDiffESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchrocheckRelay() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtectionPackage.Literals.SYNCHROCHECK_RELAY;
	}

	/**
	 * Returns the value of the '<em><b>Max Freq Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Freq Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Freq Diff</em>' attribute.
	 * @see #isSetMaxFreqDiff()
	 * @see #unsetMaxFreqDiff()
	 * @see #setMaxFreqDiff(float)
	 * @generated
	 */
	public float getMaxFreqDiff() {
		return maxFreqDiff;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Freq Diff</em>' attribute.
	 * @see #isSetMaxFreqDiff()
	 * @see #unsetMaxFreqDiff()
	 * @see #getMaxFreqDiff()
	 * @generated
	 */
	public void setMaxFreqDiff(float newMaxFreqDiff) {
		maxFreqDiff = newMaxFreqDiff;
		maxFreqDiffESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxFreqDiff()
	 * @see #getMaxFreqDiff()
	 * @see #setMaxFreqDiff(float)
	 * @generated
	 */
	public void unsetMaxFreqDiff() {
		maxFreqDiff = MAX_FREQ_DIFF_EDEFAULT;
		maxFreqDiffESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxFreqDiff <em>Max Freq Diff</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Freq Diff</em>' attribute is set.
	 * @see #unsetMaxFreqDiff()
	 * @see #getMaxFreqDiff()
	 * @see #setMaxFreqDiff(float)
	 * @generated
	 */
	public boolean isSetMaxFreqDiff() {
		return maxFreqDiffESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Angle Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Angle Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Angle Diff</em>' attribute.
	 * @see #isSetMaxAngleDiff()
	 * @see #unsetMaxAngleDiff()
	 * @see #setMaxAngleDiff(float)
	 * @generated
	 */
	public float getMaxAngleDiff() {
		return maxAngleDiff;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Angle Diff</em>' attribute.
	 * @see #isSetMaxAngleDiff()
	 * @see #unsetMaxAngleDiff()
	 * @see #getMaxAngleDiff()
	 * @generated
	 */
	public void setMaxAngleDiff(float newMaxAngleDiff) {
		maxAngleDiff = newMaxAngleDiff;
		maxAngleDiffESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAngleDiff()
	 * @see #getMaxAngleDiff()
	 * @see #setMaxAngleDiff(float)
	 * @generated
	 */
	public void unsetMaxAngleDiff() {
		maxAngleDiff = MAX_ANGLE_DIFF_EDEFAULT;
		maxAngleDiffESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxAngleDiff <em>Max Angle Diff</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Angle Diff</em>' attribute is set.
	 * @see #unsetMaxAngleDiff()
	 * @see #getMaxAngleDiff()
	 * @see #setMaxAngleDiff(float)
	 * @generated
	 */
	public boolean isSetMaxAngleDiff() {
		return maxAngleDiffESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Volt Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Volt Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Volt Diff</em>' attribute.
	 * @see #isSetMaxVoltDiff()
	 * @see #unsetMaxVoltDiff()
	 * @see #setMaxVoltDiff(float)
	 * @generated
	 */
	public float getMaxVoltDiff() {
		return maxVoltDiff;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Volt Diff</em>' attribute.
	 * @see #isSetMaxVoltDiff()
	 * @see #unsetMaxVoltDiff()
	 * @see #getMaxVoltDiff()
	 * @generated
	 */
	public void setMaxVoltDiff(float newMaxVoltDiff) {
		maxVoltDiff = newMaxVoltDiff;
		maxVoltDiffESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxVoltDiff()
	 * @see #getMaxVoltDiff()
	 * @see #setMaxVoltDiff(float)
	 * @generated
	 */
	public void unsetMaxVoltDiff() {
		maxVoltDiff = MAX_VOLT_DIFF_EDEFAULT;
		maxVoltDiffESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.SynchrocheckRelay#getMaxVoltDiff <em>Max Volt Diff</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Volt Diff</em>' attribute is set.
	 * @see #unsetMaxVoltDiff()
	 * @see #getMaxVoltDiff()
	 * @see #setMaxVoltDiff(float)
	 * @generated
	 */
	public boolean isSetMaxVoltDiff() {
		return maxVoltDiffESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
				return getMaxFreqDiff();
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
				return getMaxAngleDiff();
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
				return getMaxVoltDiff();
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
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
				setMaxFreqDiff((Float)newValue);
				return;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
				setMaxAngleDiff((Float)newValue);
				return;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
				setMaxVoltDiff((Float)newValue);
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
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
				unsetMaxFreqDiff();
				return;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
				unsetMaxAngleDiff();
				return;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
				unsetMaxVoltDiff();
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
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
				return isSetMaxFreqDiff();
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
				return isSetMaxAngleDiff();
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
				return isSetMaxVoltDiff();
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
		result.append(" (maxFreqDiff: ");
		if (maxFreqDiffESet) result.append(maxFreqDiff); else result.append("<unset>");
		result.append(", maxAngleDiff: ");
		if (maxAngleDiffESet) result.append(maxAngleDiff); else result.append("<unset>");
		result.append(", maxVoltDiff: ");
		if (maxVoltDiffESet) result.append(maxVoltDiff); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SynchrocheckRelay
