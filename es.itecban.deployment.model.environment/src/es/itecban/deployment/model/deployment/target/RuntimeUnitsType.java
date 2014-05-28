/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.target;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Units Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.RuntimeUnitsType#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeUnitsType()
 * @model extendedMetaData="name='runtimeUnits_._type' kind='elementOnly'"
 * @generated
 */
public interface RuntimeUnitsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.target.RuntimeUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getRuntimeUnitsType_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit'"
	 * @generated
	 */
	EList<RuntimeUnitType> getUnit();

} // RuntimeUnitsType
