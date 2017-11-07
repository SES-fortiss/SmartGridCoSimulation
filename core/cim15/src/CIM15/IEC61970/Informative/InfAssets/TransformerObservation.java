/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Wires.TransformerTank;
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
 * A representation of the model object '<em><b>Transformer Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs <em>Bushing Insultation PFs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent <em>Water Content</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel <em>Oil Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp <em>Freq Resp</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength <em>Oil Dielectric Strength</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor <em>Oil Color</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp <em>Hot Spot Temp</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getDga <em>Dga</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP <em>Furfural DP</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT <em>Oil IFT</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs <em>Winding Insulation PFs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset <em>Transformer Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp <em>Bushing Temp</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp <em>Top Oil Temp</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration <em>Pump Vibration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerObservation extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getBushingInsultationPFs() <em>Bushing Insultation PFs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingInsultationPFs()
	 * @generated
	 * @ordered
	 */
	protected EList<BushingInsulationPF> bushingInsultationPFs;

	/**
	 * The default value of the '{@link #getOilNeutralizationNumber() <em>Oil Neutralization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilNeutralizationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String OIL_NEUTRALIZATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilNeutralizationNumber() <em>Oil Neutralization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilNeutralizationNumber()
	 * @generated
	 * @ordered
	 */
	protected String oilNeutralizationNumber = OIL_NEUTRALIZATION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Oil Neutralization Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oilNeutralizationNumberESet;

	/**
	 * The default value of the '{@link #getWaterContent() <em>Water Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterContent()
	 * @generated
	 * @ordered
	 */
	protected static final String WATER_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaterContent() <em>Water Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterContent()
	 * @generated
	 * @ordered
	 */
	protected String waterContent = WATER_CONTENT_EDEFAULT;

	/**
	 * This is true if the Water Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waterContentESet;

	/**
	 * The default value of the '{@link #getOilLevel() <em>Oil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String OIL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilLevel() <em>Oil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilLevel()
	 * @generated
	 * @ordered
	 */
	protected String oilLevel = OIL_LEVEL_EDEFAULT;

	/**
	 * This is true if the Oil Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oilLevelESet;

	/**
	 * The default value of the '{@link #getFreqResp() <em>Freq Resp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqResp()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQ_RESP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreqResp() <em>Freq Resp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqResp()
	 * @generated
	 * @ordered
	 */
	protected String freqResp = FREQ_RESP_EDEFAULT;

	/**
	 * This is true if the Freq Resp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freqRespESet;

	/**
	 * The default value of the '{@link #getOilDielectricStrength() <em>Oil Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilDielectricStrength()
	 * @generated
	 * @ordered
	 */
	protected static final float OIL_DIELECTRIC_STRENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOilDielectricStrength() <em>Oil Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilDielectricStrength()
	 * @generated
	 * @ordered
	 */
	protected float oilDielectricStrength = OIL_DIELECTRIC_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Oil Dielectric Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oilDielectricStrengthESet;

	/**
	 * The default value of the '{@link #getOilColor() <em>Oil Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilColor()
	 * @generated
	 * @ordered
	 */
	protected static final String OIL_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilColor() <em>Oil Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilColor()
	 * @generated
	 * @ordered
	 */
	protected String oilColor = OIL_COLOR_EDEFAULT;

	/**
	 * This is true if the Oil Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oilColorESet;

	/**
	 * The default value of the '{@link #getHotSpotTemp() <em>Hot Spot Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSpotTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float HOT_SPOT_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHotSpotTemp() <em>Hot Spot Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSpotTemp()
	 * @generated
	 * @ordered
	 */
	protected float hotSpotTemp = HOT_SPOT_TEMP_EDEFAULT;

	/**
	 * This is true if the Hot Spot Temp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hotSpotTempESet;

	/**
	 * The default value of the '{@link #getDga() <em>Dga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDga()
	 * @generated
	 * @ordered
	 */
	protected static final String DGA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDga() <em>Dga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDga()
	 * @generated
	 * @ordered
	 */
	protected String dga = DGA_EDEFAULT;

	/**
	 * This is true if the Dga attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dgaESet;

	/**
	 * The default value of the '{@link #getFurfuralDP() <em>Furfural DP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurfuralDP()
	 * @generated
	 * @ordered
	 */
	protected static final String FURFURAL_DP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFurfuralDP() <em>Furfural DP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurfuralDP()
	 * @generated
	 * @ordered
	 */
	protected String furfuralDP = FURFURAL_DP_EDEFAULT;

	/**
	 * This is true if the Furfural DP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean furfuralDPESet;

	/**
	 * The default value of the '{@link #getOilIFT() <em>Oil IFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilIFT()
	 * @generated
	 * @ordered
	 */
	protected static final String OIL_IFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilIFT() <em>Oil IFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilIFT()
	 * @generated
	 * @ordered
	 */
	protected String oilIFT = OIL_IFT_EDEFAULT;

	/**
	 * This is true if the Oil IFT attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oilIFTESet;

	/**
	 * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureDataSet> procedureDataSets;

	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected TransformerTank transformer;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getWindingInsulationPFs() <em>Winding Insulation PFs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInsulationPFs()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInsulation> windingInsulationPFs;

	/**
	 * The cached value of the '{@link #getTransformerAsset() <em>Transformer Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAsset()
	 * @generated
	 * @ordered
	 */
	protected TransformerAsset transformerAsset;

	/**
	 * The default value of the '{@link #getBushingTemp() <em>Bushing Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float BUSHING_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBushingTemp() <em>Bushing Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingTemp()
	 * @generated
	 * @ordered
	 */
	protected float bushingTemp = BUSHING_TEMP_EDEFAULT;

	/**
	 * This is true if the Bushing Temp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bushingTempESet;

	/**
	 * The default value of the '{@link #getTopOilTemp() <em>Top Oil Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopOilTemp()
	 * @generated
	 * @ordered
	 */
	protected static final float TOP_OIL_TEMP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTopOilTemp() <em>Top Oil Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopOilTemp()
	 * @generated
	 * @ordered
	 */
	protected float topOilTemp = TOP_OIL_TEMP_EDEFAULT;

	/**
	 * This is true if the Top Oil Temp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topOilTempESet;

	/**
	 * The default value of the '{@link #getPumpVibration() <em>Pump Vibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpVibration()
	 * @generated
	 * @ordered
	 */
	protected static final String PUMP_VIBRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPumpVibration() <em>Pump Vibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpVibration()
	 * @generated
	 * @ordered
	 */
	protected String pumpVibration = PUMP_VIBRATION_EDEFAULT;

	/**
	 * This is true if the Pump Vibration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pumpVibrationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerObservation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTransformerObservation();
	}

	/**
	 * Returns the value of the '<em><b>Bushing Insultation PFs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Insultation PFs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Insultation PFs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation
	 * @generated
	 */
	public EList<BushingInsulationPF> getBushingInsultationPFs() {
		if (bushingInsultationPFs == null) {
			bushingInsultationPFs = new BasicInternalEList<BushingInsulationPF>(BushingInsulationPF.class);
		}
		return bushingInsultationPFs;
	}

	/**
	 * Returns the value of the '<em><b>Oil Neutralization Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Neutralization Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Neutralization Number</em>' attribute.
	 * @see #isSetOilNeutralizationNumber()
	 * @see #unsetOilNeutralizationNumber()
	 * @see #setOilNeutralizationNumber(String)
	 * @generated
	 */
	public String getOilNeutralizationNumber() {
		return oilNeutralizationNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Neutralization Number</em>' attribute.
	 * @see #isSetOilNeutralizationNumber()
	 * @see #unsetOilNeutralizationNumber()
	 * @see #getOilNeutralizationNumber()
	 * @generated
	 */
	public void setOilNeutralizationNumber(String newOilNeutralizationNumber) {
		oilNeutralizationNumber = newOilNeutralizationNumber;
		oilNeutralizationNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOilNeutralizationNumber()
	 * @see #getOilNeutralizationNumber()
	 * @see #setOilNeutralizationNumber(String)
	 * @generated
	 */
	public void unsetOilNeutralizationNumber() {
		oilNeutralizationNumber = OIL_NEUTRALIZATION_NUMBER_EDEFAULT;
		oilNeutralizationNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Oil Neutralization Number</em>' attribute is set.
	 * @see #unsetOilNeutralizationNumber()
	 * @see #getOilNeutralizationNumber()
	 * @see #setOilNeutralizationNumber(String)
	 * @generated
	 */
	public boolean isSetOilNeutralizationNumber() {
		return oilNeutralizationNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Water Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Content</em>' attribute.
	 * @see #isSetWaterContent()
	 * @see #unsetWaterContent()
	 * @see #setWaterContent(String)
	 * @generated
	 */
	public String getWaterContent() {
		return waterContent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent <em>Water Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Content</em>' attribute.
	 * @see #isSetWaterContent()
	 * @see #unsetWaterContent()
	 * @see #getWaterContent()
	 * @generated
	 */
	public void setWaterContent(String newWaterContent) {
		waterContent = newWaterContent;
		waterContentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent <em>Water Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWaterContent()
	 * @see #getWaterContent()
	 * @see #setWaterContent(String)
	 * @generated
	 */
	public void unsetWaterContent() {
		waterContent = WATER_CONTENT_EDEFAULT;
		waterContentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent <em>Water Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Water Content</em>' attribute is set.
	 * @see #unsetWaterContent()
	 * @see #getWaterContent()
	 * @see #setWaterContent(String)
	 * @generated
	 */
	public boolean isSetWaterContent() {
		return waterContentESet;
	}

	/**
	 * Returns the value of the '<em><b>Oil Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Level</em>' attribute.
	 * @see #isSetOilLevel()
	 * @see #unsetOilLevel()
	 * @see #setOilLevel(String)
	 * @generated
	 */
	public String getOilLevel() {
		return oilLevel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel <em>Oil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Level</em>' attribute.
	 * @see #isSetOilLevel()
	 * @see #unsetOilLevel()
	 * @see #getOilLevel()
	 * @generated
	 */
	public void setOilLevel(String newOilLevel) {
		oilLevel = newOilLevel;
		oilLevelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel <em>Oil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOilLevel()
	 * @see #getOilLevel()
	 * @see #setOilLevel(String)
	 * @generated
	 */
	public void unsetOilLevel() {
		oilLevel = OIL_LEVEL_EDEFAULT;
		oilLevelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel <em>Oil Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Oil Level</em>' attribute is set.
	 * @see #unsetOilLevel()
	 * @see #getOilLevel()
	 * @see #setOilLevel(String)
	 * @generated
	 */
	public boolean isSetOilLevel() {
		return oilLevelESet;
	}

	/**
	 * Returns the value of the '<em><b>Freq Resp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freq Resp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freq Resp</em>' attribute.
	 * @see #isSetFreqResp()
	 * @see #unsetFreqResp()
	 * @see #setFreqResp(String)
	 * @generated
	 */
	public String getFreqResp() {
		return freqResp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp <em>Freq Resp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq Resp</em>' attribute.
	 * @see #isSetFreqResp()
	 * @see #unsetFreqResp()
	 * @see #getFreqResp()
	 * @generated
	 */
	public void setFreqResp(String newFreqResp) {
		freqResp = newFreqResp;
		freqRespESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp <em>Freq Resp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreqResp()
	 * @see #getFreqResp()
	 * @see #setFreqResp(String)
	 * @generated
	 */
	public void unsetFreqResp() {
		freqResp = FREQ_RESP_EDEFAULT;
		freqRespESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp <em>Freq Resp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Freq Resp</em>' attribute is set.
	 * @see #unsetFreqResp()
	 * @see #getFreqResp()
	 * @see #setFreqResp(String)
	 * @generated
	 */
	public boolean isSetFreqResp() {
		return freqRespESet;
	}

	/**
	 * Returns the value of the '<em><b>Oil Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Dielectric Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Dielectric Strength</em>' attribute.
	 * @see #isSetOilDielectricStrength()
	 * @see #unsetOilDielectricStrength()
	 * @see #setOilDielectricStrength(float)
	 * @generated
	 */
	public float getOilDielectricStrength() {
		return oilDielectricStrength;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength <em>Oil Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Dielectric Strength</em>' attribute.
	 * @see #isSetOilDielectricStrength()
	 * @see #unsetOilDielectricStrength()
	 * @see #getOilDielectricStrength()
	 * @generated
	 */
	public void setOilDielectricStrength(float newOilDielectricStrength) {
		oilDielectricStrength = newOilDielectricStrength;
		oilDielectricStrengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength <em>Oil Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOilDielectricStrength()
	 * @see #getOilDielectricStrength()
	 * @see #setOilDielectricStrength(float)
	 * @generated
	 */
	public void unsetOilDielectricStrength() {
		oilDielectricStrength = OIL_DIELECTRIC_STRENGTH_EDEFAULT;
		oilDielectricStrengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength <em>Oil Dielectric Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Oil Dielectric Strength</em>' attribute is set.
	 * @see #unsetOilDielectricStrength()
	 * @see #getOilDielectricStrength()
	 * @see #setOilDielectricStrength(float)
	 * @generated
	 */
	public boolean isSetOilDielectricStrength() {
		return oilDielectricStrengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Oil Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Color</em>' attribute.
	 * @see #isSetOilColor()
	 * @see #unsetOilColor()
	 * @see #setOilColor(String)
	 * @generated
	 */
	public String getOilColor() {
		return oilColor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor <em>Oil Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Color</em>' attribute.
	 * @see #isSetOilColor()
	 * @see #unsetOilColor()
	 * @see #getOilColor()
	 * @generated
	 */
	public void setOilColor(String newOilColor) {
		oilColor = newOilColor;
		oilColorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor <em>Oil Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOilColor()
	 * @see #getOilColor()
	 * @see #setOilColor(String)
	 * @generated
	 */
	public void unsetOilColor() {
		oilColor = OIL_COLOR_EDEFAULT;
		oilColorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor <em>Oil Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Oil Color</em>' attribute is set.
	 * @see #unsetOilColor()
	 * @see #getOilColor()
	 * @see #setOilColor(String)
	 * @generated
	 */
	public boolean isSetOilColor() {
		return oilColorESet;
	}

	/**
	 * Returns the value of the '<em><b>Hot Spot Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Spot Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Spot Temp</em>' attribute.
	 * @see #isSetHotSpotTemp()
	 * @see #unsetHotSpotTemp()
	 * @see #setHotSpotTemp(float)
	 * @generated
	 */
	public float getHotSpotTemp() {
		return hotSpotTemp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp <em>Hot Spot Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Spot Temp</em>' attribute.
	 * @see #isSetHotSpotTemp()
	 * @see #unsetHotSpotTemp()
	 * @see #getHotSpotTemp()
	 * @generated
	 */
	public void setHotSpotTemp(float newHotSpotTemp) {
		hotSpotTemp = newHotSpotTemp;
		hotSpotTempESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp <em>Hot Spot Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHotSpotTemp()
	 * @see #getHotSpotTemp()
	 * @see #setHotSpotTemp(float)
	 * @generated
	 */
	public void unsetHotSpotTemp() {
		hotSpotTemp = HOT_SPOT_TEMP_EDEFAULT;
		hotSpotTempESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp <em>Hot Spot Temp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hot Spot Temp</em>' attribute is set.
	 * @see #unsetHotSpotTemp()
	 * @see #getHotSpotTemp()
	 * @see #setHotSpotTemp(float)
	 * @generated
	 */
	public boolean isSetHotSpotTemp() {
		return hotSpotTempESet;
	}

	/**
	 * Returns the value of the '<em><b>Dga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dga</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dga</em>' attribute.
	 * @see #isSetDga()
	 * @see #unsetDga()
	 * @see #setDga(String)
	 * @generated
	 */
	public String getDga() {
		return dga;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getDga <em>Dga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dga</em>' attribute.
	 * @see #isSetDga()
	 * @see #unsetDga()
	 * @see #getDga()
	 * @generated
	 */
	public void setDga(String newDga) {
		dga = newDga;
		dgaESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getDga <em>Dga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDga()
	 * @see #getDga()
	 * @see #setDga(String)
	 * @generated
	 */
	public void unsetDga() {
		dga = DGA_EDEFAULT;
		dgaESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getDga <em>Dga</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dga</em>' attribute is set.
	 * @see #unsetDga()
	 * @see #getDga()
	 * @see #setDga(String)
	 * @generated
	 */
	public boolean isSetDga() {
		return dgaESet;
	}

	/**
	 * Returns the value of the '<em><b>Furfural DP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Furfural DP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Furfural DP</em>' attribute.
	 * @see #isSetFurfuralDP()
	 * @see #unsetFurfuralDP()
	 * @see #setFurfuralDP(String)
	 * @generated
	 */
	public String getFurfuralDP() {
		return furfuralDP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP <em>Furfural DP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Furfural DP</em>' attribute.
	 * @see #isSetFurfuralDP()
	 * @see #unsetFurfuralDP()
	 * @see #getFurfuralDP()
	 * @generated
	 */
	public void setFurfuralDP(String newFurfuralDP) {
		furfuralDP = newFurfuralDP;
		furfuralDPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP <em>Furfural DP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFurfuralDP()
	 * @see #getFurfuralDP()
	 * @see #setFurfuralDP(String)
	 * @generated
	 */
	public void unsetFurfuralDP() {
		furfuralDP = FURFURAL_DP_EDEFAULT;
		furfuralDPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP <em>Furfural DP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Furfural DP</em>' attribute is set.
	 * @see #unsetFurfuralDP()
	 * @see #getFurfuralDP()
	 * @see #setFurfuralDP(String)
	 * @generated
	 */
	public boolean isSetFurfuralDP() {
		return furfuralDPESet;
	}

	/**
	 * Returns the value of the '<em><b>Oil IFT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil IFT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil IFT</em>' attribute.
	 * @see #isSetOilIFT()
	 * @see #unsetOilIFT()
	 * @see #setOilIFT(String)
	 * @generated
	 */
	public String getOilIFT() {
		return oilIFT;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT <em>Oil IFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil IFT</em>' attribute.
	 * @see #isSetOilIFT()
	 * @see #unsetOilIFT()
	 * @see #getOilIFT()
	 * @generated
	 */
	public void setOilIFT(String newOilIFT) {
		oilIFT = newOilIFT;
		oilIFTESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT <em>Oil IFT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOilIFT()
	 * @see #getOilIFT()
	 * @see #setOilIFT(String)
	 * @generated
	 */
	public void unsetOilIFT() {
		oilIFT = OIL_IFT_EDEFAULT;
		oilIFTESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT <em>Oil IFT</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Oil IFT</em>' attribute is set.
	 * @see #unsetOilIFT()
	 * @see #getOilIFT()
	 * @see #setOilIFT(String)
	 * @generated
	 */
	public boolean isSetOilIFT() {
		return oilIFTESet;
	}

	/**
	 * Returns the value of the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Data Sets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations
	 * @generated
	 */
	public EList<ProcedureDataSet> getProcedureDataSets() {
		if (procedureDataSets == null) {
			procedureDataSets = new BasicInternalEList<ProcedureDataSet>(ProcedureDataSet.class);
		}
		return procedureDataSets;
	}

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' reference.
	 * @see #setTransformer(TransformerTank)
	 * @see CIM15.IEC61970.Wires.TransformerTank#getTransformerObservations
	 * @generated
	 */
	public TransformerTank getTransformer() {
		if (transformer != null && transformer.eIsProxy()) {
			InternalEObject oldTransformer = (InternalEObject)transformer;
			transformer = (TransformerTank)eResolveProxy(oldTransformer);
			if (transformer != oldTransformer) {
			}
		}
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTank basicGetTransformer() {
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformer(TransformerTank newTransformer, NotificationChain msgs) {
		TransformerTank oldTransformer = transformer;
		transformer = newTransformer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer</em>' reference.
	 * @see #getTransformer()
	 * @generated
	 */
	public void setTransformer(TransformerTank newTransformer) {
		if (newTransformer != transformer) {
			NotificationChain msgs = null;
			if (transformer != null)
				msgs = ((InternalEObject)transformer).eInverseRemove(this, WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS, TransformerTank.class, msgs);
			if (newTransformer != null)
				msgs = ((InternalEObject)newTransformer).eInverseAdd(this, WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS, TransformerTank.class, msgs);
			msgs = basicSetTransformer(newTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Winding Insulation PFs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Insulation PFs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Insulation PFs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation
	 * @generated
	 */
	public EList<WindingInsulation> getWindingInsulationPFs() {
		if (windingInsulationPFs == null) {
			windingInsulationPFs = new BasicInternalEList<WindingInsulation>(WindingInsulation.class);
		}
		return windingInsulationPFs;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Asset</em>' reference.
	 * @see #setTransformerAsset(TransformerAsset)
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations
	 * @generated
	 */
	public TransformerAsset getTransformerAsset() {
		if (transformerAsset != null && transformerAsset.eIsProxy()) {
			InternalEObject oldTransformerAsset = (InternalEObject)transformerAsset;
			transformerAsset = (TransformerAsset)eResolveProxy(oldTransformerAsset);
			if (transformerAsset != oldTransformerAsset) {
			}
		}
		return transformerAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAsset basicGetTransformerAsset() {
		return transformerAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerAsset(TransformerAsset newTransformerAsset, NotificationChain msgs) {
		TransformerAsset oldTransformerAsset = transformerAsset;
		transformerAsset = newTransformerAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset <em>Transformer Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Asset</em>' reference.
	 * @see #getTransformerAsset()
	 * @generated
	 */
	public void setTransformerAsset(TransformerAsset newTransformerAsset) {
		if (newTransformerAsset != transformerAsset) {
			NotificationChain msgs = null;
			if (transformerAsset != null)
				msgs = ((InternalEObject)transformerAsset).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS, TransformerAsset.class, msgs);
			if (newTransformerAsset != null)
				msgs = ((InternalEObject)newTransformerAsset).eInverseAdd(this, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS, TransformerAsset.class, msgs);
			msgs = basicSetTransformerAsset(newTransformerAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Bushing Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Temp</em>' attribute.
	 * @see #isSetBushingTemp()
	 * @see #unsetBushingTemp()
	 * @see #setBushingTemp(float)
	 * @generated
	 */
	public float getBushingTemp() {
		return bushingTemp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp <em>Bushing Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bushing Temp</em>' attribute.
	 * @see #isSetBushingTemp()
	 * @see #unsetBushingTemp()
	 * @see #getBushingTemp()
	 * @generated
	 */
	public void setBushingTemp(float newBushingTemp) {
		bushingTemp = newBushingTemp;
		bushingTempESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp <em>Bushing Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBushingTemp()
	 * @see #getBushingTemp()
	 * @see #setBushingTemp(float)
	 * @generated
	 */
	public void unsetBushingTemp() {
		bushingTemp = BUSHING_TEMP_EDEFAULT;
		bushingTempESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp <em>Bushing Temp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bushing Temp</em>' attribute is set.
	 * @see #unsetBushingTemp()
	 * @see #getBushingTemp()
	 * @see #setBushingTemp(float)
	 * @generated
	 */
	public boolean isSetBushingTemp() {
		return bushingTempESet;
	}

	/**
	 * Returns the value of the '<em><b>Top Oil Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Oil Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Oil Temp</em>' attribute.
	 * @see #isSetTopOilTemp()
	 * @see #unsetTopOilTemp()
	 * @see #setTopOilTemp(float)
	 * @generated
	 */
	public float getTopOilTemp() {
		return topOilTemp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp <em>Top Oil Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Oil Temp</em>' attribute.
	 * @see #isSetTopOilTemp()
	 * @see #unsetTopOilTemp()
	 * @see #getTopOilTemp()
	 * @generated
	 */
	public void setTopOilTemp(float newTopOilTemp) {
		topOilTemp = newTopOilTemp;
		topOilTempESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp <em>Top Oil Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopOilTemp()
	 * @see #getTopOilTemp()
	 * @see #setTopOilTemp(float)
	 * @generated
	 */
	public void unsetTopOilTemp() {
		topOilTemp = TOP_OIL_TEMP_EDEFAULT;
		topOilTempESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp <em>Top Oil Temp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Oil Temp</em>' attribute is set.
	 * @see #unsetTopOilTemp()
	 * @see #getTopOilTemp()
	 * @see #setTopOilTemp(float)
	 * @generated
	 */
	public boolean isSetTopOilTemp() {
		return topOilTempESet;
	}

	/**
	 * Returns the value of the '<em><b>Pump Vibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Vibration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Vibration</em>' attribute.
	 * @see #isSetPumpVibration()
	 * @see #unsetPumpVibration()
	 * @see #setPumpVibration(String)
	 * @generated
	 */
	public String getPumpVibration() {
		return pumpVibration;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration <em>Pump Vibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Vibration</em>' attribute.
	 * @see #isSetPumpVibration()
	 * @see #unsetPumpVibration()
	 * @see #getPumpVibration()
	 * @generated
	 */
	public void setPumpVibration(String newPumpVibration) {
		pumpVibration = newPumpVibration;
		pumpVibrationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration <em>Pump Vibration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPumpVibration()
	 * @see #getPumpVibration()
	 * @see #setPumpVibration(String)
	 * @generated
	 */
	public void unsetPumpVibration() {
		pumpVibration = PUMP_VIBRATION_EDEFAULT;
		pumpVibrationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration <em>Pump Vibration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pump Vibration</em>' attribute is set.
	 * @see #unsetPumpVibration()
	 * @see #getPumpVibration()
	 * @see #setPumpVibration(String)
	 * @generated
	 */
	public boolean isSetPumpVibration() {
		return pumpVibrationESet;
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBushingInsultationPFs()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedureDataSets()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				if (transformer != null)
					msgs = ((InternalEObject)transformer).eInverseRemove(this, WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS, TransformerTank.class, msgs);
				return basicSetTransformer((TransformerTank)otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindingInsulationPFs()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				if (transformerAsset != null)
					msgs = ((InternalEObject)transformerAsset).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS, TransformerAsset.class, msgs);
				return basicSetTransformerAsset((TransformerAsset)otherEnd, msgs);
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				return ((InternalEList<?>)getBushingInsultationPFs()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				return ((InternalEList<?>)getProcedureDataSets()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				return basicSetTransformer(null, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				return basicSetStatus(null, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				return ((InternalEList<?>)getWindingInsulationPFs()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				return basicSetTransformerAsset(null, msgs);
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				return getBushingInsultationPFs();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER:
				return getOilNeutralizationNumber();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT:
				return getWaterContent();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL:
				return getOilLevel();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP:
				return getFreqResp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH:
				return getOilDielectricStrength();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR:
				return getOilColor();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP:
				return getHotSpotTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA:
				return getDga();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP:
				return getFurfuralDP();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT:
				return getOilIFT();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				return getProcedureDataSets();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				if (resolve) return getTransformer();
				return basicGetTransformer();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				return getStatus();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				return getWindingInsulationPFs();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				if (resolve) return getTransformerAsset();
				return basicGetTransformerAsset();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP:
				return getBushingTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP:
				return getTopOilTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION:
				return getPumpVibration();
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				getBushingInsultationPFs().clear();
				getBushingInsultationPFs().addAll((Collection<? extends BushingInsulationPF>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER:
				setOilNeutralizationNumber((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT:
				setWaterContent((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL:
				setOilLevel((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP:
				setFreqResp((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH:
				setOilDielectricStrength((Float)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR:
				setOilColor((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP:
				setHotSpotTemp((Float)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA:
				setDga((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP:
				setFurfuralDP((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT:
				setOilIFT((String)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				getProcedureDataSets().addAll((Collection<? extends ProcedureDataSet>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				setTransformer((TransformerTank)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				setStatus((Status)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				getWindingInsulationPFs().clear();
				getWindingInsulationPFs().addAll((Collection<? extends WindingInsulation>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				setTransformerAsset((TransformerAsset)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP:
				setBushingTemp((Float)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP:
				setTopOilTemp((Float)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION:
				setPumpVibration((String)newValue);
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				getBushingInsultationPFs().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER:
				unsetOilNeutralizationNumber();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT:
				unsetWaterContent();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL:
				unsetOilLevel();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP:
				unsetFreqResp();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH:
				unsetOilDielectricStrength();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR:
				unsetOilColor();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP:
				unsetHotSpotTemp();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA:
				unsetDga();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP:
				unsetFurfuralDP();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT:
				unsetOilIFT();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				setTransformer((TransformerTank)null);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				setStatus((Status)null);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				getWindingInsulationPFs().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				setTransformerAsset((TransformerAsset)null);
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP:
				unsetBushingTemp();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP:
				unsetTopOilTemp();
				return;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION:
				unsetPumpVibration();
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
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS:
				return bushingInsultationPFs != null && !bushingInsultationPFs.isEmpty();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER:
				return isSetOilNeutralizationNumber();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WATER_CONTENT:
				return isSetWaterContent();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_LEVEL:
				return isSetOilLevel();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FREQ_RESP:
				return isSetFreqResp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH:
				return isSetOilDielectricStrength();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_COLOR:
				return isSetOilColor();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP:
				return isSetHotSpotTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__DGA:
				return isSetDga();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__FURFURAL_DP:
				return isSetFurfuralDP();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__OIL_IFT:
				return isSetOilIFT();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS:
				return procedureDataSets != null && !procedureDataSets.isEmpty();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER:
				return transformer != null;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__STATUS:
				return status != null;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS:
				return windingInsulationPFs != null && !windingInsulationPFs.isEmpty();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET:
				return transformerAsset != null;
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_TEMP:
				return isSetBushingTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__TOP_OIL_TEMP:
				return isSetTopOilTemp();
			case InfAssetsPackage.TRANSFORMER_OBSERVATION__PUMP_VIBRATION:
				return isSetPumpVibration();
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
		result.append(" (oilNeutralizationNumber: ");
		if (oilNeutralizationNumberESet) result.append(oilNeutralizationNumber); else result.append("<unset>");
		result.append(", waterContent: ");
		if (waterContentESet) result.append(waterContent); else result.append("<unset>");
		result.append(", oilLevel: ");
		if (oilLevelESet) result.append(oilLevel); else result.append("<unset>");
		result.append(", freqResp: ");
		if (freqRespESet) result.append(freqResp); else result.append("<unset>");
		result.append(", oilDielectricStrength: ");
		if (oilDielectricStrengthESet) result.append(oilDielectricStrength); else result.append("<unset>");
		result.append(", oilColor: ");
		if (oilColorESet) result.append(oilColor); else result.append("<unset>");
		result.append(", hotSpotTemp: ");
		if (hotSpotTempESet) result.append(hotSpotTemp); else result.append("<unset>");
		result.append(", dga: ");
		if (dgaESet) result.append(dga); else result.append("<unset>");
		result.append(", furfuralDP: ");
		if (furfuralDPESet) result.append(furfuralDP); else result.append("<unset>");
		result.append(", oilIFT: ");
		if (oilIFTESet) result.append(oilIFT); else result.append("<unset>");
		result.append(", bushingTemp: ");
		if (bushingTempESet) result.append(bushingTemp); else result.append("<unset>");
		result.append(", topOilTemp: ");
		if (topOilTempESet) result.append(topOilTemp); else result.append("<unset>");
		result.append(", pumpVibration: ");
		if (pumpVibrationESet) result.append(pumpVibration); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerObservation
