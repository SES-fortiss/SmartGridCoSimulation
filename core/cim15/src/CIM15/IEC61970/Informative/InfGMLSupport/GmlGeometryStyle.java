/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Geometry Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty <em>Geometry Property</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType <em>Geometry Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle <em>Gml Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlGeometryStyle extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getGeometryProperty() <em>Geometry Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometryProperty() <em>Geometry Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryProperty()
	 * @generated
	 * @ordered
	 */
	protected String geometryProperty = GEOMETRY_PROPERTY_EDEFAULT;

	/**
	 * This is true if the Geometry Property attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geometryPropertyESet;

	/**
	 * The default value of the '{@link #getGeometryType() <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryType()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometryType() <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryType()
	 * @generated
	 * @ordered
	 */
	protected String geometryType = GEOMETRY_TYPE_EDEFAULT;

	/**
	 * This is true if the Geometry Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geometryTypeESet;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * This is true if the Symbol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symbolESet;

	/**
	 * The cached value of the '{@link #getGmlFeatureStyle() <em>Gml Feature Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFeatureStyle()
	 * @generated
	 * @ordered
	 */
	protected GmlFeatureStyle gmlFeatureStyle;

	/**
	 * The cached value of the '{@link #getGmlLabelStyle() <em>Gml Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLabelStyle()
	 * @generated
	 * @ordered
	 */
	protected GmlLabelStyle gmlLabelStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlGeometryStyle() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_GEOMETRY_STYLE;
	}

	/**
	 * Returns the value of the '<em><b>Geometry Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Property</em>' attribute.
	 * @see #isSetGeometryProperty()
	 * @see #unsetGeometryProperty()
	 * @see #setGeometryProperty(String)
	 * @generated
	 */
	public String getGeometryProperty() {
		return geometryProperty;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty <em>Geometry Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Property</em>' attribute.
	 * @see #isSetGeometryProperty()
	 * @see #unsetGeometryProperty()
	 * @see #getGeometryProperty()
	 * @generated
	 */
	public void setGeometryProperty(String newGeometryProperty) {
		geometryProperty = newGeometryProperty;
		geometryPropertyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty <em>Geometry Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeometryProperty()
	 * @see #getGeometryProperty()
	 * @see #setGeometryProperty(String)
	 * @generated
	 */
	public void unsetGeometryProperty() {
		geometryProperty = GEOMETRY_PROPERTY_EDEFAULT;
		geometryPropertyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryProperty <em>Geometry Property</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geometry Property</em>' attribute is set.
	 * @see #unsetGeometryProperty()
	 * @see #getGeometryProperty()
	 * @see #setGeometryProperty(String)
	 * @generated
	 */
	public boolean isSetGeometryProperty() {
		return geometryPropertyESet;
	}

	/**
	 * Returns the value of the '<em><b>Geometry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Type</em>' attribute.
	 * @see #isSetGeometryType()
	 * @see #unsetGeometryType()
	 * @see #setGeometryType(String)
	 * @generated
	 */
	public String getGeometryType() {
		return geometryType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Type</em>' attribute.
	 * @see #isSetGeometryType()
	 * @see #unsetGeometryType()
	 * @see #getGeometryType()
	 * @generated
	 */
	public void setGeometryType(String newGeometryType) {
		geometryType = newGeometryType;
		geometryTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeometryType()
	 * @see #getGeometryType()
	 * @see #setGeometryType(String)
	 * @generated
	 */
	public void unsetGeometryType() {
		geometryType = GEOMETRY_TYPE_EDEFAULT;
		geometryTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGeometryType <em>Geometry Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geometry Type</em>' attribute is set.
	 * @see #unsetGeometryType()
	 * @see #getGeometryType()
	 * @see #setGeometryType(String)
	 * @generated
	 */
	public boolean isSetGeometryType() {
		return geometryTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #isSetSymbol()
	 * @see #unsetSymbol()
	 * @see #setSymbol(String)
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #isSetSymbol()
	 * @see #unsetSymbol()
	 * @see #getSymbol()
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		symbol = newSymbol;
		symbolESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymbol()
	 * @see #getSymbol()
	 * @see #setSymbol(String)
	 * @generated
	 */
	public void unsetSymbol() {
		symbol = SYMBOL_EDEFAULT;
		symbolESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getSymbol <em>Symbol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symbol</em>' attribute is set.
	 * @see #unsetSymbol()
	 * @see #getSymbol()
	 * @see #setSymbol(String)
	 * @generated
	 */
	public boolean isSetSymbol() {
		return symbolESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Feature Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Style</em>' reference.
	 * @see #setGmlFeatureStyle(GmlFeatureStyle)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles
	 * @generated
	 */
	public GmlFeatureStyle getGmlFeatureStyle() {
		if (gmlFeatureStyle != null && gmlFeatureStyle.eIsProxy()) {
			InternalEObject oldGmlFeatureStyle = (InternalEObject)gmlFeatureStyle;
			gmlFeatureStyle = (GmlFeatureStyle)eResolveProxy(oldGmlFeatureStyle);
			if (gmlFeatureStyle != oldGmlFeatureStyle) {
			}
		}
		return gmlFeatureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFeatureStyle basicGetGmlFeatureStyle() {
		return gmlFeatureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlFeatureStyle(GmlFeatureStyle newGmlFeatureStyle, NotificationChain msgs) {
		GmlFeatureStyle oldGmlFeatureStyle = gmlFeatureStyle;
		gmlFeatureStyle = newGmlFeatureStyle;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Feature Style</em>' reference.
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public void setGmlFeatureStyle(GmlFeatureStyle newGmlFeatureStyle) {
		if (newGmlFeatureStyle != gmlFeatureStyle) {
			NotificationChain msgs = null;
			if (gmlFeatureStyle != null)
				msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES, GmlFeatureStyle.class, msgs);
			if (newGmlFeatureStyle != null)
				msgs = ((InternalEObject)newGmlFeatureStyle).eInverseAdd(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES, GmlFeatureStyle.class, msgs);
			msgs = basicSetGmlFeatureStyle(newGmlFeatureStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Label Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Label Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Label Style</em>' reference.
	 * @see #setGmlLabelStyle(GmlLabelStyle)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles
	 * @generated
	 */
	public GmlLabelStyle getGmlLabelStyle() {
		if (gmlLabelStyle != null && gmlLabelStyle.eIsProxy()) {
			InternalEObject oldGmlLabelStyle = (InternalEObject)gmlLabelStyle;
			gmlLabelStyle = (GmlLabelStyle)eResolveProxy(oldGmlLabelStyle);
			if (gmlLabelStyle != oldGmlLabelStyle) {
			}
		}
		return gmlLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelStyle basicGetGmlLabelStyle() {
		return gmlLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlLabelStyle(GmlLabelStyle newGmlLabelStyle, NotificationChain msgs) {
		GmlLabelStyle oldGmlLabelStyle = gmlLabelStyle;
		gmlLabelStyle = newGmlLabelStyle;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle <em>Gml Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Label Style</em>' reference.
	 * @see #getGmlLabelStyle()
	 * @generated
	 */
	public void setGmlLabelStyle(GmlLabelStyle newGmlLabelStyle) {
		if (newGmlLabelStyle != gmlLabelStyle) {
			NotificationChain msgs = null;
			if (gmlLabelStyle != null)
				msgs = ((InternalEObject)gmlLabelStyle).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES, GmlLabelStyle.class, msgs);
			if (newGmlLabelStyle != null)
				msgs = ((InternalEObject)newGmlLabelStyle).eInverseAdd(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES, GmlLabelStyle.class, msgs);
			msgs = basicSetGmlLabelStyle(newGmlLabelStyle, msgs);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				if (gmlFeatureStyle != null)
					msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES, GmlFeatureStyle.class, msgs);
				return basicSetGmlFeatureStyle((GmlFeatureStyle)otherEnd, msgs);
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				if (gmlLabelStyle != null)
					msgs = ((InternalEObject)gmlLabelStyle).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES, GmlLabelStyle.class, msgs);
				return basicSetGmlLabelStyle((GmlLabelStyle)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				return basicSetGmlFeatureStyle(null, msgs);
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				return basicSetGmlLabelStyle(null, msgs);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY:
				return getGeometryProperty();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE:
				return getGeometryType();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL:
				return getSymbol();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				if (resolve) return getGmlFeatureStyle();
				return basicGetGmlFeatureStyle();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				if (resolve) return getGmlLabelStyle();
				return basicGetGmlLabelStyle();
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY:
				setGeometryProperty((String)newValue);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE:
				setGeometryType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL:
				setSymbol((String)newValue);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)newValue);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				setGmlLabelStyle((GmlLabelStyle)newValue);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY:
				unsetGeometryProperty();
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE:
				unsetGeometryType();
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL:
				unsetSymbol();
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)null);
				return;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				setGmlLabelStyle((GmlLabelStyle)null);
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
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_PROPERTY:
				return isSetGeometryProperty();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GEOMETRY_TYPE:
				return isSetGeometryType();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__SYMBOL:
				return isSetSymbol();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_FEATURE_STYLE:
				return gmlFeatureStyle != null;
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE__GML_LABEL_STYLE:
				return gmlLabelStyle != null;
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
		result.append(" (geometryProperty: ");
		if (geometryPropertyESet) result.append(geometryProperty); else result.append("<unset>");
		result.append(", geometryType: ");
		if (geometryTypeESet) result.append(geometryType); else result.append("<unset>");
		result.append(", symbol: ");
		if (symbolESet) result.append(symbol); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlGeometryStyle
