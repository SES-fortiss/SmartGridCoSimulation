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
 * A representation of the model object '<em><b>Gml Label Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform <em>Transform</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles <em>Gml Topology Styles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle <em>Style</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlLabelStyle extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected String transform = TRANSFORM_EDEFAULT;

	/**
	 * This is true if the Transform attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transformESet;

	/**
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelExpression = LABEL_EXPRESSION_EDEFAULT;

	/**
	 * This is true if the Label Expression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean labelExpressionESet;

	/**
	 * The cached value of the '{@link #getGmlTopologyStyles() <em>Gml Topology Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlTopologyStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlTopologyStyle> gmlTopologyStyles;

	/**
	 * The cached value of the '{@link #getGmlGeometryStyles() <em>Gml Geometry Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlGeometryStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlGeometryStyle> gmlGeometryStyles;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * This is true if the Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean styleESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlLabelStyle() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_LABEL_STYLE;
	}

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #isSetTransform()
	 * @see #unsetTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #isSetTransform()
	 * @see #unsetTransform()
	 * @see #getTransform()
	 * @generated
	 */
	public void setTransform(String newTransform) {
		transform = newTransform;
		transformESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	public void unsetTransform() {
		transform = TRANSFORM_EDEFAULT;
		transformESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getTransform <em>Transform</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transform</em>' attribute is set.
	 * @see #unsetTransform()
	 * @see #getTransform()
	 * @see #setTransform(String)
	 * @generated
	 */
	public boolean isSetTransform() {
		return transformESet;
	}

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #isSetLabelExpression()
	 * @see #unsetLabelExpression()
	 * @see #setLabelExpression(String)
	 * @generated
	 */
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Expression</em>' attribute.
	 * @see #isSetLabelExpression()
	 * @see #unsetLabelExpression()
	 * @see #getLabelExpression()
	 * @generated
	 */
	public void setLabelExpression(String newLabelExpression) {
		labelExpression = newLabelExpression;
		labelExpressionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabelExpression()
	 * @see #getLabelExpression()
	 * @see #setLabelExpression(String)
	 * @generated
	 */
	public void unsetLabelExpression() {
		labelExpression = LABEL_EXPRESSION_EDEFAULT;
		labelExpressionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getLabelExpression <em>Label Expression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label Expression</em>' attribute is set.
	 * @see #unsetLabelExpression()
	 * @see #getLabelExpression()
	 * @see #setLabelExpression(String)
	 * @generated
	 */
	public boolean isSetLabelExpression() {
		return labelExpressionESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Topology Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle <em>Gml Lable Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Topology Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Topology Styles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle
	 * @generated
	 */
	public EList<GmlTopologyStyle> getGmlTopologyStyles() {
		if (gmlTopologyStyles == null) {
			gmlTopologyStyles = new BasicInternalEList<GmlTopologyStyle>(GmlTopologyStyle.class);
		}
		return gmlTopologyStyles;
	}

	/**
	 * Returns the value of the '<em><b>Gml Geometry Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle <em>Gml Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Geometry Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Geometry Styles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlLabelStyle
	 * @generated
	 */
	public EList<GmlGeometryStyle> getGmlGeometryStyles() {
		if (gmlGeometryStyles == null) {
			gmlGeometryStyles = new BasicInternalEList<GmlGeometryStyle>(GmlGeometryStyle.class);
		}
		return gmlGeometryStyles;
	}

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(String)
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	public void setStyle(String newStyle) {
		style = newStyle;
		styleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(String)
	 * @generated
	 */
	public void unsetStyle() {
		style = STYLE_EDEFAULT;
		styleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(String)
	 * @generated
	 */
	public boolean isSetStyle() {
		return styleESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Feature Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles <em>Gml Label Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Style</em>' reference.
	 * @see #setGmlFeatureStyle(GmlFeatureStyle)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}' reference.
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
				msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES, GmlFeatureStyle.class, msgs);
			if (newGmlFeatureStyle != null)
				msgs = ((InternalEObject)newGmlFeatureStyle).eInverseAdd(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES, GmlFeatureStyle.class, msgs);
			msgs = basicSetGmlFeatureStyle(newGmlFeatureStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTopologyStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlGeometryStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				if (gmlFeatureStyle != null)
					msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES, GmlFeatureStyle.class, msgs);
				return basicSetGmlFeatureStyle((GmlFeatureStyle)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				return ((InternalEList<?>)getGmlTopologyStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				return ((InternalEList<?>)getGmlGeometryStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				return basicSetGmlFeatureStyle(null, msgs);
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM:
				return getTransform();
			case InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION:
				return getLabelExpression();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				return getGmlTopologyStyles();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				return getGmlGeometryStyles();
			case InfGMLSupportPackage.GML_LABEL_STYLE__STYLE:
				return getStyle();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				if (resolve) return getGmlFeatureStyle();
				return basicGetGmlFeatureStyle();
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM:
				setTransform((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION:
				setLabelExpression((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				getGmlTopologyStyles().clear();
				getGmlTopologyStyles().addAll((Collection<? extends GmlTopologyStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				getGmlGeometryStyles().clear();
				getGmlGeometryStyles().addAll((Collection<? extends GmlGeometryStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__STYLE:
				setStyle((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)newValue);
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM:
				unsetTransform();
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION:
				unsetLabelExpression();
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				getGmlTopologyStyles().clear();
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				getGmlGeometryStyles().clear();
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__STYLE:
				unsetStyle();
				return;
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)null);
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
			case InfGMLSupportPackage.GML_LABEL_STYLE__TRANSFORM:
				return isSetTransform();
			case InfGMLSupportPackage.GML_LABEL_STYLE__LABEL_EXPRESSION:
				return isSetLabelExpression();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES:
				return gmlTopologyStyles != null && !gmlTopologyStyles.isEmpty();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_GEOMETRY_STYLES:
				return gmlGeometryStyles != null && !gmlGeometryStyles.isEmpty();
			case InfGMLSupportPackage.GML_LABEL_STYLE__STYLE:
				return isSetStyle();
			case InfGMLSupportPackage.GML_LABEL_STYLE__GML_FEATURE_STYLE:
				return gmlFeatureStyle != null;
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
		result.append(" (transform: ");
		if (transformESet) result.append(transform); else result.append("<unset>");
		result.append(", labelExpression: ");
		if (labelExpressionESet) result.append(labelExpression); else result.append("<unset>");
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlLabelStyle
