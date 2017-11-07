/**
 */
package CIM15.IEC61970.LoadModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonConformLoadGroup extends LoadGroup {
	/**
	 * The cached value of the '{@link #getNonConformLoadSchedules() <em>Non Conform Load Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonConformLoadSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<NonConformLoadSchedule> nonConformLoadSchedules;

	/**
	 * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<NonConformLoad> energyConsumers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConformLoadGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.NON_CONFORM_LOAD_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Non Conform Load Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.LoadModel.NonConformLoadSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Conform Load Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Conform Load Schedules</em>' reference list.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup
	 * @generated
	 */
	public EList<NonConformLoadSchedule> getNonConformLoadSchedules() {
		if (nonConformLoadSchedules == null) {
			nonConformLoadSchedules = new BasicInternalEList<NonConformLoadSchedule>(NonConformLoadSchedule.class);
		}
		return nonConformLoadSchedules;
	}

	/**
	 * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.LoadModel.NonConformLoad}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.NonConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumers</em>' reference list.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoad#getLoadGroup
	 * @generated
	 */
	public EList<NonConformLoad> getEnergyConsumers() {
		if (energyConsumers == null) {
			energyConsumers = new BasicInternalEList<NonConformLoad>(NonConformLoad.class);
		}
		return energyConsumers;
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNonConformLoadSchedules()).basicAdd(otherEnd, msgs);
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergyConsumers()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				return ((InternalEList<?>)getNonConformLoadSchedules()).basicRemove(otherEnd, msgs);
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return ((InternalEList<?>)getEnergyConsumers()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				return getNonConformLoadSchedules();
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return getEnergyConsumers();
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				getNonConformLoadSchedules().clear();
				getNonConformLoadSchedules().addAll((Collection<? extends NonConformLoadSchedule>)newValue);
				return;
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				getEnergyConsumers().addAll((Collection<? extends NonConformLoad>)newValue);
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				getNonConformLoadSchedules().clear();
				return;
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
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
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES:
				return nonConformLoadSchedules != null && !nonConformLoadSchedules.isEmpty();
			case LoadModelPackage.NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return energyConsumers != null && !energyConsumers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // NonConformLoadGroup
