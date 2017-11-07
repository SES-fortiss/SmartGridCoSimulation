/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Time Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet <em>Erp Time Sheet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpTimeEntry extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getErpProjectAccounting() <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpProjectAccounting()
	 * @generated
	 * @ordered
	 */
	protected ErpProjectAccounting erpProjectAccounting;

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
	 * The cached value of the '{@link #getErpTimeSheet() <em>Erp Time Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpTimeSheet()
	 * @generated
	 * @ordered
	 */
	protected ErpTimeSheet erpTimeSheet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpTimeEntry() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_TIME_ENTRY;
	}

	/**
	 * Returns the value of the '<em><b>Erp Project Accounting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries <em>Erp Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Project Accounting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #setErpProjectAccounting(ErpProjectAccounting)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries
	 * @generated
	 */
	public ErpProjectAccounting getErpProjectAccounting() {
		if (erpProjectAccounting != null && erpProjectAccounting.eIsProxy()) {
			InternalEObject oldErpProjectAccounting = (InternalEObject)erpProjectAccounting;
			erpProjectAccounting = (ErpProjectAccounting)eResolveProxy(oldErpProjectAccounting);
			if (erpProjectAccounting != oldErpProjectAccounting) {
			}
		}
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpProjectAccounting basicGetErpProjectAccounting() {
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpProjectAccounting(ErpProjectAccounting newErpProjectAccounting, NotificationChain msgs) {
		ErpProjectAccounting oldErpProjectAccounting = erpProjectAccounting;
		erpProjectAccounting = newErpProjectAccounting;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	public void setErpProjectAccounting(ErpProjectAccounting newErpProjectAccounting) {
		if (newErpProjectAccounting != erpProjectAccounting) {
			NotificationChain msgs = null;
			if (erpProjectAccounting != null)
				msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES, ErpProjectAccounting.class, msgs);
			if (newErpProjectAccounting != null)
				msgs = ((InternalEObject)newErpProjectAccounting).eInverseAdd(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES, ErpProjectAccounting.class, msgs);
			msgs = basicSetErpProjectAccounting(newErpProjectAccounting, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_TIME_ENTRY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_TIME_ENTRY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Time Sheet</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries <em>Erp Time Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Time Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Time Sheet</em>' reference.
	 * @see #setErpTimeSheet(ErpTimeSheet)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet#getErpTimeEntries
	 * @generated
	 */
	public ErpTimeSheet getErpTimeSheet() {
		if (erpTimeSheet != null && erpTimeSheet.eIsProxy()) {
			InternalEObject oldErpTimeSheet = (InternalEObject)erpTimeSheet;
			erpTimeSheet = (ErpTimeSheet)eResolveProxy(oldErpTimeSheet);
			if (erpTimeSheet != oldErpTimeSheet) {
			}
		}
		return erpTimeSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpTimeSheet basicGetErpTimeSheet() {
		return erpTimeSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpTimeSheet(ErpTimeSheet newErpTimeSheet, NotificationChain msgs) {
		ErpTimeSheet oldErpTimeSheet = erpTimeSheet;
		erpTimeSheet = newErpTimeSheet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpTimeSheet <em>Erp Time Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Time Sheet</em>' reference.
	 * @see #getErpTimeSheet()
	 * @generated
	 */
	public void setErpTimeSheet(ErpTimeSheet newErpTimeSheet) {
		if (newErpTimeSheet != erpTimeSheet) {
			NotificationChain msgs = null;
			if (erpTimeSheet != null)
				msgs = ((InternalEObject)erpTimeSheet).eInverseRemove(this, InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES, ErpTimeSheet.class, msgs);
			if (newErpTimeSheet != null)
				msgs = ((InternalEObject)newErpTimeSheet).eInverseAdd(this, InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES, ErpTimeSheet.class, msgs);
			msgs = basicSetErpTimeSheet(newErpTimeSheet, msgs);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				if (erpProjectAccounting != null)
					msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES, ErpProjectAccounting.class, msgs);
				return basicSetErpProjectAccounting((ErpProjectAccounting)otherEnd, msgs);
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				if (erpTimeSheet != null)
					msgs = ((InternalEObject)erpTimeSheet).eInverseRemove(this, InfERPSupportPackage.ERP_TIME_SHEET__ERP_TIME_ENTRIES, ErpTimeSheet.class, msgs);
				return basicSetErpTimeSheet((ErpTimeSheet)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				return basicSetErpProjectAccounting(null, msgs);
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				return basicSetErpTimeSheet(null, msgs);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				if (resolve) return getErpProjectAccounting();
				return basicGetErpProjectAccounting();
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				if (resolve) return getErpTimeSheet();
				return basicGetErpTimeSheet();
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)newValue);
				return;
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				setErpTimeSheet((ErpTimeSheet)newValue);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)null);
				return;
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				setErpTimeSheet((ErpTimeSheet)null);
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
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_PROJECT_ACCOUNTING:
				return erpProjectAccounting != null;
			case InfERPSupportPackage.ERP_TIME_ENTRY__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_TIME_ENTRY__ERP_TIME_SHEET:
				return erpTimeSheet != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpTimeEntry
