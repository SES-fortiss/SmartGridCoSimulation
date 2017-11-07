/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.Terminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bushing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2PowerFactor <em>C2 Power Factor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2Capacitance <em>C2 Capacitance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1PowerFactor <em>C1 Power Factor</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getInsulationKind <em>Insulation Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1Capacitance <em>C1 Capacitance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getBushingInsulationPFs <em>Bushing Insulation PFs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Bushing extends Asset {
	/**
	 * The default value of the '{@link #getC2PowerFactor() <em>C2 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2PowerFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float C2_POWER_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getC2PowerFactor() <em>C2 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2PowerFactor()
	 * @generated
	 * @ordered
	 */
	protected float c2PowerFactor = C2_POWER_FACTOR_EDEFAULT;

	/**
	 * This is true if the C2 Power Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean c2PowerFactorESet;

	/**
	 * The default value of the '{@link #getC2Capacitance() <em>C2 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2Capacitance()
	 * @generated
	 * @ordered
	 */
	protected static final float C2_CAPACITANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getC2Capacitance() <em>C2 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2Capacitance()
	 * @generated
	 * @ordered
	 */
	protected float c2Capacitance = C2_CAPACITANCE_EDEFAULT;

	/**
	 * This is true if the C2 Capacitance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean c2CapacitanceESet;

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
	 * The default value of the '{@link #getC1PowerFactor() <em>C1 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1PowerFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float C1_POWER_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getC1PowerFactor() <em>C1 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1PowerFactor()
	 * @generated
	 * @ordered
	 */
	protected float c1PowerFactor = C1_POWER_FACTOR_EDEFAULT;

	/**
	 * This is true if the C1 Power Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean c1PowerFactorESet;

	/**
	 * The default value of the '{@link #getInsulationKind() <em>Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationKind()
	 * @generated
	 * @ordered
	 */
	protected static final BushingInsulationKind INSULATION_KIND_EDEFAULT = BushingInsulationKind.SOLID_PORCELAIN;

	/**
	 * The cached value of the '{@link #getInsulationKind() <em>Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationKind()
	 * @generated
	 * @ordered
	 */
	protected BushingInsulationKind insulationKind = INSULATION_KIND_EDEFAULT;

	/**
	 * This is true if the Insulation Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulationKindESet;

	/**
	 * The default value of the '{@link #getC1Capacitance() <em>C1 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1Capacitance()
	 * @generated
	 * @ordered
	 */
	protected static final float C1_CAPACITANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getC1Capacitance() <em>C1 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1Capacitance()
	 * @generated
	 * @ordered
	 */
	protected float c1Capacitance = C1_CAPACITANCE_EDEFAULT;

	/**
	 * This is true if the C1 Capacitance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean c1CapacitanceESet;

	/**
	 * The cached value of the '{@link #getBushingInsulationPFs() <em>Bushing Insulation PFs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingInsulationPFs()
	 * @generated
	 * @ordered
	 */
	protected EList<BushingInsulationPF> bushingInsulationPFs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bushing() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getBushing();
	}

	/**
	 * Returns the value of the '<em><b>C2 Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C2 Power Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C2 Power Factor</em>' attribute.
	 * @see #isSetC2PowerFactor()
	 * @see #unsetC2PowerFactor()
	 * @see #setC2PowerFactor(float)
	 * @generated
	 */
	public float getC2PowerFactor() {
		return c2PowerFactor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2PowerFactor <em>C2 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C2 Power Factor</em>' attribute.
	 * @see #isSetC2PowerFactor()
	 * @see #unsetC2PowerFactor()
	 * @see #getC2PowerFactor()
	 * @generated
	 */
	public void setC2PowerFactor(float newC2PowerFactor) {
		c2PowerFactor = newC2PowerFactor;
		c2PowerFactorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2PowerFactor <em>C2 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetC2PowerFactor()
	 * @see #getC2PowerFactor()
	 * @see #setC2PowerFactor(float)
	 * @generated
	 */
	public void unsetC2PowerFactor() {
		c2PowerFactor = C2_POWER_FACTOR_EDEFAULT;
		c2PowerFactorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2PowerFactor <em>C2 Power Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>C2 Power Factor</em>' attribute is set.
	 * @see #unsetC2PowerFactor()
	 * @see #getC2PowerFactor()
	 * @see #setC2PowerFactor(float)
	 * @generated
	 */
	public boolean isSetC2PowerFactor() {
		return c2PowerFactorESet;
	}

	/**
	 * Returns the value of the '<em><b>C2 Capacitance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C2 Capacitance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C2 Capacitance</em>' attribute.
	 * @see #isSetC2Capacitance()
	 * @see #unsetC2Capacitance()
	 * @see #setC2Capacitance(float)
	 * @generated
	 */
	public float getC2Capacitance() {
		return c2Capacitance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2Capacitance <em>C2 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C2 Capacitance</em>' attribute.
	 * @see #isSetC2Capacitance()
	 * @see #unsetC2Capacitance()
	 * @see #getC2Capacitance()
	 * @generated
	 */
	public void setC2Capacitance(float newC2Capacitance) {
		c2Capacitance = newC2Capacitance;
		c2CapacitanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2Capacitance <em>C2 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetC2Capacitance()
	 * @see #getC2Capacitance()
	 * @see #setC2Capacitance(float)
	 * @generated
	 */
	public void unsetC2Capacitance() {
		c2Capacitance = C2_CAPACITANCE_EDEFAULT;
		c2CapacitanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2Capacitance <em>C2 Capacitance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>C2 Capacitance</em>' attribute is set.
	 * @see #unsetC2Capacitance()
	 * @see #getC2Capacitance()
	 * @see #setC2Capacitance(float)
	 * @generated
	 */
	public boolean isSetC2Capacitance() {
		return c2CapacitanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getBushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM15.IEC61970.Core.Terminal#getBushingInfo
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getTerminal <em>Terminal</em>}' reference.
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
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__BUSHING_INFO, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__BUSHING_INFO, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>C1 Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C1 Power Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C1 Power Factor</em>' attribute.
	 * @see #isSetC1PowerFactor()
	 * @see #unsetC1PowerFactor()
	 * @see #setC1PowerFactor(float)
	 * @generated
	 */
	public float getC1PowerFactor() {
		return c1PowerFactor;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1PowerFactor <em>C1 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C1 Power Factor</em>' attribute.
	 * @see #isSetC1PowerFactor()
	 * @see #unsetC1PowerFactor()
	 * @see #getC1PowerFactor()
	 * @generated
	 */
	public void setC1PowerFactor(float newC1PowerFactor) {
		c1PowerFactor = newC1PowerFactor;
		c1PowerFactorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1PowerFactor <em>C1 Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetC1PowerFactor()
	 * @see #getC1PowerFactor()
	 * @see #setC1PowerFactor(float)
	 * @generated
	 */
	public void unsetC1PowerFactor() {
		c1PowerFactor = C1_POWER_FACTOR_EDEFAULT;
		c1PowerFactorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1PowerFactor <em>C1 Power Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>C1 Power Factor</em>' attribute is set.
	 * @see #unsetC1PowerFactor()
	 * @see #getC1PowerFactor()
	 * @see #setC1PowerFactor(float)
	 * @generated
	 */
	public boolean isSetC1PowerFactor() {
		return c1PowerFactorESet;
	}

	/**
	 * Returns the value of the '<em><b>Insulation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationKind
	 * @see #isSetInsulationKind()
	 * @see #unsetInsulationKind()
	 * @see #setInsulationKind(BushingInsulationKind)
	 * @generated
	 */
	public BushingInsulationKind getInsulationKind() {
		return insulationKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getInsulationKind <em>Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationKind
	 * @see #isSetInsulationKind()
	 * @see #unsetInsulationKind()
	 * @see #getInsulationKind()
	 * @generated
	 */
	public void setInsulationKind(BushingInsulationKind newInsulationKind) {
		insulationKind = newInsulationKind == null ? INSULATION_KIND_EDEFAULT : newInsulationKind;
		insulationKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getInsulationKind <em>Insulation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulationKind()
	 * @see #getInsulationKind()
	 * @see #setInsulationKind(BushingInsulationKind)
	 * @generated
	 */
	public void unsetInsulationKind() {
		insulationKind = INSULATION_KIND_EDEFAULT;
		insulationKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getInsulationKind <em>Insulation Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulation Kind</em>' attribute is set.
	 * @see #unsetInsulationKind()
	 * @see #getInsulationKind()
	 * @see #setInsulationKind(BushingInsulationKind)
	 * @generated
	 */
	public boolean isSetInsulationKind() {
		return insulationKindESet;
	}

	/**
	 * Returns the value of the '<em><b>C1 Capacitance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C1 Capacitance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C1 Capacitance</em>' attribute.
	 * @see #isSetC1Capacitance()
	 * @see #unsetC1Capacitance()
	 * @see #setC1Capacitance(float)
	 * @generated
	 */
	public float getC1Capacitance() {
		return c1Capacitance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1Capacitance <em>C1 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C1 Capacitance</em>' attribute.
	 * @see #isSetC1Capacitance()
	 * @see #unsetC1Capacitance()
	 * @see #getC1Capacitance()
	 * @generated
	 */
	public void setC1Capacitance(float newC1Capacitance) {
		c1Capacitance = newC1Capacitance;
		c1CapacitanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1Capacitance <em>C1 Capacitance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetC1Capacitance()
	 * @see #getC1Capacitance()
	 * @see #setC1Capacitance(float)
	 * @generated
	 */
	public void unsetC1Capacitance() {
		c1Capacitance = C1_CAPACITANCE_EDEFAULT;
		c1CapacitanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1Capacitance <em>C1 Capacitance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>C1 Capacitance</em>' attribute is set.
	 * @see #unsetC1Capacitance()
	 * @see #getC1Capacitance()
	 * @see #setC1Capacitance(float)
	 * @generated
	 */
	public boolean isSetC1Capacitance() {
		return c1CapacitanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Bushing Insulation PFs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Insulation PFs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Insulation PFs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo
	 * @generated
	 */
	public EList<BushingInsulationPF> getBushingInsulationPFs() {
		if (bushingInsulationPFs == null) {
			bushingInsulationPFs = new BasicInternalEList<BushingInsulationPF>(BushingInsulationPF.class);
		}
		return bushingInsulationPFs;
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
			case InfAssetsPackage.BUSHING__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__BUSHING_INFO, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBushingInsulationPFs()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.BUSHING__TERMINAL:
				return basicSetTerminal(null, msgs);
			case InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS:
				return ((InternalEList<?>)getBushingInsulationPFs()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.BUSHING__C2_POWER_FACTOR:
				return getC2PowerFactor();
			case InfAssetsPackage.BUSHING__C2_CAPACITANCE:
				return getC2Capacitance();
			case InfAssetsPackage.BUSHING__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case InfAssetsPackage.BUSHING__C1_POWER_FACTOR:
				return getC1PowerFactor();
			case InfAssetsPackage.BUSHING__INSULATION_KIND:
				return getInsulationKind();
			case InfAssetsPackage.BUSHING__C1_CAPACITANCE:
				return getC1Capacitance();
			case InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS:
				return getBushingInsulationPFs();
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
			case InfAssetsPackage.BUSHING__C2_POWER_FACTOR:
				setC2PowerFactor((Float)newValue);
				return;
			case InfAssetsPackage.BUSHING__C2_CAPACITANCE:
				setC2Capacitance((Float)newValue);
				return;
			case InfAssetsPackage.BUSHING__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case InfAssetsPackage.BUSHING__C1_POWER_FACTOR:
				setC1PowerFactor((Float)newValue);
				return;
			case InfAssetsPackage.BUSHING__INSULATION_KIND:
				setInsulationKind((BushingInsulationKind)newValue);
				return;
			case InfAssetsPackage.BUSHING__C1_CAPACITANCE:
				setC1Capacitance((Float)newValue);
				return;
			case InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS:
				getBushingInsulationPFs().clear();
				getBushingInsulationPFs().addAll((Collection<? extends BushingInsulationPF>)newValue);
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
			case InfAssetsPackage.BUSHING__C2_POWER_FACTOR:
				unsetC2PowerFactor();
				return;
			case InfAssetsPackage.BUSHING__C2_CAPACITANCE:
				unsetC2Capacitance();
				return;
			case InfAssetsPackage.BUSHING__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case InfAssetsPackage.BUSHING__C1_POWER_FACTOR:
				unsetC1PowerFactor();
				return;
			case InfAssetsPackage.BUSHING__INSULATION_KIND:
				unsetInsulationKind();
				return;
			case InfAssetsPackage.BUSHING__C1_CAPACITANCE:
				unsetC1Capacitance();
				return;
			case InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS:
				getBushingInsulationPFs().clear();
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
			case InfAssetsPackage.BUSHING__C2_POWER_FACTOR:
				return isSetC2PowerFactor();
			case InfAssetsPackage.BUSHING__C2_CAPACITANCE:
				return isSetC2Capacitance();
			case InfAssetsPackage.BUSHING__TERMINAL:
				return terminal != null;
			case InfAssetsPackage.BUSHING__C1_POWER_FACTOR:
				return isSetC1PowerFactor();
			case InfAssetsPackage.BUSHING__INSULATION_KIND:
				return isSetInsulationKind();
			case InfAssetsPackage.BUSHING__C1_CAPACITANCE:
				return isSetC1Capacitance();
			case InfAssetsPackage.BUSHING__BUSHING_INSULATION_PFS:
				return bushingInsulationPFs != null && !bushingInsulationPFs.isEmpty();
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
		result.append(" (c2PowerFactor: ");
		if (c2PowerFactorESet) result.append(c2PowerFactor); else result.append("<unset>");
		result.append(", c2Capacitance: ");
		if (c2CapacitanceESet) result.append(c2Capacitance); else result.append("<unset>");
		result.append(", c1PowerFactor: ");
		if (c1PowerFactorESet) result.append(c1PowerFactor); else result.append("<unset>");
		result.append(", insulationKind: ");
		if (insulationKindESet) result.append(insulationKind); else result.append("<unset>");
		result.append(", c1Capacitance: ");
		if (c1CapacitanceESet) result.append(c1Capacitance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Bushing
