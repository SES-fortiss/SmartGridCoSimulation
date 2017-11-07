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
 * A representation of the model object '<em><b>Gml Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlGraphics <em>Gml Graphics</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName <em>Well Known Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlStrokes <em>Gml Strokes</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getGmlFIlls <em>Gml FIlls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlMark extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getGmlGraphics() <em>Gml Graphics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlGraphics()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlGraphic> gmlGraphics;

	/**
	 * The default value of the '{@link #getWellKnownName() <em>Well Known Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellKnownName()
	 * @generated
	 * @ordered
	 */
	protected static final String WELL_KNOWN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWellKnownName() <em>Well Known Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellKnownName()
	 * @generated
	 * @ordered
	 */
	protected String wellKnownName = WELL_KNOWN_NAME_EDEFAULT;

	/**
	 * This is true if the Well Known Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wellKnownNameESet;

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
	 * The cached value of the '{@link #getGmlFIlls() <em>Gml FIlls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFIlls()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFill> gmlFIlls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlMark() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_MARK;
	}

	/**
	 * Returns the value of the '<em><b>Gml Graphics</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Graphics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Graphics</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic#getGmlMarks
	 * @generated
	 */
	public EList<GmlGraphic> getGmlGraphics() {
		if (gmlGraphics == null) {
			gmlGraphics = new BasicInternalEList<GmlGraphic>(GmlGraphic.class);
		}
		return gmlGraphics;
	}

	/**
	 * Returns the value of the '<em><b>Well Known Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Well Known Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Well Known Name</em>' attribute.
	 * @see #isSetWellKnownName()
	 * @see #unsetWellKnownName()
	 * @see #setWellKnownName(String)
	 * @generated
	 */
	public String getWellKnownName() {
		return wellKnownName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName <em>Well Known Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Known Name</em>' attribute.
	 * @see #isSetWellKnownName()
	 * @see #unsetWellKnownName()
	 * @see #getWellKnownName()
	 * @generated
	 */
	public void setWellKnownName(String newWellKnownName) {
		wellKnownName = newWellKnownName;
		wellKnownNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName <em>Well Known Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWellKnownName()
	 * @see #getWellKnownName()
	 * @see #setWellKnownName(String)
	 * @generated
	 */
	public void unsetWellKnownName() {
		wellKnownName = WELL_KNOWN_NAME_EDEFAULT;
		wellKnownNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark#getWellKnownName <em>Well Known Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Well Known Name</em>' attribute is set.
	 * @see #unsetWellKnownName()
	 * @see #getWellKnownName()
	 * @see #setWellKnownName(String)
	 * @generated
	 */
	public boolean isSetWellKnownName() {
		return wellKnownNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Strokes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Strokes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Strokes</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke#getGmlMarks
	 * @generated
	 */
	public EList<GmlStroke> getGmlStrokes() {
		if (gmlStrokes == null) {
			gmlStrokes = new BasicInternalEList<GmlStroke>(GmlStroke.class);
		}
		return gmlStrokes;
	}

	/**
	 * Returns the value of the '<em><b>Gml FIlls</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks <em>Gml Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml FIlls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml FIlls</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill#getGmlMarks
	 * @generated
	 */
	public EList<GmlFill> getGmlFIlls() {
		if (gmlFIlls == null) {
			gmlFIlls = new BasicInternalEList<GmlFill>(GmlFill.class);
		}
		return gmlFIlls;
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlGraphics()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlStrokes()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFIlls()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				return ((InternalEList<?>)getGmlGraphics()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				return ((InternalEList<?>)getGmlStrokes()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				return ((InternalEList<?>)getGmlFIlls()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				return getGmlGraphics();
			case InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME:
				return getWellKnownName();
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				return getGmlStrokes();
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				return getGmlFIlls();
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				getGmlGraphics().clear();
				getGmlGraphics().addAll((Collection<? extends GmlGraphic>)newValue);
				return;
			case InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME:
				setWellKnownName((String)newValue);
				return;
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				getGmlStrokes().clear();
				getGmlStrokes().addAll((Collection<? extends GmlStroke>)newValue);
				return;
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				getGmlFIlls().clear();
				getGmlFIlls().addAll((Collection<? extends GmlFill>)newValue);
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				getGmlGraphics().clear();
				return;
			case InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME:
				unsetWellKnownName();
				return;
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				getGmlStrokes().clear();
				return;
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				getGmlFIlls().clear();
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
			case InfGMLSupportPackage.GML_MARK__GML_GRAPHICS:
				return gmlGraphics != null && !gmlGraphics.isEmpty();
			case InfGMLSupportPackage.GML_MARK__WELL_KNOWN_NAME:
				return isSetWellKnownName();
			case InfGMLSupportPackage.GML_MARK__GML_STROKES:
				return gmlStrokes != null && !gmlStrokes.isEmpty();
			case InfGMLSupportPackage.GML_MARK__GML_FILLS:
				return gmlFIlls != null && !gmlFIlls.isEmpty();
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
		result.append(" (wellKnownName: ");
		if (wellKnownNameESet) result.append(wellKnownName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlMark
