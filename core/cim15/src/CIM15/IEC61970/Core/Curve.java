/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61970.Domain.UnitMultiplier;
import CIM15.IEC61970.Domain.UnitSymbol;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getY1Multiplier <em>Y1 Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getY2Unit <em>Y2 Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getY3Multiplier <em>Y3 Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getCurveDatas <em>Curve Datas</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getY1Unit <em>Y1 Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getXMultiplier <em>XMultiplier</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getY3Unit <em>Y3 Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getY2Multiplier <em>Y2 Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Curve#getCurveStyle <em>Curve Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Curve extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol XUNIT_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol xUnit = XUNIT_EDEFAULT;

	/**
	 * This is true if the XUnit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xUnitESet;

	/**
	 * The default value of the '{@link #getY1Multiplier() <em>Y1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier Y1_MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getY1Multiplier() <em>Y1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier y1Multiplier = Y1_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Y1 Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y1MultiplierESet;

	/**
	 * The default value of the '{@link #getY2Unit() <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol Y2_UNIT_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getY2Unit() <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol y2Unit = Y2_UNIT_EDEFAULT;

	/**
	 * This is true if the Y2 Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y2UnitESet;

	/**
	 * The default value of the '{@link #getY3Multiplier() <em>Y3 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier Y3_MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getY3Multiplier() <em>Y3 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier y3Multiplier = Y3_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Y3 Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y3MultiplierESet;

	/**
	 * The cached value of the '{@link #getCurveDatas() <em>Curve Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<CurveData> curveDatas;

	/**
	 * The default value of the '{@link #getY1Unit() <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol Y1_UNIT_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getY1Unit() <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol y1Unit = Y1_UNIT_EDEFAULT;

	/**
	 * This is true if the Y1 Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y1UnitESet;

	/**
	 * The default value of the '{@link #getXMultiplier() <em>XMultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier XMULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getXMultiplier() <em>XMultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMultiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier xMultiplier = XMULTIPLIER_EDEFAULT;

	/**
	 * This is true if the XMultiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xMultiplierESet;

	/**
	 * The default value of the '{@link #getY3Unit() <em>Y3 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3Unit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol Y3_UNIT_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getY3Unit() <em>Y3 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3Unit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol y3Unit = Y3_UNIT_EDEFAULT;

	/**
	 * This is true if the Y3 Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y3UnitESet;

	/**
	 * The default value of the '{@link #getY2Multiplier() <em>Y2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Multiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier Y2_MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getY2Multiplier() <em>Y2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2Multiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier y2Multiplier = Y2_MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Y2 Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y2MultiplierESet;

	/**
	 * The default value of the '{@link #getCurveStyle() <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveStyle()
	 * @generated
	 * @ordered
	 */
	protected static final CurveStyle CURVE_STYLE_EDEFAULT = CurveStyle.FORMULA;

	/**
	 * The cached value of the '{@link #getCurveStyle() <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveStyle()
	 * @generated
	 * @ordered
	 */
	protected CurveStyle curveStyle = CURVE_STYLE_EDEFAULT;

	/**
	 * This is true if the Curve Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean curveStyleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Curve() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CURVE;
	}

	/**
	 * Returns the value of the '<em><b>XUnit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XUnit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XUnit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetXUnit()
	 * @see #unsetXUnit()
	 * @see #setXUnit(UnitSymbol)
	 * @generated
	 */
	public UnitSymbol getXUnit() {
		return xUnit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getXUnit <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XUnit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetXUnit()
	 * @see #unsetXUnit()
	 * @see #getXUnit()
	 * @generated
	 */
	public void setXUnit(UnitSymbol newXUnit) {
		xUnit = newXUnit == null ? XUNIT_EDEFAULT : newXUnit;
		xUnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getXUnit <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXUnit()
	 * @see #getXUnit()
	 * @see #setXUnit(UnitSymbol)
	 * @generated
	 */
	public void unsetXUnit() {
		xUnit = XUNIT_EDEFAULT;
		xUnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getXUnit <em>XUnit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XUnit</em>' attribute is set.
	 * @see #unsetXUnit()
	 * @see #getXUnit()
	 * @see #setXUnit(UnitSymbol)
	 * @generated
	 */
	public boolean isSetXUnit() {
		return xUnitESet;
	}

	/**
	 * Returns the value of the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetY1Multiplier()
	 * @see #unsetY1Multiplier()
	 * @see #setY1Multiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getY1Multiplier() {
		return y1Multiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getY1Multiplier <em>Y1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetY1Multiplier()
	 * @see #unsetY1Multiplier()
	 * @see #getY1Multiplier()
	 * @generated
	 */
	public void setY1Multiplier(UnitMultiplier newY1Multiplier) {
		y1Multiplier = newY1Multiplier == null ? Y1_MULTIPLIER_EDEFAULT : newY1Multiplier;
		y1MultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getY1Multiplier <em>Y1 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY1Multiplier()
	 * @see #getY1Multiplier()
	 * @see #setY1Multiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetY1Multiplier() {
		y1Multiplier = Y1_MULTIPLIER_EDEFAULT;
		y1MultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getY1Multiplier <em>Y1 Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y1 Multiplier</em>' attribute is set.
	 * @see #unsetY1Multiplier()
	 * @see #getY1Multiplier()
	 * @see #setY1Multiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetY1Multiplier() {
		return y1MultiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Y2 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetY2Unit()
	 * @see #unsetY2Unit()
	 * @see #setY2Unit(UnitSymbol)
	 * @generated
	 */
	public UnitSymbol getY2Unit() {
		return y2Unit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getY2Unit <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetY2Unit()
	 * @see #unsetY2Unit()
	 * @see #getY2Unit()
	 * @generated
	 */
	public void setY2Unit(UnitSymbol newY2Unit) {
		y2Unit = newY2Unit == null ? Y2_UNIT_EDEFAULT : newY2Unit;
		y2UnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getY2Unit <em>Y2 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY2Unit()
	 * @see #getY2Unit()
	 * @see #setY2Unit(UnitSymbol)
	 * @generated
	 */
	public void unsetY2Unit() {
		y2Unit = Y2_UNIT_EDEFAULT;
		y2UnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getY2Unit <em>Y2 Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y2 Unit</em>' attribute is set.
	 * @see #unsetY2Unit()
	 * @see #getY2Unit()
	 * @see #setY2Unit(UnitSymbol)
	 * @generated
	 */
	public boolean isSetY2Unit() {
		return y2UnitESet;
	}

	/**
	 * Returns the value of the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y3 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y3 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetY3Multiplier()
	 * @see #unsetY3Multiplier()
	 * @see #setY3Multiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getY3Multiplier() {
		return y3Multiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getY3Multiplier <em>Y3 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y3 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetY3Multiplier()
	 * @see #unsetY3Multiplier()
	 * @see #getY3Multiplier()
	 * @generated
	 */
	public void setY3Multiplier(UnitMultiplier newY3Multiplier) {
		y3Multiplier = newY3Multiplier == null ? Y3_MULTIPLIER_EDEFAULT : newY3Multiplier;
		y3MultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getY3Multiplier <em>Y3 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY3Multiplier()
	 * @see #getY3Multiplier()
	 * @see #setY3Multiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetY3Multiplier() {
		y3Multiplier = Y3_MULTIPLIER_EDEFAULT;
		y3MultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getY3Multiplier <em>Y3 Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y3 Multiplier</em>' attribute is set.
	 * @see #unsetY3Multiplier()
	 * @see #getY3Multiplier()
	 * @see #setY3Multiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetY3Multiplier() {
		return y3MultiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Curve Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.CurveData}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.CurveData#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Datas</em>' reference list.
	 * @see CIM15.IEC61970.Core.CurveData#getCurve
	 * @generated
	 */
	public EList<CurveData> getCurveDatas() {
		if (curveDatas == null) {
			curveDatas = new BasicInternalEList<CurveData>(CurveData.class);
		}
		return curveDatas;
	}

	/**
	 * Returns the value of the '<em><b>Y1 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetY1Unit()
	 * @see #unsetY1Unit()
	 * @see #setY1Unit(UnitSymbol)
	 * @generated
	 */
	public UnitSymbol getY1Unit() {
		return y1Unit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getY1Unit <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetY1Unit()
	 * @see #unsetY1Unit()
	 * @see #getY1Unit()
	 * @generated
	 */
	public void setY1Unit(UnitSymbol newY1Unit) {
		y1Unit = newY1Unit == null ? Y1_UNIT_EDEFAULT : newY1Unit;
		y1UnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getY1Unit <em>Y1 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY1Unit()
	 * @see #getY1Unit()
	 * @see #setY1Unit(UnitSymbol)
	 * @generated
	 */
	public void unsetY1Unit() {
		y1Unit = Y1_UNIT_EDEFAULT;
		y1UnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getY1Unit <em>Y1 Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y1 Unit</em>' attribute is set.
	 * @see #unsetY1Unit()
	 * @see #getY1Unit()
	 * @see #setY1Unit(UnitSymbol)
	 * @generated
	 */
	public boolean isSetY1Unit() {
		return y1UnitESet;
	}

	/**
	 * Returns the value of the '<em><b>XMultiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMultiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMultiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetXMultiplier()
	 * @see #unsetXMultiplier()
	 * @see #setXMultiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getXMultiplier() {
		return xMultiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getXMultiplier <em>XMultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMultiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetXMultiplier()
	 * @see #unsetXMultiplier()
	 * @see #getXMultiplier()
	 * @generated
	 */
	public void setXMultiplier(UnitMultiplier newXMultiplier) {
		xMultiplier = newXMultiplier == null ? XMULTIPLIER_EDEFAULT : newXMultiplier;
		xMultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getXMultiplier <em>XMultiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXMultiplier()
	 * @see #getXMultiplier()
	 * @see #setXMultiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetXMultiplier() {
		xMultiplier = XMULTIPLIER_EDEFAULT;
		xMultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getXMultiplier <em>XMultiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XMultiplier</em>' attribute is set.
	 * @see #unsetXMultiplier()
	 * @see #getXMultiplier()
	 * @see #setXMultiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetXMultiplier() {
		return xMultiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Y3 Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y3 Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y3 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetY3Unit()
	 * @see #unsetY3Unit()
	 * @see #setY3Unit(UnitSymbol)
	 * @generated
	 */
	public UnitSymbol getY3Unit() {
		return y3Unit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getY3Unit <em>Y3 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y3 Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetY3Unit()
	 * @see #unsetY3Unit()
	 * @see #getY3Unit()
	 * @generated
	 */
	public void setY3Unit(UnitSymbol newY3Unit) {
		y3Unit = newY3Unit == null ? Y3_UNIT_EDEFAULT : newY3Unit;
		y3UnitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getY3Unit <em>Y3 Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY3Unit()
	 * @see #getY3Unit()
	 * @see #setY3Unit(UnitSymbol)
	 * @generated
	 */
	public void unsetY3Unit() {
		y3Unit = Y3_UNIT_EDEFAULT;
		y3UnitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getY3Unit <em>Y3 Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y3 Unit</em>' attribute is set.
	 * @see #unsetY3Unit()
	 * @see #getY3Unit()
	 * @see #setY3Unit(UnitSymbol)
	 * @generated
	 */
	public boolean isSetY3Unit() {
		return y3UnitESet;
	}

	/**
	 * Returns the value of the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2 Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetY2Multiplier()
	 * @see #unsetY2Multiplier()
	 * @see #setY2Multiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getY2Multiplier() {
		return y2Multiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getY2Multiplier <em>Y2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2 Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetY2Multiplier()
	 * @see #unsetY2Multiplier()
	 * @see #getY2Multiplier()
	 * @generated
	 */
	public void setY2Multiplier(UnitMultiplier newY2Multiplier) {
		y2Multiplier = newY2Multiplier == null ? Y2_MULTIPLIER_EDEFAULT : newY2Multiplier;
		y2MultiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getY2Multiplier <em>Y2 Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY2Multiplier()
	 * @see #getY2Multiplier()
	 * @see #setY2Multiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetY2Multiplier() {
		y2Multiplier = Y2_MULTIPLIER_EDEFAULT;
		y2MultiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getY2Multiplier <em>Y2 Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y2 Multiplier</em>' attribute is set.
	 * @see #unsetY2Multiplier()
	 * @see #getY2Multiplier()
	 * @see #setY2Multiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetY2Multiplier() {
		return y2MultiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Curve Style</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.CurveStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Style</em>' attribute.
	 * @see CIM15.IEC61970.Core.CurveStyle
	 * @see #isSetCurveStyle()
	 * @see #unsetCurveStyle()
	 * @see #setCurveStyle(CurveStyle)
	 * @generated
	 */
	public CurveStyle getCurveStyle() {
		return curveStyle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Curve#getCurveStyle <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Style</em>' attribute.
	 * @see CIM15.IEC61970.Core.CurveStyle
	 * @see #isSetCurveStyle()
	 * @see #unsetCurveStyle()
	 * @see #getCurveStyle()
	 * @generated
	 */
	public void setCurveStyle(CurveStyle newCurveStyle) {
		curveStyle = newCurveStyle == null ? CURVE_STYLE_EDEFAULT : newCurveStyle;
		curveStyleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Curve#getCurveStyle <em>Curve Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurveStyle()
	 * @see #getCurveStyle()
	 * @see #setCurveStyle(CurveStyle)
	 * @generated
	 */
	public void unsetCurveStyle() {
		curveStyle = CURVE_STYLE_EDEFAULT;
		curveStyleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Curve#getCurveStyle <em>Curve Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Curve Style</em>' attribute is set.
	 * @see #unsetCurveStyle()
	 * @see #getCurveStyle()
	 * @see #setCurveStyle(CurveStyle)
	 * @generated
	 */
	public boolean isSetCurveStyle() {
		return curveStyleESet;
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
			case CorePackage.CURVE__CURVE_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurveDatas()).basicAdd(otherEnd, msgs);
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
			case CorePackage.CURVE__CURVE_DATAS:
				return ((InternalEList<?>)getCurveDatas()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CURVE__XUNIT:
				return getXUnit();
			case CorePackage.CURVE__Y1_MULTIPLIER:
				return getY1Multiplier();
			case CorePackage.CURVE__Y2_UNIT:
				return getY2Unit();
			case CorePackage.CURVE__Y3_MULTIPLIER:
				return getY3Multiplier();
			case CorePackage.CURVE__CURVE_DATAS:
				return getCurveDatas();
			case CorePackage.CURVE__Y1_UNIT:
				return getY1Unit();
			case CorePackage.CURVE__XMULTIPLIER:
				return getXMultiplier();
			case CorePackage.CURVE__Y3_UNIT:
				return getY3Unit();
			case CorePackage.CURVE__Y2_MULTIPLIER:
				return getY2Multiplier();
			case CorePackage.CURVE__CURVE_STYLE:
				return getCurveStyle();
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
			case CorePackage.CURVE__XUNIT:
				setXUnit((UnitSymbol)newValue);
				return;
			case CorePackage.CURVE__Y1_MULTIPLIER:
				setY1Multiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.CURVE__Y2_UNIT:
				setY2Unit((UnitSymbol)newValue);
				return;
			case CorePackage.CURVE__Y3_MULTIPLIER:
				setY3Multiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.CURVE__CURVE_DATAS:
				getCurveDatas().clear();
				getCurveDatas().addAll((Collection<? extends CurveData>)newValue);
				return;
			case CorePackage.CURVE__Y1_UNIT:
				setY1Unit((UnitSymbol)newValue);
				return;
			case CorePackage.CURVE__XMULTIPLIER:
				setXMultiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.CURVE__Y3_UNIT:
				setY3Unit((UnitSymbol)newValue);
				return;
			case CorePackage.CURVE__Y2_MULTIPLIER:
				setY2Multiplier((UnitMultiplier)newValue);
				return;
			case CorePackage.CURVE__CURVE_STYLE:
				setCurveStyle((CurveStyle)newValue);
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
			case CorePackage.CURVE__XUNIT:
				unsetXUnit();
				return;
			case CorePackage.CURVE__Y1_MULTIPLIER:
				unsetY1Multiplier();
				return;
			case CorePackage.CURVE__Y2_UNIT:
				unsetY2Unit();
				return;
			case CorePackage.CURVE__Y3_MULTIPLIER:
				unsetY3Multiplier();
				return;
			case CorePackage.CURVE__CURVE_DATAS:
				getCurveDatas().clear();
				return;
			case CorePackage.CURVE__Y1_UNIT:
				unsetY1Unit();
				return;
			case CorePackage.CURVE__XMULTIPLIER:
				unsetXMultiplier();
				return;
			case CorePackage.CURVE__Y3_UNIT:
				unsetY3Unit();
				return;
			case CorePackage.CURVE__Y2_MULTIPLIER:
				unsetY2Multiplier();
				return;
			case CorePackage.CURVE__CURVE_STYLE:
				unsetCurveStyle();
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
			case CorePackage.CURVE__XUNIT:
				return isSetXUnit();
			case CorePackage.CURVE__Y1_MULTIPLIER:
				return isSetY1Multiplier();
			case CorePackage.CURVE__Y2_UNIT:
				return isSetY2Unit();
			case CorePackage.CURVE__Y3_MULTIPLIER:
				return isSetY3Multiplier();
			case CorePackage.CURVE__CURVE_DATAS:
				return curveDatas != null && !curveDatas.isEmpty();
			case CorePackage.CURVE__Y1_UNIT:
				return isSetY1Unit();
			case CorePackage.CURVE__XMULTIPLIER:
				return isSetXMultiplier();
			case CorePackage.CURVE__Y3_UNIT:
				return isSetY3Unit();
			case CorePackage.CURVE__Y2_MULTIPLIER:
				return isSetY2Multiplier();
			case CorePackage.CURVE__CURVE_STYLE:
				return isSetCurveStyle();
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
		result.append(" (xUnit: ");
		if (xUnitESet) result.append(xUnit); else result.append("<unset>");
		result.append(", y1Multiplier: ");
		if (y1MultiplierESet) result.append(y1Multiplier); else result.append("<unset>");
		result.append(", y2Unit: ");
		if (y2UnitESet) result.append(y2Unit); else result.append("<unset>");
		result.append(", y3Multiplier: ");
		if (y3MultiplierESet) result.append(y3Multiplier); else result.append("<unset>");
		result.append(", y1Unit: ");
		if (y1UnitESet) result.append(y1Unit); else result.append("<unset>");
		result.append(", xMultiplier: ");
		if (xMultiplierESet) result.append(xMultiplier); else result.append("<unset>");
		result.append(", y3Unit: ");
		if (y3UnitESet) result.append(y3Unit); else result.append("<unset>");
		result.append(", y2Multiplier: ");
		if (y2MultiplierESet) result.append(y2Multiplier); else result.append("<unset>");
		result.append(", curveStyle: ");
		if (curveStyleESet) result.append(curveStyle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Curve
