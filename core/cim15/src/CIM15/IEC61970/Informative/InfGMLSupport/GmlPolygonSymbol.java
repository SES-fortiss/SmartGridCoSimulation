/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Polygon Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill <em>Gml Fill</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke <em>Gml Stroke</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlPolygonSymbol extends GmlSymbol {
	/**
	 * The cached value of the '{@link #getGmlDiagramObject() <em>Gml Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlDiagramObject()
	 * @generated
	 * @ordered
	 */
	protected GmlDiagramObject gmlDiagramObject;

	/**
	 * The cached value of the '{@link #getGmlFill() <em>Gml Fill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFill()
	 * @generated
	 * @ordered
	 */
	protected GmlFill gmlFill;

	/**
	 * The cached value of the '{@link #getGmlStroke() <em>Gml Stroke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlStroke()
	 * @generated
	 * @ordered
	 */
	protected GmlStroke gmlStroke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlPolygonSymbol() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_POLYGON_SYMBOL;
	}

	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols
	 * @generated
	 */
	public GmlDiagramObject getGmlDiagramObject() {
		if (gmlDiagramObject != null && gmlDiagramObject.eIsProxy()) {
			InternalEObject oldGmlDiagramObject = (InternalEObject)gmlDiagramObject;
			gmlDiagramObject = (GmlDiagramObject)eResolveProxy(oldGmlDiagramObject);
			if (gmlDiagramObject != oldGmlDiagramObject) {
			}
		}
		return gmlDiagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlDiagramObject basicGetGmlDiagramObject() {
		return gmlDiagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlDiagramObject(GmlDiagramObject newGmlDiagramObject, NotificationChain msgs) {
		GmlDiagramObject oldGmlDiagramObject = gmlDiagramObject;
		gmlDiagramObject = newGmlDiagramObject;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #getGmlDiagramObject()
	 * @generated
	 */
	public void setGmlDiagramObject(GmlDiagramObject newGmlDiagramObject) {
		if (newGmlDiagramObject != gmlDiagramObject) {
			NotificationChain msgs = null;
			if (gmlDiagramObject != null)
				msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS, GmlDiagramObject.class, msgs);
			if (newGmlDiagramObject != null)
				msgs = ((InternalEObject)newGmlDiagramObject).eInverseAdd(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS, GmlDiagramObject.class, msgs);
			msgs = basicSetGmlDiagramObject(newGmlDiagramObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Fill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fill</em>' reference.
	 * @see #setGmlFill(GmlFill)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols
	 * @generated
	 */
	public GmlFill getGmlFill() {
		if (gmlFill != null && gmlFill.eIsProxy()) {
			InternalEObject oldGmlFill = (InternalEObject)gmlFill;
			gmlFill = (GmlFill)eResolveProxy(oldGmlFill);
			if (gmlFill != oldGmlFill) {
			}
		}
		return gmlFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFill basicGetGmlFill() {
		return gmlFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlFill(GmlFill newGmlFill, NotificationChain msgs) {
		GmlFill oldGmlFill = gmlFill;
		gmlFill = newGmlFill;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill <em>Gml Fill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Fill</em>' reference.
	 * @see #getGmlFill()
	 * @generated
	 */
	public void setGmlFill(GmlFill newGmlFill) {
		if (newGmlFill != gmlFill) {
			NotificationChain msgs = null;
			if (gmlFill != null)
				msgs = ((InternalEObject)gmlFill).eInverseRemove(this, InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS, GmlFill.class, msgs);
			if (newGmlFill != null)
				msgs = ((InternalEObject)newGmlFill).eInverseAdd(this, InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS, GmlFill.class, msgs);
			msgs = basicSetGmlFill(newGmlFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Stroke</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Stroke</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Stroke</em>' reference.
	 * @see #setGmlStroke(GmlStroke)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols
	 * @generated
	 */
	public GmlStroke getGmlStroke() {
		if (gmlStroke != null && gmlStroke.eIsProxy()) {
			InternalEObject oldGmlStroke = (InternalEObject)gmlStroke;
			gmlStroke = (GmlStroke)eResolveProxy(oldGmlStroke);
			if (gmlStroke != oldGmlStroke) {
			}
		}
		return gmlStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlStroke basicGetGmlStroke() {
		return gmlStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlStroke(GmlStroke newGmlStroke, NotificationChain msgs) {
		GmlStroke oldGmlStroke = gmlStroke;
		gmlStroke = newGmlStroke;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke <em>Gml Stroke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Stroke</em>' reference.
	 * @see #getGmlStroke()
	 * @generated
	 */
	public void setGmlStroke(GmlStroke newGmlStroke) {
		if (newGmlStroke != gmlStroke) {
			NotificationChain msgs = null;
			if (gmlStroke != null)
				msgs = ((InternalEObject)gmlStroke).eInverseRemove(this, InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS, GmlStroke.class, msgs);
			if (newGmlStroke != null)
				msgs = ((InternalEObject)newGmlStroke).eInverseAdd(this, InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS, GmlStroke.class, msgs);
			msgs = basicSetGmlStroke(newGmlStroke, msgs);
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
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT:
				if (gmlDiagramObject != null)
					msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS, GmlDiagramObject.class, msgs);
				return basicSetGmlDiagramObject((GmlDiagramObject)otherEnd, msgs);
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_FILL:
				if (gmlFill != null)
					msgs = ((InternalEObject)gmlFill).eInverseRemove(this, InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS, GmlFill.class, msgs);
				return basicSetGmlFill((GmlFill)otherEnd, msgs);
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_STROKE:
				if (gmlStroke != null)
					msgs = ((InternalEObject)gmlStroke).eInverseRemove(this, InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS, GmlStroke.class, msgs);
				return basicSetGmlStroke((GmlStroke)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT:
				return basicSetGmlDiagramObject(null, msgs);
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_FILL:
				return basicSetGmlFill(null, msgs);
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_STROKE:
				return basicSetGmlStroke(null, msgs);
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
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT:
				if (resolve) return getGmlDiagramObject();
				return basicGetGmlDiagramObject();
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_FILL:
				if (resolve) return getGmlFill();
				return basicGetGmlFill();
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_STROKE:
				if (resolve) return getGmlStroke();
				return basicGetGmlStroke();
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
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)newValue);
				return;
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_FILL:
				setGmlFill((GmlFill)newValue);
				return;
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_STROKE:
				setGmlStroke((GmlStroke)newValue);
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
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)null);
				return;
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_FILL:
				setGmlFill((GmlFill)null);
				return;
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_STROKE:
				setGmlStroke((GmlStroke)null);
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
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_DIAGRAM_OBJECT:
				return gmlDiagramObject != null;
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_FILL:
				return gmlFill != null;
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL__GML_STROKE:
				return gmlStroke != null;
		}
		return super.eIsSet(featureID);
	}

} // GmlPolygonSymbol
