/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfGMLSupportFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfGMLSupportFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfGMLSupportFactory INSTANCE = CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfGMLSupportFactory init() {
		try {
			InfGMLSupportFactory theInfGMLSupportFactory = (InfGMLSupportFactory)EPackage.Registry.INSTANCE.getEFactory(InfGMLSupportPackage.eNS_URI);
			if (theInfGMLSupportFactory != null) {
				return theInfGMLSupportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfGMLSupportFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfGMLSupportFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfGMLSupportPackage.GML_FEATURE_TYPE: return createGmlFeatureType();
			case InfGMLSupportPackage.MAP: return createMap();
			case InfGMLSupportPackage.GML_POINT_GEOMETRY: return createGmlPointGeometry();
			case InfGMLSupportPackage.GML_HALO: return createGmlHalo();
			case InfGMLSupportPackage.GML_COLOUR: return createGmlColour();
			case InfGMLSupportPackage.GML_FONT: return createGmlFont();
			case InfGMLSupportPackage.GML_POLYGON_SYMBOL: return createGmlPolygonSymbol();
			case InfGMLSupportPackage.GML_STROKE: return createGmlStroke();
			case InfGMLSupportPackage.GML_BASE_SYMBOL: return createGmlBaseSymbol();
			case InfGMLSupportPackage.GML_POSITION: return createGmlPosition();
			case InfGMLSupportPackage.GML_TEXT_SYMBOL: return createGmlTextSymbol();
			case InfGMLSupportPackage.GML_POLYGON_GEOMETRY: return createGmlPolygonGeometry();
			case InfGMLSupportPackage.GML_OBSERVATION: return createGmlObservation();
			case InfGMLSupportPackage.GML_MARK: return createGmlMark();
			case InfGMLSupportPackage.GML_GRAPHIC: return createGmlGraphic();
			case InfGMLSupportPackage.GML_LABEL_PLACEMENT: return createGmlLabelPlacement();
			case InfGMLSupportPackage.GML_GEOMETRY_STYLE: return createGmlGeometryStyle();
			case InfGMLSupportPackage.GML_LINE_GEOMETRY: return createGmlLineGeometry();
			case InfGMLSupportPackage.GML_VALUE: return createGmlValue();
			case InfGMLSupportPackage.GML_LINE_SYMBOL: return createGmlLineSymbol();
			case InfGMLSupportPackage.GML_DIAGRAM_OBJECT: return createGmlDiagramObject();
			case InfGMLSupportPackage.GML_POINT_SYMBOL: return createGmlPointSymbol();
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE: return createGmlTopologyStyle();
			case InfGMLSupportPackage.GML_SELECTOR: return createGmlSelector();
			case InfGMLSupportPackage.GML_SVG_PARAMETER: return createGmlSvgParameter();
			case InfGMLSupportPackage.GML_LABEL_STYLE: return createGmlLabelStyle();
			case InfGMLSupportPackage.GML_FILL: return createGmlFill();
			case InfGMLSupportPackage.DIAGRAM: return createDiagram();
			case InfGMLSupportPackage.GML_SYMBOL: return createGmlSymbol();
			case InfGMLSupportPackage.GML_FEATURE_STYLE: return createGmlFeatureStyle();
			case InfGMLSupportPackage.GML_RASTER_SYMBOL: return createGmlRasterSymbol();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfGMLSupportPackage.QUERY_GRAMMAR_KIND:
				return createQueryGrammarKindFromString(eDataType, initialValue);
			case InfGMLSupportPackage.DIAGRAM_KIND:
				return createDiagramKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfGMLSupportPackage.QUERY_GRAMMAR_KIND:
				return convertQueryGrammarKindToString(eDataType, instanceValue);
			case InfGMLSupportPackage.DIAGRAM_KIND:
				return convertDiagramKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFeatureType createGmlFeatureType() {
		GmlFeatureType gmlFeatureType = new GmlFeatureType();
		return gmlFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		Map map = new Map();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPointGeometry createGmlPointGeometry() {
		GmlPointGeometry gmlPointGeometry = new GmlPointGeometry();
		return gmlPointGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlHalo createGmlHalo() {
		GmlHalo gmlHalo = new GmlHalo();
		return gmlHalo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlColour createGmlColour() {
		GmlColour gmlColour = new GmlColour();
		return gmlColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFont createGmlFont() {
		GmlFont gmlFont = new GmlFont();
		return gmlFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPolygonSymbol createGmlPolygonSymbol() {
		GmlPolygonSymbol gmlPolygonSymbol = new GmlPolygonSymbol();
		return gmlPolygonSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlStroke createGmlStroke() {
		GmlStroke gmlStroke = new GmlStroke();
		return gmlStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlBaseSymbol createGmlBaseSymbol() {
		GmlBaseSymbol gmlBaseSymbol = new GmlBaseSymbol();
		return gmlBaseSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPosition createGmlPosition() {
		GmlPosition gmlPosition = new GmlPosition();
		return gmlPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlTextSymbol createGmlTextSymbol() {
		GmlTextSymbol gmlTextSymbol = new GmlTextSymbol();
		return gmlTextSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPolygonGeometry createGmlPolygonGeometry() {
		GmlPolygonGeometry gmlPolygonGeometry = new GmlPolygonGeometry();
		return gmlPolygonGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlObservation createGmlObservation() {
		GmlObservation gmlObservation = new GmlObservation();
		return gmlObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlMark createGmlMark() {
		GmlMark gmlMark = new GmlMark();
		return gmlMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlGraphic createGmlGraphic() {
		GmlGraphic gmlGraphic = new GmlGraphic();
		return gmlGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelPlacement createGmlLabelPlacement() {
		GmlLabelPlacement gmlLabelPlacement = new GmlLabelPlacement();
		return gmlLabelPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlGeometryStyle createGmlGeometryStyle() {
		GmlGeometryStyle gmlGeometryStyle = new GmlGeometryStyle();
		return gmlGeometryStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLineGeometry createGmlLineGeometry() {
		GmlLineGeometry gmlLineGeometry = new GmlLineGeometry();
		return gmlLineGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlValue createGmlValue() {
		GmlValue gmlValue = new GmlValue();
		return gmlValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLineSymbol createGmlLineSymbol() {
		GmlLineSymbol gmlLineSymbol = new GmlLineSymbol();
		return gmlLineSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlDiagramObject createGmlDiagramObject() {
		GmlDiagramObject gmlDiagramObject = new GmlDiagramObject();
		return gmlDiagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlPointSymbol createGmlPointSymbol() {
		GmlPointSymbol gmlPointSymbol = new GmlPointSymbol();
		return gmlPointSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlTopologyStyle createGmlTopologyStyle() {
		GmlTopologyStyle gmlTopologyStyle = new GmlTopologyStyle();
		return gmlTopologyStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlSelector createGmlSelector() {
		GmlSelector gmlSelector = new GmlSelector();
		return gmlSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlSvgParameter createGmlSvgParameter() {
		GmlSvgParameter gmlSvgParameter = new GmlSvgParameter();
		return gmlSvgParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelStyle createGmlLabelStyle() {
		GmlLabelStyle gmlLabelStyle = new GmlLabelStyle();
		return gmlLabelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFill createGmlFill() {
		GmlFill gmlFill = new GmlFill();
		return gmlFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		Diagram diagram = new Diagram();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlSymbol createGmlSymbol() {
		GmlSymbol gmlSymbol = new GmlSymbol();
		return gmlSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFeatureStyle createGmlFeatureStyle() {
		GmlFeatureStyle gmlFeatureStyle = new GmlFeatureStyle();
		return gmlFeatureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlRasterSymbol createGmlRasterSymbol() {
		GmlRasterSymbol gmlRasterSymbol = new GmlRasterSymbol();
		return gmlRasterSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryGrammarKind createQueryGrammarKindFromString(EDataType eDataType, String initialValue) {
		QueryGrammarKind result = QueryGrammarKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryGrammarKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramKind createDiagramKindFromString(EDataType eDataType, String initialValue) {
		DiagramKind result = DiagramKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagramKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfGMLSupportPackage getInfGMLSupportPackage() {
		return (InfGMLSupportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfGMLSupportPackage getPackage() {
		return InfGMLSupportPackage.eINSTANCE;
	}

} //InfGMLSupportFactory
