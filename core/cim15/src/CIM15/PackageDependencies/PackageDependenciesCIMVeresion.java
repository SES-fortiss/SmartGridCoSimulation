/**
 */
package CIM15.PackageDependencies;

import CIM15.Element;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Veresion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.PackageDependencies.PackageDependenciesCIMVeresion#getVesion <em>Vesion</em>}</li>
 *   <li>{@link CIM15.PackageDependencies.PackageDependenciesCIMVeresion#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageDependenciesCIMVeresion extends Element {
	/**
	 * The default value of the '{@link #getVesion() <em>Vesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesion()
	 * @generated
	 * @ordered
	 */
	protected static final String VESION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVesion() <em>Vesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesion()
	 * @generated
	 * @ordered
	 */
	protected String vesion = VESION_EDEFAULT;

	/**
	 * This is true if the Vesion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vesionESet;

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
	protected PackageDependenciesCIMVeresion() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageDependenciesPackage.Literals.PACKAGE_DEPENDENCIES_CIM_VERESION;
	}

	/**
	 * Returns the value of the '<em><b>Vesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vesion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vesion</em>' attribute.
	 * @see #isSetVesion()
	 * @see #unsetVesion()
	 * @see #setVesion(String)
	 * @generated
	 */
	public String getVesion() {
		return vesion;
	}

	/**
	 * Sets the value of the '{@link CIM15.PackageDependencies.PackageDependenciesCIMVeresion#getVesion <em>Vesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vesion</em>' attribute.
	 * @see #isSetVesion()
	 * @see #unsetVesion()
	 * @see #getVesion()
	 * @generated
	 */
	public void setVesion(String newVesion) {
		vesion = newVesion;
		vesionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.PackageDependencies.PackageDependenciesCIMVeresion#getVesion <em>Vesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVesion()
	 * @see #getVesion()
	 * @see #setVesion(String)
	 * @generated
	 */
	public void unsetVesion() {
		vesion = VESION_EDEFAULT;
		vesionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.PackageDependencies.PackageDependenciesCIMVeresion#getVesion <em>Vesion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vesion</em>' attribute is set.
	 * @see #unsetVesion()
	 * @see #getVesion()
	 * @see #setVesion(String)
	 * @generated
	 */
	public boolean isSetVesion() {
		return vesionESet;
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
	 * Sets the value of the '{@link CIM15.PackageDependencies.PackageDependenciesCIMVeresion#getDate <em>Date</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.PackageDependencies.PackageDependenciesCIMVeresion#getDate <em>Date</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.PackageDependencies.PackageDependenciesCIMVeresion#getDate <em>Date</em>}' attribute is set.
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION:
				return getVesion();
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE:
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION:
				setVesion((String)newValue);
				return;
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE:
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION:
				unsetVesion();
				return;
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE:
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
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__VESION:
				return isSetVesion();
			case PackageDependenciesPackage.PACKAGE_DEPENDENCIES_CIM_VERESION__DATE:
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
		result.append(" (vesion: ");
		if (vesionESet) result.append(vesion); else result.append("<unset>");
		result.append(", date: ");
		if (dateESet) result.append(date); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PackageDependenciesCIMVeresion
