/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pole</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#isBreastBlock <em>Breast Block</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getBaseKind <em>Base Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getJpaReference <em>Jpa Reference</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatmentKind <em>Treatment Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getPreservativeKind <em>Preservative Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getStreetlights <em>Streetlights</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getLength <em>Length</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getConstruction <em>Construction</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getSpeciesType <em>Species Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getClassification <em>Classification</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatedDateTime <em>Treated Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Pole extends Structure {
	/**
	 * The default value of the '{@link #isBreastBlock() <em>Breast Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreastBlock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BREAST_BLOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBreastBlock() <em>Breast Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBreastBlock()
	 * @generated
	 * @ordered
	 */
	protected boolean breastBlock = BREAST_BLOCK_EDEFAULT;

	/**
	 * This is true if the Breast Block attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean breastBlockESet;

	/**
	 * The default value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected float diameter = DIAMETER_EDEFAULT;

	/**
	 * This is true if the Diameter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diameterESet;

	/**
	 * The default value of the '{@link #getBaseKind() <em>Base Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseKind()
	 * @generated
	 * @ordered
	 */
	protected static final PoleBaseKind BASE_KIND_EDEFAULT = PoleBaseKind.DIRT;

	/**
	 * The cached value of the '{@link #getBaseKind() <em>Base Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseKind()
	 * @generated
	 * @ordered
	 */
	protected PoleBaseKind baseKind = BASE_KIND_EDEFAULT;

	/**
	 * This is true if the Base Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseKindESet;

	/**
	 * The default value of the '{@link #getJpaReference() <em>Jpa Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpaReference()
	 * @generated
	 * @ordered
	 */
	protected static final String JPA_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJpaReference() <em>Jpa Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpaReference()
	 * @generated
	 * @ordered
	 */
	protected String jpaReference = JPA_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Jpa Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean jpaReferenceESet;

	/**
	 * The default value of the '{@link #getTreatmentKind() <em>Treatment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentKind()
	 * @generated
	 * @ordered
	 */
	protected static final PoleTreatmentKind TREATMENT_KIND_EDEFAULT = PoleTreatmentKind.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTreatmentKind() <em>Treatment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentKind()
	 * @generated
	 * @ordered
	 */
	protected PoleTreatmentKind treatmentKind = TREATMENT_KIND_EDEFAULT;

	/**
	 * This is true if the Treatment Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean treatmentKindESet;

	/**
	 * The default value of the '{@link #getPreservativeKind() <em>Preservative Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreservativeKind()
	 * @generated
	 * @ordered
	 */
	protected static final PolePreservativeKind PRESERVATIVE_KIND_EDEFAULT = PolePreservativeKind.PENTA;

	/**
	 * The cached value of the '{@link #getPreservativeKind() <em>Preservative Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreservativeKind()
	 * @generated
	 * @ordered
	 */
	protected PolePreservativeKind preservativeKind = PRESERVATIVE_KIND_EDEFAULT;

	/**
	 * This is true if the Preservative Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preservativeKindESet;

	/**
	 * The cached value of the '{@link #getStreetlights() <em>Streetlights</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetlights()
	 * @generated
	 * @ordered
	 */
	protected EList<Streetlight> streetlights;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * This is true if the Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lengthESet;

	/**
	 * The default value of the '{@link #getConstruction() <em>Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstruction() <em>Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstruction()
	 * @generated
	 * @ordered
	 */
	protected String construction = CONSTRUCTION_EDEFAULT;

	/**
	 * This is true if the Construction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constructionESet;

	/**
	 * The default value of the '{@link #getSpeciesType() <em>Species Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeciesType()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIES_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeciesType() <em>Species Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeciesType()
	 * @generated
	 * @ordered
	 */
	protected String speciesType = SPECIES_TYPE_EDEFAULT;

	/**
	 * This is true if the Species Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speciesTypeESet;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected String classification = CLASSIFICATION_EDEFAULT;

	/**
	 * This is true if the Classification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classificationESet;

	/**
	 * The default value of the '{@link #getTreatedDateTime() <em>Treated Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TREATED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreatedDateTime() <em>Treated Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date treatedDateTime = TREATED_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Treated Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean treatedDateTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pole() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getPole();
	}

	/**
	 * Returns the value of the '<em><b>Breast Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breast Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breast Block</em>' attribute.
	 * @see #isSetBreastBlock()
	 * @see #unsetBreastBlock()
	 * @see #setBreastBlock(boolean)
	 * @generated
	 */
	public boolean isBreastBlock() {
		return breastBlock;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#isBreastBlock <em>Breast Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breast Block</em>' attribute.
	 * @see #isSetBreastBlock()
	 * @see #unsetBreastBlock()
	 * @see #isBreastBlock()
	 * @generated
	 */
	public void setBreastBlock(boolean newBreastBlock) {
		breastBlock = newBreastBlock;
		breastBlockESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#isBreastBlock <em>Breast Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBreastBlock()
	 * @see #isBreastBlock()
	 * @see #setBreastBlock(boolean)
	 * @generated
	 */
	public void unsetBreastBlock() {
		breastBlock = BREAST_BLOCK_EDEFAULT;
		breastBlockESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#isBreastBlock <em>Breast Block</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Breast Block</em>' attribute is set.
	 * @see #unsetBreastBlock()
	 * @see #isBreastBlock()
	 * @see #setBreastBlock(boolean)
	 * @generated
	 */
	public boolean isSetBreastBlock() {
		return breastBlockESet;
	}

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' attribute.
	 * @see #isSetDiameter()
	 * @see #unsetDiameter()
	 * @see #setDiameter(float)
	 * @generated
	 */
	public float getDiameter() {
		return diameter;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getDiameter <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' attribute.
	 * @see #isSetDiameter()
	 * @see #unsetDiameter()
	 * @see #getDiameter()
	 * @generated
	 */
	public void setDiameter(float newDiameter) {
		diameter = newDiameter;
		diameterESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getDiameter <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiameter()
	 * @see #getDiameter()
	 * @see #setDiameter(float)
	 * @generated
	 */
	public void unsetDiameter() {
		diameter = DIAMETER_EDEFAULT;
		diameterESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getDiameter <em>Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diameter</em>' attribute is set.
	 * @see #unsetDiameter()
	 * @see #getDiameter()
	 * @see #setDiameter(float)
	 * @generated
	 */
	public boolean isSetDiameter() {
		return diameterESet;
	}

	/**
	 * Returns the value of the '<em><b>Base Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.PoleBaseKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.PoleBaseKind
	 * @see #isSetBaseKind()
	 * @see #unsetBaseKind()
	 * @see #setBaseKind(PoleBaseKind)
	 * @generated
	 */
	public PoleBaseKind getBaseKind() {
		return baseKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getBaseKind <em>Base Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.PoleBaseKind
	 * @see #isSetBaseKind()
	 * @see #unsetBaseKind()
	 * @see #getBaseKind()
	 * @generated
	 */
	public void setBaseKind(PoleBaseKind newBaseKind) {
		baseKind = newBaseKind == null ? BASE_KIND_EDEFAULT : newBaseKind;
		baseKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getBaseKind <em>Base Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseKind()
	 * @see #getBaseKind()
	 * @see #setBaseKind(PoleBaseKind)
	 * @generated
	 */
	public void unsetBaseKind() {
		baseKind = BASE_KIND_EDEFAULT;
		baseKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getBaseKind <em>Base Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Kind</em>' attribute is set.
	 * @see #unsetBaseKind()
	 * @see #getBaseKind()
	 * @see #setBaseKind(PoleBaseKind)
	 * @generated
	 */
	public boolean isSetBaseKind() {
		return baseKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Jpa Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jpa Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpa Reference</em>' attribute.
	 * @see #isSetJpaReference()
	 * @see #unsetJpaReference()
	 * @see #setJpaReference(String)
	 * @generated
	 */
	public String getJpaReference() {
		return jpaReference;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getJpaReference <em>Jpa Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jpa Reference</em>' attribute.
	 * @see #isSetJpaReference()
	 * @see #unsetJpaReference()
	 * @see #getJpaReference()
	 * @generated
	 */
	public void setJpaReference(String newJpaReference) {
		jpaReference = newJpaReference;
		jpaReferenceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getJpaReference <em>Jpa Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJpaReference()
	 * @see #getJpaReference()
	 * @see #setJpaReference(String)
	 * @generated
	 */
	public void unsetJpaReference() {
		jpaReference = JPA_REFERENCE_EDEFAULT;
		jpaReferenceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getJpaReference <em>Jpa Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Jpa Reference</em>' attribute is set.
	 * @see #unsetJpaReference()
	 * @see #getJpaReference()
	 * @see #setJpaReference(String)
	 * @generated
	 */
	public boolean isSetJpaReference() {
		return jpaReferenceESet;
	}

	/**
	 * Returns the value of the '<em><b>Treatment Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.PoleTreatmentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatment Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.PoleTreatmentKind
	 * @see #isSetTreatmentKind()
	 * @see #unsetTreatmentKind()
	 * @see #setTreatmentKind(PoleTreatmentKind)
	 * @generated
	 */
	public PoleTreatmentKind getTreatmentKind() {
		return treatmentKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatmentKind <em>Treatment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.PoleTreatmentKind
	 * @see #isSetTreatmentKind()
	 * @see #unsetTreatmentKind()
	 * @see #getTreatmentKind()
	 * @generated
	 */
	public void setTreatmentKind(PoleTreatmentKind newTreatmentKind) {
		treatmentKind = newTreatmentKind == null ? TREATMENT_KIND_EDEFAULT : newTreatmentKind;
		treatmentKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatmentKind <em>Treatment Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTreatmentKind()
	 * @see #getTreatmentKind()
	 * @see #setTreatmentKind(PoleTreatmentKind)
	 * @generated
	 */
	public void unsetTreatmentKind() {
		treatmentKind = TREATMENT_KIND_EDEFAULT;
		treatmentKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatmentKind <em>Treatment Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Treatment Kind</em>' attribute is set.
	 * @see #unsetTreatmentKind()
	 * @see #getTreatmentKind()
	 * @see #setTreatmentKind(PoleTreatmentKind)
	 * @generated
	 */
	public boolean isSetTreatmentKind() {
		return treatmentKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Preservative Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.PolePreservativeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preservative Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preservative Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.PolePreservativeKind
	 * @see #isSetPreservativeKind()
	 * @see #unsetPreservativeKind()
	 * @see #setPreservativeKind(PolePreservativeKind)
	 * @generated
	 */
	public PolePreservativeKind getPreservativeKind() {
		return preservativeKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getPreservativeKind <em>Preservative Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preservative Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.PolePreservativeKind
	 * @see #isSetPreservativeKind()
	 * @see #unsetPreservativeKind()
	 * @see #getPreservativeKind()
	 * @generated
	 */
	public void setPreservativeKind(PolePreservativeKind newPreservativeKind) {
		preservativeKind = newPreservativeKind == null ? PRESERVATIVE_KIND_EDEFAULT : newPreservativeKind;
		preservativeKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getPreservativeKind <em>Preservative Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreservativeKind()
	 * @see #getPreservativeKind()
	 * @see #setPreservativeKind(PolePreservativeKind)
	 * @generated
	 */
	public void unsetPreservativeKind() {
		preservativeKind = PRESERVATIVE_KIND_EDEFAULT;
		preservativeKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getPreservativeKind <em>Preservative Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preservative Kind</em>' attribute is set.
	 * @see #unsetPreservativeKind()
	 * @see #getPreservativeKind()
	 * @see #setPreservativeKind(PolePreservativeKind)
	 * @generated
	 */
	public boolean isSetPreservativeKind() {
		return preservativeKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Streetlights</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Streetlight}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getPole <em>Pole</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Streetlights</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streetlights</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Streetlight#getPole
	 * @generated
	 */
	public EList<Streetlight> getStreetlights() {
		if (streetlights == null) {
			streetlights = new BasicInternalEList<Streetlight>(Streetlight.class);
		}
		return streetlights;
	}

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(float)
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	public void setLength(float newLength) {
		length = newLength;
		lengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(float)
	 * @generated
	 */
	public void unsetLength() {
		length = LENGTH_EDEFAULT;
		lengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(float)
	 * @generated
	 */
	public boolean isSetLength() {
		return lengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Construction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction</em>' attribute.
	 * @see #isSetConstruction()
	 * @see #unsetConstruction()
	 * @see #setConstruction(String)
	 * @generated
	 */
	public String getConstruction() {
		return construction;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getConstruction <em>Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction</em>' attribute.
	 * @see #isSetConstruction()
	 * @see #unsetConstruction()
	 * @see #getConstruction()
	 * @generated
	 */
	public void setConstruction(String newConstruction) {
		construction = newConstruction;
		constructionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getConstruction <em>Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstruction()
	 * @see #getConstruction()
	 * @see #setConstruction(String)
	 * @generated
	 */
	public void unsetConstruction() {
		construction = CONSTRUCTION_EDEFAULT;
		constructionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getConstruction <em>Construction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Construction</em>' attribute is set.
	 * @see #unsetConstruction()
	 * @see #getConstruction()
	 * @see #setConstruction(String)
	 * @generated
	 */
	public boolean isSetConstruction() {
		return constructionESet;
	}

	/**
	 * Returns the value of the '<em><b>Species Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species Type</em>' attribute.
	 * @see #isSetSpeciesType()
	 * @see #unsetSpeciesType()
	 * @see #setSpeciesType(String)
	 * @generated
	 */
	public String getSpeciesType() {
		return speciesType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getSpeciesType <em>Species Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species Type</em>' attribute.
	 * @see #isSetSpeciesType()
	 * @see #unsetSpeciesType()
	 * @see #getSpeciesType()
	 * @generated
	 */
	public void setSpeciesType(String newSpeciesType) {
		speciesType = newSpeciesType;
		speciesTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getSpeciesType <em>Species Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeciesType()
	 * @see #getSpeciesType()
	 * @see #setSpeciesType(String)
	 * @generated
	 */
	public void unsetSpeciesType() {
		speciesType = SPECIES_TYPE_EDEFAULT;
		speciesTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getSpeciesType <em>Species Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Species Type</em>' attribute is set.
	 * @see #unsetSpeciesType()
	 * @see #getSpeciesType()
	 * @see #setSpeciesType(String)
	 * @generated
	 */
	public boolean isSetSpeciesType() {
		return speciesTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #isSetClassification()
	 * @see #unsetClassification()
	 * @see #setClassification(String)
	 * @generated
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #isSetClassification()
	 * @see #unsetClassification()
	 * @see #getClassification()
	 * @generated
	 */
	public void setClassification(String newClassification) {
		classification = newClassification;
		classificationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassification()
	 * @see #getClassification()
	 * @see #setClassification(String)
	 * @generated
	 */
	public void unsetClassification() {
		classification = CLASSIFICATION_EDEFAULT;
		classificationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getClassification <em>Classification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classification</em>' attribute is set.
	 * @see #unsetClassification()
	 * @see #getClassification()
	 * @see #setClassification(String)
	 * @generated
	 */
	public boolean isSetClassification() {
		return classificationESet;
	}

	/**
	 * Returns the value of the '<em><b>Treated Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treated Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treated Date Time</em>' attribute.
	 * @see #isSetTreatedDateTime()
	 * @see #unsetTreatedDateTime()
	 * @see #setTreatedDateTime(Date)
	 * @generated
	 */
	public Date getTreatedDateTime() {
		return treatedDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatedDateTime <em>Treated Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treated Date Time</em>' attribute.
	 * @see #isSetTreatedDateTime()
	 * @see #unsetTreatedDateTime()
	 * @see #getTreatedDateTime()
	 * @generated
	 */
	public void setTreatedDateTime(Date newTreatedDateTime) {
		treatedDateTime = newTreatedDateTime;
		treatedDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatedDateTime <em>Treated Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTreatedDateTime()
	 * @see #getTreatedDateTime()
	 * @see #setTreatedDateTime(Date)
	 * @generated
	 */
	public void unsetTreatedDateTime() {
		treatedDateTime = TREATED_DATE_TIME_EDEFAULT;
		treatedDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatedDateTime <em>Treated Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Treated Date Time</em>' attribute is set.
	 * @see #unsetTreatedDateTime()
	 * @see #getTreatedDateTime()
	 * @see #setTreatedDateTime(Date)
	 * @generated
	 */
	public boolean isSetTreatedDateTime() {
		return treatedDateTimeESet;
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
			case InfAssetsPackage.POLE__STREETLIGHTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStreetlights()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.POLE__STREETLIGHTS:
				return ((InternalEList<?>)getStreetlights()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.POLE__BREAST_BLOCK:
				return isBreastBlock();
			case InfAssetsPackage.POLE__DIAMETER:
				return getDiameter();
			case InfAssetsPackage.POLE__BASE_KIND:
				return getBaseKind();
			case InfAssetsPackage.POLE__JPA_REFERENCE:
				return getJpaReference();
			case InfAssetsPackage.POLE__TREATMENT_KIND:
				return getTreatmentKind();
			case InfAssetsPackage.POLE__PRESERVATIVE_KIND:
				return getPreservativeKind();
			case InfAssetsPackage.POLE__STREETLIGHTS:
				return getStreetlights();
			case InfAssetsPackage.POLE__LENGTH:
				return getLength();
			case InfAssetsPackage.POLE__CONSTRUCTION:
				return getConstruction();
			case InfAssetsPackage.POLE__SPECIES_TYPE:
				return getSpeciesType();
			case InfAssetsPackage.POLE__CLASSIFICATION:
				return getClassification();
			case InfAssetsPackage.POLE__TREATED_DATE_TIME:
				return getTreatedDateTime();
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
			case InfAssetsPackage.POLE__BREAST_BLOCK:
				setBreastBlock((Boolean)newValue);
				return;
			case InfAssetsPackage.POLE__DIAMETER:
				setDiameter((Float)newValue);
				return;
			case InfAssetsPackage.POLE__BASE_KIND:
				setBaseKind((PoleBaseKind)newValue);
				return;
			case InfAssetsPackage.POLE__JPA_REFERENCE:
				setJpaReference((String)newValue);
				return;
			case InfAssetsPackage.POLE__TREATMENT_KIND:
				setTreatmentKind((PoleTreatmentKind)newValue);
				return;
			case InfAssetsPackage.POLE__PRESERVATIVE_KIND:
				setPreservativeKind((PolePreservativeKind)newValue);
				return;
			case InfAssetsPackage.POLE__STREETLIGHTS:
				getStreetlights().clear();
				getStreetlights().addAll((Collection<? extends Streetlight>)newValue);
				return;
			case InfAssetsPackage.POLE__LENGTH:
				setLength((Float)newValue);
				return;
			case InfAssetsPackage.POLE__CONSTRUCTION:
				setConstruction((String)newValue);
				return;
			case InfAssetsPackage.POLE__SPECIES_TYPE:
				setSpeciesType((String)newValue);
				return;
			case InfAssetsPackage.POLE__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case InfAssetsPackage.POLE__TREATED_DATE_TIME:
				setTreatedDateTime((Date)newValue);
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
			case InfAssetsPackage.POLE__BREAST_BLOCK:
				unsetBreastBlock();
				return;
			case InfAssetsPackage.POLE__DIAMETER:
				unsetDiameter();
				return;
			case InfAssetsPackage.POLE__BASE_KIND:
				unsetBaseKind();
				return;
			case InfAssetsPackage.POLE__JPA_REFERENCE:
				unsetJpaReference();
				return;
			case InfAssetsPackage.POLE__TREATMENT_KIND:
				unsetTreatmentKind();
				return;
			case InfAssetsPackage.POLE__PRESERVATIVE_KIND:
				unsetPreservativeKind();
				return;
			case InfAssetsPackage.POLE__STREETLIGHTS:
				getStreetlights().clear();
				return;
			case InfAssetsPackage.POLE__LENGTH:
				unsetLength();
				return;
			case InfAssetsPackage.POLE__CONSTRUCTION:
				unsetConstruction();
				return;
			case InfAssetsPackage.POLE__SPECIES_TYPE:
				unsetSpeciesType();
				return;
			case InfAssetsPackage.POLE__CLASSIFICATION:
				unsetClassification();
				return;
			case InfAssetsPackage.POLE__TREATED_DATE_TIME:
				unsetTreatedDateTime();
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
			case InfAssetsPackage.POLE__BREAST_BLOCK:
				return isSetBreastBlock();
			case InfAssetsPackage.POLE__DIAMETER:
				return isSetDiameter();
			case InfAssetsPackage.POLE__BASE_KIND:
				return isSetBaseKind();
			case InfAssetsPackage.POLE__JPA_REFERENCE:
				return isSetJpaReference();
			case InfAssetsPackage.POLE__TREATMENT_KIND:
				return isSetTreatmentKind();
			case InfAssetsPackage.POLE__PRESERVATIVE_KIND:
				return isSetPreservativeKind();
			case InfAssetsPackage.POLE__STREETLIGHTS:
				return streetlights != null && !streetlights.isEmpty();
			case InfAssetsPackage.POLE__LENGTH:
				return isSetLength();
			case InfAssetsPackage.POLE__CONSTRUCTION:
				return isSetConstruction();
			case InfAssetsPackage.POLE__SPECIES_TYPE:
				return isSetSpeciesType();
			case InfAssetsPackage.POLE__CLASSIFICATION:
				return isSetClassification();
			case InfAssetsPackage.POLE__TREATED_DATE_TIME:
				return isSetTreatedDateTime();
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
		result.append(" (breastBlock: ");
		if (breastBlockESet) result.append(breastBlock); else result.append("<unset>");
		result.append(", diameter: ");
		if (diameterESet) result.append(diameter); else result.append("<unset>");
		result.append(", baseKind: ");
		if (baseKindESet) result.append(baseKind); else result.append("<unset>");
		result.append(", jpaReference: ");
		if (jpaReferenceESet) result.append(jpaReference); else result.append("<unset>");
		result.append(", treatmentKind: ");
		if (treatmentKindESet) result.append(treatmentKind); else result.append("<unset>");
		result.append(", preservativeKind: ");
		if (preservativeKindESet) result.append(preservativeKind); else result.append("<unset>");
		result.append(", length: ");
		if (lengthESet) result.append(length); else result.append("<unset>");
		result.append(", construction: ");
		if (constructionESet) result.append(construction); else result.append("<unset>");
		result.append(", speciesType: ");
		if (speciesTypeESet) result.append(speciesType); else result.append("<unset>");
		result.append(", classification: ");
		if (classificationESet) result.append(classification); else result.append("<unset>");
		result.append(", treatedDateTime: ");
		if (treatedDateTimeESet) result.append(treatedDateTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Pole
