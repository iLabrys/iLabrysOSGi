/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.impl;

import es.itecban.deployment.model.deployment.plan.DeploymentActivityKindType;
import es.itecban.deployment.model.deployment.plan.DeploymentActivityType;
import es.itecban.deployment.model.deployment.plan.InitialConfigurationType;
import es.itecban.deployment.model.deployment.plan.PlanPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Activity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl#getUnitVersion <em>Unit Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl#getInitialConfiguration <em>Initial Configuration</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl#getPreviousUnitName <em>Previous Unit Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.impl.DeploymentActivityTypeImpl#getPreviousUnitVersion <em>Previous Unit Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentActivityTypeImpl extends ActivityTypeImpl implements DeploymentActivityType {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentActivityKindType TYPE_EDEFAULT = DeploymentActivityKindType.INSTALLDEPLOYMENTUNIT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DeploymentActivityKindType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getUnitName() <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitName() <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitName()
	 * @generated
	 * @ordered
	 */
	protected String unitName = UNIT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitVersion() <em>Unit Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitVersion() <em>Unit Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitVersion()
	 * @generated
	 * @ordered
	 */
	protected String unitVersion = UNIT_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialConfiguration() <em>Initial Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialConfiguration()
	 * @generated
	 * @ordered
	 */
	protected InitialConfigurationType initialConfiguration;

	/**
	 * The default value of the '{@link #getPreviousUnitName() <em>Previous Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousUnitName()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_UNIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousUnitName() <em>Previous Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousUnitName()
	 * @generated
	 * @ordered
	 */
	protected String previousUnitName = PREVIOUS_UNIT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousUnitVersion() <em>Previous Unit Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousUnitVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_UNIT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousUnitVersion() <em>Previous Unit Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousUnitVersion()
	 * @generated
	 * @ordered
	 */
	protected String previousUnitVersion = PREVIOUS_UNIT_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentActivityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanPackage.Literals.DEPLOYMENT_ACTIVITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentActivityKindType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DeploymentActivityKindType newType) {
		DeploymentActivityKindType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		DeploymentActivityKindType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitName() {
		return unitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitName(String newUnitName) {
		String oldUnitName = unitName;
		unitName = newUnitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_NAME, oldUnitName, unitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitVersion() {
		return unitVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitVersion(String newUnitVersion) {
		String oldUnitVersion = unitVersion;
		unitVersion = newUnitVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_VERSION, oldUnitVersion, unitVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialConfigurationType getInitialConfiguration() {
		return initialConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialConfiguration(InitialConfigurationType newInitialConfiguration, NotificationChain msgs) {
		InitialConfigurationType oldInitialConfiguration = initialConfiguration;
		initialConfiguration = newInitialConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION, oldInitialConfiguration, newInitialConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialConfiguration(InitialConfigurationType newInitialConfiguration) {
		if (newInitialConfiguration != initialConfiguration) {
			NotificationChain msgs = null;
			if (initialConfiguration != null)
				msgs = ((InternalEObject)initialConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION, null, msgs);
			if (newInitialConfiguration != null)
				msgs = ((InternalEObject)newInitialConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION, null, msgs);
			msgs = basicSetInitialConfiguration(newInitialConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION, newInitialConfiguration, newInitialConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviousUnitName() {
		return previousUnitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousUnitName(String newPreviousUnitName) {
		String oldPreviousUnitName = previousUnitName;
		previousUnitName = newPreviousUnitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_NAME, oldPreviousUnitName, previousUnitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviousUnitVersion() {
		return previousUnitVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousUnitVersion(String newPreviousUnitVersion) {
		String oldPreviousUnitVersion = previousUnitVersion;
		previousUnitVersion = newPreviousUnitVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_VERSION, oldPreviousUnitVersion, previousUnitVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION:
				return basicSetInitialConfiguration(null, msgs);
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
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__TYPE:
				return getType();
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_NAME:
				return getUnitName();
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_VERSION:
				return getUnitVersion();
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION:
				return getInitialConfiguration();
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_NAME:
				return getPreviousUnitName();
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_VERSION:
				return getPreviousUnitVersion();
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
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__TYPE:
				setType((DeploymentActivityKindType)newValue);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_NAME:
				setUnitName((String)newValue);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_VERSION:
				setUnitVersion((String)newValue);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION:
				setInitialConfiguration((InitialConfigurationType)newValue);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_NAME:
				setPreviousUnitName((String)newValue);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_VERSION:
				setPreviousUnitVersion((String)newValue);
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
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__TYPE:
				unsetType();
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_NAME:
				setUnitName(UNIT_NAME_EDEFAULT);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_VERSION:
				setUnitVersion(UNIT_VERSION_EDEFAULT);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION:
				setInitialConfiguration((InitialConfigurationType)null);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_NAME:
				setPreviousUnitName(PREVIOUS_UNIT_NAME_EDEFAULT);
				return;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_VERSION:
				setPreviousUnitVersion(PREVIOUS_UNIT_VERSION_EDEFAULT);
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
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__TYPE:
				return isSetType();
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_NAME:
				return UNIT_NAME_EDEFAULT == null ? unitName != null : !UNIT_NAME_EDEFAULT.equals(unitName);
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__UNIT_VERSION:
				return UNIT_VERSION_EDEFAULT == null ? unitVersion != null : !UNIT_VERSION_EDEFAULT.equals(unitVersion);
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__INITIAL_CONFIGURATION:
				return initialConfiguration != null;
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_NAME:
				return PREVIOUS_UNIT_NAME_EDEFAULT == null ? previousUnitName != null : !PREVIOUS_UNIT_NAME_EDEFAULT.equals(previousUnitName);
			case PlanPackage.DEPLOYMENT_ACTIVITY_TYPE__PREVIOUS_UNIT_VERSION:
				return PREVIOUS_UNIT_VERSION_EDEFAULT == null ? previousUnitVersion != null : !PREVIOUS_UNIT_VERSION_EDEFAULT.equals(previousUnitVersion);
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", unitName: ");
		result.append(unitName);
		result.append(", unitVersion: ");
		result.append(unitVersion);
		result.append(", previousUnitName: ");
		result.append(previousUnitName);
		result.append(", previousUnitVersion: ");
		result.append(previousUnitVersion);
		result.append(')');
		return result.toString();
	}

} //DeploymentActivityTypeImpl
