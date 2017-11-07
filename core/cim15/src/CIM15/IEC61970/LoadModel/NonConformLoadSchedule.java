/**
 */
package CIM15.IEC61970.LoadModel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonConformLoadSchedule extends SeasonDayTypeSchedule {
	/**
	 * The cached value of the '{@link #getNonConformLoadGroup() <em>Non Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonConformLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected NonConformLoadGroup nonConformLoadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConformLoadSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.NON_CONFORM_LOAD_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Non Conform Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Conform Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Conform Load Group</em>' reference.
	 * @see #setNonConformLoadGroup(NonConformLoadGroup)
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules
	 * @generated
	 */
	public NonConformLoadGroup getNonConformLoadGroup() {
		if (nonConformLoadGroup != null && nonConformLoadGroup.eIsProxy()) {
			InternalEObject oldNonConformLoadGroup = (InternalEObject)nonConformLoadGroup;
			nonConformLoadGroup = (NonConformLoadGroup)eResolveProxy(oldNonConformLoadGroup);
			if (nonConformLoadGroup != oldNonConformLoadGroup) {
			}
		}
		return nonConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup basicGetNonConformLoadGroup() {
		return nonConformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonConformLoadGroup(NonConformLoadGroup newNonConformLoadGroup, NotificationChain msgs) {
		NonConformLoadGroup oldNonConformLoadGroup = nonConformLoadGroup;
		nonConformLoadGroup = newNonConformLoadGroup;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Conform Load Group</em>' reference.
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	public void setNonConformLoadGroup(NonConformLoadGroup newNonConformLoadGroup) {
		if (newNonConformLoadGroup != nonConformLoadGroup) {
			NotificationChain msgs = null;
			if (nonConformLoadGroup != null)
				msgs = ((InternalEObject)nonConformLoadGroup).eInverseRemove(this, LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs);
			if (newNonConformLoadGroup != null)
				msgs = ((InternalEObject)newNonConformLoadGroup).eInverseAdd(this, LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs);
			msgs = basicSetNonConformLoadGroup(newNonConformLoadGroup, msgs);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				if (nonConformLoadGroup != null)
					msgs = ((InternalEObject)nonConformLoadGroup).eInverseRemove(this, LoadModelPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs);
				return basicSetNonConformLoadGroup((NonConformLoadGroup)otherEnd, msgs);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				return basicSetNonConformLoadGroup(null, msgs);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				if (resolve) return getNonConformLoadGroup();
				return basicGetNonConformLoadGroup();
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				setNonConformLoadGroup((NonConformLoadGroup)newValue);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				setNonConformLoadGroup((NonConformLoadGroup)null);
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
			case LoadModelPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
				return nonConformLoadGroup != null;
		}
		return super.eIsSet(featureID);
	}

} // NonConformLoadSchedule
