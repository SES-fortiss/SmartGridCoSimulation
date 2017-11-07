/**
 */
package CIM15.IEC61968.Common;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.PositionPoint#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.PositionPoint#getZPosition <em>ZPosition</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.PositionPoint#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.PositionPoint#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.PositionPoint#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionPoint extends Element {
	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String XPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected String xPosition = XPOSITION_EDEFAULT;

	/**
	 * This is true if the XPosition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xPositionESet;

	/**
	 * The default value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String ZPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZPosition()
	 * @generated
	 * @ordered
	 */
	protected String zPosition = ZPOSITION_EDEFAULT;

	/**
	 * This is true if the ZPosition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zPositionESet;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumberESet;

	/**
	 * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String YPOSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected String yPosition = YPOSITION_EDEFAULT;

	/**
	 * This is true if the YPosition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yPositionESet;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionPoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.POSITION_POINT;
	}

	/**
	 * Returns the value of the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPosition</em>' attribute.
	 * @see #isSetXPosition()
	 * @see #unsetXPosition()
	 * @see #setXPosition(String)
	 * @generated
	 */
	public String getXPosition() {
		return xPosition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPosition</em>' attribute.
	 * @see #isSetXPosition()
	 * @see #unsetXPosition()
	 * @see #getXPosition()
	 * @generated
	 */
	public void setXPosition(String newXPosition) {
		xPosition = newXPosition;
		xPositionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXPosition()
	 * @see #getXPosition()
	 * @see #setXPosition(String)
	 * @generated
	 */
	public void unsetXPosition() {
		xPosition = XPOSITION_EDEFAULT;
		xPositionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getXPosition <em>XPosition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XPosition</em>' attribute is set.
	 * @see #unsetXPosition()
	 * @see #getXPosition()
	 * @see #setXPosition(String)
	 * @generated
	 */
	public boolean isSetXPosition() {
		return xPositionESet;
	}

	/**
	 * Returns the value of the '<em><b>ZPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZPosition</em>' attribute.
	 * @see #isSetZPosition()
	 * @see #unsetZPosition()
	 * @see #setZPosition(String)
	 * @generated
	 */
	public String getZPosition() {
		return zPosition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getZPosition <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZPosition</em>' attribute.
	 * @see #isSetZPosition()
	 * @see #unsetZPosition()
	 * @see #getZPosition()
	 * @generated
	 */
	public void setZPosition(String newZPosition) {
		zPosition = newZPosition;
		zPositionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getZPosition <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZPosition()
	 * @see #getZPosition()
	 * @see #setZPosition(String)
	 * @generated
	 */
	public void unsetZPosition() {
		zPosition = ZPOSITION_EDEFAULT;
		zPositionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getZPosition <em>ZPosition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ZPosition</em>' attribute is set.
	 * @see #unsetZPosition()
	 * @see #getZPosition()
	 * @see #setZPosition(String)
	 * @generated
	 */
	public boolean isSetZPosition() {
		return zPositionESet;
	}

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
		sequenceNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public void unsetSequenceNumber() {
		sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
		sequenceNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public boolean isSetSequenceNumber() {
		return sequenceNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPosition</em>' attribute.
	 * @see #isSetYPosition()
	 * @see #unsetYPosition()
	 * @see #setYPosition(String)
	 * @generated
	 */
	public String getYPosition() {
		return yPosition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #isSetYPosition()
	 * @see #unsetYPosition()
	 * @see #getYPosition()
	 * @generated
	 */
	public void setYPosition(String newYPosition) {
		yPosition = newYPosition;
		yPositionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYPosition()
	 * @see #getYPosition()
	 * @see #setYPosition(String)
	 * @generated
	 */
	public void unsetYPosition() {
		yPosition = YPOSITION_EDEFAULT;
		yPositionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getYPosition <em>YPosition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YPosition</em>' attribute is set.
	 * @see #unsetYPosition()
	 * @see #getYPosition()
	 * @see #setYPosition(String)
	 * @generated
	 */
	public boolean isSetYPosition() {
		return yPositionESet;
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getPositionPoints <em>Position Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM15.IEC61968.Common.Location#getPositionPoints
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PositionPoint#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__POSITION_POINTS, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CommonPackage.LOCATION__POSITION_POINTS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
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
			case CommonPackage.POSITION_POINT__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__POSITION_POINTS, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
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
			case CommonPackage.POSITION_POINT__LOCATION:
				return basicSetLocation(null, msgs);
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
			case CommonPackage.POSITION_POINT__XPOSITION:
				return getXPosition();
			case CommonPackage.POSITION_POINT__ZPOSITION:
				return getZPosition();
			case CommonPackage.POSITION_POINT__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CommonPackage.POSITION_POINT__YPOSITION:
				return getYPosition();
			case CommonPackage.POSITION_POINT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case CommonPackage.POSITION_POINT__XPOSITION:
				setXPosition((String)newValue);
				return;
			case CommonPackage.POSITION_POINT__ZPOSITION:
				setZPosition((String)newValue);
				return;
			case CommonPackage.POSITION_POINT__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case CommonPackage.POSITION_POINT__YPOSITION:
				setYPosition((String)newValue);
				return;
			case CommonPackage.POSITION_POINT__LOCATION:
				setLocation((Location)newValue);
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
			case CommonPackage.POSITION_POINT__XPOSITION:
				unsetXPosition();
				return;
			case CommonPackage.POSITION_POINT__ZPOSITION:
				unsetZPosition();
				return;
			case CommonPackage.POSITION_POINT__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case CommonPackage.POSITION_POINT__YPOSITION:
				unsetYPosition();
				return;
			case CommonPackage.POSITION_POINT__LOCATION:
				setLocation((Location)null);
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
			case CommonPackage.POSITION_POINT__XPOSITION:
				return isSetXPosition();
			case CommonPackage.POSITION_POINT__ZPOSITION:
				return isSetZPosition();
			case CommonPackage.POSITION_POINT__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case CommonPackage.POSITION_POINT__YPOSITION:
				return isSetYPosition();
			case CommonPackage.POSITION_POINT__LOCATION:
				return location != null;
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
		result.append(" (xPosition: ");
		if (xPositionESet) result.append(xPosition); else result.append("<unset>");
		result.append(", zPosition: ");
		if (zPositionESet) result.append(zPosition); else result.append("<unset>");
		result.append(", sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(", yPosition: ");
		if (yPositionESet) result.append(yPosition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PositionPoint
