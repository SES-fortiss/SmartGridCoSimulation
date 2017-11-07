/**
 */
package CIM15.IEC61968.LoadControl;

import org.eclipse.emf.ecore.EClass;
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
public class LoadControlFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LoadControlFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LoadControlFactory INSTANCE = CIM15.IEC61968.LoadControl.LoadControlFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadControlFactory init() {
		try {
			LoadControlFactory theLoadControlFactory = (LoadControlFactory)EPackage.Registry.INSTANCE.getEFactory(LoadControlPackage.eNS_URI);
			if (theLoadControlFactory != null) {
				return theLoadControlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LoadControlFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadControlFactory() {
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION: return createConnectDisconnectFunction();
			case LoadControlPackage.REMOTE_CONNECT_DISCONNECT_INFO: return createRemoteConnectDisconnectInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectDisconnectFunction createConnectDisconnectFunction() {
		ConnectDisconnectFunction connectDisconnectFunction = new ConnectDisconnectFunction();
		return connectDisconnectFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteConnectDisconnectInfo createRemoteConnectDisconnectInfo() {
		RemoteConnectDisconnectInfo remoteConnectDisconnectInfo = new RemoteConnectDisconnectInfo();
		return remoteConnectDisconnectInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadControlPackage getLoadControlPackage() {
		return (LoadControlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LoadControlPackage getPackage() {
		return LoadControlPackage.eINSTANCE;
	}

} //LoadControlFactory
