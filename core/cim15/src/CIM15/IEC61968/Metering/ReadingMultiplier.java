/**
 */
package CIM15.IEC61968.Metering;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Multiplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingMultiplier#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingMultiplier#isIsApplied <em>Is Applied</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadingMultiplier extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #isIsApplied() <em>Is Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsApplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_APPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsApplied() <em>Is Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsApplied()
	 * @generated
	 * @ordered
	 */
	protected boolean isApplied = IS_APPLIED_EDEFAULT;

	/**
	 * This is true if the Is Applied attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAppliedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingMultiplier() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.READING_MULTIPLIER;
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingMultiplier#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(float newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingMultiplier#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingMultiplier#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Applied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Applied</em>' attribute.
	 * @see #isSetIsApplied()
	 * @see #unsetIsApplied()
	 * @see #setIsApplied(boolean)
	 * @generated
	 */
	public boolean isIsApplied() {
		return isApplied;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingMultiplier#isIsApplied <em>Is Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Applied</em>' attribute.
	 * @see #isSetIsApplied()
	 * @see #unsetIsApplied()
	 * @see #isIsApplied()
	 * @generated
	 */
	public void setIsApplied(boolean newIsApplied) {
		isApplied = newIsApplied;
		isAppliedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingMultiplier#isIsApplied <em>Is Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsApplied()
	 * @see #isIsApplied()
	 * @see #setIsApplied(boolean)
	 * @generated
	 */
	public void unsetIsApplied() {
		isApplied = IS_APPLIED_EDEFAULT;
		isAppliedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingMultiplier#isIsApplied <em>Is Applied</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Applied</em>' attribute is set.
	 * @see #unsetIsApplied()
	 * @see #isIsApplied()
	 * @see #setIsApplied(boolean)
	 * @generated
	 */
	public boolean isSetIsApplied() {
		return isAppliedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeteringPackage.READING_MULTIPLIER__VALUE:
				return getValue();
			case MeteringPackage.READING_MULTIPLIER__IS_APPLIED:
				return isIsApplied();
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
			case MeteringPackage.READING_MULTIPLIER__VALUE:
				setValue((Float)newValue);
				return;
			case MeteringPackage.READING_MULTIPLIER__IS_APPLIED:
				setIsApplied((Boolean)newValue);
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
			case MeteringPackage.READING_MULTIPLIER__VALUE:
				unsetValue();
				return;
			case MeteringPackage.READING_MULTIPLIER__IS_APPLIED:
				unsetIsApplied();
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
			case MeteringPackage.READING_MULTIPLIER__VALUE:
				return isSetValue();
			case MeteringPackage.READING_MULTIPLIER__IS_APPLIED:
				return isSetIsApplied();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", isApplied: ");
		if (isAppliedESet) result.append(isApplied); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ReadingMultiplier
