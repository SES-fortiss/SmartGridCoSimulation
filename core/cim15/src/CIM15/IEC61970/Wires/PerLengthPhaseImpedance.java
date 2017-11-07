/**
 */
package CIM15.IEC61970.Wires;

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
 * A representation of the model object '<em><b>Per Length Phase Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getLineSegments <em>Line Segments</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getPhaseImpedanceData <em>Phase Impedance Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerLengthPhaseImpedance extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getLineSegments() <em>Line Segments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<ACLineSegment> lineSegments;

	/**
	 * The default value of the '{@link #getConductorCount() <em>Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CONDUCTOR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConductorCount() <em>Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorCount()
	 * @generated
	 * @ordered
	 */
	protected int conductorCount = CONDUCTOR_COUNT_EDEFAULT;

	/**
	 * This is true if the Conductor Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conductorCountESet;

	/**
	 * The cached value of the '{@link #getPhaseImpedanceData() <em>Phase Impedance Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseImpedanceData()
	 * @generated
	 * @ordered
	 */
	protected EList<PhaseImpedanceData> phaseImpedanceData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerLengthPhaseImpedance() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PER_LENGTH_PHASE_IMPEDANCE;
	}

	/**
	 * Returns the value of the '<em><b>Line Segments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.ACLineSegment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ACLineSegment#getPhaseImpedance <em>Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Segments</em>' reference list.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getPhaseImpedance
	 * @generated
	 */
	public EList<ACLineSegment> getLineSegments() {
		if (lineSegments == null) {
			lineSegments = new BasicInternalEList<ACLineSegment>(ACLineSegment.class);
		}
		return lineSegments;
	}

	/**
	 * Returns the value of the '<em><b>Conductor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Count</em>' attribute.
	 * @see #isSetConductorCount()
	 * @see #unsetConductorCount()
	 * @see #setConductorCount(int)
	 * @generated
	 */
	public int getConductorCount() {
		return conductorCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor Count</em>' attribute.
	 * @see #isSetConductorCount()
	 * @see #unsetConductorCount()
	 * @see #getConductorCount()
	 * @generated
	 */
	public void setConductorCount(int newConductorCount) {
		conductorCount = newConductorCount;
		conductorCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConductorCount()
	 * @see #getConductorCount()
	 * @see #setConductorCount(int)
	 * @generated
	 */
	public void unsetConductorCount() {
		conductorCount = CONDUCTOR_COUNT_EDEFAULT;
		conductorCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getConductorCount <em>Conductor Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conductor Count</em>' attribute is set.
	 * @see #unsetConductorCount()
	 * @see #getConductorCount()
	 * @see #setConductorCount(int)
	 * @generated
	 */
	public boolean isSetConductorCount() {
		return conductorCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Impedance Data</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.PhaseImpedanceData}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PhaseImpedanceData#getPhaseImpedance <em>Phase Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Impedance Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Impedance Data</em>' reference list.
	 * @see CIM15.IEC61970.Wires.PhaseImpedanceData#getPhaseImpedance
	 * @generated
	 */
	public EList<PhaseImpedanceData> getPhaseImpedanceData() {
		if (phaseImpedanceData == null) {
			phaseImpedanceData = new BasicInternalEList<PhaseImpedanceData>(PhaseImpedanceData.class);
		}
		return phaseImpedanceData;
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
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLineSegments()).basicAdd(otherEnd, msgs);
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPhaseImpedanceData()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS:
				return ((InternalEList<?>)getLineSegments()).basicRemove(otherEnd, msgs);
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				return ((InternalEList<?>)getPhaseImpedanceData()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS:
				return getLineSegments();
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
				return getConductorCount();
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				return getPhaseImpedanceData();
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
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS:
				getLineSegments().clear();
				getLineSegments().addAll((Collection<? extends ACLineSegment>)newValue);
				return;
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
				setConductorCount((Integer)newValue);
				return;
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				getPhaseImpedanceData().clear();
				getPhaseImpedanceData().addAll((Collection<? extends PhaseImpedanceData>)newValue);
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
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS:
				getLineSegments().clear();
				return;
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
				unsetConductorCount();
				return;
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				getPhaseImpedanceData().clear();
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
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS:
				return lineSegments != null && !lineSegments.isEmpty();
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__CONDUCTOR_COUNT:
				return isSetConductorCount();
			case WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA:
				return phaseImpedanceData != null && !phaseImpedanceData.isEmpty();
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
		result.append(" (conductorCount: ");
		if (conductorCountESet) result.append(conductorCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PerLengthPhaseImpedance
