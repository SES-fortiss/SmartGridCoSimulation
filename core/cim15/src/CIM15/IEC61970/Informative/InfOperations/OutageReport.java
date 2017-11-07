/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import CIM15.IEC61970.Informative.InfCustomers.OutageHistory;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord <em>Outage Record</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount <em>Customer Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getAverageCml <em>Average Cml</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory <em>Outage History</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration <em>Outage Duration</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getTotalCml <em>Total Cml</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutageReport extends Document {
	/**
	 * The cached value of the '{@link #getOutageRecord() <em>Outage Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageRecord()
	 * @generated
	 * @ordered
	 */
	protected OutageRecord outageRecord;

	/**
	 * The default value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerCount() <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int customerCount = CUSTOMER_COUNT_EDEFAULT;

	/**
	 * This is true if the Customer Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customerCountESet;

	/**
	 * The default value of the '{@link #getAverageCml() <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCml()
	 * @generated
	 * @ordered
	 */
	protected static final float AVERAGE_CML_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAverageCml() <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCml()
	 * @generated
	 * @ordered
	 */
	protected float averageCml = AVERAGE_CML_EDEFAULT;

	/**
	 * This is true if the Average Cml attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean averageCmlESet;

	/**
	 * The cached value of the '{@link #getOutageHistory() <em>Outage History</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageHistory()
	 * @generated
	 * @ordered
	 */
	protected OutageHistory outageHistory;

	/**
	 * The default value of the '{@link #getOutageDuration() <em>Outage Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float OUTAGE_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOutageDuration() <em>Outage Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageDuration()
	 * @generated
	 * @ordered
	 */
	protected float outageDuration = OUTAGE_DURATION_EDEFAULT;

	/**
	 * This is true if the Outage Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outageDurationESet;

	/**
	 * The default value of the '{@link #getTotalCml() <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCml()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_CML_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalCml() <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCml()
	 * @generated
	 * @ordered
	 */
	protected float totalCml = TOTAL_CML_EDEFAULT;

	/**
	 * This is true if the Total Cml attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalCmlESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageReport() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_REPORT;
	}

	/**
	 * Returns the value of the '<em><b>Outage Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport <em>Outage Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Record</em>' reference.
	 * @see #setOutageRecord(OutageRecord)
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport
	 * @generated
	 */
	public OutageRecord getOutageRecord() {
		if (outageRecord != null && outageRecord.eIsProxy()) {
			InternalEObject oldOutageRecord = (InternalEObject)outageRecord;
			outageRecord = (OutageRecord)eResolveProxy(oldOutageRecord);
			if (outageRecord != oldOutageRecord) {
			}
		}
		return outageRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageRecord basicGetOutageRecord() {
		return outageRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageRecord(OutageRecord newOutageRecord, NotificationChain msgs) {
		OutageRecord oldOutageRecord = outageRecord;
		outageRecord = newOutageRecord;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord <em>Outage Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Record</em>' reference.
	 * @see #getOutageRecord()
	 * @generated
	 */
	public void setOutageRecord(OutageRecord newOutageRecord) {
		if (newOutageRecord != outageRecord) {
			NotificationChain msgs = null;
			if (outageRecord != null)
				msgs = ((InternalEObject)outageRecord).eInverseRemove(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, OutageRecord.class, msgs);
			if (newOutageRecord != null)
				msgs = ((InternalEObject)newOutageRecord).eInverseAdd(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, OutageRecord.class, msgs);
			msgs = basicSetOutageRecord(newOutageRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Count</em>' attribute.
	 * @see #isSetCustomerCount()
	 * @see #unsetCustomerCount()
	 * @see #setCustomerCount(int)
	 * @generated
	 */
	public int getCustomerCount() {
		return customerCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Count</em>' attribute.
	 * @see #isSetCustomerCount()
	 * @see #unsetCustomerCount()
	 * @see #getCustomerCount()
	 * @generated
	 */
	public void setCustomerCount(int newCustomerCount) {
		customerCount = newCustomerCount;
		customerCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount <em>Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomerCount()
	 * @see #getCustomerCount()
	 * @see #setCustomerCount(int)
	 * @generated
	 */
	public void unsetCustomerCount() {
		customerCount = CUSTOMER_COUNT_EDEFAULT;
		customerCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getCustomerCount <em>Customer Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Customer Count</em>' attribute is set.
	 * @see #unsetCustomerCount()
	 * @see #getCustomerCount()
	 * @see #setCustomerCount(int)
	 * @generated
	 */
	public boolean isSetCustomerCount() {
		return customerCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Average Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Cml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Cml</em>' attribute.
	 * @see #isSetAverageCml()
	 * @see #unsetAverageCml()
	 * @see #setAverageCml(float)
	 * @generated
	 */
	public float getAverageCml() {
		return averageCml;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getAverageCml <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Cml</em>' attribute.
	 * @see #isSetAverageCml()
	 * @see #unsetAverageCml()
	 * @see #getAverageCml()
	 * @generated
	 */
	public void setAverageCml(float newAverageCml) {
		averageCml = newAverageCml;
		averageCmlESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getAverageCml <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAverageCml()
	 * @see #getAverageCml()
	 * @see #setAverageCml(float)
	 * @generated
	 */
	public void unsetAverageCml() {
		averageCml = AVERAGE_CML_EDEFAULT;
		averageCmlESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getAverageCml <em>Average Cml</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Average Cml</em>' attribute is set.
	 * @see #unsetAverageCml()
	 * @see #getAverageCml()
	 * @see #setAverageCml(float)
	 * @generated
	 */
	public boolean isSetAverageCml() {
		return averageCmlESet;
	}

	/**
	 * Returns the value of the '<em><b>Outage History</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCustomers.OutageHistory#getOutageReports <em>Outage Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage History</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage History</em>' reference.
	 * @see #setOutageHistory(OutageHistory)
	 * @see CIM15.IEC61970.Informative.InfCustomers.OutageHistory#getOutageReports
	 * @generated
	 */
	public OutageHistory getOutageHistory() {
		if (outageHistory != null && outageHistory.eIsProxy()) {
			InternalEObject oldOutageHistory = (InternalEObject)outageHistory;
			outageHistory = (OutageHistory)eResolveProxy(oldOutageHistory);
			if (outageHistory != oldOutageHistory) {
			}
		}
		return outageHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageHistory basicGetOutageHistory() {
		return outageHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageHistory(OutageHistory newOutageHistory, NotificationChain msgs) {
		OutageHistory oldOutageHistory = outageHistory;
		outageHistory = newOutageHistory;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageHistory <em>Outage History</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage History</em>' reference.
	 * @see #getOutageHistory()
	 * @generated
	 */
	public void setOutageHistory(OutageHistory newOutageHistory) {
		if (newOutageHistory != outageHistory) {
			NotificationChain msgs = null;
			if (outageHistory != null)
				msgs = ((InternalEObject)outageHistory).eInverseRemove(this, InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS, OutageHistory.class, msgs);
			if (newOutageHistory != null)
				msgs = ((InternalEObject)newOutageHistory).eInverseAdd(this, InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS, OutageHistory.class, msgs);
			msgs = basicSetOutageHistory(newOutageHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Outage Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Duration</em>' attribute.
	 * @see #isSetOutageDuration()
	 * @see #unsetOutageDuration()
	 * @see #setOutageDuration(float)
	 * @generated
	 */
	public float getOutageDuration() {
		return outageDuration;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration <em>Outage Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Duration</em>' attribute.
	 * @see #isSetOutageDuration()
	 * @see #unsetOutageDuration()
	 * @see #getOutageDuration()
	 * @generated
	 */
	public void setOutageDuration(float newOutageDuration) {
		outageDuration = newOutageDuration;
		outageDurationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration <em>Outage Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutageDuration()
	 * @see #getOutageDuration()
	 * @see #setOutageDuration(float)
	 * @generated
	 */
	public void unsetOutageDuration() {
		outageDuration = OUTAGE_DURATION_EDEFAULT;
		outageDurationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageDuration <em>Outage Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Outage Duration</em>' attribute is set.
	 * @see #unsetOutageDuration()
	 * @see #getOutageDuration()
	 * @see #setOutageDuration(float)
	 * @generated
	 */
	public boolean isSetOutageDuration() {
		return outageDurationESet;
	}

	/**
	 * Returns the value of the '<em><b>Total Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cml</em>' attribute.
	 * @see #isSetTotalCml()
	 * @see #unsetTotalCml()
	 * @see #setTotalCml(float)
	 * @generated
	 */
	public float getTotalCml() {
		return totalCml;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getTotalCml <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cml</em>' attribute.
	 * @see #isSetTotalCml()
	 * @see #unsetTotalCml()
	 * @see #getTotalCml()
	 * @generated
	 */
	public void setTotalCml(float newTotalCml) {
		totalCml = newTotalCml;
		totalCmlESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getTotalCml <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalCml()
	 * @see #getTotalCml()
	 * @see #setTotalCml(float)
	 * @generated
	 */
	public void unsetTotalCml() {
		totalCml = TOTAL_CML_EDEFAULT;
		totalCmlESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getTotalCml <em>Total Cml</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Cml</em>' attribute is set.
	 * @see #unsetTotalCml()
	 * @see #getTotalCml()
	 * @see #setTotalCml(float)
	 * @generated
	 */
	public boolean isSetTotalCml() {
		return totalCmlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				if (outageRecord != null)
					msgs = ((InternalEObject)outageRecord).eInverseRemove(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT, OutageRecord.class, msgs);
				return basicSetOutageRecord((OutageRecord)otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				if (outageHistory != null)
					msgs = ((InternalEObject)outageHistory).eInverseRemove(this, InfCustomersPackage.OUTAGE_HISTORY__OUTAGE_REPORTS, OutageHistory.class, msgs);
				return basicSetOutageHistory((OutageHistory)otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				return basicSetOutageRecord(null, msgs);
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				return basicSetOutageHistory(null, msgs);
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				if (resolve) return getOutageRecord();
				return basicGetOutageRecord();
			case InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT:
				return getCustomerCount();
			case InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML:
				return getAverageCml();
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				if (resolve) return getOutageHistory();
				return basicGetOutageHistory();
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION:
				return getOutageDuration();
			case InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML:
				return getTotalCml();
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				setOutageRecord((OutageRecord)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT:
				setCustomerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML:
				setAverageCml((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				setOutageHistory((OutageHistory)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION:
				setOutageDuration((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML:
				setTotalCml((Float)newValue);
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				setOutageRecord((OutageRecord)null);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT:
				unsetCustomerCount();
				return;
			case InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML:
				unsetAverageCml();
				return;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				setOutageHistory((OutageHistory)null);
				return;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION:
				unsetOutageDuration();
				return;
			case InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML:
				unsetTotalCml();
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
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD:
				return outageRecord != null;
			case InfOperationsPackage.OUTAGE_REPORT__CUSTOMER_COUNT:
				return isSetCustomerCount();
			case InfOperationsPackage.OUTAGE_REPORT__AVERAGE_CML:
				return isSetAverageCml();
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_HISTORY:
				return outageHistory != null;
			case InfOperationsPackage.OUTAGE_REPORT__OUTAGE_DURATION:
				return isSetOutageDuration();
			case InfOperationsPackage.OUTAGE_REPORT__TOTAL_CML:
				return isSetTotalCml();
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
		result.append(" (customerCount: ");
		if (customerCountESet) result.append(customerCount); else result.append("<unset>");
		result.append(", averageCml: ");
		if (averageCmlESet) result.append(averageCml); else result.append("<unset>");
		result.append(", outageDuration: ");
		if (outageDurationESet) result.append(outageDuration); else result.append("<unset>");
		result.append(", totalCml: ");
		if (totalCmlESet) result.append(totalCml); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OutageReport
