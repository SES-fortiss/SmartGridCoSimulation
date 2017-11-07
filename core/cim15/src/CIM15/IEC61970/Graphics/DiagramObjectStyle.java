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
 * A representation of the model object '<em><b>Diagram Object Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Graphics.DiagramObjectStyle#getDiagramObjects2 <em>Diagram Objects2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramObjectStyle extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getDiagramObjects2() <em>Diagram Objects2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObjects2()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramObject> diagramObjects2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramObjectStyle() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicsPackage.Literals.DIAGRAM_OBJECT_STYLE;
	}

	/**
	 * Returns the value of the '<em><b>Diagram Objects2</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Graphics.DiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Objects2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Objects2</em>' reference list.
	 * @see CIM15.IEC61970.Graphics.DiagramObject#getDiagramObjectStyle
	 * @generated
	 */
	public EList<DiagramObject> getDiagramObjects2() {
		if (diagramObjects2 == null) {
			diagramObjects2 = new BasicInternalEList<DiagramObject>(DiagramObject.class);
		}
		return diagramObjects2;
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
			case GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramObjects2()).basicAdd(otherEnd, msgs);
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
			case GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2:
				return ((InternalEList<?>)getDiagramObjects2()).basicRemove(otherEnd, msgs);
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
			case GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2:
				return getDiagramObjects2();
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
			case GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2:
				getDiagramObjects2().clear();
				getDiagramObjects2().addAll((Collection<? extends DiagramObject>)newValue);
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
			case GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2:
				getDiagramObjects2().clear();
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
			case GraphicsPackage.DIAGRAM_OBJECT_STYLE__DIAGRAM_OBJECTS2:
				return diagramObjects2 != null && !diagramObjects2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DiagramObjectStyle
