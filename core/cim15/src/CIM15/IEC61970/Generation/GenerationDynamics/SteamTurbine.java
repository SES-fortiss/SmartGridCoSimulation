/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steam Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SteamTurbine extends PrimeMover {
	/**
	 * The default value of the '{@link #getShaft1PowerIP() <em>Shaft1 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerIP()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT1_POWER_IP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft1PowerIP() <em>Shaft1 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerIP()
	 * @generated
	 * @ordered
	 */
	protected float shaft1PowerIP = SHAFT1_POWER_IP_EDEFAULT;

	/**
	 * This is true if the Shaft1 Power IP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shaft1PowerIPESet;

	/**
	 * The default value of the '{@link #getShaft2PowerIP() <em>Shaft2 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerIP()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT2_POWER_IP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft2PowerIP() <em>Shaft2 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerIP()
	 * @generated
	 * @ordered
	 */
	protected float shaft2PowerIP = SHAFT2_POWER_IP_EDEFAULT;

	/**
	 * This is true if the Shaft2 Power IP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shaft2PowerIPESet;

	/**
	 * The default value of the '{@link #getCrossoverTC() <em>Crossover TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossoverTC()
	 * @generated
	 * @ordered
	 */
	protected static final float CROSSOVER_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCrossoverTC() <em>Crossover TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossoverTC()
	 * @generated
	 * @ordered
	 */
	protected float crossoverTC = CROSSOVER_TC_EDEFAULT;

	/**
	 * This is true if the Crossover TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crossoverTCESet;

	/**
	 * The cached value of the '{@link #getSteamSupplys() <em>Steam Supplys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSupplys()
	 * @generated
	 * @ordered
	 */
	protected EList<SteamSupply> steamSupplys;

	/**
	 * The default value of the '{@link #getShaft1PowerLP1() <em>Shaft1 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerLP1()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT1_POWER_LP1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft1PowerLP1() <em>Shaft1 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerLP1()
	 * @generated
	 * @ordered
	 */
	protected float shaft1PowerLP1 = SHAFT1_POWER_LP1_EDEFAULT;

	/**
	 * This is true if the Shaft1 Power LP1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shaft1PowerLP1ESet;

	/**
	 * The default value of the '{@link #getShaft1PowerLP2() <em>Shaft1 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerLP2()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT1_POWER_LP2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft1PowerLP2() <em>Shaft1 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerLP2()
	 * @generated
	 * @ordered
	 */
	protected float shaft1PowerLP2 = SHAFT1_POWER_LP2_EDEFAULT;

	/**
	 * This is true if the Shaft1 Power LP2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shaft1PowerLP2ESet;

	/**
	 * The default value of the '{@link #getReheater1TC() <em>Reheater1 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReheater1TC()
	 * @generated
	 * @ordered
	 */
	protected static final float REHEATER1_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReheater1TC() <em>Reheater1 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReheater1TC()
	 * @generated
	 * @ordered
	 */
	protected float reheater1TC = REHEATER1_TC_EDEFAULT;

	/**
	 * This is true if the Reheater1 TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reheater1TCESet;

	/**
	 * The default value of the '{@link #getShaft2PowerLP1() <em>Shaft2 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerLP1()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT2_POWER_LP1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft2PowerLP1() <em>Shaft2 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerLP1()
	 * @generated
	 * @ordered
	 */
	protected float shaft2PowerLP1 = SHAFT2_POWER_LP1_EDEFAULT;

	/**
	 * This is true if the Shaft2 Power LP1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shaft2PowerLP1ESet;

	/**
	 * The default value of the '{@link #getShaft2PowerLP2() <em>Shaft2 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerLP2()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT2_POWER_LP2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft2PowerLP2() <em>Shaft2 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerLP2()
	 * @generated
	 * @ordered
	 */
	protected float shaft2PowerLP2 = SHAFT2_POWER_LP2_EDEFAULT;

	/**
	 * This is true if the Shaft2 Power LP2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shaft2PowerLP2ESet;

	/**
	 * The default value of the '{@link #getReheater2TC() <em>Reheater2 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReheater2TC()
	 * @generated
	 * @ordered
	 */
	protected static final float REHEATER2_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReheater2TC() <em>Reheater2 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReheater2TC()
	 * @generated
	 * @ordered
	 */
	protected float reheater2TC = REHEATER2_TC_EDEFAULT;

	/**
	 * This is true if the Reheater2 TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reheater2TCESet;

	/**
	 * The default value of the '{@link #getSteamChestTC() <em>Steam Chest TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamChestTC()
	 * @generated
	 * @ordered
	 */
	protected static final float STEAM_CHEST_TC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteamChestTC() <em>Steam Chest TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamChestTC()
	 * @generated
	 * @ordered
	 */
	protected float steamChestTC = STEAM_CHEST_TC_EDEFAULT;

	/**
	 * This is true if the Steam Chest TC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steamChestTCESet;

	/**
	 * The default value of the '{@link #getShaft1PowerHP() <em>Shaft1 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerHP()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT1_POWER_HP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft1PowerHP() <em>Shaft1 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft1PowerHP()
	 * @generated
	 * @ordered
	 */
	protected float shaft1PowerHP = SHAFT1_POWER_HP_EDEFAULT;

	/**
	 * This is true if the Shaft1 Power HP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shaft1PowerHPESet;

	/**
	 * The default value of the '{@link #getShaft2PowerHP() <em>Shaft2 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerHP()
	 * @generated
	 * @ordered
	 */
	protected static final float SHAFT2_POWER_HP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShaft2PowerHP() <em>Shaft2 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaft2PowerHP()
	 * @generated
	 * @ordered
	 */
	protected float shaft2PowerHP = SHAFT2_POWER_HP_EDEFAULT;

	/**
	 * This is true if the Shaft2 Power HP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shaft2PowerHPESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SteamTurbine() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.STEAM_TURBINE;
	}

	/**
	 * Returns the value of the '<em><b>Shaft1 Power IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft1 Power IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft1 Power IP</em>' attribute.
	 * @see #isSetShaft1PowerIP()
	 * @see #unsetShaft1PowerIP()
	 * @see #setShaft1PowerIP(float)
	 * @generated
	 */
	public float getShaft1PowerIP() {
		return shaft1PowerIP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft1 Power IP</em>' attribute.
	 * @see #isSetShaft1PowerIP()
	 * @see #unsetShaft1PowerIP()
	 * @see #getShaft1PowerIP()
	 * @generated
	 */
	public void setShaft1PowerIP(float newShaft1PowerIP) {
		shaft1PowerIP = newShaft1PowerIP;
		shaft1PowerIPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShaft1PowerIP()
	 * @see #getShaft1PowerIP()
	 * @see #setShaft1PowerIP(float)
	 * @generated
	 */
	public void unsetShaft1PowerIP() {
		shaft1PowerIP = SHAFT1_POWER_IP_EDEFAULT;
		shaft1PowerIPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shaft1 Power IP</em>' attribute is set.
	 * @see #unsetShaft1PowerIP()
	 * @see #getShaft1PowerIP()
	 * @see #setShaft1PowerIP(float)
	 * @generated
	 */
	public boolean isSetShaft1PowerIP() {
		return shaft1PowerIPESet;
	}

	/**
	 * Returns the value of the '<em><b>Shaft2 Power IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft2 Power IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft2 Power IP</em>' attribute.
	 * @see #isSetShaft2PowerIP()
	 * @see #unsetShaft2PowerIP()
	 * @see #setShaft2PowerIP(float)
	 * @generated
	 */
	public float getShaft2PowerIP() {
		return shaft2PowerIP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft2 Power IP</em>' attribute.
	 * @see #isSetShaft2PowerIP()
	 * @see #unsetShaft2PowerIP()
	 * @see #getShaft2PowerIP()
	 * @generated
	 */
	public void setShaft2PowerIP(float newShaft2PowerIP) {
		shaft2PowerIP = newShaft2PowerIP;
		shaft2PowerIPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShaft2PowerIP()
	 * @see #getShaft2PowerIP()
	 * @see #setShaft2PowerIP(float)
	 * @generated
	 */
	public void unsetShaft2PowerIP() {
		shaft2PowerIP = SHAFT2_POWER_IP_EDEFAULT;
		shaft2PowerIPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shaft2 Power IP</em>' attribute is set.
	 * @see #unsetShaft2PowerIP()
	 * @see #getShaft2PowerIP()
	 * @see #setShaft2PowerIP(float)
	 * @generated
	 */
	public boolean isSetShaft2PowerIP() {
		return shaft2PowerIPESet;
	}

	/**
	 * Returns the value of the '<em><b>Crossover TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crossover TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossover TC</em>' attribute.
	 * @see #isSetCrossoverTC()
	 * @see #unsetCrossoverTC()
	 * @see #setCrossoverTC(float)
	 * @generated
	 */
	public float getCrossoverTC() {
		return crossoverTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossover TC</em>' attribute.
	 * @see #isSetCrossoverTC()
	 * @see #unsetCrossoverTC()
	 * @see #getCrossoverTC()
	 * @generated
	 */
	public void setCrossoverTC(float newCrossoverTC) {
		crossoverTC = newCrossoverTC;
		crossoverTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrossoverTC()
	 * @see #getCrossoverTC()
	 * @see #setCrossoverTC(float)
	 * @generated
	 */
	public void unsetCrossoverTC() {
		crossoverTC = CROSSOVER_TC_EDEFAULT;
		crossoverTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crossover TC</em>' attribute is set.
	 * @see #unsetCrossoverTC()
	 * @see #getCrossoverTC()
	 * @see #setCrossoverTC(float)
	 * @generated
	 */
	public boolean isSetCrossoverTC() {
		return crossoverTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Steam Supplys</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.GenerationDynamics.SteamSupply}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Supplys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Supplys</em>' reference list.
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.SteamSupply#getSteamTurbines
	 * @generated
	 */
	public EList<SteamSupply> getSteamSupplys() {
		if (steamSupplys == null) {
			steamSupplys = new BasicInternalEList<SteamSupply>(SteamSupply.class);
		}
		return steamSupplys;
	}

	/**
	 * Returns the value of the '<em><b>Shaft1 Power LP1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft1 Power LP1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft1 Power LP1</em>' attribute.
	 * @see #isSetShaft1PowerLP1()
	 * @see #unsetShaft1PowerLP1()
	 * @see #setShaft1PowerLP1(float)
	 * @generated
	 */
	public float getShaft1PowerLP1() {
		return shaft1PowerLP1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft1 Power LP1</em>' attribute.
	 * @see #isSetShaft1PowerLP1()
	 * @see #unsetShaft1PowerLP1()
	 * @see #getShaft1PowerLP1()
	 * @generated
	 */
	public void setShaft1PowerLP1(float newShaft1PowerLP1) {
		shaft1PowerLP1 = newShaft1PowerLP1;
		shaft1PowerLP1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShaft1PowerLP1()
	 * @see #getShaft1PowerLP1()
	 * @see #setShaft1PowerLP1(float)
	 * @generated
	 */
	public void unsetShaft1PowerLP1() {
		shaft1PowerLP1 = SHAFT1_POWER_LP1_EDEFAULT;
		shaft1PowerLP1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shaft1 Power LP1</em>' attribute is set.
	 * @see #unsetShaft1PowerLP1()
	 * @see #getShaft1PowerLP1()
	 * @see #setShaft1PowerLP1(float)
	 * @generated
	 */
	public boolean isSetShaft1PowerLP1() {
		return shaft1PowerLP1ESet;
	}

	/**
	 * Returns the value of the '<em><b>Shaft1 Power LP2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft1 Power LP2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft1 Power LP2</em>' attribute.
	 * @see #isSetShaft1PowerLP2()
	 * @see #unsetShaft1PowerLP2()
	 * @see #setShaft1PowerLP2(float)
	 * @generated
	 */
	public float getShaft1PowerLP2() {
		return shaft1PowerLP2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft1 Power LP2</em>' attribute.
	 * @see #isSetShaft1PowerLP2()
	 * @see #unsetShaft1PowerLP2()
	 * @see #getShaft1PowerLP2()
	 * @generated
	 */
	public void setShaft1PowerLP2(float newShaft1PowerLP2) {
		shaft1PowerLP2 = newShaft1PowerLP2;
		shaft1PowerLP2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShaft1PowerLP2()
	 * @see #getShaft1PowerLP2()
	 * @see #setShaft1PowerLP2(float)
	 * @generated
	 */
	public void unsetShaft1PowerLP2() {
		shaft1PowerLP2 = SHAFT1_POWER_LP2_EDEFAULT;
		shaft1PowerLP2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shaft1 Power LP2</em>' attribute is set.
	 * @see #unsetShaft1PowerLP2()
	 * @see #getShaft1PowerLP2()
	 * @see #setShaft1PowerLP2(float)
	 * @generated
	 */
	public boolean isSetShaft1PowerLP2() {
		return shaft1PowerLP2ESet;
	}

	/**
	 * Returns the value of the '<em><b>Reheater1 TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reheater1 TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reheater1 TC</em>' attribute.
	 * @see #isSetReheater1TC()
	 * @see #unsetReheater1TC()
	 * @see #setReheater1TC(float)
	 * @generated
	 */
	public float getReheater1TC() {
		return reheater1TC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reheater1 TC</em>' attribute.
	 * @see #isSetReheater1TC()
	 * @see #unsetReheater1TC()
	 * @see #getReheater1TC()
	 * @generated
	 */
	public void setReheater1TC(float newReheater1TC) {
		reheater1TC = newReheater1TC;
		reheater1TCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReheater1TC()
	 * @see #getReheater1TC()
	 * @see #setReheater1TC(float)
	 * @generated
	 */
	public void unsetReheater1TC() {
		reheater1TC = REHEATER1_TC_EDEFAULT;
		reheater1TCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reheater1 TC</em>' attribute is set.
	 * @see #unsetReheater1TC()
	 * @see #getReheater1TC()
	 * @see #setReheater1TC(float)
	 * @generated
	 */
	public boolean isSetReheater1TC() {
		return reheater1TCESet;
	}

	/**
	 * Returns the value of the '<em><b>Shaft2 Power LP1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft2 Power LP1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft2 Power LP1</em>' attribute.
	 * @see #isSetShaft2PowerLP1()
	 * @see #unsetShaft2PowerLP1()
	 * @see #setShaft2PowerLP1(float)
	 * @generated
	 */
	public float getShaft2PowerLP1() {
		return shaft2PowerLP1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft2 Power LP1</em>' attribute.
	 * @see #isSetShaft2PowerLP1()
	 * @see #unsetShaft2PowerLP1()
	 * @see #getShaft2PowerLP1()
	 * @generated
	 */
	public void setShaft2PowerLP1(float newShaft2PowerLP1) {
		shaft2PowerLP1 = newShaft2PowerLP1;
		shaft2PowerLP1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShaft2PowerLP1()
	 * @see #getShaft2PowerLP1()
	 * @see #setShaft2PowerLP1(float)
	 * @generated
	 */
	public void unsetShaft2PowerLP1() {
		shaft2PowerLP1 = SHAFT2_POWER_LP1_EDEFAULT;
		shaft2PowerLP1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shaft2 Power LP1</em>' attribute is set.
	 * @see #unsetShaft2PowerLP1()
	 * @see #getShaft2PowerLP1()
	 * @see #setShaft2PowerLP1(float)
	 * @generated
	 */
	public boolean isSetShaft2PowerLP1() {
		return shaft2PowerLP1ESet;
	}

	/**
	 * Returns the value of the '<em><b>Shaft2 Power LP2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft2 Power LP2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft2 Power LP2</em>' attribute.
	 * @see #isSetShaft2PowerLP2()
	 * @see #unsetShaft2PowerLP2()
	 * @see #setShaft2PowerLP2(float)
	 * @generated
	 */
	public float getShaft2PowerLP2() {
		return shaft2PowerLP2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft2 Power LP2</em>' attribute.
	 * @see #isSetShaft2PowerLP2()
	 * @see #unsetShaft2PowerLP2()
	 * @see #getShaft2PowerLP2()
	 * @generated
	 */
	public void setShaft2PowerLP2(float newShaft2PowerLP2) {
		shaft2PowerLP2 = newShaft2PowerLP2;
		shaft2PowerLP2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShaft2PowerLP2()
	 * @see #getShaft2PowerLP2()
	 * @see #setShaft2PowerLP2(float)
	 * @generated
	 */
	public void unsetShaft2PowerLP2() {
		shaft2PowerLP2 = SHAFT2_POWER_LP2_EDEFAULT;
		shaft2PowerLP2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shaft2 Power LP2</em>' attribute is set.
	 * @see #unsetShaft2PowerLP2()
	 * @see #getShaft2PowerLP2()
	 * @see #setShaft2PowerLP2(float)
	 * @generated
	 */
	public boolean isSetShaft2PowerLP2() {
		return shaft2PowerLP2ESet;
	}

	/**
	 * Returns the value of the '<em><b>Reheater2 TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reheater2 TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reheater2 TC</em>' attribute.
	 * @see #isSetReheater2TC()
	 * @see #unsetReheater2TC()
	 * @see #setReheater2TC(float)
	 * @generated
	 */
	public float getReheater2TC() {
		return reheater2TC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reheater2 TC</em>' attribute.
	 * @see #isSetReheater2TC()
	 * @see #unsetReheater2TC()
	 * @see #getReheater2TC()
	 * @generated
	 */
	public void setReheater2TC(float newReheater2TC) {
		reheater2TC = newReheater2TC;
		reheater2TCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReheater2TC()
	 * @see #getReheater2TC()
	 * @see #setReheater2TC(float)
	 * @generated
	 */
	public void unsetReheater2TC() {
		reheater2TC = REHEATER2_TC_EDEFAULT;
		reheater2TCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reheater2 TC</em>' attribute is set.
	 * @see #unsetReheater2TC()
	 * @see #getReheater2TC()
	 * @see #setReheater2TC(float)
	 * @generated
	 */
	public boolean isSetReheater2TC() {
		return reheater2TCESet;
	}

	/**
	 * Returns the value of the '<em><b>Steam Chest TC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Chest TC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Chest TC</em>' attribute.
	 * @see #isSetSteamChestTC()
	 * @see #unsetSteamChestTC()
	 * @see #setSteamChestTC(float)
	 * @generated
	 */
	public float getSteamChestTC() {
		return steamChestTC;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Chest TC</em>' attribute.
	 * @see #isSetSteamChestTC()
	 * @see #unsetSteamChestTC()
	 * @see #getSteamChestTC()
	 * @generated
	 */
	public void setSteamChestTC(float newSteamChestTC) {
		steamChestTC = newSteamChestTC;
		steamChestTCESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteamChestTC()
	 * @see #getSteamChestTC()
	 * @see #setSteamChestTC(float)
	 * @generated
	 */
	public void unsetSteamChestTC() {
		steamChestTC = STEAM_CHEST_TC_EDEFAULT;
		steamChestTCESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steam Chest TC</em>' attribute is set.
	 * @see #unsetSteamChestTC()
	 * @see #getSteamChestTC()
	 * @see #setSteamChestTC(float)
	 * @generated
	 */
	public boolean isSetSteamChestTC() {
		return steamChestTCESet;
	}

	/**
	 * Returns the value of the '<em><b>Shaft1 Power HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft1 Power HP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft1 Power HP</em>' attribute.
	 * @see #isSetShaft1PowerHP()
	 * @see #unsetShaft1PowerHP()
	 * @see #setShaft1PowerHP(float)
	 * @generated
	 */
	public float getShaft1PowerHP() {
		return shaft1PowerHP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft1 Power HP</em>' attribute.
	 * @see #isSetShaft1PowerHP()
	 * @see #unsetShaft1PowerHP()
	 * @see #getShaft1PowerHP()
	 * @generated
	 */
	public void setShaft1PowerHP(float newShaft1PowerHP) {
		shaft1PowerHP = newShaft1PowerHP;
		shaft1PowerHPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShaft1PowerHP()
	 * @see #getShaft1PowerHP()
	 * @see #setShaft1PowerHP(float)
	 * @generated
	 */
	public void unsetShaft1PowerHP() {
		shaft1PowerHP = SHAFT1_POWER_HP_EDEFAULT;
		shaft1PowerHPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shaft1 Power HP</em>' attribute is set.
	 * @see #unsetShaft1PowerHP()
	 * @see #getShaft1PowerHP()
	 * @see #setShaft1PowerHP(float)
	 * @generated
	 */
	public boolean isSetShaft1PowerHP() {
		return shaft1PowerHPESet;
	}

	/**
	 * Returns the value of the '<em><b>Shaft2 Power HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaft2 Power HP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft2 Power HP</em>' attribute.
	 * @see #isSetShaft2PowerHP()
	 * @see #unsetShaft2PowerHP()
	 * @see #setShaft2PowerHP(float)
	 * @generated
	 */
	public float getShaft2PowerHP() {
		return shaft2PowerHP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft2 Power HP</em>' attribute.
	 * @see #isSetShaft2PowerHP()
	 * @see #unsetShaft2PowerHP()
	 * @see #getShaft2PowerHP()
	 * @generated
	 */
	public void setShaft2PowerHP(float newShaft2PowerHP) {
		shaft2PowerHP = newShaft2PowerHP;
		shaft2PowerHPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShaft2PowerHP()
	 * @see #getShaft2PowerHP()
	 * @see #setShaft2PowerHP(float)
	 * @generated
	 */
	public void unsetShaft2PowerHP() {
		shaft2PowerHP = SHAFT2_POWER_HP_EDEFAULT;
		shaft2PowerHPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shaft2 Power HP</em>' attribute is set.
	 * @see #unsetShaft2PowerHP()
	 * @see #getShaft2PowerHP()
	 * @see #setShaft2PowerHP(float)
	 * @generated
	 */
	public boolean isSetShaft2PowerHP() {
		return shaft2PowerHPESet;
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
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteamSupplys()).basicAdd(otherEnd, msgs);
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
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				return ((InternalEList<?>)getSteamSupplys()).basicRemove(otherEnd, msgs);
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
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
				return getShaft1PowerIP();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
				return getShaft2PowerIP();
			case GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC:
				return getCrossoverTC();
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				return getSteamSupplys();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
				return getShaft1PowerLP1();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
				return getShaft1PowerLP2();
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC:
				return getReheater1TC();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
				return getShaft2PowerLP1();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
				return getShaft2PowerLP2();
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC:
				return getReheater2TC();
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC:
				return getSteamChestTC();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
				return getShaft1PowerHP();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
				return getShaft2PowerHP();
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
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
				setShaft1PowerIP((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
				setShaft2PowerIP((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC:
				setCrossoverTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				getSteamSupplys().clear();
				getSteamSupplys().addAll((Collection<? extends SteamSupply>)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
				setShaft1PowerLP1((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
				setShaft1PowerLP2((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC:
				setReheater1TC((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
				setShaft2PowerLP1((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
				setShaft2PowerLP2((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC:
				setReheater2TC((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC:
				setSteamChestTC((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
				setShaft1PowerHP((Float)newValue);
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
				setShaft2PowerHP((Float)newValue);
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
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
				unsetShaft1PowerIP();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
				unsetShaft2PowerIP();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC:
				unsetCrossoverTC();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				getSteamSupplys().clear();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
				unsetShaft1PowerLP1();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
				unsetShaft1PowerLP2();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC:
				unsetReheater1TC();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
				unsetShaft2PowerLP1();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
				unsetShaft2PowerLP2();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC:
				unsetReheater2TC();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC:
				unsetSteamChestTC();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
				unsetShaft1PowerHP();
				return;
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
				unsetShaft2PowerHP();
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
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
				return isSetShaft1PowerIP();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
				return isSetShaft2PowerIP();
			case GenerationDynamicsPackage.STEAM_TURBINE__CROSSOVER_TC:
				return isSetCrossoverTC();
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_SUPPLYS:
				return steamSupplys != null && !steamSupplys.isEmpty();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
				return isSetShaft1PowerLP1();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
				return isSetShaft1PowerLP2();
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER1_TC:
				return isSetReheater1TC();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
				return isSetShaft2PowerLP1();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
				return isSetShaft2PowerLP2();
			case GenerationDynamicsPackage.STEAM_TURBINE__REHEATER2_TC:
				return isSetReheater2TC();
			case GenerationDynamicsPackage.STEAM_TURBINE__STEAM_CHEST_TC:
				return isSetSteamChestTC();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
				return isSetShaft1PowerHP();
			case GenerationDynamicsPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
				return isSetShaft2PowerHP();
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
		result.append(" (shaft1PowerIP: ");
		if (shaft1PowerIPESet) result.append(shaft1PowerIP); else result.append("<unset>");
		result.append(", shaft2PowerIP: ");
		if (shaft2PowerIPESet) result.append(shaft2PowerIP); else result.append("<unset>");
		result.append(", crossoverTC: ");
		if (crossoverTCESet) result.append(crossoverTC); else result.append("<unset>");
		result.append(", shaft1PowerLP1: ");
		if (shaft1PowerLP1ESet) result.append(shaft1PowerLP1); else result.append("<unset>");
		result.append(", shaft1PowerLP2: ");
		if (shaft1PowerLP2ESet) result.append(shaft1PowerLP2); else result.append("<unset>");
		result.append(", reheater1TC: ");
		if (reheater1TCESet) result.append(reheater1TC); else result.append("<unset>");
		result.append(", shaft2PowerLP1: ");
		if (shaft2PowerLP1ESet) result.append(shaft2PowerLP1); else result.append("<unset>");
		result.append(", shaft2PowerLP2: ");
		if (shaft2PowerLP2ESet) result.append(shaft2PowerLP2); else result.append("<unset>");
		result.append(", reheater2TC: ");
		if (reheater2TCESet) result.append(reheater2TC); else result.append("<unset>");
		result.append(", steamChestTC: ");
		if (steamChestTCESet) result.append(steamChestTC); else result.append("<unset>");
		result.append(", shaft1PowerHP: ");
		if (shaft1PowerHPESet) result.append(shaft1PowerHP); else result.append("<unset>");
		result.append(", shaft2PowerHP: ");
		if (shaft2PowerHPESet) result.append(shaft2PowerHP); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SteamTurbine
