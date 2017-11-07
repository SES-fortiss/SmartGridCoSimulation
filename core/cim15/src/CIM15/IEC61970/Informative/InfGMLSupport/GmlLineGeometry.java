/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Line Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide <em>Source Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlLineGeometry extends GmlDiagramObject {
	/**
	 * The default value of the '{@link #getSourceSide() <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSide()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceSide() <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSide()
	 * @generated
	 * @ordered
	 */
	protected String sourceSide = SOURCE_SIDE_EDEFAULT;

	/**
	 * This is true if the Source Side attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceSideESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlLineGeometry() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_LINE_GEOMETRY;
	}

	/**
	 * Returns the value of the '<em><b>Source Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Side</em>' attribute.
	 * @see #isSetSourceSide()
	 * @see #unsetSourceSide()
	 * @see #setSourceSide(String)
	 * @generated
	 */
	public String getSourceSide() {
		return sourceSide;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Side</em>' attribute.
	 * @see #isSetSourceSide()
	 * @see #unsetSourceSide()
	 * @see #getSourceSide()
	 * @generated
	 */
	public void setSourceSide(String newSourceSide) {
		sourceSide = newSourceSide;
		sourceSideESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide <em>Source Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceSide()
	 * @see #getSourceSide()
	 * @see #setSourceSide(String)
	 * @generated
	 */
	public void unsetSourceSide() {
		sourceSide = SOURCE_SIDE_EDEFAULT;
		sourceSideESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLineGeometry#getSourceSide <em>Source Side</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Side</em>' attribute is set.
	 * @see #unsetSourceSide()
	 * @see #getSourceSide()
	 * @see #setSourceSide(String)
	 * @generated
	 */
	public boolean isSetSourceSide() {
		return sourceSideESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_LINE_GEOMETRY__SOURCE_SIDE:
				return getSourceSide();
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
			case InfGMLSupportPackage.GML_LINE_GEOMETRY__SOURCE_SIDE:
				setSourceSide((String)newValue);
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
			case InfGMLSupportPackage.GML_LINE_GEOMETRY__SOURCE_SIDE:
				unsetSourceSide();
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
			case InfGMLSupportPackage.GML_LINE_GEOMETRY__SOURCE_SIDE:
				return isSetSourceSide();
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
		result.append(" (sourceSide: ");
		if (sourceSideESet) result.append(sourceSide); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlLineGeometry
