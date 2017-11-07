/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Point Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic <em>Gml Graphic</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlPointSymbol extends GmlSymbol {
	/**
	 * The cached value of the '{@link #getGmlGraphic() <em>Gml Graphic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlGraphic()
	 * @generated
	 * @ordered
	 */
	protected GmlGraphic gmlGraphic;

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
	protected GmlPointSymbol() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_POINT_SYMBOL;
	}

	/**
	 * Returns the value of the '<em><b>Gml Graphic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols <em>Gml Point Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Graphic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Graphic</em>' reference.
	 * @see #setGmlGraphic(GmlGraphic)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols
	 * @generated
	 */
	public GmlGraphic getGmlGraphic() {
		if (gmlGraphic != null && gmlGraphic.eIsProxy()) {
			InternalEObject oldGmlGraphic = (InternalEObject)gmlGraphic;
			gmlGraphic = (GmlGraphic)eResolveProxy(oldGmlGraphic);
			if (gmlGraphic != oldGmlGraphic) {
			}
		}
		return gmlGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlGraphic basicGetGmlGraphic() {
		return gmlGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlGraphic(GmlGraphic newGmlGraphic, NotificationChain msgs) {
		GmlGraphic oldGmlGraphic = gmlGraphic;
		gmlGraphic = newGmlGraphic;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic <em>Gml Graphic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Graphic</em>' reference.
	 * @see #getGmlGraphic()
	 * @generated
	 */
	public void setGmlGraphic(GmlGraphic newGmlGraphic) {
		if (newGmlGraphic != gmlGraphic) {
			NotificationChain msgs = null;
			if (gmlGraphic != null)
				msgs = ((InternalEObject)gmlGraphic).eInverseRemove(this, InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS, GmlGraphic.class, msgs);
			if (newGmlGraphic != null)
				msgs = ((InternalEObject)newGmlGraphic).eInverseAdd(this, InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS, GmlGraphic.class, msgs);
			msgs = basicSetGmlGraphic(newGmlGraphic, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols <em>Gml Point Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
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
				msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS, GmlDiagramObject.class, msgs);
			if (newGmlDiagramObject != null)
				msgs = ((InternalEObject)newGmlDiagramObject).eInverseAdd(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS, GmlDiagramObject.class, msgs);
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
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_GRAPHIC:
				if (gmlGraphic != null)
					msgs = ((InternalEObject)gmlGraphic).eInverseRemove(this, InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS, GmlGraphic.class, msgs);
				return basicSetGmlGraphic((GmlGraphic)otherEnd, msgs);
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT:
				if (gmlDiagramObject != null)
					msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS, GmlDiagramObject.class, msgs);
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
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_GRAPHIC:
				return basicSetGmlGraphic(null, msgs);
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_GRAPHIC:
				if (resolve) return getGmlGraphic();
				return basicGetGmlGraphic();
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_GRAPHIC:
				setGmlGraphic((GmlGraphic)newValue);
				return;
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_GRAPHIC:
				setGmlGraphic((GmlGraphic)null);
				return;
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_GRAPHIC:
				return gmlGraphic != null;
			case InfGMLSupportPackage.GML_POINT_SYMBOL__GML_DIAGRAM_OBJECT:
				return gmlDiagramObject != null;
		}
		return super.eIsSet(featureID);
	}

} // GmlPointSymbol
