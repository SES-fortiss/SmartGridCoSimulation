/**
 */
package CIM15.IEC61970.ControlArea;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.LoadModel.EnergyArea;
import CIM15.IEC61970.LoadModel.LoadModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlArea#getType <em>Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlArea#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlArea#getPTolerance <em>PTolerance</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlArea#getEnergyArea <em>Energy Area</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlArea extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ControlAreaTypeKind TYPE_EDEFAULT = ControlAreaTypeKind.FORECAST;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ControlAreaTypeKind type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAreaGeneratingUnit> controlAreaGeneratingUnit;

	/**
	 * The cached value of the '{@link #getTieFlow() <em>Tie Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<TieFlow> tieFlow;

	/**
	 * The default value of the '{@link #getPTolerance() <em>PTolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final float PTOLERANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPTolerance() <em>PTolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTolerance()
	 * @generated
	 * @ordered
	 */
	protected float pTolerance = PTOLERANCE_EDEFAULT;

	/**
	 * This is true if the PTolerance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pToleranceESet;

	/**
	 * The cached value of the '{@link #getEnergyArea() <em>Energy Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyArea()
	 * @generated
	 * @ordered
	 */
	protected EnergyArea energyArea;

	/**
	 * The default value of the '{@link #getNetInterchange() <em>Net Interchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetInterchange()
	 * @generated
	 * @ordered
	 */
	protected static final float NET_INTERCHANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetInterchange() <em>Net Interchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetInterchange()
	 * @generated
	 * @ordered
	 */
	protected float netInterchange = NET_INTERCHANGE_EDEFAULT;

	/**
	 * This is true if the Net Interchange attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean netInterchangeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlArea() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.CONTROL_AREA;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.ControlArea.ControlAreaTypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaTypeKind
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ControlAreaTypeKind)
	 * @generated
	 */
	public ControlAreaTypeKind getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaTypeKind
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(ControlAreaTypeKind newType) {
		type = newType == null ? TYPE_EDEFAULT : newType;
		typeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ControlAreaTypeKind)
	 * @generated
	 */
	public void unsetType() {
		type = TYPE_EDEFAULT;
		typeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ControlAreaTypeKind)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
	 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getControlArea
	 * @generated
	 */
	public EList<ControlAreaGeneratingUnit> getControlAreaGeneratingUnit() {
		if (controlAreaGeneratingUnit == null) {
			controlAreaGeneratingUnit = new BasicInternalEList<ControlAreaGeneratingUnit>(ControlAreaGeneratingUnit.class);
		}
		return controlAreaGeneratingUnit;
	}

	/**
	 * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.ControlArea.TieFlow}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.TieFlow#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Flow</em>' reference list.
	 * @see CIM15.IEC61970.ControlArea.TieFlow#getControlArea
	 * @generated
	 */
	public EList<TieFlow> getTieFlow() {
		if (tieFlow == null) {
			tieFlow = new BasicInternalEList<TieFlow>(TieFlow.class);
		}
		return tieFlow;
	}

	/**
	 * Returns the value of the '<em><b>PTolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTolerance</em>' attribute.
	 * @see #isSetPTolerance()
	 * @see #unsetPTolerance()
	 * @see #setPTolerance(float)
	 * @generated
	 */
	public float getPTolerance() {
		return pTolerance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getPTolerance <em>PTolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTolerance</em>' attribute.
	 * @see #isSetPTolerance()
	 * @see #unsetPTolerance()
	 * @see #getPTolerance()
	 * @generated
	 */
	public void setPTolerance(float newPTolerance) {
		pTolerance = newPTolerance;
		pToleranceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getPTolerance <em>PTolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPTolerance()
	 * @see #getPTolerance()
	 * @see #setPTolerance(float)
	 * @generated
	 */
	public void unsetPTolerance() {
		pTolerance = PTOLERANCE_EDEFAULT;
		pToleranceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getPTolerance <em>PTolerance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PTolerance</em>' attribute is set.
	 * @see #unsetPTolerance()
	 * @see #getPTolerance()
	 * @see #setPTolerance(float)
	 * @generated
	 */
	public boolean isSetPTolerance() {
		return pToleranceESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.EnergyArea#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Area</em>' reference.
	 * @see #setEnergyArea(EnergyArea)
	 * @see CIM15.IEC61970.LoadModel.EnergyArea#getControlArea
	 * @generated
	 */
	public EnergyArea getEnergyArea() {
		if (energyArea != null && energyArea.eIsProxy()) {
			InternalEObject oldEnergyArea = (InternalEObject)energyArea;
			energyArea = (EnergyArea)eResolveProxy(oldEnergyArea);
			if (energyArea != oldEnergyArea) {
			}
		}
		return energyArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyArea basicGetEnergyArea() {
		return energyArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyArea(EnergyArea newEnergyArea, NotificationChain msgs) {
		EnergyArea oldEnergyArea = energyArea;
		energyArea = newEnergyArea;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getEnergyArea <em>Energy Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Area</em>' reference.
	 * @see #getEnergyArea()
	 * @generated
	 */
	public void setEnergyArea(EnergyArea newEnergyArea) {
		if (newEnergyArea != energyArea) {
			NotificationChain msgs = null;
			if (energyArea != null)
				msgs = ((InternalEObject)energyArea).eInverseRemove(this, LoadModelPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs);
			if (newEnergyArea != null)
				msgs = ((InternalEObject)newEnergyArea).eInverseAdd(this, LoadModelPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs);
			msgs = basicSetEnergyArea(newEnergyArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Net Interchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Interchange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Interchange</em>' attribute.
	 * @see #isSetNetInterchange()
	 * @see #unsetNetInterchange()
	 * @see #setNetInterchange(float)
	 * @generated
	 */
	public float getNetInterchange() {
		return netInterchange;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Interchange</em>' attribute.
	 * @see #isSetNetInterchange()
	 * @see #unsetNetInterchange()
	 * @see #getNetInterchange()
	 * @generated
	 */
	public void setNetInterchange(float newNetInterchange) {
		netInterchange = newNetInterchange;
		netInterchangeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetInterchange()
	 * @see #getNetInterchange()
	 * @see #setNetInterchange(float)
	 * @generated
	 */
	public void unsetNetInterchange() {
		netInterchange = NET_INTERCHANGE_EDEFAULT;
		netInterchangeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.ControlArea.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Net Interchange</em>' attribute is set.
	 * @see #unsetNetInterchange()
	 * @see #getNetInterchange()
	 * @see #setNetInterchange(float)
	 * @generated
	 */
	public boolean isSetNetInterchange() {
		return netInterchangeESet;
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
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlAreaGeneratingUnit()).basicAdd(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTieFlow()).basicAdd(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				if (energyArea != null)
					msgs = ((InternalEObject)energyArea).eInverseRemove(this, LoadModelPackage.ENERGY_AREA__CONTROL_AREA, EnergyArea.class, msgs);
				return basicSetEnergyArea((EnergyArea)otherEnd, msgs);
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
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				return ((InternalEList<?>)getControlAreaGeneratingUnit()).basicRemove(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				return ((InternalEList<?>)getTieFlow()).basicRemove(otherEnd, msgs);
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				return basicSetEnergyArea(null, msgs);
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
			case ControlAreaPackage.CONTROL_AREA__TYPE:
				return getType();
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				return getControlAreaGeneratingUnit();
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				return getTieFlow();
			case ControlAreaPackage.CONTROL_AREA__PTOLERANCE:
				return getPTolerance();
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				if (resolve) return getEnergyArea();
				return basicGetEnergyArea();
			case ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE:
				return getNetInterchange();
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
			case ControlAreaPackage.CONTROL_AREA__TYPE:
				setType((ControlAreaTypeKind)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				getControlAreaGeneratingUnit().addAll((Collection<? extends ControlAreaGeneratingUnit>)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				getTieFlow().clear();
				getTieFlow().addAll((Collection<? extends TieFlow>)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__PTOLERANCE:
				setPTolerance((Float)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				setEnergyArea((EnergyArea)newValue);
				return;
			case ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE:
				setNetInterchange((Float)newValue);
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
			case ControlAreaPackage.CONTROL_AREA__TYPE:
				unsetType();
				return;
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				getControlAreaGeneratingUnit().clear();
				return;
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				getTieFlow().clear();
				return;
			case ControlAreaPackage.CONTROL_AREA__PTOLERANCE:
				unsetPTolerance();
				return;
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				setEnergyArea((EnergyArea)null);
				return;
			case ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE:
				unsetNetInterchange();
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
			case ControlAreaPackage.CONTROL_AREA__TYPE:
				return isSetType();
			case ControlAreaPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT:
				return controlAreaGeneratingUnit != null && !controlAreaGeneratingUnit.isEmpty();
			case ControlAreaPackage.CONTROL_AREA__TIE_FLOW:
				return tieFlow != null && !tieFlow.isEmpty();
			case ControlAreaPackage.CONTROL_AREA__PTOLERANCE:
				return isSetPTolerance();
			case ControlAreaPackage.CONTROL_AREA__ENERGY_AREA:
				return energyArea != null;
			case ControlAreaPackage.CONTROL_AREA__NET_INTERCHANGE:
				return isSetNetInterchange();
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", pTolerance: ");
		if (pToleranceESet) result.append(pTolerance); else result.append("<unset>");
		result.append(", netInterchange: ");
		if (netInterchangeESet) result.append(netInterchange); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ControlArea
