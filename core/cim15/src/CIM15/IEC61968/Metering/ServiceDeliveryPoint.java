/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.Customers.CustomerAgreement;
import CIM15.IEC61968.Customers.CustomersPackage;
import CIM15.IEC61968.Customers.PricingStructure;
import CIM15.IEC61968.Customers.ServiceCategory;
import CIM15.IEC61968.Customers.ServiceLocation;

import CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM15.IEC61968.PaymentMetering.ServiceSupplier;

import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PhaseCode;

import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.TransformerTank;
import CIM15.IEC61970.Wires.WiresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations <em>SDP Locations</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling <em>Check Billing</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad <em>Estimated Load</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower <em>Rated Power</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority <em>Service Priority</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isGrounded <em>Grounded</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark <em>Service Delivery Remark</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference <em>Ctpt Reference</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getTransformerTanks <em>Transformer Tanks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDeliveryPoint extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getSDPLocations() <em>SDP Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDPLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<SDPLocation> sdpLocations;

	/**
	 * The cached value of the '{@link #getServiceLocation() <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLocation()
	 * @generated
	 * @ordered
	 */
	protected ServiceLocation serviceLocation;

	/**
	 * The default value of the '{@link #isCheckBilling() <em>Check Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckBilling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_BILLING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckBilling() <em>Check Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckBilling()
	 * @generated
	 * @ordered
	 */
	protected boolean checkBilling = CHECK_BILLING_EDEFAULT;

	/**
	 * This is true if the Check Billing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkBillingESet;

	/**
	 * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDevice> endDevices;

	/**
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

	/**
	 * The default value of the '{@link #getEstimatedLoad() <em>Estimated Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final float ESTIMATED_LOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstimatedLoad() <em>Estimated Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedLoad()
	 * @generated
	 * @ordered
	 */
	protected float estimatedLoad = ESTIMATED_LOAD_EDEFAULT;

	/**
	 * This is true if the Estimated Load attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedLoadESet;

	/**
	 * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategory()
	 * @generated
	 * @ordered
	 */
	protected ServiceCategory serviceCategory;

	/**
	 * The default value of the '{@link #getRatedPower() <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPower()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedPower() <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPower()
	 * @generated
	 * @ordered
	 */
	protected float ratedPower = RATED_POWER_EDEFAULT;

	/**
	 * This is true if the Rated Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedPowerESet;

	/**
	 * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingStructure> pricingStructures;

	/**
	 * The default value of the '{@link #getServicePriority() <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePriority()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServicePriority() <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePriority()
	 * @generated
	 * @ordered
	 */
	protected String servicePriority = SERVICE_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Service Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean servicePriorityESet;

	/**
	 * The default value of the '{@link #isGrounded() <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUNDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrounded() <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrounded()
	 * @generated
	 * @ordered
	 */
	protected boolean grounded = GROUNDED_EDEFAULT;

	/**
	 * This is true if the Grounded attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundedESet;

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
	 * The default value of the '{@link #getServiceDeliveryRemark() <em>Service Delivery Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DELIVERY_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDeliveryRemark() <em>Service Delivery Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryRemark()
	 * @generated
	 * @ordered
	 */
	protected String serviceDeliveryRemark = SERVICE_DELIVERY_REMARK_EDEFAULT;

	/**
	 * This is true if the Service Delivery Remark attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serviceDeliveryRemarkESet;

	/**
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.S12_N;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

	/**
	 * This is true if the Phase Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCodeESet;

	/**
	 * The cached value of the '{@link #getServiceSupplier() <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSupplier()
	 * @generated
	 * @ordered
	 */
	protected ServiceSupplier serviceSupplier;

	/**
	 * The default value of the '{@link #getCtptReference() <em>Ctpt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtptReference()
	 * @generated
	 * @ordered
	 */
	protected static final int CTPT_REFERENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCtptReference() <em>Ctpt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtptReference()
	 * @generated
	 * @ordered
	 */
	protected int ctptReference = CTPT_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Ctpt Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctptReferenceESet;

	/**
	 * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreement()
	 * @generated
	 * @ordered
	 */
	protected CustomerAgreement customerAgreement;

	/**
	 * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratedCurrent = RATED_CURRENT_EDEFAULT;

	/**
	 * This is true if the Rated Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedCurrentESet;

	/**
	 * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Rated Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedVoltageESet;

	/**
	 * The cached value of the '{@link #getTransformerTanks() <em>Transformer Tanks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerTanks()
	 * @generated
	 * @ordered
	 */
	protected TransformerTank transformerTanks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDeliveryPoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.SERVICE_DELIVERY_POINT;
	}

	/**
	 * Returns the value of the '<em><b>SDP Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.SDPLocation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SDP Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDP Locations</em>' reference list.
	 * @see CIM15.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints
	 * @generated
	 */
	public EList<SDPLocation> getSDPLocations() {
		if (sdpLocations == null) {
			sdpLocations = new BasicInternalEList<SDPLocation>(SDPLocation.class);
		}
		return sdpLocations;
	}

	/**
	 * Returns the value of the '<em><b>Service Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.ServiceLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Location</em>' reference.
	 * @see #setServiceLocation(ServiceLocation)
	 * @see CIM15.IEC61968.Customers.ServiceLocation#getServiceDeliveryPoints
	 * @generated
	 */
	public ServiceLocation getServiceLocation() {
		if (serviceLocation != null && serviceLocation.eIsProxy()) {
			InternalEObject oldServiceLocation = (InternalEObject)serviceLocation;
			serviceLocation = (ServiceLocation)eResolveProxy(oldServiceLocation);
			if (serviceLocation != oldServiceLocation) {
			}
		}
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLocation basicGetServiceLocation() {
		return serviceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLocation(ServiceLocation newServiceLocation, NotificationChain msgs) {
		ServiceLocation oldServiceLocation = serviceLocation;
		serviceLocation = newServiceLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceLocation <em>Service Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Location</em>' reference.
	 * @see #getServiceLocation()
	 * @generated
	 */
	public void setServiceLocation(ServiceLocation newServiceLocation) {
		if (newServiceLocation != serviceLocation) {
			NotificationChain msgs = null;
			if (serviceLocation != null)
				msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS, ServiceLocation.class, msgs);
			if (newServiceLocation != null)
				msgs = ((InternalEObject)newServiceLocation).eInverseAdd(this, CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS, ServiceLocation.class, msgs);
			msgs = basicSetServiceLocation(newServiceLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Check Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Billing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Billing</em>' attribute.
	 * @see #isSetCheckBilling()
	 * @see #unsetCheckBilling()
	 * @see #setCheckBilling(boolean)
	 * @generated
	 */
	public boolean isCheckBilling() {
		return checkBilling;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling <em>Check Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Billing</em>' attribute.
	 * @see #isSetCheckBilling()
	 * @see #unsetCheckBilling()
	 * @see #isCheckBilling()
	 * @generated
	 */
	public void setCheckBilling(boolean newCheckBilling) {
		checkBilling = newCheckBilling;
		checkBillingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling <em>Check Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckBilling()
	 * @see #isCheckBilling()
	 * @see #setCheckBilling(boolean)
	 * @generated
	 */
	public void unsetCheckBilling() {
		checkBilling = CHECK_BILLING_EDEFAULT;
		checkBillingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isCheckBilling <em>Check Billing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Check Billing</em>' attribute is set.
	 * @see #unsetCheckBilling()
	 * @see #isCheckBilling()
	 * @see #setCheckBilling(boolean)
	 * @generated
	 */
	public boolean isSetCheckBilling() {
		return checkBillingESet;
	}

	/**
	 * Returns the value of the '<em><b>End Devices</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDevice}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDevice#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Devices</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDevice#getServiceDeliveryPoint
	 * @generated
	 */
	public EList<EndDevice> getEndDevices() {
		if (endDevices == null) {
			endDevices = new BasicInternalEList<EndDevice>(EndDevice.class);
		}
		return endDevices;
	}

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.MeterReading}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.MeterReading#getServiceDeliveryPoint <em>Service Delivery Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' reference list.
	 * @see CIM15.IEC61968.Metering.MeterReading#getServiceDeliveryPoint
	 * @generated
	 */
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new BasicInternalEList<MeterReading>(MeterReading.class);
		}
		return meterReadings;
	}

	/**
	 * Returns the value of the '<em><b>Estimated Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Load</em>' attribute.
	 * @see #isSetEstimatedLoad()
	 * @see #unsetEstimatedLoad()
	 * @see #setEstimatedLoad(float)
	 * @generated
	 */
	public float getEstimatedLoad() {
		return estimatedLoad;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad <em>Estimated Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Load</em>' attribute.
	 * @see #isSetEstimatedLoad()
	 * @see #unsetEstimatedLoad()
	 * @see #getEstimatedLoad()
	 * @generated
	 */
	public void setEstimatedLoad(float newEstimatedLoad) {
		estimatedLoad = newEstimatedLoad;
		estimatedLoadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad <em>Estimated Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedLoad()
	 * @see #getEstimatedLoad()
	 * @see #setEstimatedLoad(float)
	 * @generated
	 */
	public void unsetEstimatedLoad() {
		estimatedLoad = ESTIMATED_LOAD_EDEFAULT;
		estimatedLoadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEstimatedLoad <em>Estimated Load</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Load</em>' attribute is set.
	 * @see #unsetEstimatedLoad()
	 * @see #getEstimatedLoad()
	 * @see #setEstimatedLoad(float)
	 * @generated
	 */
	public boolean isSetEstimatedLoad() {
		return estimatedLoadESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.ServiceCategory#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' reference.
	 * @see #setServiceCategory(ServiceCategory)
	 * @see CIM15.IEC61968.Customers.ServiceCategory#getServiceDeliveryPoints
	 * @generated
	 */
	public ServiceCategory getServiceCategory() {
		if (serviceCategory != null && serviceCategory.eIsProxy()) {
			InternalEObject oldServiceCategory = (InternalEObject)serviceCategory;
			serviceCategory = (ServiceCategory)eResolveProxy(oldServiceCategory);
			if (serviceCategory != oldServiceCategory) {
			}
		}
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory basicGetServiceCategory() {
		return serviceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceCategory(ServiceCategory newServiceCategory, NotificationChain msgs) {
		ServiceCategory oldServiceCategory = serviceCategory;
		serviceCategory = newServiceCategory;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceCategory <em>Service Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Category</em>' reference.
	 * @see #getServiceCategory()
	 * @generated
	 */
	public void setServiceCategory(ServiceCategory newServiceCategory) {
		if (newServiceCategory != serviceCategory) {
			NotificationChain msgs = null;
			if (serviceCategory != null)
				msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS, ServiceCategory.class, msgs);
			if (newServiceCategory != null)
				msgs = ((InternalEObject)newServiceCategory).eInverseAdd(this, CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS, ServiceCategory.class, msgs);
			msgs = basicSetServiceCategory(newServiceCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Rated Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Power</em>' attribute.
	 * @see #isSetRatedPower()
	 * @see #unsetRatedPower()
	 * @see #setRatedPower(float)
	 * @generated
	 */
	public float getRatedPower() {
		return ratedPower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Power</em>' attribute.
	 * @see #isSetRatedPower()
	 * @see #unsetRatedPower()
	 * @see #getRatedPower()
	 * @generated
	 */
	public void setRatedPower(float newRatedPower) {
		ratedPower = newRatedPower;
		ratedPowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedPower()
	 * @see #getRatedPower()
	 * @see #setRatedPower(float)
	 * @generated
	 */
	public void unsetRatedPower() {
		ratedPower = RATED_POWER_EDEFAULT;
		ratedPowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedPower <em>Rated Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Power</em>' attribute is set.
	 * @see #unsetRatedPower()
	 * @see #getRatedPower()
	 * @see #setRatedPower(float)
	 * @generated
	 */
	public boolean isSetRatedPower() {
		return ratedPowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Pricing Structures</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.PricingStructure}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.PricingStructure#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Structures</em>' reference list.
	 * @see CIM15.IEC61968.Customers.PricingStructure#getServiceDeliveryPoints
	 * @generated
	 */
	public EList<PricingStructure> getPricingStructures() {
		if (pricingStructures == null) {
			pricingStructures = new BasicInternalEList<PricingStructure>(PricingStructure.class);
		}
		return pricingStructures;
	}

	/**
	 * Returns the value of the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Priority</em>' attribute.
	 * @see #isSetServicePriority()
	 * @see #unsetServicePriority()
	 * @see #setServicePriority(String)
	 * @generated
	 */
	public String getServicePriority() {
		return servicePriority;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Priority</em>' attribute.
	 * @see #isSetServicePriority()
	 * @see #unsetServicePriority()
	 * @see #getServicePriority()
	 * @generated
	 */
	public void setServicePriority(String newServicePriority) {
		servicePriority = newServicePriority;
		servicePriorityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServicePriority()
	 * @see #getServicePriority()
	 * @see #setServicePriority(String)
	 * @generated
	 */
	public void unsetServicePriority() {
		servicePriority = SERVICE_PRIORITY_EDEFAULT;
		servicePriorityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServicePriority <em>Service Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Priority</em>' attribute is set.
	 * @see #unsetServicePriority()
	 * @see #getServicePriority()
	 * @see #setServicePriority(String)
	 * @generated
	 */
	public boolean isSetServicePriority() {
		return servicePriorityESet;
	}

	/**
	 * Returns the value of the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded</em>' attribute.
	 * @see #isSetGrounded()
	 * @see #unsetGrounded()
	 * @see #setGrounded(boolean)
	 * @generated
	 */
	public boolean isGrounded() {
		return grounded;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isGrounded <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounded</em>' attribute.
	 * @see #isSetGrounded()
	 * @see #unsetGrounded()
	 * @see #isGrounded()
	 * @generated
	 */
	public void setGrounded(boolean newGrounded) {
		grounded = newGrounded;
		groundedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isGrounded <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrounded()
	 * @see #isGrounded()
	 * @see #setGrounded(boolean)
	 * @generated
	 */
	public void unsetGrounded() {
		grounded = GROUNDED_EDEFAULT;
		groundedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#isGrounded <em>Grounded</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grounded</em>' attribute is set.
	 * @see #unsetGrounded()
	 * @see #isGrounded()
	 * @see #setGrounded(boolean)
	 * @generated
	 */
	public boolean isSetGrounded() {
		return groundedESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Consumer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumer</em>' reference.
	 * @see #setEnergyConsumer(EnergyConsumer)
	 * @see CIM15.IEC61970.Wires.EnergyConsumer#getServiceDeliveryPoints
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
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEnergyConsumer <em>Energy Consumer</em>}' reference.
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
				msgs = ((InternalEObject)energyConsumer).eInverseRemove(this, WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS, EnergyConsumer.class, msgs);
			if (newEnergyConsumer != null)
				msgs = ((InternalEObject)newEnergyConsumer).eInverseAdd(this, WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS, EnergyConsumer.class, msgs);
			msgs = basicSetEnergyConsumer(newEnergyConsumer, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Remark</em>' attribute.
	 * @see #isSetServiceDeliveryRemark()
	 * @see #unsetServiceDeliveryRemark()
	 * @see #setServiceDeliveryRemark(String)
	 * @generated
	 */
	public String getServiceDeliveryRemark() {
		return serviceDeliveryRemark;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark <em>Service Delivery Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delivery Remark</em>' attribute.
	 * @see #isSetServiceDeliveryRemark()
	 * @see #unsetServiceDeliveryRemark()
	 * @see #getServiceDeliveryRemark()
	 * @generated
	 */
	public void setServiceDeliveryRemark(String newServiceDeliveryRemark) {
		serviceDeliveryRemark = newServiceDeliveryRemark;
		serviceDeliveryRemarkESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark <em>Service Delivery Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceDeliveryRemark()
	 * @see #getServiceDeliveryRemark()
	 * @see #setServiceDeliveryRemark(String)
	 * @generated
	 */
	public void unsetServiceDeliveryRemark() {
		serviceDeliveryRemark = SERVICE_DELIVERY_REMARK_EDEFAULT;
		serviceDeliveryRemarkESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceDeliveryRemark <em>Service Delivery Remark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Delivery Remark</em>' attribute is set.
	 * @see #unsetServiceDeliveryRemark()
	 * @see #getServiceDeliveryRemark()
	 * @see #setServiceDeliveryRemark(String)
	 * @generated
	 */
	public boolean isSetServiceDeliveryRemark() {
		return serviceDeliveryRemarkESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhaseCode()
	 * @see #unsetPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhaseCode()
	 * @see #unsetPhaseCode()
	 * @see #getPhaseCode()
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		phaseCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCode()
	 * @see #getPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public void unsetPhaseCode() {
		phaseCode = PHASE_CODE_EDEFAULT;
		phaseCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getPhaseCode <em>Phase Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Code</em>' attribute is set.
	 * @see #unsetPhaseCode()
	 * @see #getPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public boolean isSetPhaseCode() {
		return phaseCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Supplier</em>' reference.
	 * @see #setServiceSupplier(ServiceSupplier)
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints
	 * @generated
	 */
	public ServiceSupplier getServiceSupplier() {
		if (serviceSupplier != null && serviceSupplier.eIsProxy()) {
			InternalEObject oldServiceSupplier = (InternalEObject)serviceSupplier;
			serviceSupplier = (ServiceSupplier)eResolveProxy(oldServiceSupplier);
			if (serviceSupplier != oldServiceSupplier) {
			}
		}
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier basicGetServiceSupplier() {
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSupplier(ServiceSupplier newServiceSupplier, NotificationChain msgs) {
		ServiceSupplier oldServiceSupplier = serviceSupplier;
		serviceSupplier = newServiceSupplier;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getServiceSupplier <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Supplier</em>' reference.
	 * @see #getServiceSupplier()
	 * @generated
	 */
	public void setServiceSupplier(ServiceSupplier newServiceSupplier) {
		if (newServiceSupplier != serviceSupplier) {
			NotificationChain msgs = null;
			if (serviceSupplier != null)
				msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS, ServiceSupplier.class, msgs);
			if (newServiceSupplier != null)
				msgs = ((InternalEObject)newServiceSupplier).eInverseAdd(this, PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS, ServiceSupplier.class, msgs);
			msgs = basicSetServiceSupplier(newServiceSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Ctpt Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctpt Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctpt Reference</em>' attribute.
	 * @see #isSetCtptReference()
	 * @see #unsetCtptReference()
	 * @see #setCtptReference(int)
	 * @generated
	 */
	public int getCtptReference() {
		return ctptReference;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference <em>Ctpt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctpt Reference</em>' attribute.
	 * @see #isSetCtptReference()
	 * @see #unsetCtptReference()
	 * @see #getCtptReference()
	 * @generated
	 */
	public void setCtptReference(int newCtptReference) {
		ctptReference = newCtptReference;
		ctptReferenceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference <em>Ctpt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtptReference()
	 * @see #getCtptReference()
	 * @see #setCtptReference(int)
	 * @generated
	 */
	public void unsetCtptReference() {
		ctptReference = CTPT_REFERENCE_EDEFAULT;
		ctptReferenceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCtptReference <em>Ctpt Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ctpt Reference</em>' attribute is set.
	 * @see #unsetCtptReference()
	 * @see #getCtptReference()
	 * @see #setCtptReference(int)
	 * @generated
	 */
	public boolean isSetCtptReference() {
		return ctptReferenceESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreement</em>' reference.
	 * @see #setCustomerAgreement(CustomerAgreement)
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getServiceDeliveryPoints
	 * @generated
	 */
	public CustomerAgreement getCustomerAgreement() {
		if (customerAgreement != null && customerAgreement.eIsProxy()) {
			InternalEObject oldCustomerAgreement = (InternalEObject)customerAgreement;
			customerAgreement = (CustomerAgreement)eResolveProxy(oldCustomerAgreement);
			if (customerAgreement != oldCustomerAgreement) {
			}
		}
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement basicGetCustomerAgreement() {
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAgreement(CustomerAgreement newCustomerAgreement, NotificationChain msgs) {
		CustomerAgreement oldCustomerAgreement = customerAgreement;
		customerAgreement = newCustomerAgreement;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getCustomerAgreement <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Agreement</em>' reference.
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	public void setCustomerAgreement(CustomerAgreement newCustomerAgreement) {
		if (newCustomerAgreement != customerAgreement) {
			NotificationChain msgs = null;
			if (customerAgreement != null)
				msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS, CustomerAgreement.class, msgs);
			if (newCustomerAgreement != null)
				msgs = ((InternalEObject)newCustomerAgreement).eInverseAdd(this, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS, CustomerAgreement.class, msgs);
			msgs = basicSetCustomerAgreement(newCustomerAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #isSetRatedCurrent()
	 * @see #unsetRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public float getRatedCurrent() {
		return ratedCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #isSetRatedCurrent()
	 * @see #unsetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @generated
	 */
	public void setRatedCurrent(float newRatedCurrent) {
		ratedCurrent = newRatedCurrent;
		ratedCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public void unsetRatedCurrent() {
		ratedCurrent = RATED_CURRENT_EDEFAULT;
		ratedCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedCurrent <em>Rated Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Current</em>' attribute is set.
	 * @see #unsetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public boolean isSetRatedCurrent() {
		return ratedCurrentESet;
	}

	/**
	 * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Voltage</em>' attribute.
	 * @see #isSetRatedVoltage()
	 * @see #unsetRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public float getRatedVoltage() {
		return ratedVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Voltage</em>' attribute.
	 * @see #isSetRatedVoltage()
	 * @see #unsetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @generated
	 */
	public void setRatedVoltage(float newRatedVoltage) {
		ratedVoltage = newRatedVoltage;
		ratedVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public void unsetRatedVoltage() {
		ratedVoltage = RATED_VOLTAGE_EDEFAULT;
		ratedVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Voltage</em>' attribute is set.
	 * @see #unsetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public boolean isSetRatedVoltage() {
		return ratedVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Tanks</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerTank#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Tanks</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Tanks</em>' reference.
	 * @see #setTransformerTanks(TransformerTank)
	 * @see CIM15.IEC61970.Wires.TransformerTank#getServiceDeliveryPoints
	 * @generated
	 */
	public TransformerTank getTransformerTanks() {
		if (transformerTanks != null && transformerTanks.eIsProxy()) {
			InternalEObject oldTransformerTanks = (InternalEObject)transformerTanks;
			transformerTanks = (TransformerTank)eResolveProxy(oldTransformerTanks);
			if (transformerTanks != oldTransformerTanks) {
			}
		}
		return transformerTanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTank basicGetTransformerTanks() {
		return transformerTanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerTanks(TransformerTank newTransformerTanks, NotificationChain msgs) {
		TransformerTank oldTransformerTanks = transformerTanks;
		transformerTanks = newTransformerTanks;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getTransformerTanks <em>Transformer Tanks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Tanks</em>' reference.
	 * @see #getTransformerTanks()
	 * @generated
	 */
	public void setTransformerTanks(TransformerTank newTransformerTanks) {
		if (newTransformerTanks != transformerTanks) {
			NotificationChain msgs = null;
			if (transformerTanks != null)
				msgs = ((InternalEObject)transformerTanks).eInverseRemove(this, WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS, TransformerTank.class, msgs);
			if (newTransformerTanks != null)
				msgs = ((InternalEObject)newTransformerTanks).eInverseAdd(this, WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS, TransformerTank.class, msgs);
			msgs = basicSetTransformerTanks(newTransformerTanks, msgs);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSDPLocations()).basicAdd(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				if (serviceLocation != null)
					msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS, ServiceLocation.class, msgs);
				return basicSetServiceLocation((ServiceLocation)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDevices()).basicAdd(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				if (serviceCategory != null)
					msgs = ((InternalEObject)serviceCategory).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS, ServiceCategory.class, msgs);
				return basicSetServiceCategory((ServiceCategory)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPricingStructures()).basicAdd(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				if (energyConsumer != null)
					msgs = ((InternalEObject)energyConsumer).eInverseRemove(this, WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS, EnergyConsumer.class, msgs);
				return basicSetEnergyConsumer((EnergyConsumer)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				if (serviceSupplier != null)
					msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS, ServiceSupplier.class, msgs);
				return basicSetServiceSupplier((ServiceSupplier)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				if (customerAgreement != null)
					msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_DELIVERY_POINTS, CustomerAgreement.class, msgs);
				return basicSetCustomerAgreement((CustomerAgreement)otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER_TANKS:
				if (transformerTanks != null)
					msgs = ((InternalEObject)transformerTanks).eInverseRemove(this, WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS, TransformerTank.class, msgs);
				return basicSetTransformerTanks((TransformerTank)otherEnd, msgs);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				return ((InternalEList<?>)getSDPLocations()).basicRemove(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				return basicSetServiceLocation(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES:
				return ((InternalEList<?>)getEndDevices()).basicRemove(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				return basicSetServiceCategory(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				return ((InternalEList<?>)getPricingStructures()).basicRemove(otherEnd, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				return basicSetEnergyConsumer(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				return basicSetServiceSupplier(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				return basicSetCustomerAgreement(null, msgs);
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER_TANKS:
				return basicSetTransformerTanks(null, msgs);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				return getSDPLocations();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				if (resolve) return getServiceLocation();
				return basicGetServiceLocation();
			case MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING:
				return isCheckBilling();
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES:
				return getEndDevices();
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				return getMeterReadings();
			case MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD:
				return getEstimatedLoad();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				if (resolve) return getServiceCategory();
				return basicGetServiceCategory();
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER:
				return getRatedPower();
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				return getPricingStructures();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY:
				return getServicePriority();
			case MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED:
				return isGrounded();
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				if (resolve) return getEnergyConsumer();
				return basicGetEnergyConsumer();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK:
				return getServiceDeliveryRemark();
			case MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE:
				return getPhaseCode();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				if (resolve) return getServiceSupplier();
				return basicGetServiceSupplier();
			case MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE:
				return getCtptReference();
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				if (resolve) return getCustomerAgreement();
				return basicGetCustomerAgreement();
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT:
				return getRatedCurrent();
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_VOLTAGE:
				return getRatedVoltage();
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER_TANKS:
				if (resolve) return getTransformerTanks();
				return basicGetTransformerTanks();
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				getSDPLocations().clear();
				getSDPLocations().addAll((Collection<? extends SDPLocation>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING:
				setCheckBilling((Boolean)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES:
				getEndDevices().clear();
				getEndDevices().addAll((Collection<? extends EndDevice>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD:
				setEstimatedLoad((Float)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER:
				setRatedPower((Float)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				getPricingStructures().clear();
				getPricingStructures().addAll((Collection<? extends PricingStructure>)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY:
				setServicePriority((String)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED:
				setGrounded((Boolean)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				setEnergyConsumer((EnergyConsumer)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK:
				setServiceDeliveryRemark((String)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE:
				setCtptReference((Integer)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER_TANKS:
				setTransformerTanks((TransformerTank)newValue);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				getSDPLocations().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING:
				unsetCheckBilling();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES:
				getEndDevices().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				getMeterReadings().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD:
				unsetEstimatedLoad();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				setServiceCategory((ServiceCategory)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER:
				unsetRatedPower();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				getPricingStructures().clear();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY:
				unsetServicePriority();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED:
				unsetGrounded();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				setEnergyConsumer((EnergyConsumer)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK:
				unsetServiceDeliveryRemark();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE:
				unsetPhaseCode();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE:
				unsetCtptReference();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)null);
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT:
				unsetRatedCurrent();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_VOLTAGE:
				unsetRatedVoltage();
				return;
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER_TANKS:
				setTransformerTanks((TransformerTank)null);
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
			case MeteringPackage.SERVICE_DELIVERY_POINT__SDP_LOCATIONS:
				return sdpLocations != null && !sdpLocations.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION:
				return serviceLocation != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CHECK_BILLING:
				return isSetCheckBilling();
			case MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES:
				return endDevices != null && !endDevices.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__ESTIMATED_LOAD:
				return isSetEstimatedLoad();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY:
				return serviceCategory != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_POWER:
				return isSetRatedPower();
			case MeteringPackage.SERVICE_DELIVERY_POINT__PRICING_STRUCTURES:
				return pricingStructures != null && !pricingStructures.isEmpty();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_PRIORITY:
				return isSetServicePriority();
			case MeteringPackage.SERVICE_DELIVERY_POINT__GROUNDED:
				return isSetGrounded();
			case MeteringPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				return energyConsumer != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_DELIVERY_REMARK:
				return isSetServiceDeliveryRemark();
			case MeteringPackage.SERVICE_DELIVERY_POINT__PHASE_CODE:
				return isSetPhaseCode();
			case MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER:
				return serviceSupplier != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__CTPT_REFERENCE:
				return isSetCtptReference();
			case MeteringPackage.SERVICE_DELIVERY_POINT__CUSTOMER_AGREEMENT:
				return customerAgreement != null;
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_CURRENT:
				return isSetRatedCurrent();
			case MeteringPackage.SERVICE_DELIVERY_POINT__RATED_VOLTAGE:
				return isSetRatedVoltage();
			case MeteringPackage.SERVICE_DELIVERY_POINT__TRANSFORMER_TANKS:
				return transformerTanks != null;
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
		result.append(" (checkBilling: ");
		if (checkBillingESet) result.append(checkBilling); else result.append("<unset>");
		result.append(", estimatedLoad: ");
		if (estimatedLoadESet) result.append(estimatedLoad); else result.append("<unset>");
		result.append(", ratedPower: ");
		if (ratedPowerESet) result.append(ratedPower); else result.append("<unset>");
		result.append(", servicePriority: ");
		if (servicePriorityESet) result.append(servicePriority); else result.append("<unset>");
		result.append(", grounded: ");
		if (groundedESet) result.append(grounded); else result.append("<unset>");
		result.append(", serviceDeliveryRemark: ");
		if (serviceDeliveryRemarkESet) result.append(serviceDeliveryRemark); else result.append("<unset>");
		result.append(", phaseCode: ");
		if (phaseCodeESet) result.append(phaseCode); else result.append("<unset>");
		result.append(", ctptReference: ");
		if (ctptReferenceESet) result.append(ctptReference); else result.append("<unset>");
		result.append(", ratedCurrent: ");
		if (ratedCurrentESet) result.append(ratedCurrent); else result.append("<unset>");
		result.append(", ratedVoltage: ");
		if (ratedVoltageESet) result.append(ratedVoltage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ServiceDeliveryPoint
