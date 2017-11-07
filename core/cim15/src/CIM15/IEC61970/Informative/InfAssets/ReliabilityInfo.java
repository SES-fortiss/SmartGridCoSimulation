/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

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
 * A representation of the model object '<em><b>Reliability Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate <em>Mom Failure Rate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification <em>Specification</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR <em>MTTR</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets <em>Assets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReliabilityInfo extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getMomFailureRate() <em>Mom Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomFailureRate()
	 * @generated
	 * @ordered
	 */
	protected static final float MOM_FAILURE_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMomFailureRate() <em>Mom Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomFailureRate()
	 * @generated
	 * @ordered
	 */
	protected float momFailureRate = MOM_FAILURE_RATE_EDEFAULT;

	/**
	 * This is true if the Mom Failure Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momFailureRateESet;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification specification;

	/**
	 * The default value of the '{@link #getMTTR() <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTR()
	 * @generated
	 * @ordered
	 */
	protected static final float MTTR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMTTR() <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTR()
	 * @generated
	 * @ordered
	 */
	protected float mTTR = MTTR_EDEFAULT;

	/**
	 * This is true if the MTTR attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mTTRESet;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliabilityInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getReliabilityInfo();
	}

	/**
	 * Returns the value of the '<em><b>Mom Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mom Failure Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mom Failure Rate</em>' attribute.
	 * @see #isSetMomFailureRate()
	 * @see #unsetMomFailureRate()
	 * @see #setMomFailureRate(float)
	 * @generated
	 */
	public float getMomFailureRate() {
		return momFailureRate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate <em>Mom Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mom Failure Rate</em>' attribute.
	 * @see #isSetMomFailureRate()
	 * @see #unsetMomFailureRate()
	 * @see #getMomFailureRate()
	 * @generated
	 */
	public void setMomFailureRate(float newMomFailureRate) {
		momFailureRate = newMomFailureRate;
		momFailureRateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate <em>Mom Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomFailureRate()
	 * @see #getMomFailureRate()
	 * @see #setMomFailureRate(float)
	 * @generated
	 */
	public void unsetMomFailureRate() {
		momFailureRate = MOM_FAILURE_RATE_EDEFAULT;
		momFailureRateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate <em>Mom Failure Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mom Failure Rate</em>' attribute is set.
	 * @see #unsetMomFailureRate()
	 * @see #getMomFailureRate()
	 * @see #setMomFailureRate(float)
	 * @generated
	 */
	public boolean isSetMomFailureRate() {
		return momFailureRateESet;
	}

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos <em>Reliability Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(Specification)
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos
	 * @generated
	 */
	public Specification getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (Specification)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs) {
		Specification oldSpecification = specification;
		specification = newSpecification;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS, Specification.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS, Specification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>MTTR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTTR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTTR</em>' attribute.
	 * @see #isSetMTTR()
	 * @see #unsetMTTR()
	 * @see #setMTTR(float)
	 * @generated
	 */
	public float getMTTR() {
		return mTTR;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTTR</em>' attribute.
	 * @see #isSetMTTR()
	 * @see #unsetMTTR()
	 * @see #getMTTR()
	 * @generated
	 */
	public void setMTTR(float newMTTR) {
		mTTR = newMTTR;
		mTTRESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR <em>MTTR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMTTR()
	 * @see #getMTTR()
	 * @see #setMTTR(float)
	 * @generated
	 */
	public void unsetMTTR() {
		mTTR = MTTR_EDEFAULT;
		mTTRESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR <em>MTTR</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MTTR</em>' attribute is set.
	 * @see #unsetMTTR()
	 * @see #getMTTR()
	 * @see #setMTTR(float)
	 * @generated
	 */
	public boolean isSetMTTR() {
		return mTTRESet;
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getReliabilityInfos <em>Reliability Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getReliabilityInfos
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new BasicInternalEList<Asset>(Asset.class);
		}
		return assets;
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
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS, Specification.class, msgs);
				return basicSetSpecification((Specification)otherEnd, msgs);
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE:
				return getMomFailureRate();
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case InfAssetsPackage.RELIABILITY_INFO__MTTR:
				return getMTTR();
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				return getAssets();
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
			case InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE:
				setMomFailureRate((Float)newValue);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__MTTR:
				setMTTR((Float)newValue);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
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
			case InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE:
				unsetMomFailureRate();
				return;
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case InfAssetsPackage.RELIABILITY_INFO__MTTR:
				unsetMTTR();
				return;
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				getAssets().clear();
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
			case InfAssetsPackage.RELIABILITY_INFO__MOM_FAILURE_RATE:
				return isSetMomFailureRate();
			case InfAssetsPackage.RELIABILITY_INFO__SPECIFICATION:
				return specification != null;
			case InfAssetsPackage.RELIABILITY_INFO__MTTR:
				return isSetMTTR();
			case InfAssetsPackage.RELIABILITY_INFO__ASSETS:
				return assets != null && !assets.isEmpty();
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
		result.append(" (momFailureRate: ");
		if (momFailureRateESet) result.append(momFailureRate); else result.append("<unset>");
		result.append(", mTTR: ");
		if (mTTRESet) result.append(mTTR); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ReliabilityInfo
