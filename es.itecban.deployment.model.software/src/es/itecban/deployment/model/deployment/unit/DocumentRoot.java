/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getDependency <em>Dependency</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getDeploymentUnit <em>Deployment Unit</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getLocalityConstraint <em>Locality Constraint</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getPackage <em>Package</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getPropertyKind <em>Property Kind</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getProvider <em>Provider</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getRequiredResource <em>Required Resource</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getRequiredResourceProperty <em>Required Resource Property</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	Map<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	Map<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference.
	 * @see #setDependency(DependencyType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_Dependency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace'"
	 * @generated
	 */
	DependencyType getDependency();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getDependency <em>Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' containment reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(DependencyType value);

	/**
	 * Returns the value of the '<em><b>Deployment Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				This is the root of the deployment unit descriptor. Each
	 * 				deployment unit MUST include a description with the set
	 * 				of provided resources. Optionally the description MAY
	 * 				impose a set of constraints on the deployment target and
	 * 				include dependencies with other deployment units
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Unit</em>' containment reference.
	 * @see #setDeploymentUnit(DeploymentUnitType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_DeploymentUnit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deploymentUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	DeploymentUnitType getDeploymentUnit();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getDeploymentUnit <em>Deployment Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Unit</em>' containment reference.
	 * @see #getDeploymentUnit()
	 * @generated
	 */
	void setDeploymentUnit(DeploymentUnitType value);

	/**
	 * Returns the value of the '<em><b>Locality Constraint</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.unit.LocalityConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locality Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locality Constraint</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
	 * @see #setLocalityConstraint(LocalityConstraintType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_LocalityConstraint()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='localityConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalityConstraintType getLocalityConstraint();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getLocalityConstraint <em>Locality Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality Constraint</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.unit.LocalityConstraintType
	 * @see #getLocalityConstraint()
	 * @generated
	 */
	void setLocalityConstraint(LocalityConstraintType value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(PackageType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_Package()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='package' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageType getPackage();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PackageType value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Property Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.deployment.unit.PropertyKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Kind</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
	 * @see #setPropertyKind(PropertyKindType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_PropertyKind()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='propertyKind' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyKindType getPropertyKind();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getPropertyKind <em>Property Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Kind</em>' attribute.
	 * @see es.itecban.deployment.model.deployment.unit.PropertyKindType
	 * @see #getPropertyKind()
	 * @generated
	 */
	void setPropertyKind(PropertyKindType value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(ProviderType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_Provider()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	ProviderType getProvider();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(ProviderType value);

	/**
	 * Returns the value of the '<em><b>Required Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource</em>' containment reference.
	 * @see #setRequiredResource(RequiredResourceType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_RequiredResource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requiredResource' namespace='##targetNamespace'"
	 * @generated
	 */
	RequiredResourceType getRequiredResource();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getRequiredResource <em>Required Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resource</em>' containment reference.
	 * @see #getRequiredResource()
	 * @generated
	 */
	void setRequiredResource(RequiredResourceType value);

	/**
	 * Returns the value of the '<em><b>Required Resource Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Resource Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resource Property</em>' containment reference.
	 * @see #setRequiredResourceProperty(RequiredResourcePropertyType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_RequiredResourceProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requiredResourceProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	RequiredResourcePropertyType getRequiredResourceProperty();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getRequiredResourceProperty <em>Required Resource Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Resource Property</em>' containment reference.
	 * @see #getRequiredResourceProperty()
	 * @generated
	 */
	void setRequiredResourceProperty(RequiredResourcePropertyType value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceType)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDocumentRoot_Resource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceType getResource();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DocumentRoot#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceType value);

} // DocumentRoot
