/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.TransformerEndInfo;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.Terminal;

import CIM15.IEC61970.Informative.InfAssets.WindingInsulation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getEndNumber <em>End Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getRground <em>Rground</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getFromWindingInsulations <em>From Winding Insulations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getCoreAdmittance <em>Core Admittance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#isGrounded <em>Grounded</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getTransformerEndInfo <em>Transformer End Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getMagBaseU <em>Mag Base U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getBmagSat <em>Bmag Sat</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getXground <em>Xground</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getFromMeshImpedance <em>From Mesh Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getToWindingInsulations <em>To Winding Insulations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getToMeshImpedance <em>To Mesh Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerEnd#getStarImpedance <em>Star Impedance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerEnd extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The default value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int END_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndNumber()
	 * @generated
	 * @ordered
	 */
	protected int endNumber = END_NUMBER_EDEFAULT;

	/**
	 * This is true if the End Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endNumberESet;

	/**
	 * The default value of the '{@link #getRground() <em>Rground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRground()
	 * @generated
	 * @ordered
	 */
	protected static final float RGROUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRground() <em>Rground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRground()
	 * @generated
	 * @ordered
	 */
	protected float rground = RGROUND_EDEFAULT;

	/**
	 * This is true if the Rground attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rgroundESet;

	/**
	 * The cached value of the '{@link #getFromWindingInsulations() <em>From Winding Insulations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromWindingInsulations()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInsulation> fromWindingInsulations;

	/**
	 * The cached value of the '{@link #getCoreAdmittance() <em>Core Admittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreAdmittance()
	 * @generated
	 * @ordered
	 */
	protected TransformerCoreAdmittance coreAdmittance;

	/**
	 * The default value of the '{@link #isGrounded() <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUNDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrounded() <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrounded()
	 * @generated
	 * @ordered
	 */
	protected boolean grounded = GROUNDED_EDEFAULT;

	/**
	 * This is true if the Grounded attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundedESet;

	/**
	 * The cached value of the '{@link #getTransformerEndInfo() <em>Transformer End Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerEndInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerEndInfo transformerEndInfo;

	/**
	 * The default value of the '{@link #getMagBaseU() <em>Mag Base U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagBaseU()
	 * @generated
	 * @ordered
	 */
	protected static final float MAG_BASE_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMagBaseU() <em>Mag Base U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagBaseU()
	 * @generated
	 * @ordered
	 */
	protected float magBaseU = MAG_BASE_U_EDEFAULT;

	/**
	 * This is true if the Mag Base U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean magBaseUESet;

	/**
	 * The default value of the '{@link #getMagSatFlux() <em>Mag Sat Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagSatFlux()
	 * @generated
	 * @ordered
	 */
	protected static final float MAG_SAT_FLUX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMagSatFlux() <em>Mag Sat Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagSatFlux()
	 * @generated
	 * @ordered
	 */
	protected float magSatFlux = MAG_SAT_FLUX_EDEFAULT;

	/**
	 * This is true if the Mag Sat Flux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean magSatFluxESet;

	/**
	 * The cached value of the '{@link #getPhaseTapChanger() <em>Phase Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChanger()
	 * @generated
	 * @ordered
	 */
	protected PhaseTapChanger phaseTapChanger;

	/**
	 * The cached value of the '{@link #getRatioTapChanger() <em>Ratio Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioTapChanger()
	 * @generated
	 * @ordered
	 */
	protected RatioTapChanger ratioTapChanger;

	/**
	 * The default value of the '{@link #getBmagSat() <em>Bmag Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmagSat()
	 * @generated
	 * @ordered
	 */
	protected static final float BMAG_SAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBmagSat() <em>Bmag Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmagSat()
	 * @generated
	 * @ordered
	 */
	protected float bmagSat = BMAG_SAT_EDEFAULT;

	/**
	 * This is true if the Bmag Sat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bmagSatESet;

	/**
	 * The default value of the '{@link #getXground() <em>Xground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXground()
	 * @generated
	 * @ordered
	 */
	protected static final float XGROUND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXground() <em>Xground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXground()
	 * @generated
	 * @ordered
	 */
	protected float xground = XGROUND_EDEFAULT;

	/**
	 * This is true if the Xground attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xgroundESet;

	/**
	 * The cached value of the '{@link #getFromMeshImpedance() <em>From Mesh Impedance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromMeshImpedance()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerMeshImpedance> fromMeshImpedance;

	/**
	 * The cached value of the '{@link #getToWindingInsulations() <em>To Winding Insulations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToWindingInsulations()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInsulation> toWindingInsulations;

	/**
	 * The cached value of the '{@link #getToMeshImpedance() <em>To Mesh Impedance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMeshImpedance()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerMeshImpedance> toMeshImpedance;

	/**
	 * The cached value of the '{@link #getStarImpedance() <em>Star Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarImpedance()
	 * @generated
	 * @ordered
	 */
	protected TransformerStarImpedance starImpedance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerEnd() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TRANSFORMER_END;
	}

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM15.IEC61970.Core.Terminal#getTransformerEnd
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__TRANSFORMER_END, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__TRANSFORMER_END, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>End Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Number</em>' attribute.
	 * @see #isSetEndNumber()
	 * @see #unsetEndNumber()
	 * @see #setEndNumber(int)
	 * @generated
	 */
	public int getEndNumber() {
		return endNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getEndNumber <em>End Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Number</em>' attribute.
	 * @see #isSetEndNumber()
	 * @see #unsetEndNumber()
	 * @see #getEndNumber()
	 * @generated
	 */
	public void setEndNumber(int newEndNumber) {
		endNumber = newEndNumber;
		endNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getEndNumber <em>End Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndNumber()
	 * @see #getEndNumber()
	 * @see #setEndNumber(int)
	 * @generated
	 */
	public void unsetEndNumber() {
		endNumber = END_NUMBER_EDEFAULT;
		endNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getEndNumber <em>End Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Number</em>' attribute is set.
	 * @see #unsetEndNumber()
	 * @see #getEndNumber()
	 * @see #setEndNumber(int)
	 * @generated
	 */
	public boolean isSetEndNumber() {
		return endNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Rground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rground</em>' attribute.
	 * @see #isSetRground()
	 * @see #unsetRground()
	 * @see #setRground(float)
	 * @generated
	 */
	public float getRground() {
		return rground;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getRground <em>Rground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rground</em>' attribute.
	 * @see #isSetRground()
	 * @see #unsetRground()
	 * @see #getRground()
	 * @generated
	 */
	public void setRground(float newRground) {
		rground = newRground;
		rgroundESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getRground <em>Rground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRground()
	 * @see #getRground()
	 * @see #setRground(float)
	 * @generated
	 */
	public void unsetRground() {
		rground = RGROUND_EDEFAULT;
		rgroundESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getRground <em>Rground</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rground</em>' attribute is set.
	 * @see #unsetRground()
	 * @see #getRground()
	 * @see #setRground(float)
	 * @generated
	 */
	public boolean isSetRground() {
		return rgroundESet;
	}

	/**
	 * Returns the value of the '<em><b>From Winding Insulations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding <em>From Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Winding Insulations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Winding Insulations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding
	 * @generated
	 */
	public EList<WindingInsulation> getFromWindingInsulations() {
		if (fromWindingInsulations == null) {
			fromWindingInsulations = new BasicInternalEList<WindingInsulation>(WindingInsulation.class);
		}
		return fromWindingInsulations;
	}

	/**
	 * Returns the value of the '<em><b>Core Admittance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Admittance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Admittance</em>' reference.
	 * @see #setCoreAdmittance(TransformerCoreAdmittance)
	 * @see CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEnd
	 * @generated
	 */
	public TransformerCoreAdmittance getCoreAdmittance() {
		if (coreAdmittance != null && coreAdmittance.eIsProxy()) {
			InternalEObject oldCoreAdmittance = (InternalEObject)coreAdmittance;
			coreAdmittance = (TransformerCoreAdmittance)eResolveProxy(oldCoreAdmittance);
			if (coreAdmittance != oldCoreAdmittance) {
			}
		}
		return coreAdmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerCoreAdmittance basicGetCoreAdmittance() {
		return coreAdmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreAdmittance(TransformerCoreAdmittance newCoreAdmittance, NotificationChain msgs) {
		TransformerCoreAdmittance oldCoreAdmittance = coreAdmittance;
		coreAdmittance = newCoreAdmittance;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getCoreAdmittance <em>Core Admittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Admittance</em>' reference.
	 * @see #getCoreAdmittance()
	 * @generated
	 */
	public void setCoreAdmittance(TransformerCoreAdmittance newCoreAdmittance) {
		if (newCoreAdmittance != coreAdmittance) {
			NotificationChain msgs = null;
			if (coreAdmittance != null)
				msgs = ((InternalEObject)coreAdmittance).eInverseRemove(this, WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END, TransformerCoreAdmittance.class, msgs);
			if (newCoreAdmittance != null)
				msgs = ((InternalEObject)newCoreAdmittance).eInverseAdd(this, WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END, TransformerCoreAdmittance.class, msgs);
			msgs = basicSetCoreAdmittance(newCoreAdmittance, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Grounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded</em>' attribute.
	 * @see #isSetGrounded()
	 * @see #unsetGrounded()
	 * @see #setGrounded(boolean)
	 * @generated
	 */
	public boolean isGrounded() {
		return grounded;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#isGrounded <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounded</em>' attribute.
	 * @see #isSetGrounded()
	 * @see #unsetGrounded()
	 * @see #isGrounded()
	 * @generated
	 */
	public void setGrounded(boolean newGrounded) {
		grounded = newGrounded;
		groundedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#isGrounded <em>Grounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrounded()
	 * @see #isGrounded()
	 * @see #setGrounded(boolean)
	 * @generated
	 */
	public void unsetGrounded() {
		grounded = GROUNDED_EDEFAULT;
		groundedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#isGrounded <em>Grounded</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grounded</em>' attribute is set.
	 * @see #unsetGrounded()
	 * @see #isGrounded()
	 * @see #setGrounded(boolean)
	 * @generated
	 */
	public boolean isSetGrounded() {
		return groundedESet;
	}

	/**
	 * Returns the value of the '<em><b>Transformer End Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End Info</em>' reference.
	 * @see #setTransformerEndInfo(TransformerEndInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerEnd
	 * @generated
	 */
	public TransformerEndInfo getTransformerEndInfo() {
		if (transformerEndInfo != null && transformerEndInfo.eIsProxy()) {
			InternalEObject oldTransformerEndInfo = (InternalEObject)transformerEndInfo;
			transformerEndInfo = (TransformerEndInfo)eResolveProxy(oldTransformerEndInfo);
			if (transformerEndInfo != oldTransformerEndInfo) {
			}
		}
		return transformerEndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEndInfo basicGetTransformerEndInfo() {
		return transformerEndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerEndInfo(TransformerEndInfo newTransformerEndInfo, NotificationChain msgs) {
		TransformerEndInfo oldTransformerEndInfo = transformerEndInfo;
		transformerEndInfo = newTransformerEndInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getTransformerEndInfo <em>Transformer End Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer End Info</em>' reference.
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public void setTransformerEndInfo(TransformerEndInfo newTransformerEndInfo) {
		if (newTransformerEndInfo != transformerEndInfo) {
			NotificationChain msgs = null;
			if (transformerEndInfo != null)
				msgs = ((InternalEObject)transformerEndInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END, TransformerEndInfo.class, msgs);
			if (newTransformerEndInfo != null)
				msgs = ((InternalEObject)newTransformerEndInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END, TransformerEndInfo.class, msgs);
			msgs = basicSetTransformerEndInfo(newTransformerEndInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Mag Base U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mag Base U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mag Base U</em>' attribute.
	 * @see #isSetMagBaseU()
	 * @see #unsetMagBaseU()
	 * @see #setMagBaseU(float)
	 * @generated
	 */
	public float getMagBaseU() {
		return magBaseU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getMagBaseU <em>Mag Base U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mag Base U</em>' attribute.
	 * @see #isSetMagBaseU()
	 * @see #unsetMagBaseU()
	 * @see #getMagBaseU()
	 * @generated
	 */
	public void setMagBaseU(float newMagBaseU) {
		magBaseU = newMagBaseU;
		magBaseUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getMagBaseU <em>Mag Base U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMagBaseU()
	 * @see #getMagBaseU()
	 * @see #setMagBaseU(float)
	 * @generated
	 */
	public void unsetMagBaseU() {
		magBaseU = MAG_BASE_U_EDEFAULT;
		magBaseUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getMagBaseU <em>Mag Base U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mag Base U</em>' attribute is set.
	 * @see #unsetMagBaseU()
	 * @see #getMagBaseU()
	 * @see #setMagBaseU(float)
	 * @generated
	 */
	public boolean isSetMagBaseU() {
		return magBaseUESet;
	}

	/**
	 * Returns the value of the '<em><b>Mag Sat Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mag Sat Flux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mag Sat Flux</em>' attribute.
	 * @see #isSetMagSatFlux()
	 * @see #unsetMagSatFlux()
	 * @see #setMagSatFlux(float)
	 * @generated
	 */
	public float getMagSatFlux() {
		return magSatFlux;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mag Sat Flux</em>' attribute.
	 * @see #isSetMagSatFlux()
	 * @see #unsetMagSatFlux()
	 * @see #getMagSatFlux()
	 * @generated
	 */
	public void setMagSatFlux(float newMagSatFlux) {
		magSatFlux = newMagSatFlux;
		magSatFluxESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMagSatFlux()
	 * @see #getMagSatFlux()
	 * @see #setMagSatFlux(float)
	 * @generated
	 */
	public void unsetMagSatFlux() {
		magSatFlux = MAG_SAT_FLUX_EDEFAULT;
		magSatFluxESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getMagSatFlux <em>Mag Sat Flux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mag Sat Flux</em>' attribute is set.
	 * @see #unsetMagSatFlux()
	 * @see #getMagSatFlux()
	 * @see #setMagSatFlux(float)
	 * @generated
	 */
	public boolean isSetMagSatFlux() {
		return magSatFluxESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer</em>' reference.
	 * @see #setPhaseTapChanger(PhaseTapChanger)
	 * @see CIM15.IEC61970.Wires.PhaseTapChanger#getTransformerEnd
	 * @generated
	 */
	public PhaseTapChanger getPhaseTapChanger() {
		if (phaseTapChanger != null && phaseTapChanger.eIsProxy()) {
			InternalEObject oldPhaseTapChanger = (InternalEObject)phaseTapChanger;
			phaseTapChanger = (PhaseTapChanger)eResolveProxy(oldPhaseTapChanger);
			if (phaseTapChanger != oldPhaseTapChanger) {
			}
		}
		return phaseTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChanger basicGetPhaseTapChanger() {
		return phaseTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseTapChanger(PhaseTapChanger newPhaseTapChanger, NotificationChain msgs) {
		PhaseTapChanger oldPhaseTapChanger = phaseTapChanger;
		phaseTapChanger = newPhaseTapChanger;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Tap Changer</em>' reference.
	 * @see #getPhaseTapChanger()
	 * @generated
	 */
	public void setPhaseTapChanger(PhaseTapChanger newPhaseTapChanger) {
		if (newPhaseTapChanger != phaseTapChanger) {
			NotificationChain msgs = null;
			if (phaseTapChanger != null)
				msgs = ((InternalEObject)phaseTapChanger).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs);
			if (newPhaseTapChanger != null)
				msgs = ((InternalEObject)newPhaseTapChanger).eInverseAdd(this, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs);
			msgs = basicSetPhaseTapChanger(newPhaseTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Ratio Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Tap Changer</em>' reference.
	 * @see #setRatioTapChanger(RatioTapChanger)
	 * @see CIM15.IEC61970.Wires.RatioTapChanger#getTransformerEnd
	 * @generated
	 */
	public RatioTapChanger getRatioTapChanger() {
		if (ratioTapChanger != null && ratioTapChanger.eIsProxy()) {
			InternalEObject oldRatioTapChanger = (InternalEObject)ratioTapChanger;
			ratioTapChanger = (RatioTapChanger)eResolveProxy(oldRatioTapChanger);
			if (ratioTapChanger != oldRatioTapChanger) {
			}
		}
		return ratioTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChanger basicGetRatioTapChanger() {
		return ratioTapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioTapChanger(RatioTapChanger newRatioTapChanger, NotificationChain msgs) {
		RatioTapChanger oldRatioTapChanger = ratioTapChanger;
		ratioTapChanger = newRatioTapChanger;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Tap Changer</em>' reference.
	 * @see #getRatioTapChanger()
	 * @generated
	 */
	public void setRatioTapChanger(RatioTapChanger newRatioTapChanger) {
		if (newRatioTapChanger != ratioTapChanger) {
			NotificationChain msgs = null;
			if (ratioTapChanger != null)
				msgs = ((InternalEObject)ratioTapChanger).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs);
			if (newRatioTapChanger != null)
				msgs = ((InternalEObject)newRatioTapChanger).eInverseAdd(this, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs);
			msgs = basicSetRatioTapChanger(newRatioTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Bmag Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bmag Sat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bmag Sat</em>' attribute.
	 * @see #isSetBmagSat()
	 * @see #unsetBmagSat()
	 * @see #setBmagSat(float)
	 * @generated
	 */
	public float getBmagSat() {
		return bmagSat;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getBmagSat <em>Bmag Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bmag Sat</em>' attribute.
	 * @see #isSetBmagSat()
	 * @see #unsetBmagSat()
	 * @see #getBmagSat()
	 * @generated
	 */
	public void setBmagSat(float newBmagSat) {
		bmagSat = newBmagSat;
		bmagSatESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getBmagSat <em>Bmag Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBmagSat()
	 * @see #getBmagSat()
	 * @see #setBmagSat(float)
	 * @generated
	 */
	public void unsetBmagSat() {
		bmagSat = BMAG_SAT_EDEFAULT;
		bmagSatESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getBmagSat <em>Bmag Sat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bmag Sat</em>' attribute is set.
	 * @see #unsetBmagSat()
	 * @see #getBmagSat()
	 * @see #setBmagSat(float)
	 * @generated
	 */
	public boolean isSetBmagSat() {
		return bmagSatESet;
	}

	/**
	 * Returns the value of the '<em><b>Xground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xground</em>' attribute.
	 * @see #isSetXground()
	 * @see #unsetXground()
	 * @see #setXground(float)
	 * @generated
	 */
	public float getXground() {
		return xground;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getXground <em>Xground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xground</em>' attribute.
	 * @see #isSetXground()
	 * @see #unsetXground()
	 * @see #getXground()
	 * @generated
	 */
	public void setXground(float newXground) {
		xground = newXground;
		xgroundESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getXground <em>Xground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXground()
	 * @see #getXground()
	 * @see #setXground(float)
	 * @generated
	 */
	public void unsetXground() {
		xground = XGROUND_EDEFAULT;
		xgroundESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getXground <em>Xground</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xground</em>' attribute is set.
	 * @see #unsetXground()
	 * @see #getXground()
	 * @see #setXground(float)
	 * @generated
	 */
	public boolean isSetXground() {
		return xgroundESet;
	}

	/**
	 * Returns the value of the '<em><b>From Mesh Impedance</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerMeshImpedance}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Mesh Impedance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Mesh Impedance</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEnd
	 * @generated
	 */
	public EList<TransformerMeshImpedance> getFromMeshImpedance() {
		if (fromMeshImpedance == null) {
			fromMeshImpedance = new BasicInternalEList<TransformerMeshImpedance>(TransformerMeshImpedance.class);
		}
		return fromMeshImpedance;
	}

	/**
	 * Returns the value of the '<em><b>To Winding Insulations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding <em>To Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Winding Insulations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Winding Insulations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding
	 * @generated
	 */
	public EList<WindingInsulation> getToWindingInsulations() {
		if (toWindingInsulations == null) {
			toWindingInsulations = new BasicInternalEList<WindingInsulation>(WindingInsulation.class);
		}
		return toWindingInsulations;
	}

	/**
	 * Returns the value of the '<em><b>To Mesh Impedance</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerMeshImpedance}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEnd <em>To Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Mesh Impedance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Mesh Impedance</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEnd
	 * @generated
	 */
	public EList<TransformerMeshImpedance> getToMeshImpedance() {
		if (toMeshImpedance == null) {
			toMeshImpedance = new BasicInternalEList<TransformerMeshImpedance>(TransformerMeshImpedance.class);
		}
		return toMeshImpedance;
	}

	/**
	 * Returns the value of the '<em><b>Star Impedance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Star Impedance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Star Impedance</em>' reference.
	 * @see #setStarImpedance(TransformerStarImpedance)
	 * @see CIM15.IEC61970.Wires.TransformerStarImpedance#getTransformerEnd
	 * @generated
	 */
	public TransformerStarImpedance getStarImpedance() {
		if (starImpedance != null && starImpedance.eIsProxy()) {
			InternalEObject oldStarImpedance = (InternalEObject)starImpedance;
			starImpedance = (TransformerStarImpedance)eResolveProxy(oldStarImpedance);
			if (starImpedance != oldStarImpedance) {
			}
		}
		return starImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerStarImpedance basicGetStarImpedance() {
		return starImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarImpedance(TransformerStarImpedance newStarImpedance, NotificationChain msgs) {
		TransformerStarImpedance oldStarImpedance = starImpedance;
		starImpedance = newStarImpedance;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerEnd#getStarImpedance <em>Star Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Star Impedance</em>' reference.
	 * @see #getStarImpedance()
	 * @generated
	 */
	public void setStarImpedance(TransformerStarImpedance newStarImpedance) {
		if (newStarImpedance != starImpedance) {
			NotificationChain msgs = null;
			if (starImpedance != null)
				msgs = ((InternalEObject)starImpedance).eInverseRemove(this, WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END, TransformerStarImpedance.class, msgs);
			if (newStarImpedance != null)
				msgs = ((InternalEObject)newStarImpedance).eInverseAdd(this, WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END, TransformerStarImpedance.class, msgs);
			msgs = basicSetStarImpedance(newStarImpedance, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case WiresPackage.TRANSFORMER_END__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__TRANSFORMER_END, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromWindingInsulations()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__CORE_ADMITTANCE:
				if (coreAdmittance != null)
					msgs = ((InternalEObject)coreAdmittance).eInverseRemove(this, WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END, TransformerCoreAdmittance.class, msgs);
				return basicSetCoreAdmittance((TransformerCoreAdmittance)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__TRANSFORMER_END_INFO:
				if (transformerEndInfo != null)
					msgs = ((InternalEObject)transformerEndInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__TRANSFORMER_END, TransformerEndInfo.class, msgs);
				return basicSetTransformerEndInfo((TransformerEndInfo)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
				if (phaseTapChanger != null)
					msgs = ((InternalEObject)phaseTapChanger).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs);
				return basicSetPhaseTapChanger((PhaseTapChanger)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
				if (ratioTapChanger != null)
					msgs = ((InternalEObject)ratioTapChanger).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs);
				return basicSetRatioTapChanger((RatioTapChanger)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromMeshImpedance()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToWindingInsulations()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToMeshImpedance()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__STAR_IMPEDANCE:
				if (starImpedance != null)
					msgs = ((InternalEObject)starImpedance).eInverseRemove(this, WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END, TransformerStarImpedance.class, msgs);
				return basicSetStarImpedance((TransformerStarImpedance)otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_END__TERMINAL:
				return basicSetTerminal(null, msgs);
			case WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS:
				return ((InternalEList<?>)getFromWindingInsulations()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__CORE_ADMITTANCE:
				return basicSetCoreAdmittance(null, msgs);
			case WiresPackage.TRANSFORMER_END__TRANSFORMER_END_INFO:
				return basicSetTransformerEndInfo(null, msgs);
			case WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
				return basicSetPhaseTapChanger(null, msgs);
			case WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
				return basicSetRatioTapChanger(null, msgs);
			case WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
				return ((InternalEList<?>)getFromMeshImpedance()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS:
				return ((InternalEList<?>)getToWindingInsulations()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
				return ((InternalEList<?>)getToMeshImpedance()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_END__STAR_IMPEDANCE:
				return basicSetStarImpedance(null, msgs);
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
			case WiresPackage.TRANSFORMER_END__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case WiresPackage.TRANSFORMER_END__END_NUMBER:
				return getEndNumber();
			case WiresPackage.TRANSFORMER_END__RGROUND:
				return getRground();
			case WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS:
				return getFromWindingInsulations();
			case WiresPackage.TRANSFORMER_END__CORE_ADMITTANCE:
				if (resolve) return getCoreAdmittance();
				return basicGetCoreAdmittance();
			case WiresPackage.TRANSFORMER_END__GROUNDED:
				return isGrounded();
			case WiresPackage.TRANSFORMER_END__TRANSFORMER_END_INFO:
				if (resolve) return getTransformerEndInfo();
				return basicGetTransformerEndInfo();
			case WiresPackage.TRANSFORMER_END__MAG_BASE_U:
				return getMagBaseU();
			case WiresPackage.TRANSFORMER_END__MAG_SAT_FLUX:
				return getMagSatFlux();
			case WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
				if (resolve) return getPhaseTapChanger();
				return basicGetPhaseTapChanger();
			case WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
				if (resolve) return getRatioTapChanger();
				return basicGetRatioTapChanger();
			case WiresPackage.TRANSFORMER_END__BMAG_SAT:
				return getBmagSat();
			case WiresPackage.TRANSFORMER_END__XGROUND:
				return getXground();
			case WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
				return getFromMeshImpedance();
			case WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS:
				return getToWindingInsulations();
			case WiresPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
				return getToMeshImpedance();
			case WiresPackage.TRANSFORMER_END__STAR_IMPEDANCE:
				if (resolve) return getStarImpedance();
				return basicGetStarImpedance();
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
			case WiresPackage.TRANSFORMER_END__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__END_NUMBER:
				setEndNumber((Integer)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__RGROUND:
				setRground((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS:
				getFromWindingInsulations().clear();
				getFromWindingInsulations().addAll((Collection<? extends WindingInsulation>)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__CORE_ADMITTANCE:
				setCoreAdmittance((TransformerCoreAdmittance)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__GROUNDED:
				setGrounded((Boolean)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__TRANSFORMER_END_INFO:
				setTransformerEndInfo((TransformerEndInfo)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__MAG_BASE_U:
				setMagBaseU((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__MAG_SAT_FLUX:
				setMagSatFlux((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
				setPhaseTapChanger((PhaseTapChanger)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
				setRatioTapChanger((RatioTapChanger)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__BMAG_SAT:
				setBmagSat((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__XGROUND:
				setXground((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
				getFromMeshImpedance().clear();
				getFromMeshImpedance().addAll((Collection<? extends TransformerMeshImpedance>)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS:
				getToWindingInsulations().clear();
				getToWindingInsulations().addAll((Collection<? extends WindingInsulation>)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
				getToMeshImpedance().clear();
				getToMeshImpedance().addAll((Collection<? extends TransformerMeshImpedance>)newValue);
				return;
			case WiresPackage.TRANSFORMER_END__STAR_IMPEDANCE:
				setStarImpedance((TransformerStarImpedance)newValue);
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
			case WiresPackage.TRANSFORMER_END__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case WiresPackage.TRANSFORMER_END__END_NUMBER:
				unsetEndNumber();
				return;
			case WiresPackage.TRANSFORMER_END__RGROUND:
				unsetRground();
				return;
			case WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS:
				getFromWindingInsulations().clear();
				return;
			case WiresPackage.TRANSFORMER_END__CORE_ADMITTANCE:
				setCoreAdmittance((TransformerCoreAdmittance)null);
				return;
			case WiresPackage.TRANSFORMER_END__GROUNDED:
				unsetGrounded();
				return;
			case WiresPackage.TRANSFORMER_END__TRANSFORMER_END_INFO:
				setTransformerEndInfo((TransformerEndInfo)null);
				return;
			case WiresPackage.TRANSFORMER_END__MAG_BASE_U:
				unsetMagBaseU();
				return;
			case WiresPackage.TRANSFORMER_END__MAG_SAT_FLUX:
				unsetMagSatFlux();
				return;
			case WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
				setPhaseTapChanger((PhaseTapChanger)null);
				return;
			case WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
				setRatioTapChanger((RatioTapChanger)null);
				return;
			case WiresPackage.TRANSFORMER_END__BMAG_SAT:
				unsetBmagSat();
				return;
			case WiresPackage.TRANSFORMER_END__XGROUND:
				unsetXground();
				return;
			case WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
				getFromMeshImpedance().clear();
				return;
			case WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS:
				getToWindingInsulations().clear();
				return;
			case WiresPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
				getToMeshImpedance().clear();
				return;
			case WiresPackage.TRANSFORMER_END__STAR_IMPEDANCE:
				setStarImpedance((TransformerStarImpedance)null);
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
			case WiresPackage.TRANSFORMER_END__TERMINAL:
				return terminal != null;
			case WiresPackage.TRANSFORMER_END__END_NUMBER:
				return isSetEndNumber();
			case WiresPackage.TRANSFORMER_END__RGROUND:
				return isSetRground();
			case WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS:
				return fromWindingInsulations != null && !fromWindingInsulations.isEmpty();
			case WiresPackage.TRANSFORMER_END__CORE_ADMITTANCE:
				return coreAdmittance != null;
			case WiresPackage.TRANSFORMER_END__GROUNDED:
				return isSetGrounded();
			case WiresPackage.TRANSFORMER_END__TRANSFORMER_END_INFO:
				return transformerEndInfo != null;
			case WiresPackage.TRANSFORMER_END__MAG_BASE_U:
				return isSetMagBaseU();
			case WiresPackage.TRANSFORMER_END__MAG_SAT_FLUX:
				return isSetMagSatFlux();
			case WiresPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
				return phaseTapChanger != null;
			case WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
				return ratioTapChanger != null;
			case WiresPackage.TRANSFORMER_END__BMAG_SAT:
				return isSetBmagSat();
			case WiresPackage.TRANSFORMER_END__XGROUND:
				return isSetXground();
			case WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
				return fromMeshImpedance != null && !fromMeshImpedance.isEmpty();
			case WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS:
				return toWindingInsulations != null && !toWindingInsulations.isEmpty();
			case WiresPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
				return toMeshImpedance != null && !toMeshImpedance.isEmpty();
			case WiresPackage.TRANSFORMER_END__STAR_IMPEDANCE:
				return starImpedance != null;
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
		result.append(" (endNumber: ");
		if (endNumberESet) result.append(endNumber); else result.append("<unset>");
		result.append(", rground: ");
		if (rgroundESet) result.append(rground); else result.append("<unset>");
		result.append(", grounded: ");
		if (groundedESet) result.append(grounded); else result.append("<unset>");
		result.append(", magBaseU: ");
		if (magBaseUESet) result.append(magBaseU); else result.append("<unset>");
		result.append(", magSatFlux: ");
		if (magSatFluxESet) result.append(magSatFlux); else result.append("<unset>");
		result.append(", bmagSat: ");
		if (bmagSatESet) result.append(bmagSat); else result.append("<unset>");
		result.append(", xground: ");
		if (xgroundESet) result.append(xground); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerEnd
