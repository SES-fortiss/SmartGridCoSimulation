/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.PowerSystemResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cogeneration Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getRatedP <em>Rated P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CogenerationPlant extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getSteamSendoutSchedule() <em>Steam Sendout Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteamSendoutSchedule()
	 * @generated
	 * @ordered
	 */
	protected SteamSendoutSchedule steamSendoutSchedule;

	/**
	 * The default value of the '{@link #getCogenLPSteamRating() <em>Cogen LP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenLPSteamRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COGEN_LP_STEAM_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCogenLPSteamRating() <em>Cogen LP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenLPSteamRating()
	 * @generated
	 * @ordered
	 */
	protected float cogenLPSteamRating = COGEN_LP_STEAM_RATING_EDEFAULT;

	/**
	 * This is true if the Cogen LP Steam Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cogenLPSteamRatingESet;

	/**
	 * The default value of the '{@link #getCogenLPSendoutRating() <em>Cogen LP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenLPSendoutRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COGEN_LP_SENDOUT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCogenLPSendoutRating() <em>Cogen LP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenLPSendoutRating()
	 * @generated
	 * @ordered
	 */
	protected float cogenLPSendoutRating = COGEN_LP_SENDOUT_RATING_EDEFAULT;

	/**
	 * This is true if the Cogen LP Sendout Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cogenLPSendoutRatingESet;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnits() <em>Thermal Generating Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ThermalGeneratingUnit> thermalGeneratingUnits;

	/**
	 * The default value of the '{@link #getRatedP() <em>Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedP()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedP() <em>Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedP()
	 * @generated
	 * @ordered
	 */
	protected float ratedP = RATED_P_EDEFAULT;

	/**
	 * This is true if the Rated P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedPESet;

	/**
	 * The default value of the '{@link #getCogenHPSendoutRating() <em>Cogen HP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenHPSendoutRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COGEN_HP_SENDOUT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCogenHPSendoutRating() <em>Cogen HP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenHPSendoutRating()
	 * @generated
	 * @ordered
	 */
	protected float cogenHPSendoutRating = COGEN_HP_SENDOUT_RATING_EDEFAULT;

	/**
	 * This is true if the Cogen HP Sendout Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cogenHPSendoutRatingESet;

	/**
	 * The default value of the '{@link #getCogenHPSteamRating() <em>Cogen HP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenHPSteamRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COGEN_HP_STEAM_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCogenHPSteamRating() <em>Cogen HP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCogenHPSteamRating()
	 * @generated
	 * @ordered
	 */
	protected float cogenHPSteamRating = COGEN_HP_STEAM_RATING_EDEFAULT;

	/**
	 * This is true if the Cogen HP Steam Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cogenHPSteamRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CogenerationPlant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.COGENERATION_PLANT;
	}

	/**
	 * Returns the value of the '<em><b>Steam Sendout Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steam Sendout Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steam Sendout Schedule</em>' reference.
	 * @see #setSteamSendoutSchedule(SteamSendoutSchedule)
	 * @see CIM15.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant
	 * @generated
	 */
	public SteamSendoutSchedule getSteamSendoutSchedule() {
		if (steamSendoutSchedule != null && steamSendoutSchedule.eIsProxy()) {
			InternalEObject oldSteamSendoutSchedule = (InternalEObject)steamSendoutSchedule;
			steamSendoutSchedule = (SteamSendoutSchedule)eResolveProxy(oldSteamSendoutSchedule);
			if (steamSendoutSchedule != oldSteamSendoutSchedule) {
			}
		}
		return steamSendoutSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SteamSendoutSchedule basicGetSteamSendoutSchedule() {
		return steamSendoutSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteamSendoutSchedule(SteamSendoutSchedule newSteamSendoutSchedule, NotificationChain msgs) {
		SteamSendoutSchedule oldSteamSendoutSchedule = steamSendoutSchedule;
		steamSendoutSchedule = newSteamSendoutSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steam Sendout Schedule</em>' reference.
	 * @see #getSteamSendoutSchedule()
	 * @generated
	 */
	public void setSteamSendoutSchedule(SteamSendoutSchedule newSteamSendoutSchedule) {
		if (newSteamSendoutSchedule != steamSendoutSchedule) {
			NotificationChain msgs = null;
			if (steamSendoutSchedule != null)
				msgs = ((InternalEObject)steamSendoutSchedule).eInverseRemove(this, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs);
			if (newSteamSendoutSchedule != null)
				msgs = ((InternalEObject)newSteamSendoutSchedule).eInverseAdd(this, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs);
			msgs = basicSetSteamSendoutSchedule(newSteamSendoutSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cogen LP Steam Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogen LP Steam Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogen LP Steam Rating</em>' attribute.
	 * @see #isSetCogenLPSteamRating()
	 * @see #unsetCogenLPSteamRating()
	 * @see #setCogenLPSteamRating(float)
	 * @generated
	 */
	public float getCogenLPSteamRating() {
		return cogenLPSteamRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogen LP Steam Rating</em>' attribute.
	 * @see #isSetCogenLPSteamRating()
	 * @see #unsetCogenLPSteamRating()
	 * @see #getCogenLPSteamRating()
	 * @generated
	 */
	public void setCogenLPSteamRating(float newCogenLPSteamRating) {
		cogenLPSteamRating = newCogenLPSteamRating;
		cogenLPSteamRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCogenLPSteamRating()
	 * @see #getCogenLPSteamRating()
	 * @see #setCogenLPSteamRating(float)
	 * @generated
	 */
	public void unsetCogenLPSteamRating() {
		cogenLPSteamRating = COGEN_LP_STEAM_RATING_EDEFAULT;
		cogenLPSteamRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cogen LP Steam Rating</em>' attribute is set.
	 * @see #unsetCogenLPSteamRating()
	 * @see #getCogenLPSteamRating()
	 * @see #setCogenLPSteamRating(float)
	 * @generated
	 */
	public boolean isSetCogenLPSteamRating() {
		return cogenLPSteamRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Cogen LP Sendout Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogen LP Sendout Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogen LP Sendout Rating</em>' attribute.
	 * @see #isSetCogenLPSendoutRating()
	 * @see #unsetCogenLPSendoutRating()
	 * @see #setCogenLPSendoutRating(float)
	 * @generated
	 */
	public float getCogenLPSendoutRating() {
		return cogenLPSendoutRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogen LP Sendout Rating</em>' attribute.
	 * @see #isSetCogenLPSendoutRating()
	 * @see #unsetCogenLPSendoutRating()
	 * @see #getCogenLPSendoutRating()
	 * @generated
	 */
	public void setCogenLPSendoutRating(float newCogenLPSendoutRating) {
		cogenLPSendoutRating = newCogenLPSendoutRating;
		cogenLPSendoutRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCogenLPSendoutRating()
	 * @see #getCogenLPSendoutRating()
	 * @see #setCogenLPSendoutRating(float)
	 * @generated
	 */
	public void unsetCogenLPSendoutRating() {
		cogenLPSendoutRating = COGEN_LP_SENDOUT_RATING_EDEFAULT;
		cogenLPSendoutRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cogen LP Sendout Rating</em>' attribute is set.
	 * @see #unsetCogenLPSendoutRating()
	 * @see #getCogenLPSendoutRating()
	 * @see #setCogenLPSendoutRating(float)
	 * @generated
	 */
	public boolean isSetCogenLPSendoutRating() {
		return cogenLPSendoutRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Units</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant
	 * @generated
	 */
	public EList<ThermalGeneratingUnit> getThermalGeneratingUnits() {
		if (thermalGeneratingUnits == null) {
			thermalGeneratingUnits = new BasicInternalEList<ThermalGeneratingUnit>(ThermalGeneratingUnit.class);
		}
		return thermalGeneratingUnits;
	}

	/**
	 * Returns the value of the '<em><b>Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated P</em>' attribute.
	 * @see #isSetRatedP()
	 * @see #unsetRatedP()
	 * @see #setRatedP(float)
	 * @generated
	 */
	public float getRatedP() {
		return ratedP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getRatedP <em>Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated P</em>' attribute.
	 * @see #isSetRatedP()
	 * @see #unsetRatedP()
	 * @see #getRatedP()
	 * @generated
	 */
	public void setRatedP(float newRatedP) {
		ratedP = newRatedP;
		ratedPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getRatedP <em>Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedP()
	 * @see #getRatedP()
	 * @see #setRatedP(float)
	 * @generated
	 */
	public void unsetRatedP() {
		ratedP = RATED_P_EDEFAULT;
		ratedPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getRatedP <em>Rated P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated P</em>' attribute is set.
	 * @see #unsetRatedP()
	 * @see #getRatedP()
	 * @see #setRatedP(float)
	 * @generated
	 */
	public boolean isSetRatedP() {
		return ratedPESet;
	}

	/**
	 * Returns the value of the '<em><b>Cogen HP Sendout Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogen HP Sendout Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogen HP Sendout Rating</em>' attribute.
	 * @see #isSetCogenHPSendoutRating()
	 * @see #unsetCogenHPSendoutRating()
	 * @see #setCogenHPSendoutRating(float)
	 * @generated
	 */
	public float getCogenHPSendoutRating() {
		return cogenHPSendoutRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogen HP Sendout Rating</em>' attribute.
	 * @see #isSetCogenHPSendoutRating()
	 * @see #unsetCogenHPSendoutRating()
	 * @see #getCogenHPSendoutRating()
	 * @generated
	 */
	public void setCogenHPSendoutRating(float newCogenHPSendoutRating) {
		cogenHPSendoutRating = newCogenHPSendoutRating;
		cogenHPSendoutRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCogenHPSendoutRating()
	 * @see #getCogenHPSendoutRating()
	 * @see #setCogenHPSendoutRating(float)
	 * @generated
	 */
	public void unsetCogenHPSendoutRating() {
		cogenHPSendoutRating = COGEN_HP_SENDOUT_RATING_EDEFAULT;
		cogenHPSendoutRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cogen HP Sendout Rating</em>' attribute is set.
	 * @see #unsetCogenHPSendoutRating()
	 * @see #getCogenHPSendoutRating()
	 * @see #setCogenHPSendoutRating(float)
	 * @generated
	 */
	public boolean isSetCogenHPSendoutRating() {
		return cogenHPSendoutRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Cogen HP Steam Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cogen HP Steam Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cogen HP Steam Rating</em>' attribute.
	 * @see #isSetCogenHPSteamRating()
	 * @see #unsetCogenHPSteamRating()
	 * @see #setCogenHPSteamRating(float)
	 * @generated
	 */
	public float getCogenHPSteamRating() {
		return cogenHPSteamRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cogen HP Steam Rating</em>' attribute.
	 * @see #isSetCogenHPSteamRating()
	 * @see #unsetCogenHPSteamRating()
	 * @see #getCogenHPSteamRating()
	 * @generated
	 */
	public void setCogenHPSteamRating(float newCogenHPSteamRating) {
		cogenHPSteamRating = newCogenHPSteamRating;
		cogenHPSteamRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCogenHPSteamRating()
	 * @see #getCogenHPSteamRating()
	 * @see #setCogenHPSteamRating(float)
	 * @generated
	 */
	public void unsetCogenHPSteamRating() {
		cogenHPSteamRating = COGEN_HP_STEAM_RATING_EDEFAULT;
		cogenHPSteamRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cogen HP Steam Rating</em>' attribute is set.
	 * @see #unsetCogenHPSteamRating()
	 * @see #getCogenHPSteamRating()
	 * @see #setCogenHPSteamRating(float)
	 * @generated
	 */
	public boolean isSetCogenHPSteamRating() {
		return cogenHPSteamRatingESet;
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
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				if (steamSendoutSchedule != null)
					msgs = ((InternalEObject)steamSendoutSchedule).eInverseRemove(this, ProductionPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs);
				return basicSetSteamSendoutSchedule((SteamSendoutSchedule)otherEnd, msgs);
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThermalGeneratingUnits()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				return basicSetSteamSendoutSchedule(null, msgs);
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				return ((InternalEList<?>)getThermalGeneratingUnits()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				if (resolve) return getSteamSendoutSchedule();
				return basicGetSteamSendoutSchedule();
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
				return getCogenLPSteamRating();
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
				return getCogenLPSendoutRating();
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				return getThermalGeneratingUnits();
			case ProductionPackage.COGENERATION_PLANT__RATED_P:
				return getRatedP();
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
				return getCogenHPSendoutRating();
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
				return getCogenHPSteamRating();
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
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				setSteamSendoutSchedule((SteamSendoutSchedule)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
				setCogenLPSteamRating((Float)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
				setCogenLPSendoutRating((Float)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				getThermalGeneratingUnits().clear();
				getThermalGeneratingUnits().addAll((Collection<? extends ThermalGeneratingUnit>)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__RATED_P:
				setRatedP((Float)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
				setCogenHPSendoutRating((Float)newValue);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
				setCogenHPSteamRating((Float)newValue);
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
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				setSteamSendoutSchedule((SteamSendoutSchedule)null);
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
				unsetCogenLPSteamRating();
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
				unsetCogenLPSendoutRating();
				return;
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				getThermalGeneratingUnits().clear();
				return;
			case ProductionPackage.COGENERATION_PLANT__RATED_P:
				unsetRatedP();
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
				unsetCogenHPSendoutRating();
				return;
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
				unsetCogenHPSteamRating();
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
			case ProductionPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
				return steamSendoutSchedule != null;
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
				return isSetCogenLPSteamRating();
			case ProductionPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
				return isSetCogenLPSendoutRating();
			case ProductionPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
				return thermalGeneratingUnits != null && !thermalGeneratingUnits.isEmpty();
			case ProductionPackage.COGENERATION_PLANT__RATED_P:
				return isSetRatedP();
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
				return isSetCogenHPSendoutRating();
			case ProductionPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
				return isSetCogenHPSteamRating();
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
		result.append(" (cogenLPSteamRating: ");
		if (cogenLPSteamRatingESet) result.append(cogenLPSteamRating); else result.append("<unset>");
		result.append(", cogenLPSendoutRating: ");
		if (cogenLPSendoutRatingESet) result.append(cogenLPSendoutRating); else result.append("<unset>");
		result.append(", ratedP: ");
		if (ratedPESet) result.append(ratedP); else result.append("<unset>");
		result.append(", cogenHPSendoutRating: ");
		if (cogenHPSendoutRatingESet) result.append(cogenHPSendoutRating); else result.append("<unset>");
		result.append(", cogenHPSteamRating: ");
		if (cogenHPSteamRatingESet) result.append(cogenHPSteamRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CogenerationPlant
