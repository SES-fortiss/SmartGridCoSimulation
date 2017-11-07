/**
 */
package CIM15.IEC61970.Informative.InfLocations;

import CIM15.Element;

import CIM15.IEC61968.Common.CommonPackage;
import CIM15.IEC61968.Common.Location;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.Direction#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.Direction#getDirectionInfo <em>Direction Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Direction extends Element {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getDirectionInfo() <em>Direction Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectionInfo() <em>Direction Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionInfo()
	 * @generated
	 * @ordered
	 */
	protected String directionInfo = DIRECTION_INFO_EDEFAULT;

	/**
	 * This is true if the Direction Info attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionInfoESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Direction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.DIRECTION;
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getDirections <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM15.IEC61968.Common.Location#getDirections
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.Direction#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__DIRECTIONS, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CommonPackage.LOCATION__DIRECTIONS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Direction Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Info</em>' attribute.
	 * @see #isSetDirectionInfo()
	 * @see #unsetDirectionInfo()
	 * @see #setDirectionInfo(String)
	 * @generated
	 */
	public String getDirectionInfo() {
		return directionInfo;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.Direction#getDirectionInfo <em>Direction Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Info</em>' attribute.
	 * @see #isSetDirectionInfo()
	 * @see #unsetDirectionInfo()
	 * @see #getDirectionInfo()
	 * @generated
	 */
	public void setDirectionInfo(String newDirectionInfo) {
		directionInfo = newDirectionInfo;
		directionInfoESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.Direction#getDirectionInfo <em>Direction Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectionInfo()
	 * @see #getDirectionInfo()
	 * @see #setDirectionInfo(String)
	 * @generated
	 */
	public void unsetDirectionInfo() {
		directionInfo = DIRECTION_INFO_EDEFAULT;
		directionInfoESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLocations.Direction#getDirectionInfo <em>Direction Info</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction Info</em>' attribute is set.
	 * @see #unsetDirectionInfo()
	 * @see #getDirectionInfo()
	 * @see #setDirectionInfo(String)
	 * @generated
	 */
	public boolean isSetDirectionInfo() {
		return directionInfoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfLocationsPackage.DIRECTION__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__DIRECTIONS, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
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
			case InfLocationsPackage.DIRECTION__LOCATION:
				return basicSetLocation(null, msgs);
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
			case InfLocationsPackage.DIRECTION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case InfLocationsPackage.DIRECTION__DIRECTION_INFO:
				return getDirectionInfo();
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
			case InfLocationsPackage.DIRECTION__LOCATION:
				setLocation((Location)newValue);
				return;
			case InfLocationsPackage.DIRECTION__DIRECTION_INFO:
				setDirectionInfo((String)newValue);
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
			case InfLocationsPackage.DIRECTION__LOCATION:
				setLocation((Location)null);
				return;
			case InfLocationsPackage.DIRECTION__DIRECTION_INFO:
				unsetDirectionInfo();
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
			case InfLocationsPackage.DIRECTION__LOCATION:
				return location != null;
			case InfLocationsPackage.DIRECTION__DIRECTION_INFO:
				return isSetDirectionInfo();
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
		result.append(" (directionInfo: ");
		if (directionInfoESet) result.append(directionInfo); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Direction
