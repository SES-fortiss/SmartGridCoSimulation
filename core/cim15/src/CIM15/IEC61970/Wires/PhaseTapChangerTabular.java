/**
 */
package CIM15.IEC61970.Wires;

import CIM15.Element;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Tap Changer Tabular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChangerTabularPoint <em>Phase Tap Changer Tabular Point</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseTapChangerTabular extends Element {
	/**
	 * The cached value of the '{@link #getPhaseTapChangerTabularPoint() <em>Phase Tap Changer Tabular Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChangerTabularPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<PhaseTapChangerTabularPoint> phaseTapChangerTabularPoint;

	/**
	 * The cached value of the '{@link #getPhaseTapChanger() <em>Phase Tap Changer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChanger()
	 * @generated
	 * @ordered
	 */
	protected EList<PhaseTapChanger> phaseTapChanger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseTapChangerTabular() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_TAP_CHANGER_TABULAR;
	}

	/**
	 * Returns the value of the '<em><b>Phase Tap Changer Tabular Point</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer Tabular Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer Tabular Point</em>' reference list.
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getPhaseTapChangerTabular
	 * @generated
	 */
	public EList<PhaseTapChangerTabularPoint> getPhaseTapChangerTabularPoint() {
		if (phaseTapChangerTabularPoint == null) {
			phaseTapChangerTabularPoint = new BasicInternalEList<PhaseTapChangerTabularPoint>(PhaseTapChangerTabularPoint.class);
		}
		return phaseTapChangerTabularPoint;
	}

	/**
	 * Returns the value of the '<em><b>Phase Tap Changer</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.PhaseTapChanger}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer</em>' reference list.
	 * @see CIM15.IEC61970.Wires.PhaseTapChanger#getPhaseTapChangerTabular
	 * @generated
	 */
	public EList<PhaseTapChanger> getPhaseTapChanger() {
		if (phaseTapChanger == null) {
			phaseTapChanger = new BasicInternalEList<PhaseTapChanger>(PhaseTapChanger.class);
		}
		return phaseTapChanger;
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhaseTapChangerTabularPoint()).basicAdd(otherEnd, msgs);
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhaseTapChanger()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT:
				return ((InternalEList<?>)getPhaseTapChangerTabularPoint()).basicRemove(otherEnd, msgs);
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER:
				return ((InternalEList<?>)getPhaseTapChanger()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT:
				return getPhaseTapChangerTabularPoint();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER:
				return getPhaseTapChanger();
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT:
				getPhaseTapChangerTabularPoint().clear();
				getPhaseTapChangerTabularPoint().addAll((Collection<? extends PhaseTapChangerTabularPoint>)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER:
				getPhaseTapChanger().clear();
				getPhaseTapChanger().addAll((Collection<? extends PhaseTapChanger>)newValue);
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT:
				getPhaseTapChangerTabularPoint().clear();
				return;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER:
				getPhaseTapChanger().clear();
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT:
				return phaseTapChangerTabularPoint != null && !phaseTapChangerTabularPoint.isEmpty();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER:
				return phaseTapChanger != null && !phaseTapChanger.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PhaseTapChangerTabular
