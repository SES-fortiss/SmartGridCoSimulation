/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.EndDeviceInfo;

import CIM15.IEC61968.Assets.AssetContainer;

import CIM15.IEC61968.Customers.Customer;
import CIM15.IEC61968.Customers.CustomersPackage;
import CIM15.IEC61968.Customers.ServiceLocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceInfo <em>End Device Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceFunctions <em>End Device Functions</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getAmrSystem <em>Amr System</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getCustomer <em>Customer</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceGroups <em>End Device Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndDevice extends AssetContainer {
	/**
	 * The cached value of the '{@link #getEndDeviceInfo() <em>End Device Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceInfo()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceInfo endDeviceInfo;

	/**
	 * The cached value of the '{@link #getServiceDeliveryPoint() <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 * @ordered
	 */
	protected ServiceDeliveryPoint serviceDeliveryPoint;

	/**
	 * The default value of the '{@link #getTimeZoneOffset() <em>Time Zone Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneOffset()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_ZONE_OFFSET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeZoneOffset() <em>Time Zone Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneOffset()
	 * @generated
	 * @ordered
	 */
	protected float timeZoneOffset = TIME_ZONE_OFFSET_EDEFAULT;

	/**
	 * This is true if the Time Zone Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeZoneOffsetESet;

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
	 * The cached value of the '{@link #getEndDeviceFunctions() <em>End Device Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceFunction> endDeviceFunctions;

	/**
	 * The default value of the '{@link #getAmrSystem() <em>Amr System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String AMR_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmrSystem() <em>Amr System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrSystem()
	 * @generated
	 * @ordered
	 */
	protected String amrSystem = AMR_SYSTEM_EDEFAULT;

	/**
	 * This is true if the Amr System attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amrSystemESet;

	/**
	 * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceControl> endDeviceControls;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getEndDeviceGroups() <em>End Device Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceGroup> endDeviceGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDevice() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE;
	}

	/**
	 * Returns the value of the '<em><b>End Device Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getEndDevices <em>End Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Info</em>' reference.
	 * @see #setEndDeviceInfo(EndDeviceInfo)
	 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo#getEndDevices
	 * @generated
	 */
	public EndDeviceInfo getEndDeviceInfo() {
		if (endDeviceInfo != null && endDeviceInfo.eIsProxy()) {
			InternalEObject oldEndDeviceInfo = (InternalEObject)endDeviceInfo;
			endDeviceInfo = (EndDeviceInfo)eResolveProxy(oldEndDeviceInfo);
			if (endDeviceInfo != oldEndDeviceInfo) {
			}
		}
		return endDeviceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceInfo basicGetEndDeviceInfo() {
		return endDeviceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceInfo(EndDeviceInfo newEndDeviceInfo, NotificationChain msgs) {
		EndDeviceInfo oldEndDeviceInfo = endDeviceInfo;
		endDeviceInfo = newEndDeviceInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceInfo <em>End Device Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Device Info</em>' reference.
	 * @see #getEndDeviceInfo()
	 * @generated
	 */
	public void setEndDeviceInfo(EndDeviceInfo newEndDeviceInfo) {
		if (newEndDeviceInfo != endDeviceInfo) {
			NotificationChain msgs = null;
			if (endDeviceInfo != null)
				msgs = ((InternalEObject)endDeviceInfo).eInverseRemove(this, AssetModelsPackage.END_DEVICE_INFO__END_DEVICES, EndDeviceInfo.class, msgs);
			if (newEndDeviceInfo != null)
				msgs = ((InternalEObject)newEndDeviceInfo).eInverseAdd(this, AssetModelsPackage.END_DEVICE_INFO__END_DEVICES, EndDeviceInfo.class, msgs);
			msgs = basicSetEndDeviceInfo(newEndDeviceInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEndDevices <em>End Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Point</em>' reference.
	 * @see #setServiceDeliveryPoint(ServiceDeliveryPoint)
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getEndDevices
	 * @generated
	 */
	public ServiceDeliveryPoint getServiceDeliveryPoint() {
		if (serviceDeliveryPoint != null && serviceDeliveryPoint.eIsProxy()) {
			InternalEObject oldServiceDeliveryPoint = (InternalEObject)serviceDeliveryPoint;
			serviceDeliveryPoint = (ServiceDeliveryPoint)eResolveProxy(oldServiceDeliveryPoint);
			if (serviceDeliveryPoint != oldServiceDeliveryPoint) {
			}
		}
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint basicGetServiceDeliveryPoint() {
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint, NotificationChain msgs) {
		ServiceDeliveryPoint oldServiceDeliveryPoint = serviceDeliveryPoint;
		serviceDeliveryPoint = newServiceDeliveryPoint;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getServiceDeliveryPoint <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delivery Point</em>' reference.
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 */
	public void setServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint) {
		if (newServiceDeliveryPoint != serviceDeliveryPoint) {
			NotificationChain msgs = null;
			if (serviceDeliveryPoint != null)
				msgs = ((InternalEObject)serviceDeliveryPoint).eInverseRemove(this, MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES, ServiceDeliveryPoint.class, msgs);
			if (newServiceDeliveryPoint != null)
				msgs = ((InternalEObject)newServiceDeliveryPoint).eInverseAdd(this, MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES, ServiceDeliveryPoint.class, msgs);
			msgs = basicSetServiceDeliveryPoint(newServiceDeliveryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Time Zone Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Zone Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Zone Offset</em>' attribute.
	 * @see #isSetTimeZoneOffset()
	 * @see #unsetTimeZoneOffset()
	 * @see #setTimeZoneOffset(float)
	 * @generated
	 */
	public float getTimeZoneOffset() {
		return timeZoneOffset;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone Offset</em>' attribute.
	 * @see #isSetTimeZoneOffset()
	 * @see #unsetTimeZoneOffset()
	 * @see #getTimeZoneOffset()
	 * @generated
	 */
	public void setTimeZoneOffset(float newTimeZoneOffset) {
		timeZoneOffset = newTimeZoneOffset;
		timeZoneOffsetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeZoneOffset()
	 * @see #getTimeZoneOffset()
	 * @see #setTimeZoneOffset(float)
	 * @generated
	 */
	public void unsetTimeZoneOffset() {
		timeZoneOffset = TIME_ZONE_OFFSET_EDEFAULT;
		timeZoneOffsetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Zone Offset</em>' attribute is set.
	 * @see #unsetTimeZoneOffset()
	 * @see #getTimeZoneOffset()
	 * @see #setTimeZoneOffset(float)
	 * @generated
	 */
	public boolean isSetTimeZoneOffset() {
		return timeZoneOffsetESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.ServiceLocation#getEndDevices <em>End Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Location</em>' reference.
	 * @see #setServiceLocation(ServiceLocation)
	 * @see CIM15.IEC61968.Customers.ServiceLocation#getEndDevices
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
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getServiceLocation <em>Service Location</em>}' reference.
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
				msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__END_DEVICES, ServiceLocation.class, msgs);
			if (newServiceLocation != null)
				msgs = ((InternalEObject)newServiceLocation).eInverseAdd(this, CustomersPackage.SERVICE_LOCATION__END_DEVICES, ServiceLocation.class, msgs);
			msgs = basicSetServiceLocation(newServiceLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>End Device Functions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceFunction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getEndDevice <em>End Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Functions</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#getEndDevice
	 * @generated
	 */
	public EList<EndDeviceFunction> getEndDeviceFunctions() {
		if (endDeviceFunctions == null) {
			endDeviceFunctions = new BasicInternalEList<EndDeviceFunction>(EndDeviceFunction.class);
		}
		return endDeviceFunctions;
	}

	/**
	 * Returns the value of the '<em><b>Amr System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amr System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amr System</em>' attribute.
	 * @see #isSetAmrSystem()
	 * @see #unsetAmrSystem()
	 * @see #setAmrSystem(String)
	 * @generated
	 */
	public String getAmrSystem() {
		return amrSystem;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getAmrSystem <em>Amr System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amr System</em>' attribute.
	 * @see #isSetAmrSystem()
	 * @see #unsetAmrSystem()
	 * @see #getAmrSystem()
	 * @generated
	 */
	public void setAmrSystem(String newAmrSystem) {
		amrSystem = newAmrSystem;
		amrSystemESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getAmrSystem <em>Amr System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmrSystem()
	 * @see #getAmrSystem()
	 * @see #setAmrSystem(String)
	 * @generated
	 */
	public void unsetAmrSystem() {
		amrSystem = AMR_SYSTEM_EDEFAULT;
		amrSystemESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getAmrSystem <em>Amr System</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amr System</em>' attribute is set.
	 * @see #unsetAmrSystem()
	 * @see #getAmrSystem()
	 * @see #setAmrSystem(String)
	 * @generated
	 */
	public boolean isSetAmrSystem() {
		return amrSystemESet;
	}

	/**
	 * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceControl}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceControl#getEndDevice <em>End Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Controls</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getEndDevice
	 * @generated
	 */
	public EList<EndDeviceControl> getEndDeviceControls() {
		if (endDeviceControls == null) {
			endDeviceControls = new BasicInternalEList<EndDeviceControl>(EndDeviceControl.class);
		}
		return endDeviceControls;
	}

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Customer#getEndDevices <em>End Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see CIM15.IEC61968.Customers.Customer#getEndDevices
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDevice#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, CustomersPackage.CUSTOMER__END_DEVICES, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, CustomersPackage.CUSTOMER__END_DEVICES, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>End Device Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceGroup}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getEndDevices <em>End Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Groups</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceGroup#getEndDevices
	 * @generated
	 */
	public EList<EndDeviceGroup> getEndDeviceGroups() {
		if (endDeviceGroups == null) {
			endDeviceGroups = new BasicInternalEList<EndDeviceGroup>(EndDeviceGroup.class);
		}
		return endDeviceGroups;
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
			case MeteringPackage.END_DEVICE__END_DEVICE_INFO:
				if (endDeviceInfo != null)
					msgs = ((InternalEObject)endDeviceInfo).eInverseRemove(this, AssetModelsPackage.END_DEVICE_INFO__END_DEVICES, EndDeviceInfo.class, msgs);
				return basicSetEndDeviceInfo((EndDeviceInfo)otherEnd, msgs);
			case MeteringPackage.END_DEVICE__SERVICE_DELIVERY_POINT:
				if (serviceDeliveryPoint != null)
					msgs = ((InternalEObject)serviceDeliveryPoint).eInverseRemove(this, MeteringPackage.SERVICE_DELIVERY_POINT__END_DEVICES, ServiceDeliveryPoint.class, msgs);
				return basicSetServiceDeliveryPoint((ServiceDeliveryPoint)otherEnd, msgs);
			case MeteringPackage.END_DEVICE__SERVICE_LOCATION:
				if (serviceLocation != null)
					msgs = ((InternalEObject)serviceLocation).eInverseRemove(this, CustomersPackage.SERVICE_LOCATION__END_DEVICES, ServiceLocation.class, msgs);
				return basicSetServiceLocation((ServiceLocation)otherEnd, msgs);
			case MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceFunctions()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceControls()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, CustomersPackage.CUSTOMER__END_DEVICES, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
			case MeteringPackage.END_DEVICE__END_DEVICE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceGroups()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE__END_DEVICE_INFO:
				return basicSetEndDeviceInfo(null, msgs);
			case MeteringPackage.END_DEVICE__SERVICE_DELIVERY_POINT:
				return basicSetServiceDeliveryPoint(null, msgs);
			case MeteringPackage.END_DEVICE__SERVICE_LOCATION:
				return basicSetServiceLocation(null, msgs);
			case MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
				return ((InternalEList<?>)getEndDeviceFunctions()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS:
				return ((InternalEList<?>)getEndDeviceControls()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case MeteringPackage.END_DEVICE__END_DEVICE_GROUPS:
				return ((InternalEList<?>)getEndDeviceGroups()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE__END_DEVICE_INFO:
				if (resolve) return getEndDeviceInfo();
				return basicGetEndDeviceInfo();
			case MeteringPackage.END_DEVICE__SERVICE_DELIVERY_POINT:
				if (resolve) return getServiceDeliveryPoint();
				return basicGetServiceDeliveryPoint();
			case MeteringPackage.END_DEVICE__TIME_ZONE_OFFSET:
				return getTimeZoneOffset();
			case MeteringPackage.END_DEVICE__SERVICE_LOCATION:
				if (resolve) return getServiceLocation();
				return basicGetServiceLocation();
			case MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
				return getEndDeviceFunctions();
			case MeteringPackage.END_DEVICE__AMR_SYSTEM:
				return getAmrSystem();
			case MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS:
				return getEndDeviceControls();
			case MeteringPackage.END_DEVICE__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case MeteringPackage.END_DEVICE__END_DEVICE_GROUPS:
				return getEndDeviceGroups();
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
			case MeteringPackage.END_DEVICE__END_DEVICE_INFO:
				setEndDeviceInfo((EndDeviceInfo)newValue);
				return;
			case MeteringPackage.END_DEVICE__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)newValue);
				return;
			case MeteringPackage.END_DEVICE__TIME_ZONE_OFFSET:
				setTimeZoneOffset((Float)newValue);
				return;
			case MeteringPackage.END_DEVICE__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)newValue);
				return;
			case MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
				getEndDeviceFunctions().clear();
				getEndDeviceFunctions().addAll((Collection<? extends EndDeviceFunction>)newValue);
				return;
			case MeteringPackage.END_DEVICE__AMR_SYSTEM:
				setAmrSystem((String)newValue);
				return;
			case MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				getEndDeviceControls().addAll((Collection<? extends EndDeviceControl>)newValue);
				return;
			case MeteringPackage.END_DEVICE__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case MeteringPackage.END_DEVICE__END_DEVICE_GROUPS:
				getEndDeviceGroups().clear();
				getEndDeviceGroups().addAll((Collection<? extends EndDeviceGroup>)newValue);
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
			case MeteringPackage.END_DEVICE__END_DEVICE_INFO:
				setEndDeviceInfo((EndDeviceInfo)null);
				return;
			case MeteringPackage.END_DEVICE__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)null);
				return;
			case MeteringPackage.END_DEVICE__TIME_ZONE_OFFSET:
				unsetTimeZoneOffset();
				return;
			case MeteringPackage.END_DEVICE__SERVICE_LOCATION:
				setServiceLocation((ServiceLocation)null);
				return;
			case MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
				getEndDeviceFunctions().clear();
				return;
			case MeteringPackage.END_DEVICE__AMR_SYSTEM:
				unsetAmrSystem();
				return;
			case MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				return;
			case MeteringPackage.END_DEVICE__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case MeteringPackage.END_DEVICE__END_DEVICE_GROUPS:
				getEndDeviceGroups().clear();
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
			case MeteringPackage.END_DEVICE__END_DEVICE_INFO:
				return endDeviceInfo != null;
			case MeteringPackage.END_DEVICE__SERVICE_DELIVERY_POINT:
				return serviceDeliveryPoint != null;
			case MeteringPackage.END_DEVICE__TIME_ZONE_OFFSET:
				return isSetTimeZoneOffset();
			case MeteringPackage.END_DEVICE__SERVICE_LOCATION:
				return serviceLocation != null;
			case MeteringPackage.END_DEVICE__END_DEVICE_FUNCTIONS:
				return endDeviceFunctions != null && !endDeviceFunctions.isEmpty();
			case MeteringPackage.END_DEVICE__AMR_SYSTEM:
				return isSetAmrSystem();
			case MeteringPackage.END_DEVICE__END_DEVICE_CONTROLS:
				return endDeviceControls != null && !endDeviceControls.isEmpty();
			case MeteringPackage.END_DEVICE__CUSTOMER:
				return customer != null;
			case MeteringPackage.END_DEVICE__END_DEVICE_GROUPS:
				return endDeviceGroups != null && !endDeviceGroups.isEmpty();
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
		result.append(" (timeZoneOffset: ");
		if (timeZoneOffsetESet) result.append(timeZoneOffset); else result.append("<unset>");
		result.append(", amrSystem: ");
		if (amrSystemESet) result.append(amrSystem); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EndDevice
