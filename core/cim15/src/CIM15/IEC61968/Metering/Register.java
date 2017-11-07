/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.Register#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Register#getLeftDigitCount <em>Left Digit Count</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Register#getRightDigitCount <em>Right Digit Count</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Register#getEndDeviceFunction <em>End Device Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Register extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getReadingType() <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingType()
	 * @generated
	 * @ordered
	 */
	protected ReadingType readingType;

	/**
	 * The default value of the '{@link #getLeftDigitCount() <em>Left Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftDigitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_DIGIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeftDigitCount() <em>Left Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftDigitCount()
	 * @generated
	 * @ordered
	 */
	protected int leftDigitCount = LEFT_DIGIT_COUNT_EDEFAULT;

	/**
	 * This is true if the Left Digit Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leftDigitCountESet;

	/**
	 * The default value of the '{@link #getRightDigitCount() <em>Right Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightDigitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_DIGIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRightDigitCount() <em>Right Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightDigitCount()
	 * @generated
	 * @ordered
	 */
	protected int rightDigitCount = RIGHT_DIGIT_COUNT_EDEFAULT;

	/**
	 * This is true if the Right Digit Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rightDigitCountESet;

	/**
	 * The cached value of the '{@link #getEndDeviceFunction() <em>End Device Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceFunction()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceFunction endDeviceFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Register() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.REGISTER;
	}

	/**
	 * Returns the value of the '<em><b>Reading Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ReadingType#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Type</em>' reference.
	 * @see #setReadingType(ReadingType)
	 * @see CIM15.IEC61968.Metering.ReadingType#getRegister
	 * @generated
	 */
	public ReadingType getReadingType() {
		if (readingType != null && readingType.eIsProxy()) {
			InternalEObject oldReadingType = (InternalEObject)readingType;
			readingType = (ReadingType)eResolveProxy(oldReadingType);
			if (readingType != oldReadingType) {
			}
		}
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType basicGetReadingType() {
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadingType(ReadingType newReadingType, NotificationChain msgs) {
		ReadingType oldReadingType = readingType;
		readingType = newReadingType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Register#getReadingType <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Type</em>' reference.
	 * @see #getReadingType()
	 * @generated
	 */
	public void setReadingType(ReadingType newReadingType) {
		if (newReadingType != readingType) {
			NotificationChain msgs = null;
			if (readingType != null)
				msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__REGISTER, ReadingType.class, msgs);
			if (newReadingType != null)
				msgs = ((InternalEObject)newReadingType).eInverseAdd(this, MeteringPackage.READING_TYPE__REGISTER, ReadingType.class, msgs);
			msgs = basicSetReadingType(newReadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Left Digit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Digit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Digit Count</em>' attribute.
	 * @see #isSetLeftDigitCount()
	 * @see #unsetLeftDigitCount()
	 * @see #setLeftDigitCount(int)
	 * @generated
	 */
	public int getLeftDigitCount() {
		return leftDigitCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Register#getLeftDigitCount <em>Left Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Digit Count</em>' attribute.
	 * @see #isSetLeftDigitCount()
	 * @see #unsetLeftDigitCount()
	 * @see #getLeftDigitCount()
	 * @generated
	 */
	public void setLeftDigitCount(int newLeftDigitCount) {
		leftDigitCount = newLeftDigitCount;
		leftDigitCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.Register#getLeftDigitCount <em>Left Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeftDigitCount()
	 * @see #getLeftDigitCount()
	 * @see #setLeftDigitCount(int)
	 * @generated
	 */
	public void unsetLeftDigitCount() {
		leftDigitCount = LEFT_DIGIT_COUNT_EDEFAULT;
		leftDigitCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.Register#getLeftDigitCount <em>Left Digit Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Left Digit Count</em>' attribute is set.
	 * @see #unsetLeftDigitCount()
	 * @see #getLeftDigitCount()
	 * @see #setLeftDigitCount(int)
	 * @generated
	 */
	public boolean isSetLeftDigitCount() {
		return leftDigitCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Right Digit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Digit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Digit Count</em>' attribute.
	 * @see #isSetRightDigitCount()
	 * @see #unsetRightDigitCount()
	 * @see #setRightDigitCount(int)
	 * @generated
	 */
	public int getRightDigitCount() {
		return rightDigitCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Register#getRightDigitCount <em>Right Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Digit Count</em>' attribute.
	 * @see #isSetRightDigitCount()
	 * @see #unsetRightDigitCount()
	 * @see #getRightDigitCount()
	 * @generated
	 */
	public void setRightDigitCount(int newRightDigitCount) {
		rightDigitCount = newRightDigitCount;
		rightDigitCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.Register#getRightDigitCount <em>Right Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRightDigitCount()
	 * @see #getRightDigitCount()
	 * @see #setRightDigitCount(int)
	 * @generated
	 */
	public void unsetRightDigitCount() {
		rightDigitCount = RIGHT_DIGIT_COUNT_EDEFAULT;
		rightDigitCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.Register#getRightDigitCount <em>Right Digit Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Right Digit Count</em>' attribute is set.
	 * @see #unsetRightDigitCount()
	 * @see #getRightDigitCount()
	 * @see #setRightDigitCount(int)
	 * @generated
	 */
	public boolean isSetRightDigitCount() {
		return rightDigitCountESet;
	}

	/**
	 * Returns the value of the '<em><b>End Device Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Function</em>' reference.
	 * @see #setEndDeviceFunction(EndDeviceFunction)
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#getRegisters
	 * @generated
	 */
	public EndDeviceFunction getEndDeviceFunction() {
		if (endDeviceFunction != null && endDeviceFunction.eIsProxy()) {
			InternalEObject oldEndDeviceFunction = (InternalEObject)endDeviceFunction;
			endDeviceFunction = (EndDeviceFunction)eResolveProxy(oldEndDeviceFunction);
			if (endDeviceFunction != oldEndDeviceFunction) {
			}
		}
		return endDeviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceFunction basicGetEndDeviceFunction() {
		return endDeviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceFunction(EndDeviceFunction newEndDeviceFunction, NotificationChain msgs) {
		EndDeviceFunction oldEndDeviceFunction = endDeviceFunction;
		endDeviceFunction = newEndDeviceFunction;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Register#getEndDeviceFunction <em>End Device Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Function</em>' reference.
	 * @see #getEndDeviceFunction()
	 * @generated
	 */
	public void setEndDeviceFunction(EndDeviceFunction newEndDeviceFunction) {
		if (newEndDeviceFunction != endDeviceFunction) {
			NotificationChain msgs = null;
			if (endDeviceFunction != null)
				msgs = ((InternalEObject)endDeviceFunction).eInverseRemove(this, MeteringPackage.END_DEVICE_FUNCTION__REGISTERS, EndDeviceFunction.class, msgs);
			if (newEndDeviceFunction != null)
				msgs = ((InternalEObject)newEndDeviceFunction).eInverseAdd(this, MeteringPackage.END_DEVICE_FUNCTION__REGISTERS, EndDeviceFunction.class, msgs);
			msgs = basicSetEndDeviceFunction(newEndDeviceFunction, msgs);
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
			case MeteringPackage.REGISTER__READING_TYPE:
				if (readingType != null)
					msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__REGISTER, ReadingType.class, msgs);
				return basicSetReadingType((ReadingType)otherEnd, msgs);
			case MeteringPackage.REGISTER__END_DEVICE_FUNCTION:
				if (endDeviceFunction != null)
					msgs = ((InternalEObject)endDeviceFunction).eInverseRemove(this, MeteringPackage.END_DEVICE_FUNCTION__REGISTERS, EndDeviceFunction.class, msgs);
				return basicSetEndDeviceFunction((EndDeviceFunction)otherEnd, msgs);
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
			case MeteringPackage.REGISTER__READING_TYPE:
				return basicSetReadingType(null, msgs);
			case MeteringPackage.REGISTER__END_DEVICE_FUNCTION:
				return basicSetEndDeviceFunction(null, msgs);
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
			case MeteringPackage.REGISTER__READING_TYPE:
				if (resolve) return getReadingType();
				return basicGetReadingType();
			case MeteringPackage.REGISTER__LEFT_DIGIT_COUNT:
				return getLeftDigitCount();
			case MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT:
				return getRightDigitCount();
			case MeteringPackage.REGISTER__END_DEVICE_FUNCTION:
				if (resolve) return getEndDeviceFunction();
				return basicGetEndDeviceFunction();
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
			case MeteringPackage.REGISTER__READING_TYPE:
				setReadingType((ReadingType)newValue);
				return;
			case MeteringPackage.REGISTER__LEFT_DIGIT_COUNT:
				setLeftDigitCount((Integer)newValue);
				return;
			case MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT:
				setRightDigitCount((Integer)newValue);
				return;
			case MeteringPackage.REGISTER__END_DEVICE_FUNCTION:
				setEndDeviceFunction((EndDeviceFunction)newValue);
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
			case MeteringPackage.REGISTER__READING_TYPE:
				setReadingType((ReadingType)null);
				return;
			case MeteringPackage.REGISTER__LEFT_DIGIT_COUNT:
				unsetLeftDigitCount();
				return;
			case MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT:
				unsetRightDigitCount();
				return;
			case MeteringPackage.REGISTER__END_DEVICE_FUNCTION:
				setEndDeviceFunction((EndDeviceFunction)null);
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
			case MeteringPackage.REGISTER__READING_TYPE:
				return readingType != null;
			case MeteringPackage.REGISTER__LEFT_DIGIT_COUNT:
				return isSetLeftDigitCount();
			case MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT:
				return isSetRightDigitCount();
			case MeteringPackage.REGISTER__END_DEVICE_FUNCTION:
				return endDeviceFunction != null;
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
		result.append(" (leftDigitCount: ");
		if (leftDigitCountESet) result.append(leftDigitCount); else result.append("<unset>");
		result.append(", rightDigitCount: ");
		if (rightDigitCountESet) result.append(rightDigitCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Register
