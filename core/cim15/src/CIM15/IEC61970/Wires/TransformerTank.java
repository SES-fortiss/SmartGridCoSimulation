/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.TransformerTankInfo;

import CIM15.IEC61968.Metering.ServiceDeliveryPoint;

import CIM15.IEC61970.Core.Equipment;

import CIM15.IEC61970.Informative.InfAssets.TransformerObservation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Tank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerTank#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerTankEnds <em>Transformer Tank Ends</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerTank#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerTankInfo <em>Transformer Tank Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerObservations <em>Transformer Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerTank extends Equipment {
	/**
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * The cached value of the '{@link #getTransformerTankEnds() <em>Transformer Tank Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerTankEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerTankEnd> transformerTankEnds;

	/**
	 * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformer()
	 * @generated
	 * @ordered
	 */
	protected PowerTransformer powerTransformer;

	/**
	 * The cached value of the '{@link #getTransformerTankInfo() <em>Transformer Tank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerTankInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerTankInfo transformerTankInfo;

	/**
	 * The cached value of the '{@link #getTransformerObservations() <em>Transformer Observations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerObservation> transformerObservations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerTank() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TRANSFORMER_TANK;
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getTransformerTanks <em>Transformer Tanks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getTransformerTanks
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new BasicInternalEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Tank Ends</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerTankEnd}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerTankEnd#getTransformerTank <em>Transformer Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Tank Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Tank Ends</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerTankEnd#getTransformerTank
	 * @generated
	 */
	public EList<TransformerTankEnd> getTransformerTankEnds() {
		if (transformerTankEnds == null) {
			transformerTankEnds = new BasicInternalEList<TransformerTankEnd>(TransformerTankEnd.class);
		}
		return transformerTankEnds;
	}

	/**
	 * Returns the value of the '<em><b>Power Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PowerTransformer#getTransformerTanks <em>Transformer Tanks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformer</em>' reference.
	 * @see #setPowerTransformer(PowerTransformer)
	 * @see CIM15.IEC61970.Wires.PowerTransformer#getTransformerTanks
	 * @generated
	 */
	public PowerTransformer getPowerTransformer() {
		if (powerTransformer != null && powerTransformer.eIsProxy()) {
			InternalEObject oldPowerTransformer = (InternalEObject)powerTransformer;
			powerTransformer = (PowerTransformer)eResolveProxy(oldPowerTransformer);
			if (powerTransformer != oldPowerTransformer) {
			}
		}
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer basicGetPowerTransformer() {
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerTransformer(PowerTransformer newPowerTransformer, NotificationChain msgs) {
		PowerTransformer oldPowerTransformer = powerTransformer;
		powerTransformer = newPowerTransformer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerTank#getPowerTransformer <em>Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Transformer</em>' reference.
	 * @see #getPowerTransformer()
	 * @generated
	 */
	public void setPowerTransformer(PowerTransformer newPowerTransformer) {
		if (newPowerTransformer != powerTransformer) {
			NotificationChain msgs = null;
			if (powerTransformer != null)
				msgs = ((InternalEObject)powerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS, PowerTransformer.class, msgs);
			if (newPowerTransformer != null)
				msgs = ((InternalEObject)newPowerTransformer).eInverseAdd(this, WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS, PowerTransformer.class, msgs);
			msgs = basicSetPowerTransformer(newPowerTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transformer Tank Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerTanks <em>Transformer Tanks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Tank Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Tank Info</em>' reference.
	 * @see #setTransformerTankInfo(TransformerTankInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerTanks
	 * @generated
	 */
	public TransformerTankInfo getTransformerTankInfo() {
		if (transformerTankInfo != null && transformerTankInfo.eIsProxy()) {
			InternalEObject oldTransformerTankInfo = (InternalEObject)transformerTankInfo;
			transformerTankInfo = (TransformerTankInfo)eResolveProxy(oldTransformerTankInfo);
			if (transformerTankInfo != oldTransformerTankInfo) {
			}
		}
		return transformerTankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTankInfo basicGetTransformerTankInfo() {
		return transformerTankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerTankInfo(TransformerTankInfo newTransformerTankInfo, NotificationChain msgs) {
		TransformerTankInfo oldTransformerTankInfo = transformerTankInfo;
		transformerTankInfo = newTransformerTankInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerTank#getTransformerTankInfo <em>Transformer Tank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Tank Info</em>' reference.
	 * @see #getTransformerTankInfo()
	 * @generated
	 */
	public void setTransformerTankInfo(TransformerTankInfo newTransformerTankInfo) {
		if (newTransformerTankInfo != transformerTankInfo) {
			NotificationChain msgs = null;
			if (transformerTankInfo != null)
				msgs = ((InternalEObject)transformerTankInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS, TransformerTankInfo.class, msgs);
			if (newTransformerTankInfo != null)
				msgs = ((InternalEObject)newTransformerTankInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS, TransformerTankInfo.class, msgs);
			msgs = basicSetTransformerTankInfo(newTransformerTankInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transformer Observations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer
	 * @generated
	 */
	public EList<TransformerObservation> getTransformerObservations() {
		if (transformerObservations == null) {
			transformerObservations = new BasicInternalEList<TransformerObservation>(TransformerObservation.class);
		}
		return transformerObservations;
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
			case WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerTankEnds()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
				if (powerTransformer != null)
					msgs = ((InternalEObject)powerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS, PowerTransformer.class, msgs);
				return basicSetPowerTransformer((PowerTransformer)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_INFO:
				if (transformerTankInfo != null)
					msgs = ((InternalEObject)transformerTankInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS, TransformerTankInfo.class, msgs);
				return basicSetTransformerTankInfo((TransformerTankInfo)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerObservations()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
				return ((InternalEList<?>)getTransformerTankEnds()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
				return basicSetPowerTransformer(null, msgs);
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_INFO:
				return basicSetTransformerTankInfo(null, msgs);
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<?>)getTransformerObservations()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
				return getTransformerTankEnds();
			case WiresPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
				if (resolve) return getPowerTransformer();
				return basicGetPowerTransformer();
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_INFO:
				if (resolve) return getTransformerTankInfo();
				return basicGetTransformerTankInfo();
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS:
				return getTransformerObservations();
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
			case WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
				getTransformerTankEnds().clear();
				getTransformerTankEnds().addAll((Collection<? extends TransformerTankEnd>)newValue);
				return;
			case WiresPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)newValue);
				return;
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_INFO:
				setTransformerTankInfo((TransformerTankInfo)newValue);
				return;
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				getTransformerObservations().addAll((Collection<? extends TransformerObservation>)newValue);
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
			case WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
				getTransformerTankEnds().clear();
				return;
			case WiresPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)null);
				return;
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_INFO:
				setTransformerTankInfo((TransformerTankInfo)null);
				return;
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
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
			case WiresPackage.TRANSFORMER_TANK__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_ENDS:
				return transformerTankEnds != null && !transformerTankEnds.isEmpty();
			case WiresPackage.TRANSFORMER_TANK__POWER_TRANSFORMER:
				return powerTransformer != null;
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_TANK_INFO:
				return transformerTankInfo != null;
			case WiresPackage.TRANSFORMER_TANK__TRANSFORMER_OBSERVATIONS:
				return transformerObservations != null && !transformerObservations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TransformerTank
