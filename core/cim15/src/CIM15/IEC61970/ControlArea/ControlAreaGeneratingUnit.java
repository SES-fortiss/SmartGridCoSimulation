/**
 */
package CIM15.IEC61970.ControlArea;

import CIM15.Element;

import CIM15.IEC61970.Generation.Production.GeneratingUnit;
import CIM15.IEC61970.Generation.Production.ProductionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlAreaGeneratingUnit extends Element {
	/**
	 * The cached value of the '{@link #getAltGeneratingUnitMeas() <em>Alt Generating Unit Meas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltGeneratingUnitMeas()
	 * @generated
	 * @ordered
	 */
	protected EList<AltGeneratingUnitMeas> altGeneratingUnitMeas;

	/**
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected GeneratingUnit generatingUnit;

	/**
	 * The cached value of the '{@link #getControlArea() <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlArea()
	 * @generated
	 * @ordered
	 */
	protected ControlArea controlArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlAreaGeneratingUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.CONTROL_AREA_GENERATING_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>Alt Generating Unit Meas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Generating Unit Meas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Generating Unit Meas</em>' reference list.
	 * @see CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit
	 * @generated
	 */
	public EList<AltGeneratingUnitMeas> getAltGeneratingUnitMeas() {
		if (altGeneratingUnitMeas == null) {
			altGeneratingUnitMeas = new BasicInternalEList<AltGeneratingUnitMeas>(AltGeneratingUnitMeas.class);
		}
		return altGeneratingUnitMeas;
	}

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit
	 * @generated
	 */
	public GeneratingUnit getGeneratingUnit() {
		if (generatingUnit != null && generatingUnit.eIsProxy()) {
			InternalEObject oldGeneratingUnit = (InternalEObject)generatingUnit;
			generatingUnit = (GeneratingUnit)eResolveProxy(oldGeneratingUnit);
			if (generatingUnit != oldGeneratingUnit) {
			}
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit basicGetGeneratingUnit() {
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratingUnit(GeneratingUnit newGeneratingUnit, NotificationChain msgs) {
		GeneratingUnit oldGeneratingUnit = generatingUnit;
		generatingUnit = newGeneratingUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public void setGeneratingUnit(GeneratingUnit newGeneratingUnit) {
		if (newGeneratingUnit != generatingUnit) {
			NotificationChain msgs = null;
			if (generatingUnit != null)
				msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
			if (newGeneratingUnit != null)
				msgs = ((InternalEObject)newGeneratingUnit).eInverseAdd(this, ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
			msgs = basicSetGeneratingUnit(newGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area</em>' reference.
	 * @see #setControlArea(ControlArea)
	 * @see CIM15.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit
	 * @generated
	 */
	public ControlArea getControlArea() {
		if (controlArea != null && controlArea.eIsProxy()) {
			InternalEObject oldControlArea = (InternalEObject)controlArea;
			controlArea = (ControlArea)eResolveProxy(oldControlArea);
			if (controlArea != oldControlArea) {
			}
		}
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea basicGetControlArea() {
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlArea(ControlArea newControlArea, NotificationChain msgs) {
		ControlArea oldControlArea = controlArea;
		controlArea = newControlArea;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area</em>' reference.
	 * @see #getControlArea()
	 * @generated
	 */
	public void setControlArea(ControlArea newControlArea) {
		if (newControlArea != controlArea) {
			NotificationChain msgs = null;
			if (controlArea != null)
				msgs = ((InternalEObject)controlArea).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
			if (newControlArea != null)
				msgs = ((InternalEObject)newControlArea).eInverseAdd(this, ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
			msgs = basicSetControlArea(newControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAltGeneratingUnitMeas()).basicAdd(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				if (generatingUnit != null)
					msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs);
				return basicSetGeneratingUnit((GeneratingUnit)otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				if (controlArea != null)
					msgs = ((InternalEObject)controlArea).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs);
				return basicSetControlArea((ControlArea)otherEnd, msgs);
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				return ((InternalEList<?>)getAltGeneratingUnitMeas()).basicRemove(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				return basicSetGeneratingUnit(null, msgs);
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				return basicSetControlArea(null, msgs);
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				return getAltGeneratingUnitMeas();
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				if (resolve) return getGeneratingUnit();
				return basicGetGeneratingUnit();
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				if (resolve) return getControlArea();
				return basicGetControlArea();
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				getAltGeneratingUnitMeas().clear();
				getAltGeneratingUnitMeas().addAll((Collection<? extends AltGeneratingUnitMeas>)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				setControlArea((ControlArea)newValue);
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				getAltGeneratingUnitMeas().clear();
				return;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)null);
				return;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				setControlArea((ControlArea)null);
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
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS:
				return altGeneratingUnitMeas != null && !altGeneratingUnitMeas.isEmpty();
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
				return generatingUnit != null;
			case ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
				return controlArea != null;
		}
		return super.eIsSet(featureID);
	}

} // ControlAreaGeneratingUnit
