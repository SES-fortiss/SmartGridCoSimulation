/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Wires.ACLineSegment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConductorInfo#getWireArrangements <em>Wire Arrangements</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConductorInfo#isInsulated <em>Insulated</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConductorInfo#getUsage <em>Usage</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial <em>Insulation Material</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConductorInfo#getPhaseCount <em>Phase Count</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConductorInfo#getLineSegments <em>Line Segments</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationThickness <em>Insulation Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConductorInfo extends AssetInfo {
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
	 * The default value of the '{@link #isInsulated() <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsulated() <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean insulated = INSULATED_EDEFAULT;

	/**
	 * This is true if the Insulated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulatedESet;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final ConductorUsageKind USAGE_EDEFAULT = ConductorUsageKind.SECONDARY;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected ConductorUsageKind usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * The default value of the '{@link #getInsulationMaterial() <em>Insulation Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final ConductorInsulationKind INSULATION_MATERIAL_EDEFAULT = ConductorInsulationKind.TREE_RETARDANT_CROSSLINKED_POLYETHYLENE;

	/**
	 * The cached value of the '{@link #getInsulationMaterial() <em>Insulation Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationMaterial()
	 * @generated
	 * @ordered
	 */
	protected ConductorInsulationKind insulationMaterial = INSULATION_MATERIAL_EDEFAULT;

	/**
	 * This is true if the Insulation Material attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulationMaterialESet;

	/**
	 * The default value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseCount() <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCount()
	 * @generated
	 * @ordered
	 */
	protected int phaseCount = PHASE_COUNT_EDEFAULT;

	/**
	 * This is true if the Phase Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCountESet;

	/**
	 * The cached value of the '{@link #getLineSegments() <em>Line Segments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<ACLineSegment> lineSegments;

	/**
	 * The default value of the '{@link #getInsulationThickness() <em>Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationThickness()
	 * @generated
	 * @ordered
	 */
	protected static final float INSULATION_THICKNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInsulationThickness() <em>Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationThickness()
	 * @generated
	 * @ordered
	 */
	protected float insulationThickness = INSULATION_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Insulation Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulationThicknessESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductorInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.CONDUCTOR_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Wire Arrangements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.WireArrangement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.WireArrangement#getConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Arrangements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Arrangements</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement#getConductorInfo
	 * @generated
	 */
	public EList<WireArrangement> getWireArrangements() {
		if (wireArrangements == null) {
			wireArrangements = new BasicInternalEList<WireArrangement>(WireArrangement.class);
		}
		return wireArrangements;
	}

	/**
	 * Returns the value of the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulated</em>' attribute.
	 * @see #isSetInsulated()
	 * @see #unsetInsulated()
	 * @see #setInsulated(boolean)
	 * @generated
	 */
	public boolean isInsulated() {
		return insulated;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#isInsulated <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulated</em>' attribute.
	 * @see #isSetInsulated()
	 * @see #unsetInsulated()
	 * @see #isInsulated()
	 * @generated
	 */
	public void setInsulated(boolean newInsulated) {
		insulated = newInsulated;
		insulatedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#isInsulated <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulated()
	 * @see #isInsulated()
	 * @see #setInsulated(boolean)
	 * @generated
	 */
	public void unsetInsulated() {
		insulated = INSULATED_EDEFAULT;
		insulatedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#isInsulated <em>Insulated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulated</em>' attribute is set.
	 * @see #unsetInsulated()
	 * @see #isInsulated()
	 * @see #setInsulated(boolean)
	 * @generated
	 */
	public boolean isSetInsulated() {
		return insulatedESet;
	}

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.AssetModels.ConductorUsageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.ConductorUsageKind
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(ConductorUsageKind)
	 * @generated
	 */
	public ConductorUsageKind getUsage() {
		return usage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.ConductorUsageKind
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	public void setUsage(ConductorUsageKind newUsage) {
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		usageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(ConductorUsageKind)
	 * @generated
	 */
	public void unsetUsage() {
		usage = USAGE_EDEFAULT;
		usageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(ConductorUsageKind)
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * Returns the value of the '<em><b>Insulation Material</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.AssetModels.ConductorInsulationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation Material</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.ConductorInsulationKind
	 * @see #isSetInsulationMaterial()
	 * @see #unsetInsulationMaterial()
	 * @see #setInsulationMaterial(ConductorInsulationKind)
	 * @generated
	 */
	public ConductorInsulationKind getInsulationMaterial() {
		return insulationMaterial;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial <em>Insulation Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation Material</em>' attribute.
	 * @see CIM15.IEC61968.AssetModels.ConductorInsulationKind
	 * @see #isSetInsulationMaterial()
	 * @see #unsetInsulationMaterial()
	 * @see #getInsulationMaterial()
	 * @generated
	 */
	public void setInsulationMaterial(ConductorInsulationKind newInsulationMaterial) {
		insulationMaterial = newInsulationMaterial == null ? INSULATION_MATERIAL_EDEFAULT : newInsulationMaterial;
		insulationMaterialESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial <em>Insulation Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulationMaterial()
	 * @see #getInsulationMaterial()
	 * @see #setInsulationMaterial(ConductorInsulationKind)
	 * @generated
	 */
	public void unsetInsulationMaterial() {
		insulationMaterial = INSULATION_MATERIAL_EDEFAULT;
		insulationMaterialESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial <em>Insulation Material</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulation Material</em>' attribute is set.
	 * @see #unsetInsulationMaterial()
	 * @see #getInsulationMaterial()
	 * @see #setInsulationMaterial(ConductorInsulationKind)
	 * @generated
	 */
	public boolean isSetInsulationMaterial() {
		return insulationMaterialESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Count</em>' attribute.
	 * @see #isSetPhaseCount()
	 * @see #unsetPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public int getPhaseCount() {
		return phaseCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Count</em>' attribute.
	 * @see #isSetPhaseCount()
	 * @see #unsetPhaseCount()
	 * @see #getPhaseCount()
	 * @generated
	 */
	public void setPhaseCount(int newPhaseCount) {
		phaseCount = newPhaseCount;
		phaseCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getPhaseCount <em>Phase Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCount()
	 * @see #getPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public void unsetPhaseCount() {
		phaseCount = PHASE_COUNT_EDEFAULT;
		phaseCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getPhaseCount <em>Phase Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Count</em>' attribute is set.
	 * @see #unsetPhaseCount()
	 * @see #getPhaseCount()
	 * @see #setPhaseCount(int)
	 * @generated
	 */
	public boolean isSetPhaseCount() {
		return phaseCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Line Segments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.ACLineSegment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ACLineSegment#getConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Segments</em>' reference list.
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getConductorInfo
	 * @generated
	 */
	public EList<ACLineSegment> getLineSegments() {
		if (lineSegments == null) {
			lineSegments = new BasicInternalEList<ACLineSegment>(ACLineSegment.class);
		}
		return lineSegments;
	}

	/**
	 * Returns the value of the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation Thickness</em>' attribute.
	 * @see #isSetInsulationThickness()
	 * @see #unsetInsulationThickness()
	 * @see #setInsulationThickness(float)
	 * @generated
	 */
	public float getInsulationThickness() {
		return insulationThickness;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationThickness <em>Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation Thickness</em>' attribute.
	 * @see #isSetInsulationThickness()
	 * @see #unsetInsulationThickness()
	 * @see #getInsulationThickness()
	 * @generated
	 */
	public void setInsulationThickness(float newInsulationThickness) {
		insulationThickness = newInsulationThickness;
		insulationThicknessESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationThickness <em>Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulationThickness()
	 * @see #getInsulationThickness()
	 * @see #setInsulationThickness(float)
	 * @generated
	 */
	public void unsetInsulationThickness() {
		insulationThickness = INSULATION_THICKNESS_EDEFAULT;
		insulationThicknessESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationThickness <em>Insulation Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulation Thickness</em>' attribute is set.
	 * @see #unsetInsulationThickness()
	 * @see #getInsulationThickness()
	 * @see #setInsulationThickness(float)
	 * @generated
	 */
	public boolean isSetInsulationThickness() {
		return insulationThicknessESet;
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
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWireArrangements()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLineSegments()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				return ((InternalEList<?>)getWireArrangements()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS:
				return ((InternalEList<?>)getLineSegments()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				return getWireArrangements();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATED:
				return isInsulated();
			case AssetModelsPackage.CONDUCTOR_INFO__USAGE:
				return getUsage();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL:
				return getInsulationMaterial();
			case AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT:
				return getPhaseCount();
			case AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS:
				return getLineSegments();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS:
				return getInsulationThickness();
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
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				getWireArrangements().clear();
				getWireArrangements().addAll((Collection<? extends WireArrangement>)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATED:
				setInsulated((Boolean)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__USAGE:
				setUsage((ConductorUsageKind)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL:
				setInsulationMaterial((ConductorInsulationKind)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT:
				setPhaseCount((Integer)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS:
				getLineSegments().clear();
				getLineSegments().addAll((Collection<? extends ACLineSegment>)newValue);
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS:
				setInsulationThickness((Float)newValue);
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
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				getWireArrangements().clear();
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATED:
				unsetInsulated();
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__USAGE:
				unsetUsage();
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL:
				unsetInsulationMaterial();
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT:
				unsetPhaseCount();
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS:
				getLineSegments().clear();
				return;
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS:
				unsetInsulationThickness();
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
			case AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS:
				return wireArrangements != null && !wireArrangements.isEmpty();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATED:
				return isSetInsulated();
			case AssetModelsPackage.CONDUCTOR_INFO__USAGE:
				return isSetUsage();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_MATERIAL:
				return isSetInsulationMaterial();
			case AssetModelsPackage.CONDUCTOR_INFO__PHASE_COUNT:
				return isSetPhaseCount();
			case AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS:
				return lineSegments != null && !lineSegments.isEmpty();
			case AssetModelsPackage.CONDUCTOR_INFO__INSULATION_THICKNESS:
				return isSetInsulationThickness();
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
		result.append(" (insulated: ");
		if (insulatedESet) result.append(insulated); else result.append("<unset>");
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(", insulationMaterial: ");
		if (insulationMaterialESet) result.append(insulationMaterial); else result.append("<unset>");
		result.append(", phaseCount: ");
		if (phaseCountESet) result.append(phaseCount); else result.append("<unset>");
		result.append(", insulationThickness: ");
		if (insulationThicknessESet) result.append(insulationThickness); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ConductorInfo
