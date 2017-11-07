/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61970.Informative.InfCommon.Role;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Org Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation <em>Parent Organisation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation <em>Child Organisation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID <em>Client ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrgOrgRole extends Role {
	/**
	 * The cached value of the '{@link #getParentOrganisation() <em>Parent Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation parentOrganisation;

	/**
	 * The cached value of the '{@link #getChildOrganisation() <em>Child Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation childOrganisation;

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
	protected OrgOrgRole() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ORG_ORG_ROLE;
	}

	/**
	 * Returns the value of the '<em><b>Parent Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles <em>Child Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Organisation</em>' reference.
	 * @see #setParentOrganisation(ErpOrganisation)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChildOrganisationRoles
	 * @generated
	 */
	public ErpOrganisation getParentOrganisation() {
		if (parentOrganisation != null && parentOrganisation.eIsProxy()) {
			InternalEObject oldParentOrganisation = (InternalEObject)parentOrganisation;
			parentOrganisation = (ErpOrganisation)eResolveProxy(oldParentOrganisation);
			if (parentOrganisation != oldParentOrganisation) {
			}
		}
		return parentOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetParentOrganisation() {
		return parentOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentOrganisation(ErpOrganisation newParentOrganisation, NotificationChain msgs) {
		ErpOrganisation oldParentOrganisation = parentOrganisation;
		parentOrganisation = newParentOrganisation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getParentOrganisation <em>Parent Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Organisation</em>' reference.
	 * @see #getParentOrganisation()
	 * @generated
	 */
	public void setParentOrganisation(ErpOrganisation newParentOrganisation) {
		if (newParentOrganisation != parentOrganisation) {
			NotificationChain msgs = null;
			if (parentOrganisation != null)
				msgs = ((InternalEObject)parentOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
			if (newParentOrganisation != null)
				msgs = ((InternalEObject)newParentOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetParentOrganisation(newParentOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Child Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles <em>Parent Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Organisation</em>' reference.
	 * @see #setChildOrganisation(ErpOrganisation)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getParentOrganisationRoles
	 * @generated
	 */
	public ErpOrganisation getChildOrganisation() {
		if (childOrganisation != null && childOrganisation.eIsProxy()) {
			InternalEObject oldChildOrganisation = (InternalEObject)childOrganisation;
			childOrganisation = (ErpOrganisation)eResolveProxy(oldChildOrganisation);
			if (childOrganisation != oldChildOrganisation) {
			}
		}
		return childOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetChildOrganisation() {
		return childOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildOrganisation(ErpOrganisation newChildOrganisation, NotificationChain msgs) {
		ErpOrganisation oldChildOrganisation = childOrganisation;
		childOrganisation = newChildOrganisation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getChildOrganisation <em>Child Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Organisation</em>' reference.
	 * @see #getChildOrganisation()
	 * @generated
	 */
	public void setChildOrganisation(ErpOrganisation newChildOrganisation) {
		if (newChildOrganisation != childOrganisation) {
			NotificationChain msgs = null;
			if (childOrganisation != null)
				msgs = ((InternalEObject)childOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
			if (newChildOrganisation != null)
				msgs = ((InternalEObject)newChildOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetChildOrganisation(newChildOrganisation, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID <em>Client ID</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID <em>Client ID</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole#getClientID <em>Client ID</em>}' attribute is set.
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
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				if (parentOrganisation != null)
					msgs = ((InternalEObject)parentOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__CHILD_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
				return basicSetParentOrganisation((ErpOrganisation)otherEnd, msgs);
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				if (childOrganisation != null)
					msgs = ((InternalEObject)childOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__PARENT_ORGANISATION_ROLES, ErpOrganisation.class, msgs);
				return basicSetChildOrganisation((ErpOrganisation)otherEnd, msgs);
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
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				return basicSetParentOrganisation(null, msgs);
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				return basicSetChildOrganisation(null, msgs);
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
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				if (resolve) return getParentOrganisation();
				return basicGetParentOrganisation();
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				if (resolve) return getChildOrganisation();
				return basicGetChildOrganisation();
			case InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID:
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
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				setParentOrganisation((ErpOrganisation)newValue);
				return;
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				setChildOrganisation((ErpOrganisation)newValue);
				return;
			case InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID:
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
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				setParentOrganisation((ErpOrganisation)null);
				return;
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				setChildOrganisation((ErpOrganisation)null);
				return;
			case InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID:
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
			case InfERPSupportPackage.ORG_ORG_ROLE__PARENT_ORGANISATION:
				return parentOrganisation != null;
			case InfERPSupportPackage.ORG_ORG_ROLE__CHILD_ORGANISATION:
				return childOrganisation != null;
			case InfERPSupportPackage.ORG_ORG_ROLE__CLIENT_ID:
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

} // OrgOrgRole
