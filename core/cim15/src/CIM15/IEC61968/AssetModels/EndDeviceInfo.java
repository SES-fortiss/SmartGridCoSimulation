/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61968.Metering.EndDevice;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getEndDevices <em>End Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndDeviceInfo extends AssetInfo {
	/**
	 * The default value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected int phaseCount = PHASE_COUNT_EDEFAULT;

	/**
	 * This is true if the Phase Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCountESet;

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
	 * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDevice> endDevices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.END_DEVICE_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Count</em>' attribute.
	 * @see #isSetPhaseCount()
	 * @see #unsetPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public int getPhaseCount() {
		return phaseCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Count</em>' attribute.
	 * @see #isSetPhaseCount()
	 * @see #unsetPhaseCount()
	 * @see #getPhaseCount()
	 * @generated
	 */
	public void setPhaseCount(int newPhaseCount) {
		phaseCount = newPhaseCount;
		phaseCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCount()
	 * @see #getPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public void unsetPhaseCount() {
		phaseCount = PHASE_COUNT_EDEFAULT;
		phaseCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getPhaseCount <em>Phase Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Count</em>' attribute is set.
	 * @see #unsetPhaseCount()
	 * @see #getPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public boolean isSetPhaseCount() {
		return phaseCountESet;
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedCurrent <em>Rated Current</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedCurrent <em>Rated Current</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>End Devices</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDevice}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDevice#getEndDeviceInfo <em>End Device Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Devices</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDevice#getEndDeviceInfo
	 * @generated
	 */
	public EList<EndDevice> getEndDevices() {
		if (endDevices == null) {
			endDevices = new BasicInternalEList<EndDevice>(EndDevice.class);
		}
		return endDevices;
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
			case AssetModelsPackage.END_DEVICE_INFO__END_DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDevices()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.END_DEVICE_INFO__END_DEVICES:
				return ((InternalEList<?>)getEndDevices()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.END_DEVICE_INFO__PHASE_COUNT:
				return getPhaseCount();
			case AssetModelsPackage.END_DEVICE_INFO__RATED_CURRENT:
				return getRatedCurrent();
			case AssetModelsPackage.END_DEVICE_INFO__RATED_VOLTAGE:
				return getRatedVoltage();
			case AssetModelsPackage.END_DEVICE_INFO__END_DEVICES:
				return getEndDevices();
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
			case AssetModelsPackage.END_DEVICE_INFO__PHASE_COUNT:
				setPhaseCount((Integer)newValue);
				return;
			case AssetModelsPackage.END_DEVICE_INFO__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case AssetModelsPackage.END_DEVICE_INFO__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case AssetModelsPackage.END_DEVICE_INFO__END_DEVICES:
				getEndDevices().clear();
				getEndDevices().addAll((Collection<? extends EndDevice>)newValue);
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
			case AssetModelsPackage.END_DEVICE_INFO__PHASE_COUNT:
				unsetPhaseCount();
				return;
			case AssetModelsPackage.END_DEVICE_INFO__RATED_CURRENT:
				unsetRatedCurrent();
				return;
			case AssetModelsPackage.END_DEVICE_INFO__RATED_VOLTAGE:
				unsetRatedVoltage();
				return;
			case AssetModelsPackage.END_DEVICE_INFO__END_DEVICES:
				getEndDevices().clear();
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
			case AssetModelsPackage.END_DEVICE_INFO__PHASE_COUNT:
				return isSetPhaseCount();
			case AssetModelsPackage.END_DEVICE_INFO__RATED_CURRENT:
				return isSetRatedCurrent();
			case AssetModelsPackage.END_DEVICE_INFO__RATED_VOLTAGE:
				return isSetRatedVoltage();
			case AssetModelsPackage.END_DEVICE_INFO__END_DEVICES:
				return endDevices != null && !endDevices.isEmpty();
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
		result.append(" (phaseCount: ");
		if (phaseCountESet) result.append(phaseCount); else result.append("<unset>");
		result.append(", ratedCurrent: ");
		if (ratedCurrentESet) result.append(ratedCurrent); else result.append("<unset>");
		result.append(", ratedVoltage: ");
		if (ratedVoltageESet) result.append(ratedVoltage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EndDeviceInfo
