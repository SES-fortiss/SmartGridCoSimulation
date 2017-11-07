/**
 */
package CIM15.IEC61970.Informative.InfAssetModels.util;

import CIM15.Element;

import CIM15.IEC61968.Assets.AssetModel;
import CIM15.IEC61968.Assets.ProductAssetModel;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssetModels.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage
 * @generated
 */
public class InfAssetModelsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfAssetModelsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfAssetModelsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfAssetModelsPackage.eINSTANCE;
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
	protected InfAssetModelsSwitch<Adapter> modelSwitch =
		new InfAssetModelsSwitch<Adapter>() {
			@Override
			public Adapter caseAssetModelCatalogue(AssetModelCatalogue object) {
				return createAssetModelCatalogueAdapter();
			}
			@Override
			public Adapter caseTransformerAssetModel(TransformerAssetModel object) {
				return createTransformerAssetModelAdapter();
			}
			@Override
			public Adapter caseAssetModelCatalogueItem(AssetModelCatalogueItem object) {
				return createAssetModelCatalogueItemAdapter();
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
			public Adapter caseAssetModel(AssetModel object) {
				return createAssetModelAdapter();
			}
			@Override
			public Adapter caseProductAssetModel(ProductAssetModel object) {
				return createProductAssetModelAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
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
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue <em>Asset Model Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue
	 * @generated
	 */
	public Adapter createAssetModelCatalogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel <em>Transformer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel
	 * @generated
	 */
	public Adapter createTransformerAssetModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem
	 * @generated
	 */
	public Adapter createAssetModelCatalogueItemAdapter() {
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
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Assets.AssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Assets.AssetModel
	 * @generated
	 */
	public Adapter createAssetModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Assets.ProductAssetModel <em>Product Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel
	 * @generated
	 */
	public Adapter createProductAssetModelAdapter() {
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

} //InfAssetModelsAdapterFactory
