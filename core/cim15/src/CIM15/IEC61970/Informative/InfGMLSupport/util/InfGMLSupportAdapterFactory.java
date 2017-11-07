/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport.util;

import CIM15.Element;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.PositionPoint;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfGMLSupport.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage
 * @generated
 */
public class InfGMLSupportAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfGMLSupportPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfGMLSupportAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfGMLSupportPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfGMLSupportSwitch<Adapter> modelSwitch =
		new InfGMLSupportSwitch<Adapter>() {
			@Override
			public Adapter caseGmlFeatureType(GmlFeatureType object) {
				return createGmlFeatureTypeAdapter();
			}
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseGmlPointGeometry(GmlPointGeometry object) {
				return createGmlPointGeometryAdapter();
			}
			@Override
			public Adapter caseGmlHalo(GmlHalo object) {
				return createGmlHaloAdapter();
			}
			@Override
			public Adapter caseGmlColour(GmlColour object) {
				return createGmlColourAdapter();
			}
			@Override
			public Adapter caseGmlFont(GmlFont object) {
				return createGmlFontAdapter();
			}
			@Override
			public Adapter caseGmlPolygonSymbol(GmlPolygonSymbol object) {
				return createGmlPolygonSymbolAdapter();
			}
			@Override
			public Adapter caseGmlStroke(GmlStroke object) {
				return createGmlStrokeAdapter();
			}
			@Override
			public Adapter caseGmlBaseSymbol(GmlBaseSymbol object) {
				return createGmlBaseSymbolAdapter();
			}
			@Override
			public Adapter caseGmlPosition(GmlPosition object) {
				return createGmlPositionAdapter();
			}
			@Override
			public Adapter caseGmlTextSymbol(GmlTextSymbol object) {
				return createGmlTextSymbolAdapter();
			}
			@Override
			public Adapter caseGmlPolygonGeometry(GmlPolygonGeometry object) {
				return createGmlPolygonGeometryAdapter();
			}
			@Override
			public Adapter caseGmlObservation(GmlObservation object) {
				return createGmlObservationAdapter();
			}
			@Override
			public Adapter caseGmlMark(GmlMark object) {
				return createGmlMarkAdapter();
			}
			@Override
			public Adapter caseGmlGraphic(GmlGraphic object) {
				return createGmlGraphicAdapter();
			}
			@Override
			public Adapter caseGmlLabelPlacement(GmlLabelPlacement object) {
				return createGmlLabelPlacementAdapter();
			}
			@Override
			public Adapter caseGmlGeometryStyle(GmlGeometryStyle object) {
				return createGmlGeometryStyleAdapter();
			}
			@Override
			public Adapter caseGmlLineGeometry(GmlLineGeometry object) {
				return createGmlLineGeometryAdapter();
			}
			@Override
			public Adapter caseGmlValue(GmlValue object) {
				return createGmlValueAdapter();
			}
			@Override
			public Adapter caseGmlLineSymbol(GmlLineSymbol object) {
				return createGmlLineSymbolAdapter();
			}
			@Override
			public Adapter caseGmlDiagramObject(GmlDiagramObject object) {
				return createGmlDiagramObjectAdapter();
			}
			@Override
			public Adapter caseGmlPointSymbol(GmlPointSymbol object) {
				return createGmlPointSymbolAdapter();
			}
			@Override
			public Adapter caseGmlTopologyStyle(GmlTopologyStyle object) {
				return createGmlTopologyStyleAdapter();
			}
			@Override
			public Adapter caseGmlSelector(GmlSelector object) {
				return createGmlSelectorAdapter();
			}
			@Override
			public Adapter caseGmlSvgParameter(GmlSvgParameter object) {
				return createGmlSvgParameterAdapter();
			}
			@Override
			public Adapter caseGmlLabelStyle(GmlLabelStyle object) {
				return createGmlLabelStyleAdapter();
			}
			@Override
			public Adapter caseGmlFill(GmlFill object) {
				return createGmlFillAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseGmlSymbol(GmlSymbol object) {
				return createGmlSymbolAdapter();
			}
			@Override
			public Adapter caseGmlFeatureStyle(GmlFeatureStyle object) {
				return createGmlFeatureStyleAdapter();
			}
			@Override
			public Adapter caseGmlRasterSymbol(GmlRasterSymbol object) {
				return createGmlRasterSymbolAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter casePositionPoint(PositionPoint object) {
				return createPositionPointAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType <em>Gml Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType
	 * @generated
	 */
	public Adapter createGmlFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointGeometry <em>Gml Point Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointGeometry
	 * @generated
	 */
	public Adapter createGmlPointGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo <em>Gml Halo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlHalo
	 * @generated
	 */
	public Adapter createGmlHaloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlColour <em>Gml Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlColour
	 * @generated
	 */
	public Adapter createGmlColourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFont <em>Gml Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFont
	 * @generated
	 */
	public Adapter createGmlFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol <em>Gml Polygon Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonSymbol
	 * @generated
	 */
	public Adapter createGmlPolygonSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke <em>Gml Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlStroke
	 * @generated
	 */
	public Adapter createGmlStrokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol <em>Gml Base Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol
	 * @generated
	 */
	public Adapter createGmlBaseSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPosition <em>Gml Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPosition
	 * @generated
	 */
	public Adapter createGmlPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol <em>Gml Text Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTextSymbol
	 * @generated
	 */
	public Adapter createGmlTextSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry <em>Gml Polygon Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPolygonGeometry
	 * @generated
	 */
	public Adapter createGmlPolygonGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation
	 * @generated
	 */
	public Adapter createGmlObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlMark <em>Gml Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlMark
	 * @generated
	 */
	public Adapter createGmlMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic <em>Gml Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGraphic
	 * @generated
	 */
	public Adapter createGmlGraphicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement <em>Gml Label Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelPlacement
	 * @generated
	 */
	public Adapter createGmlLabelPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle <em>Gml Geometry Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle
	 * @generated
	 */
	public Adapter createGmlGeometryStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry <em>Gml Line Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry
	 * @generated
	 */
	public Adapter createGmlLineGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue <em>Gml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue
	 * @generated
	 */
	public Adapter createGmlValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol <em>Gml Line Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLineSymbol
	 * @generated
	 */
	public Adapter createGmlLineSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject <em>Gml Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject
	 * @generated
	 */
	public Adapter createGmlDiagramObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol <em>Gml Point Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlPointSymbol
	 * @generated
	 */
	public Adapter createGmlPointSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle <em>Gml Topology Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle
	 * @generated
	 */
	public Adapter createGmlTopologyStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector <em>Gml Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector
	 * @generated
	 */
	public Adapter createGmlSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter <em>Gml Svg Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSvgParameter
	 * @generated
	 */
	public Adapter createGmlSvgParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle <em>Gml Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle
	 * @generated
	 */
	public Adapter createGmlLabelStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFill <em>Gml Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFill
	 * @generated
	 */
	public Adapter createGmlFillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol <em>Gml Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol
	 * @generated
	 */
	public Adapter createGmlSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle
	 * @generated
	 */
	public Adapter createGmlFeatureStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol <em>Gml Raster Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlRasterSymbol
	 * @generated
	 */
	public Adapter createGmlRasterSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.PositionPoint <em>Position Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.PositionPoint
	 * @generated
	 */
	public Adapter createPositionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InfGMLSupportAdapterFactory
