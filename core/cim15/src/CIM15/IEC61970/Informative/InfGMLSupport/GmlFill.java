/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

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
 * A representation of the model object '<em><b>Gml Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour <em>Gml Colour</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks <em>Gml Marks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlFill extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getGmlColour() <em>Gml Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlColour()
	 * @generated
	 * @ordered
	 */
	protected GmlColour gmlColour;

	/**
	 * The cached value of the '{@link #getGmlMarks() <em>Gml Marks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlMarks()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlMark> gmlMarks;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final float OPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected float opacity = OPACITY_EDEFAULT;

	/**
	 * This is true if the Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean opacityESet;

	/**
	 * The cached value of the '{@link #getGmlTextSymbols() <em>Gml Text Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlTextSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlTextSymbol> gmlTextSymbols;

	/**
	 * The cached value of the '{@link #getGmlSvgParameters() <em>Gml Svg Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSvgParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSvgParameter> gmlSvgParameters;

	/**
	 * The cached value of the '{@link #getGmlPolygonSymbols() <em>Gml Polygon Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlPolygonSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlPolygonSymbol> gmlPolygonSymbols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlFill() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_FILL;
	}

	/**
	 * Returns the value of the '<em><b>Gml Colour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills <em>Gml Fills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Colour</em>' reference.
	 * @see #setGmlColour(GmlColour)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills
	 * @generated
	 */
	public GmlColour getGmlColour() {
		if (gmlColour != null && gmlColour.eIsProxy()) {
			InternalEObject oldGmlColour = (InternalEObject)gmlColour;
			gmlColour = (GmlColour)eResolveProxy(oldGmlColour);
			if (gmlColour != oldGmlColour) {
			}
		}
		return gmlColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlColour basicGetGmlColour() {
		return gmlColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlColour(GmlColour newGmlColour, NotificationChain msgs) {
		GmlColour oldGmlColour = gmlColour;
		gmlColour = newGmlColour;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour <em>Gml Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Colour</em>' reference.
	 * @see #getGmlColour()
	 * @generated
	 */
	public void setGmlColour(GmlColour newGmlColour) {
		if (newGmlColour != gmlColour) {
			NotificationChain msgs = null;
			if (gmlColour != null)
				msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_FILLS, GmlColour.class, msgs);
			if (newGmlColour != null)
				msgs = ((InternalEObject)newGmlColour).eInverseAdd(this, InfGMLSupportPackage.GML_COLOUR__GML_FILLS, GmlColour.class, msgs);
			msgs = basicSetGmlColour(newGmlColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Marks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls <em>Gml FIlls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Marks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Marks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls
	 * @generated
	 */
	public EList<GmlMark> getGmlMarks() {
		if (gmlMarks == null) {
			gmlMarks = new BasicInternalEList<GmlMark>(GmlMark.class);
		}
		return gmlMarks;
	}

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #isSetOpacity()
	 * @see #unsetOpacity()
	 * @see #setOpacity(float)
	 * @generated
	 */
	public float getOpacity() {
		return opacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #isSetOpacity()
	 * @see #unsetOpacity()
	 * @see #getOpacity()
	 * @generated
	 */
	public void setOpacity(float newOpacity) {
		opacity = newOpacity;
		opacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpacity()
	 * @see #getOpacity()
	 * @see #setOpacity(float)
	 * @generated
	 */
	public void unsetOpacity() {
		opacity = OPACITY_EDEFAULT;
		opacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getOpacity <em>Opacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Opacity</em>' attribute is set.
	 * @see #unsetOpacity()
	 * @see #getOpacity()
	 * @see #setOpacity(float)
	 * @generated
	 */
	public boolean isSetOpacity() {
		return opacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Text Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Text Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill
	 * @generated
	 */
	public EList<GmlTextSymbol> getGmlTextSymbols() {
		if (gmlTextSymbols == null) {
			gmlTextSymbols = new BasicInternalEList<GmlTextSymbol>(GmlTextSymbol.class);
		}
		return gmlTextSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills <em>Gml Fills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Svg Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Svg Parameters</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills
	 * @generated
	 */
	public EList<GmlSvgParameter> getGmlSvgParameters() {
		if (gmlSvgParameters == null) {
			gmlSvgParameters = new BasicInternalEList<GmlSvgParameter>(GmlSvgParameter.class);
		}
		return gmlSvgParameters;
	}

	/**
	 * Returns the value of the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Polygon Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Polygon Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlFill
	 * @generated
	 */
	public EList<GmlPolygonSymbol> getGmlPolygonSymbols() {
		if (gmlPolygonSymbols == null) {
			gmlPolygonSymbols = new BasicInternalEList<GmlPolygonSymbol>(GmlPolygonSymbol.class);
		}
		return gmlPolygonSymbols;
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
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				if (gmlColour != null)
					msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_FILLS, GmlColour.class, msgs);
				return basicSetGmlColour((GmlColour)otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlMarks()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTextSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSvgParameters()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPolygonSymbols()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				return basicSetGmlColour(null, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				return ((InternalEList<?>)getGmlMarks()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				return ((InternalEList<?>)getGmlTextSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				return ((InternalEList<?>)getGmlSvgParameters()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				return ((InternalEList<?>)getGmlPolygonSymbols()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				if (resolve) return getGmlColour();
				return basicGetGmlColour();
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				return getGmlMarks();
			case InfGMLSupportPackage.GML_FILL__OPACITY:
				return getOpacity();
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				return getGmlTextSymbols();
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				return getGmlSvgParameters();
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				return getGmlPolygonSymbols();
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
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				setGmlColour((GmlColour)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				getGmlMarks().clear();
				getGmlMarks().addAll((Collection<? extends GmlMark>)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__OPACITY:
				setOpacity((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				getGmlTextSymbols().addAll((Collection<? extends GmlTextSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				getGmlSvgParameters().addAll((Collection<? extends GmlSvgParameter>)newValue);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				getGmlPolygonSymbols().addAll((Collection<? extends GmlPolygonSymbol>)newValue);
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
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				setGmlColour((GmlColour)null);
				return;
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				getGmlMarks().clear();
				return;
			case InfGMLSupportPackage.GML_FILL__OPACITY:
				unsetOpacity();
				return;
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				return;
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
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
			case InfGMLSupportPackage.GML_FILL__GML_COLOUR:
				return gmlColour != null;
			case InfGMLSupportPackage.GML_FILL__GML_MARKS:
				return gmlMarks != null && !gmlMarks.isEmpty();
			case InfGMLSupportPackage.GML_FILL__OPACITY:
				return isSetOpacity();
			case InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS:
				return gmlTextSymbols != null && !gmlTextSymbols.isEmpty();
			case InfGMLSupportPackage.GML_FILL__GML_SVG_PARAMETERS:
				return gmlSvgParameters != null && !gmlSvgParameters.isEmpty();
			case InfGMLSupportPackage.GML_FILL__GML_POLYGON_SYMBOLS:
				return gmlPolygonSymbols != null && !gmlPolygonSymbols.isEmpty();
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
		result.append(" (opacity: ");
		if (opacityESet) result.append(opacity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlFill
