/**
 */
package CIM15.IEC61968.AssetModels;

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
 * A representation of the model object '<em><b>Wire Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getCoreRadius <em>Core Radius</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getRAC50 <em>RAC50</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getWireArrangements <em>Wire Arrangements</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getCoreStrandCount <em>Core Strand Count</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getRadius <em>Radius</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getMaterial <em>Material</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getRDC20 <em>RDC20</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getSizeDescription <em>Size Description</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getRAC75 <em>RAC75</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getGmr <em>Gmr</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos <em>Concentric Neutral Cable Infos</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getStrandCount <em>Strand Count</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireType#getRAC25 <em>RAC25</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireType extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getCoreRadius() <em>Core Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreRadius()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_RADIUS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreRadius() <em>Core Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreRadius()
	 * @generated
	 * @ordered
	 */
	protected float coreRadius = CORE_RADIUS_EDEFAULT;

	/**
	 * This is true if the Core Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreRadiusESet;

	/**
	 * The default value of the '{@link #getRAC50() <em>RAC50</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC50()
	 * @generated
	 * @ordered
	 */
	protected static final float RAC50_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRAC50() <em>RAC50</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC50()
	 * @generated
	 * @ordered
	 */
	protected float rAC50 = RAC50_EDEFAULT;

	/**
	 * This is true if the RAC50 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rAC50ESet;

	/**
	 * The cached value of the '{@link #getWireArrangements() <em>Wire Arrangements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireArrangements()
	 * @generated
	 * @ordered
	 */
	protected EList<WireArrangement> wireArrangements;

	/**
	 * The default value of the '{@link #getCoreStrandCount() <em>Core Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreStrandCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_STRAND_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreStrandCount() <em>Core Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreStrandCount()
	 * @generated
	 * @ordered
	 */
	protected int coreStrandCount = CORE_STRAND_COUNT_EDEFAULT;

	/**
	 * This is true if the Core Strand Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreStrandCountESet;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final float RADIUS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected float radius = RADIUS_EDEFAULT;

	/**
	 * This is true if the Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radiusESet;

	/**
	 * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final ConductorMaterialKind MATERIAL_EDEFAULT = ConductorMaterialKind.ALUMINUM;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected ConductorMaterialKind material = MATERIAL_EDEFAULT;

	/**
	 * This is true if the Material attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materialESet;

	/**
	 * The default value of the '{@link #getRDC20() <em>RDC20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDC20()
	 * @generated
	 * @ordered
	 */
	protected static final float RDC20_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRDC20() <em>RDC20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDC20()
	 * @generated
	 * @ordered
	 */
	protected float rDC20 = RDC20_EDEFAULT;

	/**
	 * This is true if the RDC20 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rDC20ESet;

	/**
	 * The default value of the '{@link #getSizeDescription() <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeDescription() <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDescription()
	 * @generated
	 * @ordered
	 */
	protected String sizeDescription = SIZE_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Size Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeDescriptionESet;

	/**
	 * The default value of the '{@link #getRAC75() <em>RAC75</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC75()
	 * @generated
	 * @ordered
	 */
	protected static final float RAC75_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRAC75() <em>RAC75</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC75()
	 * @generated
	 * @ordered
	 */
	protected float rAC75 = RAC75_EDEFAULT;

	/**
	 * This is true if the RAC75 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rAC75ESet;

	/**
	 * The default value of the '{@link #getGmr() <em>Gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmr()
	 * @generated
	 * @ordered
	 */
	protected static final float GMR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGmr() <em>Gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmr()
	 * @generated
	 * @ordered
	 */
	protected float gmr = GMR_EDEFAULT;

	/**
	 * This is true if the Gmr attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gmrESet;

	/**
	 * The cached value of the '{@link #getConcentricNeutralCableInfos() <em>Concentric Neutral Cable Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentricNeutralCableInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcentricNeutralCableInfo> concentricNeutralCableInfos;

	/**
	 * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratedCurrent = RATED_CURRENT_EDEFAULT;

	/**
	 * This is true if the Rated Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedCurrentESet;

	/**
	 * The default value of the '{@link #getStrandCount() <em>Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrandCount()
	 * @generated
	 * @ordered
	 */
	protected static final int STRAND_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrandCount() <em>Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrandCount()
	 * @generated
	 * @ordered
	 */
	protected int strandCount = STRAND_COUNT_EDEFAULT;

	/**
	 * This is true if the Strand Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strandCountESet;

	/**
	 * The default value of the '{@link #getRAC25() <em>RAC25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC25()
	 * @generated
	 * @ordered
	 */
	protected static final float RAC25_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRAC25() <em>RAC25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRAC25()
	 * @generated
	 * @ordered
	 */
	protected float rAC25 = RAC25_EDEFAULT;

	/**
	 * This is true if the RAC25 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rAC25ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.WIRE_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Core Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Radius</em>' attribute.
	 * @see #isSetCoreRadius()
	 * @see #unsetCoreRadius()
	 * @see #setCoreRadius(float)
	 * @generated
	 */
	public float getCoreRadius() {
		return coreRadius;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getCoreRadius <em>Core Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Radius</em>' attribute.
	 * @see #isSetCoreRadius()
	 * @see #unsetCoreRadius()
	 * @see #getCoreRadius()
	 * @generated
	 */
	public void setCoreRadius(float newCoreRadius) {
		coreRadius = newCoreRadius;
		coreRadiusESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getCoreRadius <em>Core Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreRadius()
	 * @see #getCoreRadius()
	 * @see #setCoreRadius(float)
	 * @generated
	 */
	public void unsetCoreRadius() {
		coreRadius = CORE_RADIUS_EDEFAULT;
		coreRadiusESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getCoreRadius <em>Core Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Radius</em>' attribute is set.
	 * @see #unsetCoreRadius()
	 * @see #getCoreRadius()
	 * @see #setCoreRadius(float)
	 * @generated
	 */
	public boolean isSetCoreRadius() {
		return coreRadiusESet;
	}

	/**
	 * Returns the value of the '<em><b>RAC50</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RAC50</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RAC50</em>' attribute.
	 * @see #isSetRAC50()
	 * @see #unsetRAC50()
	 * @see #setRAC50(float)
	 * @generated
	 */
	public float getRAC50() {
		return rAC50;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC50 <em>RAC50</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RAC50</em>' attribute.
	 * @see #isSetRAC50()
	 * @see #unsetRAC50()
	 * @see #getRAC50()
	 * @generated
	 */
	public void setRAC50(float newRAC50) {
		rAC50 = newRAC50;
		rAC50ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC50 <em>RAC50</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRAC50()
	 * @see #getRAC50()
	 * @see #setRAC50(float)
	 * @generated
	 */
	public void unsetRAC50() {
		rAC50 = RAC50_EDEFAULT;
		rAC50ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC50 <em>RAC50</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>RAC50</em>' attribute is set.
	 * @see #unsetRAC50()
	 * @see #getRAC50()
	 * @see #setRAC50(float)
	 * @generated
	 */
	public boolean isSetRAC50() {
		return rAC50ESet;
	}

	/**
	 * Returns the value of the '<em><b>Wire Arrangements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.WireArrangement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.WireArrangement#getWireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Arrangements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Arrangements</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement#getWireType
	 * @generated
	 */
	public EList<WireArrangement> getWireArrangements() {
		if (wireArrangements == null) {
			wireArrangements = new BasicInternalEList<WireArrangement>(WireArrangement.class);
		}
		return wireArrangements;
	}

	/**
	 * Returns the value of the '<em><b>Core Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Strand Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Strand Count</em>' attribute.
	 * @see #isSetCoreStrandCount()
	 * @see #unsetCoreStrandCount()
	 * @see #setCoreStrandCount(int)
	 * @generated
	 */
	public int getCoreStrandCount() {
		return coreStrandCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getCoreStrandCount <em>Core Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Strand Count</em>' attribute.
	 * @see #isSetCoreStrandCount()
	 * @see #unsetCoreStrandCount()
	 * @see #getCoreStrandCount()
	 * @generated
	 */
	public void setCoreStrandCount(int newCoreStrandCount) {
		coreStrandCount = newCoreStrandCount;
		coreStrandCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getCoreStrandCount <em>Core Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreStrandCount()
	 * @see #getCoreStrandCount()
	 * @see #setCoreStrandCount(int)
	 * @generated
	 */
	public void unsetCoreStrandCount() {
		coreStrandCount = CORE_STRAND_COUNT_EDEFAULT;
		coreStrandCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getCoreStrandCount <em>Core Strand Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Strand Count</em>' attribute is set.
	 * @see #unsetCoreStrandCount()
	 * @see #getCoreStrandCount()
	 * @see #setCoreStrandCount(int)
	 * @generated
	 */
	public boolean isSetCoreStrandCount() {
		return coreStrandCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(float)
	 * @generated
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	public void setRadius(float newRadius) {
		radius = newRadius;
		radiusESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(float)
	 * @generated
	 */
	public void unsetRadius() {
		radius = RADIUS_EDEFAULT;
		radiusESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRadius <em>Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' attribute is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(float)
	 * @generated
	 */
	public boolean isSetRadius() {
		return radiusESet;
	}

	/**
	 * Returns the value of the '<em><b>Material</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.AssetModels.ConductorMaterialKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.ConductorMaterialKind
	 * @see #isSetMaterial()
	 * @see #unsetMaterial()
	 * @see #setMaterial(ConductorMaterialKind)
	 * @generated
	 */
	public ConductorMaterialKind getMaterial() {
		return material;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.ConductorMaterialKind
	 * @see #isSetMaterial()
	 * @see #unsetMaterial()
	 * @see #getMaterial()
	 * @generated
	 */
	public void setMaterial(ConductorMaterialKind newMaterial) {
		material = newMaterial == null ? MATERIAL_EDEFAULT : newMaterial;
		materialESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaterial()
	 * @see #getMaterial()
	 * @see #setMaterial(ConductorMaterialKind)
	 * @generated
	 */
	public void unsetMaterial() {
		material = MATERIAL_EDEFAULT;
		materialESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getMaterial <em>Material</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Material</em>' attribute is set.
	 * @see #unsetMaterial()
	 * @see #getMaterial()
	 * @see #setMaterial(ConductorMaterialKind)
	 * @generated
	 */
	public boolean isSetMaterial() {
		return materialESet;
	}

	/**
	 * Returns the value of the '<em><b>RDC20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDC20</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDC20</em>' attribute.
	 * @see #isSetRDC20()
	 * @see #unsetRDC20()
	 * @see #setRDC20(float)
	 * @generated
	 */
	public float getRDC20() {
		return rDC20;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRDC20 <em>RDC20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDC20</em>' attribute.
	 * @see #isSetRDC20()
	 * @see #unsetRDC20()
	 * @see #getRDC20()
	 * @generated
	 */
	public void setRDC20(float newRDC20) {
		rDC20 = newRDC20;
		rDC20ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRDC20 <em>RDC20</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRDC20()
	 * @see #getRDC20()
	 * @see #setRDC20(float)
	 * @generated
	 */
	public void unsetRDC20() {
		rDC20 = RDC20_EDEFAULT;
		rDC20ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRDC20 <em>RDC20</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>RDC20</em>' attribute is set.
	 * @see #unsetRDC20()
	 * @see #getRDC20()
	 * @see #setRDC20(float)
	 * @generated
	 */
	public boolean isSetRDC20() {
		return rDC20ESet;
	}

	/**
	 * Returns the value of the '<em><b>Size Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Description</em>' attribute.
	 * @see #isSetSizeDescription()
	 * @see #unsetSizeDescription()
	 * @see #setSizeDescription(String)
	 * @generated
	 */
	public String getSizeDescription() {
		return sizeDescription;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getSizeDescription <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Description</em>' attribute.
	 * @see #isSetSizeDescription()
	 * @see #unsetSizeDescription()
	 * @see #getSizeDescription()
	 * @generated
	 */
	public void setSizeDescription(String newSizeDescription) {
		sizeDescription = newSizeDescription;
		sizeDescriptionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getSizeDescription <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeDescription()
	 * @see #getSizeDescription()
	 * @see #setSizeDescription(String)
	 * @generated
	 */
	public void unsetSizeDescription() {
		sizeDescription = SIZE_DESCRIPTION_EDEFAULT;
		sizeDescriptionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getSizeDescription <em>Size Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Description</em>' attribute is set.
	 * @see #unsetSizeDescription()
	 * @see #getSizeDescription()
	 * @see #setSizeDescription(String)
	 * @generated
	 */
	public boolean isSetSizeDescription() {
		return sizeDescriptionESet;
	}

	/**
	 * Returns the value of the '<em><b>RAC75</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RAC75</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RAC75</em>' attribute.
	 * @see #isSetRAC75()
	 * @see #unsetRAC75()
	 * @see #setRAC75(float)
	 * @generated
	 */
	public float getRAC75() {
		return rAC75;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC75 <em>RAC75</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RAC75</em>' attribute.
	 * @see #isSetRAC75()
	 * @see #unsetRAC75()
	 * @see #getRAC75()
	 * @generated
	 */
	public void setRAC75(float newRAC75) {
		rAC75 = newRAC75;
		rAC75ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC75 <em>RAC75</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRAC75()
	 * @see #getRAC75()
	 * @see #setRAC75(float)
	 * @generated
	 */
	public void unsetRAC75() {
		rAC75 = RAC75_EDEFAULT;
		rAC75ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC75 <em>RAC75</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>RAC75</em>' attribute is set.
	 * @see #unsetRAC75()
	 * @see #getRAC75()
	 * @see #setRAC75(float)
	 * @generated
	 */
	public boolean isSetRAC75() {
		return rAC75ESet;
	}

	/**
	 * Returns the value of the '<em><b>Gmr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gmr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gmr</em>' attribute.
	 * @see #isSetGmr()
	 * @see #unsetGmr()
	 * @see #setGmr(float)
	 * @generated
	 */
	public float getGmr() {
		return gmr;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getGmr <em>Gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gmr</em>' attribute.
	 * @see #isSetGmr()
	 * @see #unsetGmr()
	 * @see #getGmr()
	 * @generated
	 */
	public void setGmr(float newGmr) {
		gmr = newGmr;
		gmrESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getGmr <em>Gmr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGmr()
	 * @see #getGmr()
	 * @see #setGmr(float)
	 * @generated
	 */
	public void unsetGmr() {
		gmr = GMR_EDEFAULT;
		gmrESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getGmr <em>Gmr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gmr</em>' attribute is set.
	 * @see #unsetGmr()
	 * @see #getGmr()
	 * @see #setGmr(float)
	 * @generated
	 */
	public boolean isSetGmr() {
		return gmrESet;
	}

	/**
	 * Returns the value of the '<em><b>Concentric Neutral Cable Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentric Neutral Cable Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentric Neutral Cable Infos</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType
	 * @generated
	 */
	public EList<ConcentricNeutralCableInfo> getConcentricNeutralCableInfos() {
		if (concentricNeutralCableInfos == null) {
			concentricNeutralCableInfos = new BasicInternalEList<ConcentricNeutralCableInfo>(ConcentricNeutralCableInfo.class);
		}
		return concentricNeutralCableInfos;
	}

	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #isSetRatedCurrent()
	 * @see #unsetRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public float getRatedCurrent() {
		return ratedCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #isSetRatedCurrent()
	 * @see #unsetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @generated
	 */
	public void setRatedCurrent(float newRatedCurrent) {
		ratedCurrent = newRatedCurrent;
		ratedCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public void unsetRatedCurrent() {
		ratedCurrent = RATED_CURRENT_EDEFAULT;
		ratedCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRatedCurrent <em>Rated Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Current</em>' attribute is set.
	 * @see #unsetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public boolean isSetRatedCurrent() {
		return ratedCurrentESet;
	}

	/**
	 * Returns the value of the '<em><b>Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strand Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strand Count</em>' attribute.
	 * @see #isSetStrandCount()
	 * @see #unsetStrandCount()
	 * @see #setStrandCount(int)
	 * @generated
	 */
	public int getStrandCount() {
		return strandCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getStrandCount <em>Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strand Count</em>' attribute.
	 * @see #isSetStrandCount()
	 * @see #unsetStrandCount()
	 * @see #getStrandCount()
	 * @generated
	 */
	public void setStrandCount(int newStrandCount) {
		strandCount = newStrandCount;
		strandCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getStrandCount <em>Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrandCount()
	 * @see #getStrandCount()
	 * @see #setStrandCount(int)
	 * @generated
	 */
	public void unsetStrandCount() {
		strandCount = STRAND_COUNT_EDEFAULT;
		strandCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getStrandCount <em>Strand Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strand Count</em>' attribute is set.
	 * @see #unsetStrandCount()
	 * @see #getStrandCount()
	 * @see #setStrandCount(int)
	 * @generated
	 */
	public boolean isSetStrandCount() {
		return strandCountESet;
	}

	/**
	 * Returns the value of the '<em><b>RAC25</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RAC25</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RAC25</em>' attribute.
	 * @see #isSetRAC25()
	 * @see #unsetRAC25()
	 * @see #setRAC25(float)
	 * @generated
	 */
	public float getRAC25() {
		return rAC25;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC25 <em>RAC25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RAC25</em>' attribute.
	 * @see #isSetRAC25()
	 * @see #unsetRAC25()
	 * @see #getRAC25()
	 * @generated
	 */
	public void setRAC25(float newRAC25) {
		rAC25 = newRAC25;
		rAC25ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC25 <em>RAC25</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRAC25()
	 * @see #getRAC25()
	 * @see #setRAC25(float)
	 * @generated
	 */
	public void unsetRAC25() {
		rAC25 = RAC25_EDEFAULT;
		rAC25ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireType#getRAC25 <em>RAC25</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>RAC25</em>' attribute is set.
	 * @see #unsetRAC25()
	 * @see #getRAC25()
	 * @see #setRAC25(float)
	 * @generated
	 */
	public boolean isSetRAC25() {
		return rAC25ESet;
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
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWireArrangements()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcentricNeutralCableInfos()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				return ((InternalEList<?>)getWireArrangements()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				return ((InternalEList<?>)getConcentricNeutralCableInfos()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.WIRE_TYPE__CORE_RADIUS:
				return getCoreRadius();
			case AssetModelsPackage.WIRE_TYPE__RAC50:
				return getRAC50();
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				return getWireArrangements();
			case AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT:
				return getCoreStrandCount();
			case AssetModelsPackage.WIRE_TYPE__RADIUS:
				return getRadius();
			case AssetModelsPackage.WIRE_TYPE__MATERIAL:
				return getMaterial();
			case AssetModelsPackage.WIRE_TYPE__RDC20:
				return getRDC20();
			case AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION:
				return getSizeDescription();
			case AssetModelsPackage.WIRE_TYPE__RAC75:
				return getRAC75();
			case AssetModelsPackage.WIRE_TYPE__GMR:
				return getGmr();
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				return getConcentricNeutralCableInfos();
			case AssetModelsPackage.WIRE_TYPE__RATED_CURRENT:
				return getRatedCurrent();
			case AssetModelsPackage.WIRE_TYPE__STRAND_COUNT:
				return getStrandCount();
			case AssetModelsPackage.WIRE_TYPE__RAC25:
				return getRAC25();
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
			case AssetModelsPackage.WIRE_TYPE__CORE_RADIUS:
				setCoreRadius((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC50:
				setRAC50((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				getWireArrangements().clear();
				getWireArrangements().addAll((Collection<? extends WireArrangement>)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT:
				setCoreStrandCount((Integer)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RADIUS:
				setRadius((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__MATERIAL:
				setMaterial((ConductorMaterialKind)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RDC20:
				setRDC20((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION:
				setSizeDescription((String)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC75:
				setRAC75((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__GMR:
				setGmr((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				getConcentricNeutralCableInfos().clear();
				getConcentricNeutralCableInfos().addAll((Collection<? extends ConcentricNeutralCableInfo>)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__STRAND_COUNT:
				setStrandCount((Integer)newValue);
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC25:
				setRAC25((Float)newValue);
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
			case AssetModelsPackage.WIRE_TYPE__CORE_RADIUS:
				unsetCoreRadius();
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC50:
				unsetRAC50();
				return;
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				getWireArrangements().clear();
				return;
			case AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT:
				unsetCoreStrandCount();
				return;
			case AssetModelsPackage.WIRE_TYPE__RADIUS:
				unsetRadius();
				return;
			case AssetModelsPackage.WIRE_TYPE__MATERIAL:
				unsetMaterial();
				return;
			case AssetModelsPackage.WIRE_TYPE__RDC20:
				unsetRDC20();
				return;
			case AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION:
				unsetSizeDescription();
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC75:
				unsetRAC75();
				return;
			case AssetModelsPackage.WIRE_TYPE__GMR:
				unsetGmr();
				return;
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				getConcentricNeutralCableInfos().clear();
				return;
			case AssetModelsPackage.WIRE_TYPE__RATED_CURRENT:
				unsetRatedCurrent();
				return;
			case AssetModelsPackage.WIRE_TYPE__STRAND_COUNT:
				unsetStrandCount();
				return;
			case AssetModelsPackage.WIRE_TYPE__RAC25:
				unsetRAC25();
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
			case AssetModelsPackage.WIRE_TYPE__CORE_RADIUS:
				return isSetCoreRadius();
			case AssetModelsPackage.WIRE_TYPE__RAC50:
				return isSetRAC50();
			case AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS:
				return wireArrangements != null && !wireArrangements.isEmpty();
			case AssetModelsPackage.WIRE_TYPE__CORE_STRAND_COUNT:
				return isSetCoreStrandCount();
			case AssetModelsPackage.WIRE_TYPE__RADIUS:
				return isSetRadius();
			case AssetModelsPackage.WIRE_TYPE__MATERIAL:
				return isSetMaterial();
			case AssetModelsPackage.WIRE_TYPE__RDC20:
				return isSetRDC20();
			case AssetModelsPackage.WIRE_TYPE__SIZE_DESCRIPTION:
				return isSetSizeDescription();
			case AssetModelsPackage.WIRE_TYPE__RAC75:
				return isSetRAC75();
			case AssetModelsPackage.WIRE_TYPE__GMR:
				return isSetGmr();
			case AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS:
				return concentricNeutralCableInfos != null && !concentricNeutralCableInfos.isEmpty();
			case AssetModelsPackage.WIRE_TYPE__RATED_CURRENT:
				return isSetRatedCurrent();
			case AssetModelsPackage.WIRE_TYPE__STRAND_COUNT:
				return isSetStrandCount();
			case AssetModelsPackage.WIRE_TYPE__RAC25:
				return isSetRAC25();
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
		result.append(" (coreRadius: ");
		if (coreRadiusESet) result.append(coreRadius); else result.append("<unset>");
		result.append(", rAC50: ");
		if (rAC50ESet) result.append(rAC50); else result.append("<unset>");
		result.append(", coreStrandCount: ");
		if (coreStrandCountESet) result.append(coreStrandCount); else result.append("<unset>");
		result.append(", radius: ");
		if (radiusESet) result.append(radius); else result.append("<unset>");
		result.append(", material: ");
		if (materialESet) result.append(material); else result.append("<unset>");
		result.append(", rDC20: ");
		if (rDC20ESet) result.append(rDC20); else result.append("<unset>");
		result.append(", sizeDescription: ");
		if (sizeDescriptionESet) result.append(sizeDescription); else result.append("<unset>");
		result.append(", rAC75: ");
		if (rAC75ESet) result.append(rAC75); else result.append("<unset>");
		result.append(", gmr: ");
		if (gmrESet) result.append(gmr); else result.append("<unset>");
		result.append(", ratedCurrent: ");
		if (ratedCurrentESet) result.append(ratedCurrent); else result.append("<unset>");
		result.append(", strandCount: ");
		if (strandCountESet) result.append(strandCount); else result.append("<unset>");
		result.append(", rAC25: ");
		if (rAC25ESet) result.append(rAC25); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WireType
