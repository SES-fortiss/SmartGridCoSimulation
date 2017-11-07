/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61970.Informative.InfAssets.Duct;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#isSheathAsNeutral <em>Sheath As Neutral</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#isIsStrandFill <em>Is Strand Fill</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getConstructionKind <em>Construction Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getDuctBankInfo <em>Duct Bank Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getShieldMaterial <em>Shield Material</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CableInfo extends ConductorInfo {
	/**
	 * The default value of the '{@link #getOuterJacketKind() <em>Outer Jacket Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJacketKind()
	 * @generated
	 * @ordered
	 */
	protected static final CableOuterJacketKind OUTER_JACKET_KIND_EDEFAULT = CableOuterJacketKind.PVC;

	/**
	 * The cached value of the '{@link #getOuterJacketKind() <em>Outer Jacket Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJacketKind()
	 * @generated
	 * @ordered
	 */
	protected CableOuterJacketKind outerJacketKind = OUTER_JACKET_KIND_EDEFAULT;

	/**
	 * This is true if the Outer Jacket Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outerJacketKindESet;

	/**
	 * The default value of the '{@link #isSheathAsNeutral() <em>Sheath As Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSheathAsNeutral()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHEATH_AS_NEUTRAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSheathAsNeutral() <em>Sheath As Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSheathAsNeutral()
	 * @generated
	 * @ordered
	 */
	protected boolean sheathAsNeutral = SHEATH_AS_NEUTRAL_EDEFAULT;

	/**
	 * This is true if the Sheath As Neutral attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sheathAsNeutralESet;

	/**
	 * The default value of the '{@link #isIsStrandFill() <em>Is Strand Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrandFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRAND_FILL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStrandFill() <em>Is Strand Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrandFill()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrandFill = IS_STRAND_FILL_EDEFAULT;

	/**
	 * This is true if the Is Strand Fill attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isStrandFillESet;

	/**
	 * The default value of the '{@link #getNominalTemperature() <em>Nominal Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalTemperature() <em>Nominal Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalTemperature()
	 * @generated
	 * @ordered
	 */
	protected float nominalTemperature = NOMINAL_TEMPERATURE_EDEFAULT;

	/**
	 * This is true if the Nominal Temperature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalTemperatureESet;

	/**
	 * The default value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected static final CableConstructionKind CONSTRUCTION_KIND_EDEFAULT = CableConstructionKind.SECTOR;

	/**
	 * The cached value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected CableConstructionKind constructionKind = CONSTRUCTION_KIND_EDEFAULT;

	/**
	 * This is true if the Construction Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constructionKindESet;

	/**
	 * The default value of the '{@link #getDiameterOverJacket() <em>Diameter Over Jacket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverJacket()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_JACKET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverJacket() <em>Diameter Over Jacket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverJacket()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverJacket = DIAMETER_OVER_JACKET_EDEFAULT;

	/**
	 * This is true if the Diameter Over Jacket attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diameterOverJacketESet;

	/**
	 * The default value of the '{@link #getDiameterOverInsulation() <em>Diameter Over Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverInsulation()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_INSULATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverInsulation() <em>Diameter Over Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverInsulation()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverInsulation = DIAMETER_OVER_INSULATION_EDEFAULT;

	/**
	 * This is true if the Diameter Over Insulation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diameterOverInsulationESet;

	/**
	 * The default value of the '{@link #getDiameterOverScreen() <em>Diameter Over Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverScreen()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_SCREEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverScreen() <em>Diameter Over Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverScreen()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverScreen = DIAMETER_OVER_SCREEN_EDEFAULT;

	/**
	 * This is true if the Diameter Over Screen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diameterOverScreenESet;

	/**
	 * The cached value of the '{@link #getDuctBankInfo() <em>Duct Bank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctBankInfo()
	 * @generated
	 * @ordered
	 */
	protected Duct ductBankInfo;

	/**
	 * The default value of the '{@link #getShieldMaterial() <em>Shield Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShieldMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final CableShieldMaterialKind SHIELD_MATERIAL_EDEFAULT = CableShieldMaterialKind.LEAD;

	/**
	 * The cached value of the '{@link #getShieldMaterial() <em>Shield Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShieldMaterial()
	 * @generated
	 * @ordered
	 */
	protected CableShieldMaterialKind shieldMaterial = SHIELD_MATERIAL_EDEFAULT;

	/**
	 * This is true if the Shield Material attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shieldMaterialESet;

	/**
	 * The default value of the '{@link #getDiameterOverCore() <em>Diameter Over Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverCore()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_CORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverCore() <em>Diameter Over Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverCore()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverCore = DIAMETER_OVER_CORE_EDEFAULT;

	/**
	 * This is true if the Diameter Over Core attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diameterOverCoreESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CableInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.CABLE_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Outer Jacket Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.AssetModels.CableOuterJacketKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Jacket Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Jacket Kind</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.CableOuterJacketKind
	 * @see #isSetOuterJacketKind()
	 * @see #unsetOuterJacketKind()
	 * @see #setOuterJacketKind(CableOuterJacketKind)
	 * @generated
	 */
	public CableOuterJacketKind getOuterJacketKind() {
		return outerJacketKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Jacket Kind</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.CableOuterJacketKind
	 * @see #isSetOuterJacketKind()
	 * @see #unsetOuterJacketKind()
	 * @see #getOuterJacketKind()
	 * @generated
	 */
	public void setOuterJacketKind(CableOuterJacketKind newOuterJacketKind) {
		outerJacketKind = newOuterJacketKind == null ? OUTER_JACKET_KIND_EDEFAULT : newOuterJacketKind;
		outerJacketKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOuterJacketKind()
	 * @see #getOuterJacketKind()
	 * @see #setOuterJacketKind(CableOuterJacketKind)
	 * @generated
	 */
	public void unsetOuterJacketKind() {
		outerJacketKind = OUTER_JACKET_KIND_EDEFAULT;
		outerJacketKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Outer Jacket Kind</em>' attribute is set.
	 * @see #unsetOuterJacketKind()
	 * @see #getOuterJacketKind()
	 * @see #setOuterJacketKind(CableOuterJacketKind)
	 * @generated
	 */
	public boolean isSetOuterJacketKind() {
		return outerJacketKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Sheath As Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheath As Neutral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheath As Neutral</em>' attribute.
	 * @see #isSetSheathAsNeutral()
	 * @see #unsetSheathAsNeutral()
	 * @see #setSheathAsNeutral(boolean)
	 * @generated
	 */
	public boolean isSheathAsNeutral() {
		return sheathAsNeutral;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#isSheathAsNeutral <em>Sheath As Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheath As Neutral</em>' attribute.
	 * @see #isSetSheathAsNeutral()
	 * @see #unsetSheathAsNeutral()
	 * @see #isSheathAsNeutral()
	 * @generated
	 */
	public void setSheathAsNeutral(boolean newSheathAsNeutral) {
		sheathAsNeutral = newSheathAsNeutral;
		sheathAsNeutralESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#isSheathAsNeutral <em>Sheath As Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSheathAsNeutral()
	 * @see #isSheathAsNeutral()
	 * @see #setSheathAsNeutral(boolean)
	 * @generated
	 */
	public void unsetSheathAsNeutral() {
		sheathAsNeutral = SHEATH_AS_NEUTRAL_EDEFAULT;
		sheathAsNeutralESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#isSheathAsNeutral <em>Sheath As Neutral</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sheath As Neutral</em>' attribute is set.
	 * @see #unsetSheathAsNeutral()
	 * @see #isSheathAsNeutral()
	 * @see #setSheathAsNeutral(boolean)
	 * @generated
	 */
	public boolean isSetSheathAsNeutral() {
		return sheathAsNeutralESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Strand Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strand Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strand Fill</em>' attribute.
	 * @see #isSetIsStrandFill()
	 * @see #unsetIsStrandFill()
	 * @see #setIsStrandFill(boolean)
	 * @generated
	 */
	public boolean isIsStrandFill() {
		return isStrandFill;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#isIsStrandFill <em>Is Strand Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strand Fill</em>' attribute.
	 * @see #isSetIsStrandFill()
	 * @see #unsetIsStrandFill()
	 * @see #isIsStrandFill()
	 * @generated
	 */
	public void setIsStrandFill(boolean newIsStrandFill) {
		isStrandFill = newIsStrandFill;
		isStrandFillESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#isIsStrandFill <em>Is Strand Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsStrandFill()
	 * @see #isIsStrandFill()
	 * @see #setIsStrandFill(boolean)
	 * @generated
	 */
	public void unsetIsStrandFill() {
		isStrandFill = IS_STRAND_FILL_EDEFAULT;
		isStrandFillESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#isIsStrandFill <em>Is Strand Fill</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Strand Fill</em>' attribute is set.
	 * @see #unsetIsStrandFill()
	 * @see #isIsStrandFill()
	 * @see #setIsStrandFill(boolean)
	 * @generated
	 */
	public boolean isSetIsStrandFill() {
		return isStrandFillESet;
	}

	/**
	 * Returns the value of the '<em><b>Nominal Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Temperature</em>' attribute.
	 * @see #isSetNominalTemperature()
	 * @see #unsetNominalTemperature()
	 * @see #setNominalTemperature(float)
	 * @generated
	 */
	public float getNominalTemperature() {
		return nominalTemperature;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Temperature</em>' attribute.
	 * @see #isSetNominalTemperature()
	 * @see #unsetNominalTemperature()
	 * @see #getNominalTemperature()
	 * @generated
	 */
	public void setNominalTemperature(float newNominalTemperature) {
		nominalTemperature = newNominalTemperature;
		nominalTemperatureESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalTemperature()
	 * @see #getNominalTemperature()
	 * @see #setNominalTemperature(float)
	 * @generated
	 */
	public void unsetNominalTemperature() {
		nominalTemperature = NOMINAL_TEMPERATURE_EDEFAULT;
		nominalTemperatureESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Temperature</em>' attribute is set.
	 * @see #unsetNominalTemperature()
	 * @see #getNominalTemperature()
	 * @see #setNominalTemperature(float)
	 * @generated
	 */
	public boolean isSetNominalTemperature() {
		return nominalTemperatureESet;
	}

	/**
	 * Returns the value of the '<em><b>Construction Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.AssetModels.CableConstructionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Kind</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.CableConstructionKind
	 * @see #isSetConstructionKind()
	 * @see #unsetConstructionKind()
	 * @see #setConstructionKind(CableConstructionKind)
	 * @generated
	 */
	public CableConstructionKind getConstructionKind() {
		return constructionKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Kind</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.CableConstructionKind
	 * @see #isSetConstructionKind()
	 * @see #unsetConstructionKind()
	 * @see #getConstructionKind()
	 * @generated
	 */
	public void setConstructionKind(CableConstructionKind newConstructionKind) {
		constructionKind = newConstructionKind == null ? CONSTRUCTION_KIND_EDEFAULT : newConstructionKind;
		constructionKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getConstructionKind <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstructionKind()
	 * @see #getConstructionKind()
	 * @see #setConstructionKind(CableConstructionKind)
	 * @generated
	 */
	public void unsetConstructionKind() {
		constructionKind = CONSTRUCTION_KIND_EDEFAULT;
		constructionKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getConstructionKind <em>Construction Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Construction Kind</em>' attribute is set.
	 * @see #unsetConstructionKind()
	 * @see #getConstructionKind()
	 * @see #setConstructionKind(CableConstructionKind)
	 * @generated
	 */
	public boolean isSetConstructionKind() {
		return constructionKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Diameter Over Jacket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Jacket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Jacket</em>' attribute.
	 * @see #isSetDiameterOverJacket()
	 * @see #unsetDiameterOverJacket()
	 * @see #setDiameterOverJacket(float)
	 * @generated
	 */
	public float getDiameterOverJacket() {
		return diameterOverJacket;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Jacket</em>' attribute.
	 * @see #isSetDiameterOverJacket()
	 * @see #unsetDiameterOverJacket()
	 * @see #getDiameterOverJacket()
	 * @generated
	 */
	public void setDiameterOverJacket(float newDiameterOverJacket) {
		diameterOverJacket = newDiameterOverJacket;
		diameterOverJacketESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiameterOverJacket()
	 * @see #getDiameterOverJacket()
	 * @see #setDiameterOverJacket(float)
	 * @generated
	 */
	public void unsetDiameterOverJacket() {
		diameterOverJacket = DIAMETER_OVER_JACKET_EDEFAULT;
		diameterOverJacketESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diameter Over Jacket</em>' attribute is set.
	 * @see #unsetDiameterOverJacket()
	 * @see #getDiameterOverJacket()
	 * @see #setDiameterOverJacket(float)
	 * @generated
	 */
	public boolean isSetDiameterOverJacket() {
		return diameterOverJacketESet;
	}

	/**
	 * Returns the value of the '<em><b>Diameter Over Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Insulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Insulation</em>' attribute.
	 * @see #isSetDiameterOverInsulation()
	 * @see #unsetDiameterOverInsulation()
	 * @see #setDiameterOverInsulation(float)
	 * @generated
	 */
	public float getDiameterOverInsulation() {
		return diameterOverInsulation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Insulation</em>' attribute.
	 * @see #isSetDiameterOverInsulation()
	 * @see #unsetDiameterOverInsulation()
	 * @see #getDiameterOverInsulation()
	 * @generated
	 */
	public void setDiameterOverInsulation(float newDiameterOverInsulation) {
		diameterOverInsulation = newDiameterOverInsulation;
		diameterOverInsulationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiameterOverInsulation()
	 * @see #getDiameterOverInsulation()
	 * @see #setDiameterOverInsulation(float)
	 * @generated
	 */
	public void unsetDiameterOverInsulation() {
		diameterOverInsulation = DIAMETER_OVER_INSULATION_EDEFAULT;
		diameterOverInsulationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diameter Over Insulation</em>' attribute is set.
	 * @see #unsetDiameterOverInsulation()
	 * @see #getDiameterOverInsulation()
	 * @see #setDiameterOverInsulation(float)
	 * @generated
	 */
	public boolean isSetDiameterOverInsulation() {
		return diameterOverInsulationESet;
	}

	/**
	 * Returns the value of the '<em><b>Diameter Over Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Screen</em>' attribute.
	 * @see #isSetDiameterOverScreen()
	 * @see #unsetDiameterOverScreen()
	 * @see #setDiameterOverScreen(float)
	 * @generated
	 */
	public float getDiameterOverScreen() {
		return diameterOverScreen;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Screen</em>' attribute.
	 * @see #isSetDiameterOverScreen()
	 * @see #unsetDiameterOverScreen()
	 * @see #getDiameterOverScreen()
	 * @generated
	 */
	public void setDiameterOverScreen(float newDiameterOverScreen) {
		diameterOverScreen = newDiameterOverScreen;
		diameterOverScreenESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiameterOverScreen()
	 * @see #getDiameterOverScreen()
	 * @see #setDiameterOverScreen(float)
	 * @generated
	 */
	public void unsetDiameterOverScreen() {
		diameterOverScreen = DIAMETER_OVER_SCREEN_EDEFAULT;
		diameterOverScreenESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diameter Over Screen</em>' attribute is set.
	 * @see #unsetDiameterOverScreen()
	 * @see #getDiameterOverScreen()
	 * @see #setDiameterOverScreen(float)
	 * @generated
	 */
	public boolean isSetDiameterOverScreen() {
		return diameterOverScreenESet;
	}

	/**
	 * Returns the value of the '<em><b>Duct Bank Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getCableInfos <em>Cable Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duct Bank Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duct Bank Info</em>' reference.
	 * @see #setDuctBankInfo(Duct)
	 * @see CIM15.IEC61970.Informative.InfAssets.Duct#getCableInfos
	 * @generated
	 */
	public Duct getDuctBankInfo() {
		if (ductBankInfo != null && ductBankInfo.eIsProxy()) {
			InternalEObject oldDuctBankInfo = (InternalEObject)ductBankInfo;
			ductBankInfo = (Duct)eResolveProxy(oldDuctBankInfo);
			if (ductBankInfo != oldDuctBankInfo) {
			}
		}
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duct basicGetDuctBankInfo() {
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuctBankInfo(Duct newDuctBankInfo, NotificationChain msgs) {
		Duct oldDuctBankInfo = ductBankInfo;
		ductBankInfo = newDuctBankInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDuctBankInfo <em>Duct Bank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duct Bank Info</em>' reference.
	 * @see #getDuctBankInfo()
	 * @generated
	 */
	public void setDuctBankInfo(Duct newDuctBankInfo) {
		if (newDuctBankInfo != ductBankInfo) {
			NotificationChain msgs = null;
			if (ductBankInfo != null)
				msgs = ((InternalEObject)ductBankInfo).eInverseRemove(this, InfAssetsPackage.DUCT__CABLE_INFOS, Duct.class, msgs);
			if (newDuctBankInfo != null)
				msgs = ((InternalEObject)newDuctBankInfo).eInverseAdd(this, InfAssetsPackage.DUCT__CABLE_INFOS, Duct.class, msgs);
			msgs = basicSetDuctBankInfo(newDuctBankInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Shield Material</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.AssetModels.CableShieldMaterialKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shield Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shield Material</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.CableShieldMaterialKind
	 * @see #isSetShieldMaterial()
	 * @see #unsetShieldMaterial()
	 * @see #setShieldMaterial(CableShieldMaterialKind)
	 * @generated
	 */
	public CableShieldMaterialKind getShieldMaterial() {
		return shieldMaterial;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getShieldMaterial <em>Shield Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shield Material</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.CableShieldMaterialKind
	 * @see #isSetShieldMaterial()
	 * @see #unsetShieldMaterial()
	 * @see #getShieldMaterial()
	 * @generated
	 */
	public void setShieldMaterial(CableShieldMaterialKind newShieldMaterial) {
		shieldMaterial = newShieldMaterial == null ? SHIELD_MATERIAL_EDEFAULT : newShieldMaterial;
		shieldMaterialESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getShieldMaterial <em>Shield Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShieldMaterial()
	 * @see #getShieldMaterial()
	 * @see #setShieldMaterial(CableShieldMaterialKind)
	 * @generated
	 */
	public void unsetShieldMaterial() {
		shieldMaterial = SHIELD_MATERIAL_EDEFAULT;
		shieldMaterialESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getShieldMaterial <em>Shield Material</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shield Material</em>' attribute is set.
	 * @see #unsetShieldMaterial()
	 * @see #getShieldMaterial()
	 * @see #setShieldMaterial(CableShieldMaterialKind)
	 * @generated
	 */
	public boolean isSetShieldMaterial() {
		return shieldMaterialESet;
	}

	/**
	 * Returns the value of the '<em><b>Diameter Over Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Core</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Core</em>' attribute.
	 * @see #isSetDiameterOverCore()
	 * @see #unsetDiameterOverCore()
	 * @see #setDiameterOverCore(float)
	 * @generated
	 */
	public float getDiameterOverCore() {
		return diameterOverCore;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Core</em>' attribute.
	 * @see #isSetDiameterOverCore()
	 * @see #unsetDiameterOverCore()
	 * @see #getDiameterOverCore()
	 * @generated
	 */
	public void setDiameterOverCore(float newDiameterOverCore) {
		diameterOverCore = newDiameterOverCore;
		diameterOverCoreESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiameterOverCore()
	 * @see #getDiameterOverCore()
	 * @see #setDiameterOverCore(float)
	 * @generated
	 */
	public void unsetDiameterOverCore() {
		diameterOverCore = DIAMETER_OVER_CORE_EDEFAULT;
		diameterOverCoreESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diameter Over Core</em>' attribute is set.
	 * @see #unsetDiameterOverCore()
	 * @see #getDiameterOverCore()
	 * @see #setDiameterOverCore(float)
	 * @generated
	 */
	public boolean isSetDiameterOverCore() {
		return diameterOverCoreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				if (ductBankInfo != null)
					msgs = ((InternalEObject)ductBankInfo).eInverseRemove(this, InfAssetsPackage.DUCT__CABLE_INFOS, Duct.class, msgs);
				return basicSetDuctBankInfo((Duct)otherEnd, msgs);
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
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				return basicSetDuctBankInfo(null, msgs);
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
			case AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND:
				return getOuterJacketKind();
			case AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
				return isSheathAsNeutral();
			case AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL:
				return isIsStrandFill();
			case AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
				return getNominalTemperature();
			case AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND:
				return getConstructionKind();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
				return getDiameterOverJacket();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
				return getDiameterOverInsulation();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
				return getDiameterOverScreen();
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				if (resolve) return getDuctBankInfo();
				return basicGetDuctBankInfo();
			case AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL:
				return getShieldMaterial();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE:
				return getDiameterOverCore();
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
			case AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND:
				setOuterJacketKind((CableOuterJacketKind)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
				setSheathAsNeutral((Boolean)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL:
				setIsStrandFill((Boolean)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
				setNominalTemperature((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND:
				setConstructionKind((CableConstructionKind)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
				setDiameterOverJacket((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
				setDiameterOverInsulation((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
				setDiameterOverScreen((Float)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				setDuctBankInfo((Duct)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL:
				setShieldMaterial((CableShieldMaterialKind)newValue);
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE:
				setDiameterOverCore((Float)newValue);
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
			case AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND:
				unsetOuterJacketKind();
				return;
			case AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
				unsetSheathAsNeutral();
				return;
			case AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL:
				unsetIsStrandFill();
				return;
			case AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
				unsetNominalTemperature();
				return;
			case AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND:
				unsetConstructionKind();
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
				unsetDiameterOverJacket();
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
				unsetDiameterOverInsulation();
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
				unsetDiameterOverScreen();
				return;
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				setDuctBankInfo((Duct)null);
				return;
			case AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL:
				unsetShieldMaterial();
				return;
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE:
				unsetDiameterOverCore();
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
			case AssetModelsPackage.CABLE_INFO__OUTER_JACKET_KIND:
				return isSetOuterJacketKind();
			case AssetModelsPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
				return isSetSheathAsNeutral();
			case AssetModelsPackage.CABLE_INFO__IS_STRAND_FILL:
				return isSetIsStrandFill();
			case AssetModelsPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
				return isSetNominalTemperature();
			case AssetModelsPackage.CABLE_INFO__CONSTRUCTION_KIND:
				return isSetConstructionKind();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
				return isSetDiameterOverJacket();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
				return isSetDiameterOverInsulation();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
				return isSetDiameterOverScreen();
			case AssetModelsPackage.CABLE_INFO__DUCT_BANK_INFO:
				return ductBankInfo != null;
			case AssetModelsPackage.CABLE_INFO__SHIELD_MATERIAL:
				return isSetShieldMaterial();
			case AssetModelsPackage.CABLE_INFO__DIAMETER_OVER_CORE:
				return isSetDiameterOverCore();
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
		result.append(" (outerJacketKind: ");
		if (outerJacketKindESet) result.append(outerJacketKind); else result.append("<unset>");
		result.append(", sheathAsNeutral: ");
		if (sheathAsNeutralESet) result.append(sheathAsNeutral); else result.append("<unset>");
		result.append(", isStrandFill: ");
		if (isStrandFillESet) result.append(isStrandFill); else result.append("<unset>");
		result.append(", nominalTemperature: ");
		if (nominalTemperatureESet) result.append(nominalTemperature); else result.append("<unset>");
		result.append(", constructionKind: ");
		if (constructionKindESet) result.append(constructionKind); else result.append("<unset>");
		result.append(", diameterOverJacket: ");
		if (diameterOverJacketESet) result.append(diameterOverJacket); else result.append("<unset>");
		result.append(", diameterOverInsulation: ");
		if (diameterOverInsulationESet) result.append(diameterOverInsulation); else result.append("<unset>");
		result.append(", diameterOverScreen: ");
		if (diameterOverScreenESet) result.append(diameterOverScreen); else result.append("<unset>");
		result.append(", shieldMaterial: ");
		if (shieldMaterialESet) result.append(shieldMaterial); else result.append("<unset>");
		result.append(", diameterOverCore: ");
		if (diameterOverCoreESet) result.append(diameterOverCore); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CableInfo
