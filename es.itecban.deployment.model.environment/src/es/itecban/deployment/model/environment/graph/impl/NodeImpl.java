/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.environment.graph.impl;

import es.itecban.deployment.model.environment.graph.Dependency;
import es.itecban.deployment.model.environment.graph.GraphPackage;
import es.itecban.deployment.model.environment.graph.Node;
import es.itecban.deployment.model.environment.graph.impl.NodeImpl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl#getContainerName <em>Container Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl#getIsRequiredBy <em>Is Required By</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.environment.graph.impl.NodeImpl#getUnitVersion <em>Unit Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getContainerName() <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerName() <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName()
	 * @generated
	 * @ordered
	 */
	protected String containerName = CONTAINER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencies;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsRequiredBy() <em>Is Required By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRequiredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> isRequiredBy;

	/**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected String nodeName = NODE_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerName() {
		return containerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerName(String newContainerName) {
		containerName = newContainerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new BasicInternalEList<Dependency>(Dependency.class);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Dependency> getIsRequiredBy() {
		if (isRequiredBy == null) {
			isRequiredBy = new BasicInternalEList<Dependency>(Dependency.class);
		}
		return isRequiredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeName(String newNodeName) {
		nodeName = newNodeName;
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
		unitName = newUnitName;
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
		unitVersion = newUnitVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.NODE__CONTAINER_NAME:
				return getContainerName();
			case GraphPackage.NODE__DEPENDENCIES:
				return getDependencies();
			case GraphPackage.NODE__ID:
				return getId();
			case GraphPackage.NODE__IS_REQUIRED_BY:
				return getIsRequiredBy();
			case GraphPackage.NODE__NODE_NAME:
				return getNodeName();
			case GraphPackage.NODE__UNIT_NAME:
				return getUnitName();
			case GraphPackage.NODE__UNIT_VERSION:
				return getUnitVersion();
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
			case GraphPackage.NODE__CONTAINER_NAME:
				setContainerName((String)newValue);
				return;
			case GraphPackage.NODE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case GraphPackage.NODE__ID:
				setId((String)newValue);
				return;
			case GraphPackage.NODE__IS_REQUIRED_BY:
				getIsRequiredBy().clear();
				getIsRequiredBy().addAll((Collection<? extends Dependency>)newValue);
				return;
			case GraphPackage.NODE__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case GraphPackage.NODE__UNIT_NAME:
				setUnitName((String)newValue);
				return;
			case GraphPackage.NODE__UNIT_VERSION:
				setUnitVersion((String)newValue);
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
			case GraphPackage.NODE__CONTAINER_NAME:
				setContainerName(CONTAINER_NAME_EDEFAULT);
				return;
			case GraphPackage.NODE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case GraphPackage.NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case GraphPackage.NODE__IS_REQUIRED_BY:
				getIsRequiredBy().clear();
				return;
			case GraphPackage.NODE__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case GraphPackage.NODE__UNIT_NAME:
				setUnitName(UNIT_NAME_EDEFAULT);
				return;
			case GraphPackage.NODE__UNIT_VERSION:
				setUnitVersion(UNIT_VERSION_EDEFAULT);
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
			case GraphPackage.NODE__CONTAINER_NAME:
				return CONTAINER_NAME_EDEFAULT == null ? containerName != null : !CONTAINER_NAME_EDEFAULT.equals(containerName);
			case GraphPackage.NODE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case GraphPackage.NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GraphPackage.NODE__IS_REQUIRED_BY:
				return isRequiredBy != null && !isRequiredBy.isEmpty();
			case GraphPackage.NODE__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? nodeName != null : !NODE_NAME_EDEFAULT.equals(nodeName);
			case GraphPackage.NODE__UNIT_NAME:
				return UNIT_NAME_EDEFAULT == null ? unitName != null : !UNIT_NAME_EDEFAULT.equals(unitName);
			case GraphPackage.NODE__UNIT_VERSION:
				return UNIT_VERSION_EDEFAULT == null ? unitVersion != null : !UNIT_VERSION_EDEFAULT.equals(unitVersion);
		}
		return super.eIsSet(featureID);
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public String toString() {
//		if (eIsProxy()) return super.toString();
//
//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (containerName: ");
//		result.append(containerName);
//		result.append(", id: ");
//		result.append(id);
//		result.append(", nodeName: ");
//		result.append(nodeName);
//		result.append(", unitName: ");
//		result.append(unitName);
//		result.append(", unitVersion: ");
//		result.append(unitVersion);
//		result.append(')');
//		return result.toString();
//	}
	
	/**
	 * @generated NOT
	 */
	public String toString() {
		return this.getUnitName() + " " + this.getUnitVersion() + " in " + this.getContainerName();
	}
	/**
	 * @generated NOT
	 */
	public boolean equals(Object obj) {
		if (obj instanceof NodeImpl) {
			NodeImpl n = (NodeImpl) obj;
			String nn = n.getUnitName();
			String nv = n.getUnitVersion();
			String nc = n.getContainerName();
			String nnod = n.getNodeName();
			String tn = this.getUnitName();
			String tv = this.getUnitVersion();
			String tc = this.getContainerName();
			String tnod = this.getNodeName();
			if (nn.equals(tn) && nc.equals(tc) && nnod.equals(tnod)) {
				if (nv == null && tv == null)
					return true;
				if (nv != null && tv != null)
					return nv.equals(tv);
			}
		}
		return false;
	}

} //NodeImpl
