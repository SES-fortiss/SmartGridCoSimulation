/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Document;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Call Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations <em>Work Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator <em>Marked Indicator</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed <em>Explosives Used</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction <em>Marking Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneCallRequest extends Document {
	/**
	 * The cached value of the '{@link #getWorkLocations() <em>Work Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkLocation> workLocations;

	/**
	 * The default value of the '{@link #isMarkedIndicator() <em>Marked Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkedIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARKED_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMarkedIndicator() <em>Marked Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkedIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean markedIndicator = MARKED_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Marked Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean markedIndicatorESet;

	/**
	 * The default value of the '{@link #isExplosivesUsed() <em>Explosives Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplosivesUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLOSIVES_USED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplosivesUsed() <em>Explosives Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplosivesUsed()
	 * @generated
	 * @ordered
	 */
	protected boolean explosivesUsed = EXPLOSIVES_USED_EDEFAULT;

	/**
	 * This is true if the Explosives Used attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean explosivesUsedESet;

	/**
	 * The default value of the '{@link #getMarkingInstruction() <em>Marking Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkingInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKING_INSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkingInstruction() <em>Marking Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkingInstruction()
	 * @generated
	 * @ordered
	 */
	protected String markingInstruction = MARKING_INSTRUCTION_EDEFAULT;

	/**
	 * This is true if the Marking Instruction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean markingInstructionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneCallRequest() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.ONE_CALL_REQUEST;
	}

	/**
	 * Returns the value of the '<em><b>Work Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkLocation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest <em>One Call Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Locations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest
	 * @generated
	 */
	public EList<WorkLocation> getWorkLocations() {
		if (workLocations == null) {
			workLocations = new BasicInternalEList<WorkLocation>(WorkLocation.class);
		}
		return workLocations;
	}

	/**
	 * Returns the value of the '<em><b>Marked Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marked Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marked Indicator</em>' attribute.
	 * @see #isSetMarkedIndicator()
	 * @see #unsetMarkedIndicator()
	 * @see #setMarkedIndicator(boolean)
	 * @generated
	 */
	public boolean isMarkedIndicator() {
		return markedIndicator;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator <em>Marked Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marked Indicator</em>' attribute.
	 * @see #isSetMarkedIndicator()
	 * @see #unsetMarkedIndicator()
	 * @see #isMarkedIndicator()
	 * @generated
	 */
	public void setMarkedIndicator(boolean newMarkedIndicator) {
		markedIndicator = newMarkedIndicator;
		markedIndicatorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator <em>Marked Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkedIndicator()
	 * @see #isMarkedIndicator()
	 * @see #setMarkedIndicator(boolean)
	 * @generated
	 */
	public void unsetMarkedIndicator() {
		markedIndicator = MARKED_INDICATOR_EDEFAULT;
		markedIndicatorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isMarkedIndicator <em>Marked Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marked Indicator</em>' attribute is set.
	 * @see #unsetMarkedIndicator()
	 * @see #isMarkedIndicator()
	 * @see #setMarkedIndicator(boolean)
	 * @generated
	 */
	public boolean isSetMarkedIndicator() {
		return markedIndicatorESet;
	}

	/**
	 * Returns the value of the '<em><b>Explosives Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explosives Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explosives Used</em>' attribute.
	 * @see #isSetExplosivesUsed()
	 * @see #unsetExplosivesUsed()
	 * @see #setExplosivesUsed(boolean)
	 * @generated
	 */
	public boolean isExplosivesUsed() {
		return explosivesUsed;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed <em>Explosives Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explosives Used</em>' attribute.
	 * @see #isSetExplosivesUsed()
	 * @see #unsetExplosivesUsed()
	 * @see #isExplosivesUsed()
	 * @generated
	 */
	public void setExplosivesUsed(boolean newExplosivesUsed) {
		explosivesUsed = newExplosivesUsed;
		explosivesUsedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed <em>Explosives Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExplosivesUsed()
	 * @see #isExplosivesUsed()
	 * @see #setExplosivesUsed(boolean)
	 * @generated
	 */
	public void unsetExplosivesUsed() {
		explosivesUsed = EXPLOSIVES_USED_EDEFAULT;
		explosivesUsedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#isExplosivesUsed <em>Explosives Used</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Explosives Used</em>' attribute is set.
	 * @see #unsetExplosivesUsed()
	 * @see #isExplosivesUsed()
	 * @see #setExplosivesUsed(boolean)
	 * @generated
	 */
	public boolean isSetExplosivesUsed() {
		return explosivesUsedESet;
	}

	/**
	 * Returns the value of the '<em><b>Marking Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking Instruction</em>' attribute.
	 * @see #isSetMarkingInstruction()
	 * @see #unsetMarkingInstruction()
	 * @see #setMarkingInstruction(String)
	 * @generated
	 */
	public String getMarkingInstruction() {
		return markingInstruction;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction <em>Marking Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking Instruction</em>' attribute.
	 * @see #isSetMarkingInstruction()
	 * @see #unsetMarkingInstruction()
	 * @see #getMarkingInstruction()
	 * @generated
	 */
	public void setMarkingInstruction(String newMarkingInstruction) {
		markingInstruction = newMarkingInstruction;
		markingInstructionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction <em>Marking Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkingInstruction()
	 * @see #getMarkingInstruction()
	 * @see #setMarkingInstruction(String)
	 * @generated
	 */
	public void unsetMarkingInstruction() {
		markingInstruction = MARKING_INSTRUCTION_EDEFAULT;
		markingInstructionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#getMarkingInstruction <em>Marking Instruction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marking Instruction</em>' attribute is set.
	 * @see #unsetMarkingInstruction()
	 * @see #getMarkingInstruction()
	 * @see #setMarkingInstruction(String)
	 * @generated
	 */
	public boolean isSetMarkingInstruction() {
		return markingInstructionESet;
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
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkLocations()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				return ((InternalEList<?>)getWorkLocations()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				return getWorkLocations();
			case InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR:
				return isMarkedIndicator();
			case InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED:
				return isExplosivesUsed();
			case InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION:
				return getMarkingInstruction();
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
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				getWorkLocations().clear();
				getWorkLocations().addAll((Collection<? extends WorkLocation>)newValue);
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR:
				setMarkedIndicator((Boolean)newValue);
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED:
				setExplosivesUsed((Boolean)newValue);
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION:
				setMarkingInstruction((String)newValue);
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
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				getWorkLocations().clear();
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR:
				unsetMarkedIndicator();
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED:
				unsetExplosivesUsed();
				return;
			case InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION:
				unsetMarkingInstruction();
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
			case InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS:
				return workLocations != null && !workLocations.isEmpty();
			case InfWorkPackage.ONE_CALL_REQUEST__MARKED_INDICATOR:
				return isSetMarkedIndicator();
			case InfWorkPackage.ONE_CALL_REQUEST__EXPLOSIVES_USED:
				return isSetExplosivesUsed();
			case InfWorkPackage.ONE_CALL_REQUEST__MARKING_INSTRUCTION:
				return isSetMarkingInstruction();
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
		result.append(" (markedIndicator: ");
		if (markedIndicatorESet) result.append(markedIndicator); else result.append("<unset>");
		result.append(", explosivesUsed: ");
		if (explosivesUsedESet) result.append(explosivesUsed); else result.append("<unset>");
		result.append(", markingInstruction: ");
		if (markingInstructionESet) result.append(markingInstruction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OneCallRequest
