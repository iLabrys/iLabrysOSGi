/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.BridgeResourcesType;
import es.itecban.deployment.model.deployment.target.BridgeType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bridge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.BridgeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.BridgeTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.BridgeTypeImpl#getBridgeResources <em>Bridge Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgeTypeImpl extends EObjectImpl implements BridgeType {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBridgeResources() <em>Bridge Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeResources()
	 * @generated
	 * @ordered
	 */
	protected BridgeResourcesType bridgeResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.BRIDGE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.BRIDGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.BRIDGE_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeResourcesType getBridgeResources() {
		return bridgeResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBridgeResources(BridgeResourcesType newBridgeResources, NotificationChain msgs) {
		BridgeResourcesType oldBridgeResources = bridgeResources;
		bridgeResources = newBridgeResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES, oldBridgeResources, newBridgeResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBridgeResources(BridgeResourcesType newBridgeResources) {
		if (newBridgeResources != bridgeResources) {
			NotificationChain msgs = null;
			if (bridgeResources != null)
				msgs = ((InternalEObject)bridgeResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES, null, msgs);
			if (newBridgeResources != null)
				msgs = ((InternalEObject)newBridgeResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES, null, msgs);
			msgs = basicSetBridgeResources(newBridgeResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES, newBridgeResources, newBridgeResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES:
				return basicSetBridgeResources(null, msgs);
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
			case TargetPackage.BRIDGE_TYPE__NAME:
				return getName();
			case TargetPackage.BRIDGE_TYPE__LABEL:
				return getLabel();
			case TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES:
				return getBridgeResources();
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
			case TargetPackage.BRIDGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.BRIDGE_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES:
				setBridgeResources((BridgeResourcesType)newValue);
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
			case TargetPackage.BRIDGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.BRIDGE_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES:
				setBridgeResources((BridgeResourcesType)null);
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
			case TargetPackage.BRIDGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.BRIDGE_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case TargetPackage.BRIDGE_TYPE__BRIDGE_RESOURCES:
				return bridgeResources != null;
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
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //BridgeTypeImpl
