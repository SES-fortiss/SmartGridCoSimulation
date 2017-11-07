/**
 */
package CIM15.IEC61970.Informative.InfAssets;

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
 * A representation of the model object '<em><b>Power Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets <em>Transformer Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getStage <em>Stage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getPowerRating <em>Power Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind <em>Cooling Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerRating extends IdentifiedObject {
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
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final int STAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected int stage = STAGE_EDEFAULT;

	/**
	 * This is true if the Stage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stageESet;

	/**
	 * The default value of the '{@link #getPowerRating() <em>Power Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerRating()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPowerRating() <em>Power Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerRating()
	 * @generated
	 * @ordered
	 */
	protected float powerRating = POWER_RATING_EDEFAULT;

	/**
	 * This is true if the Power Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerRatingESet;

	/**
	 * The default value of the '{@link #getCoolingKind() <em>Cooling Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolingKind()
	 * @generated
	 * @ordered
	 */
	protected static final CoolingKind COOLING_KIND_EDEFAULT = CoolingKind.FORCED_AIR;

	/**
	 * The cached value of the '{@link #getCoolingKind() <em>Cooling Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolingKind()
	 * @generated
	 * @ordered
	 */
	protected CoolingKind coolingKind = COOLING_KIND_EDEFAULT;

	/**
	 * This is true if the Cooling Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coolingKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerRating() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getPowerRating();
	}

	/**
	 * Returns the value of the '<em><b>Transformer Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings <em>Power Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Assets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings
	 * @generated
	 */
	public EList<TransformerAsset> getTransformerAssets() {
		if (transformerAssets == null) {
			transformerAssets = new BasicInternalEList<TransformerAsset>(TransformerAsset.class);
		}
		return transformerAssets;
	}

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #setStage(int)
	 * @generated
	 */
	public int getStage() {
		return stage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #getStage()
	 * @generated
	 */
	public void setStage(int newStage) {
		stage = newStage;
		stageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStage()
	 * @see #getStage()
	 * @see #setStage(int)
	 * @generated
	 */
	public void unsetStage() {
		stage = STAGE_EDEFAULT;
		stageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getStage <em>Stage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stage</em>' attribute is set.
	 * @see #unsetStage()
	 * @see #getStage()
	 * @see #setStage(int)
	 * @generated
	 */
	public boolean isSetStage() {
		return stageESet;
	}

	/**
	 * Returns the value of the '<em><b>Power Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Rating</em>' attribute.
	 * @see #isSetPowerRating()
	 * @see #unsetPowerRating()
	 * @see #setPowerRating(float)
	 * @generated
	 */
	public float getPowerRating() {
		return powerRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getPowerRating <em>Power Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Rating</em>' attribute.
	 * @see #isSetPowerRating()
	 * @see #unsetPowerRating()
	 * @see #getPowerRating()
	 * @generated
	 */
	public void setPowerRating(float newPowerRating) {
		powerRating = newPowerRating;
		powerRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getPowerRating <em>Power Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPowerRating()
	 * @see #getPowerRating()
	 * @see #setPowerRating(float)
	 * @generated
	 */
	public void unsetPowerRating() {
		powerRating = POWER_RATING_EDEFAULT;
		powerRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getPowerRating <em>Power Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power Rating</em>' attribute is set.
	 * @see #unsetPowerRating()
	 * @see #getPowerRating()
	 * @see #setPowerRating(float)
	 * @generated
	 */
	public boolean isSetPowerRating() {
		return powerRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Cooling Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.CoolingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.CoolingKind
	 * @see #isSetCoolingKind()
	 * @see #unsetCoolingKind()
	 * @see #setCoolingKind(CoolingKind)
	 * @generated
	 */
	public CoolingKind getCoolingKind() {
		return coolingKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind <em>Cooling Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.CoolingKind
	 * @see #isSetCoolingKind()
	 * @see #unsetCoolingKind()
	 * @see #getCoolingKind()
	 * @generated
	 */
	public void setCoolingKind(CoolingKind newCoolingKind) {
		coolingKind = newCoolingKind == null ? COOLING_KIND_EDEFAULT : newCoolingKind;
		coolingKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind <em>Cooling Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoolingKind()
	 * @see #getCoolingKind()
	 * @see #setCoolingKind(CoolingKind)
	 * @generated
	 */
	public void unsetCoolingKind() {
		coolingKind = COOLING_KIND_EDEFAULT;
		coolingKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind <em>Cooling Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cooling Kind</em>' attribute is set.
	 * @see #unsetCoolingKind()
	 * @see #getCoolingKind()
	 * @see #setCoolingKind(CoolingKind)
	 * @generated
	 */
	public boolean isSetCoolingKind() {
		return coolingKindESet;
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
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerAssets()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				return ((InternalEList<?>)getTransformerAssets()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				return getTransformerAssets();
			case InfAssetsPackage.POWER_RATING__STAGE:
				return getStage();
			case InfAssetsPackage.POWER_RATING__POWER_RATING:
				return getPowerRating();
			case InfAssetsPackage.POWER_RATING__COOLING_KIND:
				return getCoolingKind();
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
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				getTransformerAssets().addAll((Collection<? extends TransformerAsset>)newValue);
				return;
			case InfAssetsPackage.POWER_RATING__STAGE:
				setStage((Integer)newValue);
				return;
			case InfAssetsPackage.POWER_RATING__POWER_RATING:
				setPowerRating((Float)newValue);
				return;
			case InfAssetsPackage.POWER_RATING__COOLING_KIND:
				setCoolingKind((CoolingKind)newValue);
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
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				return;
			case InfAssetsPackage.POWER_RATING__STAGE:
				unsetStage();
				return;
			case InfAssetsPackage.POWER_RATING__POWER_RATING:
				unsetPowerRating();
				return;
			case InfAssetsPackage.POWER_RATING__COOLING_KIND:
				unsetCoolingKind();
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
			case InfAssetsPackage.POWER_RATING__TRANSFORMER_ASSETS:
				return transformerAssets != null && !transformerAssets.isEmpty();
			case InfAssetsPackage.POWER_RATING__STAGE:
				return isSetStage();
			case InfAssetsPackage.POWER_RATING__POWER_RATING:
				return isSetPowerRating();
			case InfAssetsPackage.POWER_RATING__COOLING_KIND:
				return isSetCoolingKind();
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
		result.append(" (stage: ");
		if (stageESet) result.append(stage); else result.append("<unset>");
		result.append(", powerRating: ");
		if (powerRatingESet) result.append(powerRating); else result.append("<unset>");
		result.append(", coolingKind: ");
		if (coolingKindESet) result.append(coolingKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PowerRating
