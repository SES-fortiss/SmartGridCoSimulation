/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import CIM15.IEC61968.Common.CoordinateSystem;

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
 * A representation of the model object '<em><b>Gml Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlSelectors <em>Gml Selectors</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getCoordinateSystems <em>Coordinate Systems</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPointSymbols <em>Gml Point Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlLineSymbols <em>Gml Line Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlRasterSymbols <em>Gml Raster Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins <em>Gml Observatins</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlTextSymbols <em>Gml Text Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlPolygonSymbols <em>Gml Polygon Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlDiagramObject extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getGmlSelectors() <em>Gml Selectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSelector> gmlSelectors;

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
	 * The cached value of the '{@link #getCoordinateSystems() <em>Coordinate Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinateSystem> coordinateSystems;

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
	 * The cached value of the '{@link #getGmlLineSymbols() <em>Gml Line Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLineSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlLineSymbol> gmlLineSymbols;

	/**
	 * The cached value of the '{@link #getGmlRasterSymbols() <em>Gml Raster Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlRasterSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlRasterSymbol> gmlRasterSymbols;

	/**
	 * The cached value of the '{@link #getGmlObservatins() <em>Gml Observatins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlObservatins()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlObservation> gmlObservatins;

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
	 * The cached value of the '{@link #getGmlPolygonSymbols() <em>Gml Polygon Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlPolygonSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlPolygonSymbol> gmlPolygonSymbols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlDiagramObject() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_DIAGRAM_OBJECT;
	}

	/**
	 * Returns the value of the '<em><b>Gml Selectors</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Selectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Selectors</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector#getGmlDiagramObjects
	 * @generated
	 */
	public EList<GmlSelector> getGmlSelectors() {
		if (gmlSelectors == null) {
			gmlSelectors = new BasicInternalEList<GmlSelector>(GmlSelector.class);
		}
		return gmlSelectors;
	}

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getGmlDiagramObjects
	 * @generated
	 */
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new BasicInternalEList<Diagram>(Diagram.class);
		}
		return diagrams;
	}

	/**
	 * Returns the value of the '<em><b>Coordinate Systems</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.CoordinateSystem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Systems</em>' reference list.
	 * @see CIM15.IEC61968.Common.CoordinateSystem#getGmlDiagramObjects
	 * @generated
	 */
	public EList<CoordinateSystem> getCoordinateSystems() {
		if (coordinateSystems == null) {
			coordinateSystems = new BasicInternalEList<CoordinateSystem>(CoordinateSystem.class);
		}
		return coordinateSystems;
	}

	/**
	 * Returns the value of the '<em><b>Gml Point Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Point Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Point Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol#getGmlDiagramObject
	 * @generated
	 */
	public EList<GmlPointSymbol> getGmlPointSymbols() {
		if (gmlPointSymbols == null) {
			gmlPointSymbols = new BasicInternalEList<GmlPointSymbol>(GmlPointSymbol.class);
		}
		return gmlPointSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Gml Line Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Line Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Line Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol#getGmlDiagramObject
	 * @generated
	 */
	public EList<GmlLineSymbol> getGmlLineSymbols() {
		if (gmlLineSymbols == null) {
			gmlLineSymbols = new BasicInternalEList<GmlLineSymbol>(GmlLineSymbol.class);
		}
		return gmlLineSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Gml Raster Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Raster Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Raster Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol#getGmlDiagramObject
	 * @generated
	 */
	public EList<GmlRasterSymbol> getGmlRasterSymbols() {
		if (gmlRasterSymbols == null) {
			gmlRasterSymbols = new BasicInternalEList<GmlRasterSymbol>(GmlRasterSymbol.class);
		}
		return gmlRasterSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Gml Observatins</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects <em>Gml Diagram Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Observatins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Observatins</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects
	 * @generated
	 */
	public EList<GmlObservation> getGmlObservatins() {
		if (gmlObservatins == null) {
			gmlObservatins = new BasicInternalEList<GmlObservation>(GmlObservation.class);
		}
		return gmlObservatins;
	}

	/**
	 * Returns the value of the '<em><b>Gml Text Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Text Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Text Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol#getGmlDiagramObject
	 * @generated
	 */
	public EList<GmlTextSymbol> getGmlTextSymbols() {
		if (gmlTextSymbols == null) {
			gmlTextSymbols = new BasicInternalEList<GmlTextSymbol>(GmlTextSymbol.class);
		}
		return gmlTextSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Gml Polygon Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Polygon Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Polygon Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol#getGmlDiagramObject
	 * @generated
	 */
	public EList<GmlPolygonSymbol> getGmlPolygonSymbols() {
		if (gmlPolygonSymbols == null) {
			gmlPolygonSymbols = new BasicInternalEList<GmlPolygonSymbol>(GmlPolygonSymbol.class);
		}
		return gmlPolygonSymbols;
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSelectors()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagrams()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoordinateSystems()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPointSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlLineSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlRasterSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlObservatins()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTextSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlPolygonSymbols()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				return ((InternalEList<?>)getGmlSelectors()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				return ((InternalEList<?>)getCoordinateSystems()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				return ((InternalEList<?>)getGmlPointSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				return ((InternalEList<?>)getGmlLineSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				return ((InternalEList<?>)getGmlRasterSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				return ((InternalEList<?>)getGmlObservatins()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				return ((InternalEList<?>)getGmlTextSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				return ((InternalEList<?>)getGmlPolygonSymbols()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				return getGmlSelectors();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				return getDiagrams();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				return getCoordinateSystems();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				return getGmlPointSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				return getGmlLineSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				return getGmlRasterSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				return getGmlObservatins();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				return getGmlTextSymbols();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				return getGmlPolygonSymbols();
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				getGmlSelectors().clear();
				getGmlSelectors().addAll((Collection<? extends GmlSelector>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends Diagram>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				getCoordinateSystems().clear();
				getCoordinateSystems().addAll((Collection<? extends CoordinateSystem>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				getGmlPointSymbols().clear();
				getGmlPointSymbols().addAll((Collection<? extends GmlPointSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				getGmlLineSymbols().clear();
				getGmlLineSymbols().addAll((Collection<? extends GmlLineSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				getGmlRasterSymbols().clear();
				getGmlRasterSymbols().addAll((Collection<? extends GmlRasterSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				getGmlObservatins().clear();
				getGmlObservatins().addAll((Collection<? extends GmlObservation>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				getGmlTextSymbols().addAll((Collection<? extends GmlTextSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
				getGmlPolygonSymbols().addAll((Collection<? extends GmlPolygonSymbol>)newValue);
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				getGmlSelectors().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				getDiagrams().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				getCoordinateSystems().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				getGmlPointSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				getGmlLineSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				getGmlRasterSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				getGmlObservatins().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				getGmlTextSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				getGmlPolygonSymbols().clear();
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
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_SELECTORS:
				return gmlSelectors != null && !gmlSelectors.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__COORDINATE_SYSTEMS:
				return coordinateSystems != null && !coordinateSystems.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POINT_SYMBOLS:
				return gmlPointSymbols != null && !gmlPointSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_LINE_SYMBOLS:
				return gmlLineSymbols != null && !gmlLineSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_RASTER_SYMBOLS:
				return gmlRasterSymbols != null && !gmlRasterSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_OBSERVATINS:
				return gmlObservatins != null && !gmlObservatins.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_TEXT_SYMBOLS:
				return gmlTextSymbols != null && !gmlTextSymbols.isEmpty();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT__GML_POLYGON_SYMBOLS:
				return gmlPolygonSymbols != null && !gmlPolygonSymbols.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // GmlDiagramObject
