/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61970.Core.PhaseCode;

import CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnosis Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect <em>Effect</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode <em>Final Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosisDataSet extends ProcedureDataSet {
	/**
	 * The default value of the '{@link #getFinalCause() <em>Final Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCause()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalCause() <em>Final Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCause()
	 * @generated
	 * @ordered
	 */
	protected String finalCause = FINAL_CAUSE_EDEFAULT;

	/**
	 * This is true if the Final Cause attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalCauseESet;

	/**
	 * The default value of the '{@link #getFinalRemark() <em>Final Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalRemark() <em>Final Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalRemark()
	 * @generated
	 * @ordered
	 */
	protected String finalRemark = FINAL_REMARK_EDEFAULT;

	/**
	 * This is true if the Final Remark attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalRemarkESet;

	/**
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.S12_N;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

	/**
	 * This is true if the Phase Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCodeESet;

	/**
	 * The default value of the '{@link #getPreliminaryDateTime() <em>Preliminary Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRELIMINARY_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryDateTime() <em>Preliminary Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date preliminaryDateTime = PRELIMINARY_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Preliminary Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preliminaryDateTimeESet;

	/**
	 * The default value of the '{@link #getPreliminaryCode() <em>Preliminary Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRELIMINARY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryCode() <em>Preliminary Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryCode()
	 * @generated
	 * @ordered
	 */
	protected String preliminaryCode = PRELIMINARY_CODE_EDEFAULT;

	/**
	 * This is true if the Preliminary Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preliminaryCodeESet;

	/**
	 * The default value of the '{@link #getRootRemark() <em>Root Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootRemark() <em>Root Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootRemark()
	 * @generated
	 * @ordered
	 */
	protected String rootRemark = ROOT_REMARK_EDEFAULT;

	/**
	 * This is true if the Root Remark attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rootRemarkESet;

	/**
	 * The default value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCause()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCause()
	 * @generated
	 * @ordered
	 */
	protected String rootCause = ROOT_CAUSE_EDEFAULT;

	/**
	 * This is true if the Root Cause attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rootCauseESet;

	/**
	 * The default value of the '{@link #getPreliminaryRemark() <em>Preliminary Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String PRELIMINARY_REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryRemark() <em>Preliminary Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryRemark()
	 * @generated
	 * @ordered
	 */
	protected String preliminaryRemark = PRELIMINARY_REMARK_EDEFAULT;

	/**
	 * This is true if the Preliminary Remark attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preliminaryRemarkESet;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * This is true if the Effect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectESet;

	/**
	 * The default value of the '{@link #getFinalOrigin() <em>Final Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalOrigin() <em>Final Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalOrigin()
	 * @generated
	 * @ordered
	 */
	protected String finalOrigin = FINAL_ORIGIN_EDEFAULT;

	/**
	 * This is true if the Final Origin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalOriginESet;

	/**
	 * The default value of the '{@link #getFinalCode() <em>Final Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalCode() <em>Final Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalCode()
	 * @generated
	 * @ordered
	 */
	protected String finalCode = FINAL_CODE_EDEFAULT;

	/**
	 * This is true if the Final Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalCodeESet;

	/**
	 * The default value of the '{@link #getRootOrigin() <em>Root Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootOrigin() <em>Root Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootOrigin()
	 * @generated
	 * @ordered
	 */
	protected String rootOrigin = ROOT_ORIGIN_EDEFAULT;

	/**
	 * This is true if the Root Origin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rootOriginESet;

	/**
	 * The default value of the '{@link #getFailureMode() <em>Failure Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMode()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureMode() <em>Failure Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMode()
	 * @generated
	 * @ordered
	 */
	protected String failureMode = FAILURE_MODE_EDEFAULT;

	/**
	 * This is true if the Failure Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean failureModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosisDataSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.DIAGNOSIS_DATA_SET;
	}

	/**
	 * Returns the value of the '<em><b>Final Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Cause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Cause</em>' attribute.
	 * @see #isSetFinalCause()
	 * @see #unsetFinalCause()
	 * @see #setFinalCause(String)
	 * @generated
	 */
	public String getFinalCause() {
		return finalCause;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Cause</em>' attribute.
	 * @see #isSetFinalCause()
	 * @see #unsetFinalCause()
	 * @see #getFinalCause()
	 * @generated
	 */
	public void setFinalCause(String newFinalCause) {
		finalCause = newFinalCause;
		finalCauseESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalCause()
	 * @see #getFinalCause()
	 * @see #setFinalCause(String)
	 * @generated
	 */
	public void unsetFinalCause() {
		finalCause = FINAL_CAUSE_EDEFAULT;
		finalCauseESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCause <em>Final Cause</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final Cause</em>' attribute is set.
	 * @see #unsetFinalCause()
	 * @see #getFinalCause()
	 * @see #setFinalCause(String)
	 * @generated
	 */
	public boolean isSetFinalCause() {
		return finalCauseESet;
	}

	/**
	 * Returns the value of the '<em><b>Final Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Remark</em>' attribute.
	 * @see #isSetFinalRemark()
	 * @see #unsetFinalRemark()
	 * @see #setFinalRemark(String)
	 * @generated
	 */
	public String getFinalRemark() {
		return finalRemark;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Remark</em>' attribute.
	 * @see #isSetFinalRemark()
	 * @see #unsetFinalRemark()
	 * @see #getFinalRemark()
	 * @generated
	 */
	public void setFinalRemark(String newFinalRemark) {
		finalRemark = newFinalRemark;
		finalRemarkESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalRemark()
	 * @see #getFinalRemark()
	 * @see #setFinalRemark(String)
	 * @generated
	 */
	public void unsetFinalRemark() {
		finalRemark = FINAL_REMARK_EDEFAULT;
		finalRemarkESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalRemark <em>Final Remark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final Remark</em>' attribute is set.
	 * @see #unsetFinalRemark()
	 * @see #getFinalRemark()
	 * @see #setFinalRemark(String)
	 * @generated
	 */
	public boolean isSetFinalRemark() {
		return finalRemarkESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhaseCode()
	 * @see #unsetPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhaseCode()
	 * @see #unsetPhaseCode()
	 * @see #getPhaseCode()
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		phaseCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCode()
	 * @see #getPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public void unsetPhaseCode() {
		phaseCode = PHASE_CODE_EDEFAULT;
		phaseCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPhaseCode <em>Phase Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Code</em>' attribute is set.
	 * @see #unsetPhaseCode()
	 * @see #getPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public boolean isSetPhaseCode() {
		return phaseCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Preliminary Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Date Time</em>' attribute.
	 * @see #isSetPreliminaryDateTime()
	 * @see #unsetPreliminaryDateTime()
	 * @see #setPreliminaryDateTime(Date)
	 * @generated
	 */
	public Date getPreliminaryDateTime() {
		return preliminaryDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Date Time</em>' attribute.
	 * @see #isSetPreliminaryDateTime()
	 * @see #unsetPreliminaryDateTime()
	 * @see #getPreliminaryDateTime()
	 * @generated
	 */
	public void setPreliminaryDateTime(Date newPreliminaryDateTime) {
		preliminaryDateTime = newPreliminaryDateTime;
		preliminaryDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreliminaryDateTime()
	 * @see #getPreliminaryDateTime()
	 * @see #setPreliminaryDateTime(Date)
	 * @generated
	 */
	public void unsetPreliminaryDateTime() {
		preliminaryDateTime = PRELIMINARY_DATE_TIME_EDEFAULT;
		preliminaryDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryDateTime <em>Preliminary Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preliminary Date Time</em>' attribute is set.
	 * @see #unsetPreliminaryDateTime()
	 * @see #getPreliminaryDateTime()
	 * @see #setPreliminaryDateTime(Date)
	 * @generated
	 */
	public boolean isSetPreliminaryDateTime() {
		return preliminaryDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Preliminary Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Code</em>' attribute.
	 * @see #isSetPreliminaryCode()
	 * @see #unsetPreliminaryCode()
	 * @see #setPreliminaryCode(String)
	 * @generated
	 */
	public String getPreliminaryCode() {
		return preliminaryCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Code</em>' attribute.
	 * @see #isSetPreliminaryCode()
	 * @see #unsetPreliminaryCode()
	 * @see #getPreliminaryCode()
	 * @generated
	 */
	public void setPreliminaryCode(String newPreliminaryCode) {
		preliminaryCode = newPreliminaryCode;
		preliminaryCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreliminaryCode()
	 * @see #getPreliminaryCode()
	 * @see #setPreliminaryCode(String)
	 * @generated
	 */
	public void unsetPreliminaryCode() {
		preliminaryCode = PRELIMINARY_CODE_EDEFAULT;
		preliminaryCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryCode <em>Preliminary Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preliminary Code</em>' attribute is set.
	 * @see #unsetPreliminaryCode()
	 * @see #getPreliminaryCode()
	 * @see #setPreliminaryCode(String)
	 * @generated
	 */
	public boolean isSetPreliminaryCode() {
		return preliminaryCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Root Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Remark</em>' attribute.
	 * @see #isSetRootRemark()
	 * @see #unsetRootRemark()
	 * @see #setRootRemark(String)
	 * @generated
	 */
	public String getRootRemark() {
		return rootRemark;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Remark</em>' attribute.
	 * @see #isSetRootRemark()
	 * @see #unsetRootRemark()
	 * @see #getRootRemark()
	 * @generated
	 */
	public void setRootRemark(String newRootRemark) {
		rootRemark = newRootRemark;
		rootRemarkESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRootRemark()
	 * @see #getRootRemark()
	 * @see #setRootRemark(String)
	 * @generated
	 */
	public void unsetRootRemark() {
		rootRemark = ROOT_REMARK_EDEFAULT;
		rootRemarkESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootRemark <em>Root Remark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Root Remark</em>' attribute is set.
	 * @see #unsetRootRemark()
	 * @see #getRootRemark()
	 * @see #setRootRemark(String)
	 * @generated
	 */
	public boolean isSetRootRemark() {
		return rootRemarkESet;
	}

	/**
	 * Returns the value of the '<em><b>Root Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Cause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Cause</em>' attribute.
	 * @see #isSetRootCause()
	 * @see #unsetRootCause()
	 * @see #setRootCause(String)
	 * @generated
	 */
	public String getRootCause() {
		return rootCause;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Cause</em>' attribute.
	 * @see #isSetRootCause()
	 * @see #unsetRootCause()
	 * @see #getRootCause()
	 * @generated
	 */
	public void setRootCause(String newRootCause) {
		rootCause = newRootCause;
		rootCauseESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRootCause()
	 * @see #getRootCause()
	 * @see #setRootCause(String)
	 * @generated
	 */
	public void unsetRootCause() {
		rootCause = ROOT_CAUSE_EDEFAULT;
		rootCauseESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootCause <em>Root Cause</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Root Cause</em>' attribute is set.
	 * @see #unsetRootCause()
	 * @see #getRootCause()
	 * @see #setRootCause(String)
	 * @generated
	 */
	public boolean isSetRootCause() {
		return rootCauseESet;
	}

	/**
	 * Returns the value of the '<em><b>Preliminary Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Remark</em>' attribute.
	 * @see #isSetPreliminaryRemark()
	 * @see #unsetPreliminaryRemark()
	 * @see #setPreliminaryRemark(String)
	 * @generated
	 */
	public String getPreliminaryRemark() {
		return preliminaryRemark;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Remark</em>' attribute.
	 * @see #isSetPreliminaryRemark()
	 * @see #unsetPreliminaryRemark()
	 * @see #getPreliminaryRemark()
	 * @generated
	 */
	public void setPreliminaryRemark(String newPreliminaryRemark) {
		preliminaryRemark = newPreliminaryRemark;
		preliminaryRemarkESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreliminaryRemark()
	 * @see #getPreliminaryRemark()
	 * @see #setPreliminaryRemark(String)
	 * @generated
	 */
	public void unsetPreliminaryRemark() {
		preliminaryRemark = PRELIMINARY_REMARK_EDEFAULT;
		preliminaryRemarkESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getPreliminaryRemark <em>Preliminary Remark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preliminary Remark</em>' attribute is set.
	 * @see #unsetPreliminaryRemark()
	 * @see #getPreliminaryRemark()
	 * @see #setPreliminaryRemark(String)
	 * @generated
	 */
	public boolean isSetPreliminaryRemark() {
		return preliminaryRemarkESet;
	}

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #setEffect(String)
	 * @generated
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @generated
	 */
	public void setEffect(String newEffect) {
		effect = newEffect;
		effectESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffect()
	 * @see #getEffect()
	 * @see #setEffect(String)
	 * @generated
	 */
	public void unsetEffect() {
		effect = EFFECT_EDEFAULT;
		effectESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getEffect <em>Effect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effect</em>' attribute is set.
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @see #setEffect(String)
	 * @generated
	 */
	public boolean isSetEffect() {
		return effectESet;
	}

	/**
	 * Returns the value of the '<em><b>Final Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Origin</em>' attribute.
	 * @see #isSetFinalOrigin()
	 * @see #unsetFinalOrigin()
	 * @see #setFinalOrigin(String)
	 * @generated
	 */
	public String getFinalOrigin() {
		return finalOrigin;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Origin</em>' attribute.
	 * @see #isSetFinalOrigin()
	 * @see #unsetFinalOrigin()
	 * @see #getFinalOrigin()
	 * @generated
	 */
	public void setFinalOrigin(String newFinalOrigin) {
		finalOrigin = newFinalOrigin;
		finalOriginESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalOrigin()
	 * @see #getFinalOrigin()
	 * @see #setFinalOrigin(String)
	 * @generated
	 */
	public void unsetFinalOrigin() {
		finalOrigin = FINAL_ORIGIN_EDEFAULT;
		finalOriginESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalOrigin <em>Final Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final Origin</em>' attribute is set.
	 * @see #unsetFinalOrigin()
	 * @see #getFinalOrigin()
	 * @see #setFinalOrigin(String)
	 * @generated
	 */
	public boolean isSetFinalOrigin() {
		return finalOriginESet;
	}

	/**
	 * Returns the value of the '<em><b>Final Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Code</em>' attribute.
	 * @see #isSetFinalCode()
	 * @see #unsetFinalCode()
	 * @see #setFinalCode(String)
	 * @generated
	 */
	public String getFinalCode() {
		return finalCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode <em>Final Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Code</em>' attribute.
	 * @see #isSetFinalCode()
	 * @see #unsetFinalCode()
	 * @see #getFinalCode()
	 * @generated
	 */
	public void setFinalCode(String newFinalCode) {
		finalCode = newFinalCode;
		finalCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode <em>Final Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalCode()
	 * @see #getFinalCode()
	 * @see #setFinalCode(String)
	 * @generated
	 */
	public void unsetFinalCode() {
		finalCode = FINAL_CODE_EDEFAULT;
		finalCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFinalCode <em>Final Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final Code</em>' attribute is set.
	 * @see #unsetFinalCode()
	 * @see #getFinalCode()
	 * @see #setFinalCode(String)
	 * @generated
	 */
	public boolean isSetFinalCode() {
		return finalCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Root Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Origin</em>' attribute.
	 * @see #isSetRootOrigin()
	 * @see #unsetRootOrigin()
	 * @see #setRootOrigin(String)
	 * @generated
	 */
	public String getRootOrigin() {
		return rootOrigin;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Origin</em>' attribute.
	 * @see #isSetRootOrigin()
	 * @see #unsetRootOrigin()
	 * @see #getRootOrigin()
	 * @generated
	 */
	public void setRootOrigin(String newRootOrigin) {
		rootOrigin = newRootOrigin;
		rootOriginESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRootOrigin()
	 * @see #getRootOrigin()
	 * @see #setRootOrigin(String)
	 * @generated
	 */
	public void unsetRootOrigin() {
		rootOrigin = ROOT_ORIGIN_EDEFAULT;
		rootOriginESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getRootOrigin <em>Root Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Root Origin</em>' attribute is set.
	 * @see #unsetRootOrigin()
	 * @see #getRootOrigin()
	 * @see #setRootOrigin(String)
	 * @generated
	 */
	public boolean isSetRootOrigin() {
		return rootOriginESet;
	}

	/**
	 * Returns the value of the '<em><b>Failure Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Mode</em>' attribute.
	 * @see #isSetFailureMode()
	 * @see #unsetFailureMode()
	 * @see #setFailureMode(String)
	 * @generated
	 */
	public String getFailureMode() {
		return failureMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode</em>' attribute.
	 * @see #isSetFailureMode()
	 * @see #unsetFailureMode()
	 * @see #getFailureMode()
	 * @generated
	 */
	public void setFailureMode(String newFailureMode) {
		failureMode = newFailureMode;
		failureModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailureMode()
	 * @see #getFailureMode()
	 * @see #setFailureMode(String)
	 * @generated
	 */
	public void unsetFailureMode() {
		failureMode = FAILURE_MODE_EDEFAULT;
		failureModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DiagnosisDataSet#getFailureMode <em>Failure Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Failure Mode</em>' attribute is set.
	 * @see #unsetFailureMode()
	 * @see #getFailureMode()
	 * @see #setFailureMode(String)
	 * @generated
	 */
	public boolean isSetFailureMode() {
		return failureModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
				return getFinalCause();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
				return getFinalRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
				return getPhaseCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
				return getPreliminaryDateTime();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
				return getPreliminaryCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
				return getRootRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
				return getRootCause();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
				return getPreliminaryRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT:
				return getEffect();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
				return getFinalOrigin();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
				return getFinalCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
				return getRootOrigin();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
				return getFailureMode();
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
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
				setFinalCause((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
				setFinalRemark((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
				setPreliminaryDateTime((Date)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
				setPreliminaryCode((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
				setRootRemark((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
				setRootCause((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
				setPreliminaryRemark((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT:
				setEffect((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
				setFinalOrigin((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
				setFinalCode((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
				setRootOrigin((String)newValue);
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
				setFailureMode((String)newValue);
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
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
				unsetFinalCause();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
				unsetFinalRemark();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
				unsetPhaseCode();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
				unsetPreliminaryDateTime();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
				unsetPreliminaryCode();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
				unsetRootRemark();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
				unsetRootCause();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
				unsetPreliminaryRemark();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT:
				unsetEffect();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
				unsetFinalOrigin();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
				unsetFinalCode();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
				unsetRootOrigin();
				return;
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
				unsetFailureMode();
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
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
				return isSetFinalCause();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
				return isSetFinalRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
				return isSetPhaseCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
				return isSetPreliminaryDateTime();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
				return isSetPreliminaryCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
				return isSetRootRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
				return isSetRootCause();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
				return isSetPreliminaryRemark();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__EFFECT:
				return isSetEffect();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
				return isSetFinalOrigin();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
				return isSetFinalCode();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
				return isSetRootOrigin();
			case InfWorkPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
				return isSetFailureMode();
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
		result.append(" (finalCause: ");
		if (finalCauseESet) result.append(finalCause); else result.append("<unset>");
		result.append(", finalRemark: ");
		if (finalRemarkESet) result.append(finalRemark); else result.append("<unset>");
		result.append(", phaseCode: ");
		if (phaseCodeESet) result.append(phaseCode); else result.append("<unset>");
		result.append(", preliminaryDateTime: ");
		if (preliminaryDateTimeESet) result.append(preliminaryDateTime); else result.append("<unset>");
		result.append(", preliminaryCode: ");
		if (preliminaryCodeESet) result.append(preliminaryCode); else result.append("<unset>");
		result.append(", rootRemark: ");
		if (rootRemarkESet) result.append(rootRemark); else result.append("<unset>");
		result.append(", rootCause: ");
		if (rootCauseESet) result.append(rootCause); else result.append("<unset>");
		result.append(", preliminaryRemark: ");
		if (preliminaryRemarkESet) result.append(preliminaryRemark); else result.append("<unset>");
		result.append(", effect: ");
		if (effectESet) result.append(effect); else result.append("<unset>");
		result.append(", finalOrigin: ");
		if (finalOriginESet) result.append(finalOrigin); else result.append("<unset>");
		result.append(", finalCode: ");
		if (finalCodeESet) result.append(finalCode); else result.append("<unset>");
		result.append(", rootOrigin: ");
		if (rootOriginESet) result.append(rootOrigin); else result.append("<unset>");
		result.append(", failureMode: ");
		if (failureModeESet) result.append(failureMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DiagnosisDataSet
