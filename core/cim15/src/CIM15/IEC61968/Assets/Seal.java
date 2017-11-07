/**
 */
package CIM15.IEC61968.Assets;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Assets.Seal#getAppliedDateTime <em>Applied Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Seal#getSealNumber <em>Seal Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Seal#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Seal#getCondition <em>Condition</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.Seal#getAssetContainer <em>Asset Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Seal extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getAppliedDateTime() <em>Applied Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date APPLIED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppliedDateTime() <em>Applied Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date appliedDateTime = APPLIED_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Applied Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appliedDateTimeESet;

	/**
	 * The default value of the '{@link #getSealNumber() <em>Seal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SEAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSealNumber() <em>Seal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealNumber()
	 * @generated
	 * @ordered
	 */
	protected String sealNumber = SEAL_NUMBER_EDEFAULT;

	/**
	 * This is true if the Seal Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sealNumberESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SealKind KIND_EDEFAULT = SealKind.LEAD;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SealKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final SealConditionKind CONDITION_EDEFAULT = SealConditionKind.OPEN;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected SealConditionKind condition = CONDITION_EDEFAULT;

	/**
	 * This is true if the Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionESet;

	/**
	 * The cached value of the '{@link #getAssetContainer() <em>Asset Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetContainer()
	 * @generated
	 * @ordered
	 */
	protected AssetContainer assetContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Seal() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.SEAL;
	}

	/**
	 * Returns the value of the '<em><b>Applied Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Date Time</em>' attribute.
	 * @see #isSetAppliedDateTime()
	 * @see #unsetAppliedDateTime()
	 * @see #setAppliedDateTime(Date)
	 * @generated
	 */
	public Date getAppliedDateTime() {
		return appliedDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Seal#getAppliedDateTime <em>Applied Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Date Time</em>' attribute.
	 * @see #isSetAppliedDateTime()
	 * @see #unsetAppliedDateTime()
	 * @see #getAppliedDateTime()
	 * @generated
	 */
	public void setAppliedDateTime(Date newAppliedDateTime) {
		appliedDateTime = newAppliedDateTime;
		appliedDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Seal#getAppliedDateTime <em>Applied Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppliedDateTime()
	 * @see #getAppliedDateTime()
	 * @see #setAppliedDateTime(Date)
	 * @generated
	 */
	public void unsetAppliedDateTime() {
		appliedDateTime = APPLIED_DATE_TIME_EDEFAULT;
		appliedDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Seal#getAppliedDateTime <em>Applied Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applied Date Time</em>' attribute is set.
	 * @see #unsetAppliedDateTime()
	 * @see #getAppliedDateTime()
	 * @see #setAppliedDateTime(Date)
	 * @generated
	 */
	public boolean isSetAppliedDateTime() {
		return appliedDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Seal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seal Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seal Number</em>' attribute.
	 * @see #isSetSealNumber()
	 * @see #unsetSealNumber()
	 * @see #setSealNumber(String)
	 * @generated
	 */
	public String getSealNumber() {
		return sealNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Seal#getSealNumber <em>Seal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seal Number</em>' attribute.
	 * @see #isSetSealNumber()
	 * @see #unsetSealNumber()
	 * @see #getSealNumber()
	 * @generated
	 */
	public void setSealNumber(String newSealNumber) {
		sealNumber = newSealNumber;
		sealNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Seal#getSealNumber <em>Seal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSealNumber()
	 * @see #getSealNumber()
	 * @see #setSealNumber(String)
	 * @generated
	 */
	public void unsetSealNumber() {
		sealNumber = SEAL_NUMBER_EDEFAULT;
		sealNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Seal#getSealNumber <em>Seal Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seal Number</em>' attribute is set.
	 * @see #unsetSealNumber()
	 * @see #getSealNumber()
	 * @see #setSealNumber(String)
	 * @generated
	 */
	public boolean isSetSealNumber() {
		return sealNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Assets.SealKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Assets.SealKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(SealKind)
	 * @generated
	 */
	public SealKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Seal#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Assets.SealKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(SealKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Seal#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(SealKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Seal#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(SealKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Assets.SealConditionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see CIM15.IEC61968.Assets.SealConditionKind
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #setCondition(SealConditionKind)
	 * @generated
	 */
	public SealConditionKind getCondition() {
		return condition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Seal#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see CIM15.IEC61968.Assets.SealConditionKind
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @generated
	 */
	public void setCondition(SealConditionKind newCondition) {
		condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
		conditionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.Seal#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCondition()
	 * @see #getCondition()
	 * @see #setCondition(SealConditionKind)
	 * @generated
	 */
	public void unsetCondition() {
		condition = CONDITION_EDEFAULT;
		conditionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.Seal#getCondition <em>Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition</em>' attribute is set.
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @see #setCondition(SealConditionKind)
	 * @generated
	 */
	public boolean isSetCondition() {
		return conditionESet;
	}

	/**
	 * Returns the value of the '<em><b>Asset Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetContainer#getSeals <em>Seals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Container</em>' reference.
	 * @see #setAssetContainer(AssetContainer)
	 * @see CIM15.IEC61968.Assets.AssetContainer#getSeals
	 * @generated
	 */
	public AssetContainer getAssetContainer() {
		if (assetContainer != null && assetContainer.eIsProxy()) {
			InternalEObject oldAssetContainer = (InternalEObject)assetContainer;
			assetContainer = (AssetContainer)eResolveProxy(oldAssetContainer);
			if (assetContainer != oldAssetContainer) {
			}
		}
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetContainer basicGetAssetContainer() {
		return assetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssetContainer(AssetContainer newAssetContainer, NotificationChain msgs) {
		AssetContainer oldAssetContainer = assetContainer;
		assetContainer = newAssetContainer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.Seal#getAssetContainer <em>Asset Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Container</em>' reference.
	 * @see #getAssetContainer()
	 * @generated
	 */
	public void setAssetContainer(AssetContainer newAssetContainer) {
		if (newAssetContainer != assetContainer) {
			NotificationChain msgs = null;
			if (assetContainer != null)
				msgs = ((InternalEObject)assetContainer).eInverseRemove(this, AssetsPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs);
			if (newAssetContainer != null)
				msgs = ((InternalEObject)newAssetContainer).eInverseAdd(this, AssetsPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs);
			msgs = basicSetAssetContainer(newAssetContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				if (assetContainer != null)
					msgs = ((InternalEObject)assetContainer).eInverseRemove(this, AssetsPackage.ASSET_CONTAINER__SEALS, AssetContainer.class, msgs);
				return basicSetAssetContainer((AssetContainer)otherEnd, msgs);
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
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				return basicSetAssetContainer(null, msgs);
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
			case AssetsPackage.SEAL__APPLIED_DATE_TIME:
				return getAppliedDateTime();
			case AssetsPackage.SEAL__SEAL_NUMBER:
				return getSealNumber();
			case AssetsPackage.SEAL__KIND:
				return getKind();
			case AssetsPackage.SEAL__CONDITION:
				return getCondition();
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				if (resolve) return getAssetContainer();
				return basicGetAssetContainer();
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
			case AssetsPackage.SEAL__APPLIED_DATE_TIME:
				setAppliedDateTime((Date)newValue);
				return;
			case AssetsPackage.SEAL__SEAL_NUMBER:
				setSealNumber((String)newValue);
				return;
			case AssetsPackage.SEAL__KIND:
				setKind((SealKind)newValue);
				return;
			case AssetsPackage.SEAL__CONDITION:
				setCondition((SealConditionKind)newValue);
				return;
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				setAssetContainer((AssetContainer)newValue);
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
			case AssetsPackage.SEAL__APPLIED_DATE_TIME:
				unsetAppliedDateTime();
				return;
			case AssetsPackage.SEAL__SEAL_NUMBER:
				unsetSealNumber();
				return;
			case AssetsPackage.SEAL__KIND:
				unsetKind();
				return;
			case AssetsPackage.SEAL__CONDITION:
				unsetCondition();
				return;
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				setAssetContainer((AssetContainer)null);
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
			case AssetsPackage.SEAL__APPLIED_DATE_TIME:
				return isSetAppliedDateTime();
			case AssetsPackage.SEAL__SEAL_NUMBER:
				return isSetSealNumber();
			case AssetsPackage.SEAL__KIND:
				return isSetKind();
			case AssetsPackage.SEAL__CONDITION:
				return isSetCondition();
			case AssetsPackage.SEAL__ASSET_CONTAINER:
				return assetContainer != null;
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
		result.append(" (appliedDateTime: ");
		if (appliedDateTimeESet) result.append(appliedDateTime); else result.append("<unset>");
		result.append(", sealNumber: ");
		if (sealNumberESet) result.append(sealNumber); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", condition: ");
		if (conditionESet) result.append(condition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Seal
