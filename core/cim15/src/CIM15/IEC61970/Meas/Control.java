/**
 */
package CIM15.IEC61970.Meas;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.UnitMultiplier;
import CIM15.IEC61970.Domain.UnitSymbol;

import CIM15.IEC61970.SCADA.RemoteControl;
import CIM15.IEC61970.SCADA.SCADAPackage;

import CIM15.IEC61970.Wires.RegulatingCondEq;
import CIM15.IEC61970.Wires.WiresPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.Control#getRemoteControl <em>Remote Control</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Control#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Control#getControlType <em>Control Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Control#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Control#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Control#isOperationInProgress <em>Operation In Progress</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.Control#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Control extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getRemoteControl() <em>Remote Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteControl()
	 * @generated
	 * @ordered
	 */
	protected RemoteControl remoteControl;

	/**
	 * The cached value of the '{@link #getRegulatingCondEq() <em>Regulating Cond Eq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingCondEq()
	 * @generated
	 * @ordered
	 */
	protected RegulatingCondEq regulatingCondEq;

	/**
	 * The cached value of the '{@link #getControlType() <em>Control Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlType()
	 * @generated
	 * @ordered
	 */
	protected ControlType controlType;

	/**
	 * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol UNIT_SYMBOL_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSymbol()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol unitSymbol = UNIT_SYMBOL_EDEFAULT;

	/**
	 * This is true if the Unit Symbol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitSymbolESet;

	/**
	 * The default value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier UNIT_MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitMultiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Unit Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitMultiplierESet;

	/**
	 * The default value of the '{@link #isOperationInProgress() <em>Operation In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperationInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATION_IN_PROGRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperationInProgress() <em>Operation In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperationInProgress()
	 * @generated
	 * @ordered
	 */
	protected boolean operationInProgress = OPERATION_IN_PROGRESS_EDEFAULT;

	/**
	 * This is true if the Operation In Progress attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationInProgressESet;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * This is true if the Time Stamp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeStampESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Control() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.CONTROL;
	}

	/**
	 * Returns the value of the '<em><b>Remote Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.SCADA.RemoteControl#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Control</em>' reference.
	 * @see #setRemoteControl(RemoteControl)
	 * @see CIM15.IEC61970.SCADA.RemoteControl#getControl
	 * @generated
	 */
	public RemoteControl getRemoteControl() {
		if (remoteControl != null && remoteControl.eIsProxy()) {
			InternalEObject oldRemoteControl = (InternalEObject)remoteControl;
			remoteControl = (RemoteControl)eResolveProxy(oldRemoteControl);
			if (remoteControl != oldRemoteControl) {
			}
		}
		return remoteControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteControl basicGetRemoteControl() {
		return remoteControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteControl(RemoteControl newRemoteControl, NotificationChain msgs) {
		RemoteControl oldRemoteControl = remoteControl;
		remoteControl = newRemoteControl;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Control#getRemoteControl <em>Remote Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Control</em>' reference.
	 * @see #getRemoteControl()
	 * @generated
	 */
	public void setRemoteControl(RemoteControl newRemoteControl) {
		if (newRemoteControl != remoteControl) {
			NotificationChain msgs = null;
			if (remoteControl != null)
				msgs = ((InternalEObject)remoteControl).eInverseRemove(this, SCADAPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs);
			if (newRemoteControl != null)
				msgs = ((InternalEObject)newRemoteControl).eInverseAdd(this, SCADAPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs);
			msgs = basicSetRemoteControl(newRemoteControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Regulating Cond Eq</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RegulatingCondEq#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Cond Eq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Cond Eq</em>' reference.
	 * @see #setRegulatingCondEq(RegulatingCondEq)
	 * @see CIM15.IEC61970.Wires.RegulatingCondEq#getControls
	 * @generated
	 */
	public RegulatingCondEq getRegulatingCondEq() {
		if (regulatingCondEq != null && regulatingCondEq.eIsProxy()) {
			InternalEObject oldRegulatingCondEq = (InternalEObject)regulatingCondEq;
			regulatingCondEq = (RegulatingCondEq)eResolveProxy(oldRegulatingCondEq);
			if (regulatingCondEq != oldRegulatingCondEq) {
			}
		}
		return regulatingCondEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingCondEq basicGetRegulatingCondEq() {
		return regulatingCondEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatingCondEq(RegulatingCondEq newRegulatingCondEq, NotificationChain msgs) {
		RegulatingCondEq oldRegulatingCondEq = regulatingCondEq;
		regulatingCondEq = newRegulatingCondEq;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Control#getRegulatingCondEq <em>Regulating Cond Eq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulating Cond Eq</em>' reference.
	 * @see #getRegulatingCondEq()
	 * @generated
	 */
	public void setRegulatingCondEq(RegulatingCondEq newRegulatingCondEq) {
		if (newRegulatingCondEq != regulatingCondEq) {
			NotificationChain msgs = null;
			if (regulatingCondEq != null)
				msgs = ((InternalEObject)regulatingCondEq).eInverseRemove(this, WiresPackage.REGULATING_COND_EQ__CONTROLS, RegulatingCondEq.class, msgs);
			if (newRegulatingCondEq != null)
				msgs = ((InternalEObject)newRegulatingCondEq).eInverseAdd(this, WiresPackage.REGULATING_COND_EQ__CONTROLS, RegulatingCondEq.class, msgs);
			msgs = basicSetRegulatingCondEq(newRegulatingCondEq, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Control Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.ControlType#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Type</em>' reference.
	 * @see #setControlType(ControlType)
	 * @see CIM15.IEC61970.Meas.ControlType#getControls
	 * @generated
	 */
	public ControlType getControlType() {
		if (controlType != null && controlType.eIsProxy()) {
			InternalEObject oldControlType = (InternalEObject)controlType;
			controlType = (ControlType)eResolveProxy(oldControlType);
			if (controlType != oldControlType) {
			}
		}
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType basicGetControlType() {
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlType(ControlType newControlType, NotificationChain msgs) {
		ControlType oldControlType = controlType;
		controlType = newControlType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Control#getControlType <em>Control Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Type</em>' reference.
	 * @see #getControlType()
	 * @generated
	 */
	public void setControlType(ControlType newControlType) {
		if (newControlType != controlType) {
			NotificationChain msgs = null;
			if (controlType != null)
				msgs = ((InternalEObject)controlType).eInverseRemove(this, MeasPackage.CONTROL_TYPE__CONTROLS, ControlType.class, msgs);
			if (newControlType != null)
				msgs = ((InternalEObject)newControlType).eInverseAdd(this, MeasPackage.CONTROL_TYPE__CONTROLS, ControlType.class, msgs);
			msgs = basicSetControlType(newControlType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Unit Symbol</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Returns the value of the '<em><b>Unit Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit Multiplier</em>' attribute is set.
	 * @see #unsetUnitMultiplier()
	 * @see #getUnitMultiplier()
	 * @see #setUnitMultiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetUnitMultiplier() {
		return unitMultiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Operation In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation In Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation In Progress</em>' attribute.
	 * @see #isSetOperationInProgress()
	 * @see #unsetOperationInProgress()
	 * @see #setOperationInProgress(boolean)
	 * @generated
	 */
	public boolean isOperationInProgress() {
		return operationInProgress;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Control#isOperationInProgress <em>Operation In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation In Progress</em>' attribute.
	 * @see #isSetOperationInProgress()
	 * @see #unsetOperationInProgress()
	 * @see #isOperationInProgress()
	 * @generated
	 */
	public void setOperationInProgress(boolean newOperationInProgress) {
		operationInProgress = newOperationInProgress;
		operationInProgressESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Control#isOperationInProgress <em>Operation In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationInProgress()
	 * @see #isOperationInProgress()
	 * @see #setOperationInProgress(boolean)
	 * @generated
	 */
	public void unsetOperationInProgress() {
		operationInProgress = OPERATION_IN_PROGRESS_EDEFAULT;
		operationInProgressESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Control#isOperationInProgress <em>Operation In Progress</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation In Progress</em>' attribute is set.
	 * @see #unsetOperationInProgress()
	 * @see #isOperationInProgress()
	 * @see #setOperationInProgress(boolean)
	 * @generated
	 */
	public boolean isSetOperationInProgress() {
		return operationInProgressESet;
	}

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #isSetTimeStamp()
	 * @see #unsetTimeStamp()
	 * @see #setTimeStamp(Date)
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.Control#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #isSetTimeStamp()
	 * @see #unsetTimeStamp()
	 * @see #getTimeStamp()
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		timeStamp = newTimeStamp;
		timeStampESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.Control#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeStamp()
	 * @see #getTimeStamp()
	 * @see #setTimeStamp(Date)
	 * @generated
	 */
	public void unsetTimeStamp() {
		timeStamp = TIME_STAMP_EDEFAULT;
		timeStampESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.Control#getTimeStamp <em>Time Stamp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Stamp</em>' attribute is set.
	 * @see #unsetTimeStamp()
	 * @see #getTimeStamp()
	 * @see #setTimeStamp(Date)
	 * @generated
	 */
	public boolean isSetTimeStamp() {
		return timeStampESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				if (remoteControl != null)
					msgs = ((InternalEObject)remoteControl).eInverseRemove(this, SCADAPackage.REMOTE_CONTROL__CONTROL, RemoteControl.class, msgs);
				return basicSetRemoteControl((RemoteControl)otherEnd, msgs);
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				if (regulatingCondEq != null)
					msgs = ((InternalEObject)regulatingCondEq).eInverseRemove(this, WiresPackage.REGULATING_COND_EQ__CONTROLS, RegulatingCondEq.class, msgs);
				return basicSetRegulatingCondEq((RegulatingCondEq)otherEnd, msgs);
			case MeasPackage.CONTROL__CONTROL_TYPE:
				if (controlType != null)
					msgs = ((InternalEObject)controlType).eInverseRemove(this, MeasPackage.CONTROL_TYPE__CONTROLS, ControlType.class, msgs);
				return basicSetControlType((ControlType)otherEnd, msgs);
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
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				return basicSetRemoteControl(null, msgs);
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				return basicSetRegulatingCondEq(null, msgs);
			case MeasPackage.CONTROL__CONTROL_TYPE:
				return basicSetControlType(null, msgs);
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
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				if (resolve) return getRemoteControl();
				return basicGetRemoteControl();
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				if (resolve) return getRegulatingCondEq();
				return basicGetRegulatingCondEq();
			case MeasPackage.CONTROL__CONTROL_TYPE:
				if (resolve) return getControlType();
				return basicGetControlType();
			case MeasPackage.CONTROL__UNIT_SYMBOL:
				return getUnitSymbol();
			case MeasPackage.CONTROL__UNIT_MULTIPLIER:
				return getUnitMultiplier();
			case MeasPackage.CONTROL__OPERATION_IN_PROGRESS:
				return isOperationInProgress();
			case MeasPackage.CONTROL__TIME_STAMP:
				return getTimeStamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				setRemoteControl((RemoteControl)newValue);
				return;
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				setRegulatingCondEq((RegulatingCondEq)newValue);
				return;
			case MeasPackage.CONTROL__CONTROL_TYPE:
				setControlType((ControlType)newValue);
				return;
			case MeasPackage.CONTROL__UNIT_SYMBOL:
				setUnitSymbol((UnitSymbol)newValue);
				return;
			case MeasPackage.CONTROL__UNIT_MULTIPLIER:
				setUnitMultiplier((UnitMultiplier)newValue);
				return;
			case MeasPackage.CONTROL__OPERATION_IN_PROGRESS:
				setOperationInProgress((Boolean)newValue);
				return;
			case MeasPackage.CONTROL__TIME_STAMP:
				setTimeStamp((Date)newValue);
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
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				setRemoteControl((RemoteControl)null);
				return;
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				setRegulatingCondEq((RegulatingCondEq)null);
				return;
			case MeasPackage.CONTROL__CONTROL_TYPE:
				setControlType((ControlType)null);
				return;
			case MeasPackage.CONTROL__UNIT_SYMBOL:
				unsetUnitSymbol();
				return;
			case MeasPackage.CONTROL__UNIT_MULTIPLIER:
				unsetUnitMultiplier();
				return;
			case MeasPackage.CONTROL__OPERATION_IN_PROGRESS:
				unsetOperationInProgress();
				return;
			case MeasPackage.CONTROL__TIME_STAMP:
				unsetTimeStamp();
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
			case MeasPackage.CONTROL__REMOTE_CONTROL:
				return remoteControl != null;
			case MeasPackage.CONTROL__REGULATING_COND_EQ:
				return regulatingCondEq != null;
			case MeasPackage.CONTROL__CONTROL_TYPE:
				return controlType != null;
			case MeasPackage.CONTROL__UNIT_SYMBOL:
				return isSetUnitSymbol();
			case MeasPackage.CONTROL__UNIT_MULTIPLIER:
				return isSetUnitMultiplier();
			case MeasPackage.CONTROL__OPERATION_IN_PROGRESS:
				return isSetOperationInProgress();
			case MeasPackage.CONTROL__TIME_STAMP:
				return isSetTimeStamp();
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
		result.append(" (unitSymbol: ");
		if (unitSymbolESet) result.append(unitSymbol); else result.append("<unset>");
		result.append(", unitMultiplier: ");
		if (unitMultiplierESet) result.append(unitMultiplier); else result.append("<unset>");
		result.append(", operationInProgress: ");
		if (operationInProgressESet) result.append(operationInProgress); else result.append("<unset>");
		result.append(", timeStamp: ");
		if (timeStampESet) result.append(timeStamp); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Control
