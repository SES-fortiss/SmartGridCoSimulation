/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61968.Metering.ServiceDeliveryPoint;

import CIM15.IEC61970.Core.ConductingEquipment;

import CIM15.IEC61970.LoadModel.LoadModelPackage;
import CIM15.IEC61970.LoadModel.LoadResponseCharacteristic;
import CIM15.IEC61970.LoadModel.PowerCutZone;

import CIM15.IEC61970.WiresPhaseModel.EnergyConsumerPhase;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getCustomerCount <em>Customer Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergyConsumer#getEnergyConsumerPhases <em>Energy Consumer Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnergyConsumer extends ConductingEquipment {
	/**
	 * The default value of the '{@link #getQfixedPct() <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixedPct()
	 * @generated
	 * @ordered
	 */
	protected static final float QFIXED_PCT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQfixedPct() <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixedPct()
	 * @generated
	 * @ordered
	 */
	protected float qfixedPct = QFIXED_PCT_EDEFAULT;

	/**
	 * This is true if the Qfixed Pct attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qfixedPctESet;

	/**
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * The default value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int customerCount = CUSTOMER_COUNT_EDEFAULT;

	/**
	 * This is true if the Customer Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customerCountESet;

	/**
	 * The default value of the '{@link #getPfixedPct() <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixedPct()
	 * @generated
	 * @ordered
	 */
	protected static final float PFIXED_PCT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPfixedPct() <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixedPct()
	 * @generated
	 * @ordered
	 */
	protected float pfixedPct = PFIXED_PCT_EDEFAULT;

	/**
	 * This is true if the Pfixed Pct attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pfixedPctESet;

	/**
	 * The default value of the '{@link #getPfixed() <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixed()
	 * @generated
	 * @ordered
	 */
	protected static final float PFIXED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPfixed() <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfixed()
	 * @generated
	 * @ordered
	 */
	protected float pfixed = PFIXED_EDEFAULT;

	/**
	 * This is true if the Pfixed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pfixedESet;

	/**
	 * The cached value of the '{@link #getLoadResponse() <em>Load Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadResponse()
	 * @generated
	 * @ordered
	 */
	protected LoadResponseCharacteristic loadResponse;

	/**
	 * The default value of the '{@link #getQfixed() <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixed()
	 * @generated
	 * @ordered
	 */
	protected static final float QFIXED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQfixed() <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQfixed()
	 * @generated
	 * @ordered
	 */
	protected float qfixed = QFIXED_EDEFAULT;

	/**
	 * This is true if the Qfixed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qfixedESet;

	/**
	 * The cached value of the '{@link #getPowerCutZone() <em>Power Cut Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCutZone()
	 * @generated
	 * @ordered
	 */
	protected PowerCutZone powerCutZone;

	/**
	 * The cached value of the '{@link #getEnergyConsumerPhases() <em>Energy Consumer Phases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumerPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyConsumerPhase> energyConsumerPhases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.ENERGY_CONSUMER;
	}

	/**
	 * Returns the value of the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qfixed Pct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qfixed Pct</em>' attribute.
	 * @see #isSetQfixedPct()
	 * @see #unsetQfixedPct()
	 * @see #setQfixedPct(float)
	 * @generated
	 */
	public float getQfixedPct() {
		return qfixedPct;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qfixed Pct</em>' attribute.
	 * @see #isSetQfixedPct()
	 * @see #unsetQfixedPct()
	 * @see #getQfixedPct()
	 * @generated
	 */
	public void setQfixedPct(float newQfixedPct) {
		qfixedPct = newQfixedPct;
		qfixedPctESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQfixedPct()
	 * @see #getQfixedPct()
	 * @see #setQfixedPct(float)
	 * @generated
	 */
	public void unsetQfixedPct() {
		qfixedPct = QFIXED_PCT_EDEFAULT;
		qfixedPctESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qfixed Pct</em>' attribute is set.
	 * @see #unsetQfixedPct()
	 * @see #getQfixedPct()
	 * @see #setQfixedPct(float)
	 * @generated
	 */
	public boolean isSetQfixedPct() {
		return qfixedPctESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new BasicInternalEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * Returns the value of the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Count</em>' attribute.
	 * @see #isSetCustomerCount()
	 * @see #unsetCustomerCount()
	 * @see #setCustomerCount(int)
	 * @generated
	 */
	public int getCustomerCount() {
		return customerCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getCustomerCount <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Count</em>' attribute.
	 * @see #isSetCustomerCount()
	 * @see #unsetCustomerCount()
	 * @see #getCustomerCount()
	 * @generated
	 */
	public void setCustomerCount(int newCustomerCount) {
		customerCount = newCustomerCount;
		customerCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getCustomerCount <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomerCount()
	 * @see #getCustomerCount()
	 * @see #setCustomerCount(int)
	 * @generated
	 */
	public void unsetCustomerCount() {
		customerCount = CUSTOMER_COUNT_EDEFAULT;
		customerCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getCustomerCount <em>Customer Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Customer Count</em>' attribute is set.
	 * @see #unsetCustomerCount()
	 * @see #getCustomerCount()
	 * @see #setCustomerCount(int)
	 * @generated
	 */
	public boolean isSetCustomerCount() {
		return customerCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pfixed Pct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pfixed Pct</em>' attribute.
	 * @see #isSetPfixedPct()
	 * @see #unsetPfixedPct()
	 * @see #setPfixedPct(float)
	 * @generated
	 */
	public float getPfixedPct() {
		return pfixedPct;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfixed Pct</em>' attribute.
	 * @see #isSetPfixedPct()
	 * @see #unsetPfixedPct()
	 * @see #getPfixedPct()
	 * @generated
	 */
	public void setPfixedPct(float newPfixedPct) {
		pfixedPct = newPfixedPct;
		pfixedPctESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPfixedPct()
	 * @see #getPfixedPct()
	 * @see #setPfixedPct(float)
	 * @generated
	 */
	public void unsetPfixedPct() {
		pfixedPct = PFIXED_PCT_EDEFAULT;
		pfixedPctESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pfixed Pct</em>' attribute is set.
	 * @see #unsetPfixedPct()
	 * @see #getPfixedPct()
	 * @see #setPfixedPct(float)
	 * @generated
	 */
	public boolean isSetPfixedPct() {
		return pfixedPctESet;
	}

	/**
	 * Returns the value of the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pfixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pfixed</em>' attribute.
	 * @see #isSetPfixed()
	 * @see #unsetPfixed()
	 * @see #setPfixed(float)
	 * @generated
	 */
	public float getPfixed() {
		return pfixed;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfixed</em>' attribute.
	 * @see #isSetPfixed()
	 * @see #unsetPfixed()
	 * @see #getPfixed()
	 * @generated
	 */
	public void setPfixed(float newPfixed) {
		pfixed = newPfixed;
		pfixedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPfixed()
	 * @see #getPfixed()
	 * @see #setPfixed(float)
	 * @generated
	 */
	public void unsetPfixed() {
		pfixed = PFIXED_EDEFAULT;
		pfixedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pfixed</em>' attribute is set.
	 * @see #unsetPfixed()
	 * @see #getPfixed()
	 * @see #setPfixed(float)
	 * @generated
	 */
	public boolean isSetPfixed() {
		return pfixedESet;
	}

	/**
	 * Returns the value of the '<em><b>Load Response</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Response</em>' reference.
	 * @see #setLoadResponse(LoadResponseCharacteristic)
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer
	 * @generated
	 */
	public LoadResponseCharacteristic getLoadResponse() {
		if (loadResponse != null && loadResponse.eIsProxy()) {
			InternalEObject oldLoadResponse = (InternalEObject)loadResponse;
			loadResponse = (LoadResponseCharacteristic)eResolveProxy(oldLoadResponse);
			if (loadResponse != oldLoadResponse) {
			}
		}
		return loadResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadResponseCharacteristic basicGetLoadResponse() {
		return loadResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadResponse(LoadResponseCharacteristic newLoadResponse, NotificationChain msgs) {
		LoadResponseCharacteristic oldLoadResponse = loadResponse;
		loadResponse = newLoadResponse;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Response</em>' reference.
	 * @see #getLoadResponse()
	 * @generated
	 */
	public void setLoadResponse(LoadResponseCharacteristic newLoadResponse) {
		if (newLoadResponse != loadResponse) {
			NotificationChain msgs = null;
			if (loadResponse != null)
				msgs = ((InternalEObject)loadResponse).eInverseRemove(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
			if (newLoadResponse != null)
				msgs = ((InternalEObject)newLoadResponse).eInverseAdd(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
			msgs = basicSetLoadResponse(newLoadResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qfixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qfixed</em>' attribute.
	 * @see #isSetQfixed()
	 * @see #unsetQfixed()
	 * @see #setQfixed(float)
	 * @generated
	 */
	public float getQfixed() {
		return qfixed;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qfixed</em>' attribute.
	 * @see #isSetQfixed()
	 * @see #unsetQfixed()
	 * @see #getQfixed()
	 * @generated
	 */
	public void setQfixed(float newQfixed) {
		qfixed = newQfixed;
		qfixedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQfixed()
	 * @see #getQfixed()
	 * @see #setQfixed(float)
	 * @generated
	 */
	public void unsetQfixed() {
		qfixed = QFIXED_EDEFAULT;
		qfixedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qfixed</em>' attribute is set.
	 * @see #unsetQfixed()
	 * @see #getQfixed()
	 * @see #setQfixed(float)
	 * @generated
	 */
	public boolean isSetQfixed() {
		return qfixedESet;
	}

	/**
	 * Returns the value of the '<em><b>Power Cut Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Cut Zone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Cut Zone</em>' reference.
	 * @see #setPowerCutZone(PowerCutZone)
	 * @see CIM15.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers
	 * @generated
	 */
	public PowerCutZone getPowerCutZone() {
		if (powerCutZone != null && powerCutZone.eIsProxy()) {
			InternalEObject oldPowerCutZone = (InternalEObject)powerCutZone;
			powerCutZone = (PowerCutZone)eResolveProxy(oldPowerCutZone);
			if (powerCutZone != oldPowerCutZone) {
			}
		}
		return powerCutZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCutZone basicGetPowerCutZone() {
		return powerCutZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerCutZone(PowerCutZone newPowerCutZone, NotificationChain msgs) {
		PowerCutZone oldPowerCutZone = powerCutZone;
		powerCutZone = newPowerCutZone;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Cut Zone</em>' reference.
	 * @see #getPowerCutZone()
	 * @generated
	 */
	public void setPowerCutZone(PowerCutZone newPowerCutZone) {
		if (newPowerCutZone != powerCutZone) {
			NotificationChain msgs = null;
			if (powerCutZone != null)
				msgs = ((InternalEObject)powerCutZone).eInverseRemove(this, LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs);
			if (newPowerCutZone != null)
				msgs = ((InternalEObject)newPowerCutZone).eInverseAdd(this, LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs);
			msgs = basicSetPowerCutZone(newPowerCutZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Energy Consumer Phases</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.WiresPhaseModel.EnergyConsumerPhase}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.WiresPhaseModel.EnergyConsumerPhase#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumer Phases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumer Phases</em>' reference list.
	 * @see CIM15.IEC61970.WiresPhaseModel.EnergyConsumerPhase#getEnergyConsumer
	 * @generated
	 */
	public EList<EnergyConsumerPhase> getEnergyConsumerPhases() {
		if (energyConsumerPhases == null) {
			energyConsumerPhases = new BasicInternalEList<EnergyConsumerPhase>(EnergyConsumerPhase.class);
		}
		return energyConsumerPhases;
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
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				if (loadResponse != null)
					msgs = ((InternalEObject)loadResponse).eInverseRemove(this, LoadModelPackage.LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER, LoadResponseCharacteristic.class, msgs);
				return basicSetLoadResponse((LoadResponseCharacteristic)otherEnd, msgs);
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				if (powerCutZone != null)
					msgs = ((InternalEObject)powerCutZone).eInverseRemove(this, LoadModelPackage.POWER_CUT_ZONE__ENERGY_CONSUMERS, PowerCutZone.class, msgs);
				return basicSetPowerCutZone((PowerCutZone)otherEnd, msgs);
			case WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyConsumerPhases()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				return basicSetLoadResponse(null, msgs);
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				return basicSetPowerCutZone(null, msgs);
			case WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES:
				return ((InternalEList<?>)getEnergyConsumerPhases()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				return getQfixedPct();
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
				return getCustomerCount();
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				return getPfixedPct();
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				return getPfixed();
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				if (resolve) return getLoadResponse();
				return basicGetLoadResponse();
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				return getQfixed();
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				if (resolve) return getPowerCutZone();
				return basicGetPowerCutZone();
			case WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES:
				return getEnergyConsumerPhases();
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
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				setQfixedPct((Float)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
				setCustomerCount((Integer)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				setPfixedPct((Float)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				setPfixed((Float)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				setLoadResponse((LoadResponseCharacteristic)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				setQfixed((Float)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				setPowerCutZone((PowerCutZone)newValue);
				return;
			case WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES:
				getEnergyConsumerPhases().clear();
				getEnergyConsumerPhases().addAll((Collection<? extends EnergyConsumerPhase>)newValue);
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
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				unsetQfixedPct();
				return;
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
				unsetCustomerCount();
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				unsetPfixedPct();
				return;
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				unsetPfixed();
				return;
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				setLoadResponse((LoadResponseCharacteristic)null);
				return;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				unsetQfixed();
				return;
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				setPowerCutZone((PowerCutZone)null);
				return;
			case WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES:
				getEnergyConsumerPhases().clear();
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
			case WiresPackage.ENERGY_CONSUMER__QFIXED_PCT:
				return isSetQfixedPct();
			case WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT:
				return isSetCustomerCount();
			case WiresPackage.ENERGY_CONSUMER__PFIXED_PCT:
				return isSetPfixedPct();
			case WiresPackage.ENERGY_CONSUMER__PFIXED:
				return isSetPfixed();
			case WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE:
				return loadResponse != null;
			case WiresPackage.ENERGY_CONSUMER__QFIXED:
				return isSetQfixed();
			case WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE:
				return powerCutZone != null;
			case WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES:
				return energyConsumerPhases != null && !energyConsumerPhases.isEmpty();
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
		result.append(" (qfixedPct: ");
		if (qfixedPctESet) result.append(qfixedPct); else result.append("<unset>");
		result.append(", customerCount: ");
		if (customerCountESet) result.append(customerCount); else result.append("<unset>");
		result.append(", pfixedPct: ");
		if (pfixedPctESet) result.append(pfixedPct); else result.append("<unset>");
		result.append(", pfixed: ");
		if (pfixedESet) result.append(pfixed); else result.append("<unset>");
		result.append(", qfixed: ");
		if (qfixedESet) result.append(qfixed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EnergyConsumer
