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
 * A representation of the model object '<em><b>Gml Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize <em>Absolute Size</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getSize <em>Size</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle <em>Style</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily <em>Family</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight <em>Weight</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour <em>Gml Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlFont extends IdentifiedObject {
	/**
	 * The default value of the '{@link #isAbsoluteSize() <em>Absolute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsoluteSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSOLUTE_SIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbsoluteSize() <em>Absolute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsoluteSize()
	 * @generated
	 * @ordered
	 */
	protected boolean absoluteSize = ABSOLUTE_SIZE_EDEFAULT;

	/**
	 * This is true if the Absolute Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean absoluteSizeESet;

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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

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
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * This is true if the Family attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean familyESet;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * This is true if the Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weightESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlFont() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_FONT;
	}

	/**
	 * Returns the value of the '<em><b>Absolute Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Size</em>' attribute.
	 * @see #isSetAbsoluteSize()
	 * @see #unsetAbsoluteSize()
	 * @see #setAbsoluteSize(boolean)
	 * @generated
	 */
	public boolean isAbsoluteSize() {
		return absoluteSize;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize <em>Absolute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Size</em>' attribute.
	 * @see #isSetAbsoluteSize()
	 * @see #unsetAbsoluteSize()
	 * @see #isAbsoluteSize()
	 * @generated
	 */
	public void setAbsoluteSize(boolean newAbsoluteSize) {
		absoluteSize = newAbsoluteSize;
		absoluteSizeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize <em>Absolute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbsoluteSize()
	 * @see #isAbsoluteSize()
	 * @see #setAbsoluteSize(boolean)
	 * @generated
	 */
	public void unsetAbsoluteSize() {
		absoluteSize = ABSOLUTE_SIZE_EDEFAULT;
		absoluteSizeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#isAbsoluteSize <em>Absolute Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Absolute Size</em>' attribute is set.
	 * @see #unsetAbsoluteSize()
	 * @see #isAbsoluteSize()
	 * @see #setAbsoluteSize(boolean)
	 * @generated
	 */
	public boolean isSetAbsoluteSize() {
		return absoluteSizeESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont <em>Gml Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Text Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Text Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont
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
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts <em>Gml Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Svg Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Svg Parameters</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlFonts
	 * @generated
	 */
	public EList<GmlSvgParameter> getGmlSvgParameters() {
		if (gmlSvgParameters == null) {
			gmlSvgParameters = new BasicInternalEList<GmlSvgParameter>(GmlSvgParameter.class);
		}
		return gmlSvgParameters;
	}

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(String)
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	public void setSize(String newSize) {
		size = newSize;
		sizeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(String)
	 * @generated
	 */
	public void unsetSize() {
		size = SIZE_EDEFAULT;
		sizeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(String)
	 * @generated
	 */
	public boolean isSetSize() {
		return sizeESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle <em>Style</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle <em>Style</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getStyle <em>Style</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #isSetFamily()
	 * @see #unsetFamily()
	 * @see #setFamily(String)
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #isSetFamily()
	 * @see #unsetFamily()
	 * @see #getFamily()
	 * @generated
	 */
	public void setFamily(String newFamily) {
		family = newFamily;
		familyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFamily()
	 * @see #getFamily()
	 * @see #setFamily(String)
	 * @generated
	 */
	public void unsetFamily() {
		family = FAMILY_EDEFAULT;
		familyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getFamily <em>Family</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Family</em>' attribute is set.
	 * @see #unsetFamily()
	 * @see #getFamily()
	 * @see #setFamily(String)
	 * @generated
	 */
	public boolean isSetFamily() {
		return familyESet;
	}

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #isSetWeight()
	 * @see #unsetWeight()
	 * @see #setWeight(String)
	 * @generated
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #isSetWeight()
	 * @see #unsetWeight()
	 * @see #getWeight()
	 * @generated
	 */
	public void setWeight(String newWeight) {
		weight = newWeight;
		weightESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeight()
	 * @see #getWeight()
	 * @see #setWeight(String)
	 * @generated
	 */
	public void unsetWeight() {
		weight = WEIGHT_EDEFAULT;
		weightESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getWeight <em>Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weight</em>' attribute is set.
	 * @see #unsetWeight()
	 * @see #getWeight()
	 * @see #setWeight(String)
	 * @generated
	 */
	public boolean isSetWeight() {
		return weightESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Colour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts <em>Gml Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Colour</em>' reference.
	 * @see #setGmlColour(GmlColour)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour <em>Gml Colour</em>}' reference.
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
				msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_FONTS, GmlColour.class, msgs);
			if (newGmlColour != null)
				msgs = ((InternalEObject)newGmlColour).eInverseAdd(this, InfGMLSupportPackage.GML_COLOUR__GML_FONTS, GmlColour.class, msgs);
			msgs = basicSetGmlColour(newGmlColour, msgs);
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
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTextSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSvgParameters()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				if (gmlColour != null)
					msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_FONTS, GmlColour.class, msgs);
				return basicSetGmlColour((GmlColour)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				return ((InternalEList<?>)getGmlTextSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				return ((InternalEList<?>)getGmlSvgParameters()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				return basicSetGmlColour(null, msgs);
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
			case InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE:
				return isAbsoluteSize();
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				return getGmlTextSymbols();
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				return getGmlSvgParameters();
			case InfGMLSupportPackage.GML_FONT__SIZE:
				return getSize();
			case InfGMLSupportPackage.GML_FONT__STYLE:
				return getStyle();
			case InfGMLSupportPackage.GML_FONT__FAMILY:
				return getFamily();
			case InfGMLSupportPackage.GML_FONT__WEIGHT:
				return getWeight();
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				if (resolve) return getGmlColour();
				return basicGetGmlColour();
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
			case InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE:
				setAbsoluteSize((Boolean)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				getGmlTextSymbols().addAll((Collection<? extends GmlTextSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				getGmlSvgParameters().addAll((Collection<? extends GmlSvgParameter>)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__SIZE:
				setSize((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__STYLE:
				setStyle((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__FAMILY:
				setFamily((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__WEIGHT:
				setWeight((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				setGmlColour((GmlColour)newValue);
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
			case InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE:
				unsetAbsoluteSize();
				return;
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				return;
			case InfGMLSupportPackage.GML_FONT__SIZE:
				unsetSize();
				return;
			case InfGMLSupportPackage.GML_FONT__STYLE:
				unsetStyle();
				return;
			case InfGMLSupportPackage.GML_FONT__FAMILY:
				unsetFamily();
				return;
			case InfGMLSupportPackage.GML_FONT__WEIGHT:
				unsetWeight();
				return;
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				setGmlColour((GmlColour)null);
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
			case InfGMLSupportPackage.GML_FONT__ABSOLUTE_SIZE:
				return isSetAbsoluteSize();
			case InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS:
				return gmlTextSymbols != null && !gmlTextSymbols.isEmpty();
			case InfGMLSupportPackage.GML_FONT__GML_SVG_PARAMETERS:
				return gmlSvgParameters != null && !gmlSvgParameters.isEmpty();
			case InfGMLSupportPackage.GML_FONT__SIZE:
				return isSetSize();
			case InfGMLSupportPackage.GML_FONT__STYLE:
				return isSetStyle();
			case InfGMLSupportPackage.GML_FONT__FAMILY:
				return isSetFamily();
			case InfGMLSupportPackage.GML_FONT__WEIGHT:
				return isSetWeight();
			case InfGMLSupportPackage.GML_FONT__GML_COLOUR:
				return gmlColour != null;
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
		result.append(" (absoluteSize: ");
		if (absoluteSizeESet) result.append(absoluteSize); else result.append("<unset>");
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(", family: ");
		if (familyESet) result.append(family); else result.append("<unset>");
		result.append(", weight: ");
		if (weightESet) result.append(weight); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlFont
