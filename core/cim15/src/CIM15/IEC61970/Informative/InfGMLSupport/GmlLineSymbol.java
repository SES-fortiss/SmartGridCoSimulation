/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Line Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke <em>Gml Stroke</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide <em>Source Side</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlLineSymbol extends GmlSymbol {
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
	 * The default value of the '{@link #getSourceSide() <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSide()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceSide() <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSide()
	 * @generated
	 * @ordered
	 */
	protected String sourceSide = SOURCE_SIDE_EDEFAULT;

	/**
	 * This is true if the Source Side attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceSideESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlLineSymbol() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_LINE_SYMBOL;
	}

	/**
	 * Returns the value of the '<em><b>Gml Stroke</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols <em>Gml Line Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Stroke</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Stroke</em>' reference.
	 * @see #setGmlStroke(GmlStroke)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke <em>Gml Stroke</em>}' reference.
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
				msgs = ((InternalEObject)gmlStroke).eInverseRemove(this, InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS, GmlStroke.class, msgs);
			if (newGmlStroke != null)
				msgs = ((InternalEObject)newGmlStroke).eInverseAdd(this, InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS, GmlStroke.class, msgs);
			msgs = basicSetGmlStroke(newGmlStroke, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Source Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Side</em>' attribute.
	 * @see #isSetSourceSide()
	 * @see #unsetSourceSide()
	 * @see #setSourceSide(String)
	 * @generated
	 */
	public String getSourceSide() {
		return sourceSide;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Side</em>' attribute.
	 * @see #isSetSourceSide()
	 * @see #unsetSourceSide()
	 * @see #getSourceSide()
	 * @generated
	 */
	public void setSourceSide(String newSourceSide) {
		sourceSide = newSourceSide;
		sourceSideESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceSide()
	 * @see #getSourceSide()
	 * @see #setSourceSide(String)
	 * @generated
	 */
	public void unsetSourceSide() {
		sourceSide = SOURCE_SIDE_EDEFAULT;
		sourceSideESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getSourceSide <em>Source Side</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Side</em>' attribute is set.
	 * @see #unsetSourceSide()
	 * @see #getSourceSide()
	 * @see #setSourceSide(String)
	 * @generated
	 */
	public boolean isSetSourceSide() {
		return sourceSideESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols <em>Gml Line Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
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
				msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS, GmlDiagramObject.class, msgs);
			if (newGmlDiagramObject != null)
				msgs = ((InternalEObject)newGmlDiagramObject).eInverseAdd(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS, GmlDiagramObject.class, msgs);
			msgs = basicSetGmlDiagramObject(newGmlDiagramObject, msgs);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				if (gmlStroke != null)
					msgs = ((InternalEObject)gmlStroke).eInverseRemove(this, InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS, GmlStroke.class, msgs);
				return basicSetGmlStroke((GmlStroke)otherEnd, msgs);
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				if (gmlDiagramObject != null)
					msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS, GmlDiagramObject.class, msgs);
				return basicSetGmlDiagramObject((GmlDiagramObject)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				return basicSetGmlStroke(null, msgs);
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				return basicSetGmlDiagramObject(null, msgs);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				if (resolve) return getGmlStroke();
				return basicGetGmlStroke();
			case InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE:
				return getSourceSide();
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				if (resolve) return getGmlDiagramObject();
				return basicGetGmlDiagramObject();
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				setGmlStroke((GmlStroke)newValue);
				return;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE:
				setSourceSide((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)newValue);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				setGmlStroke((GmlStroke)null);
				return;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE:
				unsetSourceSide();
				return;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)null);
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
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_STROKE:
				return gmlStroke != null;
			case InfGMLSupportPackage.GML_LINE_SYMBOL__SOURCE_SIDE:
				return isSetSourceSide();
			case InfGMLSupportPackage.GML_LINE_SYMBOL__GML_DIAGRAM_OBJECT:
				return gmlDiagramObject != null;
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
		result.append(" (sourceSide: ");
		if (sourceSideESet) result.append(sourceSide); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlLineSymbol
