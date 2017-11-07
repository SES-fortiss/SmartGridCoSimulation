/**
 */
package CIM15.IEC61968.Common;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfCommon.BusinessRole;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.Organisation#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Organisation#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Organisation#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Organisation#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Organisation#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Organisation#getBusinessRoles <em>Business Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Organisation extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone2()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber phone2;

	/**
	 * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone1()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber phone1;

	/**
	 * The cached value of the '{@link #getStreetAddress() <em>Street Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected StreetAddress streetAddress;

	/**
	 * The cached value of the '{@link #getPostalAddress() <em>Postal Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalAddress()
	 * @generated
	 * @ordered
	 */
	protected PostalAddress postalAddress;

	/**
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

	/**
	 * The cached value of the '{@link #getBusinessRoles() <em>Business Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRole> businessRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Organisation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ORGANISATION;
	}

	/**
	 * Returns the value of the '<em><b>Phone2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone2</em>' containment reference.
	 * @see #setPhone2(TelephoneNumber)
	 * @generated
	 */
	public TelephoneNumber getPhone2() {
		return phone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone2(TelephoneNumber newPhone2, NotificationChain msgs) {
		TelephoneNumber oldPhone2 = phone2;
		phone2 = newPhone2;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Organisation#getPhone2 <em>Phone2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone2</em>' containment reference.
	 * @see #getPhone2()
	 * @generated
	 */
	public void setPhone2(TelephoneNumber newPhone2) {
		if (newPhone2 != phone2) {
			NotificationChain msgs = null;
			if (phone2 != null)
				msgs = ((InternalEObject)phone2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__PHONE2, null, msgs);
			if (newPhone2 != null)
				msgs = ((InternalEObject)newPhone2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__PHONE2, null, msgs);
			msgs = basicSetPhone2(newPhone2, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Phone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone1</em>' containment reference.
	 * @see #setPhone1(TelephoneNumber)
	 * @generated
	 */
	public TelephoneNumber getPhone1() {
		return phone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone1(TelephoneNumber newPhone1, NotificationChain msgs) {
		TelephoneNumber oldPhone1 = phone1;
		phone1 = newPhone1;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Organisation#getPhone1 <em>Phone1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone1</em>' containment reference.
	 * @see #getPhone1()
	 * @generated
	 */
	public void setPhone1(TelephoneNumber newPhone1) {
		if (newPhone1 != phone1) {
			NotificationChain msgs = null;
			if (phone1 != null)
				msgs = ((InternalEObject)phone1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__PHONE1, null, msgs);
			if (newPhone1 != null)
				msgs = ((InternalEObject)newPhone1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__PHONE1, null, msgs);
			msgs = basicSetPhone1(newPhone1, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Street Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Address</em>' containment reference.
	 * @see #setStreetAddress(StreetAddress)
	 * @generated
	 */
	public StreetAddress getStreetAddress() {
		return streetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreetAddress(StreetAddress newStreetAddress, NotificationChain msgs) {
		StreetAddress oldStreetAddress = streetAddress;
		streetAddress = newStreetAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Organisation#getStreetAddress <em>Street Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Address</em>' containment reference.
	 * @see #getStreetAddress()
	 * @generated
	 */
	public void setStreetAddress(StreetAddress newStreetAddress) {
		if (newStreetAddress != streetAddress) {
			NotificationChain msgs = null;
			if (streetAddress != null)
				msgs = ((InternalEObject)streetAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__STREET_ADDRESS, null, msgs);
			if (newStreetAddress != null)
				msgs = ((InternalEObject)newStreetAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__STREET_ADDRESS, null, msgs);
			msgs = basicSetStreetAddress(newStreetAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Postal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Address</em>' containment reference.
	 * @see #setPostalAddress(PostalAddress)
	 * @generated
	 */
	public PostalAddress getPostalAddress() {
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalAddress(PostalAddress newPostalAddress, NotificationChain msgs) {
		PostalAddress oldPostalAddress = postalAddress;
		postalAddress = newPostalAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Organisation#getPostalAddress <em>Postal Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Address</em>' containment reference.
	 * @see #getPostalAddress()
	 * @generated
	 */
	public void setPostalAddress(PostalAddress newPostalAddress) {
		if (newPostalAddress != postalAddress) {
			NotificationChain msgs = null;
			if (postalAddress != null)
				msgs = ((InternalEObject)postalAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__POSTAL_ADDRESS, null, msgs);
			if (newPostalAddress != null)
				msgs = ((InternalEObject)newPostalAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__POSTAL_ADDRESS, null, msgs);
			msgs = basicSetPostalAddress(newPostalAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' containment reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicAddress(ElectronicAddress newElectronicAddress, NotificationChain msgs) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Organisation#getElectronicAddress <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' containment reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		if (newElectronicAddress != electronicAddress) {
			NotificationChain msgs = null;
			if (electronicAddress != null)
				msgs = ((InternalEObject)electronicAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS, null, msgs);
			if (newElectronicAddress != null)
				msgs = ((InternalEObject)newElectronicAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS, null, msgs);
			msgs = basicSetElectronicAddress(newElectronicAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Business Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.BusinessRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.BusinessRole#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.BusinessRole#getOrganisations
	 * @generated
	 */
	public EList<BusinessRole> getBusinessRoles() {
		if (businessRoles == null) {
			businessRoles = new BasicInternalEList<BusinessRole>(BusinessRole.class);
		}
		return businessRoles;
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
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessRoles()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.ORGANISATION__PHONE2:
				return basicSetPhone2(null, msgs);
			case CommonPackage.ORGANISATION__PHONE1:
				return basicSetPhone1(null, msgs);
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				return basicSetStreetAddress(null, msgs);
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				return basicSetPostalAddress(null, msgs);
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				return basicSetElectronicAddress(null, msgs);
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				return ((InternalEList<?>)getBusinessRoles()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.ORGANISATION__PHONE2:
				return getPhone2();
			case CommonPackage.ORGANISATION__PHONE1:
				return getPhone1();
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				return getStreetAddress();
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				return getPostalAddress();
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				return getElectronicAddress();
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				return getBusinessRoles();
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
			case CommonPackage.ORGANISATION__PHONE2:
				setPhone2((TelephoneNumber)newValue);
				return;
			case CommonPackage.ORGANISATION__PHONE1:
				setPhone1((TelephoneNumber)newValue);
				return;
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				setStreetAddress((StreetAddress)newValue);
				return;
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				setPostalAddress((PostalAddress)newValue);
				return;
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				getBusinessRoles().clear();
				getBusinessRoles().addAll((Collection<? extends BusinessRole>)newValue);
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
			case CommonPackage.ORGANISATION__PHONE2:
				setPhone2((TelephoneNumber)null);
				return;
			case CommonPackage.ORGANISATION__PHONE1:
				setPhone1((TelephoneNumber)null);
				return;
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				setStreetAddress((StreetAddress)null);
				return;
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				setPostalAddress((PostalAddress)null);
				return;
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				getBusinessRoles().clear();
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
			case CommonPackage.ORGANISATION__PHONE2:
				return phone2 != null;
			case CommonPackage.ORGANISATION__PHONE1:
				return phone1 != null;
			case CommonPackage.ORGANISATION__STREET_ADDRESS:
				return streetAddress != null;
			case CommonPackage.ORGANISATION__POSTAL_ADDRESS:
				return postalAddress != null;
			case CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case CommonPackage.ORGANISATION__BUSINESS_ROLES:
				return businessRoles != null && !businessRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Organisation
