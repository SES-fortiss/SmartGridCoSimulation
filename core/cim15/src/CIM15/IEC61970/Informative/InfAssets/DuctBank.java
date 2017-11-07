/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duct Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DuctBank#getDuctInfos <em>Duct Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DuctBank#getCircuitCount <em>Circuit Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DuctBank extends AssetContainer {
	/**
	 * The cached value of the '{@link #getDuctInfos() <em>Duct Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<Duct> ductInfos;

	/**
	 * The default value of the '{@link #getCircuitCount() <em>Circuit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CIRCUIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCircuitCount() <em>Circuit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitCount()
	 * @generated
	 * @ordered
	 */
	protected int circuitCount = CIRCUIT_COUNT_EDEFAULT;

	/**
	 * This is true if the Circuit Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean circuitCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DuctBank() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getDuctBank();
	}

	/**
	 * Returns the value of the '<em><b>Duct Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Duct}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getDuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duct Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duct Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Duct#getDuctBankInfo
	 * @generated
	 */
	public EList<Duct> getDuctInfos() {
		if (ductInfos == null) {
			ductInfos = new BasicInternalEList<Duct>(Duct.class);
		}
		return ductInfos;
	}

	/**
	 * Returns the value of the '<em><b>Circuit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Count</em>' attribute.
	 * @see #isSetCircuitCount()
	 * @see #unsetCircuitCount()
	 * @see #setCircuitCount(int)
	 * @generated
	 */
	public int getCircuitCount() {
		return circuitCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DuctBank#getCircuitCount <em>Circuit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Count</em>' attribute.
	 * @see #isSetCircuitCount()
	 * @see #unsetCircuitCount()
	 * @see #getCircuitCount()
	 * @generated
	 */
	public void setCircuitCount(int newCircuitCount) {
		circuitCount = newCircuitCount;
		circuitCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DuctBank#getCircuitCount <em>Circuit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCircuitCount()
	 * @see #getCircuitCount()
	 * @see #setCircuitCount(int)
	 * @generated
	 */
	public void unsetCircuitCount() {
		circuitCount = CIRCUIT_COUNT_EDEFAULT;
		circuitCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DuctBank#getCircuitCount <em>Circuit Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Circuit Count</em>' attribute is set.
	 * @see #unsetCircuitCount()
	 * @see #getCircuitCount()
	 * @see #setCircuitCount(int)
	 * @generated
	 */
	public boolean isSetCircuitCount() {
		return circuitCountESet;
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
			case InfAssetsPackage.DUCT_BANK__DUCT_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuctInfos()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.DUCT_BANK__DUCT_INFOS:
				return ((InternalEList<?>)getDuctInfos()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.DUCT_BANK__DUCT_INFOS:
				return getDuctInfos();
			case InfAssetsPackage.DUCT_BANK__CIRCUIT_COUNT:
				return getCircuitCount();
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
			case InfAssetsPackage.DUCT_BANK__DUCT_INFOS:
				getDuctInfos().clear();
				getDuctInfos().addAll((Collection<? extends Duct>)newValue);
				return;
			case InfAssetsPackage.DUCT_BANK__CIRCUIT_COUNT:
				setCircuitCount((Integer)newValue);
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
			case InfAssetsPackage.DUCT_BANK__DUCT_INFOS:
				getDuctInfos().clear();
				return;
			case InfAssetsPackage.DUCT_BANK__CIRCUIT_COUNT:
				unsetCircuitCount();
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
			case InfAssetsPackage.DUCT_BANK__DUCT_INFOS:
				return ductInfos != null && !ductInfos.isEmpty();
			case InfAssetsPackage.DUCT_BANK__CIRCUIT_COUNT:
				return isSetCircuitCount();
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
		result.append(" (circuitCount: ");
		if (circuitCountESet) result.append(circuitCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DuctBank
