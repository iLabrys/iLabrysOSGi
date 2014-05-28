/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration.impl;

import es.itecban.deployment.model.configuration.ConfigurationPackage;
import es.itecban.deployment.model.configuration.EnvironmentPropertyType;
import es.itecban.deployment.model.configuration.IsMandatory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.EnvironmentPropertyTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.EnvironmentPropertyTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.EnvironmentPropertyTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.itecban.deployment.model.configuration.impl.EnvironmentPropertyTypeImpl#getMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentPropertyTypeImpl extends EObjectImpl implements EnvironmentPropertyType {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final IsMandatory MANDATORY_EDEFAULT = IsMandatory.OPTIONAL;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected IsMandatory mandatory = MANDATORY_EDEFAULT;

	/**
	 * This is true if the Mandatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mandatoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.ENVIRONMENT_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsMandatory getMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(IsMandatory newMandatory) {
		IsMandatory oldMandatory = mandatory;
		mandatory = newMandatory == null ? MANDATORY_EDEFAULT : newMandatory;
		boolean oldMandatoryESet = mandatoryESet;
		mandatoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__MANDATORY, oldMandatory, mandatory, !oldMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMandatory() {
		IsMandatory oldMandatory = mandatory;
		boolean oldMandatoryESet = mandatoryESet;
		mandatory = MANDATORY_EDEFAULT;
		mandatoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__MANDATORY, oldMandatory, MANDATORY_EDEFAULT, oldMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMandatory() {
		return mandatoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__KEY:
				return getKey();
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__VALUE:
				return getValue();
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__DESCRIPTION:
				return getDescription();
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__MANDATORY:
				return getMandatory();
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
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__KEY:
				setKey((String)newValue);
				return;
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__MANDATORY:
				setMandatory((IsMandatory)newValue);
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
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__MANDATORY:
				unsetMandatory();
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
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE__MANDATORY:
				return isSetMandatory();
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
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(", description: ");
		result.append(description);
		result.append(", mandatory: ");
		if (mandatoryESet) result.append(mandatory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EnvironmentPropertyTypeImpl
