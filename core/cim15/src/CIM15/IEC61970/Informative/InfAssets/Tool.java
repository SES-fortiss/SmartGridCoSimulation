/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61970.Informative.InfWork.Crew;
import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Tool#getCrew <em>Crew</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tool extends Asset {
	/**
	 * The default value of the '{@link #getLastCalibrationDate() <em>Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCalibrationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_CALIBRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastCalibrationDate() <em>Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCalibrationDate()
	 * @generated
	 * @ordered
	 */
	protected String lastCalibrationDate = LAST_CALIBRATION_DATE_EDEFAULT;

	/**
	 * This is true if the Last Calibration Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastCalibrationDateESet;

	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tool() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTool();
	}

	/**
	 * Returns the value of the '<em><b>Last Calibration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Calibration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Calibration Date</em>' attribute.
	 * @see #isSetLastCalibrationDate()
	 * @see #unsetLastCalibrationDate()
	 * @see #setLastCalibrationDate(String)
	 * @generated
	 */
	public String getLastCalibrationDate() {
		return lastCalibrationDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Calibration Date</em>' attribute.
	 * @see #isSetLastCalibrationDate()
	 * @see #unsetLastCalibrationDate()
	 * @see #getLastCalibrationDate()
	 * @generated
	 */
	public void setLastCalibrationDate(String newLastCalibrationDate) {
		lastCalibrationDate = newLastCalibrationDate;
		lastCalibrationDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastCalibrationDate()
	 * @see #getLastCalibrationDate()
	 * @see #setLastCalibrationDate(String)
	 * @generated
	 */
	public void unsetLastCalibrationDate() {
		lastCalibrationDate = LAST_CALIBRATION_DATE_EDEFAULT;
		lastCalibrationDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Calibration Date</em>' attribute is set.
	 * @see #unsetLastCalibrationDate()
	 * @see #getLastCalibrationDate()
	 * @see #setLastCalibrationDate(String)
	 * @generated
	 */
	public boolean isSetLastCalibrationDate() {
		return lastCalibrationDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' reference.
	 * @see #setCrew(Crew)
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getTools
	 * @generated
	 */
	public Crew getCrew() {
		if (crew != null && crew.eIsProxy()) {
			InternalEObject oldCrew = (InternalEObject)crew;
			crew = (Crew)eResolveProxy(oldCrew);
			if (crew != oldCrew) {
			}
		}
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew basicGetCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Tool#getCrew <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' reference.
	 * @see #getCrew()
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__TOOLS, Crew.class, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, InfWorkPackage.CREW__TOOLS, Crew.class, msgs);
			msgs = basicSetCrew(newCrew, msgs);
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
			case InfAssetsPackage.TOOL__CREW:
				if (crew != null)
					msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__TOOLS, Crew.class, msgs);
				return basicSetCrew((Crew)otherEnd, msgs);
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
			case InfAssetsPackage.TOOL__CREW:
				return basicSetCrew(null, msgs);
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
			case InfAssetsPackage.TOOL__LAST_CALIBRATION_DATE:
				return getLastCalibrationDate();
			case InfAssetsPackage.TOOL__CREW:
				if (resolve) return getCrew();
				return basicGetCrew();
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
			case InfAssetsPackage.TOOL__LAST_CALIBRATION_DATE:
				setLastCalibrationDate((String)newValue);
				return;
			case InfAssetsPackage.TOOL__CREW:
				setCrew((Crew)newValue);
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
			case InfAssetsPackage.TOOL__LAST_CALIBRATION_DATE:
				unsetLastCalibrationDate();
				return;
			case InfAssetsPackage.TOOL__CREW:
				setCrew((Crew)null);
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
			case InfAssetsPackage.TOOL__LAST_CALIBRATION_DATE:
				return isSetLastCalibrationDate();
			case InfAssetsPackage.TOOL__CREW:
				return crew != null;
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
		result.append(" (lastCalibrationDate: ");
		if (lastCalibrationDateESet) result.append(lastCalibrationDate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Tool
