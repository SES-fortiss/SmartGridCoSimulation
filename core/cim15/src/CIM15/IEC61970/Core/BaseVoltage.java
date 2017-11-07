/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61970.Topology.TopologicalNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.BaseVoltage#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.BaseVoltage#isIsDC <em>Is DC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseVoltage extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologicalNode> topologicalNode;

	/**
	 * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected float nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Nominal Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalVoltageESet;

	/**
	 * The default value of the '{@link #isIsDC() <em>Is DC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDC() <em>Is DC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDC()
	 * @generated
	 * @ordered
	 */
	protected boolean isDC = IS_DC_EDEFAULT;

	/**
	 * This is true if the Is DC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDCESet;

	/**
	 * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageLevel> voltageLevel;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductingEquipment> conductingEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseVoltage() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BASE_VOLTAGE;
	}

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Topology.TopologicalNode}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference list.
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getBaseVoltage
	 * @generated
	 */
	public EList<TopologicalNode> getTopologicalNode() {
		if (topologicalNode == null) {
			topologicalNode = new BasicInternalEList<TopologicalNode>(TopologicalNode.class);
		}
		return topologicalNode;
	}

	/**
	 * Returns the value of the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #isSetNominalVoltage()
	 * @see #unsetNominalVoltage()
	 * @see #setNominalVoltage(float)
	 * @generated
	 */
	public float getNominalVoltage() {
		return nominalVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #isSetNominalVoltage()
	 * @see #unsetNominalVoltage()
	 * @see #getNominalVoltage()
	 * @generated
	 */
	public void setNominalVoltage(float newNominalVoltage) {
		nominalVoltage = newNominalVoltage;
		nominalVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalVoltage()
	 * @see #getNominalVoltage()
	 * @see #setNominalVoltage(float)
	 * @generated
	 */
	public void unsetNominalVoltage() {
		nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;
		nominalVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Voltage</em>' attribute is set.
	 * @see #unsetNominalVoltage()
	 * @see #getNominalVoltage()
	 * @see #setNominalVoltage(float)
	 * @generated
	 */
	public boolean isSetNominalVoltage() {
		return nominalVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Is DC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is DC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is DC</em>' attribute.
	 * @see #isSetIsDC()
	 * @see #unsetIsDC()
	 * @see #setIsDC(boolean)
	 * @generated
	 */
	public boolean isIsDC() {
		return isDC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.BaseVoltage#isIsDC <em>Is DC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is DC</em>' attribute.
	 * @see #isSetIsDC()
	 * @see #unsetIsDC()
	 * @see #isIsDC()
	 * @generated
	 */
	public void setIsDC(boolean newIsDC) {
		isDC = newIsDC;
		isDCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.BaseVoltage#isIsDC <em>Is DC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDC()
	 * @see #isIsDC()
	 * @see #setIsDC(boolean)
	 * @generated
	 */
	public void unsetIsDC() {
		isDC = IS_DC_EDEFAULT;
		isDCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.BaseVoltage#isIsDC <em>Is DC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is DC</em>' attribute is set.
	 * @see #unsetIsDC()
	 * @see #isIsDC()
	 * @see #setIsDC(boolean)
	 * @generated
	 */
	public boolean isSetIsDC() {
		return isDCESet;
	}

	/**
	 * Returns the value of the '<em><b>Voltage Level</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.VoltageLevel}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Level</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Level</em>' reference list.
	 * @see CIM15.IEC61970.Core.VoltageLevel#getBaseVoltage
	 * @generated
	 */
	public EList<VoltageLevel> getVoltageLevel() {
		if (voltageLevel == null) {
			voltageLevel = new BasicInternalEList<VoltageLevel>(VoltageLevel.class);
		}
		return voltageLevel;
	}

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.ConductingEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference list.
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getBaseVoltage
	 * @generated
	 */
	public EList<ConductingEquipment> getConductingEquipment() {
		if (conductingEquipment == null) {
			conductingEquipment = new BasicInternalEList<ConductingEquipment>(ConductingEquipment.class);
		}
		return conductingEquipment;
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
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologicalNode()).basicAdd(otherEnd, msgs);
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageLevel()).basicAdd(otherEnd, msgs);
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipment()).basicAdd(otherEnd, msgs);
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
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				return ((InternalEList<?>)getTopologicalNode()).basicRemove(otherEnd, msgs);
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return ((InternalEList<?>)getVoltageLevel()).basicRemove(otherEnd, msgs);
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
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
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				return getTopologicalNode();
			case CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				return getNominalVoltage();
			case CorePackage.BASE_VOLTAGE__IS_DC:
				return isIsDC();
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return getVoltageLevel();
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return getConductingEquipment();
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
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				getTopologicalNode().addAll((Collection<? extends TopologicalNode>)newValue);
				return;
			case CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				setNominalVoltage((Float)newValue);
				return;
			case CorePackage.BASE_VOLTAGE__IS_DC:
				setIsDC((Boolean)newValue);
				return;
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
				getVoltageLevel().addAll((Collection<? extends VoltageLevel>)newValue);
				return;
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
				getConductingEquipment().addAll((Collection<? extends ConductingEquipment>)newValue);
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
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				return;
			case CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				unsetNominalVoltage();
				return;
			case CorePackage.BASE_VOLTAGE__IS_DC:
				unsetIsDC();
				return;
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				getVoltageLevel().clear();
				return;
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				getConductingEquipment().clear();
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
			case CorePackage.BASE_VOLTAGE__TOPOLOGICAL_NODE:
				return topologicalNode != null && !topologicalNode.isEmpty();
			case CorePackage.BASE_VOLTAGE__NOMINAL_VOLTAGE:
				return isSetNominalVoltage();
			case CorePackage.BASE_VOLTAGE__IS_DC:
				return isSetIsDC();
			case CorePackage.BASE_VOLTAGE__VOLTAGE_LEVEL:
				return voltageLevel != null && !voltageLevel.isEmpty();
			case CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null && !conductingEquipment.isEmpty();
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
		result.append(" (nominalVoltage: ");
		if (nominalVoltageESet) result.append(nominalVoltage); else result.append("<unset>");
		result.append(", isDC: ");
		if (isDCESet) result.append(isDC); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // BaseVoltage
