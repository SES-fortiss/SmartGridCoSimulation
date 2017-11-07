/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseTapChanger extends TapChanger {
	/**
	 * The cached value of the '{@link #getPhaseTapChangerTabular() <em>Phase Tap Changer Tabular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChangerTabular()
	 * @generated
	 * @ordered
	 */
	protected PhaseTapChangerTabular phaseTapChangerTabular;

	/**
	 * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerEnd()
	 * @generated
	 * @ordered
	 */
	protected TransformerEnd transformerEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseTapChanger() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_TAP_CHANGER;
	}

	/**
	 * Returns the value of the '<em><b>Phase Tap Changer Tabular</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer Tabular</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer Tabular</em>' reference.
	 * @see #setPhaseTapChangerTabular(PhaseTapChangerTabular)
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChanger
	 * @generated
	 */
	public PhaseTapChangerTabular getPhaseTapChangerTabular() {
		if (phaseTapChangerTabular != null && phaseTapChangerTabular.eIsProxy()) {
			InternalEObject oldPhaseTapChangerTabular = (InternalEObject)phaseTapChangerTabular;
			phaseTapChangerTabular = (PhaseTapChangerTabular)eResolveProxy(oldPhaseTapChangerTabular);
			if (phaseTapChangerTabular != oldPhaseTapChangerTabular) {
			}
		}
		return phaseTapChangerTabular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerTabular basicGetPhaseTapChangerTabular() {
		return phaseTapChangerTabular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseTapChangerTabular(PhaseTapChangerTabular newPhaseTapChangerTabular, NotificationChain msgs) {
		PhaseTapChangerTabular oldPhaseTapChangerTabular = phaseTapChangerTabular;
		phaseTapChangerTabular = newPhaseTapChangerTabular;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Tap Changer Tabular</em>' reference.
	 * @see #getPhaseTapChangerTabular()
	 * @generated
	 */
	public void setPhaseTapChangerTabular(PhaseTapChangerTabular newPhaseTapChangerTabular) {
		if (newPhaseTapChangerTabular != phaseTapChangerTabular) {
			NotificationChain msgs = null;
			if (phaseTapChangerTabular != null)
				msgs = ((InternalEObject)phaseTapChangerTabular).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER, PhaseTapChangerTabular.class, msgs);
			if (newPhaseTapChangerTabular != null)
				msgs = ((InternalEObject)newPhaseTapChangerTabular).eInverseAdd(this, WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER, PhaseTapChangerTabular.class, msgs);
			msgs = basicSetPhaseTapChangerTabular(newPhaseTapChangerTabular, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transformer End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End</em>' reference.
	 * @see #setTransformerEnd(TransformerEnd)
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getPhaseTapChanger
	 * @generated
	 */
	public TransformerEnd getTransformerEnd() {
		if (transformerEnd != null && transformerEnd.eIsProxy()) {
			InternalEObject oldTransformerEnd = (InternalEObject)transformerEnd;
			transformerEnd = (TransformerEnd)eResolveProxy(oldTransformerEnd);
			if (transformerEnd != oldTransformerEnd) {
			}
		}
		return transformerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEnd basicGetTransformerEnd() {
		return transformerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerEnd(TransformerEnd newTransformerEnd, NotificationChain msgs) {
		TransformerEnd oldTransformerEnd = transformerEnd;
		transformerEnd = newTransformerEnd;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer End</em>' reference.
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public void setTransformerEnd(TransformerEnd newTransformerEnd) {
		if (newTransformerEnd != transformerEnd) {
			NotificationChain msgs = null;
			if (transformerEnd != null)
				msgs = ((InternalEObject)transformerEnd).eInverseRemove(this, WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, TransformerEnd.class, msgs);
			if (newTransformerEnd != null)
				msgs = ((InternalEObject)newTransformerEnd).eInverseAdd(this, WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, TransformerEnd.class, msgs);
			msgs = basicSetTransformerEnd(newTransformerEnd, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR:
				if (phaseTapChangerTabular != null)
					msgs = ((InternalEObject)phaseTapChangerTabular).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER, PhaseTapChangerTabular.class, msgs);
				return basicSetPhaseTapChangerTabular((PhaseTapChangerTabular)otherEnd, msgs);
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
				if (transformerEnd != null)
					msgs = ((InternalEObject)transformerEnd).eInverseRemove(this, WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, TransformerEnd.class, msgs);
				return basicSetTransformerEnd((TransformerEnd)otherEnd, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR:
				return basicSetPhaseTapChangerTabular(null, msgs);
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
				return basicSetTransformerEnd(null, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR:
				if (resolve) return getPhaseTapChangerTabular();
				return basicGetPhaseTapChangerTabular();
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
				if (resolve) return getTransformerEnd();
				return basicGetTransformerEnd();
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
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR:
				setPhaseTapChangerTabular((PhaseTapChangerTabular)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
				setTransformerEnd((TransformerEnd)newValue);
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
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR:
				setPhaseTapChangerTabular((PhaseTapChangerTabular)null);
				return;
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
				setTransformerEnd((TransformerEnd)null);
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
			case WiresPackage.PHASE_TAP_CHANGER__PHASE_TAP_CHANGER_TABULAR:
				return phaseTapChangerTabular != null;
			case WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END:
				return transformerEnd != null;
		}
		return super.eIsSet(featureID);
	}

} // PhaseTapChanger
