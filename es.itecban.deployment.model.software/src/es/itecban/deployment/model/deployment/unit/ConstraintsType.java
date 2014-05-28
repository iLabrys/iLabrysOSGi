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
 * A representation of the model object '<em><b>Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.ConstraintsType#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getConstraintsType()
 * @model extendedMetaData="name='constraints_._type' kind='elementOnly'"
 * @generated
 */
public interface ConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.RequiredResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getConstraintsType_Constraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraint'"
	 * @generated
	 */
	List<RequiredResourceType> getConstraint();

} // ConstraintsType
