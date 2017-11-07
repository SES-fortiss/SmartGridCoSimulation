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
 * A representation of the model object '<em><b>Gml Svg Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes <em>Gml Stokes</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts <em>Gml Fonts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFills <em>Gml Fills</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlSvgParameter extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getGmlStokes() <em>Gml Stokes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlStokes()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlStroke> gmlStokes;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * This is true if the Attribute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The cached value of the '{@link #getGmlFonts() <em>Gml Fonts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFonts()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFont> gmlFonts;

	/**
	 * The cached value of the '{@link #getGmlFills() <em>Gml Fills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFills()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFill> gmlFills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlSvgParameter() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_SVG_PARAMETER;
	}

	/**
	 * Returns the value of the '<em><b>Gml Stokes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Stokes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Stokes</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters
	 * @generated
	 */
	public EList<GmlStroke> getGmlStokes() {
		if (gmlStokes == null) {
			gmlStokes = new BasicInternalEList<GmlStroke>(GmlStroke.class);
		}
		return gmlStokes;
	}

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #isSetAttribute()
	 * @see #unsetAttribute()
	 * @see #setAttribute(String)
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #isSetAttribute()
	 * @see #unsetAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		attribute = newAttribute;
		attributeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttribute()
	 * @see #getAttribute()
	 * @see #setAttribute(String)
	 * @generated
	 */
	public void unsetAttribute() {
		attribute = ATTRIBUTE_EDEFAULT;
		attributeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getAttribute <em>Attribute</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute</em>' attribute is set.
	 * @see #unsetAttribute()
	 * @see #getAttribute()
	 * @see #setAttribute(String)
	 * @generated
	 */
	public boolean isSetAttribute() {
		return attributeESet;
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(String newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Fonts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fonts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fonts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters
	 * @generated
	 */
	public EList<GmlFont> getGmlFonts() {
		if (gmlFonts == null) {
			gmlFonts = new BasicInternalEList<GmlFont>(GmlFont.class);
		}
		return gmlFonts;
	}

	/**
	 * Returns the value of the '<em><b>Gml Fills</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters <em>Gml Svg Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fills</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlSvgParameters
	 * @generated
	 */
	public EList<GmlFill> getGmlFills() {
		if (gmlFills == null) {
			gmlFills = new BasicInternalEList<GmlFill>(GmlFill.class);
		}
		return gmlFills;
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlStokes()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFonts()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFills()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				return ((InternalEList<?>)getGmlStokes()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				return ((InternalEList<?>)getGmlFonts()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				return ((InternalEList<?>)getGmlFills()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				return getGmlStokes();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE:
				return getAttribute();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE:
				return getValue();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				return getGmlFonts();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				return getGmlFills();
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				getGmlStokes().clear();
				getGmlStokes().addAll((Collection<? extends GmlStroke>)newValue);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				getGmlFonts().clear();
				getGmlFonts().addAll((Collection<? extends GmlFont>)newValue);
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				getGmlFills().clear();
				getGmlFills().addAll((Collection<? extends GmlFill>)newValue);
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				getGmlStokes().clear();
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE:
				unsetAttribute();
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE:
				unsetValue();
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				getGmlFonts().clear();
				return;
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				getGmlFills().clear();
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
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_STOKES:
				return gmlStokes != null && !gmlStokes.isEmpty();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__ATTRIBUTE:
				return isSetAttribute();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__VALUE:
				return isSetValue();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FONTS:
				return gmlFonts != null && !gmlFonts.isEmpty();
			case InfGMLSupportPackage.GML_SVG_PARAMETER__GML_FILLS:
				return gmlFills != null && !gmlFills.isEmpty();
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
		result.append(" (attribute: ");
		if (attributeESet) result.append(attribute); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlSvgParameter
