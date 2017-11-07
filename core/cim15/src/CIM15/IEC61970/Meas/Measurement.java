/**
 */
package CIM15.IEC61970.Meas;

import CIM15.IEC61968.Assets.Asset;
import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Location;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PhaseCode;
import CIM15.IEC61970.Core.PowerSystemResource;
import CIM15.IEC61970.Core.Terminal;

import CIM15.IEC61970.Domain.UnitMultiplier;
import CIM15.IEC61970.Domain.UnitSymbol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getTerminal <em>Terminal</em>}</li>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getPhases <em>Phases</em>}</li>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}</li>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getUnitSymbol <em>Unit Symbol</em>}</li>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getPowerSystemResource <em>Power System Resource</em>}</li>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getLocations <em>Locations</em>}</li>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getAsset <em>Asset</em>}</li>
 * <li>{@link CIM15.IEC61970.Meas.Measurement#getDocuments <em>Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Measurement extends IdentifiedObject {

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected Terminal terminal;
    /**
     * The default value of the '{@link #getPhases() <em>Phases</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.S12_N;
    /**
     * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected PhaseCode phases = PHASES_EDEFAULT;
    /**
     * This is true if the Phases attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean phasesESet;
    /**
     * The default value of the
     * '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMeasurementType()
     * @generated
     * @ordered
     */
    protected static final String MEASUREMENT_TYPE_EDEFAULT = null;
    /**
     * The cached value of the
     * '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMeasurementType()
     * @generated
     * @ordered
     */
    protected Map<String, String> measurementType = new HashMap<String, String>();
    /**
     * This is true if the Measurement Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean measurementTypeESet;
    /**
     * The default value of the
     * '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected static final UnitMultiplier UNIT_MULTIPLIER_EDEFAULT = UnitMultiplier.M;
    /**
     * The cached value of the
     * '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplier unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;
    /**
     * This is true if the Unit Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean unitMultiplierESet;
    /**
     * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol UNIT_SYMBOL_EDEFAULT = UnitSymbol.N;
    /**
     * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected UnitSymbol unitSymbol = UNIT_SYMBOL_EDEFAULT;
    /**
     * This is true if the Unit Symbol attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected boolean unitSymbolESet;
    /**
     * The cached value of the
     * '{@link #getPowerSystemResource() <em>Power System Resource</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPowerSystemResource()
     * @generated
     * @ordered
     */
    protected PowerSystemResource powerSystemResource;
    /**
     * The cached value of the '{@link #getLocations() <em>Locations</em>}'
     * reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getLocations()
     * @generated
     * @ordered
     */
    protected EList<Location> locations;
    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected Asset asset;
    /**
     * The cached value of the '{@link #getDocuments() <em>Documents</em>}'
     * reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDocuments()
     * @generated
     * @ordered
     */
    protected EList<Document> documents;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    protected Measurement() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MeasPackage.Literals.MEASUREMENT;
    }

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference. It is
     * bidirectional and its opposite is
     * '{@link CIM15.IEC61970.Core.Terminal#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminal</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #setTerminal(Terminal)
     * @see CIM15.IEC61970.Core.Terminal#getMeasurements
     * @generated
     */
    public Terminal getTerminal() {
        if (terminal != null && terminal.eIsProxy()) {
            InternalEObject oldTerminal = (InternalEObject) terminal;
            terminal = (Terminal) eResolveProxy(oldTerminal);
            if (terminal != oldTerminal) {
            }
        }
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Terminal basicGetTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
        Terminal oldTerminal = terminal;
        terminal = newTerminal;
        return msgs;
    }

    /**
     * Sets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getTerminal <em>Terminal</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #getTerminal()
     * @generated
     */
    public void setTerminal(Terminal newTerminal) {
        if (newTerminal != terminal) {
            NotificationChain msgs = null;
            if (terminal != null) {
                msgs = ((InternalEObject) terminal).eInverseRemove(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
            }
            if (newTerminal != null) {
                msgs = ((InternalEObject) newTerminal).eInverseAdd(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
            }
            msgs = basicSetTerminal(newTerminal, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
    }

    /**
     * Returns the value of the '<em><b>Phases</b></em>' attribute. The literals
     * are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phases</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phases</em>' attribute.
     * @see CIM15.IEC61970.Core.PhaseCode
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    public PhaseCode getPhases() {
        return phases;
    }

    /**
     * Sets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getPhases <em>Phases</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Phases</em>' attribute.
     * @see CIM15.IEC61970.Core.PhaseCode
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #getPhases()
     * @generated
     */
    public void setPhases(PhaseCode newPhases) {
        phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
        phasesESet = true;
    }

    /**
     * Unsets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getPhases <em>Phases</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isSetPhases()
     * @see #getPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    public void unsetPhases() {
        phases = PHASES_EDEFAULT;
        phasesESet = false;
    }

    /**
     * Returns whether the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getPhases <em>Phases</em>}'
     * attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Phases</em>' attribute is set.
     * @see #unsetPhases()
     * @see #getPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    public boolean isSetPhases() {
        return phasesESet;
    }

    /**
     * Returns the value of the '<em><b>Measurement Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Measurement Type</em>' attribute.
     * @see #isSetMeasurementType()
     * @see #unsetMeasurementType()
     * @see #setMeasurementType(String)
     * @generated
     */
    public Map<String, String> getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Measurement Type</em>' attribute.
     * @see #isSetMeasurementType()
     * @see #unsetMeasurementType()
     * @see #getMeasurementType()
     * @generated
     */
    public void setMeasurementType(Map<String, String> newMeasurementType) {
        measurementType = newMeasurementType;
        measurementTypeESet = true;
    }

    /**
     * Unsets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isSetMeasurementType()
     * @see #getMeasurementType()
     * @see #setMeasurementType(String)
     * @generated
     */
    public void unsetMeasurementType() {
        measurementType = new HashMap<String, String>();
        measurementTypeESet = false;
    }

    /**
     * Returns whether the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}'
     * attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Measurement Type</em>' attribute is
     * set.
     * @see #unsetMeasurementType()
     * @see #getMeasurementType()
     * @see #setMeasurementType(String)
     * @generated
     */
    public boolean isSetMeasurementType() {
        return measurementTypeESet;
    }

    /**
     * Returns the value of the '<em><b>Unit Multiplier</b></em>' attribute. The
     * literals are from the enumeration
     * {@link CIM15.IEC61970.Domain.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Unit Multiplier</em>' attribute.
     * @see CIM15.IEC61970.Domain.UnitMultiplier
     * @see #isSetUnitMultiplier()
     * @see #unsetUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    public UnitMultiplier getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * Sets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Unit Multiplier</em>' attribute.
     * @see CIM15.IEC61970.Domain.UnitMultiplier
     * @see #isSetUnitMultiplier()
     * @see #unsetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @generated
     */
    public void setUnitMultiplier(UnitMultiplier newUnitMultiplier) {
        unitMultiplier = newUnitMultiplier == null ? UNIT_MULTIPLIER_EDEFAULT : newUnitMultiplier;
        unitMultiplierESet = true;
    }

    /**
     * Unsets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isSetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    public void unsetUnitMultiplier() {
        unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;
        unitMultiplierESet = false;
    }

    /**
     * Returns whether the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}'
     * attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Unit Multiplier</em>' attribute is
     * set.
     * @see #unsetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    public boolean isSetUnitMultiplier() {
        return unitMultiplierESet;
    }

    /**
     * Returns the value of the '<em><b>Unit Symbol</b></em>' attribute. The
     * literals are from the enumeration
     * {@link CIM15.IEC61970.Domain.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit Symbol</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Unit Symbol</em>' attribute.
     * @see CIM15.IEC61970.Domain.UnitSymbol
     * @see #isSetUnitSymbol()
     * @see #unsetUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    public UnitSymbol getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * Sets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getUnitSymbol <em>Unit Symbol</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Unit Symbol</em>' attribute.
     * @see CIM15.IEC61970.Domain.UnitSymbol
     * @see #isSetUnitSymbol()
     * @see #unsetUnitSymbol()
     * @see #getUnitSymbol()
     * @generated
     */
    public void setUnitSymbol(UnitSymbol newUnitSymbol) {
        unitSymbol = newUnitSymbol == null ? UNIT_SYMBOL_EDEFAULT : newUnitSymbol;
        unitSymbolESet = true;
    }

    /**
     * Unsets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getUnitSymbol <em>Unit Symbol</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isSetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    public void unsetUnitSymbol() {
        unitSymbol = UNIT_SYMBOL_EDEFAULT;
        unitSymbolESet = false;
    }

    /**
     * Returns whether the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getUnitSymbol <em>Unit Symbol</em>}'
     * attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return whether the value of the '<em>Unit Symbol</em>' attribute is set.
     * @see #unsetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    public boolean isSetUnitSymbol() {
        return unitSymbolESet;
    }

    /**
     * Returns the value of the '<em><b>Power System Resource</b></em>'
     * reference. It is bidirectional and its opposite is
     * '{@link CIM15.IEC61970.Core.PowerSystemResource#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power System Resource</em>' reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Power System Resource</em>' reference.
     * @see #setPowerSystemResource(PowerSystemResource)
     * @see CIM15.IEC61970.Core.PowerSystemResource#getMeasurements
     * @generated
     */
    public PowerSystemResource getPowerSystemResource() {
        if (powerSystemResource != null && powerSystemResource.eIsProxy()) {
            InternalEObject oldPowerSystemResource = (InternalEObject) powerSystemResource;
            powerSystemResource = (PowerSystemResource) eResolveProxy(oldPowerSystemResource);
            if (powerSystemResource != oldPowerSystemResource) {
            }
        }
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public PowerSystemResource basicGetPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public NotificationChain basicSetPowerSystemResource(PowerSystemResource newPowerSystemResource, NotificationChain msgs) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = newPowerSystemResource;
        return msgs;
    }

    /**
     * Sets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getPowerSystemResource <em>Power System Resource</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Power System Resource</em>'
     * reference.
     * @see #getPowerSystemResource()
     * @generated
     */
    public void setPowerSystemResource(PowerSystemResource newPowerSystemResource) {
        if (newPowerSystemResource != powerSystemResource) {
            NotificationChain msgs = null;
            if (powerSystemResource != null) {
                msgs = ((InternalEObject) powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs);
            }
            if (newPowerSystemResource != null) {
                msgs = ((InternalEObject) newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs);
            }
            msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
    }

    /**
     * Returns the value of the '<em><b>Locations</b></em>' reference list. The
     * list contents are of type {@link CIM15.IEC61968.Common.Location}. It is
     * bidirectional and its opposite is
     * '{@link CIM15.IEC61968.Common.Location#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Locations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Locations</em>' reference list.
     * @see CIM15.IEC61968.Common.Location#getMeasurements
     * @generated
     */
    public EList<Location> getLocations() {
        if (locations == null) {
            locations = new BasicInternalEList<Location>(Location.class);
        }
        return locations;
    }

    /**
     * Returns the value of the '<em><b>Asset</b></em>' reference. It is
     * bidirectional and its opposite is
     * '{@link CIM15.IEC61968.Assets.Asset#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Asset</em>' reference.
     * @see #setAsset(Asset)
     * @see CIM15.IEC61968.Assets.Asset#getMeasurements
     * @generated
     */
    public Asset getAsset() {
        if (asset != null && asset.eIsProxy()) {
            InternalEObject oldAsset = (InternalEObject) asset;
            asset = (Asset) eResolveProxy(oldAsset);
            if (asset != oldAsset) {
            }
        }
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Asset basicGetAsset() {
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
        Asset oldAsset = asset;
        asset = newAsset;
        return msgs;
    }

    /**
     * Sets the value of the
     * '{@link CIM15.IEC61970.Meas.Measurement#getAsset <em>Asset</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Asset</em>' reference.
     * @see #getAsset()
     * @generated
     */
    public void setAsset(Asset newAsset) {
        if (newAsset != asset) {
            NotificationChain msgs = null;
            if (asset != null) {
                msgs = ((InternalEObject) asset).eInverseRemove(this, AssetsPackage.ASSET__MEASUREMENTS, Asset.class, msgs);
            }
            if (newAsset != null) {
                msgs = ((InternalEObject) newAsset).eInverseAdd(this, AssetsPackage.ASSET__MEASUREMENTS, Asset.class, msgs);
            }
            msgs = basicSetAsset(newAsset, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
    }

    /**
     * Returns the value of the '<em><b>Documents</b></em>' reference list. The
     * list contents are of type {@link CIM15.IEC61968.Common.Document}. It is
     * bidirectional and its opposite is
     * '{@link CIM15.IEC61968.Common.Document#getMeasurements <em>Measurements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documents</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Documents</em>' reference list.
     * @see CIM15.IEC61968.Common.Document#getMeasurements
     * @generated
     */
    public EList<Document> getDocuments() {
        if (documents == null) {
            documents = new BasicInternalEList<Document>(Document.class);
        }
        return documents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MeasPackage.MEASUREMENT__TERMINAL:
                if (terminal != null) {
                    msgs = ((InternalEObject) terminal).eInverseRemove(this, CorePackage.TERMINAL__MEASUREMENTS, Terminal.class, msgs);
                }
                return basicSetTerminal((Terminal) otherEnd, msgs);
            case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
                if (powerSystemResource != null) {
                    msgs = ((InternalEObject) powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs);
                }
                return basicSetPowerSystemResource((PowerSystemResource) otherEnd, msgs);
            case MeasPackage.MEASUREMENT__LOCATIONS:
                return ((InternalEList<InternalEObject>) (InternalEList<?>) getLocations()).basicAdd(otherEnd, msgs);
            case MeasPackage.MEASUREMENT__ASSET:
                if (asset != null) {
                    msgs = ((InternalEObject) asset).eInverseRemove(this, AssetsPackage.ASSET__MEASUREMENTS, Asset.class, msgs);
                }
                return basicSetAsset((Asset) otherEnd, msgs);
            case MeasPackage.MEASUREMENT__DOCUMENTS:
                return ((InternalEList<InternalEObject>) (InternalEList<?>) getDocuments()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MeasPackage.MEASUREMENT__TERMINAL:
                return basicSetTerminal(null, msgs);
            case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
                return basicSetPowerSystemResource(null, msgs);
            case MeasPackage.MEASUREMENT__LOCATIONS:
                return ((InternalEList<?>) getLocations()).basicRemove(otherEnd, msgs);
            case MeasPackage.MEASUREMENT__ASSET:
                return basicSetAsset(null, msgs);
            case MeasPackage.MEASUREMENT__DOCUMENTS:
                return ((InternalEList<?>) getDocuments()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MeasPackage.MEASUREMENT__TERMINAL:
                if (resolve) {
                    return getTerminal();
                }
                return basicGetTerminal();
            case MeasPackage.MEASUREMENT__PHASES:
                return getPhases();
            case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
                return getMeasurementType();
            case MeasPackage.MEASUREMENT__UNIT_MULTIPLIER:
                return getUnitMultiplier();
            case MeasPackage.MEASUREMENT__UNIT_SYMBOL:
                return getUnitSymbol();
            case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
                if (resolve) {
                    return getPowerSystemResource();
                }
                return basicGetPowerSystemResource();
            case MeasPackage.MEASUREMENT__LOCATIONS:
                return getLocations();
            case MeasPackage.MEASUREMENT__ASSET:
                if (resolve) {
                    return getAsset();
                }
                return basicGetAsset();
            case MeasPackage.MEASUREMENT__DOCUMENTS:
                return getDocuments();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MeasPackage.MEASUREMENT__TERMINAL:
                setTerminal((Terminal) newValue);
                return;
            case MeasPackage.MEASUREMENT__PHASES:
                setPhases((PhaseCode) newValue);
                return;
            case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
                setMeasurementType((Map<String, String>) newValue);
                return;
            case MeasPackage.MEASUREMENT__UNIT_MULTIPLIER:
                setUnitMultiplier((UnitMultiplier) newValue);
                return;
            case MeasPackage.MEASUREMENT__UNIT_SYMBOL:
                setUnitSymbol((UnitSymbol) newValue);
                return;
            case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
                setPowerSystemResource((PowerSystemResource) newValue);
                return;
            case MeasPackage.MEASUREMENT__LOCATIONS:
                getLocations().clear();
                getLocations().addAll((Collection<? extends Location>) newValue);
                return;
            case MeasPackage.MEASUREMENT__ASSET:
                setAsset((Asset) newValue);
                return;
            case MeasPackage.MEASUREMENT__DOCUMENTS:
                getDocuments().clear();
                getDocuments().addAll((Collection<? extends Document>) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MeasPackage.MEASUREMENT__TERMINAL:
                setTerminal((Terminal) null);
                return;
            case MeasPackage.MEASUREMENT__PHASES:
                unsetPhases();
                return;
            case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
                unsetMeasurementType();
                return;
            case MeasPackage.MEASUREMENT__UNIT_MULTIPLIER:
                unsetUnitMultiplier();
                return;
            case MeasPackage.MEASUREMENT__UNIT_SYMBOL:
                unsetUnitSymbol();
                return;
            case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
                setPowerSystemResource((PowerSystemResource) null);
                return;
            case MeasPackage.MEASUREMENT__LOCATIONS:
                getLocations().clear();
                return;
            case MeasPackage.MEASUREMENT__ASSET:
                setAsset((Asset) null);
                return;
            case MeasPackage.MEASUREMENT__DOCUMENTS:
                getDocuments().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MeasPackage.MEASUREMENT__TERMINAL:
                return terminal != null;
            case MeasPackage.MEASUREMENT__PHASES:
                return isSetPhases();
            case MeasPackage.MEASUREMENT__MEASUREMENT_TYPE:
                return isSetMeasurementType();
            case MeasPackage.MEASUREMENT__UNIT_MULTIPLIER:
                return isSetUnitMultiplier();
            case MeasPackage.MEASUREMENT__UNIT_SYMBOL:
                return isSetUnitSymbol();
            case MeasPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
                return powerSystemResource != null;
            case MeasPackage.MEASUREMENT__LOCATIONS:
                return locations != null && !locations.isEmpty();
            case MeasPackage.MEASUREMENT__ASSET:
                return asset != null;
            case MeasPackage.MEASUREMENT__DOCUMENTS:
                return documents != null && !documents.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (phases: ");
        if (phasesESet) {
            result.append(phases);
        } else {
            result.append("<unset>");
        }
        result.append(", measurementType: ");
        if (measurementTypeESet) {
            result.append(measurementType);
        } else {
            result.append("<unset>");
        }
        result.append(", unitMultiplier: ");
        if (unitMultiplierESet) {
            result.append(unitMultiplier);
        } else {
            result.append("<unset>");
        }
        result.append(", unitSymbol: ");
        if (unitSymbolESet) {
            result.append(unitSymbol);
        } else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
} // Measurement

