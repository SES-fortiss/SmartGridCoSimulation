/**
 */
package CIM15.IEC61970.Graphics;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Object Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getZPosition <em>ZPosition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramObjectPoint extends Element {
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
	 * The cached value of the '{@link #getDiagramObjectGluePoint() <em>Diagram Object Glue Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObjectGluePoint()
	 * @generated
	 * @ordered
	 */
	protected DiagramObjectGluePoint diagramObjectGluePoint;

	/**
	 * The cached value of the '{@link #getDiagramObject() <em>Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObject()
	 * @generated
	 * @ordered
	 */
	protected DiagramObject diagramObject;

	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final float XPOSITION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected float xPosition = XPOSITION_EDEFAULT;

	/**
	 * This is true if the XPosition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xPositionESet;

	/**
	 * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected static final float YPOSITION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected float yPosition = YPOSITION_EDEFAULT;

	/**
	 * This is true if the YPosition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yPositionESet;

	/**
	 * The default value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZPosition()
	 * @generated
	 * @ordered
	 */
	protected static final float ZPOSITION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZPosition()
	 * @generated
	 * @ordered
	 */
	protected float zPosition = ZPOSITION_EDEFAULT;

	/**
	 * This is true if the ZPosition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zPositionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramObjectPoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicsPackage.Literals.DIAGRAM_OBJECT_POINT;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Diagram Object Glue Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObjectGluePoint#getDiagramObjectPoints <em>Diagram Object Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Object Glue Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Object Glue Point</em>' reference.
	 * @see #setDiagramObjectGluePoint(DiagramObjectGluePoint)
	 * @see CIM15.IEC61970.Graphics.DiagramObjectGluePoint#getDiagramObjectPoints
	 * @generated
	 */
	public DiagramObjectGluePoint getDiagramObjectGluePoint() {
		if (diagramObjectGluePoint != null && diagramObjectGluePoint.eIsProxy()) {
			InternalEObject oldDiagramObjectGluePoint = (InternalEObject)diagramObjectGluePoint;
			diagramObjectGluePoint = (DiagramObjectGluePoint)eResolveProxy(oldDiagramObjectGluePoint);
			if (diagramObjectGluePoint != oldDiagramObjectGluePoint) {
			}
		}
		return diagramObjectGluePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObjectGluePoint basicGetDiagramObjectGluePoint() {
		return diagramObjectGluePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagramObjectGluePoint(DiagramObjectGluePoint newDiagramObjectGluePoint, NotificationChain msgs) {
		DiagramObjectGluePoint oldDiagramObjectGluePoint = diagramObjectGluePoint;
		diagramObjectGluePoint = newDiagramObjectGluePoint;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Object Glue Point</em>' reference.
	 * @see #getDiagramObjectGluePoint()
	 * @generated
	 */
	public void setDiagramObjectGluePoint(DiagramObjectGluePoint newDiagramObjectGluePoint) {
		if (newDiagramObjectGluePoint != diagramObjectGluePoint) {
			NotificationChain msgs = null;
			if (diagramObjectGluePoint != null)
				msgs = ((InternalEObject)diagramObjectGluePoint).eInverseRemove(this, GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS, DiagramObjectGluePoint.class, msgs);
			if (newDiagramObjectGluePoint != null)
				msgs = ((InternalEObject)newDiagramObjectGluePoint).eInverseAdd(this, GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS, DiagramObjectGluePoint.class, msgs);
			msgs = basicSetDiagramObjectGluePoint(newDiagramObjectGluePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Object</em>' reference.
	 * @see #setDiagramObject(DiagramObject)
	 * @see CIM15.IEC61970.Graphics.DiagramObject#getDiagramObjectPoints
	 * @generated
	 */
	public DiagramObject getDiagramObject() {
		if (diagramObject != null && diagramObject.eIsProxy()) {
			InternalEObject oldDiagramObject = (InternalEObject)diagramObject;
			diagramObject = (DiagramObject)eResolveProxy(oldDiagramObject);
			if (diagramObject != oldDiagramObject) {
			}
		}
		return diagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObject basicGetDiagramObject() {
		return diagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagramObject(DiagramObject newDiagramObject, NotificationChain msgs) {
		DiagramObject oldDiagramObject = diagramObject;
		diagramObject = newDiagramObject;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Object</em>' reference.
	 * @see #getDiagramObject()
	 * @generated
	 */
	public void setDiagramObject(DiagramObject newDiagramObject) {
		if (newDiagramObject != diagramObject) {
			NotificationChain msgs = null;
			if (diagramObject != null)
				msgs = ((InternalEObject)diagramObject).eInverseRemove(this, GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS, DiagramObject.class, msgs);
			if (newDiagramObject != null)
				msgs = ((InternalEObject)newDiagramObject).eInverseAdd(this, GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS, DiagramObject.class, msgs);
			msgs = basicSetDiagramObject(newDiagramObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * @see #setXPosition(float)
	 * @generated
	 */
	public float getXPosition() {
		return xPosition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPosition</em>' attribute.
	 * @see #isSetXPosition()
	 * @see #unsetXPosition()
	 * @see #getXPosition()
	 * @generated
	 */
	public void setXPosition(float newXPosition) {
		xPosition = newXPosition;
		xPositionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXPosition()
	 * @see #getXPosition()
	 * @see #setXPosition(float)
	 * @generated
	 */
	public void unsetXPosition() {
		xPosition = XPOSITION_EDEFAULT;
		xPositionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getXPosition <em>XPosition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XPosition</em>' attribute is set.
	 * @see #unsetXPosition()
	 * @see #getXPosition()
	 * @see #setXPosition(float)
	 * @generated
	 */
	public boolean isSetXPosition() {
		return xPositionESet;
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
	 * @see #setYPosition(float)
	 * @generated
	 */
	public float getYPosition() {
		return yPosition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #isSetYPosition()
	 * @see #unsetYPosition()
	 * @see #getYPosition()
	 * @generated
	 */
	public void setYPosition(float newYPosition) {
		yPosition = newYPosition;
		yPositionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYPosition()
	 * @see #getYPosition()
	 * @see #setYPosition(float)
	 * @generated
	 */
	public void unsetYPosition() {
		yPosition = YPOSITION_EDEFAULT;
		yPositionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getYPosition <em>YPosition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YPosition</em>' attribute is set.
	 * @see #unsetYPosition()
	 * @see #getYPosition()
	 * @see #setYPosition(float)
	 * @generated
	 */
	public boolean isSetYPosition() {
		return yPositionESet;
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
	 * @see #setZPosition(float)
	 * @generated
	 */
	public float getZPosition() {
		return zPosition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getZPosition <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZPosition</em>' attribute.
	 * @see #isSetZPosition()
	 * @see #unsetZPosition()
	 * @see #getZPosition()
	 * @generated
	 */
	public void setZPosition(float newZPosition) {
		zPosition = newZPosition;
		zPositionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getZPosition <em>ZPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZPosition()
	 * @see #getZPosition()
	 * @see #setZPosition(float)
	 * @generated
	 */
	public void unsetZPosition() {
		zPosition = ZPOSITION_EDEFAULT;
		zPositionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getZPosition <em>ZPosition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ZPosition</em>' attribute is set.
	 * @see #unsetZPosition()
	 * @see #getZPosition()
	 * @see #setZPosition(float)
	 * @generated
	 */
	public boolean isSetZPosition() {
		return zPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
				if (diagramObjectGluePoint != null)
					msgs = ((InternalEObject)diagramObjectGluePoint).eInverseRemove(this, GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS, DiagramObjectGluePoint.class, msgs);
				return basicSetDiagramObjectGluePoint((DiagramObjectGluePoint)otherEnd, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
				if (diagramObject != null)
					msgs = ((InternalEObject)diagramObject).eInverseRemove(this, GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS, DiagramObject.class, msgs);
				return basicSetDiagramObject((DiagramObject)otherEnd, msgs);
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
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
				return basicSetDiagramObjectGluePoint(null, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
				return basicSetDiagramObject(null, msgs);
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
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
				if (resolve) return getDiagramObjectGluePoint();
				return basicGetDiagramObjectGluePoint();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
				if (resolve) return getDiagramObject();
				return basicGetDiagramObject();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
				return getXPosition();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
				return getYPosition();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
				return getZPosition();
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
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
				setDiagramObjectGluePoint((DiagramObjectGluePoint)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
				setDiagramObject((DiagramObject)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
				setXPosition((Float)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
				setYPosition((Float)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
				setZPosition((Float)newValue);
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
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
				setDiagramObjectGluePoint((DiagramObjectGluePoint)null);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
				setDiagramObject((DiagramObject)null);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
				unsetXPosition();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
				unsetYPosition();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
				unsetZPosition();
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
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT_GLUE_POINT:
				return diagramObjectGluePoint != null;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__DIAGRAM_OBJECT:
				return diagramObject != null;
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__XPOSITION:
				return isSetXPosition();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__YPOSITION:
				return isSetYPosition();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT__ZPOSITION:
				return isSetZPosition();
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
		result.append(" (sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(", xPosition: ");
		if (xPositionESet) result.append(xPosition); else result.append("<unset>");
		result.append(", yPosition: ");
		if (yPositionESet) result.append(yPosition); else result.append("<unset>");
		result.append(", zPosition: ");
		if (zPositionESet) result.append(zPosition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DiagramObjectPoint
