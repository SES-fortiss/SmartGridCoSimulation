/**
 */
package CIM15.IEC61968.Common;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfGMLSupport.Diagram;
import CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.CoordinateSystem#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.CoordinateSystem#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinateSystem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> diagrams;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The default value of the '{@link #getCrsUrn() <em>Crs Urn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrsUrn()
	 * @generated
	 * @ordered
	 */
	protected static final String CRS_URN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrsUrn() <em>Crs Urn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrsUrn()
	 * @generated
	 * @ordered
	 */
	protected String crsUrn = CRS_URN_EDEFAULT;

	/**
	 * This is true if the Crs Urn attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crsUrnESet;

	/**
	 * The cached value of the '{@link #getGmlDiagramObjects() <em>Gml Diagram Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlDiagramObject> gmlDiagramObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateSystem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.COORDINATE_SYSTEM;
	}

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getCoordinateSystem
	 * @generated
	 */
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new BasicInternalEList<Diagram>(Diagram.class);
		}
		return diagrams;
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getCoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference list.
	 * @see CIM15.IEC61968.Common.Location#getCoordinateSystem
	 * @generated
	 */
	public EList<Location> getLocation() {
		if (location == null) {
			location = new BasicInternalEList<Location>(Location.class);
		}
		return location;
	}

	/**
	 * Returns the value of the '<em><b>Crs Urn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crs Urn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crs Urn</em>' attribute.
	 * @see #isSetCrsUrn()
	 * @see #unsetCrsUrn()
	 * @see #setCrsUrn(String)
	 * @generated
	 */
	public String getCrsUrn() {
		return crsUrn;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crs Urn</em>' attribute.
	 * @see #isSetCrsUrn()
	 * @see #unsetCrsUrn()
	 * @see #getCrsUrn()
	 * @generated
	 */
	public void setCrsUrn(String newCrsUrn) {
		crsUrn = newCrsUrn;
		crsUrnESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrsUrn()
	 * @see #getCrsUrn()
	 * @see #setCrsUrn(String)
	 * @generated
	 */
	public void unsetCrsUrn() {
		crsUrn = CRS_URN_EDEFAULT;
		crsUrnESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crs Urn</em>' attribute is set.
	 * @see #unsetCrsUrn()
	 * @see #getCrsUrn()
	 * @see #setCrsUrn(String)
	 * @generated
	 */
	public boolean isSetCrsUrn() {
		return crsUrnESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems <em>Coordinate Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Objects</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems
	 * @generated
	 */
	public EList<GmlDiagramObject> getGmlDiagramObjects() {
		if (gmlDiagramObjects == null) {
			gmlDiagramObjects = new BasicInternalEList<GmlDiagramObject>(GmlDiagramObject.class);
		}
		return gmlDiagramObjects;
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
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagrams()).basicAdd(otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocation()).basicAdd(otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlDiagramObjects()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getGmlDiagramObjects()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				return getDiagrams();
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				return getLocation();
			case CommonPackage.COORDINATE_SYSTEM__CRS_URN:
				return getCrsUrn();
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				return getGmlDiagramObjects();
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
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends Diagram>)newValue);
				return;
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case CommonPackage.COORDINATE_SYSTEM__CRS_URN:
				setCrsUrn((String)newValue);
				return;
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				getGmlDiagramObjects().addAll((Collection<? extends GmlDiagramObject>)newValue);
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
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				getDiagrams().clear();
				return;
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				getLocation().clear();
				return;
			case CommonPackage.COORDINATE_SYSTEM__CRS_URN:
				unsetCrsUrn();
				return;
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
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
			case CommonPackage.COORDINATE_SYSTEM__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case CommonPackage.COORDINATE_SYSTEM__LOCATION:
				return location != null && !location.isEmpty();
			case CommonPackage.COORDINATE_SYSTEM__CRS_URN:
				return isSetCrsUrn();
			case CommonPackage.COORDINATE_SYSTEM__GML_DIAGRAM_OBJECTS:
				return gmlDiagramObjects != null && !gmlDiagramObjects.isEmpty();
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
		result.append(" (crsUrn: ");
		if (crsUrnESet) result.append(crsUrn); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CoordinateSystem
