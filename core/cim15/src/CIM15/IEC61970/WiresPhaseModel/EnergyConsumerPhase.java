/**
 */
package CIM15.IEC61970.WiresPhaseModel;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.WiresPhaseModel.EnergyConsumerPhase#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnergyConsumerPhase extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getEnergyConsumer() <em>Energy Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumer()
	 * @generated
	 * @ordered
	 */
	protected EnergyConsumer energyConsumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumerPhase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPhaseModelPackage.Literals.ENERGY_CONSUMER_PHASE;
	}

	/**
	 * Returns the value of the '<em><b>Energy Consumer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.EnergyConsumer#getEnergyConsumerPhases <em>Energy Consumer Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumer</em>' reference.
	 * @see #setEnergyConsumer(EnergyConsumer)
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getEnergyConsumerPhases
	 * @generated
	 */
	public EnergyConsumer getEnergyConsumer() {
		if (energyConsumer != null && energyConsumer.eIsProxy()) {
			InternalEObject oldEnergyConsumer = (InternalEObject)energyConsumer;
			energyConsumer = (EnergyConsumer)eResolveProxy(oldEnergyConsumer);
			if (energyConsumer != oldEnergyConsumer) {
			}
		}
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer basicGetEnergyConsumer() {
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyConsumer(EnergyConsumer newEnergyConsumer, NotificationChain msgs) {
		EnergyConsumer oldEnergyConsumer = energyConsumer;
		energyConsumer = newEnergyConsumer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.EnergyConsumerPhase#getEnergyConsumer <em>Energy Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Consumer</em>' reference.
	 * @see #getEnergyConsumer()
	 * @generated
	 */
	public void setEnergyConsumer(EnergyConsumer newEnergyConsumer) {
		if (newEnergyConsumer != energyConsumer) {
			NotificationChain msgs = null;
			if (energyConsumer != null)
				msgs = ((InternalEObject)energyConsumer).eInverseRemove(this, WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES, EnergyConsumer.class, msgs);
			if (newEnergyConsumer != null)
				msgs = ((InternalEObject)newEnergyConsumer).eInverseAdd(this, WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES, EnergyConsumer.class, msgs);
			msgs = basicSetEnergyConsumer(newEnergyConsumer, msgs);
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
			case WiresPhaseModelPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
				if (energyConsumer != null)
					msgs = ((InternalEObject)energyConsumer).eInverseRemove(this, WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES, EnergyConsumer.class, msgs);
				return basicSetEnergyConsumer((EnergyConsumer)otherEnd, msgs);
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
			case WiresPhaseModelPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
				return basicSetEnergyConsumer(null, msgs);
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
			case WiresPhaseModelPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
				if (resolve) return getEnergyConsumer();
				return basicGetEnergyConsumer();
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
			case WiresPhaseModelPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
				setEnergyConsumer((EnergyConsumer)newValue);
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
			case WiresPhaseModelPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
				setEnergyConsumer((EnergyConsumer)null);
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
			case WiresPhaseModelPackage.ENERGY_CONSUMER_PHASE__ENERGY_CONSUMER:
				return energyConsumer != null;
		}
		return super.eIsSet(featureID);
	}

} // EnergyConsumerPhase
