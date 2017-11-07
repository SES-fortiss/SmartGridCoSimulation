/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Underground Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#isHasVentilation <em>Has Ventilation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getMaterial <em>Material</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UndergroundStructure extends Structure {
	/**
	 * The default value of the '{@link #isHasVentilation() <em>Has Ventilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasVentilation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_VENTILATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasVentilation() <em>Has Ventilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasVentilation()
	 * @generated
	 * @ordered
	 */
	protected boolean hasVentilation = HAS_VENTILATION_EDEFAULT;

	/**
	 * This is true if the Has Ventilation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hasVentilationESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final UndergroundStructureKind KIND_EDEFAULT = UndergroundStructureKind.TRENCH;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected UndergroundStructureKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected String material = MATERIAL_EDEFAULT;

	/**
	 * This is true if the Material attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materialESet;

	/**
	 * The default value of the '{@link #getSealingWarrantyExpiresDate() <em>Sealing Warranty Expires Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealingWarrantyExpiresDate()
	 * @generated
	 * @ordered
	 */
	protected static final String SEALING_WARRANTY_EXPIRES_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSealingWarrantyExpiresDate() <em>Sealing Warranty Expires Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealingWarrantyExpiresDate()
	 * @generated
	 * @ordered
	 */
	protected String sealingWarrantyExpiresDate = SEALING_WARRANTY_EXPIRES_DATE_EDEFAULT;

	/**
	 * This is true if the Sealing Warranty Expires Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sealingWarrantyExpiresDateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndergroundStructure() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getUndergroundStructure();
	}

	/**
	 * Returns the value of the '<em><b>Has Ventilation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ventilation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ventilation</em>' attribute.
	 * @see #isSetHasVentilation()
	 * @see #unsetHasVentilation()
	 * @see #setHasVentilation(boolean)
	 * @generated
	 */
	public boolean isHasVentilation() {
		return hasVentilation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#isHasVentilation <em>Has Ventilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Ventilation</em>' attribute.
	 * @see #isSetHasVentilation()
	 * @see #unsetHasVentilation()
	 * @see #isHasVentilation()
	 * @generated
	 */
	public void setHasVentilation(boolean newHasVentilation) {
		hasVentilation = newHasVentilation;
		hasVentilationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#isHasVentilation <em>Has Ventilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasVentilation()
	 * @see #isHasVentilation()
	 * @see #setHasVentilation(boolean)
	 * @generated
	 */
	public void unsetHasVentilation() {
		hasVentilation = HAS_VENTILATION_EDEFAULT;
		hasVentilationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#isHasVentilation <em>Has Ventilation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Ventilation</em>' attribute is set.
	 * @see #unsetHasVentilation()
	 * @see #isHasVentilation()
	 * @see #setHasVentilation(boolean)
	 * @generated
	 */
	public boolean isSetHasVentilation() {
		return hasVentilationESet;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructureKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructureKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(UndergroundStructureKind)
	 * @generated
	 */
	public UndergroundStructureKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructureKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(UndergroundStructureKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(UndergroundStructureKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(UndergroundStructureKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' attribute.
	 * @see #isSetMaterial()
	 * @see #unsetMaterial()
	 * @see #setMaterial(String)
	 * @generated
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' attribute.
	 * @see #isSetMaterial()
	 * @see #unsetMaterial()
	 * @see #getMaterial()
	 * @generated
	 */
	public void setMaterial(String newMaterial) {
		material = newMaterial;
		materialESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaterial()
	 * @see #getMaterial()
	 * @see #setMaterial(String)
	 * @generated
	 */
	public void unsetMaterial() {
		material = MATERIAL_EDEFAULT;
		materialESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getMaterial <em>Material</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Material</em>' attribute is set.
	 * @see #unsetMaterial()
	 * @see #getMaterial()
	 * @see #setMaterial(String)
	 * @generated
	 */
	public boolean isSetMaterial() {
		return materialESet;
	}

	/**
	 * Returns the value of the '<em><b>Sealing Warranty Expires Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sealing Warranty Expires Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sealing Warranty Expires Date</em>' attribute.
	 * @see #isSetSealingWarrantyExpiresDate()
	 * @see #unsetSealingWarrantyExpiresDate()
	 * @see #setSealingWarrantyExpiresDate(String)
	 * @generated
	 */
	public String getSealingWarrantyExpiresDate() {
		return sealingWarrantyExpiresDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sealing Warranty Expires Date</em>' attribute.
	 * @see #isSetSealingWarrantyExpiresDate()
	 * @see #unsetSealingWarrantyExpiresDate()
	 * @see #getSealingWarrantyExpiresDate()
	 * @generated
	 */
	public void setSealingWarrantyExpiresDate(String newSealingWarrantyExpiresDate) {
		sealingWarrantyExpiresDate = newSealingWarrantyExpiresDate;
		sealingWarrantyExpiresDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSealingWarrantyExpiresDate()
	 * @see #getSealingWarrantyExpiresDate()
	 * @see #setSealingWarrantyExpiresDate(String)
	 * @generated
	 */
	public void unsetSealingWarrantyExpiresDate() {
		sealingWarrantyExpiresDate = SEALING_WARRANTY_EXPIRES_DATE_EDEFAULT;
		sealingWarrantyExpiresDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sealing Warranty Expires Date</em>' attribute is set.
	 * @see #unsetSealingWarrantyExpiresDate()
	 * @see #getSealingWarrantyExpiresDate()
	 * @see #setSealingWarrantyExpiresDate(String)
	 * @generated
	 */
	public boolean isSetSealingWarrantyExpiresDate() {
		return sealingWarrantyExpiresDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__HAS_VENTILATION:
				return isHasVentilation();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__KIND:
				return getKind();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__MATERIAL:
				return getMaterial();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__SEALING_WARRANTY_EXPIRES_DATE:
				return getSealingWarrantyExpiresDate();
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
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__HAS_VENTILATION:
				setHasVentilation((Boolean)newValue);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__KIND:
				setKind((UndergroundStructureKind)newValue);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__MATERIAL:
				setMaterial((String)newValue);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__SEALING_WARRANTY_EXPIRES_DATE:
				setSealingWarrantyExpiresDate((String)newValue);
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
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__HAS_VENTILATION:
				unsetHasVentilation();
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__KIND:
				unsetKind();
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__MATERIAL:
				unsetMaterial();
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__SEALING_WARRANTY_EXPIRES_DATE:
				unsetSealingWarrantyExpiresDate();
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
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__HAS_VENTILATION:
				return isSetHasVentilation();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__KIND:
				return isSetKind();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__MATERIAL:
				return isSetMaterial();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE__SEALING_WARRANTY_EXPIRES_DATE:
				return isSetSealingWarrantyExpiresDate();
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
		result.append(" (hasVentilation: ");
		if (hasVentilationESet) result.append(hasVentilation); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", material: ");
		if (materialESet) result.append(material); else result.append("<unset>");
		result.append(", sealingWarrantyExpiresDate: ");
		if (sealingWarrantyExpiresDateESet) result.append(sealingWarrantyExpiresDate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // UndergroundStructure
