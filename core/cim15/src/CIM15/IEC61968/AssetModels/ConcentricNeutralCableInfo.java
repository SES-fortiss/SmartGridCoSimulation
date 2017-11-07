/**
 */
package CIM15.IEC61968.AssetModels;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concentric Neutral Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType <em>Wire Type</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcentricNeutralCableInfo extends CableInfo {
	/**
	 * The cached value of the '{@link #getWireType() <em>Wire Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireType()
	 * @generated
	 * @ordered
	 */
	protected WireType wireType;

	/**
	 * The default value of the '{@link #getNeutralStrandCount() <em>Neutral Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStrandCount()
	 * @generated
	 * @ordered
	 */
	protected static final int NEUTRAL_STRAND_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeutralStrandCount() <em>Neutral Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralStrandCount()
	 * @generated
	 * @ordered
	 */
	protected int neutralStrandCount = NEUTRAL_STRAND_COUNT_EDEFAULT;

	/**
	 * This is true if the Neutral Strand Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean neutralStrandCountESet;

	/**
	 * The default value of the '{@link #getDiameterOverNeutral() <em>Diameter Over Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverNeutral()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAMETER_OVER_NEUTRAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiameterOverNeutral() <em>Diameter Over Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterOverNeutral()
	 * @generated
	 * @ordered
	 */
	protected float diameterOverNeutral = DIAMETER_OVER_NEUTRAL_EDEFAULT;

	/**
	 * This is true if the Diameter Over Neutral attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diameterOverNeutralESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcentricNeutralCableInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.CONCENTRIC_NEUTRAL_CABLE_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Wire Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos <em>Concentric Neutral Cable Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Type</em>' reference.
	 * @see #setWireType(WireType)
	 * @see CIM15.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos
	 * @generated
	 */
	public WireType getWireType() {
		if (wireType != null && wireType.eIsProxy()) {
			InternalEObject oldWireType = (InternalEObject)wireType;
			wireType = (WireType)eResolveProxy(oldWireType);
			if (wireType != oldWireType) {
			}
		}
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireType basicGetWireType() {
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireType(WireType newWireType, NotificationChain msgs) {
		WireType oldWireType = wireType;
		wireType = newWireType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType <em>Wire Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Type</em>' reference.
	 * @see #getWireType()
	 * @generated
	 */
	public void setWireType(WireType newWireType) {
		if (newWireType != wireType) {
			NotificationChain msgs = null;
			if (wireType != null)
				msgs = ((InternalEObject)wireType).eInverseRemove(this, AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS, WireType.class, msgs);
			if (newWireType != null)
				msgs = ((InternalEObject)newWireType).eInverseAdd(this, AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS, WireType.class, msgs);
			msgs = basicSetWireType(newWireType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Neutral Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neutral Strand Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neutral Strand Count</em>' attribute.
	 * @see #isSetNeutralStrandCount()
	 * @see #unsetNeutralStrandCount()
	 * @see #setNeutralStrandCount(int)
	 * @generated
	 */
	public int getNeutralStrandCount() {
		return neutralStrandCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Strand Count</em>' attribute.
	 * @see #isSetNeutralStrandCount()
	 * @see #unsetNeutralStrandCount()
	 * @see #getNeutralStrandCount()
	 * @generated
	 */
	public void setNeutralStrandCount(int newNeutralStrandCount) {
		neutralStrandCount = newNeutralStrandCount;
		neutralStrandCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeutralStrandCount()
	 * @see #getNeutralStrandCount()
	 * @see #setNeutralStrandCount(int)
	 * @generated
	 */
	public void unsetNeutralStrandCount() {
		neutralStrandCount = NEUTRAL_STRAND_COUNT_EDEFAULT;
		neutralStrandCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Neutral Strand Count</em>' attribute is set.
	 * @see #unsetNeutralStrandCount()
	 * @see #getNeutralStrandCount()
	 * @see #setNeutralStrandCount(int)
	 * @generated
	 */
	public boolean isSetNeutralStrandCount() {
		return neutralStrandCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Diameter Over Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Over Neutral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Over Neutral</em>' attribute.
	 * @see #isSetDiameterOverNeutral()
	 * @see #unsetDiameterOverNeutral()
	 * @see #setDiameterOverNeutral(float)
	 * @generated
	 */
	public float getDiameterOverNeutral() {
		return diameterOverNeutral;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Over Neutral</em>' attribute.
	 * @see #isSetDiameterOverNeutral()
	 * @see #unsetDiameterOverNeutral()
	 * @see #getDiameterOverNeutral()
	 * @generated
	 */
	public void setDiameterOverNeutral(float newDiameterOverNeutral) {
		diameterOverNeutral = newDiameterOverNeutral;
		diameterOverNeutralESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiameterOverNeutral()
	 * @see #getDiameterOverNeutral()
	 * @see #setDiameterOverNeutral(float)
	 * @generated
	 */
	public void unsetDiameterOverNeutral() {
		diameterOverNeutral = DIAMETER_OVER_NEUTRAL_EDEFAULT;
		diameterOverNeutralESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diameter Over Neutral</em>' attribute is set.
	 * @see #unsetDiameterOverNeutral()
	 * @see #getDiameterOverNeutral()
	 * @see #setDiameterOverNeutral(float)
	 * @generated
	 */
	public boolean isSetDiameterOverNeutral() {
		return diameterOverNeutralESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				if (wireType != null)
					msgs = ((InternalEObject)wireType).eInverseRemove(this, AssetModelsPackage.WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS, WireType.class, msgs);
				return basicSetWireType((WireType)otherEnd, msgs);
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				return basicSetWireType(null, msgs);
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				if (resolve) return getWireType();
				return basicGetWireType();
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
				return getNeutralStrandCount();
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
				return getDiameterOverNeutral();
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				setWireType((WireType)newValue);
				return;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
				setNeutralStrandCount((Integer)newValue);
				return;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
				setDiameterOverNeutral((Float)newValue);
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				setWireType((WireType)null);
				return;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
				unsetNeutralStrandCount();
				return;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
				unsetDiameterOverNeutral();
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
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE:
				return wireType != null;
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
				return isSetNeutralStrandCount();
			case AssetModelsPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
				return isSetDiameterOverNeutral();
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
		result.append(" (neutralStrandCount: ");
		if (neutralStrandCountESet) result.append(neutralStrandCount); else result.append("<unset>");
		result.append(", diameterOverNeutral: ");
		if (diameterOverNeutralESet) result.append(diameterOverNeutral); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ConcentricNeutralCableInfo
