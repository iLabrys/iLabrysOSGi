/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exported Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ExportedResourcesType#getExportedResource <em>Exported Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getExportedResourcesType()
 * @model extendedMetaData="name='exportedResources_._type' kind='elementOnly'"
 * @generated
 */
public interface ExportedResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exported Resource</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Resource</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getExportedResourcesType_ExportedResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exportedResource'"
	 * @generated
	 */
	List<ResourceType> getExportedResource();

} // ExportedResourcesType
