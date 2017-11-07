/**
 */
package CIM15.IEC61968.PaymentMetering;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Due</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Due#getInterest <em>Interest</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Due#getCharges <em>Charges</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Due#getPrinciple <em>Principle</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Due#getCurrent <em>Current</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Due#getArrears <em>Arrears</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Due extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getInterest() <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterest()
	 * @generated
	 * @ordered
	 */
	protected static final float INTEREST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInterest() <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterest()
	 * @generated
	 * @ordered
	 */
	protected float interest = INTEREST_EDEFAULT;

	/**
	 * This is true if the Interest attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interestESet;

	/**
	 * The default value of the '{@link #getCharges() <em>Charges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected static final float CHARGES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCharges() <em>Charges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected float charges = CHARGES_EDEFAULT;

	/**
	 * This is true if the Charges attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargesESet;

	/**
	 * The default value of the '{@link #getPrinciple() <em>Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinciple()
	 * @generated
	 * @ordered
	 */
	protected static final float PRINCIPLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrinciple() <em>Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinciple()
	 * @generated
	 * @ordered
	 */
	protected float principle = PRINCIPLE_EDEFAULT;

	/**
	 * This is true if the Principle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean principleESet;

	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected float current = CURRENT_EDEFAULT;

	/**
	 * This is true if the Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentESet;

	/**
	 * The default value of the '{@link #getArrears() <em>Arrears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrears()
	 * @generated
	 * @ordered
	 */
	protected static final float ARREARS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArrears() <em>Arrears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrears()
	 * @generated
	 * @ordered
	 */
	protected float arrears = ARREARS_EDEFAULT;

	/**
	 * This is true if the Arrears attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arrearsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Due() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.DUE;
	}

	/**
	 * Returns the value of the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interest</em>' attribute.
	 * @see #isSetInterest()
	 * @see #unsetInterest()
	 * @see #setInterest(float)
	 * @generated
	 */
	public float getInterest() {
		return interest;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getInterest <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interest</em>' attribute.
	 * @see #isSetInterest()
	 * @see #unsetInterest()
	 * @see #getInterest()
	 * @generated
	 */
	public void setInterest(float newInterest) {
		interest = newInterest;
		interestESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getInterest <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterest()
	 * @see #getInterest()
	 * @see #setInterest(float)
	 * @generated
	 */
	public void unsetInterest() {
		interest = INTEREST_EDEFAULT;
		interestESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getInterest <em>Interest</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interest</em>' attribute is set.
	 * @see #unsetInterest()
	 * @see #getInterest()
	 * @see #setInterest(float)
	 * @generated
	 */
	public boolean isSetInterest() {
		return interestESet;
	}

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' attribute.
	 * @see #isSetCharges()
	 * @see #unsetCharges()
	 * @see #setCharges(float)
	 * @generated
	 */
	public float getCharges() {
		return charges;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getCharges <em>Charges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charges</em>' attribute.
	 * @see #isSetCharges()
	 * @see #unsetCharges()
	 * @see #getCharges()
	 * @generated
	 */
	public void setCharges(float newCharges) {
		charges = newCharges;
		chargesESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getCharges <em>Charges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCharges()
	 * @see #getCharges()
	 * @see #setCharges(float)
	 * @generated
	 */
	public void unsetCharges() {
		charges = CHARGES_EDEFAULT;
		chargesESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getCharges <em>Charges</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charges</em>' attribute is set.
	 * @see #unsetCharges()
	 * @see #getCharges()
	 * @see #setCharges(float)
	 * @generated
	 */
	public boolean isSetCharges() {
		return chargesESet;
	}

	/**
	 * Returns the value of the '<em><b>Principle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principle</em>' attribute.
	 * @see #isSetPrinciple()
	 * @see #unsetPrinciple()
	 * @see #setPrinciple(float)
	 * @generated
	 */
	public float getPrinciple() {
		return principle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getPrinciple <em>Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principle</em>' attribute.
	 * @see #isSetPrinciple()
	 * @see #unsetPrinciple()
	 * @see #getPrinciple()
	 * @generated
	 */
	public void setPrinciple(float newPrinciple) {
		principle = newPrinciple;
		principleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getPrinciple <em>Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrinciple()
	 * @see #getPrinciple()
	 * @see #setPrinciple(float)
	 * @generated
	 */
	public void unsetPrinciple() {
		principle = PRINCIPLE_EDEFAULT;
		principleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getPrinciple <em>Principle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Principle</em>' attribute is set.
	 * @see #unsetPrinciple()
	 * @see #getPrinciple()
	 * @see #setPrinciple(float)
	 * @generated
	 */
	public boolean isSetPrinciple() {
		return principleESet;
	}

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #isSetCurrent()
	 * @see #unsetCurrent()
	 * @see #setCurrent(float)
	 * @generated
	 */
	public float getCurrent() {
		return current;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isSetCurrent()
	 * @see #unsetCurrent()
	 * @see #getCurrent()
	 * @generated
	 */
	public void setCurrent(float newCurrent) {
		current = newCurrent;
		currentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrent()
	 * @see #getCurrent()
	 * @see #setCurrent(float)
	 * @generated
	 */
	public void unsetCurrent() {
		current = CURRENT_EDEFAULT;
		currentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getCurrent <em>Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current</em>' attribute is set.
	 * @see #unsetCurrent()
	 * @see #getCurrent()
	 * @see #setCurrent(float)
	 * @generated
	 */
	public boolean isSetCurrent() {
		return currentESet;
	}

	/**
	 * Returns the value of the '<em><b>Arrears</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrears</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrears</em>' attribute.
	 * @see #isSetArrears()
	 * @see #unsetArrears()
	 * @see #setArrears(float)
	 * @generated
	 */
	public float getArrears() {
		return arrears;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getArrears <em>Arrears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrears</em>' attribute.
	 * @see #isSetArrears()
	 * @see #unsetArrears()
	 * @see #getArrears()
	 * @generated
	 */
	public void setArrears(float newArrears) {
		arrears = newArrears;
		arrearsESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getArrears <em>Arrears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrears()
	 * @see #getArrears()
	 * @see #setArrears(float)
	 * @generated
	 */
	public void unsetArrears() {
		arrears = ARREARS_EDEFAULT;
		arrearsESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.Due#getArrears <em>Arrears</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arrears</em>' attribute is set.
	 * @see #unsetArrears()
	 * @see #getArrears()
	 * @see #setArrears(float)
	 * @generated
	 */
	public boolean isSetArrears() {
		return arrearsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.DUE__INTEREST:
				return getInterest();
			case PaymentMeteringPackage.DUE__CHARGES:
				return getCharges();
			case PaymentMeteringPackage.DUE__PRINCIPLE:
				return getPrinciple();
			case PaymentMeteringPackage.DUE__CURRENT:
				return getCurrent();
			case PaymentMeteringPackage.DUE__ARREARS:
				return getArrears();
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
			case PaymentMeteringPackage.DUE__INTEREST:
				setInterest((Float)newValue);
				return;
			case PaymentMeteringPackage.DUE__CHARGES:
				setCharges((Float)newValue);
				return;
			case PaymentMeteringPackage.DUE__PRINCIPLE:
				setPrinciple((Float)newValue);
				return;
			case PaymentMeteringPackage.DUE__CURRENT:
				setCurrent((Float)newValue);
				return;
			case PaymentMeteringPackage.DUE__ARREARS:
				setArrears((Float)newValue);
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
			case PaymentMeteringPackage.DUE__INTEREST:
				unsetInterest();
				return;
			case PaymentMeteringPackage.DUE__CHARGES:
				unsetCharges();
				return;
			case PaymentMeteringPackage.DUE__PRINCIPLE:
				unsetPrinciple();
				return;
			case PaymentMeteringPackage.DUE__CURRENT:
				unsetCurrent();
				return;
			case PaymentMeteringPackage.DUE__ARREARS:
				unsetArrears();
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
			case PaymentMeteringPackage.DUE__INTEREST:
				return isSetInterest();
			case PaymentMeteringPackage.DUE__CHARGES:
				return isSetCharges();
			case PaymentMeteringPackage.DUE__PRINCIPLE:
				return isSetPrinciple();
			case PaymentMeteringPackage.DUE__CURRENT:
				return isSetCurrent();
			case PaymentMeteringPackage.DUE__ARREARS:
				return isSetArrears();
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
		result.append(" (interest: ");
		if (interestESet) result.append(interest); else result.append("<unset>");
		result.append(", charges: ");
		if (chargesESet) result.append(charges); else result.append("<unset>");
		result.append(", principle: ");
		if (principleESet) result.append(principle); else result.append("<unset>");
		result.append(", current: ");
		if (currentESet) result.append(current); else result.append("<unset>");
		result.append(", arrears: ");
		if (arrearsESet) result.append(arrears); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Due
