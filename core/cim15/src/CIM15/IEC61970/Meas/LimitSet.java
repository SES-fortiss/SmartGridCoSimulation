/**
 */
package CIM15.IEC61970.Meas;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LimitSet extends IdentifiedObject {
	/**
	 * The default value of the '{@link #isIsPercentageLimits() <em>Is Percentage Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPercentageLimits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERCENTAGE_LIMITS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPercentageLimits() <em>Is Percentage Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPercentageLimits()
	 * @generated
	 * @ordered
	 */
	protected boolean isPercentageLimits = IS_PERCENTAGE_LIMITS_EDEFAULT;

	/**
	 * This is true if the Is Percentage Limits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPercentageLimitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.LIMIT_SET;
	}

	/**
	 * Returns the value of the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Percentage Limits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Percentage Limits</em>' attribute.
	 * @see #isSetIsPercentageLimits()
	 * @see #unsetIsPercentageLimits()
	 * @see #setIsPercentageLimits(boolean)
	 * @generated
	 */
	public boolean isIsPercentageLimits() {
		return isPercentageLimits;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Percentage Limits</em>' attribute.
	 * @see #isSetIsPercentageLimits()
	 * @see #unsetIsPercentageLimits()
	 * @see #isIsPercentageLimits()
	 * @generated
	 */
	public void setIsPercentageLimits(boolean newIsPercentageLimits) {
		isPercentageLimits = newIsPercentageLimits;
		isPercentageLimitsESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPercentageLimits()
	 * @see #isIsPercentageLimits()
	 * @see #setIsPercentageLimits(boolean)
	 * @generated
	 */
	public void unsetIsPercentageLimits() {
		isPercentageLimits = IS_PERCENTAGE_LIMITS_EDEFAULT;
		isPercentageLimitsESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Percentage Limits</em>' attribute is set.
	 * @see #unsetIsPercentageLimits()
	 * @see #isIsPercentageLimits()
	 * @see #setIsPercentageLimits(boolean)
	 * @generated
	 */
	public boolean isSetIsPercentageLimits() {
		return isPercentageLimitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
				return isIsPercentageLimits();
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
			case MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
				setIsPercentageLimits((Boolean)newValue);
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
			case MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
				unsetIsPercentageLimits();
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
			case MeasPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
				return isSetIsPercentageLimits();
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
		result.append(" (isPercentageLimits: ");
		if (isPercentageLimitsESet) result.append(isPercentageLimits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LimitSet
