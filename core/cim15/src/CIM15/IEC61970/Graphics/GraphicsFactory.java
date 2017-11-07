/**
 */
package CIM15.IEC61970.Graphics;

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
public class GraphicsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GraphicsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GraphicsFactory INSTANCE = CIM15.IEC61970.Graphics.GraphicsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphicsFactory init() {
		try {
			GraphicsFactory theGraphicsFactory = (GraphicsFactory)EPackage.Registry.INSTANCE.getEFactory(GraphicsPackage.eNS_URI);
			if (theGraphicsFactory != null) {
				return theGraphicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphicsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsFactory() {
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
			case GraphicsPackage.TEXT_DIAGRAM_OBJECT: return createTextDiagramObject();
			case GraphicsPackage.DIAGRAM_OBJECT_GLUE_POINT: return createDiagramObjectGluePoint();
			case GraphicsPackage.DIAGRAM_OBJECT: return createDiagramObject();
			case GraphicsPackage.DIAGRAM_OBJECT_STYLE: return createDiagramObjectStyle();
			case GraphicsPackage.DIAGRAM_OBJECT_POINT: return createDiagramObjectPoint();
			case GraphicsPackage.VISIBILITY_LAYER: return createVisibilityLayer();
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
			case GraphicsPackage.ORIENTATION_KIND:
				return createOrientationKindFromString(eDataType, initialValue);
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
			case GraphicsPackage.ORIENTATION_KIND:
				return convertOrientationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDiagramObject createTextDiagramObject() {
		TextDiagramObject textDiagramObject = new TextDiagramObject();
		return textDiagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObjectGluePoint createDiagramObjectGluePoint() {
		DiagramObjectGluePoint diagramObjectGluePoint = new DiagramObjectGluePoint();
		return diagramObjectGluePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObject createDiagramObject() {
		DiagramObject diagramObject = new DiagramObject();
		return diagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObjectStyle createDiagramObjectStyle() {
		DiagramObjectStyle diagramObjectStyle = new DiagramObjectStyle();
		return diagramObjectStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObjectPoint createDiagramObjectPoint() {
		DiagramObjectPoint diagramObjectPoint = new DiagramObjectPoint();
		return diagramObjectPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityLayer createVisibilityLayer() {
		VisibilityLayer visibilityLayer = new VisibilityLayer();
		return visibilityLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationKind createOrientationKindFromString(EDataType eDataType, String initialValue) {
		OrientationKind result = OrientationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsPackage getGraphicsPackage() {
		return (GraphicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphicsPackage getPackage() {
		return GraphicsPackage.eINSTANCE;
	}

} //GraphicsFactory
