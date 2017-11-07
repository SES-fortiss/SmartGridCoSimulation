/**
 */
package CIM15.IEC61970.Core;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.CurveData#getY3value <em>Y3value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.CurveData#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.CurveData#getCurve <em>Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.CurveData#getY2value <em>Y2value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.CurveData#getY1value <em>Y1value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurveData extends Element {
	/**
	 * The default value of the '{@link #getY3value() <em>Y3value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3value()
	 * @generated
	 * @ordered
	 */
	protected static final float Y3VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY3value() <em>Y3value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3value()
	 * @generated
	 * @ordered
	 */
	protected float y3value = Y3VALUE_EDEFAULT;

	/**
	 * This is true if the Y3value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y3valueESet;

	/**
	 * The default value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXvalue()
	 * @generated
	 * @ordered
	 */
	protected static final float XVALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXvalue()
	 * @generated
	 * @ordered
	 */
	protected float xvalue = XVALUE_EDEFAULT;

	/**
	 * This is true if the Xvalue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xvalueESet;

	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected Curve curve;

	/**
	 * The default value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2value()
	 * @generated
	 * @ordered
	 */
	protected static final float Y2VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2value()
	 * @generated
	 * @ordered
	 */
	protected float y2value = Y2VALUE_EDEFAULT;

	/**
	 * This is true if the Y2value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y2valueESet;

	/**
	 * The default value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1value()
	 * @generated
	 * @ordered
	 */
	protected static final float Y1VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1value()
	 * @generated
	 * @ordered
	 */
	protected float y1value = Y1VALUE_EDEFAULT;

	/**
	 * This is true if the Y1value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y1valueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveData() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CURVE_DATA;
	}

	/**
	 * Returns the value of the '<em><b>Y3value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y3value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y3value</em>' attribute.
	 * @see #isSetY3value()
	 * @see #unsetY3value()
	 * @see #setY3value(float)
	 * @generated
	 */
	public float getY3value() {
		return y3value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.CurveData#getY3value <em>Y3value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y3value</em>' attribute.
	 * @see #isSetY3value()
	 * @see #unsetY3value()
	 * @see #getY3value()
	 * @generated
	 */
	public void setY3value(float newY3value) {
		y3value = newY3value;
		y3valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.CurveData#getY3value <em>Y3value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY3value()
	 * @see #getY3value()
	 * @see #setY3value(float)
	 * @generated
	 */
	public void unsetY3value() {
		y3value = Y3VALUE_EDEFAULT;
		y3valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.CurveData#getY3value <em>Y3value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y3value</em>' attribute is set.
	 * @see #unsetY3value()
	 * @see #getY3value()
	 * @see #setY3value(float)
	 * @generated
	 */
	public boolean isSetY3value() {
		return y3valueESet;
	}

	/**
	 * Returns the value of the '<em><b>Xvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xvalue</em>' attribute.
	 * @see #isSetXvalue()
	 * @see #unsetXvalue()
	 * @see #setXvalue(float)
	 * @generated
	 */
	public float getXvalue() {
		return xvalue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.CurveData#getXvalue <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xvalue</em>' attribute.
	 * @see #isSetXvalue()
	 * @see #unsetXvalue()
	 * @see #getXvalue()
	 * @generated
	 */
	public void setXvalue(float newXvalue) {
		xvalue = newXvalue;
		xvalueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.CurveData#getXvalue <em>Xvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXvalue()
	 * @see #getXvalue()
	 * @see #setXvalue(float)
	 * @generated
	 */
	public void unsetXvalue() {
		xvalue = XVALUE_EDEFAULT;
		xvalueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.CurveData#getXvalue <em>Xvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xvalue</em>' attribute is set.
	 * @see #unsetXvalue()
	 * @see #getXvalue()
	 * @see #setXvalue(float)
	 * @generated
	 */
	public boolean isSetXvalue() {
		return xvalueESet;
	}

	/**
	 * Returns the value of the '<em><b>Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Curve#getCurveDatas <em>Curve Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve</em>' reference.
	 * @see #setCurve(Curve)
	 * @see CIM15.IEC61970.Core.Curve#getCurveDatas
	 * @generated
	 */
	public Curve getCurve() {
		if (curve != null && curve.eIsProxy()) {
			InternalEObject oldCurve = (InternalEObject)curve;
			curve = (Curve)eResolveProxy(oldCurve);
			if (curve != oldCurve) {
			}
		}
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curve basicGetCurve() {
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurve(Curve newCurve, NotificationChain msgs) {
		Curve oldCurve = curve;
		curve = newCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.CurveData#getCurve <em>Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' reference.
	 * @see #getCurve()
	 * @generated
	 */
	public void setCurve(Curve newCurve) {
		if (newCurve != curve) {
			NotificationChain msgs = null;
			if (curve != null)
				msgs = ((InternalEObject)curve).eInverseRemove(this, CorePackage.CURVE__CURVE_DATAS, Curve.class, msgs);
			if (newCurve != null)
				msgs = ((InternalEObject)newCurve).eInverseAdd(this, CorePackage.CURVE__CURVE_DATAS, Curve.class, msgs);
			msgs = basicSetCurve(newCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Y2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2value</em>' attribute.
	 * @see #isSetY2value()
	 * @see #unsetY2value()
	 * @see #setY2value(float)
	 * @generated
	 */
	public float getY2value() {
		return y2value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.CurveData#getY2value <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2value</em>' attribute.
	 * @see #isSetY2value()
	 * @see #unsetY2value()
	 * @see #getY2value()
	 * @generated
	 */
	public void setY2value(float newY2value) {
		y2value = newY2value;
		y2valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.CurveData#getY2value <em>Y2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY2value()
	 * @see #getY2value()
	 * @see #setY2value(float)
	 * @generated
	 */
	public void unsetY2value() {
		y2value = Y2VALUE_EDEFAULT;
		y2valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.CurveData#getY2value <em>Y2value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y2value</em>' attribute is set.
	 * @see #unsetY2value()
	 * @see #getY2value()
	 * @see #setY2value(float)
	 * @generated
	 */
	public boolean isSetY2value() {
		return y2valueESet;
	}

	/**
	 * Returns the value of the '<em><b>Y1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1value</em>' attribute.
	 * @see #isSetY1value()
	 * @see #unsetY1value()
	 * @see #setY1value(float)
	 * @generated
	 */
	public float getY1value() {
		return y1value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.CurveData#getY1value <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1value</em>' attribute.
	 * @see #isSetY1value()
	 * @see #unsetY1value()
	 * @see #getY1value()
	 * @generated
	 */
	public void setY1value(float newY1value) {
		y1value = newY1value;
		y1valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.CurveData#getY1value <em>Y1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY1value()
	 * @see #getY1value()
	 * @see #setY1value(float)
	 * @generated
	 */
	public void unsetY1value() {
		y1value = Y1VALUE_EDEFAULT;
		y1valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.CurveData#getY1value <em>Y1value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y1value</em>' attribute is set.
	 * @see #unsetY1value()
	 * @see #getY1value()
	 * @see #setY1value(float)
	 * @generated
	 */
	public boolean isSetY1value() {
		return y1valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CURVE_DATA__CURVE:
				if (curve != null)
					msgs = ((InternalEObject)curve).eInverseRemove(this, CorePackage.CURVE__CURVE_DATAS, Curve.class, msgs);
				return basicSetCurve((Curve)otherEnd, msgs);
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
			case CorePackage.CURVE_DATA__CURVE:
				return basicSetCurve(null, msgs);
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
			case CorePackage.CURVE_DATA__Y3VALUE:
				return getY3value();
			case CorePackage.CURVE_DATA__XVALUE:
				return getXvalue();
			case CorePackage.CURVE_DATA__CURVE:
				if (resolve) return getCurve();
				return basicGetCurve();
			case CorePackage.CURVE_DATA__Y2VALUE:
				return getY2value();
			case CorePackage.CURVE_DATA__Y1VALUE:
				return getY1value();
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
			case CorePackage.CURVE_DATA__Y3VALUE:
				setY3value((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__XVALUE:
				setXvalue((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__CURVE:
				setCurve((Curve)newValue);
				return;
			case CorePackage.CURVE_DATA__Y2VALUE:
				setY2value((Float)newValue);
				return;
			case CorePackage.CURVE_DATA__Y1VALUE:
				setY1value((Float)newValue);
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
			case CorePackage.CURVE_DATA__Y3VALUE:
				unsetY3value();
				return;
			case CorePackage.CURVE_DATA__XVALUE:
				unsetXvalue();
				return;
			case CorePackage.CURVE_DATA__CURVE:
				setCurve((Curve)null);
				return;
			case CorePackage.CURVE_DATA__Y2VALUE:
				unsetY2value();
				return;
			case CorePackage.CURVE_DATA__Y1VALUE:
				unsetY1value();
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
			case CorePackage.CURVE_DATA__Y3VALUE:
				return isSetY3value();
			case CorePackage.CURVE_DATA__XVALUE:
				return isSetXvalue();
			case CorePackage.CURVE_DATA__CURVE:
				return curve != null;
			case CorePackage.CURVE_DATA__Y2VALUE:
				return isSetY2value();
			case CorePackage.CURVE_DATA__Y1VALUE:
				return isSetY1value();
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
		result.append(" (y3value: ");
		if (y3valueESet) result.append(y3value); else result.append("<unset>");
		result.append(", xvalue: ");
		if (xvalueESet) result.append(xvalue); else result.append("<unset>");
		result.append(", y2value: ");
		if (y2valueESet) result.append(y2value); else result.append("<unset>");
		result.append(", y1value: ");
		if (y1valueESet) result.append(y1value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CurveData
