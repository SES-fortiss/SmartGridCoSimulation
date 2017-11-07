/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM15.IEC61970.Informative.InfAssets.MountingPoint;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overhead Conductor Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint <em>Mounting Point</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount <em>Phase Conductor Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverheadConductorInfo extends ConductorInfo {
	/**
	 * The cached value of the '{@link #getMountingPoint() <em>Mounting Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPoint()
	 * @generated
	 * @ordered
	 */
	protected MountingPoint mountingPoint;

	/**
	 * The default value of the '{@link #getNeutralInsulationThickness() <em>Neutral Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralInsulationThickness()
	 * @generated
	 * @ordered
	 */
	protected static final float NEUTRAL_INSULATION_THICKNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNeutralInsulationThickness() <em>Neutral Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralInsulationThickness()
	 * @generated
	 * @ordered
	 */
	protected float neutralInsulationThickness = NEUTRAL_INSULATION_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Neutral Insulation Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean neutralInsulationThicknessESet;

	/**
	 * The default value of the '{@link #getPhaseConductorSpacing() <em>Phase Conductor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseConductorSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_CONDUCTOR_SPACING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseConductorSpacing() <em>Phase Conductor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseConductorSpacing()
	 * @generated
	 * @ordered
	 */
	protected float phaseConductorSpacing = PHASE_CONDUCTOR_SPACING_EDEFAULT;

	/**
	 * This is true if the Phase Conductor Spacing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseConductorSpacingESet;

	/**
	 * The default value of the '{@link #getPhaseConductorCount() <em>Phase Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseConductorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_CONDUCTOR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhaseConductorCount() <em>Phase Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseConductorCount()
	 * @generated
	 * @ordered
	 */
	protected int phaseConductorCount = PHASE_CONDUCTOR_COUNT_EDEFAULT;

	/**
	 * This is true if the Phase Conductor Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseConductorCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverheadConductorInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.OVERHEAD_CONDUCTOR_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Mounting Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors <em>Overhead Conductors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Point</em>' reference.
	 * @see #setMountingPoint(MountingPoint)
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors
	 * @generated
	 */
	public MountingPoint getMountingPoint() {
		if (mountingPoint != null && mountingPoint.eIsProxy()) {
			InternalEObject oldMountingPoint = (InternalEObject)mountingPoint;
			mountingPoint = (MountingPoint)eResolveProxy(oldMountingPoint);
			if (mountingPoint != oldMountingPoint) {
			}
		}
		return mountingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountingPoint basicGetMountingPoint() {
		return mountingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMountingPoint(MountingPoint newMountingPoint, NotificationChain msgs) {
		MountingPoint oldMountingPoint = mountingPoint;
		mountingPoint = newMountingPoint;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint <em>Mounting Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounting Point</em>' reference.
	 * @see #getMountingPoint()
	 * @generated
	 */
	public void setMountingPoint(MountingPoint newMountingPoint) {
		if (newMountingPoint != mountingPoint) {
			NotificationChain msgs = null;
			if (mountingPoint != null)
				msgs = ((InternalEObject)mountingPoint).eInverseRemove(this, InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS, MountingPoint.class, msgs);
			if (newMountingPoint != null)
				msgs = ((InternalEObject)newMountingPoint).eInverseAdd(this, InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS, MountingPoint.class, msgs);
			msgs = basicSetMountingPoint(newMountingPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Neutral Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral Insulation Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Insulation Thickness</em>' attribute.
	 * @see #isSetNeutralInsulationThickness()
	 * @see #unsetNeutralInsulationThickness()
	 * @see #setNeutralInsulationThickness(float)
	 * @generated
	 */
	public float getNeutralInsulationThickness() {
		return neutralInsulationThickness;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Insulation Thickness</em>' attribute.
	 * @see #isSetNeutralInsulationThickness()
	 * @see #unsetNeutralInsulationThickness()
	 * @see #getNeutralInsulationThickness()
	 * @generated
	 */
	public void setNeutralInsulationThickness(float newNeutralInsulationThickness) {
		neutralInsulationThickness = newNeutralInsulationThickness;
		neutralInsulationThicknessESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeutralInsulationThickness()
	 * @see #getNeutralInsulationThickness()
	 * @see #setNeutralInsulationThickness(float)
	 * @generated
	 */
	public void unsetNeutralInsulationThickness() {
		neutralInsulationThickness = NEUTRAL_INSULATION_THICKNESS_EDEFAULT;
		neutralInsulationThicknessESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Neutral Insulation Thickness</em>' attribute is set.
	 * @see #unsetNeutralInsulationThickness()
	 * @see #getNeutralInsulationThickness()
	 * @see #setNeutralInsulationThickness(float)
	 * @generated
	 */
	public boolean isSetNeutralInsulationThickness() {
		return neutralInsulationThicknessESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Conductor Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Conductor Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Conductor Spacing</em>' attribute.
	 * @see #isSetPhaseConductorSpacing()
	 * @see #unsetPhaseConductorSpacing()
	 * @see #setPhaseConductorSpacing(float)
	 * @generated
	 */
	public float getPhaseConductorSpacing() {
		return phaseConductorSpacing;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Conductor Spacing</em>' attribute.
	 * @see #isSetPhaseConductorSpacing()
	 * @see #unsetPhaseConductorSpacing()
	 * @see #getPhaseConductorSpacing()
	 * @generated
	 */
	public void setPhaseConductorSpacing(float newPhaseConductorSpacing) {
		phaseConductorSpacing = newPhaseConductorSpacing;
		phaseConductorSpacingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseConductorSpacing()
	 * @see #getPhaseConductorSpacing()
	 * @see #setPhaseConductorSpacing(float)
	 * @generated
	 */
	public void unsetPhaseConductorSpacing() {
		phaseConductorSpacing = PHASE_CONDUCTOR_SPACING_EDEFAULT;
		phaseConductorSpacingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Conductor Spacing</em>' attribute is set.
	 * @see #unsetPhaseConductorSpacing()
	 * @see #getPhaseConductorSpacing()
	 * @see #setPhaseConductorSpacing(float)
	 * @generated
	 */
	public boolean isSetPhaseConductorSpacing() {
		return phaseConductorSpacingESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Conductor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Conductor Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Conductor Count</em>' attribute.
	 * @see #isSetPhaseConductorCount()
	 * @see #unsetPhaseConductorCount()
	 * @see #setPhaseConductorCount(int)
	 * @generated
	 */
	public int getPhaseConductorCount() {
		return phaseConductorCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount <em>Phase Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Conductor Count</em>' attribute.
	 * @see #isSetPhaseConductorCount()
	 * @see #unsetPhaseConductorCount()
	 * @see #getPhaseConductorCount()
	 * @generated
	 */
	public void setPhaseConductorCount(int newPhaseConductorCount) {
		phaseConductorCount = newPhaseConductorCount;
		phaseConductorCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount <em>Phase Conductor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseConductorCount()
	 * @see #getPhaseConductorCount()
	 * @see #setPhaseConductorCount(int)
	 * @generated
	 */
	public void unsetPhaseConductorCount() {
		phaseConductorCount = PHASE_CONDUCTOR_COUNT_EDEFAULT;
		phaseConductorCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount <em>Phase Conductor Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Conductor Count</em>' attribute is set.
	 * @see #unsetPhaseConductorCount()
	 * @see #getPhaseConductorCount()
	 * @see #setPhaseConductorCount(int)
	 * @generated
	 */
	public boolean isSetPhaseConductorCount() {
		return phaseConductorCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				if (mountingPoint != null)
					msgs = ((InternalEObject)mountingPoint).eInverseRemove(this, InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS, MountingPoint.class, msgs);
				return basicSetMountingPoint((MountingPoint)otherEnd, msgs);
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				return basicSetMountingPoint(null, msgs);
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				if (resolve) return getMountingPoint();
				return basicGetMountingPoint();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS:
				return getNeutralInsulationThickness();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING:
				return getPhaseConductorSpacing();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT:
				return getPhaseConductorCount();
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				setMountingPoint((MountingPoint)newValue);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS:
				setNeutralInsulationThickness((Float)newValue);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING:
				setPhaseConductorSpacing((Float)newValue);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT:
				setPhaseConductorCount((Integer)newValue);
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				setMountingPoint((MountingPoint)null);
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS:
				unsetNeutralInsulationThickness();
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING:
				unsetPhaseConductorSpacing();
				return;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT:
				unsetPhaseConductorCount();
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
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT:
				return mountingPoint != null;
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS:
				return isSetNeutralInsulationThickness();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING:
				return isSetPhaseConductorSpacing();
			case AssetModelsPackage.OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT:
				return isSetPhaseConductorCount();
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
		result.append(" (neutralInsulationThickness: ");
		if (neutralInsulationThicknessESet) result.append(neutralInsulationThickness); else result.append("<unset>");
		result.append(", phaseConductorSpacing: ");
		if (phaseConductorSpacingESet) result.append(phaseConductorSpacing); else result.append("<unset>");
		result.append(", phaseConductorCount: ");
		if (phaseConductorCountESet) result.append(phaseConductorCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OverheadConductorInfo
