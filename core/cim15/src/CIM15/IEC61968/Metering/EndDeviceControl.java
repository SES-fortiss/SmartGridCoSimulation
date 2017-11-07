/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.Customers.CustomerAgreement;
import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.DateTimeInterval;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory <em>Dr Program Mandatory</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#getType <em>Type</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup <em>End Device Group</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#getEndDevice <em>End Device</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceControl#getPriceSignal <em>Price Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndDeviceControl extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getDemandResponseProgram() <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandResponseProgram()
	 * @generated
	 * @ordered
	 */
	protected DemandResponseProgram demandResponseProgram;

	/**
	 * The default value of the '{@link #getDrProgramLevel() <em>Dr Program Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrProgramLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int DR_PROGRAM_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDrProgramLevel() <em>Dr Program Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrProgramLevel()
	 * @generated
	 * @ordered
	 */
	protected int drProgramLevel = DR_PROGRAM_LEVEL_EDEFAULT;

	/**
	 * This is true if the Dr Program Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drProgramLevelESet;

	/**
	 * The default value of the '{@link #isDrProgramMandatory() <em>Dr Program Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDrProgramMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DR_PROGRAM_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDrProgramMandatory() <em>Dr Program Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDrProgramMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean drProgramMandatory = DR_PROGRAM_MANDATORY_EDEFAULT;

	/**
	 * This is true if the Dr Program Mandatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drProgramMandatoryESet;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getScheduledInterval() <em>Scheduled Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval scheduledInterval;

	/**
	 * The cached value of the '{@link #getEndDeviceGroup() <em>End Device Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceGroup()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceGroup endDeviceGroup;

	/**
	 * The cached value of the '{@link #getEndDevice() <em>End Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDevice()
	 * @generated
	 * @ordered
	 */
	protected EndDevice endDevice;

	/**
	 * The default value of the '{@link #getPriceSignal() <em>Price Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceSignal()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_SIGNAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPriceSignal() <em>Price Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceSignal()
	 * @generated
	 * @ordered
	 */
	protected float priceSignal = PRICE_SIGNAL_EDEFAULT;

	/**
	 * This is true if the Price Signal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priceSignalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceControl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE_CONTROL;
	}

	/**
	 * Returns the value of the '<em><b>Demand Response Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Response Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Response Program</em>' reference.
	 * @see #setDemandResponseProgram(DemandResponseProgram)
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceControls
	 * @generated
	 */
	public DemandResponseProgram getDemandResponseProgram() {
		if (demandResponseProgram != null && demandResponseProgram.eIsProxy()) {
			InternalEObject oldDemandResponseProgram = (InternalEObject)demandResponseProgram;
			demandResponseProgram = (DemandResponseProgram)eResolveProxy(oldDemandResponseProgram);
			if (demandResponseProgram != oldDemandResponseProgram) {
			}
		}
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandResponseProgram basicGetDemandResponseProgram() {
		return demandResponseProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandResponseProgram(DemandResponseProgram newDemandResponseProgram, NotificationChain msgs) {
		DemandResponseProgram oldDemandResponseProgram = demandResponseProgram;
		demandResponseProgram = newDemandResponseProgram;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getDemandResponseProgram <em>Demand Response Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand Response Program</em>' reference.
	 * @see #getDemandResponseProgram()
	 * @generated
	 */
	public void setDemandResponseProgram(DemandResponseProgram newDemandResponseProgram) {
		if (newDemandResponseProgram != demandResponseProgram) {
			NotificationChain msgs = null;
			if (demandResponseProgram != null)
				msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS, DemandResponseProgram.class, msgs);
			if (newDemandResponseProgram != null)
				msgs = ((InternalEObject)newDemandResponseProgram).eInverseAdd(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS, DemandResponseProgram.class, msgs);
			msgs = basicSetDemandResponseProgram(newDemandResponseProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Dr Program Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dr Program Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dr Program Level</em>' attribute.
	 * @see #isSetDrProgramLevel()
	 * @see #unsetDrProgramLevel()
	 * @see #setDrProgramLevel(int)
	 * @generated
	 */
	public int getDrProgramLevel() {
		return drProgramLevel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dr Program Level</em>' attribute.
	 * @see #isSetDrProgramLevel()
	 * @see #unsetDrProgramLevel()
	 * @see #getDrProgramLevel()
	 * @generated
	 */
	public void setDrProgramLevel(int newDrProgramLevel) {
		drProgramLevel = newDrProgramLevel;
		drProgramLevelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrProgramLevel()
	 * @see #getDrProgramLevel()
	 * @see #setDrProgramLevel(int)
	 * @generated
	 */
	public void unsetDrProgramLevel() {
		drProgramLevel = DR_PROGRAM_LEVEL_EDEFAULT;
		drProgramLevelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getDrProgramLevel <em>Dr Program Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dr Program Level</em>' attribute is set.
	 * @see #unsetDrProgramLevel()
	 * @see #getDrProgramLevel()
	 * @see #setDrProgramLevel(int)
	 * @generated
	 */
	public boolean isSetDrProgramLevel() {
		return drProgramLevelESet;
	}

	/**
	 * Returns the value of the '<em><b>Dr Program Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dr Program Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dr Program Mandatory</em>' attribute.
	 * @see #isSetDrProgramMandatory()
	 * @see #unsetDrProgramMandatory()
	 * @see #setDrProgramMandatory(boolean)
	 * @generated
	 */
	public boolean isDrProgramMandatory() {
		return drProgramMandatory;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory <em>Dr Program Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dr Program Mandatory</em>' attribute.
	 * @see #isSetDrProgramMandatory()
	 * @see #unsetDrProgramMandatory()
	 * @see #isDrProgramMandatory()
	 * @generated
	 */
	public void setDrProgramMandatory(boolean newDrProgramMandatory) {
		drProgramMandatory = newDrProgramMandatory;
		drProgramMandatoryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory <em>Dr Program Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrProgramMandatory()
	 * @see #isDrProgramMandatory()
	 * @see #setDrProgramMandatory(boolean)
	 * @generated
	 */
	public void unsetDrProgramMandatory() {
		drProgramMandatory = DR_PROGRAM_MANDATORY_EDEFAULT;
		drProgramMandatoryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#isDrProgramMandatory <em>Dr Program Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dr Program Mandatory</em>' attribute is set.
	 * @see #unsetDrProgramMandatory()
	 * @see #isDrProgramMandatory()
	 * @see #setDrProgramMandatory(boolean)
	 * @generated
	 */
	public boolean isSetDrProgramMandatory() {
		return drProgramMandatoryESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreement</em>' reference.
	 * @see #setCustomerAgreement(CustomerAgreement)
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getEndDeviceControls
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
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getCustomerAgreement <em>Customer Agreement</em>}' reference.
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
				msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS, CustomerAgreement.class, msgs);
			if (newCustomerAgreement != null)
				msgs = ((InternalEObject)newCustomerAgreement).eInverseAdd(this, CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS, CustomerAgreement.class, msgs);
			msgs = basicSetCustomerAgreement(newCustomerAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(String newType) {
		type = newType;
		typeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public void unsetType() {
		type = TYPE_EDEFAULT;
		typeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * Returns the value of the '<em><b>Scheduled Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Interval</em>' containment reference.
	 * @see #setScheduledInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getScheduledInterval() {
		return scheduledInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledInterval(DateTimeInterval newScheduledInterval, NotificationChain msgs) {
		DateTimeInterval oldScheduledInterval = scheduledInterval;
		scheduledInterval = newScheduledInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getScheduledInterval <em>Scheduled Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Interval</em>' containment reference.
	 * @see #getScheduledInterval()
	 * @generated
	 */
	public void setScheduledInterval(DateTimeInterval newScheduledInterval) {
		if (newScheduledInterval != scheduledInterval) {
			NotificationChain msgs = null;
			if (scheduledInterval != null)
				msgs = ((InternalEObject)scheduledInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, null, msgs);
			if (newScheduledInterval != null)
				msgs = ((InternalEObject)newScheduledInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL, null, msgs);
			msgs = basicSetScheduledInterval(newScheduledInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>End Device Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Group</em>' reference.
	 * @see #setEndDeviceGroup(EndDeviceGroup)
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls
	 * @generated
	 */
	public EndDeviceGroup getEndDeviceGroup() {
		if (endDeviceGroup != null && endDeviceGroup.eIsProxy()) {
			InternalEObject oldEndDeviceGroup = (InternalEObject)endDeviceGroup;
			endDeviceGroup = (EndDeviceGroup)eResolveProxy(oldEndDeviceGroup);
			if (endDeviceGroup != oldEndDeviceGroup) {
			}
		}
		return endDeviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceGroup basicGetEndDeviceGroup() {
		return endDeviceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceGroup(EndDeviceGroup newEndDeviceGroup, NotificationChain msgs) {
		EndDeviceGroup oldEndDeviceGroup = endDeviceGroup;
		endDeviceGroup = newEndDeviceGroup;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup <em>End Device Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Group</em>' reference.
	 * @see #getEndDeviceGroup()
	 * @generated
	 */
	public void setEndDeviceGroup(EndDeviceGroup newEndDeviceGroup) {
		if (newEndDeviceGroup != endDeviceGroup) {
			NotificationChain msgs = null;
			if (endDeviceGroup != null)
				msgs = ((InternalEObject)endDeviceGroup).eInverseRemove(this, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS, EndDeviceGroup.class, msgs);
			if (newEndDeviceGroup != null)
				msgs = ((InternalEObject)newEndDeviceGroup).eInverseAdd(this, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS, EndDeviceGroup.class, msgs);
			msgs = basicSetEndDeviceGroup(newEndDeviceGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>End Device</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceControls <em>End Device Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device</em>' reference.
	 * @see #setEndDevice(EndDevice)
	 * @see CIM15.IEC61968.Metering.EndDevice#getEndDeviceControls
	 * @generated
	 */
	public EndDevice getEndDevice() {
		if (endDevice != null && endDevice.eIsProxy()) {
			InternalEObject oldEndDevice = (InternalEObject)endDevice;
			endDevice = (EndDevice)eResolveProxy(oldEndDevice);
			if (endDevice != oldEndDevice) {
			}
		}
		return endDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDevice basicGetEndDevice() {
		return endDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDevice(EndDevice newEndDevice, NotificationChain msgs) {
		EndDevice oldEndDevice = endDevice;
		endDevice = newEndDevice;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getEndDevice <em>End Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device</em>' reference.
	 * @see #getEndDevice()
	 * @generated
	 */
	public void setEndDevice(EndDevice newEndDevice) {
		if (newEndDevice != endDevice) {
			NotificationChain msgs = null;
			if (endDevice != null)
				msgs = ((InternalEObject)endDevice).eInverseRemove(this, MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS, EndDevice.class, msgs);
			if (newEndDevice != null)
				msgs = ((InternalEObject)newEndDevice).eInverseAdd(this, MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS, EndDevice.class, msgs);
			msgs = basicSetEndDevice(newEndDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Price Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Signal</em>' attribute.
	 * @see #isSetPriceSignal()
	 * @see #unsetPriceSignal()
	 * @see #setPriceSignal(float)
	 * @generated
	 */
	public float getPriceSignal() {
		return priceSignal;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getPriceSignal <em>Price Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Signal</em>' attribute.
	 * @see #isSetPriceSignal()
	 * @see #unsetPriceSignal()
	 * @see #getPriceSignal()
	 * @generated
	 */
	public void setPriceSignal(float newPriceSignal) {
		priceSignal = newPriceSignal;
		priceSignalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getPriceSignal <em>Price Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriceSignal()
	 * @see #getPriceSignal()
	 * @see #setPriceSignal(float)
	 * @generated
	 */
	public void unsetPriceSignal() {
		priceSignal = PRICE_SIGNAL_EDEFAULT;
		priceSignalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDeviceControl#getPriceSignal <em>Price Signal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Price Signal</em>' attribute is set.
	 * @see #unsetPriceSignal()
	 * @see #getPriceSignal()
	 * @see #setPriceSignal(float)
	 * @generated
	 */
	public boolean isSetPriceSignal() {
		return priceSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				if (demandResponseProgram != null)
					msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS, DemandResponseProgram.class, msgs);
				return basicSetDemandResponseProgram((DemandResponseProgram)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				if (customerAgreement != null)
					msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__END_DEVICE_CONTROLS, CustomerAgreement.class, msgs);
				return basicSetCustomerAgreement((CustomerAgreement)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				if (endDeviceGroup != null)
					msgs = ((InternalEObject)endDeviceGroup).eInverseRemove(this, MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS, EndDeviceGroup.class, msgs);
				return basicSetEndDeviceGroup((EndDeviceGroup)otherEnd, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE:
				if (endDevice != null)
					msgs = ((InternalEObject)endDevice).eInverseRemove(this, MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS, EndDevice.class, msgs);
				return basicSetEndDevice((EndDevice)otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				return basicSetDemandResponseProgram(null, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				return basicSetCustomerAgreement(null, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				return basicSetScheduledInterval(null, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				return basicSetEndDeviceGroup(null, msgs);
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE:
				return basicSetEndDevice(null, msgs);
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
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				if (resolve) return getDemandResponseProgram();
				return basicGetDemandResponseProgram();
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
				return getDrProgramLevel();
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
				return isDrProgramMandatory();
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				if (resolve) return getCustomerAgreement();
				return basicGetCustomerAgreement();
			case MeteringPackage.END_DEVICE_CONTROL__TYPE:
				return getType();
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				return getScheduledInterval();
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				if (resolve) return getEndDeviceGroup();
				return basicGetEndDeviceGroup();
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE:
				if (resolve) return getEndDevice();
				return basicGetEndDevice();
			case MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
				return getPriceSignal();
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
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
				setDrProgramLevel((Integer)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
				setDrProgramMandatory((Boolean)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__TYPE:
				setType((String)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				setScheduledInterval((DateTimeInterval)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				setEndDeviceGroup((EndDeviceGroup)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE:
				setEndDevice((EndDevice)newValue);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
				setPriceSignal((Float)newValue);
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
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
				unsetDrProgramLevel();
				return;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
				unsetDrProgramMandatory();
				return;
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__TYPE:
				unsetType();
				return;
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				setScheduledInterval((DateTimeInterval)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				setEndDeviceGroup((EndDeviceGroup)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE:
				setEndDevice((EndDevice)null);
				return;
			case MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
				unsetPriceSignal();
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
			case MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM:
				return demandResponseProgram != null;
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_LEVEL:
				return isSetDrProgramLevel();
			case MeteringPackage.END_DEVICE_CONTROL__DR_PROGRAM_MANDATORY:
				return isSetDrProgramMandatory();
			case MeteringPackage.END_DEVICE_CONTROL__CUSTOMER_AGREEMENT:
				return customerAgreement != null;
			case MeteringPackage.END_DEVICE_CONTROL__TYPE:
				return isSetType();
			case MeteringPackage.END_DEVICE_CONTROL__SCHEDULED_INTERVAL:
				return scheduledInterval != null;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE_GROUP:
				return endDeviceGroup != null;
			case MeteringPackage.END_DEVICE_CONTROL__END_DEVICE:
				return endDevice != null;
			case MeteringPackage.END_DEVICE_CONTROL__PRICE_SIGNAL:
				return isSetPriceSignal();
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
		result.append(" (drProgramLevel: ");
		if (drProgramLevelESet) result.append(drProgramLevel); else result.append("<unset>");
		result.append(", drProgramMandatory: ");
		if (drProgramMandatoryESet) result.append(drProgramMandatory); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", priceSignal: ");
		if (priceSignalESet) result.append(priceSignal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EndDeviceControl
