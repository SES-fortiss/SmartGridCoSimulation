/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getSubCode <em>Sub Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords <em>Outage Records</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps <em>Outage Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutageCode extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getSubCode() <em>Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubCode() <em>Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCode()
	 * @generated
	 * @ordered
	 */
	protected String subCode = SUB_CODE_EDEFAULT;

	/**
	 * This is true if the Sub Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subCodeESet;

	/**
	 * The cached value of the '{@link #getOutageRecords() <em>Outage Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageRecord> outageRecords;

	/**
	 * The cached value of the '{@link #getOutageSteps() <em>Outage Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStep> outageSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageCode() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_CODE;
	}

	/**
	 * Returns the value of the '<em><b>Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Code</em>' attribute.
	 * @see #isSetSubCode()
	 * @see #unsetSubCode()
	 * @see #setSubCode(String)
	 * @generated
	 */
	public String getSubCode() {
		return subCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getSubCode <em>Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Code</em>' attribute.
	 * @see #isSetSubCode()
	 * @see #unsetSubCode()
	 * @see #getSubCode()
	 * @generated
	 */
	public void setSubCode(String newSubCode) {
		subCode = newSubCode;
		subCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getSubCode <em>Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubCode()
	 * @see #getSubCode()
	 * @see #setSubCode(String)
	 * @generated
	 */
	public void unsetSubCode() {
		subCode = SUB_CODE_EDEFAULT;
		subCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getSubCode <em>Sub Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Code</em>' attribute is set.
	 * @see #unsetSubCode()
	 * @see #getSubCode()
	 * @see #setSubCode(String)
	 * @generated
	 */
	public boolean isSetSubCode() {
		return subCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Outage Records</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageRecord}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes <em>Outage Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Records</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes
	 * @generated
	 */
	public EList<OutageRecord> getOutageRecords() {
		if (outageRecords == null) {
			outageRecords = new BasicInternalEList<OutageRecord>(OutageRecord.class);
		}
		return outageRecords;
	}

	/**
	 * Returns the value of the '<em><b>Outage Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageStep}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes <em>Outage Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Steps</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes
	 * @generated
	 */
	public EList<OutageStep> getOutageSteps() {
		if (outageSteps == null) {
			outageSteps = new BasicInternalEList<OutageStep>(OutageStep.class);
		}
		return outageSteps;
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
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageRecords()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageSteps()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				return ((InternalEList<?>)getOutageRecords()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				return ((InternalEList<?>)getOutageSteps()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_CODE__SUB_CODE:
				return getSubCode();
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				return getOutageRecords();
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				return getOutageSteps();
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
			case InfOperationsPackage.OUTAGE_CODE__SUB_CODE:
				setSubCode((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				getOutageRecords().clear();
				getOutageRecords().addAll((Collection<? extends OutageRecord>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				getOutageSteps().clear();
				getOutageSteps().addAll((Collection<? extends OutageStep>)newValue);
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
			case InfOperationsPackage.OUTAGE_CODE__SUB_CODE:
				unsetSubCode();
				return;
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				getOutageRecords().clear();
				return;
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				getOutageSteps().clear();
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
			case InfOperationsPackage.OUTAGE_CODE__SUB_CODE:
				return isSetSubCode();
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_RECORDS:
				return outageRecords != null && !outageRecords.isEmpty();
			case InfOperationsPackage.OUTAGE_CODE__OUTAGE_STEPS:
				return outageSteps != null && !outageSteps.isEmpty();
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
		result.append(" (subCode: ");
		if (subCodeESet) result.append(subCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OutageCode
