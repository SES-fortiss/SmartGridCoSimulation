/**
 */
package CIM15.IEC61970.Wires;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Impedance Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getB <em>B</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseImpedanceData extends Element {
	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * This is true if the R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rESet;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The cached value of the '{@link #getPhaseImpedance() <em>Phase Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseImpedance()
	 * @generated
	 * @ordered
	 */
	protected PerLengthPhaseImpedance phaseImpedance;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final float B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected float b = B_EDEFAULT;

	/**
	 * This is true if the B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bESet;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseImpedanceData() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_IMPEDANCE_DATA;
	}

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #setR(float)
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #getR()
	 * @generated
	 */
	public void setR(float newR) {
		r = newR;
		rESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public void unsetR() {
		r = R_EDEFAULT;
		rESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getR <em>R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R</em>' attribute is set.
	 * @see #unsetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public boolean isSetR() {
		return rESet;
	}

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	public void setX(float newX) {
		x = newX;
		xESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public void unsetX() {
		x = X_EDEFAULT;
		xESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Impedance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Impedance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Impedance</em>' reference.
	 * @see #setPhaseImpedance(PerLengthPhaseImpedance)
	 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getPhaseImpedanceData
	 * @generated
	 */
	public PerLengthPhaseImpedance getPhaseImpedance() {
		if (phaseImpedance != null && phaseImpedance.eIsProxy()) {
			InternalEObject oldPhaseImpedance = (InternalEObject)phaseImpedance;
			phaseImpedance = (PerLengthPhaseImpedance)eResolveProxy(oldPhaseImpedance);
			if (phaseImpedance != oldPhaseImpedance) {
			}
		}
		return phaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthPhaseImpedance basicGetPhaseImpedance() {
		return phaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseImpedance(PerLengthPhaseImpedance newPhaseImpedance, NotificationChain msgs) {
		PerLengthPhaseImpedance oldPhaseImpedance = phaseImpedance;
		phaseImpedance = newPhaseImpedance;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Impedance</em>' reference.
	 * @see #getPhaseImpedance()
	 * @generated
	 */
	public void setPhaseImpedance(PerLengthPhaseImpedance newPhaseImpedance) {
		if (newPhaseImpedance != phaseImpedance) {
			NotificationChain msgs = null;
			if (phaseImpedance != null)
				msgs = ((InternalEObject)phaseImpedance).eInverseRemove(this, WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs);
			if (newPhaseImpedance != null)
				msgs = ((InternalEObject)newPhaseImpedance).eInverseAdd(this, WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs);
			msgs = basicSetPhaseImpedance(newPhaseImpedance, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #setB(float)
	 * @generated
	 */
	public float getB() {
		return b;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #getB()
	 * @generated
	 */
	public void setB(float newB) {
		b = newB;
		bESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB()
	 * @see #getB()
	 * @see #setB(float)
	 * @generated
	 */
	public void unsetB() {
		b = B_EDEFAULT;
		bESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getB <em>B</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B</em>' attribute is set.
	 * @see #unsetB()
	 * @see #getB()
	 * @see #setB(float)
	 * @generated
	 */
	public boolean isSetB() {
		return bESet;
	}

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
		sequenceNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public void unsetSequenceNumber() {
		sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
		sequenceNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public boolean isSetSequenceNumber() {
		return sequenceNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				if (phaseImpedance != null)
					msgs = ((InternalEObject)phaseImpedance).eInverseRemove(this, WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs);
				return basicSetPhaseImpedance((PerLengthPhaseImpedance)otherEnd, msgs);
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
			case WiresPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				return basicSetPhaseImpedance(null, msgs);
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
			case WiresPackage.PHASE_IMPEDANCE_DATA__R:
				return getR();
			case WiresPackage.PHASE_IMPEDANCE_DATA__X:
				return getX();
			case WiresPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				if (resolve) return getPhaseImpedance();
				return basicGetPhaseImpedance();
			case WiresPackage.PHASE_IMPEDANCE_DATA__B:
				return getB();
			case WiresPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER:
				return getSequenceNumber();
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
			case WiresPackage.PHASE_IMPEDANCE_DATA__R:
				setR((Float)newValue);
				return;
			case WiresPackage.PHASE_IMPEDANCE_DATA__X:
				setX((Float)newValue);
				return;
			case WiresPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				setPhaseImpedance((PerLengthPhaseImpedance)newValue);
				return;
			case WiresPackage.PHASE_IMPEDANCE_DATA__B:
				setB((Float)newValue);
				return;
			case WiresPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
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
			case WiresPackage.PHASE_IMPEDANCE_DATA__R:
				unsetR();
				return;
			case WiresPackage.PHASE_IMPEDANCE_DATA__X:
				unsetX();
				return;
			case WiresPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				setPhaseImpedance((PerLengthPhaseImpedance)null);
				return;
			case WiresPackage.PHASE_IMPEDANCE_DATA__B:
				unsetB();
				return;
			case WiresPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER:
				unsetSequenceNumber();
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
			case WiresPackage.PHASE_IMPEDANCE_DATA__R:
				return isSetR();
			case WiresPackage.PHASE_IMPEDANCE_DATA__X:
				return isSetX();
			case WiresPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
				return phaseImpedance != null;
			case WiresPackage.PHASE_IMPEDANCE_DATA__B:
				return isSetB();
			case WiresPackage.PHASE_IMPEDANCE_DATA__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
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
		result.append(" (r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", b: ");
		if (bESet) result.append(b); else result.append("<unset>");
		result.append(", sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PhaseImpedanceData
