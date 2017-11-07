/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#getStructureSupportInfos <em>Structure Support Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#isRemoveWeed <em>Remove Weed</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#getHeight <em>Height</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantName <em>Fumigant Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#getMountingConnections <em>Mounting Connections</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Structure#getMaterialKind <em>Material Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Structure extends AssetContainer {
	/**
	 * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedVoltage()
	 * @generated
	 * @ordered
	 */
	protected float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Rated Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedVoltageESet;

	/**
	 * The cached value of the '{@link #getStructureSupportInfos() <em>Structure Support Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureSupportInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureSupport> structureSupportInfos;

	/**
	 * The default value of the '{@link #getFumigantAppliedDate() <em>Fumigant Applied Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumigantAppliedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String FUMIGANT_APPLIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFumigantAppliedDate() <em>Fumigant Applied Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumigantAppliedDate()
	 * @generated
	 * @ordered
	 */
	protected String fumigantAppliedDate = FUMIGANT_APPLIED_DATE_EDEFAULT;

	/**
	 * This is true if the Fumigant Applied Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fumigantAppliedDateESet;

	/**
	 * The default value of the '{@link #getWeedRemovedDate() <em>Weed Removed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeedRemovedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String WEED_REMOVED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeedRemovedDate() <em>Weed Removed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeedRemovedDate()
	 * @generated
	 * @ordered
	 */
	protected String weedRemovedDate = WEED_REMOVED_DATE_EDEFAULT;

	/**
	 * This is true if the Weed Removed Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weedRemovedDateESet;

	/**
	 * The default value of the '{@link #isRemoveWeed() <em>Remove Weed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveWeed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_WEED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveWeed() <em>Remove Weed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveWeed()
	 * @generated
	 * @ordered
	 */
	protected boolean removeWeed = REMOVE_WEED_EDEFAULT;

	/**
	 * This is true if the Remove Weed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean removeWeedESet;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * This is true if the Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heightESet;

	/**
	 * The default value of the '{@link #getFumigantName() <em>Fumigant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumigantName()
	 * @generated
	 * @ordered
	 */
	protected static final String FUMIGANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFumigantName() <em>Fumigant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumigantName()
	 * @generated
	 * @ordered
	 */
	protected String fumigantName = FUMIGANT_NAME_EDEFAULT;

	/**
	 * This is true if the Fumigant Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fumigantNameESet;

	/**
	 * The cached value of the '{@link #getMountingConnections() <em>Mounting Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<MountingConnection> mountingConnections;

	/**
	 * The default value of the '{@link #getMaterialKind() <em>Material Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialKind()
	 * @generated
	 * @ordered
	 */
	protected static final StructureMaterialKind MATERIAL_KIND_EDEFAULT = StructureMaterialKind.WOOD;

	/**
	 * The cached value of the '{@link #getMaterialKind() <em>Material Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialKind()
	 * @generated
	 * @ordered
	 */
	protected StructureMaterialKind materialKind = MATERIAL_KIND_EDEFAULT;

	/**
	 * This is true if the Material Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materialKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Structure() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getStructure();
	}

	/**
	 * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Voltage</em>' attribute.
	 * @see #isSetRatedVoltage()
	 * @see #unsetRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public float getRatedVoltage() {
		return ratedVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Voltage</em>' attribute.
	 * @see #isSetRatedVoltage()
	 * @see #unsetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @generated
	 */
	public void setRatedVoltage(float newRatedVoltage) {
		ratedVoltage = newRatedVoltage;
		ratedVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public void unsetRatedVoltage() {
		ratedVoltage = RATED_VOLTAGE_EDEFAULT;
		ratedVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Voltage</em>' attribute is set.
	 * @see #unsetRatedVoltage()
	 * @see #getRatedVoltage()
	 * @see #setRatedVoltage(float)
	 * @generated
	 */
	public boolean isSetRatedVoltage() {
		return ratedVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Structure Support Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.StructureSupport}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSecuredStructure <em>Secured Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Support Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Support Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSecuredStructure
	 * @generated
	 */
	public EList<StructureSupport> getStructureSupportInfos() {
		if (structureSupportInfos == null) {
			structureSupportInfos = new BasicInternalEList<StructureSupport>(StructureSupport.class);
		}
		return structureSupportInfos;
	}

	/**
	 * Returns the value of the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fumigant Applied Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fumigant Applied Date</em>' attribute.
	 * @see #isSetFumigantAppliedDate()
	 * @see #unsetFumigantAppliedDate()
	 * @see #setFumigantAppliedDate(String)
	 * @generated
	 */
	public String getFumigantAppliedDate() {
		return fumigantAppliedDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fumigant Applied Date</em>' attribute.
	 * @see #isSetFumigantAppliedDate()
	 * @see #unsetFumigantAppliedDate()
	 * @see #getFumigantAppliedDate()
	 * @generated
	 */
	public void setFumigantAppliedDate(String newFumigantAppliedDate) {
		fumigantAppliedDate = newFumigantAppliedDate;
		fumigantAppliedDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFumigantAppliedDate()
	 * @see #getFumigantAppliedDate()
	 * @see #setFumigantAppliedDate(String)
	 * @generated
	 */
	public void unsetFumigantAppliedDate() {
		fumigantAppliedDate = FUMIGANT_APPLIED_DATE_EDEFAULT;
		fumigantAppliedDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fumigant Applied Date</em>' attribute is set.
	 * @see #unsetFumigantAppliedDate()
	 * @see #getFumigantAppliedDate()
	 * @see #setFumigantAppliedDate(String)
	 * @generated
	 */
	public boolean isSetFumigantAppliedDate() {
		return fumigantAppliedDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weed Removed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weed Removed Date</em>' attribute.
	 * @see #isSetWeedRemovedDate()
	 * @see #unsetWeedRemovedDate()
	 * @see #setWeedRemovedDate(String)
	 * @generated
	 */
	public String getWeedRemovedDate() {
		return weedRemovedDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weed Removed Date</em>' attribute.
	 * @see #isSetWeedRemovedDate()
	 * @see #unsetWeedRemovedDate()
	 * @see #getWeedRemovedDate()
	 * @generated
	 */
	public void setWeedRemovedDate(String newWeedRemovedDate) {
		weedRemovedDate = newWeedRemovedDate;
		weedRemovedDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeedRemovedDate()
	 * @see #getWeedRemovedDate()
	 * @see #setWeedRemovedDate(String)
	 * @generated
	 */
	public void unsetWeedRemovedDate() {
		weedRemovedDate = WEED_REMOVED_DATE_EDEFAULT;
		weedRemovedDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weed Removed Date</em>' attribute is set.
	 * @see #unsetWeedRemovedDate()
	 * @see #getWeedRemovedDate()
	 * @see #setWeedRemovedDate(String)
	 * @generated
	 */
	public boolean isSetWeedRemovedDate() {
		return weedRemovedDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Weed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Weed</em>' attribute.
	 * @see #isSetRemoveWeed()
	 * @see #unsetRemoveWeed()
	 * @see #setRemoveWeed(boolean)
	 * @generated
	 */
	public boolean isRemoveWeed() {
		return removeWeed;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#isRemoveWeed <em>Remove Weed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Weed</em>' attribute.
	 * @see #isSetRemoveWeed()
	 * @see #unsetRemoveWeed()
	 * @see #isRemoveWeed()
	 * @generated
	 */
	public void setRemoveWeed(boolean newRemoveWeed) {
		removeWeed = newRemoveWeed;
		removeWeedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#isRemoveWeed <em>Remove Weed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoveWeed()
	 * @see #isRemoveWeed()
	 * @see #setRemoveWeed(boolean)
	 * @generated
	 */
	public void unsetRemoveWeed() {
		removeWeed = REMOVE_WEED_EDEFAULT;
		removeWeedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#isRemoveWeed <em>Remove Weed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remove Weed</em>' attribute is set.
	 * @see #unsetRemoveWeed()
	 * @see #isRemoveWeed()
	 * @see #setRemoveWeed(boolean)
	 * @generated
	 */
	public boolean isSetRemoveWeed() {
		return removeWeedESet;
	}

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #setHeight(float)
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	public void setHeight(float newHeight) {
		height = newHeight;
		heightESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(float)
	 * @generated
	 */
	public void unsetHeight() {
		height = HEIGHT_EDEFAULT;
		heightESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(float)
	 * @generated
	 */
	public boolean isSetHeight() {
		return heightESet;
	}

	/**
	 * Returns the value of the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fumigant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fumigant Name</em>' attribute.
	 * @see #isSetFumigantName()
	 * @see #unsetFumigantName()
	 * @see #setFumigantName(String)
	 * @generated
	 */
	public String getFumigantName() {
		return fumigantName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantName <em>Fumigant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fumigant Name</em>' attribute.
	 * @see #isSetFumigantName()
	 * @see #unsetFumigantName()
	 * @see #getFumigantName()
	 * @generated
	 */
	public void setFumigantName(String newFumigantName) {
		fumigantName = newFumigantName;
		fumigantNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantName <em>Fumigant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFumigantName()
	 * @see #getFumigantName()
	 * @see #setFumigantName(String)
	 * @generated
	 */
	public void unsetFumigantName() {
		fumigantName = FUMIGANT_NAME_EDEFAULT;
		fumigantNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantName <em>Fumigant Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fumigant Name</em>' attribute is set.
	 * @see #unsetFumigantName()
	 * @see #getFumigantName()
	 * @see #setFumigantName(String)
	 * @generated
	 */
	public boolean isSetFumigantName() {
		return fumigantNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Mounting Connections</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.MountingConnection}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos <em>Structure Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Connections</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos
	 * @generated
	 */
	public EList<MountingConnection> getMountingConnections() {
		if (mountingConnections == null) {
			mountingConnections = new BasicInternalEList<MountingConnection>(MountingConnection.class);
		}
		return mountingConnections;
	}

	/**
	 * Returns the value of the '<em><b>Material Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.StructureMaterialKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureMaterialKind
	 * @see #isSetMaterialKind()
	 * @see #unsetMaterialKind()
	 * @see #setMaterialKind(StructureMaterialKind)
	 * @generated
	 */
	public StructureMaterialKind getMaterialKind() {
		return materialKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getMaterialKind <em>Material Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureMaterialKind
	 * @see #isSetMaterialKind()
	 * @see #unsetMaterialKind()
	 * @see #getMaterialKind()
	 * @generated
	 */
	public void setMaterialKind(StructureMaterialKind newMaterialKind) {
		materialKind = newMaterialKind == null ? MATERIAL_KIND_EDEFAULT : newMaterialKind;
		materialKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getMaterialKind <em>Material Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaterialKind()
	 * @see #getMaterialKind()
	 * @see #setMaterialKind(StructureMaterialKind)
	 * @generated
	 */
	public void unsetMaterialKind() {
		materialKind = MATERIAL_KIND_EDEFAULT;
		materialKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getMaterialKind <em>Material Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Material Kind</em>' attribute is set.
	 * @see #unsetMaterialKind()
	 * @see #getMaterialKind()
	 * @see #setMaterialKind(StructureMaterialKind)
	 * @generated
	 */
	public boolean isSetMaterialKind() {
		return materialKindESet;
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
			case InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructureSupportInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.STRUCTURE__MOUNTING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMountingConnections()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS:
				return ((InternalEList<?>)getStructureSupportInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.STRUCTURE__MOUNTING_CONNECTIONS:
				return ((InternalEList<?>)getMountingConnections()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.STRUCTURE__RATED_VOLTAGE:
				return getRatedVoltage();
			case InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS:
				return getStructureSupportInfos();
			case InfAssetsPackage.STRUCTURE__FUMIGANT_APPLIED_DATE:
				return getFumigantAppliedDate();
			case InfAssetsPackage.STRUCTURE__WEED_REMOVED_DATE:
				return getWeedRemovedDate();
			case InfAssetsPackage.STRUCTURE__REMOVE_WEED:
				return isRemoveWeed();
			case InfAssetsPackage.STRUCTURE__HEIGHT:
				return getHeight();
			case InfAssetsPackage.STRUCTURE__FUMIGANT_NAME:
				return getFumigantName();
			case InfAssetsPackage.STRUCTURE__MOUNTING_CONNECTIONS:
				return getMountingConnections();
			case InfAssetsPackage.STRUCTURE__MATERIAL_KIND:
				return getMaterialKind();
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
			case InfAssetsPackage.STRUCTURE__RATED_VOLTAGE:
				setRatedVoltage((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS:
				getStructureSupportInfos().clear();
				getStructureSupportInfos().addAll((Collection<? extends StructureSupport>)newValue);
				return;
			case InfAssetsPackage.STRUCTURE__FUMIGANT_APPLIED_DATE:
				setFumigantAppliedDate((String)newValue);
				return;
			case InfAssetsPackage.STRUCTURE__WEED_REMOVED_DATE:
				setWeedRemovedDate((String)newValue);
				return;
			case InfAssetsPackage.STRUCTURE__REMOVE_WEED:
				setRemoveWeed((Boolean)newValue);
				return;
			case InfAssetsPackage.STRUCTURE__HEIGHT:
				setHeight((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE__FUMIGANT_NAME:
				setFumigantName((String)newValue);
				return;
			case InfAssetsPackage.STRUCTURE__MOUNTING_CONNECTIONS:
				getMountingConnections().clear();
				getMountingConnections().addAll((Collection<? extends MountingConnection>)newValue);
				return;
			case InfAssetsPackage.STRUCTURE__MATERIAL_KIND:
				setMaterialKind((StructureMaterialKind)newValue);
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
			case InfAssetsPackage.STRUCTURE__RATED_VOLTAGE:
				unsetRatedVoltage();
				return;
			case InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS:
				getStructureSupportInfos().clear();
				return;
			case InfAssetsPackage.STRUCTURE__FUMIGANT_APPLIED_DATE:
				unsetFumigantAppliedDate();
				return;
			case InfAssetsPackage.STRUCTURE__WEED_REMOVED_DATE:
				unsetWeedRemovedDate();
				return;
			case InfAssetsPackage.STRUCTURE__REMOVE_WEED:
				unsetRemoveWeed();
				return;
			case InfAssetsPackage.STRUCTURE__HEIGHT:
				unsetHeight();
				return;
			case InfAssetsPackage.STRUCTURE__FUMIGANT_NAME:
				unsetFumigantName();
				return;
			case InfAssetsPackage.STRUCTURE__MOUNTING_CONNECTIONS:
				getMountingConnections().clear();
				return;
			case InfAssetsPackage.STRUCTURE__MATERIAL_KIND:
				unsetMaterialKind();
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
			case InfAssetsPackage.STRUCTURE__RATED_VOLTAGE:
				return isSetRatedVoltage();
			case InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS:
				return structureSupportInfos != null && !structureSupportInfos.isEmpty();
			case InfAssetsPackage.STRUCTURE__FUMIGANT_APPLIED_DATE:
				return isSetFumigantAppliedDate();
			case InfAssetsPackage.STRUCTURE__WEED_REMOVED_DATE:
				return isSetWeedRemovedDate();
			case InfAssetsPackage.STRUCTURE__REMOVE_WEED:
				return isSetRemoveWeed();
			case InfAssetsPackage.STRUCTURE__HEIGHT:
				return isSetHeight();
			case InfAssetsPackage.STRUCTURE__FUMIGANT_NAME:
				return isSetFumigantName();
			case InfAssetsPackage.STRUCTURE__MOUNTING_CONNECTIONS:
				return mountingConnections != null && !mountingConnections.isEmpty();
			case InfAssetsPackage.STRUCTURE__MATERIAL_KIND:
				return isSetMaterialKind();
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
		result.append(" (ratedVoltage: ");
		if (ratedVoltageESet) result.append(ratedVoltage); else result.append("<unset>");
		result.append(", fumigantAppliedDate: ");
		if (fumigantAppliedDateESet) result.append(fumigantAppliedDate); else result.append("<unset>");
		result.append(", weedRemovedDate: ");
		if (weedRemovedDateESet) result.append(weedRemovedDate); else result.append("<unset>");
		result.append(", removeWeed: ");
		if (removeWeedESet) result.append(removeWeed); else result.append("<unset>");
		result.append(", height: ");
		if (heightESet) result.append(height); else result.append("<unset>");
		result.append(", fumigantName: ");
		if (fumigantNameESet) result.append(fumigantName); else result.append("<unset>");
		result.append(", materialKind: ");
		if (materialKindESet) result.append(materialKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Structure
