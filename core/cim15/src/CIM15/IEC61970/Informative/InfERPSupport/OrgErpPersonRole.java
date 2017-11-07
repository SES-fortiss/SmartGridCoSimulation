/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61970.Informative.InfCommon.Role;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Erp Person Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation <em>Erp Organisation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID <em>Client ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrgErpPersonRole extends Role {
	/**
	 * The cached value of the '{@link #getErpPerson() <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPerson()
	 * @generated
	 * @ordered
	 */
	protected ErpPerson erpPerson;

	/**
	 * The cached value of the '{@link #getErpOrganisation() <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation erpOrganisation;

	/**
	 * The default value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientID()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientID()
	 * @generated
	 * @ordered
	 */
	protected String clientID = CLIENT_ID_EDEFAULT;

	/**
	 * This is true if the Client ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientIDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgErpPersonRole() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ORG_ERP_PERSON_ROLE;
	}

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getErpOrganisationRoles
	 * @generated
	 */
	public ErpPerson getErpPerson() {
		if (erpPerson != null && erpPerson.eIsProxy()) {
			InternalEObject oldErpPerson = (InternalEObject)erpPerson;
			erpPerson = (ErpPerson)eResolveProxy(oldErpPerson);
			if (erpPerson != oldErpPerson) {
			}
		}
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson basicGetErpPerson() {
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPerson(ErpPerson newErpPerson, NotificationChain msgs) {
		ErpPerson oldErpPerson = erpPerson;
		erpPerson = newErpPerson;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	public void setErpPerson(ErpPerson newErpPerson) {
		if (newErpPerson != erpPerson) {
			NotificationChain msgs = null;
			if (erpPerson != null)
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles <em>Erp Person Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation</em>' reference.
	 * @see #setErpOrganisation(ErpOrganisation)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getErpPersonRoles
	 * @generated
	 */
	public ErpOrganisation getErpOrganisation() {
		if (erpOrganisation != null && erpOrganisation.eIsProxy()) {
			InternalEObject oldErpOrganisation = (InternalEObject)erpOrganisation;
			erpOrganisation = (ErpOrganisation)eResolveProxy(oldErpOrganisation);
			if (erpOrganisation != oldErpOrganisation) {
			}
		}
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetErpOrganisation() {
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpOrganisation(ErpOrganisation newErpOrganisation, NotificationChain msgs) {
		ErpOrganisation oldErpOrganisation = erpOrganisation;
		erpOrganisation = newErpOrganisation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getErpOrganisation <em>Erp Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Organisation</em>' reference.
	 * @see #getErpOrganisation()
	 * @generated
	 */
	public void setErpOrganisation(ErpOrganisation newErpOrganisation) {
		if (newErpOrganisation != erpOrganisation) {
			NotificationChain msgs = null;
			if (erpOrganisation != null)
				msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES, ErpOrganisation.class, msgs);
			if (newErpOrganisation != null)
				msgs = ((InternalEObject)newErpOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetErpOrganisation(newErpOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client ID</em>' attribute.
	 * @see #isSetClientID()
	 * @see #unsetClientID()
	 * @see #setClientID(String)
	 * @generated
	 */
	public String getClientID() {
		return clientID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client ID</em>' attribute.
	 * @see #isSetClientID()
	 * @see #unsetClientID()
	 * @see #getClientID()
	 * @generated
	 */
	public void setClientID(String newClientID) {
		clientID = newClientID;
		clientIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClientID()
	 * @see #getClientID()
	 * @see #setClientID(String)
	 * @generated
	 */
	public void unsetClientID() {
		clientID = CLIENT_ID_EDEFAULT;
		clientIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole#getClientID <em>Client ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client ID</em>' attribute is set.
	 * @see #unsetClientID()
	 * @see #getClientID()
	 * @see #setClientID(String)
	 * @generated
	 */
	public boolean isSetClientID() {
		return clientIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__ERP_ORGANISATION_ROLES, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				if (erpOrganisation != null)
					msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__ERP_PERSON_ROLES, ErpOrganisation.class, msgs);
				return basicSetErpOrganisation((ErpOrganisation)otherEnd, msgs);
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				return basicSetErpOrganisation(null, msgs);
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				if (resolve) return getErpOrganisation();
				return basicGetErpOrganisation();
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID:
				return getClientID();
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
				return;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)newValue);
				return;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID:
				setClientID((String)newValue);
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)null);
				return;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)null);
				return;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID:
				unsetClientID();
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
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_PERSON:
				return erpPerson != null;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__ERP_ORGANISATION:
				return erpOrganisation != null;
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE__CLIENT_ID:
				return isSetClientID();
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
		result.append(" (clientID: ");
		if (clientIDESet) result.append(clientID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OrgErpPersonRole
