/**
 */
package CIM15.IEC61970.Graphics;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfGMLSupport.Diagram;
import CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getOffsetY <em>Offset Y</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#isIsPolygon <em>Is Polygon</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getRotation <em>Rotation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getIdentifiedObject <em>Identified Object</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObject#getDrawingOrder <em>Drawing Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramObject extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getOffsetY() <em>Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetY()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffsetY() <em>Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetY()
	 * @generated
	 * @ordered
	 */
	protected float offsetY = OFFSET_Y_EDEFAULT;

	/**
	 * This is true if the Offset Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetYESet;

	/**
	 * The default value of the '{@link #getOffsetX() <em>Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetX()
	 * @generated
	 * @ordered
	 */
	protected static final float OFFSET_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOffsetX() <em>Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetX()
	 * @generated
	 * @ordered
	 */
	protected float offsetX = OFFSET_X_EDEFAULT;

	/**
	 * This is true if the Offset X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetXESet;

	/**
	 * The default value of the '{@link #isIsPolygon() <em>Is Polygon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPolygon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_POLYGON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPolygon() <em>Is Polygon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPolygon()
	 * @generated
	 * @ordered
	 */
	protected boolean isPolygon = IS_POLYGON_EDEFAULT;

	/**
	 * This is true if the Is Polygon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPolygonESet;

	/**
	 * The cached value of the '{@link #getVisibilityLayers() <em>Visibility Layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<VisibilityLayer> visibilityLayers;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final float ROTATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected float rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * The cached value of the '{@link #getIdentifiedObject() <em>Identified Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedObject()
	 * @generated
	 * @ordered
	 */
	protected IdentifiedObject identifiedObject;

	/**
	 * The cached value of the '{@link #getDiagramObjectStyle() <em>Diagram Object Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObjectStyle()
	 * @generated
	 * @ordered
	 */
	protected DiagramObjectStyle diagramObjectStyle;

	/**
	 * The cached value of the '{@link #getDiagramObjectPoints() <em>Diagram Object Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObjectPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramObjectPoint> diagramObjectPoints;

	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected Diagram diagram;

	/**
	 * The default value of the '{@link #getDrawingOrder() <em>Drawing Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAWING_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDrawingOrder() <em>Drawing Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingOrder()
	 * @generated
	 * @ordered
	 */
	protected int drawingOrder = DRAWING_ORDER_EDEFAULT;

	/**
	 * This is true if the Drawing Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean drawingOrderESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramObject() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicsPackage.Literals.DIAGRAM_OBJECT;
	}

	/**
	 * Returns the value of the '<em><b>Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Y</em>' attribute.
	 * @see #isSetOffsetY()
	 * @see #unsetOffsetY()
	 * @see #setOffsetY(float)
	 * @generated
	 */
	public float getOffsetY() {
		return offsetY;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Y</em>' attribute.
	 * @see #isSetOffsetY()
	 * @see #unsetOffsetY()
	 * @see #getOffsetY()
	 * @generated
	 */
	public void setOffsetY(float newOffsetY) {
		offsetY = newOffsetY;
		offsetYESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffsetY()
	 * @see #getOffsetY()
	 * @see #setOffsetY(float)
	 * @generated
	 */
	public void unsetOffsetY() {
		offsetY = OFFSET_Y_EDEFAULT;
		offsetYESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset Y</em>' attribute is set.
	 * @see #unsetOffsetY()
	 * @see #getOffsetY()
	 * @see #setOffsetY(float)
	 * @generated
	 */
	public boolean isSetOffsetY() {
		return offsetYESet;
	}

	/**
	 * Returns the value of the '<em><b>Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset X</em>' attribute.
	 * @see #isSetOffsetX()
	 * @see #unsetOffsetX()
	 * @see #setOffsetX(float)
	 * @generated
	 */
	public float getOffsetX() {
		return offsetX;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getOffsetX <em>Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset X</em>' attribute.
	 * @see #isSetOffsetX()
	 * @see #unsetOffsetX()
	 * @see #getOffsetX()
	 * @generated
	 */
	public void setOffsetX(float newOffsetX) {
		offsetX = newOffsetX;
		offsetXESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getOffsetX <em>Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffsetX()
	 * @see #getOffsetX()
	 * @see #setOffsetX(float)
	 * @generated
	 */
	public void unsetOffsetX() {
		offsetX = OFFSET_X_EDEFAULT;
		offsetXESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getOffsetX <em>Offset X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset X</em>' attribute is set.
	 * @see #unsetOffsetX()
	 * @see #getOffsetX()
	 * @see #setOffsetX(float)
	 * @generated
	 */
	public boolean isSetOffsetX() {
		return offsetXESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Polygon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Polygon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Polygon</em>' attribute.
	 * @see #isSetIsPolygon()
	 * @see #unsetIsPolygon()
	 * @see #setIsPolygon(boolean)
	 * @generated
	 */
	public boolean isIsPolygon() {
		return isPolygon;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#isIsPolygon <em>Is Polygon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Polygon</em>' attribute.
	 * @see #isSetIsPolygon()
	 * @see #unsetIsPolygon()
	 * @see #isIsPolygon()
	 * @generated
	 */
	public void setIsPolygon(boolean newIsPolygon) {
		isPolygon = newIsPolygon;
		isPolygonESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#isIsPolygon <em>Is Polygon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPolygon()
	 * @see #isIsPolygon()
	 * @see #setIsPolygon(boolean)
	 * @generated
	 */
	public void unsetIsPolygon() {
		isPolygon = IS_POLYGON_EDEFAULT;
		isPolygonESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#isIsPolygon <em>Is Polygon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Polygon</em>' attribute is set.
	 * @see #unsetIsPolygon()
	 * @see #isIsPolygon()
	 * @see #setIsPolygon(boolean)
	 * @generated
	 */
	public boolean isSetIsPolygon() {
		return isPolygonESet;
	}

	/**
	 * Returns the value of the '<em><b>Visibility Layers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Graphics.VisibilityLayer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.VisibilityLayer#getDiagramObjects3 <em>Diagram Objects3</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Layers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Layers</em>' reference list.
	 * @see CIM15.IEC61970.Graphics.VisibilityLayer#getDiagramObjects3
	 * @generated
	 */
	public EList<VisibilityLayer> getVisibilityLayers() {
		if (visibilityLayers == null) {
			visibilityLayers = new BasicInternalEList<VisibilityLayer>(VisibilityLayer.class);
		}
		return visibilityLayers;
	}

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(float)
	 * @generated
	 */
	public float getRotation() {
		return rotation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @generated
	 */
	public void setRotation(float newRotation) {
		rotation = newRotation;
		rotationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(float)
	 * @generated
	 */
	public void unsetRotation() {
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getRotation <em>Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation</em>' attribute is set.
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @see #setRotation(float)
	 * @generated
	 */
	public boolean isSetRotation() {
		return rotationESet;
	}

	/**
	 * Returns the value of the '<em><b>Identified Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identified Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identified Object</em>' reference.
	 * @see #setIdentifiedObject(IdentifiedObject)
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getDiagramObjects
	 * @generated
	 */
	public IdentifiedObject getIdentifiedObject() {
		if (identifiedObject != null && identifiedObject.eIsProxy()) {
			InternalEObject oldIdentifiedObject = (InternalEObject)identifiedObject;
			identifiedObject = (IdentifiedObject)eResolveProxy(oldIdentifiedObject);
			if (identifiedObject != oldIdentifiedObject) {
			}
		}
		return identifiedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiedObject basicGetIdentifiedObject() {
		return identifiedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiedObject(IdentifiedObject newIdentifiedObject, NotificationChain msgs) {
		IdentifiedObject oldIdentifiedObject = identifiedObject;
		identifiedObject = newIdentifiedObject;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getIdentifiedObject <em>Identified Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identified Object</em>' reference.
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	public void setIdentifiedObject(IdentifiedObject newIdentifiedObject) {
		if (newIdentifiedObject != identifiedObject) {
			NotificationChain msgs = null;
			if (identifiedObject != null)
				msgs = ((InternalEObject)identifiedObject).eInverseRemove(this, CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, IdentifiedObject.class, msgs);
			if (newIdentifiedObject != null)
				msgs = ((InternalEObject)newIdentifiedObject).eInverseAdd(this, CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, IdentifiedObject.class, msgs);
			msgs = basicSetIdentifiedObject(newIdentifiedObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Diagram Object Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObjectStyle#getDiagramObjects2 <em>Diagram Objects2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Object Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Object Style</em>' reference.
	 * @see #setDiagramObjectStyle(DiagramObjectStyle)
	 * @see CIM15.IEC61970.Graphics.DiagramObjectStyle#getDiagramObjects2
	 * @generated
	 */
	public DiagramObjectStyle getDiagramObjectStyle() {
		if (diagramObjectStyle != null && diagramObjectStyle.eIsProxy()) {
			InternalEObject oldDiagramObjectStyle = (InternalEObject)diagramObjectStyle;
			diagramObjectStyle = (DiagramObjectStyle)eResolveProxy(oldDiagramObjectStyle);
			if (diagramObjectStyle != oldDiagramObjectStyle) {
			}
		}
		return diagramObjectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObjectStyle basicGetDiagramObjectStyle() {
		return diagramObjectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagramObjectStyle(DiagramObjectStyle newDiagramObjectStyle, NotificationChain msgs) {
		DiagramObjectStyle oldDiagramObjectStyle = diagramObjectStyle;
		diagramObjectStyle = newDiagramObjectStyle;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Object Style</em>' reference.
	 * @see #getDiagramObjectStyle()
	 * @generated
	 */
	public void setDiagramObjectStyle(DiagramObjectStyle newDiagramObjectStyle) {
		if (newDiagramObjectStyle != diagramObjectStyle) {
			NotificationChain msgs = null;
			if (diagramObjectStyle != null)
				msgs = ((InternalEObject)diagramObjectStyle).eInverseRemove(this, GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2, DiagramObjectStyle.class, msgs);
			if (newDiagramObjectStyle != null)
				msgs = ((InternalEObject)newDiagramObjectStyle).eInverseAdd(this, GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2, DiagramObjectStyle.class, msgs);
			msgs = basicSetDiagramObjectStyle(newDiagramObjectStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Diagram Object Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Graphics.DiagramObjectPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Object Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Object Points</em>' reference list.
	 * @see CIM15.IEC61970.Graphics.DiagramObjectPoint#getDiagramObject
	 * @generated
	 */
	public EList<DiagramObjectPoint> getDiagramObjectPoints() {
		if (diagramObjectPoints == null) {
			diagramObjectPoints = new BasicInternalEList<DiagramObjectPoint>(DiagramObjectPoint.class);
		}
		return diagramObjectPoints;
	}

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDiagramObjects3 <em>Diagram Objects3</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' reference.
	 * @see #setDiagram(Diagram)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDiagramObjects3
	 * @generated
	 */
	public Diagram getDiagram() {
		if (diagram != null && diagram.eIsProxy()) {
			InternalEObject oldDiagram = (InternalEObject)diagram;
			diagram = (Diagram)eResolveProxy(oldDiagram);
			if (diagram != oldDiagram) {
			}
		}
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetDiagram() {
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		Diagram oldDiagram = diagram;
		diagram = newDiagram;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getDiagram <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' reference.
	 * @see #getDiagram()
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		if (newDiagram != diagram) {
			NotificationChain msgs = null;
			if (diagram != null)
				msgs = ((InternalEObject)diagram).eInverseRemove(this, InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3, Diagram.class, msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3, Diagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Drawing Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawing Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawing Order</em>' attribute.
	 * @see #isSetDrawingOrder()
	 * @see #unsetDrawingOrder()
	 * @see #setDrawingOrder(int)
	 * @generated
	 */
	public int getDrawingOrder() {
		return drawingOrder;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawing Order</em>' attribute.
	 * @see #isSetDrawingOrder()
	 * @see #unsetDrawingOrder()
	 * @see #getDrawingOrder()
	 * @generated
	 */
	public void setDrawingOrder(int newDrawingOrder) {
		drawingOrder = newDrawingOrder;
		drawingOrderESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawingOrder()
	 * @see #getDrawingOrder()
	 * @see #setDrawingOrder(int)
	 * @generated
	 */
	public void unsetDrawingOrder() {
		drawingOrder = DRAWING_ORDER_EDEFAULT;
		drawingOrderESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Drawing Order</em>' attribute is set.
	 * @see #unsetDrawingOrder()
	 * @see #getDrawingOrder()
	 * @see #setDrawingOrder(int)
	 * @generated
	 */
	public boolean isSetDrawingOrder() {
		return drawingOrderESet;
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
			case GraphicsPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVisibilityLayers()).basicAdd(otherEnd, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
				if (identifiedObject != null)
					msgs = ((InternalEObject)identifiedObject).eInverseRemove(this, CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS, IdentifiedObject.class, msgs);
				return basicSetIdentifiedObject((IdentifiedObject)otherEnd, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
				if (diagramObjectStyle != null)
					msgs = ((InternalEObject)diagramObjectStyle).eInverseRemove(this, GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2, DiagramObjectStyle.class, msgs);
				return basicSetDiagramObjectStyle((DiagramObjectStyle)otherEnd, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramObjectPoints()).basicAdd(otherEnd, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM:
				if (diagram != null)
					msgs = ((InternalEObject)diagram).eInverseRemove(this, InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3, Diagram.class, msgs);
				return basicSetDiagram((Diagram)otherEnd, msgs);
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
			case GraphicsPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
				return ((InternalEList<?>)getVisibilityLayers()).basicRemove(otherEnd, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
				return basicSetIdentifiedObject(null, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
				return basicSetDiagramObjectStyle(null, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
				return ((InternalEList<?>)getDiagramObjectPoints()).basicRemove(otherEnd, msgs);
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM:
				return basicSetDiagram(null, msgs);
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
			case GraphicsPackage.DIAGRAM_OBJECT__OFFSET_Y:
				return getOffsetY();
			case GraphicsPackage.DIAGRAM_OBJECT__OFFSET_X:
				return getOffsetX();
			case GraphicsPackage.DIAGRAM_OBJECT__IS_POLYGON:
				return isIsPolygon();
			case GraphicsPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
				return getVisibilityLayers();
			case GraphicsPackage.DIAGRAM_OBJECT__ROTATION:
				return getRotation();
			case GraphicsPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
				if (resolve) return getIdentifiedObject();
				return basicGetIdentifiedObject();
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
				if (resolve) return getDiagramObjectStyle();
				return basicGetDiagramObjectStyle();
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
				return getDiagramObjectPoints();
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
			case GraphicsPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
				return getDrawingOrder();
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
			case GraphicsPackage.DIAGRAM_OBJECT__OFFSET_Y:
				setOffsetY((Float)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__OFFSET_X:
				setOffsetX((Float)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__IS_POLYGON:
				setIsPolygon((Boolean)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
				getVisibilityLayers().clear();
				getVisibilityLayers().addAll((Collection<? extends VisibilityLayer>)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__ROTATION:
				setRotation((Float)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
				setIdentifiedObject((IdentifiedObject)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
				setDiagramObjectStyle((DiagramObjectStyle)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
				getDiagramObjectPoints().clear();
				getDiagramObjectPoints().addAll((Collection<? extends DiagramObjectPoint>)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
				setDrawingOrder((Integer)newValue);
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
			case GraphicsPackage.DIAGRAM_OBJECT__OFFSET_Y:
				unsetOffsetY();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__OFFSET_X:
				unsetOffsetX();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__IS_POLYGON:
				unsetIsPolygon();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
				getVisibilityLayers().clear();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__ROTATION:
				unsetRotation();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
				setIdentifiedObject((IdentifiedObject)null);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
				setDiagramObjectStyle((DiagramObjectStyle)null);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
				getDiagramObjectPoints().clear();
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case GraphicsPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
				unsetDrawingOrder();
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
			case GraphicsPackage.DIAGRAM_OBJECT__OFFSET_Y:
				return isSetOffsetY();
			case GraphicsPackage.DIAGRAM_OBJECT__OFFSET_X:
				return isSetOffsetX();
			case GraphicsPackage.DIAGRAM_OBJECT__IS_POLYGON:
				return isSetIsPolygon();
			case GraphicsPackage.DIAGRAM_OBJECT__VISIBILITY_LAYERS:
				return visibilityLayers != null && !visibilityLayers.isEmpty();
			case GraphicsPackage.DIAGRAM_OBJECT__ROTATION:
				return isSetRotation();
			case GraphicsPackage.DIAGRAM_OBJECT__IDENTIFIED_OBJECT:
				return identifiedObject != null;
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_STYLE:
				return diagramObjectStyle != null;
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM_OBJECT_POINTS:
				return diagramObjectPoints != null && !diagramObjectPoints.isEmpty();
			case GraphicsPackage.DIAGRAM_OBJECT__DIAGRAM:
				return diagram != null;
			case GraphicsPackage.DIAGRAM_OBJECT__DRAWING_ORDER:
				return isSetDrawingOrder();
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
		result.append(" (offsetY: ");
		if (offsetYESet) result.append(offsetY); else result.append("<unset>");
		result.append(", offsetX: ");
		if (offsetXESet) result.append(offsetX); else result.append("<unset>");
		result.append(", isPolygon: ");
		if (isPolygonESet) result.append(isPolygon); else result.append("<unset>");
		result.append(", rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", drawingOrder: ");
		if (drawingOrderESet) result.append(drawingOrder); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DiagramObject
