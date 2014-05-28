/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.ConnectedBridgesType;
import es.itecban.deployment.model.deployment.target.ConnectedNodesType;
import es.itecban.deployment.model.deployment.target.InterconnectResourcesType;
import es.itecban.deployment.model.deployment.target.InterconnectType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interconnect Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl#getInterconnectResources <em>Interconnect Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl#getConnectedNodes <em>Connected Nodes</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.InterconnectTypeImpl#getConnectedBridges <em>Connected Bridges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterconnectTypeImpl extends EObjectImpl implements InterconnectType {
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
	 * The cached value of the '{@link #getInterconnectResources() <em>Interconnect Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectResources()
	 * @generated
	 * @ordered
	 */
	protected InterconnectResourcesType interconnectResources;

	/**
	 * The cached value of the '{@link #getConnectedNodes() <em>Connected Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedNodes()
	 * @generated
	 * @ordered
	 */
	protected ConnectedNodesType connectedNodes;

	/**
	 * The cached value of the '{@link #getConnectedBridges() <em>Connected Bridges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedBridges()
	 * @generated
	 * @ordered
	 */
	protected ConnectedBridgesType connectedBridges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterconnectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.INTERCONNECT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.INTERCONNECT_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.INTERCONNECT_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectResourcesType getInterconnectResources() {
		return interconnectResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterconnectResources(InterconnectResourcesType newInterconnectResources, NotificationChain msgs) {
		InterconnectResourcesType oldInterconnectResources = interconnectResources;
		interconnectResources = newInterconnectResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES, oldInterconnectResources, newInterconnectResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterconnectResources(InterconnectResourcesType newInterconnectResources) {
		if (newInterconnectResources != interconnectResources) {
			NotificationChain msgs = null;
			if (interconnectResources != null)
				msgs = ((InternalEObject)interconnectResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES, null, msgs);
			if (newInterconnectResources != null)
				msgs = ((InternalEObject)newInterconnectResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES, null, msgs);
			msgs = basicSetInterconnectResources(newInterconnectResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES, newInterconnectResources, newInterconnectResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedNodesType getConnectedNodes() {
		return connectedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectedNodes(ConnectedNodesType newConnectedNodes, NotificationChain msgs) {
		ConnectedNodesType oldConnectedNodes = connectedNodes;
		connectedNodes = newConnectedNodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES, oldConnectedNodes, newConnectedNodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedNodes(ConnectedNodesType newConnectedNodes) {
		if (newConnectedNodes != connectedNodes) {
			NotificationChain msgs = null;
			if (connectedNodes != null)
				msgs = ((InternalEObject)connectedNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES, null, msgs);
			if (newConnectedNodes != null)
				msgs = ((InternalEObject)newConnectedNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES, null, msgs);
			msgs = basicSetConnectedNodes(newConnectedNodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES, newConnectedNodes, newConnectedNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedBridgesType getConnectedBridges() {
		return connectedBridges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectedBridges(ConnectedBridgesType newConnectedBridges, NotificationChain msgs) {
		ConnectedBridgesType oldConnectedBridges = connectedBridges;
		connectedBridges = newConnectedBridges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES, oldConnectedBridges, newConnectedBridges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedBridges(ConnectedBridgesType newConnectedBridges) {
		if (newConnectedBridges != connectedBridges) {
			NotificationChain msgs = null;
			if (connectedBridges != null)
				msgs = ((InternalEObject)connectedBridges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES, null, msgs);
			if (newConnectedBridges != null)
				msgs = ((InternalEObject)newConnectedBridges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES, null, msgs);
			msgs = basicSetConnectedBridges(newConnectedBridges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES, newConnectedBridges, newConnectedBridges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES:
				return basicSetInterconnectResources(null, msgs);
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES:
				return basicSetConnectedNodes(null, msgs);
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES:
				return basicSetConnectedBridges(null, msgs);
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
			case TargetPackage.INTERCONNECT_TYPE__NAME:
				return getName();
			case TargetPackage.INTERCONNECT_TYPE__LABEL:
				return getLabel();
			case TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES:
				return getInterconnectResources();
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES:
				return getConnectedNodes();
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES:
				return getConnectedBridges();
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
			case TargetPackage.INTERCONNECT_TYPE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.INTERCONNECT_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES:
				setInterconnectResources((InterconnectResourcesType)newValue);
				return;
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES:
				setConnectedNodes((ConnectedNodesType)newValue);
				return;
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES:
				setConnectedBridges((ConnectedBridgesType)newValue);
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
			case TargetPackage.INTERCONNECT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.INTERCONNECT_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES:
				setInterconnectResources((InterconnectResourcesType)null);
				return;
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES:
				setConnectedNodes((ConnectedNodesType)null);
				return;
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES:
				setConnectedBridges((ConnectedBridgesType)null);
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
			case TargetPackage.INTERCONNECT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.INTERCONNECT_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case TargetPackage.INTERCONNECT_TYPE__INTERCONNECT_RESOURCES:
				return interconnectResources != null;
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_NODES:
				return connectedNodes != null;
			case TargetPackage.INTERCONNECT_TYPE__CONNECTED_BRIDGES:
				return connectedBridges != null;
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

} //InterconnectTypeImpl
