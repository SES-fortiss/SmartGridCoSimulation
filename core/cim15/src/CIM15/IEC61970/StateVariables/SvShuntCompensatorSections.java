/**
 */
package CIM15.IEC61970.StateVariables;

import CIM15.IEC61970.Wires.ShuntCompensator;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Shunt Compensator Sections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getSections <em>Sections</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SvShuntCompensatorSections extends StateVariable {
	/**
	 * The default value of the '{@link #getSections() <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected static final float SECTIONS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected float sections = SECTIONS_EDEFAULT;

	/**
	 * This is true if the Sections attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sectionsESet;

	/**
	 * The cached value of the '{@link #getShuntCompensator() <em>Shunt Compensator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuntCompensator()
	 * @generated
	 * @ordered
	 */
	protected ShuntCompensator shuntCompensator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvShuntCompensatorSections() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_SHUNT_COMPENSATOR_SECTIONS;
	}

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' attribute.
	 * @see #isSetSections()
	 * @see #unsetSections()
	 * @see #setSections(float)
	 * @generated
	 */
	public float getSections() {
		return sections;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' attribute.
	 * @see #isSetSections()
	 * @see #unsetSections()
	 * @see #getSections()
	 * @generated
	 */
	public void setSections(float newSections) {
		sections = newSections;
		sectionsESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSections()
	 * @see #getSections()
	 * @see #setSections(float)
	 * @generated
	 */
	public void unsetSections() {
		sections = SECTIONS_EDEFAULT;
		sectionsESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getSections <em>Sections</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sections</em>' attribute is set.
	 * @see #unsetSections()
	 * @see #getSections()
	 * @see #setSections(float)
	 * @generated
	 */
	public boolean isSetSections() {
		return sectionsESet;
	}

	/**
	 * Returns the value of the '<em><b>Shunt Compensator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt Compensator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt Compensator</em>' reference.
	 * @see #setShuntCompensator(ShuntCompensator)
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections
	 * @generated
	 */
	public ShuntCompensator getShuntCompensator() {
		if (shuntCompensator != null && shuntCompensator.eIsProxy()) {
			InternalEObject oldShuntCompensator = (InternalEObject)shuntCompensator;
			shuntCompensator = (ShuntCompensator)eResolveProxy(oldShuntCompensator);
			if (shuntCompensator != oldShuntCompensator) {
			}
		}
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensator basicGetShuntCompensator() {
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShuntCompensator(ShuntCompensator newShuntCompensator, NotificationChain msgs) {
		ShuntCompensator oldShuntCompensator = shuntCompensator;
		shuntCompensator = newShuntCompensator;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt Compensator</em>' reference.
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public void setShuntCompensator(ShuntCompensator newShuntCompensator) {
		if (newShuntCompensator != shuntCompensator) {
			NotificationChain msgs = null;
			if (shuntCompensator != null)
				msgs = ((InternalEObject)shuntCompensator).eInverseRemove(this, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs);
			if (newShuntCompensator != null)
				msgs = ((InternalEObject)newShuntCompensator).eInverseAdd(this, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs);
			msgs = basicSetShuntCompensator(newShuntCompensator, msgs);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				if (shuntCompensator != null)
					msgs = ((InternalEObject)shuntCompensator).eInverseRemove(this, WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, ShuntCompensator.class, msgs);
				return basicSetShuntCompensator((ShuntCompensator)otherEnd, msgs);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				return basicSetShuntCompensator(null, msgs);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
				return getSections();
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				if (resolve) return getShuntCompensator();
				return basicGetShuntCompensator();
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
				setSections((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				setShuntCompensator((ShuntCompensator)newValue);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
				unsetSections();
				return;
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				setShuntCompensator((ShuntCompensator)null);
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
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS:
				return isSetSections();
			case StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR:
				return shuntCompensator != null;
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
		result.append(" (sections: ");
		if (sectionsESet) result.append(sections); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SvShuntCompensatorSections
