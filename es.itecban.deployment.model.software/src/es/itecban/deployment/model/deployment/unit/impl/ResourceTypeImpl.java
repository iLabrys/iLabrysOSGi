/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import java.util.List;

import es.itecban.deployment.model.deployment.unit.PropertyType;
import es.itecban.deployment.model.deployment.unit.ResourcePropertiesType;
import es.itecban.deployment.model.deployment.unit.ResourceType;
import es.itecban.deployment.model.deployment.unit.TypesType;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.ResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.ResourceTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.ResourceTypeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.ResourceTypeImpl#getResourceProperties <em>Resource Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceTypeImpl extends EObjectImpl implements ResourceType {
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
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected TypesType types;

	/**
	 * The cached value of the '{@link #getResourceProperties() <em>Resource Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProperties()
	 * @generated
	 * @ordered
	 */
	protected ResourcePropertiesType resourceProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitPackage.Literals.RESOURCE_TYPE;
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
		name = newName;
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
		version = newVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypes(TypesType newTypes, NotificationChain msgs) {
		TypesType oldTypes = types;
		types = newTypes;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(TypesType newTypes) {
		if (newTypes != types) {
			NotificationChain msgs = null;
			if (types != null)
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.RESOURCE_TYPE__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.RESOURCE_TYPE__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePropertiesType getResourceProperties() {
		return resourceProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceProperties(ResourcePropertiesType newResourceProperties, NotificationChain msgs) {
		ResourcePropertiesType oldResourceProperties = resourceProperties;
		resourceProperties = newResourceProperties;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceProperties(ResourcePropertiesType newResourceProperties) {
		if (newResourceProperties != resourceProperties) {
			NotificationChain msgs = null;
			if (resourceProperties != null)
				msgs = ((InternalEObject)resourceProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitPackage.RESOURCE_TYPE__RESOURCE_PROPERTIES, null, msgs);
			if (newResourceProperties != null)
				msgs = ((InternalEObject)newResourceProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitPackage.RESOURCE_TYPE__RESOURCE_PROPERTIES, null, msgs);
			msgs = basicSetResourceProperties(newResourceProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnitPackage.RESOURCE_TYPE__TYPES:
				return basicSetTypes(null, msgs);
			case UnitPackage.RESOURCE_TYPE__RESOURCE_PROPERTIES:
				return basicSetResourceProperties(null, msgs);
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
			case UnitPackage.RESOURCE_TYPE__NAME:
				return getName();
			case UnitPackage.RESOURCE_TYPE__VERSION:
				return getVersion();
			case UnitPackage.RESOURCE_TYPE__TYPES:
				return getTypes();
			case UnitPackage.RESOURCE_TYPE__RESOURCE_PROPERTIES:
				return getResourceProperties();
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
			case UnitPackage.RESOURCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case UnitPackage.RESOURCE_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case UnitPackage.RESOURCE_TYPE__TYPES:
				setTypes((TypesType)newValue);
				return;
			case UnitPackage.RESOURCE_TYPE__RESOURCE_PROPERTIES:
				setResourceProperties((ResourcePropertiesType)newValue);
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
			case UnitPackage.RESOURCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnitPackage.RESOURCE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case UnitPackage.RESOURCE_TYPE__TYPES:
				setTypes((TypesType)null);
				return;
			case UnitPackage.RESOURCE_TYPE__RESOURCE_PROPERTIES:
				setResourceProperties((ResourcePropertiesType)null);
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
			case UnitPackage.RESOURCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnitPackage.RESOURCE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case UnitPackage.RESOURCE_TYPE__TYPES:
				return types != null;
			case UnitPackage.RESOURCE_TYPE__RESOURCE_PROPERTIES:
				return resourceProperties != null;
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
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof ResourceTypeImpl)) return false;
		ResourceType n = (ResourceType) obj;
		if (!name.equals(n.getName())) return false;
		if (!version.equals(n.getVersion())) return false;
		List<String> nt = n.getTypes().getType();
		if (types.getType().size() != nt.size()) return false;
		for (int i = 0; i < nt.size(); i++) {
			String s = nt.get(i);
			if (!s.equals(types.getType().get(i))) return false;
		}
		List<PropertyType> np = n.getResourceProperties().getResourceProperty();
		if (resourceProperties.getResourceProperty().size() != np.size()) return false;
		for (int i = 0; i < np.size(); i++) {
			PropertyType p = np.get(i);
			if (!p.equals(resourceProperties.getResourceProperty().get(i))) return false;
		}
		return true;
	}
	
	
} //ResourceTypeImpl
