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
 * A representation of the model object '<em><b>Dependencies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DependenciesType#getDependencyExpression <em>Dependency Expression</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.DependenciesType#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependenciesType()
 * @model extendedMetaData="name='dependencies_._type' kind='elementOnly'"
 * @generated
 */
public interface DependenciesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 									This is a boolean expression that
	 * 									accepts parenthesis and makes
	 * 									references to dependency items by
	 * 									id. Syntax: - The boolean operators
	 * 									are written as: AND, OR, XOR and NOT
	 * 									- Parentheses can be used to
	 * 									establish precedence rules. All
	 * 									these expressions will be
	 * 									interpreted as Component &amp;
	 * 									(dependencyExpression), for example:
	 * 									A AND (B XOR D)
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency Expression</em>' attribute.
	 * @see #setDependencyExpression(String)
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependenciesType_DependencyExpression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='dependencyExpression'"
	 * @generated
	 */
	String getDependencyExpression();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.deployment.unit.DependenciesType#getDependencyExpression <em>Dependency Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Expression</em>' attribute.
	 * @see #getDependencyExpression()
	 * @generated
	 */
	void setDependencyExpression(String value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 									Collection of dependencies related
	 * 									to this deployment unit. A
	 * 									deployment unit can manifest
	 * 									dependencies either to other
	 * 									deployment units or to specific
	 * 									required resources.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getDependenciesType_Dependency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependency'"
	 * @generated
	 */
	List<DependencyType> getDependency();

} // DependenciesType
