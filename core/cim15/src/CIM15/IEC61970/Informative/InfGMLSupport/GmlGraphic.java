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
 * A representation of the model object '<em><b>Gml Graphic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks <em>Gml Marks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlPointSymbols <em>Gml Point Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getRotation <em>Rotation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSize <em>Size</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSymbolID <em>Symbol ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getXScale <em>XScale</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getYScale <em>YScale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlGraphic extends IdentifiedObject {
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
	 * The cached value of the '{@link #getGmlPointSymbols() <em>Gml Point Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlPointSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlPointSymbol> gmlPointSymbols;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final float ROTATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected float rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

	/**
	 * The default value of the '{@link #getSymbolID() <em>Symbol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolID()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolID() <em>Symbol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolID()
	 * @generated
	 * @ordered
	 */
	protected String symbolID = SYMBOL_ID_EDEFAULT;

	/**
	 * This is true if the Symbol ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symbolIDESet;

	/**
	 * The default value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected int minSize = MIN_SIZE_EDEFAULT;

	/**
	 * This is true if the Min Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minSizeESet;

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
	 * The default value of the '{@link #getXScale() <em>XScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXScale()
	 * @generated
	 * @ordered
	 */
	protected static final float XSCALE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXScale() <em>XScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXScale()
	 * @generated
	 * @ordered
	 */
	protected float xScale = XSCALE_EDEFAULT;

	/**
	 * This is true if the XScale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xScaleESet;

	/**
	 * The default value of the '{@link #getYScale() <em>YScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYScale()
	 * @generated
	 * @ordered
	 */
	protected static final float YSCALE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getYScale() <em>YScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYScale()
	 * @generated
	 * @ordered
	 */
	protected float yScale = YSCALE_EDEFAULT;

	/**
	 * This is true if the YScale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yScaleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlGraphic() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_GRAPHIC;
	}

	/**
	 * Returns the value of the '<em><b>Gml Marks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlGraphics <em>Gml Graphics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Marks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Marks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlGraphics
	 * @generated
	 */
	public EList<GmlMark> getGmlMarks() {
		if (gmlMarks == null) {
			gmlMarks = new BasicInternalEList<GmlMark>(GmlMark.class);
		}
		return gmlMarks;
	}

	/**
	 * Returns the value of the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic <em>Gml Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Point Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Point Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlGraphic
	 * @generated
	 */
	public EList<GmlPointSymbol> getGmlPointSymbols() {
		if (gmlPointSymbols == null) {
			gmlPointSymbols = new BasicInternalEList<GmlPointSymbol>(GmlPointSymbol.class);
		}
		return gmlPointSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(float)
	 * @generated
	 */
	public float getRotation() {
		return rotation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @generated
	 */
	public void setRotation(float newRotation) {
		rotation = newRotation;
		rotationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(float)
	 * @generated
	 */
	public void unsetRotation() {
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getRotation <em>Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation</em>' attribute is set.
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @see #setRotation(float)
	 * @generated
	 */
	public boolean isSetRotation() {
		return rotationESet;
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
	 * @see #setSize(int)
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	public void setSize(int newSize) {
		size = newSize;
		sizeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(int)
	 * @generated
	 */
	public void unsetSize() {
		size = SIZE_EDEFAULT;
		sizeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(int)
	 * @generated
	 */
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * Returns the value of the '<em><b>Symbol ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol ID</em>' attribute.
	 * @see #isSetSymbolID()
	 * @see #unsetSymbolID()
	 * @see #setSymbolID(String)
	 * @generated
	 */
	public String getSymbolID() {
		return symbolID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSymbolID <em>Symbol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol ID</em>' attribute.
	 * @see #isSetSymbolID()
	 * @see #unsetSymbolID()
	 * @see #getSymbolID()
	 * @generated
	 */
	public void setSymbolID(String newSymbolID) {
		symbolID = newSymbolID;
		symbolIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSymbolID <em>Symbol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymbolID()
	 * @see #getSymbolID()
	 * @see #setSymbolID(String)
	 * @generated
	 */
	public void unsetSymbolID() {
		symbolID = SYMBOL_ID_EDEFAULT;
		symbolIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getSymbolID <em>Symbol ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symbol ID</em>' attribute is set.
	 * @see #unsetSymbolID()
	 * @see #getSymbolID()
	 * @see #setSymbolID(String)
	 * @generated
	 */
	public boolean isSetSymbolID() {
		return symbolIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Size</em>' attribute.
	 * @see #isSetMinSize()
	 * @see #unsetMinSize()
	 * @see #setMinSize(int)
	 * @generated
	 */
	public int getMinSize() {
		return minSize;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getMinSize <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Size</em>' attribute.
	 * @see #isSetMinSize()
	 * @see #unsetMinSize()
	 * @see #getMinSize()
	 * @generated
	 */
	public void setMinSize(int newMinSize) {
		minSize = newMinSize;
		minSizeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getMinSize <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinSize()
	 * @see #getMinSize()
	 * @see #setMinSize(int)
	 * @generated
	 */
	public void unsetMinSize() {
		minSize = MIN_SIZE_EDEFAULT;
		minSizeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getMinSize <em>Min Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Size</em>' attribute is set.
	 * @see #unsetMinSize()
	 * @see #getMinSize()
	 * @see #setMinSize(int)
	 * @generated
	 */
	public boolean isSetMinSize() {
		return minSizeESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getOpacity <em>Opacity</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getOpacity <em>Opacity</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getOpacity <em>Opacity</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>XScale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XScale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XScale</em>' attribute.
	 * @see #isSetXScale()
	 * @see #unsetXScale()
	 * @see #setXScale(float)
	 * @generated
	 */
	public float getXScale() {
		return xScale;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getXScale <em>XScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XScale</em>' attribute.
	 * @see #isSetXScale()
	 * @see #unsetXScale()
	 * @see #getXScale()
	 * @generated
	 */
	public void setXScale(float newXScale) {
		xScale = newXScale;
		xScaleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getXScale <em>XScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXScale()
	 * @see #getXScale()
	 * @see #setXScale(float)
	 * @generated
	 */
	public void unsetXScale() {
		xScale = XSCALE_EDEFAULT;
		xScaleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getXScale <em>XScale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XScale</em>' attribute is set.
	 * @see #unsetXScale()
	 * @see #getXScale()
	 * @see #setXScale(float)
	 * @generated
	 */
	public boolean isSetXScale() {
		return xScaleESet;
	}

	/**
	 * Returns the value of the '<em><b>YScale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YScale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YScale</em>' attribute.
	 * @see #isSetYScale()
	 * @see #unsetYScale()
	 * @see #setYScale(float)
	 * @generated
	 */
	public float getYScale() {
		return yScale;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getYScale <em>YScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YScale</em>' attribute.
	 * @see #isSetYScale()
	 * @see #unsetYScale()
	 * @see #getYScale()
	 * @generated
	 */
	public void setYScale(float newYScale) {
		yScale = newYScale;
		yScaleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getYScale <em>YScale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYScale()
	 * @see #getYScale()
	 * @see #setYScale(float)
	 * @generated
	 */
	public void unsetYScale() {
		yScale = YSCALE_EDEFAULT;
		yScaleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getYScale <em>YScale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YScale</em>' attribute is set.
	 * @see #unsetYScale()
	 * @see #getYScale()
	 * @see #setYScale(float)
	 * @generated
	 */
	public boolean isSetYScale() {
		return yScaleESet;
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
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlMarks()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPointSymbols()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				return ((InternalEList<?>)getGmlMarks()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				return ((InternalEList<?>)getGmlPointSymbols()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				return getGmlMarks();
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				return getGmlPointSymbols();
			case InfGMLSupportPackage.GML_GRAPHIC__ROTATION:
				return getRotation();
			case InfGMLSupportPackage.GML_GRAPHIC__SIZE:
				return getSize();
			case InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID:
				return getSymbolID();
			case InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE:
				return getMinSize();
			case InfGMLSupportPackage.GML_GRAPHIC__OPACITY:
				return getOpacity();
			case InfGMLSupportPackage.GML_GRAPHIC__XSCALE:
				return getXScale();
			case InfGMLSupportPackage.GML_GRAPHIC__YSCALE:
				return getYScale();
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
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				getGmlMarks().clear();
				getGmlMarks().addAll((Collection<? extends GmlMark>)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				getGmlPointSymbols().clear();
				getGmlPointSymbols().addAll((Collection<? extends GmlPointSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__ROTATION:
				setRotation((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__SIZE:
				setSize((Integer)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID:
				setSymbolID((String)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE:
				setMinSize((Integer)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__OPACITY:
				setOpacity((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__XSCALE:
				setXScale((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__YSCALE:
				setYScale((Float)newValue);
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
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				getGmlMarks().clear();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				getGmlPointSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__ROTATION:
				unsetRotation();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__SIZE:
				unsetSize();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID:
				unsetSymbolID();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE:
				unsetMinSize();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__OPACITY:
				unsetOpacity();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__XSCALE:
				unsetXScale();
				return;
			case InfGMLSupportPackage.GML_GRAPHIC__YSCALE:
				unsetYScale();
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
			case InfGMLSupportPackage.GML_GRAPHIC__GML_MARKS:
				return gmlMarks != null && !gmlMarks.isEmpty();
			case InfGMLSupportPackage.GML_GRAPHIC__GML_POINT_SYMBOLS:
				return gmlPointSymbols != null && !gmlPointSymbols.isEmpty();
			case InfGMLSupportPackage.GML_GRAPHIC__ROTATION:
				return isSetRotation();
			case InfGMLSupportPackage.GML_GRAPHIC__SIZE:
				return isSetSize();
			case InfGMLSupportPackage.GML_GRAPHIC__SYMBOL_ID:
				return isSetSymbolID();
			case InfGMLSupportPackage.GML_GRAPHIC__MIN_SIZE:
				return isSetMinSize();
			case InfGMLSupportPackage.GML_GRAPHIC__OPACITY:
				return isSetOpacity();
			case InfGMLSupportPackage.GML_GRAPHIC__XSCALE:
				return isSetXScale();
			case InfGMLSupportPackage.GML_GRAPHIC__YSCALE:
				return isSetYScale();
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
		result.append(" (rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(", symbolID: ");
		if (symbolIDESet) result.append(symbolID); else result.append("<unset>");
		result.append(", minSize: ");
		if (minSizeESet) result.append(minSize); else result.append("<unset>");
		result.append(", opacity: ");
		if (opacityESet) result.append(opacity); else result.append("<unset>");
		result.append(", xScale: ");
		if (xScaleESet) result.append(xScale); else result.append("<unset>");
		result.append(", yScale: ");
		if (yScaleESet) result.append(yScale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlGraphic
