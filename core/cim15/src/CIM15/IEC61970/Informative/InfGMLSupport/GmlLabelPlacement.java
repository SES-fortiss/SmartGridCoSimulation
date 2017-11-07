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
 * A representation of the model object '<em><b>Gml Label Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation <em>Rotation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType <em>Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX <em>Anchor X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY <em>Anchor Y</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlLabelPlacement extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLACEMENT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected String displacementX = DISPLACEMENT_X_EDEFAULT;

	/**
	 * This is true if the Displacement X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementXESet;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected String rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * The default value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLACEMENT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected String displacementY = DISPLACEMENT_Y_EDEFAULT;

	/**
	 * This is true if the Displacement Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementYESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getAnchorX() <em>Anchor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorX()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchorX() <em>Anchor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorX()
	 * @generated
	 * @ordered
	 */
	protected String anchorX = ANCHOR_X_EDEFAULT;

	/**
	 * This is true if the Anchor X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anchorXESet;

	/**
	 * The default value of the '{@link #getAnchorY() <em>Anchor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorY()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchorY() <em>Anchor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorY()
	 * @generated
	 * @ordered
	 */
	protected String anchorY = ANCHOR_Y_EDEFAULT;

	/**
	 * This is true if the Anchor Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anchorYESet;

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
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlLabelPlacement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_LABEL_PLACEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #setDisplacementX(String)
	 * @generated
	 */
	public String getDisplacementX() {
		return displacementX;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @generated
	 */
	public void setDisplacementX(String newDisplacementX) {
		displacementX = newDisplacementX;
		displacementXESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(String)
	 * @generated
	 */
	public void unsetDisplacementX() {
		displacementX = DISPLACEMENT_X_EDEFAULT;
		displacementXESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementX <em>Displacement X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement X</em>' attribute is set.
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(String)
	 * @generated
	 */
	public boolean isSetDisplacementX() {
		return displacementXESet;
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
	 * @see #setRotation(String)
	 * @generated
	 */
	public String getRotation() {
		return rotation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @generated
	 */
	public void setRotation(String newRotation) {
		rotation = newRotation;
		rotationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(String)
	 * @generated
	 */
	public void unsetRotation() {
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getRotation <em>Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation</em>' attribute is set.
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @see #setRotation(String)
	 * @generated
	 */
	public boolean isSetRotation() {
		return rotationESet;
	}

	/**
	 * Returns the value of the '<em><b>Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #setDisplacementY(String)
	 * @generated
	 */
	public String getDisplacementY() {
		return displacementY;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @generated
	 */
	public void setDisplacementY(String newDisplacementY) {
		displacementY = newDisplacementY;
		displacementYESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(String)
	 * @generated
	 */
	public void unsetDisplacementY() {
		displacementY = DISPLACEMENT_Y_EDEFAULT;
		displacementYESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getDisplacementY <em>Displacement Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement Y</em>' attribute is set.
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(String)
	 * @generated
	 */
	public boolean isSetDisplacementY() {
		return displacementYESet;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(String newType) {
		type = newType;
		typeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public void unsetType() {
		type = TYPE_EDEFAULT;
		typeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * Returns the value of the '<em><b>Anchor X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor X</em>' attribute.
	 * @see #isSetAnchorX()
	 * @see #unsetAnchorX()
	 * @see #setAnchorX(String)
	 * @generated
	 */
	public String getAnchorX() {
		return anchorX;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX <em>Anchor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor X</em>' attribute.
	 * @see #isSetAnchorX()
	 * @see #unsetAnchorX()
	 * @see #getAnchorX()
	 * @generated
	 */
	public void setAnchorX(String newAnchorX) {
		anchorX = newAnchorX;
		anchorXESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX <em>Anchor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorX()
	 * @see #getAnchorX()
	 * @see #setAnchorX(String)
	 * @generated
	 */
	public void unsetAnchorX() {
		anchorX = ANCHOR_X_EDEFAULT;
		anchorXESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorX <em>Anchor X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchor X</em>' attribute is set.
	 * @see #unsetAnchorX()
	 * @see #getAnchorX()
	 * @see #setAnchorX(String)
	 * @generated
	 */
	public boolean isSetAnchorX() {
		return anchorXESet;
	}

	/**
	 * Returns the value of the '<em><b>Anchor Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Y</em>' attribute.
	 * @see #isSetAnchorY()
	 * @see #unsetAnchorY()
	 * @see #setAnchorY(String)
	 * @generated
	 */
	public String getAnchorY() {
		return anchorY;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY <em>Anchor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Y</em>' attribute.
	 * @see #isSetAnchorY()
	 * @see #unsetAnchorY()
	 * @see #getAnchorY()
	 * @generated
	 */
	public void setAnchorY(String newAnchorY) {
		anchorY = newAnchorY;
		anchorYESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY <em>Anchor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorY()
	 * @see #getAnchorY()
	 * @see #setAnchorY(String)
	 * @generated
	 */
	public void unsetAnchorY() {
		anchorY = ANCHOR_Y_EDEFAULT;
		anchorYESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getAnchorY <em>Anchor Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchor Y</em>' attribute is set.
	 * @see #unsetAnchorY()
	 * @see #getAnchorY()
	 * @see #setAnchorY(String)
	 * @generated
	 */
	public boolean isSetAnchorY() {
		return anchorYESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement <em>Gml Label Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Text Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Text Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlLabelPlacement
	 * @generated
	 */
	public EList<GmlTextSymbol> getGmlTextSymbols() {
		if (gmlTextSymbols == null) {
			gmlTextSymbols = new BasicInternalEList<GmlTextSymbol>(GmlTextSymbol.class);
		}
		return gmlTextSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(String)
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	public void setOffset(String newOffset) {
		offset = newOffset;
		offsetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(String)
	 * @generated
	 */
	public void unsetOffset() {
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(String)
	 * @generated
	 */
	public boolean isSetOffset() {
		return offsetESet;
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTextSymbols()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				return ((InternalEList<?>)getGmlTextSymbols()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X:
				return getDisplacementX();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION:
				return getRotation();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y:
				return getDisplacementY();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE:
				return getType();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X:
				return getAnchorX();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y:
				return getAnchorY();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				return getGmlTextSymbols();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET:
				return getOffset();
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X:
				setDisplacementX((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION:
				setRotation((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y:
				setDisplacementY((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE:
				setType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X:
				setAnchorX((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y:
				setAnchorY((String)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				getGmlTextSymbols().addAll((Collection<? extends GmlTextSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET:
				setOffset((String)newValue);
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X:
				unsetDisplacementX();
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION:
				unsetRotation();
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y:
				unsetDisplacementY();
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE:
				unsetType();
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X:
				unsetAnchorX();
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y:
				unsetAnchorY();
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET:
				unsetOffset();
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
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_X:
				return isSetDisplacementX();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ROTATION:
				return isSetRotation();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__DISPLACEMENT_Y:
				return isSetDisplacementY();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__TYPE:
				return isSetType();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_X:
				return isSetAnchorX();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__ANCHOR_Y:
				return isSetAnchorY();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__GML_TEXT_SYMBOLS:
				return gmlTextSymbols != null && !gmlTextSymbols.isEmpty();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT__OFFSET:
				return isSetOffset();
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
		result.append(" (displacementX: ");
		if (displacementXESet) result.append(displacementX); else result.append("<unset>");
		result.append(", rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", displacementY: ");
		if (displacementYESet) result.append(displacementY); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", anchorX: ");
		if (anchorXESet) result.append(anchorX); else result.append("<unset>");
		result.append(", anchorY: ");
		if (anchorYESet) result.append(anchorY); else result.append("<unset>");
		result.append(", offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlLabelPlacement
