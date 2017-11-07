/**
 */
package CIM15.IEC61970.Meas;

import CIM15.Element;

import CIM15.IEC61970.SCADA.Source;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality61850</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isOverFlow <em>Over Flow</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isEstimatorReplaced <em>Estimator Replaced</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#getValidity <em>Validity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isOperatorBlocked <em>Operator Blocked</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isOldData <em>Old Data</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isFailure <em>Failure</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#getSource <em>Source</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isOutOfRange <em>Out Of Range</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isBadReference <em>Bad Reference</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isSuspect <em>Suspect</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isTest <em>Test</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Quality61850#isOscillatory <em>Oscillatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Quality61850 extends Element {
	/**
	 * The default value of the '{@link #isOverFlow() <em>Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverFlow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVER_FLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverFlow() <em>Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverFlow()
	 * @generated
	 * @ordered
	 */
	protected boolean overFlow = OVER_FLOW_EDEFAULT;

	/**
	 * This is true if the Over Flow attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overFlowESet;

	/**
	 * The default value of the '{@link #isEstimatorReplaced() <em>Estimator Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstimatorReplaced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ESTIMATOR_REPLACED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstimatorReplaced() <em>Estimator Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstimatorReplaced()
	 * @generated
	 * @ordered
	 */
	protected boolean estimatorReplaced = ESTIMATOR_REPLACED_EDEFAULT;

	/**
	 * This is true if the Estimator Replaced attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatorReplacedESet;

	/**
	 * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected static final Validity VALIDITY_EDEFAULT = Validity.QUESTIONABLE;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected Validity validity = VALIDITY_EDEFAULT;

	/**
	 * This is true if the Validity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validityESet;

	/**
	 * The default value of the '{@link #isOperatorBlocked() <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperatorBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATOR_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperatorBlocked() <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperatorBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean operatorBlocked = OPERATOR_BLOCKED_EDEFAULT;

	/**
	 * This is true if the Operator Blocked attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operatorBlockedESet;

	/**
	 * The default value of the '{@link #isOldData() <em>Old Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOldData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OLD_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOldData() <em>Old Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOldData()
	 * @generated
	 * @ordered
	 */
	protected boolean oldData = OLD_DATA_EDEFAULT;

	/**
	 * This is true if the Old Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oldDataESet;

	/**
	 * The default value of the '{@link #isFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean failure = FAILURE_EDEFAULT;

	/**
	 * This is true if the Failure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean failureESet;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final Source SOURCE_EDEFAULT = Source.SUBSTITUTED;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source = SOURCE_EDEFAULT;

	/**
	 * This is true if the Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceESet;

	/**
	 * The default value of the '{@link #isOutOfRange() <em>Out Of Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutOfRange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUT_OF_RANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutOfRange() <em>Out Of Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutOfRange()
	 * @generated
	 * @ordered
	 */
	protected boolean outOfRange = OUT_OF_RANGE_EDEFAULT;

	/**
	 * This is true if the Out Of Range attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outOfRangeESet;

	/**
	 * The default value of the '{@link #isBadReference() <em>Bad Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBadReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAD_REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBadReference() <em>Bad Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBadReference()
	 * @generated
	 * @ordered
	 */
	protected boolean badReference = BAD_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Bad Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean badReferenceESet;

	/**
	 * The default value of the '{@link #isSuspect() <em>Suspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUSPECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuspect() <em>Suspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspect()
	 * @generated
	 * @ordered
	 */
	protected boolean suspect = SUSPECT_EDEFAULT;

	/**
	 * This is true if the Suspect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suspectESet;

	/**
	 * The default value of the '{@link #isTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTest()
	 * @generated
	 * @ordered
	 */
	protected boolean test = TEST_EDEFAULT;

	/**
	 * This is true if the Test attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean testESet;

	/**
	 * The default value of the '{@link #isOscillatory() <em>Oscillatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOscillatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OSCILLATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOscillatory() <em>Oscillatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOscillatory()
	 * @generated
	 * @ordered
	 */
	protected boolean oscillatory = OSCILLATORY_EDEFAULT;

	/**
	 * This is true if the Oscillatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oscillatoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Quality61850() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.QUALITY61850;
	}

	/**
	 * Returns the value of the '<em><b>Over Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over Flow</em>' attribute.
	 * @see #isSetOverFlow()
	 * @see #unsetOverFlow()
	 * @see #setOverFlow(boolean)
	 * @generated
	 */
	public boolean isOverFlow() {
		return overFlow;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOverFlow <em>Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Flow</em>' attribute.
	 * @see #isSetOverFlow()
	 * @see #unsetOverFlow()
	 * @see #isOverFlow()
	 * @generated
	 */
	public void setOverFlow(boolean newOverFlow) {
		overFlow = newOverFlow;
		overFlowESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOverFlow <em>Over Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverFlow()
	 * @see #isOverFlow()
	 * @see #setOverFlow(boolean)
	 * @generated
	 */
	public void unsetOverFlow() {
		overFlow = OVER_FLOW_EDEFAULT;
		overFlowESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOverFlow <em>Over Flow</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Over Flow</em>' attribute is set.
	 * @see #unsetOverFlow()
	 * @see #isOverFlow()
	 * @see #setOverFlow(boolean)
	 * @generated
	 */
	public boolean isSetOverFlow() {
		return overFlowESet;
	}

	/**
	 * Returns the value of the '<em><b>Estimator Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimator Replaced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimator Replaced</em>' attribute.
	 * @see #isSetEstimatorReplaced()
	 * @see #unsetEstimatorReplaced()
	 * @see #setEstimatorReplaced(boolean)
	 * @generated
	 */
	public boolean isEstimatorReplaced() {
		return estimatorReplaced;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isEstimatorReplaced <em>Estimator Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimator Replaced</em>' attribute.
	 * @see #isSetEstimatorReplaced()
	 * @see #unsetEstimatorReplaced()
	 * @see #isEstimatorReplaced()
	 * @generated
	 */
	public void setEstimatorReplaced(boolean newEstimatorReplaced) {
		estimatorReplaced = newEstimatorReplaced;
		estimatorReplacedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isEstimatorReplaced <em>Estimator Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatorReplaced()
	 * @see #isEstimatorReplaced()
	 * @see #setEstimatorReplaced(boolean)
	 * @generated
	 */
	public void unsetEstimatorReplaced() {
		estimatorReplaced = ESTIMATOR_REPLACED_EDEFAULT;
		estimatorReplacedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isEstimatorReplaced <em>Estimator Replaced</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimator Replaced</em>' attribute is set.
	 * @see #unsetEstimatorReplaced()
	 * @see #isEstimatorReplaced()
	 * @see #setEstimatorReplaced(boolean)
	 * @generated
	 */
	public boolean isSetEstimatorReplaced() {
		return estimatorReplacedESet;
	}

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Meas.Validity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see CIM15.IEC61970.Meas.Validity
	 * @see #isSetValidity()
	 * @see #unsetValidity()
	 * @see #setValidity(Validity)
	 * @generated
	 */
	public Validity getValidity() {
		return validity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see CIM15.IEC61970.Meas.Validity
	 * @see #isSetValidity()
	 * @see #unsetValidity()
	 * @see #getValidity()
	 * @generated
	 */
	public void setValidity(Validity newValidity) {
		validity = newValidity == null ? VALIDITY_EDEFAULT : newValidity;
		validityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidity()
	 * @see #getValidity()
	 * @see #setValidity(Validity)
	 * @generated
	 */
	public void unsetValidity() {
		validity = VALIDITY_EDEFAULT;
		validityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#getValidity <em>Validity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validity</em>' attribute is set.
	 * @see #unsetValidity()
	 * @see #getValidity()
	 * @see #setValidity(Validity)
	 * @generated
	 */
	public boolean isSetValidity() {
		return validityESet;
	}

	/**
	 * Returns the value of the '<em><b>Operator Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Blocked</em>' attribute.
	 * @see #isSetOperatorBlocked()
	 * @see #unsetOperatorBlocked()
	 * @see #setOperatorBlocked(boolean)
	 * @generated
	 */
	public boolean isOperatorBlocked() {
		return operatorBlocked;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOperatorBlocked <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Blocked</em>' attribute.
	 * @see #isSetOperatorBlocked()
	 * @see #unsetOperatorBlocked()
	 * @see #isOperatorBlocked()
	 * @generated
	 */
	public void setOperatorBlocked(boolean newOperatorBlocked) {
		operatorBlocked = newOperatorBlocked;
		operatorBlockedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOperatorBlocked <em>Operator Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperatorBlocked()
	 * @see #isOperatorBlocked()
	 * @see #setOperatorBlocked(boolean)
	 * @generated
	 */
	public void unsetOperatorBlocked() {
		operatorBlocked = OPERATOR_BLOCKED_EDEFAULT;
		operatorBlockedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOperatorBlocked <em>Operator Blocked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operator Blocked</em>' attribute is set.
	 * @see #unsetOperatorBlocked()
	 * @see #isOperatorBlocked()
	 * @see #setOperatorBlocked(boolean)
	 * @generated
	 */
	public boolean isSetOperatorBlocked() {
		return operatorBlockedESet;
	}

	/**
	 * Returns the value of the '<em><b>Old Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Data</em>' attribute.
	 * @see #isSetOldData()
	 * @see #unsetOldData()
	 * @see #setOldData(boolean)
	 * @generated
	 */
	public boolean isOldData() {
		return oldData;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOldData <em>Old Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Data</em>' attribute.
	 * @see #isSetOldData()
	 * @see #unsetOldData()
	 * @see #isOldData()
	 * @generated
	 */
	public void setOldData(boolean newOldData) {
		oldData = newOldData;
		oldDataESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOldData <em>Old Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOldData()
	 * @see #isOldData()
	 * @see #setOldData(boolean)
	 * @generated
	 */
	public void unsetOldData() {
		oldData = OLD_DATA_EDEFAULT;
		oldDataESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOldData <em>Old Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Old Data</em>' attribute is set.
	 * @see #unsetOldData()
	 * @see #isOldData()
	 * @see #setOldData(boolean)
	 * @generated
	 */
	public boolean isSetOldData() {
		return oldDataESet;
	}

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' attribute.
	 * @see #isSetFailure()
	 * @see #unsetFailure()
	 * @see #setFailure(boolean)
	 * @generated
	 */
	public boolean isFailure() {
		return failure;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isFailure <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' attribute.
	 * @see #isSetFailure()
	 * @see #unsetFailure()
	 * @see #isFailure()
	 * @generated
	 */
	public void setFailure(boolean newFailure) {
		failure = newFailure;
		failureESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isFailure <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailure()
	 * @see #isFailure()
	 * @see #setFailure(boolean)
	 * @generated
	 */
	public void unsetFailure() {
		failure = FAILURE_EDEFAULT;
		failureESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isFailure <em>Failure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Failure</em>' attribute is set.
	 * @see #unsetFailure()
	 * @see #isFailure()
	 * @see #setFailure(boolean)
	 * @generated
	 */
	public boolean isSetFailure() {
		return failureESet;
	}

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.SCADA.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see CIM15.IEC61970.SCADA.Source
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(Source)
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see CIM15.IEC61970.SCADA.Source
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(Source newSource) {
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		sourceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(Source)
	 * @generated
	 */
	public void unsetSource() {
		source = SOURCE_EDEFAULT;
		sourceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#getSource <em>Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' attribute is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(Source)
	 * @generated
	 */
	public boolean isSetSource() {
		return sourceESet;
	}

	/**
	 * Returns the value of the '<em><b>Out Of Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Of Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Of Range</em>' attribute.
	 * @see #isSetOutOfRange()
	 * @see #unsetOutOfRange()
	 * @see #setOutOfRange(boolean)
	 * @generated
	 */
	public boolean isOutOfRange() {
		return outOfRange;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOutOfRange <em>Out Of Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Of Range</em>' attribute.
	 * @see #isSetOutOfRange()
	 * @see #unsetOutOfRange()
	 * @see #isOutOfRange()
	 * @generated
	 */
	public void setOutOfRange(boolean newOutOfRange) {
		outOfRange = newOutOfRange;
		outOfRangeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOutOfRange <em>Out Of Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutOfRange()
	 * @see #isOutOfRange()
	 * @see #setOutOfRange(boolean)
	 * @generated
	 */
	public void unsetOutOfRange() {
		outOfRange = OUT_OF_RANGE_EDEFAULT;
		outOfRangeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOutOfRange <em>Out Of Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Out Of Range</em>' attribute is set.
	 * @see #unsetOutOfRange()
	 * @see #isOutOfRange()
	 * @see #setOutOfRange(boolean)
	 * @generated
	 */
	public boolean isSetOutOfRange() {
		return outOfRangeESet;
	}

	/**
	 * Returns the value of the '<em><b>Bad Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bad Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bad Reference</em>' attribute.
	 * @see #isSetBadReference()
	 * @see #unsetBadReference()
	 * @see #setBadReference(boolean)
	 * @generated
	 */
	public boolean isBadReference() {
		return badReference;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isBadReference <em>Bad Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bad Reference</em>' attribute.
	 * @see #isSetBadReference()
	 * @see #unsetBadReference()
	 * @see #isBadReference()
	 * @generated
	 */
	public void setBadReference(boolean newBadReference) {
		badReference = newBadReference;
		badReferenceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isBadReference <em>Bad Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBadReference()
	 * @see #isBadReference()
	 * @see #setBadReference(boolean)
	 * @generated
	 */
	public void unsetBadReference() {
		badReference = BAD_REFERENCE_EDEFAULT;
		badReferenceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isBadReference <em>Bad Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bad Reference</em>' attribute is set.
	 * @see #unsetBadReference()
	 * @see #isBadReference()
	 * @see #setBadReference(boolean)
	 * @generated
	 */
	public boolean isSetBadReference() {
		return badReferenceESet;
	}

	/**
	 * Returns the value of the '<em><b>Suspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspect</em>' attribute.
	 * @see #isSetSuspect()
	 * @see #unsetSuspect()
	 * @see #setSuspect(boolean)
	 * @generated
	 */
	public boolean isSuspect() {
		return suspect;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isSuspect <em>Suspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspect</em>' attribute.
	 * @see #isSetSuspect()
	 * @see #unsetSuspect()
	 * @see #isSuspect()
	 * @generated
	 */
	public void setSuspect(boolean newSuspect) {
		suspect = newSuspect;
		suspectESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isSuspect <em>Suspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuspect()
	 * @see #isSuspect()
	 * @see #setSuspect(boolean)
	 * @generated
	 */
	public void unsetSuspect() {
		suspect = SUSPECT_EDEFAULT;
		suspectESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isSuspect <em>Suspect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suspect</em>' attribute is set.
	 * @see #unsetSuspect()
	 * @see #isSuspect()
	 * @see #setSuspect(boolean)
	 * @generated
	 */
	public boolean isSetSuspect() {
		return suspectESet;
	}

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #isSetTest()
	 * @see #unsetTest()
	 * @see #setTest(boolean)
	 * @generated
	 */
	public boolean isTest() {
		return test;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #isSetTest()
	 * @see #unsetTest()
	 * @see #isTest()
	 * @generated
	 */
	public void setTest(boolean newTest) {
		test = newTest;
		testESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTest()
	 * @see #isTest()
	 * @see #setTest(boolean)
	 * @generated
	 */
	public void unsetTest() {
		test = TEST_EDEFAULT;
		testESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isTest <em>Test</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test</em>' attribute is set.
	 * @see #unsetTest()
	 * @see #isTest()
	 * @see #setTest(boolean)
	 * @generated
	 */
	public boolean isSetTest() {
		return testESet;
	}

	/**
	 * Returns the value of the '<em><b>Oscillatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oscillatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscillatory</em>' attribute.
	 * @see #isSetOscillatory()
	 * @see #unsetOscillatory()
	 * @see #setOscillatory(boolean)
	 * @generated
	 */
	public boolean isOscillatory() {
		return oscillatory;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOscillatory <em>Oscillatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscillatory</em>' attribute.
	 * @see #isSetOscillatory()
	 * @see #unsetOscillatory()
	 * @see #isOscillatory()
	 * @generated
	 */
	public void setOscillatory(boolean newOscillatory) {
		oscillatory = newOscillatory;
		oscillatoryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOscillatory <em>Oscillatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOscillatory()
	 * @see #isOscillatory()
	 * @see #setOscillatory(boolean)
	 * @generated
	 */
	public void unsetOscillatory() {
		oscillatory = OSCILLATORY_EDEFAULT;
		oscillatoryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Quality61850#isOscillatory <em>Oscillatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Oscillatory</em>' attribute is set.
	 * @see #unsetOscillatory()
	 * @see #isOscillatory()
	 * @see #setOscillatory(boolean)
	 * @generated
	 */
	public boolean isSetOscillatory() {
		return oscillatoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasPackage.QUALITY61850__OVER_FLOW:
				return isOverFlow();
			case MeasPackage.QUALITY61850__ESTIMATOR_REPLACED:
				return isEstimatorReplaced();
			case MeasPackage.QUALITY61850__VALIDITY:
				return getValidity();
			case MeasPackage.QUALITY61850__OPERATOR_BLOCKED:
				return isOperatorBlocked();
			case MeasPackage.QUALITY61850__OLD_DATA:
				return isOldData();
			case MeasPackage.QUALITY61850__FAILURE:
				return isFailure();
			case MeasPackage.QUALITY61850__SOURCE:
				return getSource();
			case MeasPackage.QUALITY61850__OUT_OF_RANGE:
				return isOutOfRange();
			case MeasPackage.QUALITY61850__BAD_REFERENCE:
				return isBadReference();
			case MeasPackage.QUALITY61850__SUSPECT:
				return isSuspect();
			case MeasPackage.QUALITY61850__TEST:
				return isTest();
			case MeasPackage.QUALITY61850__OSCILLATORY:
				return isOscillatory();
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
			case MeasPackage.QUALITY61850__OVER_FLOW:
				setOverFlow((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__ESTIMATOR_REPLACED:
				setEstimatorReplaced((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__VALIDITY:
				setValidity((Validity)newValue);
				return;
			case MeasPackage.QUALITY61850__OPERATOR_BLOCKED:
				setOperatorBlocked((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__OLD_DATA:
				setOldData((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__FAILURE:
				setFailure((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__SOURCE:
				setSource((Source)newValue);
				return;
			case MeasPackage.QUALITY61850__OUT_OF_RANGE:
				setOutOfRange((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__BAD_REFERENCE:
				setBadReference((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__SUSPECT:
				setSuspect((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__TEST:
				setTest((Boolean)newValue);
				return;
			case MeasPackage.QUALITY61850__OSCILLATORY:
				setOscillatory((Boolean)newValue);
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
			case MeasPackage.QUALITY61850__OVER_FLOW:
				unsetOverFlow();
				return;
			case MeasPackage.QUALITY61850__ESTIMATOR_REPLACED:
				unsetEstimatorReplaced();
				return;
			case MeasPackage.QUALITY61850__VALIDITY:
				unsetValidity();
				return;
			case MeasPackage.QUALITY61850__OPERATOR_BLOCKED:
				unsetOperatorBlocked();
				return;
			case MeasPackage.QUALITY61850__OLD_DATA:
				unsetOldData();
				return;
			case MeasPackage.QUALITY61850__FAILURE:
				unsetFailure();
				return;
			case MeasPackage.QUALITY61850__SOURCE:
				unsetSource();
				return;
			case MeasPackage.QUALITY61850__OUT_OF_RANGE:
				unsetOutOfRange();
				return;
			case MeasPackage.QUALITY61850__BAD_REFERENCE:
				unsetBadReference();
				return;
			case MeasPackage.QUALITY61850__SUSPECT:
				unsetSuspect();
				return;
			case MeasPackage.QUALITY61850__TEST:
				unsetTest();
				return;
			case MeasPackage.QUALITY61850__OSCILLATORY:
				unsetOscillatory();
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
			case MeasPackage.QUALITY61850__OVER_FLOW:
				return isSetOverFlow();
			case MeasPackage.QUALITY61850__ESTIMATOR_REPLACED:
				return isSetEstimatorReplaced();
			case MeasPackage.QUALITY61850__VALIDITY:
				return isSetValidity();
			case MeasPackage.QUALITY61850__OPERATOR_BLOCKED:
				return isSetOperatorBlocked();
			case MeasPackage.QUALITY61850__OLD_DATA:
				return isSetOldData();
			case MeasPackage.QUALITY61850__FAILURE:
				return isSetFailure();
			case MeasPackage.QUALITY61850__SOURCE:
				return isSetSource();
			case MeasPackage.QUALITY61850__OUT_OF_RANGE:
				return isSetOutOfRange();
			case MeasPackage.QUALITY61850__BAD_REFERENCE:
				return isSetBadReference();
			case MeasPackage.QUALITY61850__SUSPECT:
				return isSetSuspect();
			case MeasPackage.QUALITY61850__TEST:
				return isSetTest();
			case MeasPackage.QUALITY61850__OSCILLATORY:
				return isSetOscillatory();
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
		result.append(" (overFlow: ");
		if (overFlowESet) result.append(overFlow); else result.append("<unset>");
		result.append(", estimatorReplaced: ");
		if (estimatorReplacedESet) result.append(estimatorReplaced); else result.append("<unset>");
		result.append(", validity: ");
		if (validityESet) result.append(validity); else result.append("<unset>");
		result.append(", operatorBlocked: ");
		if (operatorBlockedESet) result.append(operatorBlocked); else result.append("<unset>");
		result.append(", oldData: ");
		if (oldDataESet) result.append(oldData); else result.append("<unset>");
		result.append(", failure: ");
		if (failureESet) result.append(failure); else result.append("<unset>");
		result.append(", source: ");
		if (sourceESet) result.append(source); else result.append("<unset>");
		result.append(", outOfRange: ");
		if (outOfRangeESet) result.append(outOfRange); else result.append("<unset>");
		result.append(", badReference: ");
		if (badReferenceESet) result.append(badReference); else result.append("<unset>");
		result.append(", suspect: ");
		if (suspectESet) result.append(suspect); else result.append("<unset>");
		result.append(", test: ");
		if (testESet) result.append(test); else result.append("<unset>");
		result.append(", oscillatory: ");
		if (oscillatoryESet) result.append(oscillatory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Quality61850
