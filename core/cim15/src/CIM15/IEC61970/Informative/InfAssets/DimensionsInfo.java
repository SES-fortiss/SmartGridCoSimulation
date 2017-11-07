/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61968.Common.Location;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensions Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations <em>Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos <em>Asset Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth <em>Size Width</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter <em>Size Diameter</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength <em>Size Length</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth <em>Size Depth</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionsInfo extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getAssetInfos() <em>Asset Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetInfo> assetInfos;

	/**
	 * The default value of the '{@link #getSizeWidth() <em>Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSizeWidth() <em>Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeWidth()
	 * @generated
	 * @ordered
	 */
	protected float sizeWidth = SIZE_WIDTH_EDEFAULT;

	/**
	 * This is true if the Size Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeWidthESet;

	/**
	 * The default value of the '{@link #getSizeDiameter() <em>Size Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_DIAMETER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSizeDiameter() <em>Size Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDiameter()
	 * @generated
	 * @ordered
	 */
	protected float sizeDiameter = SIZE_DIAMETER_EDEFAULT;

	/**
	 * This is true if the Size Diameter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeDiameterESet;

	/**
	 * The default value of the '{@link #getSizeLength() <em>Size Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeLength()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSizeLength() <em>Size Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeLength()
	 * @generated
	 * @ordered
	 */
	protected float sizeLength = SIZE_LENGTH_EDEFAULT;

	/**
	 * This is true if the Size Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeLengthESet;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected String orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getSizeDepth() <em>Size Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDepth()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_DEPTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSizeDepth() <em>Size Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDepth()
	 * @generated
	 * @ordered
	 */
	protected float sizeDepth = SIZE_DEPTH_EDEFAULT;

	/**
	 * This is true if the Size Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeDepthESet;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionsInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getDimensionsInfo();
	}

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getDimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see CIM15.IEC61968.Common.Location#getDimensionsInfo
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new BasicInternalEList<Location>(Location.class);
		}
		return locations;
	}

	/**
	 * Returns the value of the '<em><b>Asset Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.AssetInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetInfo#getDimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Infos</em>' reference list.
	 * @see CIM15.IEC61968.Assets.AssetInfo#getDimensionsInfo
	 * @generated
	 */
	public EList<AssetInfo> getAssetInfos() {
		if (assetInfos == null) {
			assetInfos = new BasicInternalEList<AssetInfo>(AssetInfo.class);
		}
		return assetInfos;
	}

	/**
	 * Returns the value of the '<em><b>Size Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Width</em>' attribute.
	 * @see #isSetSizeWidth()
	 * @see #unsetSizeWidth()
	 * @see #setSizeWidth(float)
	 * @generated
	 */
	public float getSizeWidth() {
		return sizeWidth;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth <em>Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Width</em>' attribute.
	 * @see #isSetSizeWidth()
	 * @see #unsetSizeWidth()
	 * @see #getSizeWidth()
	 * @generated
	 */
	public void setSizeWidth(float newSizeWidth) {
		sizeWidth = newSizeWidth;
		sizeWidthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth <em>Size Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeWidth()
	 * @see #getSizeWidth()
	 * @see #setSizeWidth(float)
	 * @generated
	 */
	public void unsetSizeWidth() {
		sizeWidth = SIZE_WIDTH_EDEFAULT;
		sizeWidthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth <em>Size Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Width</em>' attribute is set.
	 * @see #unsetSizeWidth()
	 * @see #getSizeWidth()
	 * @see #setSizeWidth(float)
	 * @generated
	 */
	public boolean isSetSizeWidth() {
		return sizeWidthESet;
	}

	/**
	 * Returns the value of the '<em><b>Size Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Diameter</em>' attribute.
	 * @see #isSetSizeDiameter()
	 * @see #unsetSizeDiameter()
	 * @see #setSizeDiameter(float)
	 * @generated
	 */
	public float getSizeDiameter() {
		return sizeDiameter;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter <em>Size Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Diameter</em>' attribute.
	 * @see #isSetSizeDiameter()
	 * @see #unsetSizeDiameter()
	 * @see #getSizeDiameter()
	 * @generated
	 */
	public void setSizeDiameter(float newSizeDiameter) {
		sizeDiameter = newSizeDiameter;
		sizeDiameterESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter <em>Size Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeDiameter()
	 * @see #getSizeDiameter()
	 * @see #setSizeDiameter(float)
	 * @generated
	 */
	public void unsetSizeDiameter() {
		sizeDiameter = SIZE_DIAMETER_EDEFAULT;
		sizeDiameterESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter <em>Size Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Diameter</em>' attribute is set.
	 * @see #unsetSizeDiameter()
	 * @see #getSizeDiameter()
	 * @see #setSizeDiameter(float)
	 * @generated
	 */
	public boolean isSetSizeDiameter() {
		return sizeDiameterESet;
	}

	/**
	 * Returns the value of the '<em><b>Size Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Length</em>' attribute.
	 * @see #isSetSizeLength()
	 * @see #unsetSizeLength()
	 * @see #setSizeLength(float)
	 * @generated
	 */
	public float getSizeLength() {
		return sizeLength;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength <em>Size Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Length</em>' attribute.
	 * @see #isSetSizeLength()
	 * @see #unsetSizeLength()
	 * @see #getSizeLength()
	 * @generated
	 */
	public void setSizeLength(float newSizeLength) {
		sizeLength = newSizeLength;
		sizeLengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength <em>Size Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeLength()
	 * @see #getSizeLength()
	 * @see #setSizeLength(float)
	 * @generated
	 */
	public void unsetSizeLength() {
		sizeLength = SIZE_LENGTH_EDEFAULT;
		sizeLengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength <em>Size Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Length</em>' attribute is set.
	 * @see #unsetSizeLength()
	 * @see #getSizeLength()
	 * @see #setSizeLength(float)
	 * @generated
	 */
	public boolean isSetSizeLength() {
		return sizeLengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(String)
	 * @generated
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		orientation = newOrientation;
		orientationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(String)
	 * @generated
	 */
	public void unsetOrientation() {
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(String)
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * Returns the value of the '<em><b>Size Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Depth</em>' attribute.
	 * @see #isSetSizeDepth()
	 * @see #unsetSizeDepth()
	 * @see #setSizeDepth(float)
	 * @generated
	 */
	public float getSizeDepth() {
		return sizeDepth;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth <em>Size Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Depth</em>' attribute.
	 * @see #isSetSizeDepth()
	 * @see #unsetSizeDepth()
	 * @see #getSizeDepth()
	 * @generated
	 */
	public void setSizeDepth(float newSizeDepth) {
		sizeDepth = newSizeDepth;
		sizeDepthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth <em>Size Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeDepth()
	 * @see #getSizeDepth()
	 * @see #setSizeDepth(float)
	 * @generated
	 */
	public void unsetSizeDepth() {
		sizeDepth = SIZE_DEPTH_EDEFAULT;
		sizeDepthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth <em>Size Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Depth</em>' attribute is set.
	 * @see #unsetSizeDepth()
	 * @see #getSizeDepth()
	 * @see #setSizeDepth(float)
	 * @generated
	 */
	public boolean isSetSizeDepth() {
		return sizeDepthESet;
	}

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Specification}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos <em>Dimensions Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos
	 * @generated
	 */
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new BasicInternalEList<Specification>(Specification.class);
		}
		return specifications;
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
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifications()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				return ((InternalEList<?>)getAssetInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				return getLocations();
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				return getAssetInfos();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH:
				return getSizeWidth();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER:
				return getSizeDiameter();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH:
				return getSizeLength();
			case InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION:
				return getOrientation();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH:
				return getSizeDepth();
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				return getSpecifications();
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
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				getAssetInfos().clear();
				getAssetInfos().addAll((Collection<? extends AssetInfo>)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH:
				setSizeWidth((Float)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER:
				setSizeDiameter((Float)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH:
				setSizeLength((Float)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH:
				setSizeDepth((Float)newValue);
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends Specification>)newValue);
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
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				getLocations().clear();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				getAssetInfos().clear();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH:
				unsetSizeWidth();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER:
				unsetSizeDiameter();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH:
				unsetSizeLength();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION:
				unsetOrientation();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH:
				unsetSizeDepth();
				return;
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				getSpecifications().clear();
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
			case InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case InfAssetsPackage.DIMENSIONS_INFO__ASSET_INFOS:
				return assetInfos != null && !assetInfos.isEmpty();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_WIDTH:
				return isSetSizeWidth();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DIAMETER:
				return isSetSizeDiameter();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_LENGTH:
				return isSetSizeLength();
			case InfAssetsPackage.DIMENSIONS_INFO__ORIENTATION:
				return isSetOrientation();
			case InfAssetsPackage.DIMENSIONS_INFO__SIZE_DEPTH:
				return isSetSizeDepth();
			case InfAssetsPackage.DIMENSIONS_INFO__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
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
		result.append(" (sizeWidth: ");
		if (sizeWidthESet) result.append(sizeWidth); else result.append("<unset>");
		result.append(", sizeDiameter: ");
		if (sizeDiameterESet) result.append(sizeDiameter); else result.append("<unset>");
		result.append(", sizeLength: ");
		if (sizeLengthESet) result.append(sizeLength); else result.append("<unset>");
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", sizeDepth: ");
		if (sizeDepthESet) result.append(sizeDepth); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DimensionsInfo
