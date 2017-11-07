/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Common.ActivityRecord;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailureEvent extends ActivityRecord {
	/**
	 * The default value of the '{@link #getFailureIsolationMethod() <em>Failure Isolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureIsolationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final FailureIsolationMethodKind FAILURE_ISOLATION_METHOD_EDEFAULT = FailureIsolationMethodKind.FUSE;

	/**
	 * The cached value of the '{@link #getFailureIsolationMethod() <em>Failure Isolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureIsolationMethod()
	 * @generated
	 * @ordered
	 */
	protected FailureIsolationMethodKind failureIsolationMethod = FAILURE_ISOLATION_METHOD_EDEFAULT;

	/**
	 * This is true if the Failure Isolation Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean failureIsolationMethodESet;

	/**
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * This is true if the Corporate Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean corporateCodeESet;

	/**
	 * The default value of the '{@link #getFaultLocatingMethod() <em>Fault Locating Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultLocatingMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_LOCATING_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultLocatingMethod() <em>Fault Locating Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultLocatingMethod()
	 * @generated
	 * @ordered
	 */
	protected String faultLocatingMethod = FAULT_LOCATING_METHOD_EDEFAULT;

	/**
	 * This is true if the Fault Locating Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean faultLocatingMethodESet;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * This is true if the Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureEvent() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getFailureEvent();
	}

	/**
	 * Returns the value of the '<em><b>Failure Isolation Method</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.FailureIsolationMethodKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Isolation Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Isolation Method</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureIsolationMethodKind
	 * @see #isSetFailureIsolationMethod()
	 * @see #unsetFailureIsolationMethod()
	 * @see #setFailureIsolationMethod(FailureIsolationMethodKind)
	 * @generated
	 */
	public FailureIsolationMethodKind getFailureIsolationMethod() {
		return failureIsolationMethod;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Isolation Method</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureIsolationMethodKind
	 * @see #isSetFailureIsolationMethod()
	 * @see #unsetFailureIsolationMethod()
	 * @see #getFailureIsolationMethod()
	 * @generated
	 */
	public void setFailureIsolationMethod(FailureIsolationMethodKind newFailureIsolationMethod) {
		failureIsolationMethod = newFailureIsolationMethod == null ? FAILURE_ISOLATION_METHOD_EDEFAULT : newFailureIsolationMethod;
		failureIsolationMethodESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailureIsolationMethod()
	 * @see #getFailureIsolationMethod()
	 * @see #setFailureIsolationMethod(FailureIsolationMethodKind)
	 * @generated
	 */
	public void unsetFailureIsolationMethod() {
		failureIsolationMethod = FAILURE_ISOLATION_METHOD_EDEFAULT;
		failureIsolationMethodESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Failure Isolation Method</em>' attribute is set.
	 * @see #unsetFailureIsolationMethod()
	 * @see #getFailureIsolationMethod()
	 * @see #setFailureIsolationMethod(FailureIsolationMethodKind)
	 * @generated
	 */
	public boolean isSetFailureIsolationMethod() {
		return failureIsolationMethodESet;
	}

	/**
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #isSetCorporateCode()
	 * @see #unsetCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #isSetCorporateCode()
	 * @see #unsetCorporateCode()
	 * @see #getCorporateCode()
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		corporateCode = newCorporateCode;
		corporateCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCorporateCode()
	 * @see #getCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public void unsetCorporateCode() {
		corporateCode = CORPORATE_CODE_EDEFAULT;
		corporateCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode <em>Corporate Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Corporate Code</em>' attribute is set.
	 * @see #unsetCorporateCode()
	 * @see #getCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public boolean isSetCorporateCode() {
		return corporateCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Fault Locating Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Locating Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Locating Method</em>' attribute.
	 * @see #isSetFaultLocatingMethod()
	 * @see #unsetFaultLocatingMethod()
	 * @see #setFaultLocatingMethod(String)
	 * @generated
	 */
	public String getFaultLocatingMethod() {
		return faultLocatingMethod;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Locating Method</em>' attribute.
	 * @see #isSetFaultLocatingMethod()
	 * @see #unsetFaultLocatingMethod()
	 * @see #getFaultLocatingMethod()
	 * @generated
	 */
	public void setFaultLocatingMethod(String newFaultLocatingMethod) {
		faultLocatingMethod = newFaultLocatingMethod;
		faultLocatingMethodESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFaultLocatingMethod()
	 * @see #getFaultLocatingMethod()
	 * @see #setFaultLocatingMethod(String)
	 * @generated
	 */
	public void unsetFaultLocatingMethod() {
		faultLocatingMethod = FAULT_LOCATING_METHOD_EDEFAULT;
		faultLocatingMethodESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fault Locating Method</em>' attribute is set.
	 * @see #unsetFaultLocatingMethod()
	 * @see #getFaultLocatingMethod()
	 * @see #setFaultLocatingMethod(String)
	 * @generated
	 */
	public boolean isSetFaultLocatingMethod() {
		return faultLocatingMethodESet;
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #setLocation(String)
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #isSetLocation()
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @generated
	 */
	public void setLocation(String newLocation) {
		location = newLocation;
		locationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocation()
	 * @see #getLocation()
	 * @see #setLocation(String)
	 * @generated
	 */
	public void unsetLocation() {
		location = LOCATION_EDEFAULT;
		locationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getLocation <em>Location</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location</em>' attribute is set.
	 * @see #unsetLocation()
	 * @see #getLocation()
	 * @see #setLocation(String)
	 * @generated
	 */
	public boolean isSetLocation() {
		return locationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
				return getFailureIsolationMethod();
			case InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE:
				return getCorporateCode();
			case InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
				return getFaultLocatingMethod();
			case InfAssetsPackage.FAILURE_EVENT__LOCATION:
				return getLocation();
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
			case InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
				setFailureIsolationMethod((FailureIsolationMethodKind)newValue);
				return;
			case InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
				setFaultLocatingMethod((String)newValue);
				return;
			case InfAssetsPackage.FAILURE_EVENT__LOCATION:
				setLocation((String)newValue);
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
			case InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
				unsetFailureIsolationMethod();
				return;
			case InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE:
				unsetCorporateCode();
				return;
			case InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
				unsetFaultLocatingMethod();
				return;
			case InfAssetsPackage.FAILURE_EVENT__LOCATION:
				unsetLocation();
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
			case InfAssetsPackage.FAILURE_EVENT__FAILURE_ISOLATION_METHOD:
				return isSetFailureIsolationMethod();
			case InfAssetsPackage.FAILURE_EVENT__CORPORATE_CODE:
				return isSetCorporateCode();
			case InfAssetsPackage.FAILURE_EVENT__FAULT_LOCATING_METHOD:
				return isSetFaultLocatingMethod();
			case InfAssetsPackage.FAILURE_EVENT__LOCATION:
				return isSetLocation();
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
		result.append(" (failureIsolationMethod: ");
		if (failureIsolationMethodESet) result.append(failureIsolationMethod); else result.append("<unset>");
		result.append(", corporateCode: ");
		if (corporateCodeESet) result.append(corporateCode); else result.append("<unset>");
		result.append(", faultLocatingMethod: ");
		if (faultLocatingMethodESet) result.append(faultLocatingMethod); else result.append("<unset>");
		result.append(", location: ");
		if (locationESet) result.append(location); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // FailureEvent
