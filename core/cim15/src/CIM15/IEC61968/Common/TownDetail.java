/**
 */
package CIM15.IEC61968.Common;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Town Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.TownDetail#getName <em>Name</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TownDetail#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TownDetail#getSection <em>Section</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TownDetail#getCode <em>Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.TownDetail#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TownDetail extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_OR_PROVINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected String stateOrProvince = STATE_OR_PROVINCE_EDEFAULT;

	/**
	 * This is true if the State Or Province attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateOrProvinceESet;

	/**
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected String section = SECTION_EDEFAULT;

	/**
	 * This is true if the Section attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sectionESet;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * This is true if the Country attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TownDetail() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TOWN_DETAIL;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
		nameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public void unsetName() {
		name = NAME_EDEFAULT;
		nameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TownDetail#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Or Province</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute.
	 * @see #isSetStateOrProvince()
	 * @see #unsetStateOrProvince()
	 * @see #setStateOrProvince(String)
	 * @generated
	 */
	public String getStateOrProvince() {
		return stateOrProvince;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Or Province</em>' attribute.
	 * @see #isSetStateOrProvince()
	 * @see #unsetStateOrProvince()
	 * @see #getStateOrProvince()
	 * @generated
	 */
	public void setStateOrProvince(String newStateOrProvince) {
		stateOrProvince = newStateOrProvince;
		stateOrProvinceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStateOrProvince()
	 * @see #getStateOrProvince()
	 * @see #setStateOrProvince(String)
	 * @generated
	 */
	public void unsetStateOrProvince() {
		stateOrProvince = STATE_OR_PROVINCE_EDEFAULT;
		stateOrProvinceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TownDetail#getStateOrProvince <em>State Or Province</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State Or Province</em>' attribute is set.
	 * @see #unsetStateOrProvince()
	 * @see #getStateOrProvince()
	 * @see #setStateOrProvince(String)
	 * @generated
	 */
	public boolean isSetStateOrProvince() {
		return stateOrProvinceESet;
	}

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #isSetSection()
	 * @see #unsetSection()
	 * @see #setSection(String)
	 * @generated
	 */
	public String getSection() {
		return section;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #isSetSection()
	 * @see #unsetSection()
	 * @see #getSection()
	 * @generated
	 */
	public void setSection(String newSection) {
		section = newSection;
		sectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSection()
	 * @see #getSection()
	 * @see #setSection(String)
	 * @generated
	 */
	public void unsetSection() {
		section = SECTION_EDEFAULT;
		sectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TownDetail#getSection <em>Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Section</em>' attribute is set.
	 * @see #unsetSection()
	 * @see #getSection()
	 * @see #setSection(String)
	 * @generated
	 */
	public boolean isSetSection() {
		return sectionESet;
	}

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	public void setCode(String newCode) {
		code = newCode;
		codeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public void unsetCode() {
		code = CODE_EDEFAULT;
		codeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TownDetail#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @generated
	 */
	public void setCountry(String newCountry) {
		country = newCountry;
		countryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.TownDetail#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountry()
	 * @see #getCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	public void unsetCountry() {
		country = COUNTRY_EDEFAULT;
		countryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.TownDetail#getCountry <em>Country</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Country</em>' attribute is set.
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @see #setCountry(String)
	 * @generated
	 */
	public boolean isSetCountry() {
		return countryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.TOWN_DETAIL__NAME:
				return getName();
			case CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
				return getStateOrProvince();
			case CommonPackage.TOWN_DETAIL__SECTION:
				return getSection();
			case CommonPackage.TOWN_DETAIL__CODE:
				return getCode();
			case CommonPackage.TOWN_DETAIL__COUNTRY:
				return getCountry();
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
			case CommonPackage.TOWN_DETAIL__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
				setStateOrProvince((String)newValue);
				return;
			case CommonPackage.TOWN_DETAIL__SECTION:
				setSection((String)newValue);
				return;
			case CommonPackage.TOWN_DETAIL__CODE:
				setCode((String)newValue);
				return;
			case CommonPackage.TOWN_DETAIL__COUNTRY:
				setCountry((String)newValue);
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
			case CommonPackage.TOWN_DETAIL__NAME:
				unsetName();
				return;
			case CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
				unsetStateOrProvince();
				return;
			case CommonPackage.TOWN_DETAIL__SECTION:
				unsetSection();
				return;
			case CommonPackage.TOWN_DETAIL__CODE:
				unsetCode();
				return;
			case CommonPackage.TOWN_DETAIL__COUNTRY:
				unsetCountry();
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
			case CommonPackage.TOWN_DETAIL__NAME:
				return isSetName();
			case CommonPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
				return isSetStateOrProvince();
			case CommonPackage.TOWN_DETAIL__SECTION:
				return isSetSection();
			case CommonPackage.TOWN_DETAIL__CODE:
				return isSetCode();
			case CommonPackage.TOWN_DETAIL__COUNTRY:
				return isSetCountry();
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", stateOrProvince: ");
		if (stateOrProvinceESet) result.append(stateOrProvince); else result.append("<unset>");
		result.append(", section: ");
		if (sectionESet) result.append(section); else result.append("<unset>");
		result.append(", code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(", country: ");
		if (countryESet) result.append(country); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TownDetail
