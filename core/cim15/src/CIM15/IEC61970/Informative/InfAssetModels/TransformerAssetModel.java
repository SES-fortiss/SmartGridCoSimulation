/**
 */
package CIM15.IEC61970.Informative.InfAssetModels;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.TransformerTankInfo;

import CIM15.IEC61968.Assets.ProductAssetModel;

import CIM15.IEC61970.Informative.InfAssets.TransformerAsset;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL <em>Neutral BIL</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind <em>Construction Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight <em>Core Coils Weight</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind <em>Winding Insulation Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating <em>Hour Over Load Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding <em>Reconfig Winding</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction <em>Function</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind <em>Oil Preservation Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating <em>Day Over Load Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind <em>Core Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer <em>Auto Transformer</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight <em>Solid Insulation Weight</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets <em>Transformer Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo <em>Transformer Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerAssetModel extends ProductAssetModel {
	/**
	 * The default value of the '{@link #getNeutralBIL() <em>Neutral BIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralBIL()
	 * @generated
	 * @ordered
	 */
	protected static final float NEUTRAL_BIL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNeutralBIL() <em>Neutral BIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralBIL()
	 * @generated
	 * @ordered
	 */
	protected float neutralBIL = NEUTRAL_BIL_EDEFAULT;

	/**
	 * This is true if the Neutral BIL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean neutralBILESet;

	/**
	 * The default value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerConstructionKind CONSTRUCTION_KIND_EDEFAULT = TransformerConstructionKind.DRY_TYPE;

	/**
	 * The cached value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected TransformerConstructionKind constructionKind = CONSTRUCTION_KIND_EDEFAULT;

	/**
	 * This is true if the Construction Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constructionKindESet;

	/**
	 * The default value of the '{@link #getCoreCoilsWeight() <em>Core Coils Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCoilsWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_COILS_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreCoilsWeight() <em>Core Coils Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCoilsWeight()
	 * @generated
	 * @ordered
	 */
	protected float coreCoilsWeight = CORE_COILS_WEIGHT_EDEFAULT;

	/**
	 * This is true if the Core Coils Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreCoilsWeightESet;

	/**
	 * The default value of the '{@link #getWindingInsulationKind() <em>Winding Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInsulationKind()
	 * @generated
	 * @ordered
	 */
	protected static final WindingInsulationKind WINDING_INSULATION_KIND_EDEFAULT = WindingInsulationKind.THERMALLY_UPGRADED_PAPER;

	/**
	 * The cached value of the '{@link #getWindingInsulationKind() <em>Winding Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInsulationKind()
	 * @generated
	 * @ordered
	 */
	protected WindingInsulationKind windingInsulationKind = WINDING_INSULATION_KIND_EDEFAULT;

	/**
	 * This is true if the Winding Insulation Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean windingInsulationKindESet;

	/**
	 * The default value of the '{@link #getHourOverLoadRating() <em>Hour Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourOverLoadRating()
	 * @generated
	 * @ordered
	 */
	protected static final float HOUR_OVER_LOAD_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHourOverLoadRating() <em>Hour Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourOverLoadRating()
	 * @generated
	 * @ordered
	 */
	protected float hourOverLoadRating = HOUR_OVER_LOAD_RATING_EDEFAULT;

	/**
	 * This is true if the Hour Over Load Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hourOverLoadRatingESet;

	/**
	 * The default value of the '{@link #getAltPrimaryNomVoltage() <em>Alt Primary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltPrimaryNomVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float ALT_PRIMARY_NOM_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltPrimaryNomVoltage() <em>Alt Primary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltPrimaryNomVoltage()
	 * @generated
	 * @ordered
	 */
	protected float altPrimaryNomVoltage = ALT_PRIMARY_NOM_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Alt Primary Nom Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altPrimaryNomVoltageESet;

	/**
	 * The default value of the '{@link #getAltSecondaryNomVoltage() <em>Alt Secondary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltSecondaryNomVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float ALT_SECONDARY_NOM_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAltSecondaryNomVoltage() <em>Alt Secondary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltSecondaryNomVoltage()
	 * @generated
	 * @ordered
	 */
	protected float altSecondaryNomVoltage = ALT_SECONDARY_NOM_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Alt Secondary Nom Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altSecondaryNomVoltageESet;

	/**
	 * The default value of the '{@link #isReconfigWinding() <em>Reconfig Winding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconfigWinding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECONFIG_WINDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReconfigWinding() <em>Reconfig Winding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReconfigWinding()
	 * @generated
	 * @ordered
	 */
	protected boolean reconfigWinding = RECONFIG_WINDING_EDEFAULT;

	/**
	 * This is true if the Reconfig Winding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reconfigWindingESet;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerFunctionKind FUNCTION_EDEFAULT = TransformerFunctionKind.AUTOTRANSFORMER;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected TransformerFunctionKind function = FUNCTION_EDEFAULT;

	/**
	 * This is true if the Function attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean functionESet;

	/**
	 * The default value of the '{@link #getOilPreservationKind() <em>Oil Preservation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilPreservationKind()
	 * @generated
	 * @ordered
	 */
	protected static final OilPreservationKind OIL_PRESERVATION_KIND_EDEFAULT = OilPreservationKind.OTHER;

	/**
	 * The cached value of the '{@link #getOilPreservationKind() <em>Oil Preservation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOilPreservationKind()
	 * @generated
	 * @ordered
	 */
	protected OilPreservationKind oilPreservationKind = OIL_PRESERVATION_KIND_EDEFAULT;

	/**
	 * This is true if the Oil Preservation Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean oilPreservationKindESet;

	/**
	 * The default value of the '{@link #getDayOverLoadRating() <em>Day Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOverLoadRating()
	 * @generated
	 * @ordered
	 */
	protected static final float DAY_OVER_LOAD_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDayOverLoadRating() <em>Day Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOverLoadRating()
	 * @generated
	 * @ordered
	 */
	protected float dayOverLoadRating = DAY_OVER_LOAD_RATING_EDEFAULT;

	/**
	 * This is true if the Day Over Load Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dayOverLoadRatingESet;

	/**
	 * The default value of the '{@link #getCoreKind() <em>Core Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerCoreKind CORE_KIND_EDEFAULT = TransformerCoreKind.SHELL;

	/**
	 * The cached value of the '{@link #getCoreKind() <em>Core Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreKind()
	 * @generated
	 * @ordered
	 */
	protected TransformerCoreKind coreKind = CORE_KIND_EDEFAULT;

	/**
	 * This is true if the Core Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreKindESet;

	/**
	 * The default value of the '{@link #isAutoTransformer() <em>Auto Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoTransformer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_TRANSFORMER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoTransformer() <em>Auto Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoTransformer()
	 * @generated
	 * @ordered
	 */
	protected boolean autoTransformer = AUTO_TRANSFORMER_EDEFAULT;

	/**
	 * This is true if the Auto Transformer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoTransformerESet;

	/**
	 * The default value of the '{@link #getSolidInsulationWeight() <em>Solid Insulation Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidInsulationWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float SOLID_INSULATION_WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSolidInsulationWeight() <em>Solid Insulation Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidInsulationWeight()
	 * @generated
	 * @ordered
	 */
	protected float solidInsulationWeight = SOLID_INSULATION_WEIGHT_EDEFAULT;

	/**
	 * This is true if the Solid Insulation Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solidInsulationWeightESet;

	/**
	 * The cached value of the '{@link #getTransformerAssets() <em>Transformer Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerAsset> transformerAssets;

	/**
	 * The cached value of the '{@link #getTransformerInfo() <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerTankInfo transformerInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerAssetModel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetModelsPackage.Literals.TRANSFORMER_ASSET_MODEL;
	}

	/**
	 * Returns the value of the '<em><b>Neutral BIL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral BIL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral BIL</em>' attribute.
	 * @see #isSetNeutralBIL()
	 * @see #unsetNeutralBIL()
	 * @see #setNeutralBIL(float)
	 * @generated
	 */
	public float getNeutralBIL() {
		return neutralBIL;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL <em>Neutral BIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral BIL</em>' attribute.
	 * @see #isSetNeutralBIL()
	 * @see #unsetNeutralBIL()
	 * @see #getNeutralBIL()
	 * @generated
	 */
	public void setNeutralBIL(float newNeutralBIL) {
		neutralBIL = newNeutralBIL;
		neutralBILESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL <em>Neutral BIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeutralBIL()
	 * @see #getNeutralBIL()
	 * @see #setNeutralBIL(float)
	 * @generated
	 */
	public void unsetNeutralBIL() {
		neutralBIL = NEUTRAL_BIL_EDEFAULT;
		neutralBILESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL <em>Neutral BIL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Neutral BIL</em>' attribute is set.
	 * @see #unsetNeutralBIL()
	 * @see #getNeutralBIL()
	 * @see #setNeutralBIL(float)
	 * @generated
	 */
	public boolean isSetNeutralBIL() {
		return neutralBILESet;
	}

	/**
	 * Returns the value of the '<em><b>Construction Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
	 * @see #isSetConstructionKind()
	 * @see #unsetConstructionKind()
	 * @see #setConstructionKind(TransformerConstructionKind)
	 * @generated
	 */
	public TransformerConstructionKind getConstructionKind() {
		return constructionKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
	 * @see #isSetConstructionKind()
	 * @see #unsetConstructionKind()
	 * @see #getConstructionKind()
	 * @generated
	 */
	public void setConstructionKind(TransformerConstructionKind newConstructionKind) {
		constructionKind = newConstructionKind == null ? CONSTRUCTION_KIND_EDEFAULT : newConstructionKind;
		constructionKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstructionKind()
	 * @see #getConstructionKind()
	 * @see #setConstructionKind(TransformerConstructionKind)
	 * @generated
	 */
	public void unsetConstructionKind() {
		constructionKind = CONSTRUCTION_KIND_EDEFAULT;
		constructionKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind <em>Construction Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Construction Kind</em>' attribute is set.
	 * @see #unsetConstructionKind()
	 * @see #getConstructionKind()
	 * @see #setConstructionKind(TransformerConstructionKind)
	 * @generated
	 */
	public boolean isSetConstructionKind() {
		return constructionKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Core Coils Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Coils Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Coils Weight</em>' attribute.
	 * @see #isSetCoreCoilsWeight()
	 * @see #unsetCoreCoilsWeight()
	 * @see #setCoreCoilsWeight(float)
	 * @generated
	 */
	public float getCoreCoilsWeight() {
		return coreCoilsWeight;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight <em>Core Coils Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Coils Weight</em>' attribute.
	 * @see #isSetCoreCoilsWeight()
	 * @see #unsetCoreCoilsWeight()
	 * @see #getCoreCoilsWeight()
	 * @generated
	 */
	public void setCoreCoilsWeight(float newCoreCoilsWeight) {
		coreCoilsWeight = newCoreCoilsWeight;
		coreCoilsWeightESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight <em>Core Coils Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreCoilsWeight()
	 * @see #getCoreCoilsWeight()
	 * @see #setCoreCoilsWeight(float)
	 * @generated
	 */
	public void unsetCoreCoilsWeight() {
		coreCoilsWeight = CORE_COILS_WEIGHT_EDEFAULT;
		coreCoilsWeightESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight <em>Core Coils Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Coils Weight</em>' attribute is set.
	 * @see #unsetCoreCoilsWeight()
	 * @see #getCoreCoilsWeight()
	 * @see #setCoreCoilsWeight(float)
	 * @generated
	 */
	public boolean isSetCoreCoilsWeight() {
		return coreCoilsWeightESet;
	}

	/**
	 * Returns the value of the '<em><b>Winding Insulation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Insulation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Insulation Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind
	 * @see #isSetWindingInsulationKind()
	 * @see #unsetWindingInsulationKind()
	 * @see #setWindingInsulationKind(WindingInsulationKind)
	 * @generated
	 */
	public WindingInsulationKind getWindingInsulationKind() {
		return windingInsulationKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind <em>Winding Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding Insulation Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind
	 * @see #isSetWindingInsulationKind()
	 * @see #unsetWindingInsulationKind()
	 * @see #getWindingInsulationKind()
	 * @generated
	 */
	public void setWindingInsulationKind(WindingInsulationKind newWindingInsulationKind) {
		windingInsulationKind = newWindingInsulationKind == null ? WINDING_INSULATION_KIND_EDEFAULT : newWindingInsulationKind;
		windingInsulationKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind <em>Winding Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWindingInsulationKind()
	 * @see #getWindingInsulationKind()
	 * @see #setWindingInsulationKind(WindingInsulationKind)
	 * @generated
	 */
	public void unsetWindingInsulationKind() {
		windingInsulationKind = WINDING_INSULATION_KIND_EDEFAULT;
		windingInsulationKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind <em>Winding Insulation Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Winding Insulation Kind</em>' attribute is set.
	 * @see #unsetWindingInsulationKind()
	 * @see #getWindingInsulationKind()
	 * @see #setWindingInsulationKind(WindingInsulationKind)
	 * @generated
	 */
	public boolean isSetWindingInsulationKind() {
		return windingInsulationKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Hour Over Load Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour Over Load Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour Over Load Rating</em>' attribute.
	 * @see #isSetHourOverLoadRating()
	 * @see #unsetHourOverLoadRating()
	 * @see #setHourOverLoadRating(float)
	 * @generated
	 */
	public float getHourOverLoadRating() {
		return hourOverLoadRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating <em>Hour Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour Over Load Rating</em>' attribute.
	 * @see #isSetHourOverLoadRating()
	 * @see #unsetHourOverLoadRating()
	 * @see #getHourOverLoadRating()
	 * @generated
	 */
	public void setHourOverLoadRating(float newHourOverLoadRating) {
		hourOverLoadRating = newHourOverLoadRating;
		hourOverLoadRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating <em>Hour Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHourOverLoadRating()
	 * @see #getHourOverLoadRating()
	 * @see #setHourOverLoadRating(float)
	 * @generated
	 */
	public void unsetHourOverLoadRating() {
		hourOverLoadRating = HOUR_OVER_LOAD_RATING_EDEFAULT;
		hourOverLoadRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating <em>Hour Over Load Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hour Over Load Rating</em>' attribute is set.
	 * @see #unsetHourOverLoadRating()
	 * @see #getHourOverLoadRating()
	 * @see #setHourOverLoadRating(float)
	 * @generated
	 */
	public boolean isSetHourOverLoadRating() {
		return hourOverLoadRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Alt Primary Nom Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Primary Nom Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Primary Nom Voltage</em>' attribute.
	 * @see #isSetAltPrimaryNomVoltage()
	 * @see #unsetAltPrimaryNomVoltage()
	 * @see #setAltPrimaryNomVoltage(float)
	 * @generated
	 */
	public float getAltPrimaryNomVoltage() {
		return altPrimaryNomVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Primary Nom Voltage</em>' attribute.
	 * @see #isSetAltPrimaryNomVoltage()
	 * @see #unsetAltPrimaryNomVoltage()
	 * @see #getAltPrimaryNomVoltage()
	 * @generated
	 */
	public void setAltPrimaryNomVoltage(float newAltPrimaryNomVoltage) {
		altPrimaryNomVoltage = newAltPrimaryNomVoltage;
		altPrimaryNomVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltPrimaryNomVoltage()
	 * @see #getAltPrimaryNomVoltage()
	 * @see #setAltPrimaryNomVoltage(float)
	 * @generated
	 */
	public void unsetAltPrimaryNomVoltage() {
		altPrimaryNomVoltage = ALT_PRIMARY_NOM_VOLTAGE_EDEFAULT;
		altPrimaryNomVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alt Primary Nom Voltage</em>' attribute is set.
	 * @see #unsetAltPrimaryNomVoltage()
	 * @see #getAltPrimaryNomVoltage()
	 * @see #setAltPrimaryNomVoltage(float)
	 * @generated
	 */
	public boolean isSetAltPrimaryNomVoltage() {
		return altPrimaryNomVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Alt Secondary Nom Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Secondary Nom Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Secondary Nom Voltage</em>' attribute.
	 * @see #isSetAltSecondaryNomVoltage()
	 * @see #unsetAltSecondaryNomVoltage()
	 * @see #setAltSecondaryNomVoltage(float)
	 * @generated
	 */
	public float getAltSecondaryNomVoltage() {
		return altSecondaryNomVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Secondary Nom Voltage</em>' attribute.
	 * @see #isSetAltSecondaryNomVoltage()
	 * @see #unsetAltSecondaryNomVoltage()
	 * @see #getAltSecondaryNomVoltage()
	 * @generated
	 */
	public void setAltSecondaryNomVoltage(float newAltSecondaryNomVoltage) {
		altSecondaryNomVoltage = newAltSecondaryNomVoltage;
		altSecondaryNomVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltSecondaryNomVoltage()
	 * @see #getAltSecondaryNomVoltage()
	 * @see #setAltSecondaryNomVoltage(float)
	 * @generated
	 */
	public void unsetAltSecondaryNomVoltage() {
		altSecondaryNomVoltage = ALT_SECONDARY_NOM_VOLTAGE_EDEFAULT;
		altSecondaryNomVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alt Secondary Nom Voltage</em>' attribute is set.
	 * @see #unsetAltSecondaryNomVoltage()
	 * @see #getAltSecondaryNomVoltage()
	 * @see #setAltSecondaryNomVoltage(float)
	 * @generated
	 */
	public boolean isSetAltSecondaryNomVoltage() {
		return altSecondaryNomVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Reconfig Winding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfig Winding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfig Winding</em>' attribute.
	 * @see #isSetReconfigWinding()
	 * @see #unsetReconfigWinding()
	 * @see #setReconfigWinding(boolean)
	 * @generated
	 */
	public boolean isReconfigWinding() {
		return reconfigWinding;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding <em>Reconfig Winding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfig Winding</em>' attribute.
	 * @see #isSetReconfigWinding()
	 * @see #unsetReconfigWinding()
	 * @see #isReconfigWinding()
	 * @generated
	 */
	public void setReconfigWinding(boolean newReconfigWinding) {
		reconfigWinding = newReconfigWinding;
		reconfigWindingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding <em>Reconfig Winding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReconfigWinding()
	 * @see #isReconfigWinding()
	 * @see #setReconfigWinding(boolean)
	 * @generated
	 */
	public void unsetReconfigWinding() {
		reconfigWinding = RECONFIG_WINDING_EDEFAULT;
		reconfigWindingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding <em>Reconfig Winding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reconfig Winding</em>' attribute is set.
	 * @see #unsetReconfigWinding()
	 * @see #isReconfigWinding()
	 * @see #setReconfigWinding(boolean)
	 * @generated
	 */
	public boolean isSetReconfigWinding() {
		return reconfigWindingESet;
	}

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
	 * @see #isSetFunction()
	 * @see #unsetFunction()
	 * @see #setFunction(TransformerFunctionKind)
	 * @generated
	 */
	public TransformerFunctionKind getFunction() {
		return function;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
	 * @see #isSetFunction()
	 * @see #unsetFunction()
	 * @see #getFunction()
	 * @generated
	 */
	public void setFunction(TransformerFunctionKind newFunction) {
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		functionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFunction()
	 * @see #getFunction()
	 * @see #setFunction(TransformerFunctionKind)
	 * @generated
	 */
	public void unsetFunction() {
		function = FUNCTION_EDEFAULT;
		functionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction <em>Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Function</em>' attribute is set.
	 * @see #unsetFunction()
	 * @see #getFunction()
	 * @see #setFunction(TransformerFunctionKind)
	 * @generated
	 */
	public boolean isSetFunction() {
		return functionESet;
	}

	/**
	 * Returns the value of the '<em><b>Oil Preservation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oil Preservation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oil Preservation Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind
	 * @see #isSetOilPreservationKind()
	 * @see #unsetOilPreservationKind()
	 * @see #setOilPreservationKind(OilPreservationKind)
	 * @generated
	 */
	public OilPreservationKind getOilPreservationKind() {
		return oilPreservationKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind <em>Oil Preservation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oil Preservation Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind
	 * @see #isSetOilPreservationKind()
	 * @see #unsetOilPreservationKind()
	 * @see #getOilPreservationKind()
	 * @generated
	 */
	public void setOilPreservationKind(OilPreservationKind newOilPreservationKind) {
		oilPreservationKind = newOilPreservationKind == null ? OIL_PRESERVATION_KIND_EDEFAULT : newOilPreservationKind;
		oilPreservationKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind <em>Oil Preservation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOilPreservationKind()
	 * @see #getOilPreservationKind()
	 * @see #setOilPreservationKind(OilPreservationKind)
	 * @generated
	 */
	public void unsetOilPreservationKind() {
		oilPreservationKind = OIL_PRESERVATION_KIND_EDEFAULT;
		oilPreservationKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind <em>Oil Preservation Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Oil Preservation Kind</em>' attribute is set.
	 * @see #unsetOilPreservationKind()
	 * @see #getOilPreservationKind()
	 * @see #setOilPreservationKind(OilPreservationKind)
	 * @generated
	 */
	public boolean isSetOilPreservationKind() {
		return oilPreservationKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Day Over Load Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Over Load Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Over Load Rating</em>' attribute.
	 * @see #isSetDayOverLoadRating()
	 * @see #unsetDayOverLoadRating()
	 * @see #setDayOverLoadRating(float)
	 * @generated
	 */
	public float getDayOverLoadRating() {
		return dayOverLoadRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating <em>Day Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Over Load Rating</em>' attribute.
	 * @see #isSetDayOverLoadRating()
	 * @see #unsetDayOverLoadRating()
	 * @see #getDayOverLoadRating()
	 * @generated
	 */
	public void setDayOverLoadRating(float newDayOverLoadRating) {
		dayOverLoadRating = newDayOverLoadRating;
		dayOverLoadRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating <em>Day Over Load Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayOverLoadRating()
	 * @see #getDayOverLoadRating()
	 * @see #setDayOverLoadRating(float)
	 * @generated
	 */
	public void unsetDayOverLoadRating() {
		dayOverLoadRating = DAY_OVER_LOAD_RATING_EDEFAULT;
		dayOverLoadRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating <em>Day Over Load Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Over Load Rating</em>' attribute is set.
	 * @see #unsetDayOverLoadRating()
	 * @see #getDayOverLoadRating()
	 * @see #setDayOverLoadRating(float)
	 * @generated
	 */
	public boolean isSetDayOverLoadRating() {
		return dayOverLoadRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Core Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind
	 * @see #isSetCoreKind()
	 * @see #unsetCoreKind()
	 * @see #setCoreKind(TransformerCoreKind)
	 * @generated
	 */
	public TransformerCoreKind getCoreKind() {
		return coreKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind <em>Core Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind
	 * @see #isSetCoreKind()
	 * @see #unsetCoreKind()
	 * @see #getCoreKind()
	 * @generated
	 */
	public void setCoreKind(TransformerCoreKind newCoreKind) {
		coreKind = newCoreKind == null ? CORE_KIND_EDEFAULT : newCoreKind;
		coreKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind <em>Core Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreKind()
	 * @see #getCoreKind()
	 * @see #setCoreKind(TransformerCoreKind)
	 * @generated
	 */
	public void unsetCoreKind() {
		coreKind = CORE_KIND_EDEFAULT;
		coreKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind <em>Core Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Kind</em>' attribute is set.
	 * @see #unsetCoreKind()
	 * @see #getCoreKind()
	 * @see #setCoreKind(TransformerCoreKind)
	 * @generated
	 */
	public boolean isSetCoreKind() {
		return coreKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Auto Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Transformer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Transformer</em>' attribute.
	 * @see #isSetAutoTransformer()
	 * @see #unsetAutoTransformer()
	 * @see #setAutoTransformer(boolean)
	 * @generated
	 */
	public boolean isAutoTransformer() {
		return autoTransformer;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer <em>Auto Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Transformer</em>' attribute.
	 * @see #isSetAutoTransformer()
	 * @see #unsetAutoTransformer()
	 * @see #isAutoTransformer()
	 * @generated
	 */
	public void setAutoTransformer(boolean newAutoTransformer) {
		autoTransformer = newAutoTransformer;
		autoTransformerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer <em>Auto Transformer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoTransformer()
	 * @see #isAutoTransformer()
	 * @see #setAutoTransformer(boolean)
	 * @generated
	 */
	public void unsetAutoTransformer() {
		autoTransformer = AUTO_TRANSFORMER_EDEFAULT;
		autoTransformerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer <em>Auto Transformer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Transformer</em>' attribute is set.
	 * @see #unsetAutoTransformer()
	 * @see #isAutoTransformer()
	 * @see #setAutoTransformer(boolean)
	 * @generated
	 */
	public boolean isSetAutoTransformer() {
		return autoTransformerESet;
	}

	/**
	 * Returns the value of the '<em><b>Solid Insulation Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solid Insulation Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solid Insulation Weight</em>' attribute.
	 * @see #isSetSolidInsulationWeight()
	 * @see #unsetSolidInsulationWeight()
	 * @see #setSolidInsulationWeight(float)
	 * @generated
	 */
	public float getSolidInsulationWeight() {
		return solidInsulationWeight;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight <em>Solid Insulation Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Insulation Weight</em>' attribute.
	 * @see #isSetSolidInsulationWeight()
	 * @see #unsetSolidInsulationWeight()
	 * @see #getSolidInsulationWeight()
	 * @generated
	 */
	public void setSolidInsulationWeight(float newSolidInsulationWeight) {
		solidInsulationWeight = newSolidInsulationWeight;
		solidInsulationWeightESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight <em>Solid Insulation Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolidInsulationWeight()
	 * @see #getSolidInsulationWeight()
	 * @see #setSolidInsulationWeight(float)
	 * @generated
	 */
	public void unsetSolidInsulationWeight() {
		solidInsulationWeight = SOLID_INSULATION_WEIGHT_EDEFAULT;
		solidInsulationWeightESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight <em>Solid Insulation Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solid Insulation Weight</em>' attribute is set.
	 * @see #unsetSolidInsulationWeight()
	 * @see #getSolidInsulationWeight()
	 * @see #setSolidInsulationWeight(float)
	 * @generated
	 */
	public boolean isSetSolidInsulationWeight() {
		return solidInsulationWeightESet;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel <em>Transformer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Assets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel
	 * @generated
	 */
	public EList<TransformerAsset> getTransformerAssets() {
		if (transformerAssets == null) {
			transformerAssets = new BasicInternalEList<TransformerAsset>(TransformerAsset.class);
		}
		return transformerAssets;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssetModels <em>Transformer Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Info</em>' reference.
	 * @see #setTransformerInfo(TransformerTankInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssetModels
	 * @generated
	 */
	public TransformerTankInfo getTransformerInfo() {
		if (transformerInfo != null && transformerInfo.eIsProxy()) {
			InternalEObject oldTransformerInfo = (InternalEObject)transformerInfo;
			transformerInfo = (TransformerTankInfo)eResolveProxy(oldTransformerInfo);
			if (transformerInfo != oldTransformerInfo) {
			}
		}
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTankInfo basicGetTransformerInfo() {
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerInfo(TransformerTankInfo newTransformerInfo, NotificationChain msgs) {
		TransformerTankInfo oldTransformerInfo = transformerInfo;
		transformerInfo = newTransformerInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Info</em>' reference.
	 * @see #getTransformerInfo()
	 * @generated
	 */
	public void setTransformerInfo(TransformerTankInfo newTransformerInfo) {
		if (newTransformerInfo != transformerInfo) {
			NotificationChain msgs = null;
			if (transformerInfo != null)
				msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS, TransformerTankInfo.class, msgs);
			if (newTransformerInfo != null)
				msgs = ((InternalEObject)newTransformerInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS, TransformerTankInfo.class, msgs);
			msgs = basicSetTransformerInfo(newTransformerInfo, msgs);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerAssets()).basicAdd(otherEnd, msgs);
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				if (transformerInfo != null)
					msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS, TransformerTankInfo.class, msgs);
				return basicSetTransformerInfo((TransformerTankInfo)otherEnd, msgs);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				return ((InternalEList<?>)getTransformerAssets()).basicRemove(otherEnd, msgs);
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				return basicSetTransformerInfo(null, msgs);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL:
				return getNeutralBIL();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND:
				return getConstructionKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT:
				return getCoreCoilsWeight();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND:
				return getWindingInsulationKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING:
				return getHourOverLoadRating();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE:
				return getAltPrimaryNomVoltage();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE:
				return getAltSecondaryNomVoltage();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING:
				return isReconfigWinding();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION:
				return getFunction();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND:
				return getOilPreservationKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING:
				return getDayOverLoadRating();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND:
				return getCoreKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER:
				return isAutoTransformer();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT:
				return getSolidInsulationWeight();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				return getTransformerAssets();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				if (resolve) return getTransformerInfo();
				return basicGetTransformerInfo();
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL:
				setNeutralBIL((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND:
				setConstructionKind((TransformerConstructionKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT:
				setCoreCoilsWeight((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND:
				setWindingInsulationKind((WindingInsulationKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING:
				setHourOverLoadRating((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE:
				setAltPrimaryNomVoltage((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE:
				setAltSecondaryNomVoltage((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING:
				setReconfigWinding((Boolean)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION:
				setFunction((TransformerFunctionKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND:
				setOilPreservationKind((OilPreservationKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING:
				setDayOverLoadRating((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND:
				setCoreKind((TransformerCoreKind)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER:
				setAutoTransformer((Boolean)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT:
				setSolidInsulationWeight((Float)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				getTransformerAssets().addAll((Collection<? extends TransformerAsset>)newValue);
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				setTransformerInfo((TransformerTankInfo)newValue);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL:
				unsetNeutralBIL();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND:
				unsetConstructionKind();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT:
				unsetCoreCoilsWeight();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND:
				unsetWindingInsulationKind();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING:
				unsetHourOverLoadRating();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE:
				unsetAltPrimaryNomVoltage();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE:
				unsetAltSecondaryNomVoltage();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING:
				unsetReconfigWinding();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION:
				unsetFunction();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND:
				unsetOilPreservationKind();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING:
				unsetDayOverLoadRating();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND:
				unsetCoreKind();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER:
				unsetAutoTransformer();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT:
				unsetSolidInsulationWeight();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				return;
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				setTransformerInfo((TransformerTankInfo)null);
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
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL:
				return isSetNeutralBIL();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND:
				return isSetConstructionKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT:
				return isSetCoreCoilsWeight();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND:
				return isSetWindingInsulationKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING:
				return isSetHourOverLoadRating();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE:
				return isSetAltPrimaryNomVoltage();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE:
				return isSetAltSecondaryNomVoltage();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING:
				return isSetReconfigWinding();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__FUNCTION:
				return isSetFunction();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND:
				return isSetOilPreservationKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING:
				return isSetDayOverLoadRating();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__CORE_KIND:
				return isSetCoreKind();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER:
				return isSetAutoTransformer();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT:
				return isSetSolidInsulationWeight();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS:
				return transformerAssets != null && !transformerAssets.isEmpty();
			case InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO:
				return transformerInfo != null;
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
		result.append(" (neutralBIL: ");
		if (neutralBILESet) result.append(neutralBIL); else result.append("<unset>");
		result.append(", constructionKind: ");
		if (constructionKindESet) result.append(constructionKind); else result.append("<unset>");
		result.append(", coreCoilsWeight: ");
		if (coreCoilsWeightESet) result.append(coreCoilsWeight); else result.append("<unset>");
		result.append(", windingInsulationKind: ");
		if (windingInsulationKindESet) result.append(windingInsulationKind); else result.append("<unset>");
		result.append(", hourOverLoadRating: ");
		if (hourOverLoadRatingESet) result.append(hourOverLoadRating); else result.append("<unset>");
		result.append(", altPrimaryNomVoltage: ");
		if (altPrimaryNomVoltageESet) result.append(altPrimaryNomVoltage); else result.append("<unset>");
		result.append(", altSecondaryNomVoltage: ");
		if (altSecondaryNomVoltageESet) result.append(altSecondaryNomVoltage); else result.append("<unset>");
		result.append(", reconfigWinding: ");
		if (reconfigWindingESet) result.append(reconfigWinding); else result.append("<unset>");
		result.append(", function: ");
		if (functionESet) result.append(function); else result.append("<unset>");
		result.append(", oilPreservationKind: ");
		if (oilPreservationKindESet) result.append(oilPreservationKind); else result.append("<unset>");
		result.append(", dayOverLoadRating: ");
		if (dayOverLoadRatingESet) result.append(dayOverLoadRating); else result.append("<unset>");
		result.append(", coreKind: ");
		if (coreKindESet) result.append(coreKind); else result.append("<unset>");
		result.append(", autoTransformer: ");
		if (autoTransformerESet) result.append(autoTransformer); else result.append("<unset>");
		result.append(", solidInsulationWeight: ");
		if (solidInsulationWeightESet) result.append(solidInsulationWeight); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerAssetModel
