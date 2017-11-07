/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Wires.TransformerCoreAdmittance;
import CIM15.IEC61970.Wires.TransformerEnd;
import CIM15.IEC61970.Wires.TransformerMeshImpedance;
import CIM15.IEC61970.Wires.WindingConnection;
import CIM15.IEC61970.Wires.WiresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer End Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getFromMeshImpedance <em>From Mesh Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndNoLoadTest <em>Energised End No Load Test</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getOpenEndOpenCircuitTests <em>Open End Open Circuit Tests</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getInsulationU <em>Insulation U</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getToMeshImpedance <em>To Mesh Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndOpenCircuitTests <em>Energised End Open Circuit Tests</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getGroundedEndShortCircuitTests <em>Grounded End Short Circuit Tests</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getShortTermS <em>Short Term S</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndShortCircuitTests <em>Energised End Short Circuit Tests</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getCoreAdmittance <em>Core Admittance</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEndNumber <em>End Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerEndInfo extends AssetInfo {
	/**
	 * The cached value of the '{@link #getFromMeshImpedance() <em>From Mesh Impedance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromMeshImpedance()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerMeshImpedance> fromMeshImpedance;

	/**
	 * The cached value of the '{@link #getEnergisedEndNoLoadTest() <em>Energised End No Load Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergisedEndNoLoadTest()
	 * @generated
	 * @ordered
	 */
	protected EList<NoLoadTest> energisedEndNoLoadTest;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * This is true if the R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rESet;

	/**
	 * The cached value of the '{@link #getOpenEndOpenCircuitTests() <em>Open End Open Circuit Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenEndOpenCircuitTests()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenCircuitTest> openEndOpenCircuitTests;

	/**
	 * The default value of the '{@link #getInsulationU() <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationU()
	 * @generated
	 * @ordered
	 */
	protected static final float INSULATION_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInsulationU() <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationU()
	 * @generated
	 * @ordered
	 */
	protected float insulationU = INSULATION_U_EDEFAULT;

	/**
	 * This is true if the Insulation U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulationUESet;

	/**
	 * The default value of the '{@link #getEmergencyS() <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyS()
	 * @generated
	 * @ordered
	 */
	protected static final float EMERGENCY_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEmergencyS() <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyS()
	 * @generated
	 * @ordered
	 */
	protected float emergencyS = EMERGENCY_S_EDEFAULT;

	/**
	 * This is true if the Emergency S attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emergencySESet;

	/**
	 * The cached value of the '{@link #getToMeshImpedance() <em>To Mesh Impedance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMeshImpedance()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerMeshImpedance> toMeshImpedance;

	/**
	 * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerEnd> transformerEnd;

	/**
	 * The cached value of the '{@link #getTransformerTankInfo() <em>Transformer Tank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerTankInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerTankInfo transformerTankInfo;

	/**
	 * The cached value of the '{@link #getEnergisedEndOpenCircuitTests() <em>Energised End Open Circuit Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergisedEndOpenCircuitTests()
	 * @generated
	 * @ordered
	 */
	protected EList<OpenCircuitTest> energisedEndOpenCircuitTests;

	/**
	 * The cached value of the '{@link #getGroundedEndShortCircuitTests() <em>Grounded End Short Circuit Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundedEndShortCircuitTests()
	 * @generated
	 * @ordered
	 */
	protected EList<ShortCircuitTest> groundedEndShortCircuitTests;

	/**
	 * The default value of the '{@link #getShortTermS() <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTermS()
	 * @generated
	 * @ordered
	 */
	protected static final float SHORT_TERM_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShortTermS() <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortTermS()
	 * @generated
	 * @ordered
	 */
	protected float shortTermS = SHORT_TERM_S_EDEFAULT;

	/**
	 * This is true if the Short Term S attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shortTermSESet;

	/**
	 * The cached value of the '{@link #getEnergisedEndShortCircuitTests() <em>Energised End Short Circuit Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergisedEndShortCircuitTests()
	 * @generated
	 * @ordered
	 */
	protected EList<ShortCircuitTest> energisedEndShortCircuitTests;

	/**
	 * The default value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected static final WindingConnection CONNECTION_KIND_EDEFAULT = WindingConnection.Z;

	/**
	 * The cached value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected WindingConnection connectionKind = CONNECTION_KIND_EDEFAULT;

	/**
	 * This is true if the Connection Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionKindESet;

	/**
	 * The cached value of the '{@link #getCoreAdmittance() <em>Core Admittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreAdmittance()
	 * @generated
	 * @ordered
	 */
	protected TransformerCoreAdmittance coreAdmittance;

	/**
	 * The default value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int END_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndNumber()
	 * @generated
	 * @ordered
	 */
	protected int endNumber = END_NUMBER_EDEFAULT;

	/**
	 * This is true if the End Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endNumberESet;

	/**
	 * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected float ratedS = RATED_S_EDEFAULT;

	/**
	 * This is true if the Rated S attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedSESet;

	/**
	 * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected float ratedU = RATED_U_EDEFAULT;

	/**
	 * This is true if the Rated U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedUESet;

	/**
	 * The default value of the '{@link #getPhaseAngleClock() <em>Phase Angle Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseAngleClock()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_ANGLE_CLOCK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseAngleClock() <em>Phase Angle Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseAngleClock()
	 * @generated
	 * @ordered
	 */
	protected int phaseAngleClock = PHASE_ANGLE_CLOCK_EDEFAULT;

	/**
	 * This is true if the Phase Angle Clock attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseAngleClockESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerEndInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.TRANSFORMER_END_INFO;
	}

	/**
	 * Returns the value of the '<em><b>From Mesh Impedance</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerMeshImpedance}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Mesh Impedance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Mesh Impedance</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEndInfo
	 * @generated
	 */
	public EList<TransformerMeshImpedance> getFromMeshImpedance() {
		if (fromMeshImpedance == null) {
			fromMeshImpedance = new BasicInternalEList<TransformerMeshImpedance>(TransformerMeshImpedance.class);
		}
		return fromMeshImpedance;
	}

	/**
	 * Returns the value of the '<em><b>Energised End No Load Test</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.NoLoadTest}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEnd <em>Energised End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energised End No Load Test</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energised End No Load Test</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEnd
	 * @generated
	 */
	public EList<NoLoadTest> getEnergisedEndNoLoadTest() {
		if (energisedEndNoLoadTest == null) {
			energisedEndNoLoadTest = new BasicInternalEList<NoLoadTest>(NoLoadTest.class);
		}
		return energisedEndNoLoadTest;
	}

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #setR(float)
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #getR()
	 * @generated
	 */
	public void setR(float newR) {
		r = newR;
		rESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public void unsetR() {
		r = R_EDEFAULT;
		rESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getR <em>R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R</em>' attribute is set.
	 * @see #unsetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public boolean isSetR() {
		return rESet;
	}

	/**
	 * Returns the value of the '<em><b>Open End Open Circuit Tests</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.OpenCircuitTest}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEnd <em>Open End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open End Open Circuit Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open End Open Circuit Tests</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEnd
	 * @generated
	 */
	public EList<OpenCircuitTest> getOpenEndOpenCircuitTests() {
		if (openEndOpenCircuitTests == null) {
			openEndOpenCircuitTests = new BasicInternalEList<OpenCircuitTest>(OpenCircuitTest.class);
		}
		return openEndOpenCircuitTests;
	}

	/**
	 * Returns the value of the '<em><b>Insulation U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation U</em>' attribute.
	 * @see #isSetInsulationU()
	 * @see #unsetInsulationU()
	 * @see #setInsulationU(float)
	 * @generated
	 */
	public float getInsulationU() {
		return insulationU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getInsulationU <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation U</em>' attribute.
	 * @see #isSetInsulationU()
	 * @see #unsetInsulationU()
	 * @see #getInsulationU()
	 * @generated
	 */
	public void setInsulationU(float newInsulationU) {
		insulationU = newInsulationU;
		insulationUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getInsulationU <em>Insulation U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulationU()
	 * @see #getInsulationU()
	 * @see #setInsulationU(float)
	 * @generated
	 */
	public void unsetInsulationU() {
		insulationU = INSULATION_U_EDEFAULT;
		insulationUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getInsulationU <em>Insulation U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulation U</em>' attribute is set.
	 * @see #unsetInsulationU()
	 * @see #getInsulationU()
	 * @see #setInsulationU(float)
	 * @generated
	 */
	public boolean isSetInsulationU() {
		return insulationUESet;
	}

	/**
	 * Returns the value of the '<em><b>Emergency S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emergency S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency S</em>' attribute.
	 * @see #isSetEmergencyS()
	 * @see #unsetEmergencyS()
	 * @see #setEmergencyS(float)
	 * @generated
	 */
	public float getEmergencyS() {
		return emergencyS;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency S</em>' attribute.
	 * @see #isSetEmergencyS()
	 * @see #unsetEmergencyS()
	 * @see #getEmergencyS()
	 * @generated
	 */
	public void setEmergencyS(float newEmergencyS) {
		emergencyS = newEmergencyS;
		emergencySESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmergencyS()
	 * @see #getEmergencyS()
	 * @see #setEmergencyS(float)
	 * @generated
	 */
	public void unsetEmergencyS() {
		emergencyS = EMERGENCY_S_EDEFAULT;
		emergencySESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Emergency S</em>' attribute is set.
	 * @see #unsetEmergencyS()
	 * @see #getEmergencyS()
	 * @see #setEmergencyS(float)
	 * @generated
	 */
	public boolean isSetEmergencyS() {
		return emergencySESet;
	}

	/**
	 * Returns the value of the '<em><b>To Mesh Impedance</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerMeshImpedance}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEndInfo <em>To Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Mesh Impedance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Mesh Impedance</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEndInfo
	 * @generated
	 */
	public EList<TransformerMeshImpedance> getToMeshImpedance() {
		if (toMeshImpedance == null) {
			toMeshImpedance = new BasicInternalEList<TransformerMeshImpedance>(TransformerMeshImpedance.class);
		}
		return toMeshImpedance;
	}

	/**
	 * Returns the value of the '<em><b>Transformer End</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerEnd}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getTransformerEndInfo <em>Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getTransformerEndInfo
	 * @generated
	 */
	public EList<TransformerEnd> getTransformerEnd() {
		if (transformerEnd == null) {
			transformerEnd = new BasicInternalEList<TransformerEnd>(TransformerEnd.class);
		}
		return transformerEnd;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Tank Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerEndInfos <em>Transformer End Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Tank Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Tank Info</em>' reference.
	 * @see #setTransformerTankInfo(TransformerTankInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerEndInfos
	 * @generated
	 */
	public TransformerTankInfo getTransformerTankInfo() {
		if (transformerTankInfo != null && transformerTankInfo.eIsProxy()) {
			InternalEObject oldTransformerTankInfo = (InternalEObject)transformerTankInfo;
			transformerTankInfo = (TransformerTankInfo)eResolveProxy(oldTransformerTankInfo);
			if (transformerTankInfo != oldTransformerTankInfo) {
			}
		}
		return transformerTankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTankInfo basicGetTransformerTankInfo() {
		return transformerTankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerTankInfo(TransformerTankInfo newTransformerTankInfo, NotificationChain msgs) {
		TransformerTankInfo oldTransformerTankInfo = transformerTankInfo;
		transformerTankInfo = newTransformerTankInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Tank Info</em>' reference.
	 * @see #getTransformerTankInfo()
	 * @generated
	 */
	public void setTransformerTankInfo(TransformerTankInfo newTransformerTankInfo) {
		if (newTransformerTankInfo != transformerTankInfo) {
			NotificationChain msgs = null;
			if (transformerTankInfo != null)
				msgs = ((InternalEObject)transformerTankInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS, TransformerTankInfo.class, msgs);
			if (newTransformerTankInfo != null)
				msgs = ((InternalEObject)newTransformerTankInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS, TransformerTankInfo.class, msgs);
			msgs = basicSetTransformerTankInfo(newTransformerTankInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Energised End Open Circuit Tests</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.OpenCircuitTest}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energised End Open Circuit Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energised End Open Circuit Tests</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEnd
	 * @generated
	 */
	public EList<OpenCircuitTest> getEnergisedEndOpenCircuitTests() {
		if (energisedEndOpenCircuitTests == null) {
			energisedEndOpenCircuitTests = new BasicInternalEList<OpenCircuitTest>(OpenCircuitTest.class);
		}
		return energisedEndOpenCircuitTests;
	}

	/**
	 * Returns the value of the '<em><b>Grounded End Short Circuit Tests</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.ShortCircuitTest}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEnds <em>Grounded Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded End Short Circuit Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded End Short Circuit Tests</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEnds
	 * @generated
	 */
	public EList<ShortCircuitTest> getGroundedEndShortCircuitTests() {
		if (groundedEndShortCircuitTests == null) {
			groundedEndShortCircuitTests = new BasicInternalEList<ShortCircuitTest>(ShortCircuitTest.class);
		}
		return groundedEndShortCircuitTests;
	}

	/**
	 * Returns the value of the '<em><b>Short Term S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Term S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Term S</em>' attribute.
	 * @see #isSetShortTermS()
	 * @see #unsetShortTermS()
	 * @see #setShortTermS(float)
	 * @generated
	 */
	public float getShortTermS() {
		return shortTermS;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getShortTermS <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Term S</em>' attribute.
	 * @see #isSetShortTermS()
	 * @see #unsetShortTermS()
	 * @see #getShortTermS()
	 * @generated
	 */
	public void setShortTermS(float newShortTermS) {
		shortTermS = newShortTermS;
		shortTermSESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getShortTermS <em>Short Term S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShortTermS()
	 * @see #getShortTermS()
	 * @see #setShortTermS(float)
	 * @generated
	 */
	public void unsetShortTermS() {
		shortTermS = SHORT_TERM_S_EDEFAULT;
		shortTermSESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getShortTermS <em>Short Term S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Short Term S</em>' attribute is set.
	 * @see #unsetShortTermS()
	 * @see #getShortTermS()
	 * @see #setShortTermS(float)
	 * @generated
	 */
	public boolean isSetShortTermS() {
		return shortTermSESet;
	}

	/**
	 * Returns the value of the '<em><b>Energised End Short Circuit Tests</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.ShortCircuitTest}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energised End Short Circuit Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energised End Short Circuit Tests</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEnd
	 * @generated
	 */
	public EList<ShortCircuitTest> getEnergisedEndShortCircuitTests() {
		if (energisedEndShortCircuitTests == null) {
			energisedEndShortCircuitTests = new BasicInternalEList<ShortCircuitTest>(ShortCircuitTest.class);
		}
		return energisedEndShortCircuitTests;
	}

	/**
	 * Returns the value of the '<em><b>Connection Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Wires.WindingConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Kind</em>' attribute.
	 * @see CIM15.IEC61970.Wires.WindingConnection
	 * @see #isSetConnectionKind()
	 * @see #unsetConnectionKind()
	 * @see #setConnectionKind(WindingConnection)
	 * @generated
	 */
	public WindingConnection getConnectionKind() {
		return connectionKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Kind</em>' attribute.
	 * @see CIM15.IEC61970.Wires.WindingConnection
	 * @see #isSetConnectionKind()
	 * @see #unsetConnectionKind()
	 * @see #getConnectionKind()
	 * @generated
	 */
	public void setConnectionKind(WindingConnection newConnectionKind) {
		connectionKind = newConnectionKind == null ? CONNECTION_KIND_EDEFAULT : newConnectionKind;
		connectionKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionKind()
	 * @see #getConnectionKind()
	 * @see #setConnectionKind(WindingConnection)
	 * @generated
	 */
	public void unsetConnectionKind() {
		connectionKind = CONNECTION_KIND_EDEFAULT;
		connectionKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Kind</em>' attribute is set.
	 * @see #unsetConnectionKind()
	 * @see #getConnectionKind()
	 * @see #setConnectionKind(WindingConnection)
	 * @generated
	 */
	public boolean isSetConnectionKind() {
		return connectionKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Core Admittance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEndInfo <em>Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Admittance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Admittance</em>' reference.
	 * @see #setCoreAdmittance(TransformerCoreAdmittance)
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEndInfo
	 * @generated
	 */
	public TransformerCoreAdmittance getCoreAdmittance() {
		if (coreAdmittance != null && coreAdmittance.eIsProxy()) {
			InternalEObject oldCoreAdmittance = (InternalEObject)coreAdmittance;
			coreAdmittance = (TransformerCoreAdmittance)eResolveProxy(oldCoreAdmittance);
			if (coreAdmittance != oldCoreAdmittance) {
			}
		}
		return coreAdmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerCoreAdmittance basicGetCoreAdmittance() {
		return coreAdmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreAdmittance(TransformerCoreAdmittance newCoreAdmittance, NotificationChain msgs) {
		TransformerCoreAdmittance oldCoreAdmittance = coreAdmittance;
		coreAdmittance = newCoreAdmittance;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getCoreAdmittance <em>Core Admittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Admittance</em>' reference.
	 * @see #getCoreAdmittance()
	 * @generated
	 */
	public void setCoreAdmittance(TransformerCoreAdmittance newCoreAdmittance) {
		if (newCoreAdmittance != coreAdmittance) {
			NotificationChain msgs = null;
			if (coreAdmittance != null)
				msgs = ((InternalEObject)coreAdmittance).eInverseRemove(this, WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, TransformerCoreAdmittance.class, msgs);
			if (newCoreAdmittance != null)
				msgs = ((InternalEObject)newCoreAdmittance).eInverseAdd(this, WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, TransformerCoreAdmittance.class, msgs);
			msgs = basicSetCoreAdmittance(newCoreAdmittance, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>End Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Number</em>' attribute.
	 * @see #isSetEndNumber()
	 * @see #unsetEndNumber()
	 * @see #setEndNumber(int)
	 * @generated
	 */
	public int getEndNumber() {
		return endNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEndNumber <em>End Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Number</em>' attribute.
	 * @see #isSetEndNumber()
	 * @see #unsetEndNumber()
	 * @see #getEndNumber()
	 * @generated
	 */
	public void setEndNumber(int newEndNumber) {
		endNumber = newEndNumber;
		endNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEndNumber <em>End Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndNumber()
	 * @see #getEndNumber()
	 * @see #setEndNumber(int)
	 * @generated
	 */
	public void unsetEndNumber() {
		endNumber = END_NUMBER_EDEFAULT;
		endNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEndNumber <em>End Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Number</em>' attribute is set.
	 * @see #unsetEndNumber()
	 * @see #getEndNumber()
	 * @see #setEndNumber(int)
	 * @generated
	 */
	public boolean isSetEndNumber() {
		return endNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated S</em>' attribute.
	 * @see #isSetRatedS()
	 * @see #unsetRatedS()
	 * @see #setRatedS(float)
	 * @generated
	 */
	public float getRatedS() {
		return ratedS;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedS <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated S</em>' attribute.
	 * @see #isSetRatedS()
	 * @see #unsetRatedS()
	 * @see #getRatedS()
	 * @generated
	 */
	public void setRatedS(float newRatedS) {
		ratedS = newRatedS;
		ratedSESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedS <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedS()
	 * @see #getRatedS()
	 * @see #setRatedS(float)
	 * @generated
	 */
	public void unsetRatedS() {
		ratedS = RATED_S_EDEFAULT;
		ratedSESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedS <em>Rated S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated S</em>' attribute is set.
	 * @see #unsetRatedS()
	 * @see #getRatedS()
	 * @see #setRatedS(float)
	 * @generated
	 */
	public boolean isSetRatedS() {
		return ratedSESet;
	}

	/**
	 * Returns the value of the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated U</em>' attribute.
	 * @see #isSetRatedU()
	 * @see #unsetRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public float getRatedU() {
		return ratedU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated U</em>' attribute.
	 * @see #isSetRatedU()
	 * @see #unsetRatedU()
	 * @see #getRatedU()
	 * @generated
	 */
	public void setRatedU(float newRatedU) {
		ratedU = newRatedU;
		ratedUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedU()
	 * @see #getRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public void unsetRatedU() {
		ratedU = RATED_U_EDEFAULT;
		ratedUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedU <em>Rated U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated U</em>' attribute is set.
	 * @see #unsetRatedU()
	 * @see #getRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public boolean isSetRatedU() {
		return ratedUESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Angle Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Angle Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Angle Clock</em>' attribute.
	 * @see #isSetPhaseAngleClock()
	 * @see #unsetPhaseAngleClock()
	 * @see #setPhaseAngleClock(int)
	 * @generated
	 */
	public int getPhaseAngleClock() {
		return phaseAngleClock;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Angle Clock</em>' attribute.
	 * @see #isSetPhaseAngleClock()
	 * @see #unsetPhaseAngleClock()
	 * @see #getPhaseAngleClock()
	 * @generated
	 */
	public void setPhaseAngleClock(int newPhaseAngleClock) {
		phaseAngleClock = newPhaseAngleClock;
		phaseAngleClockESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseAngleClock()
	 * @see #getPhaseAngleClock()
	 * @see #setPhaseAngleClock(int)
	 * @generated
	 */
	public void unsetPhaseAngleClock() {
		phaseAngleClock = PHASE_ANGLE_CLOCK_EDEFAULT;
		phaseAngleClockESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Angle Clock</em>' attribute is set.
	 * @see #unsetPhaseAngleClock()
	 * @see #getPhaseAngleClock()
	 * @see #setPhaseAngleClock(int)
	 * @generated
	 */
	public boolean isSetPhaseAngleClock() {
		return phaseAngleClockESet;
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
			case AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromMeshImpedance()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergisedEndNoLoadTest()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOpenEndOpenCircuitTests()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToMeshImpedance()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerEnd()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
				if (transformerTankInfo != null)
					msgs = ((InternalEObject)transformerTankInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS, TransformerTankInfo.class, msgs);
				return basicSetTransformerTankInfo((TransformerTankInfo)otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergisedEndOpenCircuitTests()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroundedEndShortCircuitTests()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnergisedEndShortCircuitTests()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
				if (coreAdmittance != null)
					msgs = ((InternalEObject)coreAdmittance).eInverseRemove(this, WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, TransformerCoreAdmittance.class, msgs);
				return basicSetCoreAdmittance((TransformerCoreAdmittance)otherEnd, msgs);
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
			case AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE:
				return ((InternalEList<?>)getFromMeshImpedance()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST:
				return ((InternalEList<?>)getEnergisedEndNoLoadTest()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
				return ((InternalEList<?>)getOpenEndOpenCircuitTests()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCE:
				return ((InternalEList<?>)getToMeshImpedance()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END:
				return ((InternalEList<?>)getTransformerEnd()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
				return basicSetTransformerTankInfo(null, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
				return ((InternalEList<?>)getEnergisedEndOpenCircuitTests()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
				return ((InternalEList<?>)getGroundedEndShortCircuitTests()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
				return ((InternalEList<?>)getEnergisedEndShortCircuitTests()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
				return basicSetCoreAdmittance(null, msgs);
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
			case AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE:
				return getFromMeshImpedance();
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST:
				return getEnergisedEndNoLoadTest();
			case AssetModelsPackage.TRANSFORMER_END_INFO__R:
				return getR();
			case AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
				return getOpenEndOpenCircuitTests();
			case AssetModelsPackage.TRANSFORMER_END_INFO__INSULATION_U:
				return getInsulationU();
			case AssetModelsPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
				return getEmergencyS();
			case AssetModelsPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCE:
				return getToMeshImpedance();
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END:
				return getTransformerEnd();
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
				if (resolve) return getTransformerTankInfo();
				return basicGetTransformerTankInfo();
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
				return getEnergisedEndOpenCircuitTests();
			case AssetModelsPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
				return getGroundedEndShortCircuitTests();
			case AssetModelsPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
				return getShortTermS();
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
				return getEnergisedEndShortCircuitTests();
			case AssetModelsPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
				return getConnectionKind();
			case AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
				if (resolve) return getCoreAdmittance();
				return basicGetCoreAdmittance();
			case AssetModelsPackage.TRANSFORMER_END_INFO__END_NUMBER:
				return getEndNumber();
			case AssetModelsPackage.TRANSFORMER_END_INFO__RATED_S:
				return getRatedS();
			case AssetModelsPackage.TRANSFORMER_END_INFO__RATED_U:
				return getRatedU();
			case AssetModelsPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
				return getPhaseAngleClock();
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
			case AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE:
				getFromMeshImpedance().clear();
				getFromMeshImpedance().addAll((Collection<? extends TransformerMeshImpedance>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST:
				getEnergisedEndNoLoadTest().clear();
				getEnergisedEndNoLoadTest().addAll((Collection<? extends NoLoadTest>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__R:
				setR((Float)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
				getOpenEndOpenCircuitTests().clear();
				getOpenEndOpenCircuitTests().addAll((Collection<? extends OpenCircuitTest>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__INSULATION_U:
				setInsulationU((Float)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
				setEmergencyS((Float)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCE:
				getToMeshImpedance().clear();
				getToMeshImpedance().addAll((Collection<? extends TransformerMeshImpedance>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END:
				getTransformerEnd().clear();
				getTransformerEnd().addAll((Collection<? extends TransformerEnd>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
				setTransformerTankInfo((TransformerTankInfo)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
				getEnergisedEndOpenCircuitTests().clear();
				getEnergisedEndOpenCircuitTests().addAll((Collection<? extends OpenCircuitTest>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
				getGroundedEndShortCircuitTests().clear();
				getGroundedEndShortCircuitTests().addAll((Collection<? extends ShortCircuitTest>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
				setShortTermS((Float)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
				getEnergisedEndShortCircuitTests().clear();
				getEnergisedEndShortCircuitTests().addAll((Collection<? extends ShortCircuitTest>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
				setConnectionKind((WindingConnection)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
				setCoreAdmittance((TransformerCoreAdmittance)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__END_NUMBER:
				setEndNumber((Integer)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__RATED_S:
				setRatedS((Float)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__RATED_U:
				setRatedU((Float)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
				setPhaseAngleClock((Integer)newValue);
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
			case AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE:
				getFromMeshImpedance().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST:
				getEnergisedEndNoLoadTest().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__R:
				unsetR();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
				getOpenEndOpenCircuitTests().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__INSULATION_U:
				unsetInsulationU();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
				unsetEmergencyS();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCE:
				getToMeshImpedance().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END:
				getTransformerEnd().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
				setTransformerTankInfo((TransformerTankInfo)null);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
				getEnergisedEndOpenCircuitTests().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
				getGroundedEndShortCircuitTests().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
				unsetShortTermS();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
				getEnergisedEndShortCircuitTests().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
				unsetConnectionKind();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
				setCoreAdmittance((TransformerCoreAdmittance)null);
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__END_NUMBER:
				unsetEndNumber();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__RATED_S:
				unsetRatedS();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__RATED_U:
				unsetRatedU();
				return;
			case AssetModelsPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
				unsetPhaseAngleClock();
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
			case AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE:
				return fromMeshImpedance != null && !fromMeshImpedance.isEmpty();
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST:
				return energisedEndNoLoadTest != null && !energisedEndNoLoadTest.isEmpty();
			case AssetModelsPackage.TRANSFORMER_END_INFO__R:
				return isSetR();
			case AssetModelsPackage.TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS:
				return openEndOpenCircuitTests != null && !openEndOpenCircuitTests.isEmpty();
			case AssetModelsPackage.TRANSFORMER_END_INFO__INSULATION_U:
				return isSetInsulationU();
			case AssetModelsPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
				return isSetEmergencyS();
			case AssetModelsPackage.TRANSFORMER_END_INFO__TO_MESH_IMPEDANCE:
				return toMeshImpedance != null && !toMeshImpedance.isEmpty();
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END:
				return transformerEnd != null && !transformerEnd.isEmpty();
			case AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO:
				return transformerTankInfo != null;
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS:
				return energisedEndOpenCircuitTests != null && !energisedEndOpenCircuitTests.isEmpty();
			case AssetModelsPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS:
				return groundedEndShortCircuitTests != null && !groundedEndShortCircuitTests.isEmpty();
			case AssetModelsPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
				return isSetShortTermS();
			case AssetModelsPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS:
				return energisedEndShortCircuitTests != null && !energisedEndShortCircuitTests.isEmpty();
			case AssetModelsPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
				return isSetConnectionKind();
			case AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE:
				return coreAdmittance != null;
			case AssetModelsPackage.TRANSFORMER_END_INFO__END_NUMBER:
				return isSetEndNumber();
			case AssetModelsPackage.TRANSFORMER_END_INFO__RATED_S:
				return isSetRatedS();
			case AssetModelsPackage.TRANSFORMER_END_INFO__RATED_U:
				return isSetRatedU();
			case AssetModelsPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
				return isSetPhaseAngleClock();
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
		result.append(" (r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", insulationU: ");
		if (insulationUESet) result.append(insulationU); else result.append("<unset>");
		result.append(", emergencyS: ");
		if (emergencySESet) result.append(emergencyS); else result.append("<unset>");
		result.append(", shortTermS: ");
		if (shortTermSESet) result.append(shortTermS); else result.append("<unset>");
		result.append(", connectionKind: ");
		if (connectionKindESet) result.append(connectionKind); else result.append("<unset>");
		result.append(", endNumber: ");
		if (endNumberESet) result.append(endNumber); else result.append("<unset>");
		result.append(", ratedS: ");
		if (ratedSESet) result.append(ratedS); else result.append("<unset>");
		result.append(", ratedU: ");
		if (ratedUESet) result.append(ratedU); else result.append("<unset>");
		result.append(", phaseAngleClock: ");
		if (phaseAngleClockESet) result.append(phaseAngleClock); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerEndInfo
