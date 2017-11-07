/**
 */
package CIM15.IEC61970.LoadModel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformLoadSchedule extends SeasonDayTypeSchedule {
	/**
	 * The cached value of the '{@link #getConformLoadGroup() <em>Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected ConformLoadGroup conformLoadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformLoadSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.CONFORM_LOAD_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Conform Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conform Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conform Load Group</em>' reference.
	 * @see #setConformLoadGroup(ConformLoadGroup)
	 * @see CIM15.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules
	 * @generated
	 */
	public ConformLoadGroup getConformLoadGroup() {
		if (conformLoadGroup != null && conformLoadGroup.eIsProxy()) {
			InternalEObject oldConformLoadGroup = (InternalEObject)conformLoadGroup;
			conformLoadGroup = (ConformLoadGroup)eResolveProxy(oldConformLoadGroup);
			if (conformLoadGroup != oldConformLoadGroup) {
			}
		}
		return conformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup basicGetConformLoadGroup() {
		return conformLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformLoadGroup(ConformLoadGroup newConformLoadGroup, NotificationChain msgs) {
		ConformLoadGroup oldConformLoadGroup = conformLoadGroup;
		conformLoadGroup = newConformLoadGroup;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conform Load Group</em>' reference.
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	public void setConformLoadGroup(ConformLoadGroup newConformLoadGroup) {
		if (newConformLoadGroup != conformLoadGroup) {
			NotificationChain msgs = null;
			if (conformLoadGroup != null)
				msgs = ((InternalEObject)conformLoadGroup).eInverseRemove(this, LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs);
			if (newConformLoadGroup != null)
				msgs = ((InternalEObject)newConformLoadGroup).eInverseAdd(this, LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs);
			msgs = basicSetConformLoadGroup(newConformLoadGroup, msgs);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				if (conformLoadGroup != null)
					msgs = ((InternalEObject)conformLoadGroup).eInverseRemove(this, LoadModelPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs);
				return basicSetConformLoadGroup((ConformLoadGroup)otherEnd, msgs);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				return basicSetConformLoadGroup(null, msgs);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				if (resolve) return getConformLoadGroup();
				return basicGetConformLoadGroup();
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				setConformLoadGroup((ConformLoadGroup)newValue);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				setConformLoadGroup((ConformLoadGroup)null);
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
			case LoadModelPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
				return conformLoadGroup != null;
		}
		return super.eIsSet(featureID);
	}

} // ConformLoadSchedule
