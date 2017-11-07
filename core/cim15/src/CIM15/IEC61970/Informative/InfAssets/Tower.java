/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Tower#getConstructionKind <em>Construction Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tower extends Structure {
	/**
	 * The default value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected static final TowerConstructionKind CONSTRUCTION_KIND_EDEFAULT = TowerConstructionKind.SUSPENSION;

	/**
	 * The cached value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected TowerConstructionKind constructionKind = CONSTRUCTION_KIND_EDEFAULT;

	/**
	 * This is true if the Construction Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constructionKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tower() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTower();
	}

	/**
	 * Returns the value of the '<em><b>Construction Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.TowerConstructionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.TowerConstructionKind
	 * @see #isSetConstructionKind()
	 * @see #unsetConstructionKind()
	 * @see #setConstructionKind(TowerConstructionKind)
	 * @generated
	 */
	public TowerConstructionKind getConstructionKind() {
		return constructionKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Tower#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.TowerConstructionKind
	 * @see #isSetConstructionKind()
	 * @see #unsetConstructionKind()
	 * @see #getConstructionKind()
	 * @generated
	 */
	public void setConstructionKind(TowerConstructionKind newConstructionKind) {
		constructionKind = newConstructionKind == null ? CONSTRUCTION_KIND_EDEFAULT : newConstructionKind;
		constructionKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Tower#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstructionKind()
	 * @see #getConstructionKind()
	 * @see #setConstructionKind(TowerConstructionKind)
	 * @generated
	 */
	public void unsetConstructionKind() {
		constructionKind = CONSTRUCTION_KIND_EDEFAULT;
		constructionKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Tower#getConstructionKind <em>Construction Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Construction Kind</em>' attribute is set.
	 * @see #unsetConstructionKind()
	 * @see #getConstructionKind()
	 * @see #setConstructionKind(TowerConstructionKind)
	 * @generated
	 */
	public boolean isSetConstructionKind() {
		return constructionKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.TOWER__CONSTRUCTION_KIND:
				return getConstructionKind();
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
			case InfAssetsPackage.TOWER__CONSTRUCTION_KIND:
				setConstructionKind((TowerConstructionKind)newValue);
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
			case InfAssetsPackage.TOWER__CONSTRUCTION_KIND:
				unsetConstructionKind();
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
			case InfAssetsPackage.TOWER__CONSTRUCTION_KIND:
				return isSetConstructionKind();
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
		result.append(" (constructionKind: ");
		if (constructionKindESet) result.append(constructionKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Tower
