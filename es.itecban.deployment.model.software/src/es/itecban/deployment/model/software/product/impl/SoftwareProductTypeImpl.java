/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.impl;

import es.itecban.deployment.model.software.product.FeaturesType;
import es.itecban.deployment.model.software.product.ProductDependenciesType;
import es.itecban.deployment.model.software.product.ProductPackage;
import es.itecban.deployment.model.software.product.SoftwareProductType;
import es.itecban.deployment.model.software.product.WarrantyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl#getWarranty <em>Warranty</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl#getProductDependencies <em>Product Dependencies</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl#getSKUnumber <em>SK Unumber</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.SoftwareProductTypeImpl#getIdentifyingNumber <em>Identifying Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareProductTypeImpl extends EObjectImpl implements SoftwareProductType {
	
	protected String e_id;
	public String getE_id() {
		return e_id;
	}

	public void setE_id(String e_id) {
		this.e_id = e_id;
	}

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWarranty() <em>Warranty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarranty()
	 * @generated
	 * @ordered
	 */
	protected WarrantyType warranty;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected FeaturesType features;

	/**
	 * The cached value of the '{@link #getProductDependencies() <em>Product Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDependencies()
	 * @generated
	 * @ordered
	 */
	protected ProductDependenciesType productDependencies;

	/**
	 * The default value of the '{@link #getSKUnumber() <em>SK Unumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKUnumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SK_UNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSKUnumber() <em>SK Unumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKUnumber()
	 * @generated
	 * @ordered
	 */
	protected String sKUnumber = SK_UNUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifyingNumber() <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFYING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifyingNumber() <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingNumber()
	 * @generated
	 * @ordered
	 */
	protected String identifyingNumber = IDENTIFYING_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.SOFTWARE_PRODUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarrantyType getWarranty() {
		return warranty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarranty(WarrantyType newWarranty, NotificationChain msgs) {
		WarrantyType oldWarranty = warranty;
		warranty = newWarranty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY, oldWarranty, newWarranty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarranty(WarrantyType newWarranty) {
		if (newWarranty != warranty) {
			NotificationChain msgs = null;
			if (warranty != null)
				msgs = ((InternalEObject)warranty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY, null, msgs);
			if (newWarranty != null)
				msgs = ((InternalEObject)newWarranty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY, null, msgs);
			msgs = basicSetWarranty(newWarranty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY, newWarranty, newWarranty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesType getFeatures() {
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatures(FeaturesType newFeatures, NotificationChain msgs) {
		FeaturesType oldFeatures = features;
		features = newFeatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES, oldFeatures, newFeatures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatures(FeaturesType newFeatures) {
		if (newFeatures != features) {
			NotificationChain msgs = null;
			if (features != null)
				msgs = ((InternalEObject)features).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES, null, msgs);
			if (newFeatures != null)
				msgs = ((InternalEObject)newFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES, null, msgs);
			msgs = basicSetFeatures(newFeatures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES, newFeatures, newFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDependenciesType getProductDependencies() {
		return productDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductDependencies(ProductDependenciesType newProductDependencies, NotificationChain msgs) {
		ProductDependenciesType oldProductDependencies = productDependencies;
		productDependencies = newProductDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES, oldProductDependencies, newProductDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDependencies(ProductDependenciesType newProductDependencies) {
		if (newProductDependencies != productDependencies) {
			NotificationChain msgs = null;
			if (productDependencies != null)
				msgs = ((InternalEObject)productDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES, null, msgs);
			if (newProductDependencies != null)
				msgs = ((InternalEObject)newProductDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES, null, msgs);
			msgs = basicSetProductDependencies(newProductDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES, newProductDependencies, newProductDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSKUnumber() {
		return sKUnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSKUnumber(String newSKUnumber) {
		String oldSKUnumber = sKUnumber;
		sKUnumber = newSKUnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__SK_UNUMBER, oldSKUnumber, sKUnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifyingNumber() {
		return identifyingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifyingNumber(String newIdentifyingNumber) {
		String oldIdentifyingNumber = identifyingNumber;
		identifyingNumber = newIdentifyingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOFTWARE_PRODUCT_TYPE__IDENTIFYING_NUMBER, oldIdentifyingNumber, identifyingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY:
				return basicSetWarranty(null, msgs);
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES:
				return basicSetFeatures(null, msgs);
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES:
				return basicSetProductDependencies(null, msgs);
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
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__NAME:
				return getName();
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__VERSION:
				return getVersion();
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY:
				return getWarranty();
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES:
				return getFeatures();
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES:
				return getProductDependencies();
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__SK_UNUMBER:
				return getSKUnumber();
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__IDENTIFYING_NUMBER:
				return getIdentifyingNumber();
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
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY:
				setWarranty((WarrantyType)newValue);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES:
				setFeatures((FeaturesType)newValue);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES:
				setProductDependencies((ProductDependenciesType)newValue);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__SK_UNUMBER:
				setSKUnumber((String)newValue);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__IDENTIFYING_NUMBER:
				setIdentifyingNumber((String)newValue);
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
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY:
				setWarranty((WarrantyType)null);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES:
				setFeatures((FeaturesType)null);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES:
				setProductDependencies((ProductDependenciesType)null);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__SK_UNUMBER:
				setSKUnumber(SK_UNUMBER_EDEFAULT);
				return;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__IDENTIFYING_NUMBER:
				setIdentifyingNumber(IDENTIFYING_NUMBER_EDEFAULT);
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
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__WARRANTY:
				return warranty != null;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__FEATURES:
				return features != null;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__PRODUCT_DEPENDENCIES:
				return productDependencies != null;
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__SK_UNUMBER:
				return SK_UNUMBER_EDEFAULT == null ? sKUnumber != null : !SK_UNUMBER_EDEFAULT.equals(sKUnumber);
			case ProductPackage.SOFTWARE_PRODUCT_TYPE__IDENTIFYING_NUMBER:
				return IDENTIFYING_NUMBER_EDEFAULT == null ? identifyingNumber != null : !IDENTIFYING_NUMBER_EDEFAULT.equals(identifyingNumber);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", sKUnumber: ");
		result.append(sKUnumber);
		result.append(", identifyingNumber: ");
		result.append(identifyingNumber);
		result.append(')');
		return result.toString();
	}

} //SoftwareProductTypeImpl
