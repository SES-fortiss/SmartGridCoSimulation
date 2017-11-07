/**
 */
package CIM15.IEC61970.LoadModel;

import CIM15.IEC61970.Wires.EnergyConsumer;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformLoad extends EnergyConsumer {
	/**
	 * The cached value of the '{@link #getLoadGroup() <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected ConformLoadGroup loadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformLoad() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.CONFORM_LOAD;
	}

	/**
	 * Returns the value of the '<em><b>Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group</em>' reference.
	 * @see #setLoadGroup(ConformLoadGroup)
	 * @see CIM15.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers
	 * @generated
	 */
	public ConformLoadGroup getLoadGroup() {
		if (loadGroup != null && loadGroup.eIsProxy()) {
			InternalEObject oldLoadGroup = (InternalEObject)loadGroup;
			loadGroup = (ConformLoadGroup)eResolveProxy(oldLoadGroup);
			if (loadGroup != oldLoadGroup) {
			}
		}
		return loadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup basicGetLoadGroup() {
		return loadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadGroup(ConformLoadGroup newLoadGroup, NotificationChain msgs) {
		ConformLoadGroup oldLoadGroup = loadGroup;
		loadGroup = newLoadGroup;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Group</em>' reference.
	 * @see #getLoadGroup()
	 * @generated
	 */
	public void setLoadGroup(ConformLoadGroup newLoadGroup) {
		if (newLoadGroup != loadGroup) {
			NotificationChain msgs = null;
			if (loadGroup != null)
				msgs = ((InternalEObject)loadGroup).eInverseRemove(this, LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs);
			if (newLoadGroup != null)
				msgs = ((InternalEObject)newLoadGroup).eInverseAdd(this, LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs);
			msgs = basicSetLoadGroup(newLoadGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				if (loadGroup != null)
					msgs = ((InternalEObject)loadGroup).eInverseRemove(this, LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS, ConformLoadGroup.class, msgs);
				return basicSetLoadGroup((ConformLoadGroup)otherEnd, msgs);
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				return basicSetLoadGroup(null, msgs);
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				if (resolve) return getLoadGroup();
				return basicGetLoadGroup();
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				setLoadGroup((ConformLoadGroup)newValue);
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				setLoadGroup((ConformLoadGroup)null);
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
			case LoadModelPackage.CONFORM_LOAD__LOAD_GROUP:
				return loadGroup != null;
		}
		return super.eIsSet(featureID);
	}

} // ConformLoad
