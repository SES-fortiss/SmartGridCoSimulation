/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport.util;

import CIM15.Element;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.PositionPoint;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfGMLSupport.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage
 * @generated
 */
public class InfGMLSupportSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfGMLSupportPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfGMLSupportSwitch() {
		if (modelPackage == null) {
			modelPackage = InfGMLSupportPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InfGMLSupportPackage.GML_FEATURE_TYPE: {
				GmlFeatureType gmlFeatureType = (GmlFeatureType)theEObject;
				T result = caseGmlFeatureType(gmlFeatureType);
				if (result == null) result = caseIdentifiedObject(gmlFeatureType);
				if (result == null) result = caseElement(gmlFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = caseDiagram(map);
				if (result == null) result = caseDocument(map);
				if (result == null) result = caseIdentifiedObject(map);
				if (result == null) result = caseElement(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_POINT_GEOMETRY: {
				GmlPointGeometry gmlPointGeometry = (GmlPointGeometry)theEObject;
				T result = caseGmlPointGeometry(gmlPointGeometry);
				if (result == null) result = caseGmlDiagramObject(gmlPointGeometry);
				if (result == null) result = caseIdentifiedObject(gmlPointGeometry);
				if (result == null) result = caseElement(gmlPointGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_HALO: {
				GmlHalo gmlHalo = (GmlHalo)theEObject;
				T result = caseGmlHalo(gmlHalo);
				if (result == null) result = caseIdentifiedObject(gmlHalo);
				if (result == null) result = caseElement(gmlHalo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_COLOUR: {
				GmlColour gmlColour = (GmlColour)theEObject;
				T result = caseGmlColour(gmlColour);
				if (result == null) result = caseIdentifiedObject(gmlColour);
				if (result == null) result = caseElement(gmlColour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_FONT: {
				GmlFont gmlFont = (GmlFont)theEObject;
				T result = caseGmlFont(gmlFont);
				if (result == null) result = caseIdentifiedObject(gmlFont);
				if (result == null) result = caseElement(gmlFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL: {
				GmlPolygonSymbol gmlPolygonSymbol = (GmlPolygonSymbol)theEObject;
				T result = caseGmlPolygonSymbol(gmlPolygonSymbol);
				if (result == null) result = caseGmlSymbol(gmlPolygonSymbol);
				if (result == null) result = caseIdentifiedObject(gmlPolygonSymbol);
				if (result == null) result = caseElement(gmlPolygonSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_STROKE: {
				GmlStroke gmlStroke = (GmlStroke)theEObject;
				T result = caseGmlStroke(gmlStroke);
				if (result == null) result = caseIdentifiedObject(gmlStroke);
				if (result == null) result = caseElement(gmlStroke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_BASE_SYMBOL: {
				GmlBaseSymbol gmlBaseSymbol = (GmlBaseSymbol)theEObject;
				T result = caseGmlBaseSymbol(gmlBaseSymbol);
				if (result == null) result = caseIdentifiedObject(gmlBaseSymbol);
				if (result == null) result = caseElement(gmlBaseSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_POSITION: {
				GmlPosition gmlPosition = (GmlPosition)theEObject;
				T result = caseGmlPosition(gmlPosition);
				if (result == null) result = casePositionPoint(gmlPosition);
				if (result == null) result = caseElement(gmlPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_TEXT_SYMBOL: {
				GmlTextSymbol gmlTextSymbol = (GmlTextSymbol)theEObject;
				T result = caseGmlTextSymbol(gmlTextSymbol);
				if (result == null) result = caseGmlSymbol(gmlTextSymbol);
				if (result == null) result = caseIdentifiedObject(gmlTextSymbol);
				if (result == null) result = caseElement(gmlTextSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_POLYGON_GEOMETRY: {
				GmlPolygonGeometry gmlPolygonGeometry = (GmlPolygonGeometry)theEObject;
				T result = caseGmlPolygonGeometry(gmlPolygonGeometry);
				if (result == null) result = caseGmlDiagramObject(gmlPolygonGeometry);
				if (result == null) result = caseIdentifiedObject(gmlPolygonGeometry);
				if (result == null) result = caseElement(gmlPolygonGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_OBSERVATION: {
				GmlObservation gmlObservation = (GmlObservation)theEObject;
				T result = caseGmlObservation(gmlObservation);
				if (result == null) result = caseElement(gmlObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_MARK: {
				GmlMark gmlMark = (GmlMark)theEObject;
				T result = caseGmlMark(gmlMark);
				if (result == null) result = caseIdentifiedObject(gmlMark);
				if (result == null) result = caseElement(gmlMark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_GRAPHIC: {
				GmlGraphic gmlGraphic = (GmlGraphic)theEObject;
				T result = caseGmlGraphic(gmlGraphic);
				if (result == null) result = caseIdentifiedObject(gmlGraphic);
				if (result == null) result = caseElement(gmlGraphic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT: {
				GmlLabelPlacement gmlLabelPlacement = (GmlLabelPlacement)theEObject;
				T result = caseGmlLabelPlacement(gmlLabelPlacement);
				if (result == null) result = caseIdentifiedObject(gmlLabelPlacement);
				if (result == null) result = caseElement(gmlLabelPlacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE: {
				GmlGeometryStyle gmlGeometryStyle = (GmlGeometryStyle)theEObject;
				T result = caseGmlGeometryStyle(gmlGeometryStyle);
				if (result == null) result = caseIdentifiedObject(gmlGeometryStyle);
				if (result == null) result = caseElement(gmlGeometryStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_LINE_GEOMETRY: {
				GmlLineGeometry gmlLineGeometry = (GmlLineGeometry)theEObject;
				T result = caseGmlLineGeometry(gmlLineGeometry);
				if (result == null) result = caseGmlDiagramObject(gmlLineGeometry);
				if (result == null) result = caseIdentifiedObject(gmlLineGeometry);
				if (result == null) result = caseElement(gmlLineGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_VALUE: {
				GmlValue gmlValue = (GmlValue)theEObject;
				T result = caseGmlValue(gmlValue);
				if (result == null) result = caseIdentifiedObject(gmlValue);
				if (result == null) result = caseElement(gmlValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_LINE_SYMBOL: {
				GmlLineSymbol gmlLineSymbol = (GmlLineSymbol)theEObject;
				T result = caseGmlLineSymbol(gmlLineSymbol);
				if (result == null) result = caseGmlSymbol(gmlLineSymbol);
				if (result == null) result = caseIdentifiedObject(gmlLineSymbol);
				if (result == null) result = caseElement(gmlLineSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT: {
				GmlDiagramObject gmlDiagramObject = (GmlDiagramObject)theEObject;
				T result = caseGmlDiagramObject(gmlDiagramObject);
				if (result == null) result = caseIdentifiedObject(gmlDiagramObject);
				if (result == null) result = caseElement(gmlDiagramObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_POINT_SYMBOL: {
				GmlPointSymbol gmlPointSymbol = (GmlPointSymbol)theEObject;
				T result = caseGmlPointSymbol(gmlPointSymbol);
				if (result == null) result = caseGmlSymbol(gmlPointSymbol);
				if (result == null) result = caseIdentifiedObject(gmlPointSymbol);
				if (result == null) result = caseElement(gmlPointSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE: {
				GmlTopologyStyle gmlTopologyStyle = (GmlTopologyStyle)theEObject;
				T result = caseGmlTopologyStyle(gmlTopologyStyle);
				if (result == null) result = caseIdentifiedObject(gmlTopologyStyle);
				if (result == null) result = caseElement(gmlTopologyStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_SELECTOR: {
				GmlSelector gmlSelector = (GmlSelector)theEObject;
				T result = caseGmlSelector(gmlSelector);
				if (result == null) result = caseIdentifiedObject(gmlSelector);
				if (result == null) result = caseElement(gmlSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_SVG_PARAMETER: {
				GmlSvgParameter gmlSvgParameter = (GmlSvgParameter)theEObject;
				T result = caseGmlSvgParameter(gmlSvgParameter);
				if (result == null) result = caseIdentifiedObject(gmlSvgParameter);
				if (result == null) result = caseElement(gmlSvgParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_LABEL_STYLE: {
				GmlLabelStyle gmlLabelStyle = (GmlLabelStyle)theEObject;
				T result = caseGmlLabelStyle(gmlLabelStyle);
				if (result == null) result = caseIdentifiedObject(gmlLabelStyle);
				if (result == null) result = caseElement(gmlLabelStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_FILL: {
				GmlFill gmlFill = (GmlFill)theEObject;
				T result = caseGmlFill(gmlFill);
				if (result == null) result = caseIdentifiedObject(gmlFill);
				if (result == null) result = caseElement(gmlFill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = caseDocument(diagram);
				if (result == null) result = caseIdentifiedObject(diagram);
				if (result == null) result = caseElement(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_SYMBOL: {
				GmlSymbol gmlSymbol = (GmlSymbol)theEObject;
				T result = caseGmlSymbol(gmlSymbol);
				if (result == null) result = caseIdentifiedObject(gmlSymbol);
				if (result == null) result = caseElement(gmlSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_FEATURE_STYLE: {
				GmlFeatureStyle gmlFeatureStyle = (GmlFeatureStyle)theEObject;
				T result = caseGmlFeatureStyle(gmlFeatureStyle);
				if (result == null) result = caseIdentifiedObject(gmlFeatureStyle);
				if (result == null) result = caseElement(gmlFeatureStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfGMLSupportPackage.GML_RASTER_SYMBOL: {
				GmlRasterSymbol gmlRasterSymbol = (GmlRasterSymbol)theEObject;
				T result = caseGmlRasterSymbol(gmlRasterSymbol);
				if (result == null) result = caseGmlSymbol(gmlRasterSymbol);
				if (result == null) result = caseIdentifiedObject(gmlRasterSymbol);
				if (result == null) result = caseElement(gmlRasterSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlFeatureType(GmlFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Point Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Point Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlPointGeometry(GmlPointGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Halo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Halo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlHalo(GmlHalo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Colour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Colour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlColour(GmlColour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlFont(GmlFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Polygon Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Polygon Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlPolygonSymbol(GmlPolygonSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Stroke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Stroke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlStroke(GmlStroke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Base Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Base Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlBaseSymbol(GmlBaseSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlPosition(GmlPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Text Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Text Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlTextSymbol(GmlTextSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Polygon Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Polygon Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlPolygonGeometry(GmlPolygonGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlObservation(GmlObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Mark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Mark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlMark(GmlMark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Graphic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Graphic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlGraphic(GmlGraphic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Label Placement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Label Placement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlLabelPlacement(GmlLabelPlacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Geometry Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Geometry Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlGeometryStyle(GmlGeometryStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Line Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Line Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlLineGeometry(GmlLineGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlValue(GmlValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Line Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Line Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlLineSymbol(GmlLineSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Diagram Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Diagram Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlDiagramObject(GmlDiagramObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Point Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Point Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlPointSymbol(GmlPointSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Topology Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Topology Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlTopologyStyle(GmlTopologyStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlSelector(GmlSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Svg Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Svg Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlSvgParameter(GmlSvgParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Label Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlLabelStyle(GmlLabelStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Fill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Fill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlFill(GmlFill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlSymbol(GmlSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Feature Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Feature Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlFeatureStyle(GmlFeatureStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gml Raster Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Raster Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlRasterSymbol(GmlRasterSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionPoint(PositionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InfGMLSupportSwitch
