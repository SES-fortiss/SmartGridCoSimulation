/**
 */
package CIM15.IEC61970.Informative.InfLocations;

import CIM15.IEC61970.Informative.InfCommon.Role;

import CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Property Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole#getLandProperty <em>Land Property</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation <em>Erp Organisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrgPropertyRole extends Role {
	/**
	 * The cached value of the '{@link #getLandProperty() <em>Land Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<LandProperty> landProperty;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrgPropertyRole() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.ORG_PROPERTY_ROLE;
	}

	/**
	 * Returns the value of the '<em><b>Land Property</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.LandProperty}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.LandProperty#getErpOrganisationRoles
	 * @generated
	 */
	public EList<LandProperty> getLandProperty() {
		if (landProperty == null) {
			landProperty = new BasicInternalEList<LandProperty>(LandProperty.class);
		}
		return landProperty;
	}

	/**
	 * Returns the value of the '<em><b>Erp Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles <em>Land Property Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation</em>' reference.
	 * @see #setErpOrganisation(ErpOrganisation)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLandPropertyRoles
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole#getErpOrganisation <em>Erp Organisation</em>}' reference.
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
				msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES, ErpOrganisation.class, msgs);
			if (newErpOrganisation != null)
				msgs = ((InternalEObject)newErpOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES, ErpOrganisation.class, msgs);
			msgs = basicSetErpOrganisation(newErpOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandProperty()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				if (erpOrganisation != null)
					msgs = ((InternalEObject)erpOrganisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__LAND_PROPERTY_ROLES, ErpOrganisation.class, msgs);
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				return ((InternalEList<?>)getLandProperty()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				return getLandProperty();
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				if (resolve) return getErpOrganisation();
				return basicGetErpOrganisation();
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				getLandProperty().clear();
				getLandProperty().addAll((Collection<? extends LandProperty>)newValue);
				return;
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)newValue);
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				getLandProperty().clear();
				return;
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				setErpOrganisation((ErpOrganisation)null);
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
			case InfLocationsPackage.ORG_PROPERTY_ROLE__LAND_PROPERTY:
				return landProperty != null && !landProperty.isEmpty();
			case InfLocationsPackage.ORG_PROPERTY_ROLE__ERP_ORGANISATION:
				return erpOrganisation != null;
		}
		return super.eIsSet(featureID);
	}

} // OrgPropertyRole
