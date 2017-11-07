/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61970.Informative.InfWork.Crew;
import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReading <em>Odometer Reading</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getCrew <em>Crew</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getUsageKind <em>Usage Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Vehicle extends Asset {
	/**
	 * The default value of the '{@link #getOdometerReading() <em>Odometer Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometerReading()
	 * @generated
	 * @ordered
	 */
	protected static final float ODOMETER_READING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOdometerReading() <em>Odometer Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometerReading()
	 * @generated
	 * @ordered
	 */
	protected float odometerReading = ODOMETER_READING_EDEFAULT;

	/**
	 * This is true if the Odometer Reading attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean odometerReadingESet;

	/**
	 * The default value of the '{@link #getOdometerReadDateTime() <em>Odometer Read Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometerReadDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ODOMETER_READ_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOdometerReadDateTime() <em>Odometer Read Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOdometerReadDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date odometerReadDateTime = ODOMETER_READ_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Odometer Read Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean odometerReadDateTimeESet;

	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * The default value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageKind()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleUsageKind USAGE_KIND_EDEFAULT = VehicleUsageKind.CREW;

	/**
	 * The cached value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageKind()
	 * @generated
	 * @ordered
	 */
	protected VehicleUsageKind usageKind = USAGE_KIND_EDEFAULT;

	/**
	 * This is true if the Usage Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vehicle() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getVehicle();
	}

	/**
	 * Returns the value of the '<em><b>Odometer Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odometer Reading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odometer Reading</em>' attribute.
	 * @see #isSetOdometerReading()
	 * @see #unsetOdometerReading()
	 * @see #setOdometerReading(float)
	 * @generated
	 */
	public float getOdometerReading() {
		return odometerReading;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReading <em>Odometer Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odometer Reading</em>' attribute.
	 * @see #isSetOdometerReading()
	 * @see #unsetOdometerReading()
	 * @see #getOdometerReading()
	 * @generated
	 */
	public void setOdometerReading(float newOdometerReading) {
		odometerReading = newOdometerReading;
		odometerReadingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReading <em>Odometer Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOdometerReading()
	 * @see #getOdometerReading()
	 * @see #setOdometerReading(float)
	 * @generated
	 */
	public void unsetOdometerReading() {
		odometerReading = ODOMETER_READING_EDEFAULT;
		odometerReadingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReading <em>Odometer Reading</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Odometer Reading</em>' attribute is set.
	 * @see #unsetOdometerReading()
	 * @see #getOdometerReading()
	 * @see #setOdometerReading(float)
	 * @generated
	 */
	public boolean isSetOdometerReading() {
		return odometerReadingESet;
	}

	/**
	 * Returns the value of the '<em><b>Odometer Read Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odometer Read Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odometer Read Date Time</em>' attribute.
	 * @see #isSetOdometerReadDateTime()
	 * @see #unsetOdometerReadDateTime()
	 * @see #setOdometerReadDateTime(Date)
	 * @generated
	 */
	public Date getOdometerReadDateTime() {
		return odometerReadDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odometer Read Date Time</em>' attribute.
	 * @see #isSetOdometerReadDateTime()
	 * @see #unsetOdometerReadDateTime()
	 * @see #getOdometerReadDateTime()
	 * @generated
	 */
	public void setOdometerReadDateTime(Date newOdometerReadDateTime) {
		odometerReadDateTime = newOdometerReadDateTime;
		odometerReadDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOdometerReadDateTime()
	 * @see #getOdometerReadDateTime()
	 * @see #setOdometerReadDateTime(Date)
	 * @generated
	 */
	public void unsetOdometerReadDateTime() {
		odometerReadDateTime = ODOMETER_READ_DATE_TIME_EDEFAULT;
		odometerReadDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Odometer Read Date Time</em>' attribute is set.
	 * @see #unsetOdometerReadDateTime()
	 * @see #getOdometerReadDateTime()
	 * @see #setOdometerReadDateTime(Date)
	 * @generated
	 */
	public boolean isSetOdometerReadDateTime() {
		return odometerReadDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' reference.
	 * @see #setCrew(Crew)
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getVehicles
	 * @generated
	 */
	public Crew getCrew() {
		if (crew != null && crew.eIsProxy()) {
			InternalEObject oldCrew = (InternalEObject)crew;
			crew = (Crew)eResolveProxy(oldCrew);
			if (crew != oldCrew) {
			}
		}
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew basicGetCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getCrew <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' reference.
	 * @see #getCrew()
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__VEHICLES, Crew.class, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, InfWorkPackage.CREW__VEHICLES, Crew.class, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Usage Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.VehicleUsageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.VehicleUsageKind
	 * @see #isSetUsageKind()
	 * @see #unsetUsageKind()
	 * @see #setUsageKind(VehicleUsageKind)
	 * @generated
	 */
	public VehicleUsageKind getUsageKind() {
		return usageKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getUsageKind <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.VehicleUsageKind
	 * @see #isSetUsageKind()
	 * @see #unsetUsageKind()
	 * @see #getUsageKind()
	 * @generated
	 */
	public void setUsageKind(VehicleUsageKind newUsageKind) {
		usageKind = newUsageKind == null ? USAGE_KIND_EDEFAULT : newUsageKind;
		usageKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getUsageKind <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageKind()
	 * @see #getUsageKind()
	 * @see #setUsageKind(VehicleUsageKind)
	 * @generated
	 */
	public void unsetUsageKind() {
		usageKind = USAGE_KIND_EDEFAULT;
		usageKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getUsageKind <em>Usage Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Kind</em>' attribute is set.
	 * @see #unsetUsageKind()
	 * @see #getUsageKind()
	 * @see #setUsageKind(VehicleUsageKind)
	 * @generated
	 */
	public boolean isSetUsageKind() {
		return usageKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.VEHICLE__CREW:
				if (crew != null)
					msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__VEHICLES, Crew.class, msgs);
				return basicSetCrew((Crew)otherEnd, msgs);
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
			case InfAssetsPackage.VEHICLE__CREW:
				return basicSetCrew(null, msgs);
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
			case InfAssetsPackage.VEHICLE__ODOMETER_READING:
				return getOdometerReading();
			case InfAssetsPackage.VEHICLE__ODOMETER_READ_DATE_TIME:
				return getOdometerReadDateTime();
			case InfAssetsPackage.VEHICLE__CREW:
				if (resolve) return getCrew();
				return basicGetCrew();
			case InfAssetsPackage.VEHICLE__USAGE_KIND:
				return getUsageKind();
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
			case InfAssetsPackage.VEHICLE__ODOMETER_READING:
				setOdometerReading((Float)newValue);
				return;
			case InfAssetsPackage.VEHICLE__ODOMETER_READ_DATE_TIME:
				setOdometerReadDateTime((Date)newValue);
				return;
			case InfAssetsPackage.VEHICLE__CREW:
				setCrew((Crew)newValue);
				return;
			case InfAssetsPackage.VEHICLE__USAGE_KIND:
				setUsageKind((VehicleUsageKind)newValue);
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
			case InfAssetsPackage.VEHICLE__ODOMETER_READING:
				unsetOdometerReading();
				return;
			case InfAssetsPackage.VEHICLE__ODOMETER_READ_DATE_TIME:
				unsetOdometerReadDateTime();
				return;
			case InfAssetsPackage.VEHICLE__CREW:
				setCrew((Crew)null);
				return;
			case InfAssetsPackage.VEHICLE__USAGE_KIND:
				unsetUsageKind();
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
			case InfAssetsPackage.VEHICLE__ODOMETER_READING:
				return isSetOdometerReading();
			case InfAssetsPackage.VEHICLE__ODOMETER_READ_DATE_TIME:
				return isSetOdometerReadDateTime();
			case InfAssetsPackage.VEHICLE__CREW:
				return crew != null;
			case InfAssetsPackage.VEHICLE__USAGE_KIND:
				return isSetUsageKind();
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
		result.append(" (odometerReading: ");
		if (odometerReadingESet) result.append(odometerReading); else result.append("<unset>");
		result.append(", odometerReadDateTime: ");
		if (odometerReadDateTimeESet) result.append(odometerReadDateTime); else result.append("<unset>");
		result.append(", usageKind: ");
		if (usageKindESet) result.append(usageKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Vehicle
