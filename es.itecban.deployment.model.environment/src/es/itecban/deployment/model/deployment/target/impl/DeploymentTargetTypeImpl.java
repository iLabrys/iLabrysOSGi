/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.BridgesType;
import es.itecban.deployment.model.deployment.target.DeploymentTargetType;
import es.itecban.deployment.model.deployment.target.InterconnectsType;
import es.itecban.deployment.model.deployment.target.NodesType;
import es.itecban.deployment.model.deployment.target.SharedResourcesType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Target Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl#getUUID <em>UUID</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl#getBridges <em>Bridges</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl#getInterconnects <em>Interconnects</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl#getSharedResources <em>Shared Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.DeploymentTargetTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentTargetTypeImpl extends EObjectImpl implements DeploymentTargetType {
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
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected String uUID = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected NodesType nodes;

	/**
	 * The cached value of the '{@link #getBridges() <em>Bridges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridges()
	 * @generated
	 * @ordered
	 */
	protected BridgesType bridges;

	/**
	 * The cached value of the '{@link #getInterconnects() <em>Interconnects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnects()
	 * @generated
	 * @ordered
	 */
	protected InterconnectsType interconnects;

	/**
	 * The cached value of the '{@link #getSharedResources() <em>Shared Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResources()
	 * @generated
	 * @ordered
	 */
	protected SharedResourcesType sharedResources;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentTargetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.DEPLOYMENT_TARGET_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUUID() {
		return uUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUUID(String newUUID) {
		String oldUUID = uUID;
		uUID = newUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__UUID, oldUUID, uUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesType getNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodes(NodesType newNodes, NotificationChain msgs) {
		NodesType oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES, oldNodes, newNodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(NodesType newNodes) {
		if (newNodes != nodes) {
			NotificationChain msgs = null;
			if (nodes != null)
				msgs = ((InternalEObject)nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES, null, msgs);
			if (newNodes != null)
				msgs = ((InternalEObject)newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES, null, msgs);
			msgs = basicSetNodes(newNodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES, newNodes, newNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgesType getBridges() {
		return bridges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBridges(BridgesType newBridges, NotificationChain msgs) {
		BridgesType oldBridges = bridges;
		bridges = newBridges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES, oldBridges, newBridges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBridges(BridgesType newBridges) {
		if (newBridges != bridges) {
			NotificationChain msgs = null;
			if (bridges != null)
				msgs = ((InternalEObject)bridges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES, null, msgs);
			if (newBridges != null)
				msgs = ((InternalEObject)newBridges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES, null, msgs);
			msgs = basicSetBridges(newBridges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES, newBridges, newBridges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectsType getInterconnects() {
		return interconnects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterconnects(InterconnectsType newInterconnects, NotificationChain msgs) {
		InterconnectsType oldInterconnects = interconnects;
		interconnects = newInterconnects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS, oldInterconnects, newInterconnects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterconnects(InterconnectsType newInterconnects) {
		if (newInterconnects != interconnects) {
			NotificationChain msgs = null;
			if (interconnects != null)
				msgs = ((InternalEObject)interconnects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS, null, msgs);
			if (newInterconnects != null)
				msgs = ((InternalEObject)newInterconnects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS, null, msgs);
			msgs = basicSetInterconnects(newInterconnects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS, newInterconnects, newInterconnects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedResourcesType getSharedResources() {
		return sharedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedResources(SharedResourcesType newSharedResources, NotificationChain msgs) {
		SharedResourcesType oldSharedResources = sharedResources;
		sharedResources = newSharedResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES, oldSharedResources, newSharedResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedResources(SharedResourcesType newSharedResources) {
		if (newSharedResources != sharedResources) {
			NotificationChain msgs = null;
			if (sharedResources != null)
				msgs = ((InternalEObject)sharedResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES, null, msgs);
			if (newSharedResources != null)
				msgs = ((InternalEObject)newSharedResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES, null, msgs);
			msgs = basicSetSharedResources(newSharedResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES, newSharedResources, newSharedResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DEPLOYMENT_TARGET_TYPE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES:
				return basicSetNodes(null, msgs);
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES:
				return basicSetBridges(null, msgs);
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS:
				return basicSetInterconnects(null, msgs);
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES:
				return basicSetSharedResources(null, msgs);
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
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NAME:
				return getName();
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__UUID:
				return getUUID();
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES:
				return getNodes();
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES:
				return getBridges();
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS:
				return getInterconnects();
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES:
				return getSharedResources();
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__TIMESTAMP:
				return getTimestamp();
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
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__UUID:
				setUUID((String)newValue);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES:
				setNodes((NodesType)newValue);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES:
				setBridges((BridgesType)newValue);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS:
				setInterconnects((InterconnectsType)newValue);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES:
				setSharedResources((SharedResourcesType)newValue);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__TIMESTAMP:
				setTimestamp((XMLGregorianCalendar)newValue);
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
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES:
				setNodes((NodesType)null);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES:
				setBridges((BridgesType)null);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS:
				setInterconnects((InterconnectsType)null);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES:
				setSharedResources((SharedResourcesType)null);
				return;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__UUID:
				return UUID_EDEFAULT == null ? uUID != null : !UUID_EDEFAULT.equals(uUID);
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__NODES:
				return nodes != null;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__BRIDGES:
				return bridges != null;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__INTERCONNECTS:
				return interconnects != null;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__SHARED_RESOURCES:
				return sharedResources != null;
			case TargetPackage.DEPLOYMENT_TARGET_TYPE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(", uUID: ");
		result.append(uUID);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //DeploymentTargetTypeImpl
