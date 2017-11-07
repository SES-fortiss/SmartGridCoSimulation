/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import CIM15.IEC61968.Common.CommonPackage;
import CIM15.IEC61968.Common.CoordinateSystem;
import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Graphics.DiagramObject;
import CIM15.IEC61970.Graphics.OrientationKind;

import CIM15.IEC61970.Informative.InfWork.DesignLocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY1InitialView <em>Y1 Initial View</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDiagramObjects3 <em>Diagram Objects3</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX2InitialView <em>X2 Initial View</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX1InitialView <em>X1 Initial View</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY2InitialView <em>Y2 Initial View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Diagram extends Document {
	/**
	 * The default value of the '{@link #getY1InitialView() <em>Y1 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1InitialView()
	 * @generated
	 * @ordered
	 */
	protected static final float Y1_INITIAL_VIEW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY1InitialView() <em>Y1 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1InitialView()
	 * @generated
	 * @ordered
	 */
	protected float y1InitialView = Y1_INITIAL_VIEW_EDEFAULT;

	/**
	 * This is true if the Y1 Initial View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y1InitialViewESet;

	/**
	 * The cached value of the '{@link #getDiagramObjects3() <em>Diagram Objects3</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObjects3()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramObject> diagramObjects3;

	/**
	 * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected CoordinateSystem coordinateSystem;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DiagramKind KIND_EDEFAULT = DiagramKind.OTHER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DiagramKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getGmlDiagramObjects() <em>Gml Diagram Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlDiagramObject> gmlDiagramObjects;

	/**
	 * The default value of the '{@link #getX2InitialView() <em>X2 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2InitialView()
	 * @generated
	 * @ordered
	 */
	protected static final float X2_INITIAL_VIEW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX2InitialView() <em>X2 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2InitialView()
	 * @generated
	 * @ordered
	 */
	protected float x2InitialView = X2_INITIAL_VIEW_EDEFAULT;

	/**
	 * This is true if the X2 Initial View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x2InitialViewESet;

	/**
	 * The default value of the '{@link #getX1InitialView() <em>X1 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1InitialView()
	 * @generated
	 * @ordered
	 */
	protected static final float X1_INITIAL_VIEW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX1InitialView() <em>X1 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1InitialView()
	 * @generated
	 * @ordered
	 */
	protected float x1InitialView = X1_INITIAL_VIEW_EDEFAULT;

	/**
	 * This is true if the X1 Initial View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x1InitialViewESet;

	/**
	 * The cached value of the '{@link #getDesignLocations() <em>Design Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocation> designLocations;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationKind ORIENTATION_EDEFAULT = OrientationKind.NEGATIVE;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationKind orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getY2InitialView() <em>Y2 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2InitialView()
	 * @generated
	 * @ordered
	 */
	protected static final float Y2_INITIAL_VIEW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY2InitialView() <em>Y2 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2InitialView()
	 * @generated
	 * @ordered
	 */
	protected float y2InitialView = Y2_INITIAL_VIEW_EDEFAULT;

	/**
	 * This is true if the Y2 Initial View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y2InitialViewESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Diagram() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.DIAGRAM;
	}

	/**
	 * Returns the value of the '<em><b>Y1 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1 Initial View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1 Initial View</em>' attribute.
	 * @see #isSetY1InitialView()
	 * @see #unsetY1InitialView()
	 * @see #setY1InitialView(float)
	 * @generated
	 */
	public float getY1InitialView() {
		return y1InitialView;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1 Initial View</em>' attribute.
	 * @see #isSetY1InitialView()
	 * @see #unsetY1InitialView()
	 * @see #getY1InitialView()
	 * @generated
	 */
	public void setY1InitialView(float newY1InitialView) {
		y1InitialView = newY1InitialView;
		y1InitialViewESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY1InitialView()
	 * @see #getY1InitialView()
	 * @see #setY1InitialView(float)
	 * @generated
	 */
	public void unsetY1InitialView() {
		y1InitialView = Y1_INITIAL_VIEW_EDEFAULT;
		y1InitialViewESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y1 Initial View</em>' attribute is set.
	 * @see #unsetY1InitialView()
	 * @see #getY1InitialView()
	 * @see #setY1InitialView(float)
	 * @generated
	 */
	public boolean isSetY1InitialView() {
		return y1InitialViewESet;
	}

	/**
	 * Returns the value of the '<em><b>Diagram Objects3</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Graphics.DiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObject#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Objects3</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Objects3</em>' reference list.
	 * @see CIM15.IEC61970.Graphics.DiagramObject#getDiagram
	 * @generated
	 */
	public EList<DiagramObject> getDiagramObjects3() {
		if (diagramObjects3 == null) {
			diagramObjects3 = new BasicInternalEList<DiagramObject>(DiagramObject.class);
		}
		return diagramObjects3;
	}

	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.CoordinateSystem#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate System</em>' reference.
	 * @see #setCoordinateSystem(CoordinateSystem)
	 * @see CIM15.IEC61968.Common.CoordinateSystem#getDiagrams
	 * @generated
	 */
	public CoordinateSystem getCoordinateSystem() {
		if (coordinateSystem != null && coordinateSystem.eIsProxy()) {
			InternalEObject oldCoordinateSystem = (InternalEObject)coordinateSystem;
			coordinateSystem = (CoordinateSystem)eResolveProxy(oldCoordinateSystem);
			if (coordinateSystem != oldCoordinateSystem) {
			}
		}
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem basicGetCoordinateSystem() {
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(CoordinateSystem newCoordinateSystem, NotificationChain msgs) {
		CoordinateSystem oldCoordinateSystem = coordinateSystem;
		coordinateSystem = newCoordinateSystem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	public void setCoordinateSystem(CoordinateSystem newCoordinateSystem) {
		if (newCoordinateSystem != coordinateSystem) {
			NotificationChain msgs = null;
			if (coordinateSystem != null)
				msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, CommonPackage.COORDINATE_SYSTEM__DIAGRAMS, CoordinateSystem.class, msgs);
			if (newCoordinateSystem != null)
				msgs = ((InternalEObject)newCoordinateSystem).eInverseAdd(this, CommonPackage.COORDINATE_SYSTEM__DIAGRAMS, CoordinateSystem.class, msgs);
			msgs = basicSetCoordinateSystem(newCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(DiagramKind)
	 * @generated
	 */
	public DiagramKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.DiagramKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(DiagramKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(DiagramKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(DiagramKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Objects</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams
	 * @generated
	 */
	public EList<GmlDiagramObject> getGmlDiagramObjects() {
		if (gmlDiagramObjects == null) {
			gmlDiagramObjects = new BasicInternalEList<GmlDiagramObject>(GmlDiagramObject.class);
		}
		return gmlDiagramObjects;
	}

	/**
	 * Returns the value of the '<em><b>X2 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2 Initial View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2 Initial View</em>' attribute.
	 * @see #isSetX2InitialView()
	 * @see #unsetX2InitialView()
	 * @see #setX2InitialView(float)
	 * @generated
	 */
	public float getX2InitialView() {
		return x2InitialView;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2 Initial View</em>' attribute.
	 * @see #isSetX2InitialView()
	 * @see #unsetX2InitialView()
	 * @see #getX2InitialView()
	 * @generated
	 */
	public void setX2InitialView(float newX2InitialView) {
		x2InitialView = newX2InitialView;
		x2InitialViewESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX2InitialView()
	 * @see #getX2InitialView()
	 * @see #setX2InitialView(float)
	 * @generated
	 */
	public void unsetX2InitialView() {
		x2InitialView = X2_INITIAL_VIEW_EDEFAULT;
		x2InitialViewESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X2 Initial View</em>' attribute is set.
	 * @see #unsetX2InitialView()
	 * @see #getX2InitialView()
	 * @see #setX2InitialView(float)
	 * @generated
	 */
	public boolean isSetX2InitialView() {
		return x2InitialViewESet;
	}

	/**
	 * Returns the value of the '<em><b>X1 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1 Initial View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1 Initial View</em>' attribute.
	 * @see #isSetX1InitialView()
	 * @see #unsetX1InitialView()
	 * @see #setX1InitialView(float)
	 * @generated
	 */
	public float getX1InitialView() {
		return x1InitialView;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1 Initial View</em>' attribute.
	 * @see #isSetX1InitialView()
	 * @see #unsetX1InitialView()
	 * @see #getX1InitialView()
	 * @generated
	 */
	public void setX1InitialView(float newX1InitialView) {
		x1InitialView = newX1InitialView;
		x1InitialViewESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX1InitialView()
	 * @see #getX1InitialView()
	 * @see #setX1InitialView(float)
	 * @generated
	 */
	public void unsetX1InitialView() {
		x1InitialView = X1_INITIAL_VIEW_EDEFAULT;
		x1InitialViewESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X1 Initial View</em>' attribute is set.
	 * @see #unsetX1InitialView()
	 * @see #getX1InitialView()
	 * @see #setX1InitialView(float)
	 * @generated
	 */
	public boolean isSetX1InitialView() {
		return x1InitialViewESet;
	}

	/**
	 * Returns the value of the '<em><b>Design Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.DesignLocation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getDiagrams
	 * @generated
	 */
	public EList<DesignLocation> getDesignLocations() {
		if (designLocations == null) {
			designLocations = new BasicInternalEList<DesignLocation>(DesignLocation.class);
		}
		return designLocations;
	}

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Graphics.OrientationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see CIM15.IEC61970.Graphics.OrientationKind
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(OrientationKind)
	 * @generated
	 */
	public OrientationKind getOrientation() {
		return orientation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see CIM15.IEC61970.Graphics.OrientationKind
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	public void setOrientation(OrientationKind newOrientation) {
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		orientationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationKind)
	 * @generated
	 */
	public void unsetOrientation() {
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationKind)
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * Returns the value of the '<em><b>Y2 Initial View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2 Initial View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2 Initial View</em>' attribute.
	 * @see #isSetY2InitialView()
	 * @see #unsetY2InitialView()
	 * @see #setY2InitialView(float)
	 * @generated
	 */
	public float getY2InitialView() {
		return y2InitialView;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2 Initial View</em>' attribute.
	 * @see #isSetY2InitialView()
	 * @see #unsetY2InitialView()
	 * @see #getY2InitialView()
	 * @generated
	 */
	public void setY2InitialView(float newY2InitialView) {
		y2InitialView = newY2InitialView;
		y2InitialViewESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY2InitialView()
	 * @see #getY2InitialView()
	 * @see #setY2InitialView(float)
	 * @generated
	 */
	public void unsetY2InitialView() {
		y2InitialView = Y2_INITIAL_VIEW_EDEFAULT;
		y2InitialViewESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y2 Initial View</em>' attribute is set.
	 * @see #unsetY2InitialView()
	 * @see #getY2InitialView()
	 * @see #setY2InitialView(float)
	 * @generated
	 */
	public boolean isSetY2InitialView() {
		return y2InitialViewESet;
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
			case InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramObjects3()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				if (coordinateSystem != null)
					msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, CommonPackage.COORDINATE_SYSTEM__DIAGRAMS, CoordinateSystem.class, msgs);
				return basicSetCoordinateSystem((CoordinateSystem)otherEnd, msgs);
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlDiagramObjects()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocations()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3:
				return ((InternalEList<?>)getDiagramObjects3()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getGmlDiagramObjects()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				return ((InternalEList<?>)getDesignLocations()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.DIAGRAM__Y1_INITIAL_VIEW:
				return getY1InitialView();
			case InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3:
				return getDiagramObjects3();
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				if (resolve) return getCoordinateSystem();
				return basicGetCoordinateSystem();
			case InfGMLSupportPackage.DIAGRAM__KIND:
				return getKind();
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				return getGmlDiagramObjects();
			case InfGMLSupportPackage.DIAGRAM__X2_INITIAL_VIEW:
				return getX2InitialView();
			case InfGMLSupportPackage.DIAGRAM__X1_INITIAL_VIEW:
				return getX1InitialView();
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				return getDesignLocations();
			case InfGMLSupportPackage.DIAGRAM__ORIENTATION:
				return getOrientation();
			case InfGMLSupportPackage.DIAGRAM__Y2_INITIAL_VIEW:
				return getY2InitialView();
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
			case InfGMLSupportPackage.DIAGRAM__Y1_INITIAL_VIEW:
				setY1InitialView((Float)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3:
				getDiagramObjects3().clear();
				getDiagramObjects3().addAll((Collection<? extends DiagramObject>)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__KIND:
				setKind((DiagramKind)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				getGmlDiagramObjects().addAll((Collection<? extends GmlDiagramObject>)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__X2_INITIAL_VIEW:
				setX2InitialView((Float)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__X1_INITIAL_VIEW:
				setX1InitialView((Float)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				getDesignLocations().addAll((Collection<? extends DesignLocation>)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__ORIENTATION:
				setOrientation((OrientationKind)newValue);
				return;
			case InfGMLSupportPackage.DIAGRAM__Y2_INITIAL_VIEW:
				setY2InitialView((Float)newValue);
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
			case InfGMLSupportPackage.DIAGRAM__Y1_INITIAL_VIEW:
				unsetY1InitialView();
				return;
			case InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3:
				getDiagramObjects3().clear();
				return;
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)null);
				return;
			case InfGMLSupportPackage.DIAGRAM__KIND:
				unsetKind();
				return;
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				return;
			case InfGMLSupportPackage.DIAGRAM__X2_INITIAL_VIEW:
				unsetX2InitialView();
				return;
			case InfGMLSupportPackage.DIAGRAM__X1_INITIAL_VIEW:
				unsetX1InitialView();
				return;
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				return;
			case InfGMLSupportPackage.DIAGRAM__ORIENTATION:
				unsetOrientation();
				return;
			case InfGMLSupportPackage.DIAGRAM__Y2_INITIAL_VIEW:
				unsetY2InitialView();
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
			case InfGMLSupportPackage.DIAGRAM__Y1_INITIAL_VIEW:
				return isSetY1InitialView();
			case InfGMLSupportPackage.DIAGRAM__DIAGRAM_OBJECTS3:
				return diagramObjects3 != null && !diagramObjects3.isEmpty();
			case InfGMLSupportPackage.DIAGRAM__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case InfGMLSupportPackage.DIAGRAM__KIND:
				return isSetKind();
			case InfGMLSupportPackage.DIAGRAM__GML_DIAGRAM_OBJECTS:
				return gmlDiagramObjects != null && !gmlDiagramObjects.isEmpty();
			case InfGMLSupportPackage.DIAGRAM__X2_INITIAL_VIEW:
				return isSetX2InitialView();
			case InfGMLSupportPackage.DIAGRAM__X1_INITIAL_VIEW:
				return isSetX1InitialView();
			case InfGMLSupportPackage.DIAGRAM__DESIGN_LOCATIONS:
				return designLocations != null && !designLocations.isEmpty();
			case InfGMLSupportPackage.DIAGRAM__ORIENTATION:
				return isSetOrientation();
			case InfGMLSupportPackage.DIAGRAM__Y2_INITIAL_VIEW:
				return isSetY2InitialView();
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
		result.append(" (y1InitialView: ");
		if (y1InitialViewESet) result.append(y1InitialView); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", x2InitialView: ");
		if (x2InitialViewESet) result.append(x2InitialView); else result.append("<unset>");
		result.append(", x1InitialView: ");
		if (x1InitialViewESet) result.append(x1InitialView); else result.append("<unset>");
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", y2InitialView: ");
		if (y2InitialViewESet) result.append(y2InitialView); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Diagram
