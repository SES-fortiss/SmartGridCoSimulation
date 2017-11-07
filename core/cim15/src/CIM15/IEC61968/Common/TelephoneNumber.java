/**
 */
package CIM15.IEC61968.Common;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.TelephoneNumber#getCityCode <em>City Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TelephoneNumber#getLocalNumber <em>Local Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TelephoneNumber#getExtension <em>Extension</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TelephoneNumber#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TelephoneNumber#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TelephoneNumber extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getCityCode() <em>City Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCityCode() <em>City Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityCode()
	 * @generated
	 * @ordered
	 */
	protected String cityCode = CITY_CODE_EDEFAULT;

	/**
	 * This is true if the City Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cityCodeESet;

	/**
	 * The default value of the '{@link #getLocalNumber() <em>Local Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalNumber() <em>Local Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalNumber()
	 * @generated
	 * @ordered
	 */
	protected String localNumber = LOCAL_NUMBER_EDEFAULT;

	/**
	 * This is true if the Local Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localNumberESet;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * This is true if the Extension attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extensionESet;

	/**
	 * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected String areaCode = AREA_CODE_EDEFAULT;

	/**
	 * This is true if the Area Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean areaCodeESet;

	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;

	/**
	 * This is true if the Country Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countryCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelephoneNumber() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TELEPHONE_NUMBER;
	}

	/**
	 * Returns the value of the '<em><b>City Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Code</em>' attribute.
	 * @see #isSetCityCode()
	 * @see #unsetCityCode()
	 * @see #setCityCode(String)
	 * @generated
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getCityCode <em>City Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Code</em>' attribute.
	 * @see #isSetCityCode()
	 * @see #unsetCityCode()
	 * @see #getCityCode()
	 * @generated
	 */
	public void setCityCode(String newCityCode) {
		cityCode = newCityCode;
		cityCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getCityCode <em>City Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCityCode()
	 * @see #getCityCode()
	 * @see #setCityCode(String)
	 * @generated
	 */
	public void unsetCityCode() {
		cityCode = CITY_CODE_EDEFAULT;
		cityCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getCityCode <em>City Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>City Code</em>' attribute is set.
	 * @see #unsetCityCode()
	 * @see #getCityCode()
	 * @see #setCityCode(String)
	 * @generated
	 */
	public boolean isSetCityCode() {
		return cityCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Local Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Number</em>' attribute.
	 * @see #isSetLocalNumber()
	 * @see #unsetLocalNumber()
	 * @see #setLocalNumber(String)
	 * @generated
	 */
	public String getLocalNumber() {
		return localNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Number</em>' attribute.
	 * @see #isSetLocalNumber()
	 * @see #unsetLocalNumber()
	 * @see #getLocalNumber()
	 * @generated
	 */
	public void setLocalNumber(String newLocalNumber) {
		localNumber = newLocalNumber;
		localNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalNumber()
	 * @see #getLocalNumber()
	 * @see #setLocalNumber(String)
	 * @generated
	 */
	public void unsetLocalNumber() {
		localNumber = LOCAL_NUMBER_EDEFAULT;
		localNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Local Number</em>' attribute is set.
	 * @see #unsetLocalNumber()
	 * @see #getLocalNumber()
	 * @see #setLocalNumber(String)
	 * @generated
	 */
	public boolean isSetLocalNumber() {
		return localNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #isSetExtension()
	 * @see #unsetExtension()
	 * @see #setExtension(String)
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #isSetExtension()
	 * @see #unsetExtension()
	 * @see #getExtension()
	 * @generated
	 */
	public void setExtension(String newExtension) {
		extension = newExtension;
		extensionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtension()
	 * @see #getExtension()
	 * @see #setExtension(String)
	 * @generated
	 */
	public void unsetExtension() {
		extension = EXTENSION_EDEFAULT;
		extensionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getExtension <em>Extension</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extension</em>' attribute is set.
	 * @see #unsetExtension()
	 * @see #getExtension()
	 * @see #setExtension(String)
	 * @generated
	 */
	public boolean isSetExtension() {
		return extensionESet;
	}

	/**
	 * Returns the value of the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Code</em>' attribute.
	 * @see #isSetAreaCode()
	 * @see #unsetAreaCode()
	 * @see #setAreaCode(String)
	 * @generated
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Code</em>' attribute.
	 * @see #isSetAreaCode()
	 * @see #unsetAreaCode()
	 * @see #getAreaCode()
	 * @generated
	 */
	public void setAreaCode(String newAreaCode) {
		areaCode = newAreaCode;
		areaCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAreaCode()
	 * @see #getAreaCode()
	 * @see #setAreaCode(String)
	 * @generated
	 */
	public void unsetAreaCode() {
		areaCode = AREA_CODE_EDEFAULT;
		areaCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Area Code</em>' attribute is set.
	 * @see #unsetAreaCode()
	 * @see #getAreaCode()
	 * @see #setAreaCode(String)
	 * @generated
	 */
	public boolean isSetAreaCode() {
		return areaCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #isSetCountryCode()
	 * @see #unsetCountryCode()
	 * @see #setCountryCode(String)
	 * @generated
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #isSetCountryCode()
	 * @see #unsetCountryCode()
	 * @see #getCountryCode()
	 * @generated
	 */
	public void setCountryCode(String newCountryCode) {
		countryCode = newCountryCode;
		countryCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountryCode()
	 * @see #getCountryCode()
	 * @see #setCountryCode(String)
	 * @generated
	 */
	public void unsetCountryCode() {
		countryCode = COUNTRY_CODE_EDEFAULT;
		countryCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Country Code</em>' attribute is set.
	 * @see #unsetCountryCode()
	 * @see #getCountryCode()
	 * @see #setCountryCode(String)
	 * @generated
	 */
	public boolean isSetCountryCode() {
		return countryCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.TELEPHONE_NUMBER__CITY_CODE:
				return getCityCode();
			case CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
				return getLocalNumber();
			case CommonPackage.TELEPHONE_NUMBER__EXTENSION:
				return getExtension();
			case CommonPackage.TELEPHONE_NUMBER__AREA_CODE:
				return getAreaCode();
			case CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
				return getCountryCode();
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
			case CommonPackage.TELEPHONE_NUMBER__CITY_CODE:
				setCityCode((String)newValue);
				return;
			case CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
				setLocalNumber((String)newValue);
				return;
			case CommonPackage.TELEPHONE_NUMBER__EXTENSION:
				setExtension((String)newValue);
				return;
			case CommonPackage.TELEPHONE_NUMBER__AREA_CODE:
				setAreaCode((String)newValue);
				return;
			case CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
				setCountryCode((String)newValue);
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
			case CommonPackage.TELEPHONE_NUMBER__CITY_CODE:
				unsetCityCode();
				return;
			case CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
				unsetLocalNumber();
				return;
			case CommonPackage.TELEPHONE_NUMBER__EXTENSION:
				unsetExtension();
				return;
			case CommonPackage.TELEPHONE_NUMBER__AREA_CODE:
				unsetAreaCode();
				return;
			case CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
				unsetCountryCode();
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
			case CommonPackage.TELEPHONE_NUMBER__CITY_CODE:
				return isSetCityCode();
			case CommonPackage.TELEPHONE_NUMBER__LOCAL_NUMBER:
				return isSetLocalNumber();
			case CommonPackage.TELEPHONE_NUMBER__EXTENSION:
				return isSetExtension();
			case CommonPackage.TELEPHONE_NUMBER__AREA_CODE:
				return isSetAreaCode();
			case CommonPackage.TELEPHONE_NUMBER__COUNTRY_CODE:
				return isSetCountryCode();
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
		result.append(" (cityCode: ");
		if (cityCodeESet) result.append(cityCode); else result.append("<unset>");
		result.append(", localNumber: ");
		if (localNumberESet) result.append(localNumber); else result.append("<unset>");
		result.append(", extension: ");
		if (extensionESet) result.append(extension); else result.append("<unset>");
		result.append(", areaCode: ");
		if (areaCodeESet) result.append(areaCode); else result.append("<unset>");
		result.append(", countryCode: ");
		if (countryCodeESet) result.append(countryCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TelephoneNumber
