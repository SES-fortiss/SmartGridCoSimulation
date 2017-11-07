/**
 */
package CIM15.IEC61970.Core;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.Substation#getBays <em>Bays</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Substation#getVoltageLevels <em>Voltage Levels</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Substation#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Substation extends EquipmentContainer {
	/**
	 * The cached value of the '{@link #getBays() <em>Bays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBays()
	 * @generated
	 * @ordered
	 */
	protected EList<Bay> bays;

	/**
	 * The cached value of the '{@link #getVoltageLevels() <em>Voltage Levels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageLevel> voltageLevels;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected SubGeographicalRegion region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Substation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SUBSTATION;
	}

	/**
	 * Returns the value of the '<em><b>Bays</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Bay}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Bay#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bays</em>' reference list.
	 * @see CIM15.IEC61970.Core.Bay#getSubstation
	 * @generated
	 */
	public EList<Bay> getBays() {
		if (bays == null) {
			bays = new BasicInternalEList<Bay>(Bay.class);
		}
		return bays;
	}

	/**
	 * Returns the value of the '<em><b>Voltage Levels</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.VoltageLevel}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.VoltageLevel#getSubstation <em>Substation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Levels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Levels</em>' reference list.
	 * @see CIM15.IEC61970.Core.VoltageLevel#getSubstation
	 * @generated
	 */
	public EList<VoltageLevel> getVoltageLevels() {
		if (voltageLevels == null) {
			voltageLevels = new BasicInternalEList<VoltageLevel>(VoltageLevel.class);
		}
		return voltageLevels;
	}

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.SubGeographicalRegion#getSubstations <em>Substations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(SubGeographicalRegion)
	 * @see CIM15.IEC61970.Core.SubGeographicalRegion#getSubstations
	 * @generated
	 */
	public SubGeographicalRegion getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (SubGeographicalRegion)eResolveProxy(oldRegion);
			if (region != oldRegion) {
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(SubGeographicalRegion newRegion, NotificationChain msgs) {
		SubGeographicalRegion oldRegion = region;
		region = newRegion;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Substation#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	public void setRegion(SubGeographicalRegion newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
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
			case CorePackage.SUBSTATION__BAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBays()).basicAdd(otherEnd, msgs);
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageLevels()).basicAdd(otherEnd, msgs);
			case CorePackage.SUBSTATION__REGION:
				if (region != null)
					msgs = ((InternalEObject)region).eInverseRemove(this, CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs);
				return basicSetRegion((SubGeographicalRegion)otherEnd, msgs);
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
			case CorePackage.SUBSTATION__BAYS:
				return ((InternalEList<?>)getBays()).basicRemove(otherEnd, msgs);
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				return ((InternalEList<?>)getVoltageLevels()).basicRemove(otherEnd, msgs);
			case CorePackage.SUBSTATION__REGION:
				return basicSetRegion(null, msgs);
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
			case CorePackage.SUBSTATION__BAYS:
				return getBays();
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				return getVoltageLevels();
			case CorePackage.SUBSTATION__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
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
			case CorePackage.SUBSTATION__BAYS:
				getBays().clear();
				getBays().addAll((Collection<? extends Bay>)newValue);
				return;
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				getVoltageLevels().clear();
				getVoltageLevels().addAll((Collection<? extends VoltageLevel>)newValue);
				return;
			case CorePackage.SUBSTATION__REGION:
				setRegion((SubGeographicalRegion)newValue);
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
			case CorePackage.SUBSTATION__BAYS:
				getBays().clear();
				return;
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				getVoltageLevels().clear();
				return;
			case CorePackage.SUBSTATION__REGION:
				setRegion((SubGeographicalRegion)null);
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
			case CorePackage.SUBSTATION__BAYS:
				return bays != null && !bays.isEmpty();
			case CorePackage.SUBSTATION__VOLTAGE_LEVELS:
				return voltageLevels != null && !voltageLevels.isEmpty();
			case CorePackage.SUBSTATION__REGION:
				return region != null;
		}
		return super.eIsSet(featureID);
	}

} // Substation
