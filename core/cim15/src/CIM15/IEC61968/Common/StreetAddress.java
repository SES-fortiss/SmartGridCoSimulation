/**
 */
package CIM15.IEC61968.Common;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.StreetAddress#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.StreetAddress#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.StreetAddress#getTownDetail <em>Town Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreetAddress extends MinimalEObjectImpl.Container implements EObject {
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
	 * The cached value of the '{@link #getStreetDetail() <em>Street Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetDetail()
	 * @generated
	 * @ordered
	 */
	protected StreetDetail streetDetail;

	/**
	 * The cached value of the '{@link #getTownDetail() <em>Town Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTownDetail()
	 * @generated
	 * @ordered
	 */
	protected TownDetail townDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreetAddress() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.STREET_ADDRESS;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.StreetAddress#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.STREET_ADDRESS__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.STREET_ADDRESS__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Street Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Detail</em>' containment reference.
	 * @see #setStreetDetail(StreetDetail)
	 * @generated
	 */
	public StreetDetail getStreetDetail() {
		return streetDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreetDetail(StreetDetail newStreetDetail, NotificationChain msgs) {
		StreetDetail oldStreetDetail = streetDetail;
		streetDetail = newStreetDetail;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.StreetAddress#getStreetDetail <em>Street Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Detail</em>' containment reference.
	 * @see #getStreetDetail()
	 * @generated
	 */
	public void setStreetDetail(StreetDetail newStreetDetail) {
		if (newStreetDetail != streetDetail) {
			NotificationChain msgs = null;
			if (streetDetail != null)
				msgs = ((InternalEObject)streetDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.STREET_ADDRESS__STREET_DETAIL, null, msgs);
			if (newStreetDetail != null)
				msgs = ((InternalEObject)newStreetDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.STREET_ADDRESS__STREET_DETAIL, null, msgs);
			msgs = basicSetStreetDetail(newStreetDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Town Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Town Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Town Detail</em>' containment reference.
	 * @see #setTownDetail(TownDetail)
	 * @generated
	 */
	public TownDetail getTownDetail() {
		return townDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTownDetail(TownDetail newTownDetail, NotificationChain msgs) {
		TownDetail oldTownDetail = townDetail;
		townDetail = newTownDetail;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.StreetAddress#getTownDetail <em>Town Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Town Detail</em>' containment reference.
	 * @see #getTownDetail()
	 * @generated
	 */
	public void setTownDetail(TownDetail newTownDetail) {
		if (newTownDetail != townDetail) {
			NotificationChain msgs = null;
			if (townDetail != null)
				msgs = ((InternalEObject)townDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.STREET_ADDRESS__TOWN_DETAIL, null, msgs);
			if (newTownDetail != null)
				msgs = ((InternalEObject)newTownDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.STREET_ADDRESS__TOWN_DETAIL, null, msgs);
			msgs = basicSetTownDetail(newTownDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.STREET_ADDRESS__STATUS:
				return basicSetStatus(null, msgs);
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				return basicSetStreetDetail(null, msgs);
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				return basicSetTownDetail(null, msgs);
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
			case CommonPackage.STREET_ADDRESS__STATUS:
				return getStatus();
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				return getStreetDetail();
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				return getTownDetail();
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
			case CommonPackage.STREET_ADDRESS__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				setStreetDetail((StreetDetail)newValue);
				return;
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				setTownDetail((TownDetail)newValue);
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
			case CommonPackage.STREET_ADDRESS__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				setStreetDetail((StreetDetail)null);
				return;
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				setTownDetail((TownDetail)null);
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
			case CommonPackage.STREET_ADDRESS__STATUS:
				return status != null;
			case CommonPackage.STREET_ADDRESS__STREET_DETAIL:
				return streetDetail != null;
			case CommonPackage.STREET_ADDRESS__TOWN_DETAIL:
				return townDetail != null;
		}
		return super.eIsSet(featureID);
	}

} // StreetAddress
