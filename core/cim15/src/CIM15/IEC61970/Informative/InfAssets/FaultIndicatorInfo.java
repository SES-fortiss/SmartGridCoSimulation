/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Indicator Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getFaultIndicators <em>Fault Indicators</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind <em>Reset Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultIndicatorInfo extends AssetInfo {
	/**
	 * The cached value of the '{@link #getFaultIndicators() <em>Fault Indicators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultIndicators()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultIndicator> faultIndicators;

	/**
	 * The default value of the '{@link #getResetKind() <em>Reset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetKind()
	 * @generated
	 * @ordered
	 */
	protected static final FaultIndicatorResetKind RESET_KIND_EDEFAULT = FaultIndicatorResetKind.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getResetKind() <em>Reset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetKind()
	 * @generated
	 * @ordered
	 */
	protected FaultIndicatorResetKind resetKind = RESET_KIND_EDEFAULT;

	/**
	 * This is true if the Reset Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resetKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultIndicatorInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getFaultIndicatorInfo();
	}

	/**
	 * Returns the value of the '<em><b>Fault Indicators</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator#getFaultIndicatorInfo <em>Fault Indicator Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Indicators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Indicators</em>' reference list.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator#getFaultIndicatorInfo
	 * @generated
	 */
	public EList<FaultIndicator> getFaultIndicators() {
		if (faultIndicators == null) {
			faultIndicators = new BasicInternalEList<FaultIndicator>(FaultIndicator.class);
		}
		return faultIndicators;
	}

	/**
	 * Returns the value of the '<em><b>Reset Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorResetKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorResetKind
	 * @see #isSetResetKind()
	 * @see #unsetResetKind()
	 * @see #setResetKind(FaultIndicatorResetKind)
	 * @generated
	 */
	public FaultIndicatorResetKind getResetKind() {
		return resetKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind <em>Reset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorResetKind
	 * @see #isSetResetKind()
	 * @see #unsetResetKind()
	 * @see #getResetKind()
	 * @generated
	 */
	public void setResetKind(FaultIndicatorResetKind newResetKind) {
		resetKind = newResetKind == null ? RESET_KIND_EDEFAULT : newResetKind;
		resetKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind <em>Reset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResetKind()
	 * @see #getResetKind()
	 * @see #setResetKind(FaultIndicatorResetKind)
	 * @generated
	 */
	public void unsetResetKind() {
		resetKind = RESET_KIND_EDEFAULT;
		resetKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind <em>Reset Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reset Kind</em>' attribute is set.
	 * @see #unsetResetKind()
	 * @see #getResetKind()
	 * @see #setResetKind(FaultIndicatorResetKind)
	 * @generated
	 */
	public boolean isSetResetKind() {
		return resetKindESet;
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFaultIndicators()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS:
				return ((InternalEList<?>)getFaultIndicators()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS:
				return getFaultIndicators();
			case InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND:
				return getResetKind();
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS:
				getFaultIndicators().clear();
				getFaultIndicators().addAll((Collection<? extends FaultIndicator>)newValue);
				return;
			case InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND:
				setResetKind((FaultIndicatorResetKind)newValue);
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS:
				getFaultIndicators().clear();
				return;
			case InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND:
				unsetResetKind();
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
			case InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS:
				return faultIndicators != null && !faultIndicators.isEmpty();
			case InfAssetsPackage.FAULT_INDICATOR_INFO__RESET_KIND:
				return isSetResetKind();
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
		result.append(" (resetKind: ");
		if (resetKindESet) result.append(resetKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // FaultIndicatorInfo
