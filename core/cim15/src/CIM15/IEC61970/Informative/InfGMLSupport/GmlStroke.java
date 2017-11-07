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
 * A representation of the model object '<em><b>Gml Stroke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour <em>Gml Colour</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap <em>Line Cap</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth <em>Width</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin <em>Linejoin</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks <em>Gml Marks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlSvgParameters <em>Gml Svg Parameters</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray <em>Dash Array</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset <em>Dash Offset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlLineSymbols <em>Gml Line Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlStroke extends IdentifiedObject {
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
	 * The default value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCap()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_CAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCap()
	 * @generated
	 * @ordered
	 */
	protected String lineCap = LINE_CAP_EDEFAULT;

	/**
	 * This is true if the Line Cap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineCapESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

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
	 * The default value of the '{@link #getLinejoin() <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEJOIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinejoin() <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinejoin()
	 * @generated
	 * @ordered
	 */
	protected String linejoin = LINEJOIN_EDEFAULT;

	/**
	 * This is true if the Linejoin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linejoinESet;

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
	 * The cached value of the '{@link #getGmlSvgParameters() <em>Gml Svg Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSvgParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSvgParameter> gmlSvgParameters;

	/**
	 * The default value of the '{@link #getDashArray() <em>Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashArray()
	 * @generated
	 * @ordered
	 */
	protected static final String DASH_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDashArray() <em>Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashArray()
	 * @generated
	 * @ordered
	 */
	protected String dashArray = DASH_ARRAY_EDEFAULT;

	/**
	 * This is true if the Dash Array attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dashArrayESet;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected String lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * This is true if the Line Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineStyleESet;

	/**
	 * The default value of the '{@link #getDashOffset() <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String DASH_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDashOffset() <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashOffset()
	 * @generated
	 * @ordered
	 */
	protected String dashOffset = DASH_OFFSET_EDEFAULT;

	/**
	 * This is true if the Dash Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dashOffsetESet;

	/**
	 * The cached value of the '{@link #getGmlLineSymbols() <em>Gml Line Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLineSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlLineSymbol> gmlLineSymbols;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlStroke() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_STROKE;
	}

	/**
	 * Returns the value of the '<em><b>Gml Colour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes <em>Gml Strokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Colour</em>' reference.
	 * @see #setGmlColour(GmlColour)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour <em>Gml Colour</em>}' reference.
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
				msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_STROKES, GmlColour.class, msgs);
			if (newGmlColour != null)
				msgs = ((InternalEObject)newGmlColour).eInverseAdd(this, InfGMLSupportPackage.GML_COLOUR__GML_STROKES, GmlColour.class, msgs);
			msgs = basicSetGmlColour(newGmlColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Line Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Cap</em>' attribute.
	 * @see #isSetLineCap()
	 * @see #unsetLineCap()
	 * @see #setLineCap(String)
	 * @generated
	 */
	public String getLineCap() {
		return lineCap;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Cap</em>' attribute.
	 * @see #isSetLineCap()
	 * @see #unsetLineCap()
	 * @see #getLineCap()
	 * @generated
	 */
	public void setLineCap(String newLineCap) {
		lineCap = newLineCap;
		lineCapESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap <em>Line Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineCap()
	 * @see #getLineCap()
	 * @see #setLineCap(String)
	 * @generated
	 */
	public void unsetLineCap() {
		lineCap = LINE_CAP_EDEFAULT;
		lineCapESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineCap <em>Line Cap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Cap</em>' attribute is set.
	 * @see #unsetLineCap()
	 * @see #getLineCap()
	 * @see #setLineCap(String)
	 * @generated
	 */
	public boolean isSetLineCap() {
		return lineCapESet;
	}

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(float)
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	public void setWidth(float newWidth) {
		width = newWidth;
		widthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(float)
	 * @generated
	 */
	public void unsetWidth() {
		width = WIDTH_EDEFAULT;
		widthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(float)
	 * @generated
	 */
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Polygon Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Polygon Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlStroke
	 * @generated
	 */
	public EList<GmlPolygonSymbol> getGmlPolygonSymbols() {
		if (gmlPolygonSymbols == null) {
			gmlPolygonSymbols = new BasicInternalEList<GmlPolygonSymbol>(GmlPolygonSymbol.class);
		}
		return gmlPolygonSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linejoin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linejoin</em>' attribute.
	 * @see #isSetLinejoin()
	 * @see #unsetLinejoin()
	 * @see #setLinejoin(String)
	 * @generated
	 */
	public String getLinejoin() {
		return linejoin;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linejoin</em>' attribute.
	 * @see #isSetLinejoin()
	 * @see #unsetLinejoin()
	 * @see #getLinejoin()
	 * @generated
	 */
	public void setLinejoin(String newLinejoin) {
		linejoin = newLinejoin;
		linejoinESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinejoin()
	 * @see #getLinejoin()
	 * @see #setLinejoin(String)
	 * @generated
	 */
	public void unsetLinejoin() {
		linejoin = LINEJOIN_EDEFAULT;
		linejoinESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLinejoin <em>Linejoin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linejoin</em>' attribute is set.
	 * @see #unsetLinejoin()
	 * @see #getLinejoin()
	 * @see #setLinejoin(String)
	 * @generated
	 */
	public boolean isSetLinejoin() {
		return linejoinESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Marks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes <em>Gml Strokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Marks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Marks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes
	 * @generated
	 */
	public EList<GmlMark> getGmlMarks() {
		if (gmlMarks == null) {
			gmlMarks = new BasicInternalEList<GmlMark>(GmlMark.class);
		}
		return gmlMarks;
	}

	/**
	 * Returns the value of the '<em><b>Gml Svg Parameters</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes <em>Gml Stokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Svg Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Svg Parameters</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter#getGmlStokes
	 * @generated
	 */
	public EList<GmlSvgParameter> getGmlSvgParameters() {
		if (gmlSvgParameters == null) {
			gmlSvgParameters = new BasicInternalEList<GmlSvgParameter>(GmlSvgParameter.class);
		}
		return gmlSvgParameters;
	}

	/**
	 * Returns the value of the '<em><b>Dash Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dash Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash Array</em>' attribute.
	 * @see #isSetDashArray()
	 * @see #unsetDashArray()
	 * @see #setDashArray(String)
	 * @generated
	 */
	public String getDashArray() {
		return dashArray;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray <em>Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dash Array</em>' attribute.
	 * @see #isSetDashArray()
	 * @see #unsetDashArray()
	 * @see #getDashArray()
	 * @generated
	 */
	public void setDashArray(String newDashArray) {
		dashArray = newDashArray;
		dashArrayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray <em>Dash Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDashArray()
	 * @see #getDashArray()
	 * @see #setDashArray(String)
	 * @generated
	 */
	public void unsetDashArray() {
		dashArray = DASH_ARRAY_EDEFAULT;
		dashArrayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashArray <em>Dash Array</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dash Array</em>' attribute is set.
	 * @see #unsetDashArray()
	 * @see #getDashArray()
	 * @see #setDashArray(String)
	 * @generated
	 */
	public boolean isSetDashArray() {
		return dashArrayESet;
	}

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see #isSetLineStyle()
	 * @see #unsetLineStyle()
	 * @see #setLineStyle(String)
	 * @generated
	 */
	public String getLineStyle() {
		return lineStyle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see #isSetLineStyle()
	 * @see #unsetLineStyle()
	 * @see #getLineStyle()
	 * @generated
	 */
	public void setLineStyle(String newLineStyle) {
		lineStyle = newLineStyle;
		lineStyleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineStyle()
	 * @see #getLineStyle()
	 * @see #setLineStyle(String)
	 * @generated
	 */
	public void unsetLineStyle() {
		lineStyle = LINE_STYLE_EDEFAULT;
		lineStyleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getLineStyle <em>Line Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Style</em>' attribute is set.
	 * @see #unsetLineStyle()
	 * @see #getLineStyle()
	 * @see #setLineStyle(String)
	 * @generated
	 */
	public boolean isSetLineStyle() {
		return lineStyleESet;
	}

	/**
	 * Returns the value of the '<em><b>Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dash Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash Offset</em>' attribute.
	 * @see #isSetDashOffset()
	 * @see #unsetDashOffset()
	 * @see #setDashOffset(String)
	 * @generated
	 */
	public String getDashOffset() {
		return dashOffset;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dash Offset</em>' attribute.
	 * @see #isSetDashOffset()
	 * @see #unsetDashOffset()
	 * @see #getDashOffset()
	 * @generated
	 */
	public void setDashOffset(String newDashOffset) {
		dashOffset = newDashOffset;
		dashOffsetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDashOffset()
	 * @see #getDashOffset()
	 * @see #setDashOffset(String)
	 * @generated
	 */
	public void unsetDashOffset() {
		dashOffset = DASH_OFFSET_EDEFAULT;
		dashOffsetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getDashOffset <em>Dash Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dash Offset</em>' attribute is set.
	 * @see #unsetDashOffset()
	 * @see #getDashOffset()
	 * @see #setDashOffset(String)
	 * @generated
	 */
	public boolean isSetDashOffset() {
		return dashOffsetESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Line Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Line Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlStroke
	 * @generated
	 */
	public EList<GmlLineSymbol> getGmlLineSymbols() {
		if (gmlLineSymbols == null) {
			gmlLineSymbols = new BasicInternalEList<GmlLineSymbol>(GmlLineSymbol.class);
		}
		return gmlLineSymbols;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity <em>Opacity</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity <em>Opacity</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getOpacity <em>Opacity</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				if (gmlColour != null)
					msgs = ((InternalEObject)gmlColour).eInverseRemove(this, InfGMLSupportPackage.GML_COLOUR__GML_STROKES, GmlColour.class, msgs);
				return basicSetGmlColour((GmlColour)otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPolygonSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlMarks()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSvgParameters()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlLineSymbols()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				return basicSetGmlColour(null, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				return ((InternalEList<?>)getGmlPolygonSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				return ((InternalEList<?>)getGmlMarks()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				return ((InternalEList<?>)getGmlSvgParameters()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				return ((InternalEList<?>)getGmlLineSymbols()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				if (resolve) return getGmlColour();
				return basicGetGmlColour();
			case InfGMLSupportPackage.GML_STROKE__LINE_CAP:
				return getLineCap();
			case InfGMLSupportPackage.GML_STROKE__WIDTH:
				return getWidth();
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				return getGmlPolygonSymbols();
			case InfGMLSupportPackage.GML_STROKE__LINEJOIN:
				return getLinejoin();
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				return getGmlMarks();
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				return getGmlSvgParameters();
			case InfGMLSupportPackage.GML_STROKE__DASH_ARRAY:
				return getDashArray();
			case InfGMLSupportPackage.GML_STROKE__LINE_STYLE:
				return getLineStyle();
			case InfGMLSupportPackage.GML_STROKE__DASH_OFFSET:
				return getDashOffset();
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				return getGmlLineSymbols();
			case InfGMLSupportPackage.GML_STROKE__OPACITY:
				return getOpacity();
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
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				setGmlColour((GmlColour)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__LINE_CAP:
				setLineCap((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__WIDTH:
				setWidth((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				getGmlPolygonSymbols().addAll((Collection<? extends GmlPolygonSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__LINEJOIN:
				setLinejoin((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				getGmlMarks().clear();
				getGmlMarks().addAll((Collection<? extends GmlMark>)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				getGmlSvgParameters().addAll((Collection<? extends GmlSvgParameter>)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__DASH_ARRAY:
				setDashArray((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__LINE_STYLE:
				setLineStyle((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__DASH_OFFSET:
				setDashOffset((String)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				getGmlLineSymbols().clear();
				getGmlLineSymbols().addAll((Collection<? extends GmlLineSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_STROKE__OPACITY:
				setOpacity((Float)newValue);
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
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				setGmlColour((GmlColour)null);
				return;
			case InfGMLSupportPackage.GML_STROKE__LINE_CAP:
				unsetLineCap();
				return;
			case InfGMLSupportPackage.GML_STROKE__WIDTH:
				unsetWidth();
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_STROKE__LINEJOIN:
				unsetLinejoin();
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				getGmlMarks().clear();
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				getGmlSvgParameters().clear();
				return;
			case InfGMLSupportPackage.GML_STROKE__DASH_ARRAY:
				unsetDashArray();
				return;
			case InfGMLSupportPackage.GML_STROKE__LINE_STYLE:
				unsetLineStyle();
				return;
			case InfGMLSupportPackage.GML_STROKE__DASH_OFFSET:
				unsetDashOffset();
				return;
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				getGmlLineSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_STROKE__OPACITY:
				unsetOpacity();
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
			case InfGMLSupportPackage.GML_STROKE__GML_COLOUR:
				return gmlColour != null;
			case InfGMLSupportPackage.GML_STROKE__LINE_CAP:
				return isSetLineCap();
			case InfGMLSupportPackage.GML_STROKE__WIDTH:
				return isSetWidth();
			case InfGMLSupportPackage.GML_STROKE__GML_POLYGON_SYMBOLS:
				return gmlPolygonSymbols != null && !gmlPolygonSymbols.isEmpty();
			case InfGMLSupportPackage.GML_STROKE__LINEJOIN:
				return isSetLinejoin();
			case InfGMLSupportPackage.GML_STROKE__GML_MARKS:
				return gmlMarks != null && !gmlMarks.isEmpty();
			case InfGMLSupportPackage.GML_STROKE__GML_SVG_PARAMETERS:
				return gmlSvgParameters != null && !gmlSvgParameters.isEmpty();
			case InfGMLSupportPackage.GML_STROKE__DASH_ARRAY:
				return isSetDashArray();
			case InfGMLSupportPackage.GML_STROKE__LINE_STYLE:
				return isSetLineStyle();
			case InfGMLSupportPackage.GML_STROKE__DASH_OFFSET:
				return isSetDashOffset();
			case InfGMLSupportPackage.GML_STROKE__GML_LINE_SYMBOLS:
				return gmlLineSymbols != null && !gmlLineSymbols.isEmpty();
			case InfGMLSupportPackage.GML_STROKE__OPACITY:
				return isSetOpacity();
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
		result.append(" (lineCap: ");
		if (lineCapESet) result.append(lineCap); else result.append("<unset>");
		result.append(", width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(", linejoin: ");
		if (linejoinESet) result.append(linejoin); else result.append("<unset>");
		result.append(", dashArray: ");
		if (dashArrayESet) result.append(dashArray); else result.append("<unset>");
		result.append(", lineStyle: ");
		if (lineStyleESet) result.append(lineStyle); else result.append("<unset>");
		result.append(", dashOffset: ");
		if (dashOffsetESet) result.append(dashOffset); else result.append("<unset>");
		result.append(", opacity: ");
		if (opacityESet) result.append(opacity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlStroke
