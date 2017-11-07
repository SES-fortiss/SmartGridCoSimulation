/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bushing Insulation PF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation <em>Transformer Observation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind <em>Test Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo <em>Bushing Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BushingInsulationPF extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getTransformerObservation() <em>Transformer Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservation()
	 * @generated
	 * @ordered
	 */
	protected TransformerObservation transformerObservation;

	/**
	 * The default value of the '{@link #getTestKind() <em>Test Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestKind()
	 * @generated
	 * @ordered
	 */
	protected static final BushingInsulationPfTestKind TEST_KIND_EDEFAULT = BushingInsulationPfTestKind.C2;

	/**
	 * The cached value of the '{@link #getTestKind() <em>Test Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestKind()
	 * @generated
	 * @ordered
	 */
	protected BushingInsulationPfTestKind testKind = TEST_KIND_EDEFAULT;

	/**
	 * This is true if the Test Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean testKindESet;

	/**
	 * The cached value of the '{@link #getBushingInfo() <em>Bushing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingInfo()
	 * @generated
	 * @ordered
	 */
	protected Bushing bushingInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BushingInsulationPF() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getBushingInsulationPF();
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.BUSHING_INSULATION_PF__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.BUSHING_INSULATION_PF__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transformer Observation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs <em>Bushing Insultation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observation</em>' reference.
	 * @see #setTransformerObservation(TransformerObservation)
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs
	 * @generated
	 */
	public TransformerObservation getTransformerObservation() {
		if (transformerObservation != null && transformerObservation.eIsProxy()) {
			InternalEObject oldTransformerObservation = (InternalEObject)transformerObservation;
			transformerObservation = (TransformerObservation)eResolveProxy(oldTransformerObservation);
			if (transformerObservation != oldTransformerObservation) {
			}
		}
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerObservation basicGetTransformerObservation() {
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerObservation(TransformerObservation newTransformerObservation, NotificationChain msgs) {
		TransformerObservation oldTransformerObservation = transformerObservation;
		transformerObservation = newTransformerObservation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation <em>Transformer Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Observation</em>' reference.
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public void setTransformerObservation(TransformerObservation newTransformerObservation) {
		if (newTransformerObservation != transformerObservation) {
			NotificationChain msgs = null;
			if (transformerObservation != null)
				msgs = ((InternalEObject)transformerObservation).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS, TransformerObservation.class, msgs);
			if (newTransformerObservation != null)
				msgs = ((InternalEObject)newTransformerObservation).eInverseAdd(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS, TransformerObservation.class, msgs);
			msgs = basicSetTransformerObservation(newTransformerObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Test Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind
	 * @see #isSetTestKind()
	 * @see #unsetTestKind()
	 * @see #setTestKind(BushingInsulationPfTestKind)
	 * @generated
	 */
	public BushingInsulationPfTestKind getTestKind() {
		return testKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind <em>Test Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind
	 * @see #isSetTestKind()
	 * @see #unsetTestKind()
	 * @see #getTestKind()
	 * @generated
	 */
	public void setTestKind(BushingInsulationPfTestKind newTestKind) {
		testKind = newTestKind == null ? TEST_KIND_EDEFAULT : newTestKind;
		testKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind <em>Test Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTestKind()
	 * @see #getTestKind()
	 * @see #setTestKind(BushingInsulationPfTestKind)
	 * @generated
	 */
	public void unsetTestKind() {
		testKind = TEST_KIND_EDEFAULT;
		testKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind <em>Test Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Kind</em>' attribute is set.
	 * @see #unsetTestKind()
	 * @see #getTestKind()
	 * @see #setTestKind(BushingInsulationPfTestKind)
	 * @generated
	 */
	public boolean isSetTestKind() {
		return testKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Bushing Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getBushingInsulationPFs <em>Bushing Insulation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Info</em>' reference.
	 * @see #setBushingInfo(Bushing)
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getBushingInsulationPFs
	 * @generated
	 */
	public Bushing getBushingInfo() {
		if (bushingInfo != null && bushingInfo.eIsProxy()) {
			InternalEObject oldBushingInfo = (InternalEObject)bushingInfo;
			bushingInfo = (Bushing)eResolveProxy(oldBushingInfo);
			if (bushingInfo != oldBushingInfo) {
			}
		}
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bushing basicGetBushingInfo() {
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBushingInfo(Bushing newBushingInfo, NotificationChain msgs) {
		Bushing oldBushingInfo = bushingInfo;
		bushingInfo = newBushingInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo <em>Bushing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bushing Info</em>' reference.
	 * @see #getBushingInfo()
	 * @generated
	 */
	public void setBushingInfo(Bushing newBushingInfo) {
		if (newBushingInfo != bushingInfo) {
			NotificationChain msgs = null;
			if (bushingInfo != null)
				msgs = ((InternalEObject)bushingInfo).eInverseRemove(this, InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS, Bushing.class, msgs);
			if (newBushingInfo != null)
				msgs = ((InternalEObject)newBushingInfo).eInverseAdd(this, InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS, Bushing.class, msgs);
			msgs = basicSetBushingInfo(newBushingInfo, msgs);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				if (transformerObservation != null)
					msgs = ((InternalEObject)transformerObservation).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS, TransformerObservation.class, msgs);
				return basicSetTransformerObservation((TransformerObservation)otherEnd, msgs);
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				if (bushingInfo != null)
					msgs = ((InternalEObject)bushingInfo).eInverseRemove(this, InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS, Bushing.class, msgs);
				return basicSetBushingInfo((Bushing)otherEnd, msgs);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				return basicSetStatus(null, msgs);
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				return basicSetTransformerObservation(null, msgs);
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				return basicSetBushingInfo(null, msgs);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				return getStatus();
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				if (resolve) return getTransformerObservation();
				return basicGetTransformerObservation();
			case InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND:
				return getTestKind();
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				if (resolve) return getBushingInfo();
				return basicGetBushingInfo();
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				setStatus((Status)newValue);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				setTransformerObservation((TransformerObservation)newValue);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND:
				setTestKind((BushingInsulationPfTestKind)newValue);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				setBushingInfo((Bushing)newValue);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				setStatus((Status)null);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				setTransformerObservation((TransformerObservation)null);
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND:
				unsetTestKind();
				return;
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				setBushingInfo((Bushing)null);
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
			case InfAssetsPackage.BUSHING_INSULATION_PF__STATUS:
				return status != null;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION:
				return transformerObservation != null;
			case InfAssetsPackage.BUSHING_INSULATION_PF__TEST_KIND:
				return isSetTestKind();
			case InfAssetsPackage.BUSHING_INSULATION_PF__BUSHING_INFO:
				return bushingInfo != null;
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
		result.append(" (testKind: ");
		if (testKindESet) result.append(testKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // BushingInsulationPF
