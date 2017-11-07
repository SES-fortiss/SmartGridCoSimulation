/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceGroup#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceGroup#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram <em>Demand Response Program</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.EndDeviceGroup#getGroupAddress <em>Group Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndDeviceGroup extends IdentifiedObject {
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
	 * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDevice> endDevices;

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
	 * The default value of the '{@link #getGroupAddress() <em>Group Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAddress()
	 * @generated
	 * @ordered
	 */
	protected static final int GROUP_ADDRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGroupAddress() <em>Group Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAddress()
	 * @generated
	 * @ordered
	 */
	protected int groupAddress = GROUP_ADDRESS_EDEFAULT;

	/**
	 * This is true if the Group Address attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupAddressESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.END_DEVICE_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceControl}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup <em>End Device Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Controls</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceControl#getEndDeviceGroup
	 * @generated
	 */
	public EList<EndDeviceControl> getEndDeviceControls() {
		if (endDeviceControls == null) {
			endDeviceControls = new BasicInternalEList<EndDeviceControl>(EndDeviceControl.class);
		}
		return endDeviceControls;
	}

	/**
	 * Returns the value of the '<em><b>End Devices</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDevice}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceGroups <em>End Device Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Devices</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDevice#getEndDeviceGroups
	 * @generated
	 */
	public EList<EndDevice> getEndDevices() {
		if (endDevices == null) {
			endDevices = new BasicInternalEList<EndDevice>(EndDevice.class);
		}
		return endDevices;
	}

	/**
	 * Returns the value of the '<em><b>Demand Response Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups <em>End Device Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand Response Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand Response Program</em>' reference.
	 * @see #setDemandResponseProgram(DemandResponseProgram)
	 * @see CIM15.IEC61968.Metering.DemandResponseProgram#getEndDeviceGroups
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
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getDemandResponseProgram <em>Demand Response Program</em>}' reference.
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
				msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS, DemandResponseProgram.class, msgs);
			if (newDemandResponseProgram != null)
				msgs = ((InternalEObject)newDemandResponseProgram).eInverseAdd(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS, DemandResponseProgram.class, msgs);
			msgs = basicSetDemandResponseProgram(newDemandResponseProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Group Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Address</em>' attribute.
	 * @see #isSetGroupAddress()
	 * @see #unsetGroupAddress()
	 * @see #setGroupAddress(int)
	 * @generated
	 */
	public int getGroupAddress() {
		return groupAddress;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getGroupAddress <em>Group Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Address</em>' attribute.
	 * @see #isSetGroupAddress()
	 * @see #unsetGroupAddress()
	 * @see #getGroupAddress()
	 * @generated
	 */
	public void setGroupAddress(int newGroupAddress) {
		groupAddress = newGroupAddress;
		groupAddressESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getGroupAddress <em>Group Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupAddress()
	 * @see #getGroupAddress()
	 * @see #setGroupAddress(int)
	 * @generated
	 */
	public void unsetGroupAddress() {
		groupAddress = GROUP_ADDRESS_EDEFAULT;
		groupAddressESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.EndDeviceGroup#getGroupAddress <em>Group Address</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Group Address</em>' attribute is set.
	 * @see #unsetGroupAddress()
	 * @see #getGroupAddress()
	 * @see #setGroupAddress(int)
	 * @generated
	 */
	public boolean isSetGroupAddress() {
		return groupAddressESet;
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
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceControls()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDevices()).basicAdd(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				if (demandResponseProgram != null)
					msgs = ((InternalEObject)demandResponseProgram).eInverseRemove(this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS, DemandResponseProgram.class, msgs);
				return basicSetDemandResponseProgram((DemandResponseProgram)otherEnd, msgs);
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
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				return ((InternalEList<?>)getEndDeviceControls()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICES:
				return ((InternalEList<?>)getEndDevices()).basicRemove(otherEnd, msgs);
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				return basicSetDemandResponseProgram(null, msgs);
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
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				return getEndDeviceControls();
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICES:
				return getEndDevices();
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				if (resolve) return getDemandResponseProgram();
				return basicGetDemandResponseProgram();
			case MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS:
				return getGroupAddress();
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
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				getEndDeviceControls().addAll((Collection<? extends EndDeviceControl>)newValue);
				return;
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICES:
				getEndDevices().clear();
				getEndDevices().addAll((Collection<? extends EndDevice>)newValue);
				return;
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)newValue);
				return;
			case MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS:
				setGroupAddress((Integer)newValue);
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
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				return;
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICES:
				getEndDevices().clear();
				return;
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				setDemandResponseProgram((DemandResponseProgram)null);
				return;
			case MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS:
				unsetGroupAddress();
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
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICE_CONTROLS:
				return endDeviceControls != null && !endDeviceControls.isEmpty();
			case MeteringPackage.END_DEVICE_GROUP__END_DEVICES:
				return endDevices != null && !endDevices.isEmpty();
			case MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM:
				return demandResponseProgram != null;
			case MeteringPackage.END_DEVICE_GROUP__GROUP_ADDRESS:
				return isSetGroupAddress();
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
		result.append(" (groupAddress: ");
		if (groupAddressESet) result.append(groupAddress); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EndDeviceGroup
