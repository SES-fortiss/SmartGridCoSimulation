/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Arrangement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireArrangement#getConductorInfo <em>Conductor Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointY <em>Mounting Point Y</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointX <em>Mounting Point X</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireArrangement#getPosition <em>Position</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.WireArrangement#getWireType <em>Wire Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireArrangement extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getConductorInfo() <em>Conductor Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorInfo()
	 * @generated
	 * @ordered
	 */
	protected ConductorInfo conductorInfo;

	/**
	 * The default value of the '{@link #getMountingPointY() <em>Mounting Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPointY()
	 * @generated
	 * @ordered
	 */
	protected static final float MOUNTING_POINT_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMountingPointY() <em>Mounting Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPointY()
	 * @generated
	 * @ordered
	 */
	protected float mountingPointY = MOUNTING_POINT_Y_EDEFAULT;

	/**
	 * This is true if the Mounting Point Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mountingPointYESet;

	/**
	 * The default value of the '{@link #getMountingPointX() <em>Mounting Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPointX()
	 * @generated
	 * @ordered
	 */
	protected static final float MOUNTING_POINT_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMountingPointX() <em>Mounting Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPointX()
	 * @generated
	 * @ordered
	 */
	protected float mountingPointX = MOUNTING_POINT_X_EDEFAULT;

	/**
	 * This is true if the Mounting Point X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mountingPointXESet;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * This is true if the Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireArrangement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.WIRE_ARRANGEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Conductor Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getWireArrangements <em>Wire Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Info</em>' reference.
	 * @see #setConductorInfo(ConductorInfo)
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#getWireArrangements
	 * @generated
	 */
	public ConductorInfo getConductorInfo() {
		if (conductorInfo != null && conductorInfo.eIsProxy()) {
			InternalEObject oldConductorInfo = (InternalEObject)conductorInfo;
			conductorInfo = (ConductorInfo)eResolveProxy(oldConductorInfo);
			if (conductorInfo != oldConductorInfo) {
			}
		}
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInfo basicGetConductorInfo() {
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductorInfo(ConductorInfo newConductorInfo, NotificationChain msgs) {
		ConductorInfo oldConductorInfo = conductorInfo;
		conductorInfo = newConductorInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getConductorInfo <em>Conductor Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor Info</em>' reference.
	 * @see #getConductorInfo()
	 * @generated
	 */
	public void setConductorInfo(ConductorInfo newConductorInfo) {
		if (newConductorInfo != conductorInfo) {
			NotificationChain msgs = null;
			if (conductorInfo != null)
				msgs = ((InternalEObject)conductorInfo).eInverseRemove(this, AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS, ConductorInfo.class, msgs);
			if (newConductorInfo != null)
				msgs = ((InternalEObject)newConductorInfo).eInverseAdd(this, AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS, ConductorInfo.class, msgs);
			msgs = basicSetConductorInfo(newConductorInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Mounting Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Point Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Point Y</em>' attribute.
	 * @see #isSetMountingPointY()
	 * @see #unsetMountingPointY()
	 * @see #setMountingPointY(float)
	 * @generated
	 */
	public float getMountingPointY() {
		return mountingPointY;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointY <em>Mounting Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounting Point Y</em>' attribute.
	 * @see #isSetMountingPointY()
	 * @see #unsetMountingPointY()
	 * @see #getMountingPointY()
	 * @generated
	 */
	public void setMountingPointY(float newMountingPointY) {
		mountingPointY = newMountingPointY;
		mountingPointYESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointY <em>Mounting Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMountingPointY()
	 * @see #getMountingPointY()
	 * @see #setMountingPointY(float)
	 * @generated
	 */
	public void unsetMountingPointY() {
		mountingPointY = MOUNTING_POINT_Y_EDEFAULT;
		mountingPointYESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointY <em>Mounting Point Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mounting Point Y</em>' attribute is set.
	 * @see #unsetMountingPointY()
	 * @see #getMountingPointY()
	 * @see #setMountingPointY(float)
	 * @generated
	 */
	public boolean isSetMountingPointY() {
		return mountingPointYESet;
	}

	/**
	 * Returns the value of the '<em><b>Mounting Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Point X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Point X</em>' attribute.
	 * @see #isSetMountingPointX()
	 * @see #unsetMountingPointX()
	 * @see #setMountingPointX(float)
	 * @generated
	 */
	public float getMountingPointX() {
		return mountingPointX;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointX <em>Mounting Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mounting Point X</em>' attribute.
	 * @see #isSetMountingPointX()
	 * @see #unsetMountingPointX()
	 * @see #getMountingPointX()
	 * @generated
	 */
	public void setMountingPointX(float newMountingPointX) {
		mountingPointX = newMountingPointX;
		mountingPointXESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointX <em>Mounting Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMountingPointX()
	 * @see #getMountingPointX()
	 * @see #setMountingPointX(float)
	 * @generated
	 */
	public void unsetMountingPointX() {
		mountingPointX = MOUNTING_POINT_X_EDEFAULT;
		mountingPointXESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointX <em>Mounting Point X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mounting Point X</em>' attribute is set.
	 * @see #unsetMountingPointX()
	 * @see #getMountingPointX()
	 * @see #setMountingPointX(float)
	 * @generated
	 */
	public boolean isSetMountingPointX() {
		return mountingPointXESet;
	}

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(int)
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	public void setPosition(int newPosition) {
		position = newPosition;
		positionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(int)
	 * @generated
	 */
	public void unsetPosition() {
		position = POSITION_EDEFAULT;
		positionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(int)
	 * @generated
	 */
	public boolean isSetPosition() {
		return positionESet;
	}

	/**
	 * Returns the value of the '<em><b>Wire Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.WireType#getWireArrangements <em>Wire Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Type</em>' reference.
	 * @see #setWireType(WireType)
	 * @see CIM15.IEC61968.AssetModels.WireType#getWireArrangements
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
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.WireArrangement#getWireType <em>Wire Type</em>}' reference.
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
				msgs = ((InternalEObject)wireType).eInverseRemove(this, AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS, WireType.class, msgs);
			if (newWireType != null)
				msgs = ((InternalEObject)newWireType).eInverseAdd(this, AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS, WireType.class, msgs);
			msgs = basicSetWireType(newWireType, msgs);
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				if (conductorInfo != null)
					msgs = ((InternalEObject)conductorInfo).eInverseRemove(this, AssetModelsPackage.CONDUCTOR_INFO__WIRE_ARRANGEMENTS, ConductorInfo.class, msgs);
				return basicSetConductorInfo((ConductorInfo)otherEnd, msgs);
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				if (wireType != null)
					msgs = ((InternalEObject)wireType).eInverseRemove(this, AssetModelsPackage.WIRE_TYPE__WIRE_ARRANGEMENTS, WireType.class, msgs);
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				return basicSetConductorInfo(null, msgs);
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				if (resolve) return getConductorInfo();
				return basicGetConductorInfo();
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y:
				return getMountingPointY();
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X:
				return getMountingPointX();
			case AssetModelsPackage.WIRE_ARRANGEMENT__POSITION:
				return getPosition();
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				if (resolve) return getWireType();
				return basicGetWireType();
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				setConductorInfo((ConductorInfo)newValue);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y:
				setMountingPointY((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X:
				setMountingPointX((Float)newValue);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__POSITION:
				setPosition((Integer)newValue);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				setWireType((WireType)newValue);
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				setConductorInfo((ConductorInfo)null);
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y:
				unsetMountingPointY();
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X:
				unsetMountingPointX();
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__POSITION:
				unsetPosition();
				return;
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				setWireType((WireType)null);
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
			case AssetModelsPackage.WIRE_ARRANGEMENT__CONDUCTOR_INFO:
				return conductorInfo != null;
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_Y:
				return isSetMountingPointY();
			case AssetModelsPackage.WIRE_ARRANGEMENT__MOUNTING_POINT_X:
				return isSetMountingPointX();
			case AssetModelsPackage.WIRE_ARRANGEMENT__POSITION:
				return isSetPosition();
			case AssetModelsPackage.WIRE_ARRANGEMENT__WIRE_TYPE:
				return wireType != null;
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
		result.append(" (mountingPointY: ");
		if (mountingPointYESet) result.append(mountingPointY); else result.append("<unset>");
		result.append(", mountingPointX: ");
		if (mountingPointXESet) result.append(mountingPointX); else result.append("<unset>");
		result.append(", position: ");
		if (positionESet) result.append(position); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WireArrangement
