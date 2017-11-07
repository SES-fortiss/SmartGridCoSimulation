/**
 */
package CIM15.IEC61970.Graphics;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Graphics.VisibilityLayer#getDiagramObjects3 <em>Diagram Objects3</em>}</li>
 *   <li>{@link CIM15.IEC61970.Graphics.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisibilityLayer extends IdentifiedObject {
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
	protected VisibilityLayer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicsPackage.Literals.VISIBILITY_LAYER;
	}

	/**
	 * Returns the value of the '<em><b>Diagram Objects3</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Graphics.DiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Objects3</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Objects3</em>' reference list.
	 * @see CIM15.IEC61970.Graphics.DiagramObject#getVisibilityLayers
	 * @generated
	 */
	public EList<DiagramObject> getDiagramObjects3() {
		if (diagramObjects3 == null) {
			diagramObjects3 = new BasicInternalEList<DiagramObject>(DiagramObject.class);
		}
		return diagramObjects3;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Graphics.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Graphics.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Graphics.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute is set.
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
			case GraphicsPackage.VISIBILITY_LAYER__DIAGRAM_OBJECTS3:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramObjects3()).basicAdd(otherEnd, msgs);
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
			case GraphicsPackage.VISIBILITY_LAYER__DIAGRAM_OBJECTS3:
				return ((InternalEList<?>)getDiagramObjects3()).basicRemove(otherEnd, msgs);
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
			case GraphicsPackage.VISIBILITY_LAYER__DIAGRAM_OBJECTS3:
				return getDiagramObjects3();
			case GraphicsPackage.VISIBILITY_LAYER__DRAWING_ORDER:
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
			case GraphicsPackage.VISIBILITY_LAYER__DIAGRAM_OBJECTS3:
				getDiagramObjects3().clear();
				getDiagramObjects3().addAll((Collection<? extends DiagramObject>)newValue);
				return;
			case GraphicsPackage.VISIBILITY_LAYER__DRAWING_ORDER:
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
			case GraphicsPackage.VISIBILITY_LAYER__DIAGRAM_OBJECTS3:
				getDiagramObjects3().clear();
				return;
			case GraphicsPackage.VISIBILITY_LAYER__DRAWING_ORDER:
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
			case GraphicsPackage.VISIBILITY_LAYER__DIAGRAM_OBJECTS3:
				return diagramObjects3 != null && !diagramObjects3.isEmpty();
			case GraphicsPackage.VISIBILITY_LAYER__DRAWING_ORDER:
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
		result.append(" (drawingOrder: ");
		if (drawingOrderESet) result.append(drawingOrder); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // VisibilityLayer
