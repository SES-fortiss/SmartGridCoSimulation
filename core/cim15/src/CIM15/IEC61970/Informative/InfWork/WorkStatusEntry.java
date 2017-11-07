/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.ActivityRecord;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Status Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete <em>Percent Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkStatusEntry extends ActivityRecord {
	/**
	 * The default value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENT_COMPLETE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected float percentComplete = PERCENT_COMPLETE_EDEFAULT;

	/**
	 * This is true if the Percent Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentCompleteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkStatusEntry() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_STATUS_ENTRY;
	}

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #isSetPercentComplete()
	 * @see #unsetPercentComplete()
	 * @see #setPercentComplete(float)
	 * @generated
	 */
	public float getPercentComplete() {
		return percentComplete;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #isSetPercentComplete()
	 * @see #unsetPercentComplete()
	 * @see #getPercentComplete()
	 * @generated
	 */
	public void setPercentComplete(float newPercentComplete) {
		percentComplete = newPercentComplete;
		percentCompleteESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentComplete()
	 * @see #getPercentComplete()
	 * @see #setPercentComplete(float)
	 * @generated
	 */
	public void unsetPercentComplete() {
		percentComplete = PERCENT_COMPLETE_EDEFAULT;
		percentCompleteESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkStatusEntry#getPercentComplete <em>Percent Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percent Complete</em>' attribute is set.
	 * @see #unsetPercentComplete()
	 * @see #getPercentComplete()
	 * @see #setPercentComplete(float)
	 * @generated
	 */
	public boolean isSetPercentComplete() {
		return percentCompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfWorkPackage.WORK_STATUS_ENTRY__PERCENT_COMPLETE:
				return getPercentComplete();
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
			case InfWorkPackage.WORK_STATUS_ENTRY__PERCENT_COMPLETE:
				setPercentComplete((Float)newValue);
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
			case InfWorkPackage.WORK_STATUS_ENTRY__PERCENT_COMPLETE:
				unsetPercentComplete();
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
			case InfWorkPackage.WORK_STATUS_ENTRY__PERCENT_COMPLETE:
				return isSetPercentComplete();
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
		result.append(" (percentComplete: ");
		if (percentCompleteESet) result.append(percentComplete); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WorkStatusEntry
