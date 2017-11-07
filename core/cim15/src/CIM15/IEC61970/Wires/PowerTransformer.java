/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.PowerTransformerInfo;

import CIM15.IEC61970.Core.ConductingEquipment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformer#getTransformerTanks <em>Transformer Tanks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformer#getVectorGroup <em>Vector Group</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerInfo <em>Power Transformer Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerTransformer extends ConductingEquipment {
	/**
	 * The cached value of the '{@link #getTransformerTanks() <em>Transformer Tanks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerTanks()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerTank> transformerTanks;

	/**
	 * The default value of the '{@link #getVectorGroup() <em>Vector Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String VECTOR_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVectorGroup() <em>Vector Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorGroup()
	 * @generated
	 * @ordered
	 */
	protected String vectorGroup = VECTOR_GROUP_EDEFAULT;

	/**
	 * This is true if the Vector Group attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vectorGroupESet;

	/**
	 * The cached value of the '{@link #getPowerTransformerInfo() <em>Power Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformerInfo()
	 * @generated
	 * @ordered
	 */
	protected PowerTransformerInfo powerTransformerInfo;

	/**
	 * The cached value of the '{@link #getPowerTransformerEnd() <em>Power Transformer End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformerEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerTransformerEnd> powerTransformerEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerTransformer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.POWER_TRANSFORMER;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Tanks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerTank}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerTank#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Tanks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Tanks</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerTank#getPowerTransformer
	 * @generated
	 */
	public EList<TransformerTank> getTransformerTanks() {
		if (transformerTanks == null) {
			transformerTanks = new BasicInternalEList<TransformerTank>(TransformerTank.class);
		}
		return transformerTanks;
	}

	/**
	 * Returns the value of the '<em><b>Vector Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Group</em>' attribute.
	 * @see #isSetVectorGroup()
	 * @see #unsetVectorGroup()
	 * @see #setVectorGroup(String)
	 * @generated
	 */
	public String getVectorGroup() {
		return vectorGroup;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformer#getVectorGroup <em>Vector Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Group</em>' attribute.
	 * @see #isSetVectorGroup()
	 * @see #unsetVectorGroup()
	 * @see #getVectorGroup()
	 * @generated
	 */
	public void setVectorGroup(String newVectorGroup) {
		vectorGroup = newVectorGroup;
		vectorGroupESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformer#getVectorGroup <em>Vector Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVectorGroup()
	 * @see #getVectorGroup()
	 * @see #setVectorGroup(String)
	 * @generated
	 */
	public void unsetVectorGroup() {
		vectorGroup = VECTOR_GROUP_EDEFAULT;
		vectorGroupESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformer#getVectorGroup <em>Vector Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vector Group</em>' attribute is set.
	 * @see #unsetVectorGroup()
	 * @see #getVectorGroup()
	 * @see #setVectorGroup(String)
	 * @generated
	 */
	public boolean isSetVectorGroup() {
		return vectorGroupESet;
	}

	/**
	 * Returns the value of the '<em><b>Power Transformer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo#getPowerTransformers <em>Power Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transformer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformer Info</em>' reference.
	 * @see #setPowerTransformerInfo(PowerTransformerInfo)
	 * @see CIM15.IEC61968.AssetModels.PowerTransformerInfo#getPowerTransformers
	 * @generated
	 */
	public PowerTransformerInfo getPowerTransformerInfo() {
		if (powerTransformerInfo != null && powerTransformerInfo.eIsProxy()) {
			InternalEObject oldPowerTransformerInfo = (InternalEObject)powerTransformerInfo;
			powerTransformerInfo = (PowerTransformerInfo)eResolveProxy(oldPowerTransformerInfo);
			if (powerTransformerInfo != oldPowerTransformerInfo) {
			}
		}
		return powerTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformerInfo basicGetPowerTransformerInfo() {
		return powerTransformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerTransformerInfo(PowerTransformerInfo newPowerTransformerInfo, NotificationChain msgs) {
		PowerTransformerInfo oldPowerTransformerInfo = powerTransformerInfo;
		powerTransformerInfo = newPowerTransformerInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerInfo <em>Power Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Transformer Info</em>' reference.
	 * @see #getPowerTransformerInfo()
	 * @generated
	 */
	public void setPowerTransformerInfo(PowerTransformerInfo newPowerTransformerInfo) {
		if (newPowerTransformerInfo != powerTransformerInfo) {
			NotificationChain msgs = null;
			if (powerTransformerInfo != null)
				msgs = ((InternalEObject)powerTransformerInfo).eInverseRemove(this, AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS, PowerTransformerInfo.class, msgs);
			if (newPowerTransformerInfo != null)
				msgs = ((InternalEObject)newPowerTransformerInfo).eInverseAdd(this, AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS, PowerTransformerInfo.class, msgs);
			msgs = basicSetPowerTransformerInfo(newPowerTransformerInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Power Transformer End</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.PowerTransformerEnd}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transformer End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformer End</em>' reference list.
	 * @see CIM15.IEC61970.Wires.PowerTransformerEnd#getPowerTransformer
	 * @generated
	 */
	public EList<PowerTransformerEnd> getPowerTransformerEnd() {
		if (powerTransformerEnd == null) {
			powerTransformerEnd = new BasicInternalEList<PowerTransformerEnd>(PowerTransformerEnd.class);
		}
		return powerTransformerEnd;
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
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerTanks()).basicAdd(otherEnd, msgs);
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_INFO:
				if (powerTransformerInfo != null)
					msgs = ((InternalEObject)powerTransformerInfo).eInverseRemove(this, AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS, PowerTransformerInfo.class, msgs);
				return basicSetPowerTransformerInfo((PowerTransformerInfo)otherEnd, msgs);
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerTransformerEnd()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
				return ((InternalEList<?>)getTransformerTanks()).basicRemove(otherEnd, msgs);
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_INFO:
				return basicSetPowerTransformerInfo(null, msgs);
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
				return ((InternalEList<?>)getPowerTransformerEnd()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
				return getTransformerTanks();
			case WiresPackage.POWER_TRANSFORMER__VECTOR_GROUP:
				return getVectorGroup();
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_INFO:
				if (resolve) return getPowerTransformerInfo();
				return basicGetPowerTransformerInfo();
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
				return getPowerTransformerEnd();
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
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
				getTransformerTanks().clear();
				getTransformerTanks().addAll((Collection<? extends TransformerTank>)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER__VECTOR_GROUP:
				setVectorGroup((String)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_INFO:
				setPowerTransformerInfo((PowerTransformerInfo)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
				getPowerTransformerEnd().clear();
				getPowerTransformerEnd().addAll((Collection<? extends PowerTransformerEnd>)newValue);
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
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
				getTransformerTanks().clear();
				return;
			case WiresPackage.POWER_TRANSFORMER__VECTOR_GROUP:
				unsetVectorGroup();
				return;
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_INFO:
				setPowerTransformerInfo((PowerTransformerInfo)null);
				return;
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
				getPowerTransformerEnd().clear();
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
			case WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
				return transformerTanks != null && !transformerTanks.isEmpty();
			case WiresPackage.POWER_TRANSFORMER__VECTOR_GROUP:
				return isSetVectorGroup();
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_INFO:
				return powerTransformerInfo != null;
			case WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
				return powerTransformerEnd != null && !powerTransformerEnd.isEmpty();
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
		result.append(" (vectorGroup: ");
		if (vectorGroupESet) result.append(vectorGroup); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PowerTransformer
