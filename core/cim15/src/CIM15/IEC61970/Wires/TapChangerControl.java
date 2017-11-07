/**
 */
package CIM15.IEC61970.Wires;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tap Changer Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropR <em>Line Drop R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropX <em>Line Drop X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChangerControl#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChangerControl#isLineDropCompensation <em>Line Drop Compensation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TapChangerControl extends RegulatingControl {
	/**
	 * The default value of the '{@link #getLineDropR() <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDropR()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_DROP_R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineDropR() <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDropR()
	 * @generated
	 * @ordered
	 */
	protected float lineDropR = LINE_DROP_R_EDEFAULT;

	/**
	 * This is true if the Line Drop R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineDropRESet;

	/**
	 * The default value of the '{@link #getLineDropX() <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDropX()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_DROP_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineDropX() <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDropX()
	 * @generated
	 * @ordered
	 */
	protected float lineDropX = LINE_DROP_X_EDEFAULT;

	/**
	 * This is true if the Line Drop X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineDropXESet;

	/**
	 * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChanger()
	 * @generated
	 * @ordered
	 */
	protected EList<TapChanger> tapChanger;

	/**
	 * The default value of the '{@link #getReverseLineDropX() <em>Reverse Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLineDropX()
	 * @generated
	 * @ordered
	 */
	protected static final float REVERSE_LINE_DROP_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReverseLineDropX() <em>Reverse Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLineDropX()
	 * @generated
	 * @ordered
	 */
	protected float reverseLineDropX = REVERSE_LINE_DROP_X_EDEFAULT;

	/**
	 * This is true if the Reverse Line Drop X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reverseLineDropXESet;

	/**
	 * The default value of the '{@link #getReverseLineDropR() <em>Reverse Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLineDropR()
	 * @generated
	 * @ordered
	 */
	protected static final float REVERSE_LINE_DROP_R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReverseLineDropR() <em>Reverse Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseLineDropR()
	 * @generated
	 * @ordered
	 */
	protected float reverseLineDropR = REVERSE_LINE_DROP_R_EDEFAULT;

	/**
	 * This is true if the Reverse Line Drop R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reverseLineDropRESet;

	/**
	 * The default value of the '{@link #isLineDropCompensation() <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLineDropCompensation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LINE_DROP_COMPENSATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLineDropCompensation() <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLineDropCompensation()
	 * @generated
	 * @ordered
	 */
	protected boolean lineDropCompensation = LINE_DROP_COMPENSATION_EDEFAULT;

	/**
	 * This is true if the Line Drop Compensation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineDropCompensationESet;

	/**
	 * The default value of the '{@link #getLimitVoltage() <em>Limit Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float LIMIT_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLimitVoltage() <em>Limit Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitVoltage()
	 * @generated
	 * @ordered
	 */
	protected float limitVoltage = LIMIT_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Limit Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean limitVoltageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapChangerControl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TAP_CHANGER_CONTROL;
	}

	/**
	 * Returns the value of the '<em><b>Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Drop R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Drop R</em>' attribute.
	 * @see #isSetLineDropR()
	 * @see #unsetLineDropR()
	 * @see #setLineDropR(float)
	 * @generated
	 */
	public float getLineDropR() {
		return lineDropR;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropR <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop R</em>' attribute.
	 * @see #isSetLineDropR()
	 * @see #unsetLineDropR()
	 * @see #getLineDropR()
	 * @generated
	 */
	public void setLineDropR(float newLineDropR) {
		lineDropR = newLineDropR;
		lineDropRESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropR <em>Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineDropR()
	 * @see #getLineDropR()
	 * @see #setLineDropR(float)
	 * @generated
	 */
	public void unsetLineDropR() {
		lineDropR = LINE_DROP_R_EDEFAULT;
		lineDropRESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropR <em>Line Drop R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Drop R</em>' attribute is set.
	 * @see #unsetLineDropR()
	 * @see #getLineDropR()
	 * @see #setLineDropR(float)
	 * @generated
	 */
	public boolean isSetLineDropR() {
		return lineDropRESet;
	}

	/**
	 * Returns the value of the '<em><b>Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Drop X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Drop X</em>' attribute.
	 * @see #isSetLineDropX()
	 * @see #unsetLineDropX()
	 * @see #setLineDropX(float)
	 * @generated
	 */
	public float getLineDropX() {
		return lineDropX;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropX <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop X</em>' attribute.
	 * @see #isSetLineDropX()
	 * @see #unsetLineDropX()
	 * @see #getLineDropX()
	 * @generated
	 */
	public void setLineDropX(float newLineDropX) {
		lineDropX = newLineDropX;
		lineDropXESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropX <em>Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineDropX()
	 * @see #getLineDropX()
	 * @see #setLineDropX(float)
	 * @generated
	 */
	public void unsetLineDropX() {
		lineDropX = LINE_DROP_X_EDEFAULT;
		lineDropXESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLineDropX <em>Line Drop X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Drop X</em>' attribute is set.
	 * @see #unsetLineDropX()
	 * @see #getLineDropX()
	 * @see #setLineDropX(float)
	 * @generated
	 */
	public boolean isSetLineDropX() {
		return lineDropXESet;
	}

	/**
	 * Returns the value of the '<em><b>Tap Changer</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TapChanger}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TapChanger#getTapChangerControl <em>Tap Changer Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TapChanger#getTapChangerControl
	 * @generated
	 */
	public EList<TapChanger> getTapChanger() {
		if (tapChanger == null) {
			tapChanger = new BasicInternalEList<TapChanger>(TapChanger.class);
		}
		return tapChanger;
	}

	/**
	 * Returns the value of the '<em><b>Reverse Line Drop X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Line Drop X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Line Drop X</em>' attribute.
	 * @see #isSetReverseLineDropX()
	 * @see #unsetReverseLineDropX()
	 * @see #setReverseLineDropX(float)
	 * @generated
	 */
	public float getReverseLineDropX() {
		return reverseLineDropX;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Line Drop X</em>' attribute.
	 * @see #isSetReverseLineDropX()
	 * @see #unsetReverseLineDropX()
	 * @see #getReverseLineDropX()
	 * @generated
	 */
	public void setReverseLineDropX(float newReverseLineDropX) {
		reverseLineDropX = newReverseLineDropX;
		reverseLineDropXESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReverseLineDropX()
	 * @see #getReverseLineDropX()
	 * @see #setReverseLineDropX(float)
	 * @generated
	 */
	public void unsetReverseLineDropX() {
		reverseLineDropX = REVERSE_LINE_DROP_X_EDEFAULT;
		reverseLineDropXESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropX <em>Reverse Line Drop X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reverse Line Drop X</em>' attribute is set.
	 * @see #unsetReverseLineDropX()
	 * @see #getReverseLineDropX()
	 * @see #setReverseLineDropX(float)
	 * @generated
	 */
	public boolean isSetReverseLineDropX() {
		return reverseLineDropXESet;
	}

	/**
	 * Returns the value of the '<em><b>Reverse Line Drop R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Line Drop R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Line Drop R</em>' attribute.
	 * @see #isSetReverseLineDropR()
	 * @see #unsetReverseLineDropR()
	 * @see #setReverseLineDropR(float)
	 * @generated
	 */
	public float getReverseLineDropR() {
		return reverseLineDropR;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Line Drop R</em>' attribute.
	 * @see #isSetReverseLineDropR()
	 * @see #unsetReverseLineDropR()
	 * @see #getReverseLineDropR()
	 * @generated
	 */
	public void setReverseLineDropR(float newReverseLineDropR) {
		reverseLineDropR = newReverseLineDropR;
		reverseLineDropRESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReverseLineDropR()
	 * @see #getReverseLineDropR()
	 * @see #setReverseLineDropR(float)
	 * @generated
	 */
	public void unsetReverseLineDropR() {
		reverseLineDropR = REVERSE_LINE_DROP_R_EDEFAULT;
		reverseLineDropRESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getReverseLineDropR <em>Reverse Line Drop R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reverse Line Drop R</em>' attribute is set.
	 * @see #unsetReverseLineDropR()
	 * @see #getReverseLineDropR()
	 * @see #setReverseLineDropR(float)
	 * @generated
	 */
	public boolean isSetReverseLineDropR() {
		return reverseLineDropRESet;
	}

	/**
	 * Returns the value of the '<em><b>Line Drop Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Drop Compensation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Drop Compensation</em>' attribute.
	 * @see #isSetLineDropCompensation()
	 * @see #unsetLineDropCompensation()
	 * @see #setLineDropCompensation(boolean)
	 * @generated
	 */
	public boolean isLineDropCompensation() {
		return lineDropCompensation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#isLineDropCompensation <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Drop Compensation</em>' attribute.
	 * @see #isSetLineDropCompensation()
	 * @see #unsetLineDropCompensation()
	 * @see #isLineDropCompensation()
	 * @generated
	 */
	public void setLineDropCompensation(boolean newLineDropCompensation) {
		lineDropCompensation = newLineDropCompensation;
		lineDropCompensationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#isLineDropCompensation <em>Line Drop Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineDropCompensation()
	 * @see #isLineDropCompensation()
	 * @see #setLineDropCompensation(boolean)
	 * @generated
	 */
	public void unsetLineDropCompensation() {
		lineDropCompensation = LINE_DROP_COMPENSATION_EDEFAULT;
		lineDropCompensationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#isLineDropCompensation <em>Line Drop Compensation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Drop Compensation</em>' attribute is set.
	 * @see #unsetLineDropCompensation()
	 * @see #isLineDropCompensation()
	 * @see #setLineDropCompensation(boolean)
	 * @generated
	 */
	public boolean isSetLineDropCompensation() {
		return lineDropCompensationESet;
	}

	/**
	 * Returns the value of the '<em><b>Limit Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Voltage</em>' attribute.
	 * @see #isSetLimitVoltage()
	 * @see #unsetLimitVoltage()
	 * @see #setLimitVoltage(float)
	 * @generated
	 */
	public float getLimitVoltage() {
		return limitVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Voltage</em>' attribute.
	 * @see #isSetLimitVoltage()
	 * @see #unsetLimitVoltage()
	 * @see #getLimitVoltage()
	 * @generated
	 */
	public void setLimitVoltage(float newLimitVoltage) {
		limitVoltage = newLimitVoltage;
		limitVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLimitVoltage()
	 * @see #getLimitVoltage()
	 * @see #setLimitVoltage(float)
	 * @generated
	 */
	public void unsetLimitVoltage() {
		limitVoltage = LIMIT_VOLTAGE_EDEFAULT;
		limitVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TapChangerControl#getLimitVoltage <em>Limit Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Limit Voltage</em>' attribute is set.
	 * @see #unsetLimitVoltage()
	 * @see #getLimitVoltage()
	 * @see #setLimitVoltage(float)
	 * @generated
	 */
	public boolean isSetLimitVoltage() {
		return limitVoltageESet;
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
			case WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTapChanger()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
				return ((InternalEList<?>)getTapChanger()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_R:
				return getLineDropR();
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_X:
				return getLineDropX();
			case WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
				return getTapChanger();
			case WiresPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X:
				return getReverseLineDropX();
			case WiresPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R:
				return getReverseLineDropR();
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION:
				return isLineDropCompensation();
			case WiresPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE:
				return getLimitVoltage();
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
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_R:
				setLineDropR((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_X:
				setLineDropX((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
				getTapChanger().clear();
				getTapChanger().addAll((Collection<? extends TapChanger>)newValue);
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X:
				setReverseLineDropX((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R:
				setReverseLineDropR((Float)newValue);
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION:
				setLineDropCompensation((Boolean)newValue);
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE:
				setLimitVoltage((Float)newValue);
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
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_R:
				unsetLineDropR();
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_X:
				unsetLineDropX();
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
				getTapChanger().clear();
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X:
				unsetReverseLineDropX();
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R:
				unsetReverseLineDropR();
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION:
				unsetLineDropCompensation();
				return;
			case WiresPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE:
				unsetLimitVoltage();
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
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_R:
				return isSetLineDropR();
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_X:
				return isSetLineDropX();
			case WiresPackage.TAP_CHANGER_CONTROL__TAP_CHANGER:
				return tapChanger != null && !tapChanger.isEmpty();
			case WiresPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_X:
				return isSetReverseLineDropX();
			case WiresPackage.TAP_CHANGER_CONTROL__REVERSE_LINE_DROP_R:
				return isSetReverseLineDropR();
			case WiresPackage.TAP_CHANGER_CONTROL__LINE_DROP_COMPENSATION:
				return isSetLineDropCompensation();
			case WiresPackage.TAP_CHANGER_CONTROL__LIMIT_VOLTAGE:
				return isSetLimitVoltage();
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
		result.append(" (lineDropR: ");
		if (lineDropRESet) result.append(lineDropR); else result.append("<unset>");
		result.append(", lineDropX: ");
		if (lineDropXESet) result.append(lineDropX); else result.append("<unset>");
		result.append(", reverseLineDropX: ");
		if (reverseLineDropXESet) result.append(reverseLineDropX); else result.append("<unset>");
		result.append(", reverseLineDropR: ");
		if (reverseLineDropRESet) result.append(reverseLineDropR); else result.append("<unset>");
		result.append(", lineDropCompensation: ");
		if (lineDropCompensationESet) result.append(lineDropCompensation); else result.append("<unset>");
		result.append(", limitVoltage: ");
		if (limitVoltageESet) result.append(limitVoltage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TapChangerControl
