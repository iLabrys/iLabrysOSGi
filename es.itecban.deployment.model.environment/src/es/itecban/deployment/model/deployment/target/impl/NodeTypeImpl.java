/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target.impl;

import es.itecban.deployment.model.deployment.target.NodeContainersType;
import es.itecban.deployment.model.deployment.target.NodePropertiesType;
import es.itecban.deployment.model.deployment.target.NodeResourcesType;
import es.itecban.deployment.model.deployment.target.NodeType;
import es.itecban.deployment.model.deployment.target.TargetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl#getNodeResources <em>Node Resources</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl#getNodeContainers <em>Node Containers</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.target.impl.NodeTypeImpl#getNodeProperties <em>Node Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeTypeImpl extends EObjectImpl implements NodeType {
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
	 * The cached value of the '{@link #getNodeResources() <em>Node Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeResources()
	 * @generated
	 * @ordered
	 */
	protected NodeResourcesType nodeResources;

	/**
	 * The cached value of the '{@link #getNodeContainers() <em>Node Containers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeContainers()
	 * @generated
	 * @ordered
	 */
	protected NodeContainersType nodeContainers;

	/**
	 * The cached value of the '{@link #getNodeProperties() <em>Node Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeProperties()
	 * @generated
	 * @ordered
	 */
	protected NodePropertiesType nodeProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.NODE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.NODE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.NODE_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeResourcesType getNodeResources() {
		return nodeResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeResources(NodeResourcesType newNodeResources, NotificationChain msgs) {
		NodeResourcesType oldNodeResources = nodeResources;
		nodeResources = newNodeResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.NODE_TYPE__NODE_RESOURCES, oldNodeResources, newNodeResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeResources(NodeResourcesType newNodeResources) {
		if (newNodeResources != nodeResources) {
			NotificationChain msgs = null;
			if (nodeResources != null)
				msgs = ((InternalEObject)nodeResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.NODE_TYPE__NODE_RESOURCES, null, msgs);
			if (newNodeResources != null)
				msgs = ((InternalEObject)newNodeResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.NODE_TYPE__NODE_RESOURCES, null, msgs);
			msgs = basicSetNodeResources(newNodeResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.NODE_TYPE__NODE_RESOURCES, newNodeResources, newNodeResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeContainersType getNodeContainers() {
		return nodeContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeContainers(NodeContainersType newNodeContainers, NotificationChain msgs) {
		NodeContainersType oldNodeContainers = nodeContainers;
		nodeContainers = newNodeContainers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.NODE_TYPE__NODE_CONTAINERS, oldNodeContainers, newNodeContainers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeContainers(NodeContainersType newNodeContainers) {
		if (newNodeContainers != nodeContainers) {
			NotificationChain msgs = null;
			if (nodeContainers != null)
				msgs = ((InternalEObject)nodeContainers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.NODE_TYPE__NODE_CONTAINERS, null, msgs);
			if (newNodeContainers != null)
				msgs = ((InternalEObject)newNodeContainers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.NODE_TYPE__NODE_CONTAINERS, null, msgs);
			msgs = basicSetNodeContainers(newNodeContainers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.NODE_TYPE__NODE_CONTAINERS, newNodeContainers, newNodeContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePropertiesType getNodeProperties() {
		return nodeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeProperties(NodePropertiesType newNodeProperties, NotificationChain msgs) {
		NodePropertiesType oldNodeProperties = nodeProperties;
		nodeProperties = newNodeProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPackage.NODE_TYPE__NODE_PROPERTIES, oldNodeProperties, newNodeProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeProperties(NodePropertiesType newNodeProperties) {
		if (newNodeProperties != nodeProperties) {
			NotificationChain msgs = null;
			if (nodeProperties != null)
				msgs = ((InternalEObject)nodeProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPackage.NODE_TYPE__NODE_PROPERTIES, null, msgs);
			if (newNodeProperties != null)
				msgs = ((InternalEObject)newNodeProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPackage.NODE_TYPE__NODE_PROPERTIES, null, msgs);
			msgs = basicSetNodeProperties(newNodeProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.NODE_TYPE__NODE_PROPERTIES, newNodeProperties, newNodeProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.NODE_TYPE__NODE_RESOURCES:
				return basicSetNodeResources(null, msgs);
			case TargetPackage.NODE_TYPE__NODE_CONTAINERS:
				return basicSetNodeContainers(null, msgs);
			case TargetPackage.NODE_TYPE__NODE_PROPERTIES:
				return basicSetNodeProperties(null, msgs);
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
			case TargetPackage.NODE_TYPE__NAME:
				return getName();
			case TargetPackage.NODE_TYPE__LABEL:
				return getLabel();
			case TargetPackage.NODE_TYPE__NODE_RESOURCES:
				return getNodeResources();
			case TargetPackage.NODE_TYPE__NODE_CONTAINERS:
				return getNodeContainers();
			case TargetPackage.NODE_TYPE__NODE_PROPERTIES:
				return getNodeProperties();
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
			case TargetPackage.NODE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.NODE_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case TargetPackage.NODE_TYPE__NODE_RESOURCES:
				setNodeResources((NodeResourcesType)newValue);
				return;
			case TargetPackage.NODE_TYPE__NODE_CONTAINERS:
				setNodeContainers((NodeContainersType)newValue);
				return;
			case TargetPackage.NODE_TYPE__NODE_PROPERTIES:
				setNodeProperties((NodePropertiesType)newValue);
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
			case TargetPackage.NODE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.NODE_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case TargetPackage.NODE_TYPE__NODE_RESOURCES:
				setNodeResources((NodeResourcesType)null);
				return;
			case TargetPackage.NODE_TYPE__NODE_CONTAINERS:
				setNodeContainers((NodeContainersType)null);
				return;
			case TargetPackage.NODE_TYPE__NODE_PROPERTIES:
				setNodeProperties((NodePropertiesType)null);
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
			case TargetPackage.NODE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.NODE_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case TargetPackage.NODE_TYPE__NODE_RESOURCES:
				return nodeResources != null;
			case TargetPackage.NODE_TYPE__NODE_CONTAINERS:
				return nodeContainers != null;
			case TargetPackage.NODE_TYPE__NODE_PROPERTIES:
				return nodeProperties != null;
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

} //NodeTypeImpl
