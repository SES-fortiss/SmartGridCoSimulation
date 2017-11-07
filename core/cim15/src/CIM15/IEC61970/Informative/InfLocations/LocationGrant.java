/**
 */
package CIM15.IEC61970.Informative.InfLocations;

import CIM15.IEC61968.Common.Agreement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Grant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LocationGrant#getPropertyData <em>Property Data</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty <em>Land Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationGrant extends Agreement {
	/**
	 * The default value of the '{@link #getPropertyData() <em>Property Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyData()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyData() <em>Property Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyData()
	 * @generated
	 * @ordered
	 */
	protected String propertyData = PROPERTY_DATA_EDEFAULT;

	/**
	 * This is true if the Property Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyDataESet;

	/**
	 * The cached value of the '{@link #getLandProperty() <em>Land Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperty()
	 * @generated
	 * @ordered
	 */
	protected LandProperty landProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationGrant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.LOCATION_GRANT;
	}

	/**
	 * Returns the value of the '<em><b>Property Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Data</em>' attribute.
	 * @see #isSetPropertyData()
	 * @see #unsetPropertyData()
	 * @see #setPropertyData(String)
	 * @generated
	 */
	public String getPropertyData() {
		return propertyData;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LocationGrant#getPropertyData <em>Property Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Data</em>' attribute.
	 * @see #isSetPropertyData()
	 * @see #unsetPropertyData()
	 * @see #getPropertyData()
	 * @generated
	 */
	public void setPropertyData(String newPropertyData) {
		propertyData = newPropertyData;
		propertyDataESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LocationGrant#getPropertyData <em>Property Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyData()
	 * @see #getPropertyData()
	 * @see #setPropertyData(String)
	 * @generated
	 */
	public void unsetPropertyData() {
		propertyData = PROPERTY_DATA_EDEFAULT;
		propertyDataESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LocationGrant#getPropertyData <em>Property Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Data</em>' attribute is set.
	 * @see #unsetPropertyData()
	 * @see #getPropertyData()
	 * @see #setPropertyData(String)
	 * @generated
	 */
	public boolean isSetPropertyData() {
		return propertyDataESet;
	}

	/**
	 * Returns the value of the '<em><b>Land Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getLocationGrants <em>Location Grants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property</em>' reference.
	 * @see #setLandProperty(LandProperty)
	 * @see CIM15.IEC61970.Informative.InfLocations.LandProperty#getLocationGrants
	 * @generated
	 */
	public LandProperty getLandProperty() {
		if (landProperty != null && landProperty.eIsProxy()) {
			InternalEObject oldLandProperty = (InternalEObject)landProperty;
			landProperty = (LandProperty)eResolveProxy(oldLandProperty);
			if (landProperty != oldLandProperty) {
			}
		}
		return landProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandProperty basicGetLandProperty() {
		return landProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandProperty(LandProperty newLandProperty, NotificationChain msgs) {
		LandProperty oldLandProperty = landProperty;
		landProperty = newLandProperty;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty <em>Land Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land Property</em>' reference.
	 * @see #getLandProperty()
	 * @generated
	 */
	public void setLandProperty(LandProperty newLandProperty) {
		if (newLandProperty != landProperty) {
			NotificationChain msgs = null;
			if (landProperty != null)
				msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS, LandProperty.class, msgs);
			if (newLandProperty != null)
				msgs = ((InternalEObject)newLandProperty).eInverseAdd(this, InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS, LandProperty.class, msgs);
			msgs = basicSetLandProperty(newLandProperty, msgs);
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
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				if (landProperty != null)
					msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS, LandProperty.class, msgs);
				return basicSetLandProperty((LandProperty)otherEnd, msgs);
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
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				return basicSetLandProperty(null, msgs);
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
			case InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA:
				return getPropertyData();
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				if (resolve) return getLandProperty();
				return basicGetLandProperty();
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
			case InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA:
				setPropertyData((String)newValue);
				return;
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				setLandProperty((LandProperty)newValue);
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
			case InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA:
				unsetPropertyData();
				return;
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				setLandProperty((LandProperty)null);
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
			case InfLocationsPackage.LOCATION_GRANT__PROPERTY_DATA:
				return isSetPropertyData();
			case InfLocationsPackage.LOCATION_GRANT__LAND_PROPERTY:
				return landProperty != null;
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
		result.append(" (propertyData: ");
		if (propertyDataESet) result.append(propertyData); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LocationGrant
