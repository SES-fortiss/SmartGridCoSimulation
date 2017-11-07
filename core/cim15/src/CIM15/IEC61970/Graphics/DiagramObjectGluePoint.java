/**
 */
package CIM15.IEC61970.Graphics;

import CIM15.Element;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Object Glue Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObjectGluePoint#getDiagramObjectPoints <em>Diagram Object Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramObjectGluePoint extends Element {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramObjectGluePoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicsPackage.Literals.DIAGRAM_OBJECT_GLUE_POINT;
	}

	/**
	 * Returns the value of the '<em><b>Diagram Object Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Graphics.DiagramObjectPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObjectPoint#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Object Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Object Points</em>' reference list.
	 * @see CIM15.IEC61970.Graphics.DiagramObjectPoint#getDiagramObjectGluePoint
	 * @generated
	 */
	public EList<DiagramObjectPoint> getDiagramObjectPoints() {
		if (diagramObjectPoints == null) {
			diagramObjectPoints = new BasicInternalEList<DiagramObjectPoint>(DiagramObjectPoint.class);
		}
		return diagramObjectPoints;
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
			case GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramObjectPoints()).basicAdd(otherEnd, msgs);
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
			case GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
				return ((InternalEList<?>)getDiagramObjectPoints()).basicRemove(otherEnd, msgs);
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
			case GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
				return getDiagramObjectPoints();
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
			case GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
				getDiagramObjectPoints().clear();
				getDiagramObjectPoints().addAll((Collection<? extends DiagramObjectPoint>)newValue);
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
			case GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
				getDiagramObjectPoints().clear();
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
			case GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT__DIAGRAM_OBJECT_POINTS:
				return diagramObjectPoints != null && !diagramObjectPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DiagramObjectGluePoint
