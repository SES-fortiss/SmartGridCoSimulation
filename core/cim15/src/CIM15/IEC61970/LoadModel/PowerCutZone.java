/**
 */
package CIM15.IEC61970.LoadModel;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Wires.EnergyConsumer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Cut Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerCutZone extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyConsumer> energyConsumers;

	/**
	 * The default value of the '{@link #getCutLevel2() <em>Cut Level2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLevel2()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_LEVEL2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutLevel2() <em>Cut Level2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLevel2()
	 * @generated
	 * @ordered
	 */
	protected float cutLevel2 = CUT_LEVEL2_EDEFAULT;

	/**
	 * This is true if the Cut Level2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutLevel2ESet;

	/**
	 * The default value of the '{@link #getCutLevel1() <em>Cut Level1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLevel1()
	 * @generated
	 * @ordered
	 */
	protected static final float CUT_LEVEL1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCutLevel1() <em>Cut Level1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutLevel1()
	 * @generated
	 * @ordered
	 */
	protected float cutLevel1 = CUT_LEVEL1_EDEFAULT;

	/**
	 * This is true if the Cut Level1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cutLevel1ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerCutZone() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.POWER_CUT_ZONE;
	}

	/**
	 * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.EnergyConsumer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumers</em>' reference list.
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getPowerCutZone
	 * @generated
	 */
	public EList<EnergyConsumer> getEnergyConsumers() {
		if (energyConsumers == null) {
			energyConsumers = new BasicInternalEList<EnergyConsumer>(EnergyConsumer.class);
		}
		return energyConsumers;
	}

	/**
	 * Returns the value of the '<em><b>Cut Level2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Level2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Level2</em>' attribute.
	 * @see #isSetCutLevel2()
	 * @see #unsetCutLevel2()
	 * @see #setCutLevel2(float)
	 * @generated
	 */
	public float getCutLevel2() {
		return cutLevel2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Level2</em>' attribute.
	 * @see #isSetCutLevel2()
	 * @see #unsetCutLevel2()
	 * @see #getCutLevel2()
	 * @generated
	 */
	public void setCutLevel2(float newCutLevel2) {
		cutLevel2 = newCutLevel2;
		cutLevel2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutLevel2()
	 * @see #getCutLevel2()
	 * @see #setCutLevel2(float)
	 * @generated
	 */
	public void unsetCutLevel2() {
		cutLevel2 = CUT_LEVEL2_EDEFAULT;
		cutLevel2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut Level2</em>' attribute is set.
	 * @see #unsetCutLevel2()
	 * @see #getCutLevel2()
	 * @see #setCutLevel2(float)
	 * @generated
	 */
	public boolean isSetCutLevel2() {
		return cutLevel2ESet;
	}

	/**
	 * Returns the value of the '<em><b>Cut Level1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Level1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Level1</em>' attribute.
	 * @see #isSetCutLevel1()
	 * @see #unsetCutLevel1()
	 * @see #setCutLevel1(float)
	 * @generated
	 */
	public float getCutLevel1() {
		return cutLevel1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Level1</em>' attribute.
	 * @see #isSetCutLevel1()
	 * @see #unsetCutLevel1()
	 * @see #getCutLevel1()
	 * @generated
	 */
	public void setCutLevel1(float newCutLevel1) {
		cutLevel1 = newCutLevel1;
		cutLevel1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutLevel1()
	 * @see #getCutLevel1()
	 * @see #setCutLevel1(float)
	 * @generated
	 */
	public void unsetCutLevel1() {
		cutLevel1 = CUT_LEVEL1_EDEFAULT;
		cutLevel1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut Level1</em>' attribute is set.
	 * @see #unsetCutLevel1()
	 * @see #getCutLevel1()
	 * @see #setCutLevel1(float)
	 * @generated
	 */
	public boolean isSetCutLevel1() {
		return cutLevel1ESet;
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyConsumers()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				return ((InternalEList<?>)getEnergyConsumers()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				return getEnergyConsumers();
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2:
				return getCutLevel2();
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1:
				return getCutLevel1();
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				getEnergyConsumers().addAll((Collection<? extends EnergyConsumer>)newValue);
				return;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2:
				setCutLevel2((Float)newValue);
				return;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1:
				setCutLevel1((Float)newValue);
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				return;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2:
				unsetCutLevel2();
				return;
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1:
				unsetCutLevel1();
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
			case LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS:
				return energyConsumers != null && !energyConsumers.isEmpty();
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL2:
				return isSetCutLevel2();
			case LoadModelPackage.POWER_CUT_ZONE__CUT_LEVEL1:
				return isSetCutLevel1();
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
		result.append(" (cutLevel2: ");
		if (cutLevel2ESet) result.append(cutLevel2); else result.append("<unset>");
		result.append(", cutLevel1: ");
		if (cutLevel1ESet) result.append(cutLevel1); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PowerCutZone
