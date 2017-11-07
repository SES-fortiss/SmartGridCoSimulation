/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfLocations.InfLocationsPackage;
import CIM15.IEC61970.Informative.InfLocations.LandProperty;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Site Level Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty <em>Land Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpSiteLevelData extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

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
	protected ErpSiteLevelData() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_SITE_LEVEL_DATA;
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Land Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getErpSiteLevelDatas <em>Erp Site Level Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Property</em>' reference.
	 * @see #setLandProperty(LandProperty)
	 * @see CIM15.IEC61970.Informative.InfLocations.LandProperty#getErpSiteLevelDatas
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty <em>Land Property</em>}' reference.
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
				msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS, LandProperty.class, msgs);
			if (newLandProperty != null)
				msgs = ((InternalEObject)newLandProperty).eInverseAdd(this, InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS, LandProperty.class, msgs);
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
				if (landProperty != null)
					msgs = ((InternalEObject)landProperty).eInverseRemove(this, InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS, LandProperty.class, msgs);
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
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
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA__LAND_PROPERTY:
				return landProperty != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpSiteLevelData
