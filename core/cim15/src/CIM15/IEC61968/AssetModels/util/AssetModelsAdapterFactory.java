/**
 */
package CIM15.IEC61968.AssetModels.util;

import CIM15.Element;

import CIM15.IEC61968.AssetModels.*;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage
 * @generated
 */
public class AssetModelsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssetModelsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetModelsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssetModelsPackage.eINSTANCE;
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
	protected AssetModelsSwitch<Adapter> modelSwitch =
		new AssetModelsSwitch<Adapter>() {
			@Override
			public Adapter caseShortCircuitTest(ShortCircuitTest object) {
				return createShortCircuitTestAdapter();
			}
			@Override
			public Adapter caseEndDeviceInfo(EndDeviceInfo object) {
				return createEndDeviceInfoAdapter();
			}
			@Override
			public Adapter caseWireType(WireType object) {
				return createWireTypeAdapter();
			}
			@Override
			public Adapter caseTapeShieldCableInfo(TapeShieldCableInfo object) {
				return createTapeShieldCableInfoAdapter();
			}
			@Override
			public Adapter caseConductorInfo(ConductorInfo object) {
				return createConductorInfoAdapter();
			}
			@Override
			public Adapter caseTapChangerInfo(TapChangerInfo object) {
				return createTapChangerInfoAdapter();
			}
			@Override
			public Adapter caseTransformerTankInfo(TransformerTankInfo object) {
				return createTransformerTankInfoAdapter();
			}
			@Override
			public Adapter casePowerTransformerInfo(PowerTransformerInfo object) {
				return createPowerTransformerInfoAdapter();
			}
			@Override
			public Adapter caseOpenCircuitTest(OpenCircuitTest object) {
				return createOpenCircuitTestAdapter();
			}
			@Override
			public Adapter caseCableInfo(CableInfo object) {
				return createCableInfoAdapter();
			}
			@Override
			public Adapter caseTransformerEndInfo(TransformerEndInfo object) {
				return createTransformerEndInfoAdapter();
			}
			@Override
			public Adapter caseNoLoadTest(NoLoadTest object) {
				return createNoLoadTestAdapter();
			}
			@Override
			public Adapter caseOverheadConductorInfo(OverheadConductorInfo object) {
				return createOverheadConductorInfoAdapter();
			}
			@Override
			public Adapter caseConcentricNeutralCableInfo(ConcentricNeutralCableInfo object) {
				return createConcentricNeutralCableInfoAdapter();
			}
			@Override
			public Adapter caseWireArrangement(WireArrangement object) {
				return createWireArrangementAdapter();
			}
			@Override
			public Adapter caseTransformerTest(TransformerTest object) {
				return createTransformerTestAdapter();
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
			public Adapter caseAssetInfo(AssetInfo object) {
				return createAssetInfoAdapter();
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
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest <em>Short Circuit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest
	 * @generated
	 */
	public Adapter createShortCircuitTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo <em>End Device Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo
	 * @generated
	 */
	public Adapter createEndDeviceInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.WireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.WireType
	 * @generated
	 */
	public Adapter createWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo <em>Tape Shield Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.TapeShieldCableInfo
	 * @generated
	 */
	public Adapter createTapeShieldCableInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.ConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo
	 * @generated
	 */
	public Adapter createConductorInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.TapChangerInfo <em>Tap Changer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo
	 * @generated
	 */
	public Adapter createTapChangerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo <em>Transformer Tank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo
	 * @generated
	 */
	public Adapter createTransformerTankInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo <em>Power Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.PowerTransformerInfo
	 * @generated
	 */
	public Adapter createPowerTransformerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest <em>Open Circuit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest
	 * @generated
	 */
	public Adapter createOpenCircuitTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.CableInfo <em>Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.CableInfo
	 * @generated
	 */
	public Adapter createCableInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo <em>Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo
	 * @generated
	 */
	public Adapter createTransformerEndInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.NoLoadTest <em>No Load Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest
	 * @generated
	 */
	public Adapter createNoLoadTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo <em>Overhead Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo
	 * @generated
	 */
	public Adapter createOverheadConductorInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo <em>Concentric Neutral Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo
	 * @generated
	 */
	public Adapter createConcentricNeutralCableInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.WireArrangement <em>Wire Arrangement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement
	 * @generated
	 */
	public Adapter createWireArrangementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.AssetModels.TransformerTest <em>Transformer Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.AssetModels.TransformerTest
	 * @generated
	 */
	public Adapter createTransformerTestAdapter() {
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
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Assets.AssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Assets.AssetInfo
	 * @generated
	 */
	public Adapter createAssetInfoAdapter() {
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

} //AssetModelsAdapterFactory
