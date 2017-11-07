/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Joint#getInsulation <em>Insulation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Joint#getFillKind <em>Fill Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Joint#getConfigurationKind <em>Configuration Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Joint extends Asset {
	/**
	 * The default value of the '{@link #getInsulation() <em>Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulation()
	 * @generated
	 * @ordered
	 */
	protected static final String INSULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsulation() <em>Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulation()
	 * @generated
	 * @ordered
	 */
	protected String insulation = INSULATION_EDEFAULT;

	/**
	 * This is true if the Insulation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulationESet;

	/**
	 * The default value of the '{@link #getFillKind() <em>Fill Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillKind()
	 * @generated
	 * @ordered
	 */
	protected static final JointFillKind FILL_KIND_EDEFAULT = JointFillKind.EPOXY;

	/**
	 * The cached value of the '{@link #getFillKind() <em>Fill Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillKind()
	 * @generated
	 * @ordered
	 */
	protected JointFillKind fillKind = FILL_KIND_EDEFAULT;

	/**
	 * This is true if the Fill Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillKindESet;

	/**
	 * The default value of the '{@link #getConfigurationKind() <em>Configuration Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKind()
	 * @generated
	 * @ordered
	 */
	protected static final JointConfigurationKind CONFIGURATION_KIND_EDEFAULT = JointConfigurationKind.OTHER;

	/**
	 * The cached value of the '{@link #getConfigurationKind() <em>Configuration Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationKind()
	 * @generated
	 * @ordered
	 */
	protected JointConfigurationKind configurationKind = CONFIGURATION_KIND_EDEFAULT;

	/**
	 * This is true if the Configuration Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean configurationKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Joint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getJoint();
	}

	/**
	 * Returns the value of the '<em><b>Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation</em>' attribute.
	 * @see #isSetInsulation()
	 * @see #unsetInsulation()
	 * @see #setInsulation(String)
	 * @generated
	 */
	public String getInsulation() {
		return insulation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getInsulation <em>Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation</em>' attribute.
	 * @see #isSetInsulation()
	 * @see #unsetInsulation()
	 * @see #getInsulation()
	 * @generated
	 */
	public void setInsulation(String newInsulation) {
		insulation = newInsulation;
		insulationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getInsulation <em>Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulation()
	 * @see #getInsulation()
	 * @see #setInsulation(String)
	 * @generated
	 */
	public void unsetInsulation() {
		insulation = INSULATION_EDEFAULT;
		insulationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getInsulation <em>Insulation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulation</em>' attribute is set.
	 * @see #unsetInsulation()
	 * @see #getInsulation()
	 * @see #setInsulation(String)
	 * @generated
	 */
	public boolean isSetInsulation() {
		return insulationESet;
	}

	/**
	 * Returns the value of the '<em><b>Fill Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.JointFillKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.JointFillKind
	 * @see #isSetFillKind()
	 * @see #unsetFillKind()
	 * @see #setFillKind(JointFillKind)
	 * @generated
	 */
	public JointFillKind getFillKind() {
		return fillKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getFillKind <em>Fill Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.JointFillKind
	 * @see #isSetFillKind()
	 * @see #unsetFillKind()
	 * @see #getFillKind()
	 * @generated
	 */
	public void setFillKind(JointFillKind newFillKind) {
		fillKind = newFillKind == null ? FILL_KIND_EDEFAULT : newFillKind;
		fillKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getFillKind <em>Fill Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillKind()
	 * @see #getFillKind()
	 * @see #setFillKind(JointFillKind)
	 * @generated
	 */
	public void unsetFillKind() {
		fillKind = FILL_KIND_EDEFAULT;
		fillKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getFillKind <em>Fill Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Kind</em>' attribute is set.
	 * @see #unsetFillKind()
	 * @see #getFillKind()
	 * @see #setFillKind(JointFillKind)
	 * @generated
	 */
	public boolean isSetFillKind() {
		return fillKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Configuration Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.JointConfigurationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.JointConfigurationKind
	 * @see #isSetConfigurationKind()
	 * @see #unsetConfigurationKind()
	 * @see #setConfigurationKind(JointConfigurationKind)
	 * @generated
	 */
	public JointConfigurationKind getConfigurationKind() {
		return configurationKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getConfigurationKind <em>Configuration Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.JointConfigurationKind
	 * @see #isSetConfigurationKind()
	 * @see #unsetConfigurationKind()
	 * @see #getConfigurationKind()
	 * @generated
	 */
	public void setConfigurationKind(JointConfigurationKind newConfigurationKind) {
		configurationKind = newConfigurationKind == null ? CONFIGURATION_KIND_EDEFAULT : newConfigurationKind;
		configurationKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getConfigurationKind <em>Configuration Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfigurationKind()
	 * @see #getConfigurationKind()
	 * @see #setConfigurationKind(JointConfigurationKind)
	 * @generated
	 */
	public void unsetConfigurationKind() {
		configurationKind = CONFIGURATION_KIND_EDEFAULT;
		configurationKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getConfigurationKind <em>Configuration Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Configuration Kind</em>' attribute is set.
	 * @see #unsetConfigurationKind()
	 * @see #getConfigurationKind()
	 * @see #setConfigurationKind(JointConfigurationKind)
	 * @generated
	 */
	public boolean isSetConfigurationKind() {
		return configurationKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.JOINT__INSULATION:
				return getInsulation();
			case InfAssetsPackage.JOINT__FILL_KIND:
				return getFillKind();
			case InfAssetsPackage.JOINT__CONFIGURATION_KIND:
				return getConfigurationKind();
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
			case InfAssetsPackage.JOINT__INSULATION:
				setInsulation((String)newValue);
				return;
			case InfAssetsPackage.JOINT__FILL_KIND:
				setFillKind((JointFillKind)newValue);
				return;
			case InfAssetsPackage.JOINT__CONFIGURATION_KIND:
				setConfigurationKind((JointConfigurationKind)newValue);
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
			case InfAssetsPackage.JOINT__INSULATION:
				unsetInsulation();
				return;
			case InfAssetsPackage.JOINT__FILL_KIND:
				unsetFillKind();
				return;
			case InfAssetsPackage.JOINT__CONFIGURATION_KIND:
				unsetConfigurationKind();
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
			case InfAssetsPackage.JOINT__INSULATION:
				return isSetInsulation();
			case InfAssetsPackage.JOINT__FILL_KIND:
				return isSetFillKind();
			case InfAssetsPackage.JOINT__CONFIGURATION_KIND:
				return isSetConfigurationKind();
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
		result.append(" (insulation: ");
		if (insulationESet) result.append(insulation); else result.append("<unset>");
		result.append(", fillKind: ");
		if (fillKindESet) result.append(fillKind); else result.append("<unset>");
		result.append(", configurationKind: ");
		if (configurationKindESet) result.append(configurationKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Joint
