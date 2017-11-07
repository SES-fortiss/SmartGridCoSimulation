/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Raster Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename <em>Gray Sourcename</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName <em>Green Source Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor <em>Relief Factor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename <em>Red Sourcename</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour <em>Overlapbehaviour</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly <em>Brighness Only</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename <em>Blue Sourcename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlRasterSymbol extends GmlSymbol {
	/**
	 * The default value of the '{@link #getGraySourcename() <em>Gray Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraySourcename()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAY_SOURCENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraySourcename() <em>Gray Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraySourcename()
	 * @generated
	 * @ordered
	 */
	protected String graySourcename = GRAY_SOURCENAME_EDEFAULT;

	/**
	 * This is true if the Gray Sourcename attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean graySourcenameESet;

	/**
	 * The default value of the '{@link #getGreenSourceName() <em>Green Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String GREEN_SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreenSourceName() <em>Green Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenSourceName()
	 * @generated
	 * @ordered
	 */
	protected String greenSourceName = GREEN_SOURCE_NAME_EDEFAULT;

	/**
	 * This is true if the Green Source Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean greenSourceNameESet;

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
	 * The default value of the '{@link #getReliefFactor() <em>Relief Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliefFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String RELIEF_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReliefFactor() <em>Relief Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliefFactor()
	 * @generated
	 * @ordered
	 */
	protected String reliefFactor = RELIEF_FACTOR_EDEFAULT;

	/**
	 * This is true if the Relief Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reliefFactorESet;

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
	 * The default value of the '{@link #getRedSourcename() <em>Red Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedSourcename()
	 * @generated
	 * @ordered
	 */
	protected static final String RED_SOURCENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedSourcename() <em>Red Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedSourcename()
	 * @generated
	 * @ordered
	 */
	protected String redSourcename = RED_SOURCENAME_EDEFAULT;

	/**
	 * This is true if the Red Sourcename attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean redSourcenameESet;

	/**
	 * The default value of the '{@link #getOverlapbehaviour() <em>Overlapbehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapbehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERLAPBEHAVIOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverlapbehaviour() <em>Overlapbehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlapbehaviour()
	 * @generated
	 * @ordered
	 */
	protected String overlapbehaviour = OVERLAPBEHAVIOUR_EDEFAULT;

	/**
	 * This is true if the Overlapbehaviour attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overlapbehaviourESet;

	/**
	 * The default value of the '{@link #isBrighnessOnly() <em>Brighness Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBrighnessOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRIGHNESS_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBrighnessOnly() <em>Brighness Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBrighnessOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean brighnessOnly = BRIGHNESS_ONLY_EDEFAULT;

	/**
	 * This is true if the Brighness Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean brighnessOnlyESet;

	/**
	 * The default value of the '{@link #getBlueSourcename() <em>Blue Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueSourcename()
	 * @generated
	 * @ordered
	 */
	protected static final String BLUE_SOURCENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlueSourcename() <em>Blue Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueSourcename()
	 * @generated
	 * @ordered
	 */
	protected String blueSourcename = BLUE_SOURCENAME_EDEFAULT;

	/**
	 * This is true if the Blue Sourcename attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blueSourcenameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlRasterSymbol() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_RASTER_SYMBOL;
	}

	/**
	 * Returns the value of the '<em><b>Gray Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gray Sourcename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gray Sourcename</em>' attribute.
	 * @see #isSetGraySourcename()
	 * @see #unsetGraySourcename()
	 * @see #setGraySourcename(String)
	 * @generated
	 */
	public String getGraySourcename() {
		return graySourcename;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename <em>Gray Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gray Sourcename</em>' attribute.
	 * @see #isSetGraySourcename()
	 * @see #unsetGraySourcename()
	 * @see #getGraySourcename()
	 * @generated
	 */
	public void setGraySourcename(String newGraySourcename) {
		graySourcename = newGraySourcename;
		graySourcenameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename <em>Gray Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraySourcename()
	 * @see #getGraySourcename()
	 * @see #setGraySourcename(String)
	 * @generated
	 */
	public void unsetGraySourcename() {
		graySourcename = GRAY_SOURCENAME_EDEFAULT;
		graySourcenameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGraySourcename <em>Gray Sourcename</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gray Sourcename</em>' attribute is set.
	 * @see #unsetGraySourcename()
	 * @see #getGraySourcename()
	 * @see #setGraySourcename(String)
	 * @generated
	 */
	public boolean isSetGraySourcename() {
		return graySourcenameESet;
	}

	/**
	 * Returns the value of the '<em><b>Green Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green Source Name</em>' attribute.
	 * @see #isSetGreenSourceName()
	 * @see #unsetGreenSourceName()
	 * @see #setGreenSourceName(String)
	 * @generated
	 */
	public String getGreenSourceName() {
		return greenSourceName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName <em>Green Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green Source Name</em>' attribute.
	 * @see #isSetGreenSourceName()
	 * @see #unsetGreenSourceName()
	 * @see #getGreenSourceName()
	 * @generated
	 */
	public void setGreenSourceName(String newGreenSourceName) {
		greenSourceName = newGreenSourceName;
		greenSourceNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName <em>Green Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGreenSourceName()
	 * @see #getGreenSourceName()
	 * @see #setGreenSourceName(String)
	 * @generated
	 */
	public void unsetGreenSourceName() {
		greenSourceName = GREEN_SOURCE_NAME_EDEFAULT;
		greenSourceNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGreenSourceName <em>Green Source Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Green Source Name</em>' attribute is set.
	 * @see #unsetGreenSourceName()
	 * @see #getGreenSourceName()
	 * @see #setGreenSourceName(String)
	 * @generated
	 */
	public boolean isSetGreenSourceName() {
		return greenSourceNameESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity <em>Opacity</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity <em>Opacity</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOpacity <em>Opacity</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Relief Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relief Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relief Factor</em>' attribute.
	 * @see #isSetReliefFactor()
	 * @see #unsetReliefFactor()
	 * @see #setReliefFactor(String)
	 * @generated
	 */
	public String getReliefFactor() {
		return reliefFactor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor <em>Relief Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relief Factor</em>' attribute.
	 * @see #isSetReliefFactor()
	 * @see #unsetReliefFactor()
	 * @see #getReliefFactor()
	 * @generated
	 */
	public void setReliefFactor(String newReliefFactor) {
		reliefFactor = newReliefFactor;
		reliefFactorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor <em>Relief Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReliefFactor()
	 * @see #getReliefFactor()
	 * @see #setReliefFactor(String)
	 * @generated
	 */
	public void unsetReliefFactor() {
		reliefFactor = RELIEF_FACTOR_EDEFAULT;
		reliefFactorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getReliefFactor <em>Relief Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relief Factor</em>' attribute is set.
	 * @see #unsetReliefFactor()
	 * @see #getReliefFactor()
	 * @see #setReliefFactor(String)
	 * @generated
	 */
	public boolean isSetReliefFactor() {
		return reliefFactorESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Diagram Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols <em>Gml Raster Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Object</em>' reference.
	 * @see #setGmlDiagramObject(GmlDiagramObject)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}' reference.
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
				msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS, GmlDiagramObject.class, msgs);
			if (newGmlDiagramObject != null)
				msgs = ((InternalEObject)newGmlDiagramObject).eInverseAdd(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS, GmlDiagramObject.class, msgs);
			msgs = basicSetGmlDiagramObject(newGmlDiagramObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Red Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red Sourcename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Sourcename</em>' attribute.
	 * @see #isSetRedSourcename()
	 * @see #unsetRedSourcename()
	 * @see #setRedSourcename(String)
	 * @generated
	 */
	public String getRedSourcename() {
		return redSourcename;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename <em>Red Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Sourcename</em>' attribute.
	 * @see #isSetRedSourcename()
	 * @see #unsetRedSourcename()
	 * @see #getRedSourcename()
	 * @generated
	 */
	public void setRedSourcename(String newRedSourcename) {
		redSourcename = newRedSourcename;
		redSourcenameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename <em>Red Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRedSourcename()
	 * @see #getRedSourcename()
	 * @see #setRedSourcename(String)
	 * @generated
	 */
	public void unsetRedSourcename() {
		redSourcename = RED_SOURCENAME_EDEFAULT;
		redSourcenameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getRedSourcename <em>Red Sourcename</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Red Sourcename</em>' attribute is set.
	 * @see #unsetRedSourcename()
	 * @see #getRedSourcename()
	 * @see #setRedSourcename(String)
	 * @generated
	 */
	public boolean isSetRedSourcename() {
		return redSourcenameESet;
	}

	/**
	 * Returns the value of the '<em><b>Overlapbehaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlapbehaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlapbehaviour</em>' attribute.
	 * @see #isSetOverlapbehaviour()
	 * @see #unsetOverlapbehaviour()
	 * @see #setOverlapbehaviour(String)
	 * @generated
	 */
	public String getOverlapbehaviour() {
		return overlapbehaviour;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour <em>Overlapbehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlapbehaviour</em>' attribute.
	 * @see #isSetOverlapbehaviour()
	 * @see #unsetOverlapbehaviour()
	 * @see #getOverlapbehaviour()
	 * @generated
	 */
	public void setOverlapbehaviour(String newOverlapbehaviour) {
		overlapbehaviour = newOverlapbehaviour;
		overlapbehaviourESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour <em>Overlapbehaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverlapbehaviour()
	 * @see #getOverlapbehaviour()
	 * @see #setOverlapbehaviour(String)
	 * @generated
	 */
	public void unsetOverlapbehaviour() {
		overlapbehaviour = OVERLAPBEHAVIOUR_EDEFAULT;
		overlapbehaviourESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getOverlapbehaviour <em>Overlapbehaviour</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overlapbehaviour</em>' attribute is set.
	 * @see #unsetOverlapbehaviour()
	 * @see #getOverlapbehaviour()
	 * @see #setOverlapbehaviour(String)
	 * @generated
	 */
	public boolean isSetOverlapbehaviour() {
		return overlapbehaviourESet;
	}

	/**
	 * Returns the value of the '<em><b>Brighness Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brighness Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brighness Only</em>' attribute.
	 * @see #isSetBrighnessOnly()
	 * @see #unsetBrighnessOnly()
	 * @see #setBrighnessOnly(boolean)
	 * @generated
	 */
	public boolean isBrighnessOnly() {
		return brighnessOnly;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly <em>Brighness Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brighness Only</em>' attribute.
	 * @see #isSetBrighnessOnly()
	 * @see #unsetBrighnessOnly()
	 * @see #isBrighnessOnly()
	 * @generated
	 */
	public void setBrighnessOnly(boolean newBrighnessOnly) {
		brighnessOnly = newBrighnessOnly;
		brighnessOnlyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly <em>Brighness Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBrighnessOnly()
	 * @see #isBrighnessOnly()
	 * @see #setBrighnessOnly(boolean)
	 * @generated
	 */
	public void unsetBrighnessOnly() {
		brighnessOnly = BRIGHNESS_ONLY_EDEFAULT;
		brighnessOnlyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#isBrighnessOnly <em>Brighness Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Brighness Only</em>' attribute is set.
	 * @see #unsetBrighnessOnly()
	 * @see #isBrighnessOnly()
	 * @see #setBrighnessOnly(boolean)
	 * @generated
	 */
	public boolean isSetBrighnessOnly() {
		return brighnessOnlyESet;
	}

	/**
	 * Returns the value of the '<em><b>Blue Sourcename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue Sourcename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue Sourcename</em>' attribute.
	 * @see #isSetBlueSourcename()
	 * @see #unsetBlueSourcename()
	 * @see #setBlueSourcename(String)
	 * @generated
	 */
	public String getBlueSourcename() {
		return blueSourcename;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename <em>Blue Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue Sourcename</em>' attribute.
	 * @see #isSetBlueSourcename()
	 * @see #unsetBlueSourcename()
	 * @see #getBlueSourcename()
	 * @generated
	 */
	public void setBlueSourcename(String newBlueSourcename) {
		blueSourcename = newBlueSourcename;
		blueSourcenameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename <em>Blue Sourcename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlueSourcename()
	 * @see #getBlueSourcename()
	 * @see #setBlueSourcename(String)
	 * @generated
	 */
	public void unsetBlueSourcename() {
		blueSourcename = BLUE_SOURCENAME_EDEFAULT;
		blueSourcenameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getBlueSourcename <em>Blue Sourcename</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blue Sourcename</em>' attribute is set.
	 * @see #unsetBlueSourcename()
	 * @see #getBlueSourcename()
	 * @see #setBlueSourcename(String)
	 * @generated
	 */
	public boolean isSetBlueSourcename() {
		return blueSourcenameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				if (gmlDiagramObject != null)
					msgs = ((InternalEObject)gmlDiagramObject).eInverseRemove(this, InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS, GmlDiagramObject.class, msgs);
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME:
				return getGraySourcename();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME:
				return getGreenSourceName();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY:
				return getOpacity();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR:
				return getReliefFactor();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				if (resolve) return getGmlDiagramObject();
				return basicGetGmlDiagramObject();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME:
				return getRedSourcename();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR:
				return getOverlapbehaviour();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY:
				return isBrighnessOnly();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME:
				return getBlueSourcename();
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME:
				setGraySourcename((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME:
				setGreenSourceName((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY:
				setOpacity((Float)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR:
				setReliefFactor((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME:
				setRedSourcename((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR:
				setOverlapbehaviour((String)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY:
				setBrighnessOnly((Boolean)newValue);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME:
				setBlueSourcename((String)newValue);
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME:
				unsetGraySourcename();
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME:
				unsetGreenSourceName();
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY:
				unsetOpacity();
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR:
				unsetReliefFactor();
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				setGmlDiagramObject((GmlDiagramObject)null);
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME:
				unsetRedSourcename();
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR:
				unsetOverlapbehaviour();
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY:
				unsetBrighnessOnly();
				return;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME:
				unsetBlueSourcename();
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
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GRAY_SOURCENAME:
				return isSetGraySourcename();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GREEN_SOURCE_NAME:
				return isSetGreenSourceName();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OPACITY:
				return isSetOpacity();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RELIEF_FACTOR:
				return isSetReliefFactor();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__GML_DIAGRAM_OBJECT:
				return gmlDiagramObject != null;
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__RED_SOURCENAME:
				return isSetRedSourcename();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__OVERLAPBEHAVIOUR:
				return isSetOverlapbehaviour();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BRIGHNESS_ONLY:
				return isSetBrighnessOnly();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL__BLUE_SOURCENAME:
				return isSetBlueSourcename();
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
		result.append(" (graySourcename: ");
		if (graySourcenameESet) result.append(graySourcename); else result.append("<unset>");
		result.append(", greenSourceName: ");
		if (greenSourceNameESet) result.append(greenSourceName); else result.append("<unset>");
		result.append(", opacity: ");
		if (opacityESet) result.append(opacity); else result.append("<unset>");
		result.append(", reliefFactor: ");
		if (reliefFactorESet) result.append(reliefFactor); else result.append("<unset>");
		result.append(", redSourcename: ");
		if (redSourcenameESet) result.append(redSourcename); else result.append("<unset>");
		result.append(", overlapbehaviour: ");
		if (overlapbehaviourESet) result.append(overlapbehaviour); else result.append("<unset>");
		result.append(", brighnessOnly: ");
		if (brighnessOnlyESet) result.append(brighnessOnly); else result.append("<unset>");
		result.append(", blueSourcename: ");
		if (blueSourcenameESet) result.append(blueSourcename); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlRasterSymbol
