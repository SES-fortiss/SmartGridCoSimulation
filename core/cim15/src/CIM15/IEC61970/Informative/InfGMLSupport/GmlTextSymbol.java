/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Text Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel <em>Label</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill <em>Gml Fill</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement <em>Gml Label Placement</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType <em>Label Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize <em>Min Font Size</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty <em>Property</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlHalo <em>Gml Halo</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont <em>Gml Font</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlTextSymbol extends GmlSymbol {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * This is true if the Label attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean labelESet;

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
	 * The cached value of the '{@link #getGmlLabelPlacement() <em>Gml Label Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLabelPlacement()
	 * @generated
	 * @ordered
	 */
	protected GmlLabelPlacement gmlLabelPlacement;

	/**
	 * The default value of the '{@link #getLabelType() <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelType()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelType() <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelType()
	 * @generated
	 * @ordered
	 */
	protected String labelType = LABEL_TYPE_EDEFAULT;

	/**
	 * This is true if the Label Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean labelTypeESet;

	/**
	 * The default value of the '{@link #getFieldID() <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldID()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldID() <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldID()
	 * @generated
	 * @ordered
	 */
	protected String fieldID = FIELD_ID_EDEFAULT;

	/**
	 * This is true if the Field ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fieldIDESet;

	/**
	 * The default value of the '{@link #getMinFontSize() <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_FONT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinFontSize() <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFontSize()
	 * @generated
	 * @ordered
	 */
	protected int minFontSize = MIN_FONT_SIZE_EDEFAULT;

	/**
	 * This is true if the Min Font Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minFontSizeESet;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * This is true if the Property attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyESet;

	/**
	 * The cached value of the '{@link #getGmlHalo() <em>Gml Halo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlHalo()
	 * @generated
	 * @ordered
	 */
	protected GmlHalo gmlHalo;

	/**
	 * The cached value of the '{@link #getGmlFont() <em>Gml Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFont()
	 * @generated
	 * @ordered
	 */
	protected GmlFont gmlFont;

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
	protected GmlTextSymbol() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_TEXT_SYMBOL;
	}

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #setLabel(String)
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel) {
		label = newLabel;
		labelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabel()
	 * @see #getLabel()
	 * @see #setLabel(String)
	 * @generated
	 */
	public void unsetLabel() {
		label = LABEL_EDEFAULT;
		labelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabel <em>Label</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label</em>' attribute is set.
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @see #setLabel(String)
	 * @generated
	 */
	public boolean isSetLabel() {
		return labelESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Fill</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fill</em>' reference.
	 * @see #setGmlFill(GmlFill)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlTextSymbols
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFill <em>Gml Fill</em>}' reference.
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
				msgs = ((InternalEObject)gmlFill).eInverseRemove(this, InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS, GmlFill.class, msgs);
			if (newGmlFill != null)
				msgs = ((InternalEObject)newGmlFill).eInverseAdd(this, InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS, GmlFill.class, msgs);
			msgs = basicSetGmlFill(newGmlFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Label Placement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Label Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Label Placement</em>' reference.
	 * @see #setGmlLabelPlacement(GmlLabelPlacement)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols
	 * @generated
	 */
	public GmlLabelPlacement getGmlLabelPlacement() {
		if (gmlLabelPlacement != null && gmlLabelPlacement.eIsProxy()) {
			InternalEObject oldGmlLabelPlacement = (InternalEObject)gmlLabelPlacement;
			gmlLabelPlacement = (GmlLabelPlacement)eResolveProxy(oldGmlLabelPlacement);
			if (gmlLabelPlacement != oldGmlLabelPlacement) {
			}
		}
		return gmlLabelPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelPlacement basicGetGmlLabelPlacement() {
		return gmlLabelPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlLabelPlacement(GmlLabelPlacement newGmlLabelPlacement, NotificationChain msgs) {
		GmlLabelPlacement oldGmlLabelPlacement = gmlLabelPlacement;
		gmlLabelPlacement = newGmlLabelPlacement;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement <em>Gml Label Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Label Placement</em>' reference.
	 * @see #getGmlLabelPlacement()
	 * @generated
	 */
	public void setGmlLabelPlacement(GmlLabelPlacement newGmlLabelPlacement) {
		if (newGmlLabelPlacement != gmlLabelPlacement) {
			NotificationChain msgs = null;
			if (gmlLabelPlacement != null)
				msgs = ((InternalEObject)gmlLabelPlacement).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS, GmlLabelPlacement.class, msgs);
			if (newGmlLabelPlacement != null)
				msgs = ((InternalEObject)newGmlLabelPlacement).eInverseAdd(this, InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS, GmlLabelPlacement.class, msgs);
			msgs = basicSetGmlLabelPlacement(newGmlLabelPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Type</em>' attribute.
	 * @see #isSetLabelType()
	 * @see #unsetLabelType()
	 * @see #setLabelType(String)
	 * @generated
	 */
	public String getLabelType() {
		return labelType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Type</em>' attribute.
	 * @see #isSetLabelType()
	 * @see #unsetLabelType()
	 * @see #getLabelType()
	 * @generated
	 */
	public void setLabelType(String newLabelType) {
		labelType = newLabelType;
		labelTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabelType()
	 * @see #getLabelType()
	 * @see #setLabelType(String)
	 * @generated
	 */
	public void unsetLabelType() {
		labelType = LABEL_TYPE_EDEFAULT;
		labelTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getLabelType <em>Label Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label Type</em>' attribute is set.
	 * @see #unsetLabelType()
	 * @see #getLabelType()
	 * @see #setLabelType(String)
	 * @generated
	 */
	public boolean isSetLabelType() {
		return labelTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field ID</em>' attribute.
	 * @see #isSetFieldID()
	 * @see #unsetFieldID()
	 * @see #setFieldID(String)
	 * @generated
	 */
	public String getFieldID() {
		return fieldID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field ID</em>' attribute.
	 * @see #isSetFieldID()
	 * @see #unsetFieldID()
	 * @see #getFieldID()
	 * @generated
	 */
	public void setFieldID(String newFieldID) {
		fieldID = newFieldID;
		fieldIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFieldID()
	 * @see #getFieldID()
	 * @see #setFieldID(String)
	 * @generated
	 */
	public void unsetFieldID() {
		fieldID = FIELD_ID_EDEFAULT;
		fieldIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getFieldID <em>Field ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Field ID</em>' attribute is set.
	 * @see #unsetFieldID()
	 * @see #getFieldID()
	 * @see #setFieldID(String)
	 * @generated
	 */
	public boolean isSetFieldID() {
		return fieldIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Font Size</em>' attribute.
	 * @see #isSetMinFontSize()
	 * @see #unsetMinFontSize()
	 * @see #setMinFontSize(int)
	 * @generated
	 */
	public int getMinFontSize() {
		return minFontSize;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Font Size</em>' attribute.
	 * @see #isSetMinFontSize()
	 * @see #unsetMinFontSize()
	 * @see #getMinFontSize()
	 * @generated
	 */
	public void setMinFontSize(int newMinFontSize) {
		minFontSize = newMinFontSize;
		minFontSizeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize <em>Min Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinFontSize()
	 * @see #getMinFontSize()
	 * @see #setMinFontSize(int)
	 * @generated
	 */
	public void unsetMinFontSize() {
		minFontSize = MIN_FONT_SIZE_EDEFAULT;
		minFontSizeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getMinFontSize <em>Min Font Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Font Size</em>' attribute is set.
	 * @see #unsetMinFontSize()
	 * @see #getMinFontSize()
	 * @see #setMinFontSize(int)
	 * @generated
	 */
	public boolean isSetMinFontSize() {
		return minFontSizeESet;
	}

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #setProperty(String)
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #isSetProperty()
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @generated
	 */
	public void setProperty(String newProperty) {
		property = newProperty;
		propertyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProperty()
	 * @see #getProperty()
	 * @see #setProperty(String)
	 * @generated
	 */
	public void unsetProperty() {
		property = PROPERTY_EDEFAULT;
		propertyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getProperty <em>Property</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property</em>' attribute is set.
	 * @see #unsetProperty()
	 * @see #getProperty()
	 * @see #setProperty(String)
	 * @generated
	 */
	public boolean isSetProperty() {
		return propertyESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Halo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Halo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Halo</em>' reference.
	 * @see #setGmlHalo(GmlHalo)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo#getGmlTextSymbols
	 * @generated
	 */
	public GmlHalo getGmlHalo() {
		if (gmlHalo != null && gmlHalo.eIsProxy()) {
			InternalEObject oldGmlHalo = (InternalEObject)gmlHalo;
			gmlHalo = (GmlHalo)eResolveProxy(oldGmlHalo);
			if (gmlHalo != oldGmlHalo) {
			}
		}
		return gmlHalo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlHalo basicGetGmlHalo() {
		return gmlHalo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlHalo(GmlHalo newGmlHalo, NotificationChain msgs) {
		GmlHalo oldGmlHalo = gmlHalo;
		gmlHalo = newGmlHalo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlHalo <em>Gml Halo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Halo</em>' reference.
	 * @see #getGmlHalo()
	 * @generated
	 */
	public void setGmlHalo(GmlHalo newGmlHalo) {
		if (newGmlHalo != gmlHalo) {
			NotificationChain msgs = null;
			if (gmlHalo != null)
				msgs = ((InternalEObject)gmlHalo).eInverseRemove(this, InfGMLSupportPackage.GML_HALO__GML_TEXT_SYMBOLS, GmlHalo.class, msgs);
			if (newGmlHalo != null)
				msgs = ((InternalEObject)newGmlHalo).eInverseAdd(this, InfGMLSupportPackage.GML_HALO__GML_TEXT_SYMBOLS, GmlHalo.class, msgs);
			msgs = basicSetGmlHalo(newGmlHalo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Font</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Font</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Font</em>' reference.
	 * @see #setGmlFont(GmlFont)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlTextSymbols
	 * @generated
	 */
	public GmlFont getGmlFont() {
		if (gmlFont != null && gmlFont.eIsProxy()) {
			InternalEObject oldGmlFont = (InternalEObject)gmlFont;
			gmlFont = (GmlFont)eResolveProxy(oldGmlFont);
			if (gmlFont != oldGmlFont) {
			}
		}
		return gmlFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFont basicGetGmlFont() {
		return gmlFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlFont(GmlFont newGmlFont, NotificationChain msgs) {
		GmlFont oldGmlFont = gmlFont;
		gmlFont = newGmlFont;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlFont <em>Gml Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Font</em>' reference.
	 * @see #getGmlFont()
	 * @generated
	 */
	public void setGmlFont(GmlFont newGmlFont) {
		if (newGmlFont != gmlFont) {
			NotificationChain msgs = null;
			if (gmlFont != null)
				msgs = ((InternalEObject)gmlFont).eInverseRemove(this, InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS, GmlFont.class, msgs);
			if (newGmlFont != null)
				msgs = ((InternalEObject)newGmlFont).eInverseAdd(this, InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS, GmlFont.class, msgs);
			msgs = basicSetGmlFont(newGmlFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols <em>Gml Text Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
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
				msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS, GmlDiagramObject.class, msgs);
			if (newGmlDiagramObject != null)
				msgs = ((InternalEObject)newGmlDiagramObject).eInverseAdd(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS, GmlDiagramObject.class, msgs);
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				if (gmlFill != null)
					msgs = ((InternalEObject)gmlFill).eInverseRemove(this, InfGMLSupportPackage.GML_FILL__GML_TEXT_SYMBOLS, GmlFill.class, msgs);
				return basicSetGmlFill((GmlFill)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				if (gmlLabelPlacement != null)
					msgs = ((InternalEObject)gmlLabelPlacement).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS, GmlLabelPlacement.class, msgs);
				return basicSetGmlLabelPlacement((GmlLabelPlacement)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				if (gmlHalo != null)
					msgs = ((InternalEObject)gmlHalo).eInverseRemove(this, InfGMLSupportPackage.GML_HALO__GML_TEXT_SYMBOLS, GmlHalo.class, msgs);
				return basicSetGmlHalo((GmlHalo)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				if (gmlFont != null)
					msgs = ((InternalEObject)gmlFont).eInverseRemove(this, InfGMLSupportPackage.GML_FONT__GML_TEXT_SYMBOLS, GmlFont.class, msgs);
				return basicSetGmlFont((GmlFont)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
				if (gmlDiagramObject != null)
					msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS, GmlDiagramObject.class, msgs);
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				return basicSetGmlFill(null, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				return basicSetGmlLabelPlacement(null, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				return basicSetGmlHalo(null, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				return basicSetGmlFont(null, msgs);
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL:
				return getLabel();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				if (resolve) return getGmlFill();
				return basicGetGmlFill();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				if (resolve) return getGmlLabelPlacement();
				return basicGetGmlLabelPlacement();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE:
				return getLabelType();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID:
				return getFieldID();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE:
				return getMinFontSize();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY:
				return getProperty();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				if (resolve) return getGmlHalo();
				return basicGetGmlHalo();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				if (resolve) return getGmlFont();
				return basicGetGmlFont();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL:
				setLabel((String)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				setGmlFill((GmlFill)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				setGmlLabelPlacement((GmlLabelPlacement)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE:
				setLabelType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID:
				setFieldID((String)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE:
				setMinFontSize((Integer)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY:
				setProperty((String)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				setGmlHalo((GmlHalo)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				setGmlFont((GmlFont)newValue);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL:
				unsetLabel();
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				setGmlFill((GmlFill)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				setGmlLabelPlacement((GmlLabelPlacement)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE:
				unsetLabelType();
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID:
				unsetFieldID();
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE:
				unsetMinFontSize();
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY:
				unsetProperty();
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				setGmlHalo((GmlHalo)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				setGmlFont((GmlFont)null);
				return;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL:
				return isSetLabel();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FILL:
				return gmlFill != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_LABEL_PLACEMENT:
				return gmlLabelPlacement != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__LABEL_TYPE:
				return isSetLabelType();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__FIELD_ID:
				return isSetFieldID();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__MIN_FONT_SIZE:
				return isSetMinFontSize();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__PROPERTY:
				return isSetProperty();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_HALO:
				return gmlHalo != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_FONT:
				return gmlFont != null;
			case InfGMLSupportPackage.GML_TEXT_SYMBOL__GML_DIAGRAM_OBJECT:
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
		result.append(" (label: ");
		if (labelESet) result.append(label); else result.append("<unset>");
		result.append(", labelType: ");
		if (labelTypeESet) result.append(labelType); else result.append("<unset>");
		result.append(", fieldID: ");
		if (fieldIDESet) result.append(fieldID); else result.append("<unset>");
		result.append(", minFontSize: ");
		if (minFontSizeESet) result.append(minFontSize); else result.append("<unset>");
		result.append(", property: ");
		if (propertyESet) result.append(property); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlTextSymbol
