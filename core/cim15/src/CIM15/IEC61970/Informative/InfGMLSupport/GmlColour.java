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
 * A representation of the model object '<em><b>Gml Colour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getRed <em>Red</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen <em>Green</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue <em>Blue</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFills <em>Gml Fills</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlFonts <em>Gml Fonts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGmlStrokes <em>Gml Strokes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlColour extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final String RED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected String red = RED_EDEFAULT;

	/**
	 * This is true if the Red attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean redESet;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final String GREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected String green = GREEN_EDEFAULT;

	/**
	 * This is true if the Green attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean greenESet;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final String BLUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected String blue = BLUE_EDEFAULT;

	/**
	 * This is true if the Blue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blueESet;

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
	 * The cached value of the '{@link #getGmlFonts() <em>Gml Fonts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFonts()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFont> gmlFonts;

	/**
	 * The cached value of the '{@link #getGmlStrokes() <em>Gml Strokes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlStrokes()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlStroke> gmlStrokes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlColour() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_COLOUR;
	}

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #setRed(String)
	 * @generated
	 */
	public String getRed() {
		return red;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #getRed()
	 * @generated
	 */
	public void setRed(String newRed) {
		red = newRed;
		redESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRed()
	 * @see #getRed()
	 * @see #setRed(String)
	 * @generated
	 */
	public void unsetRed() {
		red = RED_EDEFAULT;
		redESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getRed <em>Red</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Red</em>' attribute is set.
	 * @see #unsetRed()
	 * @see #getRed()
	 * @see #setRed(String)
	 * @generated
	 */
	public boolean isSetRed() {
		return redESet;
	}

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #setGreen(String)
	 * @generated
	 */
	public String getGreen() {
		return green;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @generated
	 */
	public void setGreen(String newGreen) {
		green = newGreen;
		greenESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGreen()
	 * @see #getGreen()
	 * @see #setGreen(String)
	 * @generated
	 */
	public void unsetGreen() {
		green = GREEN_EDEFAULT;
		greenESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getGreen <em>Green</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Green</em>' attribute is set.
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @see #setGreen(String)
	 * @generated
	 */
	public boolean isSetGreen() {
		return greenESet;
	}

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #setBlue(String)
	 * @generated
	 */
	public String getBlue() {
		return blue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @generated
	 */
	public void setBlue(String newBlue) {
		blue = newBlue;
		blueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlue()
	 * @see #getBlue()
	 * @see #setBlue(String)
	 * @generated
	 */
	public void unsetBlue() {
		blue = BLUE_EDEFAULT;
		blueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour#getBlue <em>Blue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blue</em>' attribute is set.
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @see #setBlue(String)
	 * @generated
	 */
	public boolean isSetBlue() {
		return blueESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Fills</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fills</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlColour
	 * @generated
	 */
	public EList<GmlFill> getGmlFills() {
		if (gmlFills == null) {
			gmlFills = new BasicInternalEList<GmlFill>(GmlFill.class);
		}
		return gmlFills;
	}

	/**
	 * Returns the value of the '<em><b>Gml Fonts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Fonts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Fonts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont#getGmlColour
	 * @generated
	 */
	public EList<GmlFont> getGmlFonts() {
		if (gmlFonts == null) {
			gmlFonts = new BasicInternalEList<GmlFont>(GmlFont.class);
		}
		return gmlFonts;
	}

	/**
	 * Returns the value of the '<em><b>Gml Strokes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Strokes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Strokes</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlColour
	 * @generated
	 */
	public EList<GmlStroke> getGmlStrokes() {
		if (gmlStrokes == null) {
			gmlStrokes = new BasicInternalEList<GmlStroke>(GmlStroke.class);
		}
		return gmlStrokes;
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
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFills()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFonts()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlStrokes()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				return ((InternalEList<?>)getGmlFills()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				return ((InternalEList<?>)getGmlFonts()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				return ((InternalEList<?>)getGmlStrokes()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_COLOUR__RED:
				return getRed();
			case InfGMLSupportPackage.GML_COLOUR__GREEN:
				return getGreen();
			case InfGMLSupportPackage.GML_COLOUR__BLUE:
				return getBlue();
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				return getGmlFills();
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				return getGmlFonts();
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				return getGmlStrokes();
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
			case InfGMLSupportPackage.GML_COLOUR__RED:
				setRed((String)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GREEN:
				setGreen((String)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__BLUE:
				setBlue((String)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				getGmlFills().clear();
				getGmlFills().addAll((Collection<? extends GmlFill>)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				getGmlFonts().clear();
				getGmlFonts().addAll((Collection<? extends GmlFont>)newValue);
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				getGmlStrokes().clear();
				getGmlStrokes().addAll((Collection<? extends GmlStroke>)newValue);
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
			case InfGMLSupportPackage.GML_COLOUR__RED:
				unsetRed();
				return;
			case InfGMLSupportPackage.GML_COLOUR__GREEN:
				unsetGreen();
				return;
			case InfGMLSupportPackage.GML_COLOUR__BLUE:
				unsetBlue();
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				getGmlFills().clear();
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				getGmlFonts().clear();
				return;
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				getGmlStrokes().clear();
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
			case InfGMLSupportPackage.GML_COLOUR__RED:
				return isSetRed();
			case InfGMLSupportPackage.GML_COLOUR__GREEN:
				return isSetGreen();
			case InfGMLSupportPackage.GML_COLOUR__BLUE:
				return isSetBlue();
			case InfGMLSupportPackage.GML_COLOUR__GML_FILLS:
				return gmlFills != null && !gmlFills.isEmpty();
			case InfGMLSupportPackage.GML_COLOUR__GML_FONTS:
				return gmlFonts != null && !gmlFonts.isEmpty();
			case InfGMLSupportPackage.GML_COLOUR__GML_STROKES:
				return gmlStrokes != null && !gmlStrokes.isEmpty();
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
		result.append(" (red: ");
		if (redESet) result.append(red); else result.append("<unset>");
		result.append(", green: ");
		if (greenESet) result.append(green); else result.append("<unset>");
		result.append(", blue: ");
		if (blueESet) result.append(blue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlColour
