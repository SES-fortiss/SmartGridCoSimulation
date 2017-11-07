/**
 */
package CIM15.IEC61970.Informative.InfCustomers;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Informative.InfOperations.OutageReport;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.OutageHistory#getOutageReports <em>Outage Reports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutageHistory extends Document {
	/**
	 * The cached value of the '{@link #getOutageReports() <em>Outage Reports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageReports()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageReport> outageReports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageHistory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.OUTAGE_HISTORY;
	}

	/**
	 * Returns the value of the '<em><b>Outage Reports</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageReport}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory <em>Outage History</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Reports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Reports</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory
	 * @generated
	 */
	public EList<OutageReport> getOutageReports() {
		if (outageReports == null) {
			outageReports = new BasicInternalEList<OutageReport>(OutageReport.class);
		}
		return outageReports;
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
			case InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageReports()).basicAdd(otherEnd, msgs);
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
			case InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS:
				return ((InternalEList<?>)getOutageReports()).basicRemove(otherEnd, msgs);
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
			case InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS:
				return getOutageReports();
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
			case InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS:
				getOutageReports().clear();
				getOutageReports().addAll((Collection<? extends OutageReport>)newValue);
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
			case InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS:
				getOutageReports().clear();
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
			case InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS:
				return outageReports != null && !outageReports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // OutageHistory
