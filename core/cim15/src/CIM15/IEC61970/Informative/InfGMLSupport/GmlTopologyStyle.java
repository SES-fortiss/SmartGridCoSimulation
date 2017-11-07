/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Topology Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle <em>Gml Lable Style</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlTopologyStyle extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getGmlLableStyle() <em>Gml Lable Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLableStyle()
	 * @generated
	 * @ordered
	 */
	protected GmlLabelStyle gmlLableStyle;

	/**
	 * The cached value of the '{@link #getGmlFeatureStyle() <em>Gml Feature Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFeatureStyle()
	 * @generated
	 * @ordered
	 */
	protected GmlFeatureStyle gmlFeatureStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlTopologyStyle() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_TOPOLOGY_STYLE;
	}

	/**
	 * Returns the value of the '<em><b>Gml Lable Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles <em>Gml Topology Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Lable Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Lable Style</em>' reference.
	 * @see #setGmlLableStyle(GmlLabelStyle)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlTopologyStyles
	 * @generated
	 */
	public GmlLabelStyle getGmlLableStyle() {
		if (gmlLableStyle != null && gmlLableStyle.eIsProxy()) {
			InternalEObject oldGmlLableStyle = (InternalEObject)gmlLableStyle;
			gmlLableStyle = (GmlLabelStyle)eResolveProxy(oldGmlLableStyle);
			if (gmlLableStyle != oldGmlLableStyle) {
			}
		}
		return gmlLableStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlLabelStyle basicGetGmlLableStyle() {
		return gmlLableStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlLableStyle(GmlLabelStyle newGmlLableStyle, NotificationChain msgs) {
		GmlLabelStyle oldGmlLableStyle = gmlLableStyle;
		gmlLableStyle = newGmlLableStyle;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlLableStyle <em>Gml Lable Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Lable Style</em>' reference.
	 * @see #getGmlLableStyle()
	 * @generated
	 */
	public void setGmlLableStyle(GmlLabelStyle newGmlLableStyle) {
		if (newGmlLableStyle != gmlLableStyle) {
			NotificationChain msgs = null;
			if (gmlLableStyle != null)
				msgs = ((InternalEObject)gmlLableStyle).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES, GmlLabelStyle.class, msgs);
			if (newGmlLableStyle != null)
				msgs = ((InternalEObject)newGmlLableStyle).eInverseAdd(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES, GmlLabelStyle.class, msgs);
			msgs = basicSetGmlLableStyle(newGmlLableStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gml Feature Style</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles <em>Gml Tobology Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Style</em>' reference.
	 * @see #setGmlFeatureStyle(GmlFeatureStyle)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles
	 * @generated
	 */
	public GmlFeatureStyle getGmlFeatureStyle() {
		if (gmlFeatureStyle != null && gmlFeatureStyle.eIsProxy()) {
			InternalEObject oldGmlFeatureStyle = (InternalEObject)gmlFeatureStyle;
			gmlFeatureStyle = (GmlFeatureStyle)eResolveProxy(oldGmlFeatureStyle);
			if (gmlFeatureStyle != oldGmlFeatureStyle) {
			}
		}
		return gmlFeatureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlFeatureStyle basicGetGmlFeatureStyle() {
		return gmlFeatureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlFeatureStyle(GmlFeatureStyle newGmlFeatureStyle, NotificationChain msgs) {
		GmlFeatureStyle oldGmlFeatureStyle = gmlFeatureStyle;
		gmlFeatureStyle = newGmlFeatureStyle;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Feature Style</em>' reference.
	 * @see #getGmlFeatureStyle()
	 * @generated
	 */
	public void setGmlFeatureStyle(GmlFeatureStyle newGmlFeatureStyle) {
		if (newGmlFeatureStyle != gmlFeatureStyle) {
			NotificationChain msgs = null;
			if (gmlFeatureStyle != null)
				msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES, GmlFeatureStyle.class, msgs);
			if (newGmlFeatureStyle != null)
				msgs = ((InternalEObject)newGmlFeatureStyle).eInverseAdd(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES, GmlFeatureStyle.class, msgs);
			msgs = basicSetGmlFeatureStyle(newGmlFeatureStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				if (gmlLableStyle != null)
					msgs = ((InternalEObject)gmlLableStyle).eInverseRemove(this, InfGMLSupportPackage.GML_LABEL_STYLE__GML_TOPOLOGY_STYLES, GmlLabelStyle.class, msgs);
				return basicSetGmlLableStyle((GmlLabelStyle)otherEnd, msgs);
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				if (gmlFeatureStyle != null)
					msgs = ((InternalEObject)gmlFeatureStyle).eInverseRemove(this, InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES, GmlFeatureStyle.class, msgs);
				return basicSetGmlFeatureStyle((GmlFeatureStyle)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				return basicSetGmlLableStyle(null, msgs);
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				return basicSetGmlFeatureStyle(null, msgs);
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				if (resolve) return getGmlLableStyle();
				return basicGetGmlLableStyle();
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				if (resolve) return getGmlFeatureStyle();
				return basicGetGmlFeatureStyle();
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				setGmlLableStyle((GmlLabelStyle)newValue);
				return;
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)newValue);
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				setGmlLableStyle((GmlLabelStyle)null);
				return;
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				setGmlFeatureStyle((GmlFeatureStyle)null);
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
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_LABLE_STYLE:
				return gmlLableStyle != null;
			case InfGMLSupportPackage.GML_TOPOLOGY_STYLE__GML_FEATURE_STYLE:
				return gmlFeatureStyle != null;
		}
		return super.eIsSet(featureID);
	}

} // GmlTopologyStyle
