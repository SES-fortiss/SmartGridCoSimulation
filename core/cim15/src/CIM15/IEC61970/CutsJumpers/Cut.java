/**
 */
package CIM15.IEC61970.CutsJumpers;

import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.Switch;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.CutsJumpers.Cut#getACLineSegment <em>AC Line Segment</em>}</li>
 *   <li>{@link CIM15.IEC61970.CutsJumpers.Cut#getLengthFromTerminal1 <em>Length From Terminal1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Cut extends Switch {
	/**
	 * The cached value of the '{@link #getACLineSegment() <em>AC Line Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACLineSegment()
	 * @generated
	 * @ordered
	 */
	protected ACLineSegment acLineSegment;

	/**
	 * The default value of the '{@link #getLengthFromTerminal1() <em>Length From Terminal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthFromTerminal1()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_FROM_TERMINAL1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLengthFromTerminal1() <em>Length From Terminal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthFromTerminal1()
	 * @generated
	 * @ordered
	 */
	protected float lengthFromTerminal1 = LENGTH_FROM_TERMINAL1_EDEFAULT;

	/**
	 * This is true if the Length From Terminal1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lengthFromTerminal1ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cut() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CutsJumpersPackage.Literals.CUT;
	}

	/**
	 * Returns the value of the '<em><b>AC Line Segment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ACLineSegment#getCut <em>Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AC Line Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AC Line Segment</em>' reference.
	 * @see #setACLineSegment(ACLineSegment)
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getCut
	 * @generated
	 */
	public ACLineSegment getACLineSegment() {
		if (acLineSegment != null && acLineSegment.eIsProxy()) {
			InternalEObject oldACLineSegment = (InternalEObject)acLineSegment;
			acLineSegment = (ACLineSegment)eResolveProxy(oldACLineSegment);
			if (acLineSegment != oldACLineSegment) {
			}
		}
		return acLineSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACLineSegment basicGetACLineSegment() {
		return acLineSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACLineSegment(ACLineSegment newACLineSegment, NotificationChain msgs) {
		ACLineSegment oldACLineSegment = acLineSegment;
		acLineSegment = newACLineSegment;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.CutsJumpers.Cut#getACLineSegment <em>AC Line Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AC Line Segment</em>' reference.
	 * @see #getACLineSegment()
	 * @generated
	 */
	public void setACLineSegment(ACLineSegment newACLineSegment) {
		if (newACLineSegment != acLineSegment) {
			NotificationChain msgs = null;
			if (acLineSegment != null)
				msgs = ((InternalEObject)acLineSegment).eInverseRemove(this, WiresPackage.AC_LINE_SEGMENT__CUT, ACLineSegment.class, msgs);
			if (newACLineSegment != null)
				msgs = ((InternalEObject)newACLineSegment).eInverseAdd(this, WiresPackage.AC_LINE_SEGMENT__CUT, ACLineSegment.class, msgs);
			msgs = basicSetACLineSegment(newACLineSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Length From Terminal1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length From Terminal1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length From Terminal1</em>' attribute.
	 * @see #isSetLengthFromTerminal1()
	 * @see #unsetLengthFromTerminal1()
	 * @see #setLengthFromTerminal1(float)
	 * @generated
	 */
	public float getLengthFromTerminal1() {
		return lengthFromTerminal1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.CutsJumpers.Cut#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length From Terminal1</em>' attribute.
	 * @see #isSetLengthFromTerminal1()
	 * @see #unsetLengthFromTerminal1()
	 * @see #getLengthFromTerminal1()
	 * @generated
	 */
	public void setLengthFromTerminal1(float newLengthFromTerminal1) {
		lengthFromTerminal1 = newLengthFromTerminal1;
		lengthFromTerminal1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.CutsJumpers.Cut#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLengthFromTerminal1()
	 * @see #getLengthFromTerminal1()
	 * @see #setLengthFromTerminal1(float)
	 * @generated
	 */
	public void unsetLengthFromTerminal1() {
		lengthFromTerminal1 = LENGTH_FROM_TERMINAL1_EDEFAULT;
		lengthFromTerminal1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.CutsJumpers.Cut#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length From Terminal1</em>' attribute is set.
	 * @see #unsetLengthFromTerminal1()
	 * @see #getLengthFromTerminal1()
	 * @see #setLengthFromTerminal1(float)
	 * @generated
	 */
	public boolean isSetLengthFromTerminal1() {
		return lengthFromTerminal1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CutsJumpersPackage.CUT__AC_LINE_SEGMENT:
				if (acLineSegment != null)
					msgs = ((InternalEObject)acLineSegment).eInverseRemove(this, WiresPackage.AC_LINE_SEGMENT__CUT, ACLineSegment.class, msgs);
				return basicSetACLineSegment((ACLineSegment)otherEnd, msgs);
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
			case CutsJumpersPackage.CUT__AC_LINE_SEGMENT:
				return basicSetACLineSegment(null, msgs);
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
			case CutsJumpersPackage.CUT__AC_LINE_SEGMENT:
				if (resolve) return getACLineSegment();
				return basicGetACLineSegment();
			case CutsJumpersPackage.CUT__LENGTH_FROM_TERMINAL1:
				return getLengthFromTerminal1();
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
			case CutsJumpersPackage.CUT__AC_LINE_SEGMENT:
				setACLineSegment((ACLineSegment)newValue);
				return;
			case CutsJumpersPackage.CUT__LENGTH_FROM_TERMINAL1:
				setLengthFromTerminal1((Float)newValue);
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
			case CutsJumpersPackage.CUT__AC_LINE_SEGMENT:
				setACLineSegment((ACLineSegment)null);
				return;
			case CutsJumpersPackage.CUT__LENGTH_FROM_TERMINAL1:
				unsetLengthFromTerminal1();
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
			case CutsJumpersPackage.CUT__AC_LINE_SEGMENT:
				return acLineSegment != null;
			case CutsJumpersPackage.CUT__LENGTH_FROM_TERMINAL1:
				return isSetLengthFromTerminal1();
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
		result.append(" (lengthFromTerminal1: ");
		if (lengthFromTerminal1ESet) result.append(lengthFromTerminal1); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Cut
