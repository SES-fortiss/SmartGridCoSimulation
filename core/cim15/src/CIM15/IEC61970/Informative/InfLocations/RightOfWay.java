/**
 */
package CIM15.IEC61970.Informative.InfLocations;

import CIM15.IEC61968.Common.Agreement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Of Way</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.RightOfWay#getPropertyData <em>Property Data</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.RightOfWay#getLandProperties <em>Land Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightOfWay extends Agreement {
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
	 * The cached value of the '{@link #getLandProperties() <em>Land Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<LandProperty> landProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightOfWay() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.RIGHT_OF_WAY;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.RightOfWay#getPropertyData <em>Property Data</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.RightOfWay#getPropertyData <em>Property Data</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLocations.RightOfWay#getPropertyData <em>Property Data</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Land Properties</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.LandProperty}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getRightOfWays <em>Right Of Ways</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Properties</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.LandProperty#getRightOfWays
	 * @generated
	 */
	public EList<LandProperty> getLandProperties() {
		if (landProperties == null) {
			landProperties = new BasicInternalEList<LandProperty>(LandProperty.class);
		}
		return landProperties;
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
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandProperties()).basicAdd(otherEnd, msgs);
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
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				return ((InternalEList<?>)getLandProperties()).basicRemove(otherEnd, msgs);
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
			case InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA:
				return getPropertyData();
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				return getLandProperties();
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
			case InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA:
				setPropertyData((String)newValue);
				return;
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				getLandProperties().clear();
				getLandProperties().addAll((Collection<? extends LandProperty>)newValue);
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
			case InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA:
				unsetPropertyData();
				return;
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				getLandProperties().clear();
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
			case InfLocationsPackage.RIGHT_OF_WAY__PROPERTY_DATA:
				return isSetPropertyData();
			case InfLocationsPackage.RIGHT_OF_WAY__LAND_PROPERTIES:
				return landProperties != null && !landProperties.isEmpty();
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

} // RightOfWay
