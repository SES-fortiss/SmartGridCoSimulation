/**
 */
package CIM15.IEC61968;

import CIM15.Element;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.IEC61968CIMVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link CIM15.IEC61968.IEC61968CIMVersion#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IEC61968CIMVersion extends Element {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * This is true if the Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEC61968CIMVersion() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IEC61968Package.Literals.IEC61968_CIM_VERSION;
	}

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.IEC61968CIMVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	public void setVersion(String newVersion) {
		version = newVersion;
		versionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.IEC61968CIMVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	public void unsetVersion() {
		version = VERSION_EDEFAULT;
		versionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.IEC61968CIMVersion#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #isSetDate()
	 * @see #unsetDate()
	 * @see #setDate(String)
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.IEC61968CIMVersion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #isSetDate()
	 * @see #unsetDate()
	 * @see #getDate()
	 * @generated
	 */
	public void setDate(String newDate) {
		date = newDate;
		dateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.IEC61968CIMVersion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDate()
	 * @see #getDate()
	 * @see #setDate(String)
	 * @generated
	 */
	public void unsetDate() {
		date = DATE_EDEFAULT;
		dateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.IEC61968CIMVersion#getDate <em>Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date</em>' attribute is set.
	 * @see #unsetDate()
	 * @see #getDate()
	 * @see #setDate(String)
	 * @generated
	 */
	public boolean isSetDate() {
		return dateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IEC61968Package.IEC61968_CIM_VERSION__VERSION:
				return getVersion();
			case IEC61968Package.IEC61968_CIM_VERSION__DATE:
				return getDate();
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
			case IEC61968Package.IEC61968_CIM_VERSION__VERSION:
				setVersion((String)newValue);
				return;
			case IEC61968Package.IEC61968_CIM_VERSION__DATE:
				setDate((String)newValue);
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
			case IEC61968Package.IEC61968_CIM_VERSION__VERSION:
				unsetVersion();
				return;
			case IEC61968Package.IEC61968_CIM_VERSION__DATE:
				unsetDate();
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
			case IEC61968Package.IEC61968_CIM_VERSION__VERSION:
				return isSetVersion();
			case IEC61968Package.IEC61968_CIM_VERSION__DATE:
				return isSetDate();
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
		result.append(" (version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(", date: ");
		if (dateESet) result.append(date); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // IEC61968CIMVersion
