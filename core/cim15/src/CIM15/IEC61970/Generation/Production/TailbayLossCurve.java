/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tailbay Loss Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TailbayLossCurve extends Curve {
	/**
	 * The cached value of the '{@link #getHydroGeneratingUnit() <em>Hydro Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected HydroGeneratingUnit hydroGeneratingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TailbayLossCurve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.TAILBAY_LOSS_CURVE;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Generating Unit</em>' reference.
	 * @see #setHydroGeneratingUnit(HydroGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve
	 * @generated
	 */
	public HydroGeneratingUnit getHydroGeneratingUnit() {
		if (hydroGeneratingUnit != null && hydroGeneratingUnit.eIsProxy()) {
			InternalEObject oldHydroGeneratingUnit = (InternalEObject)hydroGeneratingUnit;
			hydroGeneratingUnit = (HydroGeneratingUnit)eResolveProxy(oldHydroGeneratingUnit);
			if (hydroGeneratingUnit != oldHydroGeneratingUnit) {
			}
		}
		return hydroGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroGeneratingUnit basicGetHydroGeneratingUnit() {
		return hydroGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroGeneratingUnit(HydroGeneratingUnit newHydroGeneratingUnit, NotificationChain msgs) {
		HydroGeneratingUnit oldHydroGeneratingUnit = hydroGeneratingUnit;
		hydroGeneratingUnit = newHydroGeneratingUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Generating Unit</em>' reference.
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	public void setHydroGeneratingUnit(HydroGeneratingUnit newHydroGeneratingUnit) {
		if (newHydroGeneratingUnit != hydroGeneratingUnit) {
			NotificationChain msgs = null;
			if (hydroGeneratingUnit != null)
				msgs = ((InternalEObject)hydroGeneratingUnit).eInverseRemove(this, ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE, HydroGeneratingUnit.class, msgs);
			if (newHydroGeneratingUnit != null)
				msgs = ((InternalEObject)newHydroGeneratingUnit).eInverseAdd(this, ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE, HydroGeneratingUnit.class, msgs);
			msgs = basicSetHydroGeneratingUnit(newHydroGeneratingUnit, msgs);
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
			case ProductionPackage.TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT:
				if (hydroGeneratingUnit != null)
					msgs = ((InternalEObject)hydroGeneratingUnit).eInverseRemove(this, ProductionPackage.HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE, HydroGeneratingUnit.class, msgs);
				return basicSetHydroGeneratingUnit((HydroGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT:
				return basicSetHydroGeneratingUnit(null, msgs);
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
			case ProductionPackage.TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT:
				if (resolve) return getHydroGeneratingUnit();
				return basicGetHydroGeneratingUnit();
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
			case ProductionPackage.TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT:
				setHydroGeneratingUnit((HydroGeneratingUnit)newValue);
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
			case ProductionPackage.TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT:
				setHydroGeneratingUnit((HydroGeneratingUnit)null);
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
			case ProductionPackage.TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT:
				return hydroGeneratingUnit != null;
		}
		return super.eIsSet(featureID);
	}

} // TailbayLossCurve
