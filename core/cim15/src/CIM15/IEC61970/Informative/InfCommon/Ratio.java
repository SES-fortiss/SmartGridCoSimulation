/**
 */
package CIM15.IEC61970.Informative.InfCommon;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Ratio#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Ratio#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Ratio extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final float NUMERATOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected float numerator = NUMERATOR_EDEFAULT;

	/**
	 * This is true if the Numerator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeratorESet;

	/**
	 * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final float DENOMINATOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected float denominator = DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean denominatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ratio() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.RATIO;
	}

	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' attribute.
	 * @see #isSetNumerator()
	 * @see #unsetNumerator()
	 * @see #setNumerator(float)
	 * @generated
	 */
	public float getNumerator() {
		return numerator;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Ratio#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' attribute.
	 * @see #isSetNumerator()
	 * @see #unsetNumerator()
	 * @see #getNumerator()
	 * @generated
	 */
	public void setNumerator(float newNumerator) {
		numerator = newNumerator;
		numeratorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Ratio#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumerator()
	 * @see #getNumerator()
	 * @see #setNumerator(float)
	 * @generated
	 */
	public void unsetNumerator() {
		numerator = NUMERATOR_EDEFAULT;
		numeratorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Ratio#getNumerator <em>Numerator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numerator</em>' attribute is set.
	 * @see #unsetNumerator()
	 * @see #getNumerator()
	 * @see #setNumerator(float)
	 * @generated
	 */
	public boolean isSetNumerator() {
		return numeratorESet;
	}

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #isSetDenominator()
	 * @see #unsetDenominator()
	 * @see #setDenominator(float)
	 * @generated
	 */
	public float getDenominator() {
		return denominator;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Ratio#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #isSetDenominator()
	 * @see #unsetDenominator()
	 * @see #getDenominator()
	 * @generated
	 */
	public void setDenominator(float newDenominator) {
		denominator = newDenominator;
		denominatorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Ratio#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDenominator()
	 * @see #getDenominator()
	 * @see #setDenominator(float)
	 * @generated
	 */
	public void unsetDenominator() {
		denominator = DENOMINATOR_EDEFAULT;
		denominatorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Ratio#getDenominator <em>Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Denominator</em>' attribute is set.
	 * @see #unsetDenominator()
	 * @see #getDenominator()
	 * @see #setDenominator(float)
	 * @generated
	 */
	public boolean isSetDenominator() {
		return denominatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfCommonPackage.RATIO__NUMERATOR:
				return getNumerator();
			case InfCommonPackage.RATIO__DENOMINATOR:
				return getDenominator();
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
			case InfCommonPackage.RATIO__NUMERATOR:
				setNumerator((Float)newValue);
				return;
			case InfCommonPackage.RATIO__DENOMINATOR:
				setDenominator((Float)newValue);
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
			case InfCommonPackage.RATIO__NUMERATOR:
				unsetNumerator();
				return;
			case InfCommonPackage.RATIO__DENOMINATOR:
				unsetDenominator();
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
			case InfCommonPackage.RATIO__NUMERATOR:
				return isSetNumerator();
			case InfCommonPackage.RATIO__DENOMINATOR:
				return isSetDenominator();
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
		result.append(" (numerator: ");
		if (numeratorESet) result.append(numerator); else result.append("<unset>");
		result.append(", denominator: ");
		if (denominatorESet) result.append(denominator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Ratio
