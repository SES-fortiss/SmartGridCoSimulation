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
 * A representation of the model object '<em><b>Modeling Authority Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet#getIdentifiedObjects <em>Identified Objects</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet#getModelingAuthority <em>Modeling Authority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingAuthoritySet extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getIdentifiedObjects() <em>Identified Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifiedObject> identifiedObjects;

	/**
	 * The cached value of the '{@link #getModelingAuthority() <em>Modeling Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAuthority()
	 * @generated
	 * @ordered
	 */
	protected ModelingAuthority modelingAuthority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingAuthoritySet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCorePackage.Literals.MODELING_AUTHORITY_SET;
	}

	/**
	 * Returns the value of the '<em><b>Identified Objects</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.IdentifiedObject}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet <em>Modeling Authority Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identified Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identified Objects</em>' reference list.
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet
	 * @generated
	 */
	public EList<IdentifiedObject> getIdentifiedObjects() {
		if (identifiedObjects == null) {
			identifiedObjects = new BasicInternalEList<IdentifiedObject>(IdentifiedObject.class);
		}
		return identifiedObjects;
	}

	/**
	 * Returns the value of the '<em><b>Modeling Authority</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCore.ModelingAuthority#getModelingAuthoritySets <em>Modeling Authority Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Authority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Authority</em>' reference.
	 * @see #setModelingAuthority(ModelingAuthority)
	 * @see CIM15.IEC61970.Informative.InfCore.ModelingAuthority#getModelingAuthoritySets
	 * @generated
	 */
	public ModelingAuthority getModelingAuthority() {
		if (modelingAuthority != null && modelingAuthority.eIsProxy()) {
			InternalEObject oldModelingAuthority = (InternalEObject)modelingAuthority;
			modelingAuthority = (ModelingAuthority)eResolveProxy(oldModelingAuthority);
			if (modelingAuthority != oldModelingAuthority) {
			}
		}
		return modelingAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingAuthority basicGetModelingAuthority() {
		return modelingAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelingAuthority(ModelingAuthority newModelingAuthority, NotificationChain msgs) {
		ModelingAuthority oldModelingAuthority = modelingAuthority;
		modelingAuthority = newModelingAuthority;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet#getModelingAuthority <em>Modeling Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Authority</em>' reference.
	 * @see #getModelingAuthority()
	 * @generated
	 */
	public void setModelingAuthority(ModelingAuthority newModelingAuthority) {
		if (newModelingAuthority != modelingAuthority) {
			NotificationChain msgs = null;
			if (modelingAuthority != null)
				msgs = ((InternalEObject)modelingAuthority).eInverseRemove(this, InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS, ModelingAuthority.class, msgs);
			if (newModelingAuthority != null)
				msgs = ((InternalEObject)newModelingAuthority).eInverseAdd(this, InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS, ModelingAuthority.class, msgs);
			msgs = basicSetModelingAuthority(newModelingAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdentifiedObjects()).basicAdd(otherEnd, msgs);
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				if (modelingAuthority != null)
					msgs = ((InternalEObject)modelingAuthority).eInverseRemove(this, InfCorePackage.MODELING_AUTHORITY__MODELING_AUTHORITY_SETS, ModelingAuthority.class, msgs);
				return basicSetModelingAuthority((ModelingAuthority)otherEnd, msgs);
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				return ((InternalEList<?>)getIdentifiedObjects()).basicRemove(otherEnd, msgs);
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				return basicSetModelingAuthority(null, msgs);
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				return getIdentifiedObjects();
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				if (resolve) return getModelingAuthority();
				return basicGetModelingAuthority();
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				getIdentifiedObjects().clear();
				getIdentifiedObjects().addAll((Collection<? extends IdentifiedObject>)newValue);
				return;
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				setModelingAuthority((ModelingAuthority)newValue);
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				getIdentifiedObjects().clear();
				return;
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				setModelingAuthority((ModelingAuthority)null);
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
			case InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS:
				return identifiedObjects != null && !identifiedObjects.isEmpty();
			case InfCorePackage.MODELING_AUTHORITY_SET__MODELING_AUTHORITY:
				return modelingAuthority != null;
		}
		return super.eIsSet(featureID);
	}

} // ModelingAuthoritySet
