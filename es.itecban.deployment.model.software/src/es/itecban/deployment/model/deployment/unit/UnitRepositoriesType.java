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
 * A representation of the model object '<em><b>Repositories Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.UnitRepositoriesType#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getUnitRepositoriesType()
 * @model extendedMetaData="name='unitRepositories_._type' kind='elementOnly'"
 * @generated
 */
public interface UnitRepositoriesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' attribute list.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getUnitRepositoriesType_Repository()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='repository'"
	 * @generated
	 */
	List<String> getRepository();

} // UnitRepositoriesType
