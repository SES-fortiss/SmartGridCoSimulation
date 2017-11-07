/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.PhaseCode;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Tank End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerTankEnd#getTransformerTank <em>Transformer Tank</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerTankEnd#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerTankEnd extends TransformerEnd {
	/**
	 * The cached value of the '{@link #getTransformerTank() <em>Transformer Tank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerTank()
	 * @generated
	 * @ordered
	 */
	protected TransformerTank transformerTank;

	/**
	 * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.S12_N;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phases = PHASES_EDEFAULT;

	/**
	 * This is true if the Phases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phasesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerTankEnd() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TRANSFORMER_TANK_END;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Tank</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerTankEnds <em>Transformer Tank Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Tank</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Tank</em>' reference.
	 * @see #setTransformerTank(TransformerTank)
	 * @see CIM15.IEC61970.Wires.TransformerTank#getTransformerTankEnds
	 * @generated
	 */
	public TransformerTank getTransformerTank() {
		if (transformerTank != null && transformerTank.eIsProxy()) {
			InternalEObject oldTransformerTank = (InternalEObject)transformerTank;
			transformerTank = (TransformerTank)eResolveProxy(oldTransformerTank);
			if (transformerTank != oldTransformerTank) {
			}
		}
		return transformerTank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTank basicGetTransformerTank() {
		return transformerTank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerTank(TransformerTank newTransformerTank, NotificationChain msgs) {
		TransformerTank oldTransformerTank = transformerTank;
		transformerTank = newTransformerTank;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerTankEnd#getTransformerTank <em>Transformer Tank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Tank</em>' reference.
	 * @see #getTransformerTank()
	 * @generated
	 */
	public void setTransformerTank(TransformerTank newTransformerTank) {
		if (newTransformerTank != transformerTank) {
			NotificationChain msgs = null;
			if (transformerTank != null)
				msgs = ((InternalEObject)transformerTank).eInverseRemove(this, WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS, TransformerTank.class, msgs);
			if (newTransformerTank != null)
				msgs = ((InternalEObject)newTransformerTank).eInverseAdd(this, WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS, TransformerTank.class, msgs);
			msgs = basicSetTransformerTank(newTransformerTank, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhases()
	 * @see #unsetPhases()
	 * @see #setPhases(PhaseCode)
	 * @generated
	 */
	public PhaseCode getPhases() {
		return phases;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerTankEnd#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhases()
	 * @see #unsetPhases()
	 * @see #getPhases()
	 * @generated
	 */
	public void setPhases(PhaseCode newPhases) {
		phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
		phasesESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerTankEnd#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhases()
	 * @see #getPhases()
	 * @see #setPhases(PhaseCode)
	 * @generated
	 */
	public void unsetPhases() {
		phases = PHASES_EDEFAULT;
		phasesESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerTankEnd#getPhases <em>Phases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phases</em>' attribute is set.
	 * @see #unsetPhases()
	 * @see #getPhases()
	 * @see #setPhases(PhaseCode)
	 * @generated
	 */
	public boolean isSetPhases() {
		return phasesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.TRANSFORMER_TANK_END__TRANSFORMER_TANK:
				if (transformerTank != null)
					msgs = ((InternalEObject)transformerTank).eInverseRemove(this, WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS, TransformerTank.class, msgs);
				return basicSetTransformerTank((TransformerTank)otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_TANK_END__TRANSFORMER_TANK:
				return basicSetTransformerTank(null, msgs);
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
			case WiresPackage.TRANSFORMER_TANK_END__TRANSFORMER_TANK:
				if (resolve) return getTransformerTank();
				return basicGetTransformerTank();
			case WiresPackage.TRANSFORMER_TANK_END__PHASES:
				return getPhases();
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
			case WiresPackage.TRANSFORMER_TANK_END__TRANSFORMER_TANK:
				setTransformerTank((TransformerTank)newValue);
				return;
			case WiresPackage.TRANSFORMER_TANK_END__PHASES:
				setPhases((PhaseCode)newValue);
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
			case WiresPackage.TRANSFORMER_TANK_END__TRANSFORMER_TANK:
				setTransformerTank((TransformerTank)null);
				return;
			case WiresPackage.TRANSFORMER_TANK_END__PHASES:
				unsetPhases();
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
			case WiresPackage.TRANSFORMER_TANK_END__TRANSFORMER_TANK:
				return transformerTank != null;
			case WiresPackage.TRANSFORMER_TANK_END__PHASES:
				return isSetPhases();
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
		result.append(" (phases: ");
		if (phasesESet) result.append(phases); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerTankEnd
