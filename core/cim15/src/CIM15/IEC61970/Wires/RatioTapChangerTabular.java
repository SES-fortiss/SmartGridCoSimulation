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
 * A representation of the model object '<em><b>Ratio Tap Changer Tabular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChangerTabularPoint <em>Ratio Tap Changer Tabular Point</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RatioTapChangerTabular extends Element {
	/**
	 * The cached value of the '{@link #getRatioTapChangerTabularPoint() <em>Ratio Tap Changer Tabular Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioTapChangerTabularPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<RatioTapChangerTabularPoint> ratioTapChangerTabularPoint;

	/**
	 * The cached value of the '{@link #getRatioTapChanger() <em>Ratio Tap Changer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioTapChanger()
	 * @generated
	 * @ordered
	 */
	protected EList<RatioTapChanger> ratioTapChanger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioTapChangerTabular() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.RATIO_TAP_CHANGER_TABULAR;
	}

	/**
	 * Returns the value of the '<em><b>Ratio Tap Changer Tabular Point</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Tap Changer Tabular Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Tap Changer Tabular Point</em>' reference list.
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatioTapChangerTabular
	 * @generated
	 */
	public EList<RatioTapChangerTabularPoint> getRatioTapChangerTabularPoint() {
		if (ratioTapChangerTabularPoint == null) {
			ratioTapChangerTabularPoint = new BasicInternalEList<RatioTapChangerTabularPoint>(RatioTapChangerTabularPoint.class);
		}
		return ratioTapChangerTabularPoint;
	}

	/**
	 * Returns the value of the '<em><b>Ratio Tap Changer</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.RatioTapChanger}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RatioTapChanger#getRatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Tap Changer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Tap Changer</em>' reference list.
	 * @see CIM15.IEC61970.Wires.RatioTapChanger#getRatioTapChangerTabular
	 * @generated
	 */
	public EList<RatioTapChanger> getRatioTapChanger() {
		if (ratioTapChanger == null) {
			ratioTapChanger = new BasicInternalEList<RatioTapChanger>(RatioTapChanger.class);
		}
		return ratioTapChanger;
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRatioTapChangerTabularPoint()).basicAdd(otherEnd, msgs);
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRatioTapChanger()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT:
				return ((InternalEList<?>)getRatioTapChangerTabularPoint()).basicRemove(otherEnd, msgs);
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER:
				return ((InternalEList<?>)getRatioTapChanger()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT:
				return getRatioTapChangerTabularPoint();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER:
				return getRatioTapChanger();
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT:
				getRatioTapChangerTabularPoint().clear();
				getRatioTapChangerTabularPoint().addAll((Collection<? extends RatioTapChangerTabularPoint>)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER:
				getRatioTapChanger().clear();
				getRatioTapChanger().addAll((Collection<? extends RatioTapChanger>)newValue);
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT:
				getRatioTapChangerTabularPoint().clear();
				return;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER:
				getRatioTapChanger().clear();
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT:
				return ratioTapChangerTabularPoint != null && !ratioTapChangerTabularPoint.isEmpty();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER:
				return ratioTapChanger != null && !ratioTapChanger.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // RatioTapChangerTabular
