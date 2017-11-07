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
 * A representation of the model object '<em><b>Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformLoadGroup extends LoadGroup {
	/**
	 * The cached value of the '{@link #getConformLoadSchedules() <em>Conform Load Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformLoadSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformLoadSchedule> conformLoadSchedules;

	/**
	 * The cached value of the '{@link #getEnergyConsumers() <em>Energy Consumers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformLoad> energyConsumers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformLoadGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.CONFORM_LOAD_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Conform Load Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.LoadModel.ConformLoadSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conform Load Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conform Load Schedules</em>' reference list.
	 * @see CIM15.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup
	 * @generated
	 */
	public EList<ConformLoadSchedule> getConformLoadSchedules() {
		if (conformLoadSchedules == null) {
			conformLoadSchedules = new BasicInternalEList<ConformLoadSchedule>(ConformLoadSchedule.class);
		}
		return conformLoadSchedules;
	}

	/**
	 * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.LoadModel.ConformLoad}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumers</em>' reference list.
	 * @see CIM15.IEC61970.LoadModel.ConformLoad#getLoadGroup
	 * @generated
	 */
	public EList<ConformLoad> getEnergyConsumers() {
		if (energyConsumers == null) {
			energyConsumers = new BasicInternalEList<ConformLoad>(ConformLoad.class);
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
			case LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConformLoadSchedules()).basicAdd(otherEnd, msgs);
			case LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
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
			case LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				return ((InternalEList<?>)getConformLoadSchedules()).basicRemove(otherEnd, msgs);
			case LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
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
			case LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				return getConformLoadSchedules();
			case LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
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
			case LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				getConformLoadSchedules().clear();
				getConformLoadSchedules().addAll((Collection<? extends ConformLoadSchedule>)newValue);
				return;
			case LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				getEnergyConsumers().clear();
				getEnergyConsumers().addAll((Collection<? extends ConformLoad>)newValue);
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
			case LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				getConformLoadSchedules().clear();
				return;
			case LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
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
			case LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES:
				return conformLoadSchedules != null && !conformLoadSchedules.isEmpty();
			case LoadModelPackage.CONFORM_LOAD_GROUP__ENERGY_CONSUMERS:
				return energyConsumers != null && !energyConsumers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ConformLoadGroup
