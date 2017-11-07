/**
 */
package CIM15.IEC61970.Informative.InfCore;

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
 * A representation of the model object '<em><b>Modeling Authority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCore.ModelingAuthority#getModelingAuthoritySets <em>Modeling Authority Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingAuthority extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getModelingAuthoritySets() <em>Modeling Authority Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAuthoritySets()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingAuthoritySet> modelingAuthoritySets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingAuthority() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCorePackage.Literals.MODELING_AUTHORITY;
	}

	/**
	 * Returns the value of the '<em><b>Modeling Authority Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet#getModelingAuthority <em>Modeling Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Authority Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Authority Sets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet#getModelingAuthority
	 * @generated
	 */
	public EList<ModelingAuthoritySet> getModelingAuthoritySets() {
		if (modelingAuthoritySets == null) {
			modelingAuthoritySets = new BasicInternalEList<ModelingAuthoritySet>(ModelingAuthoritySet.class);
		}
		return modelingAuthoritySets;
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelingAuthoritySets()).basicAdd(otherEnd, msgs);
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				return ((InternalEList<?>)getModelingAuthoritySets()).basicRemove(otherEnd, msgs);
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				return getModelingAuthoritySets();
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				getModelingAuthoritySets().clear();
				getModelingAuthoritySets().addAll((Collection<? extends ModelingAuthoritySet>)newValue);
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				getModelingAuthoritySets().clear();
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
			case InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS:
				return modelingAuthoritySets != null && !modelingAuthoritySets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ModelingAuthority
