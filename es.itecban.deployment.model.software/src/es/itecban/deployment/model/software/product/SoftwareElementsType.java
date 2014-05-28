/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product;

import es.itecban.deployment.model.deployment.unit.DeploymentUnitType;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.SoftwareElementsType#getSoftwareElementList <em>Software Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareElementsType()
 * @model extendedMetaData="name='softwareElements_._type' kind='elementOnly'"
 * @generated
 */
public interface SoftwareElementsType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentUnitType[] getSoftwareElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentUnitType getSoftwareElement(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getSoftwareElementLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setSoftwareElement(DeploymentUnitType[] newSoftwareElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setSoftwareElement(int index, DeploymentUnitType element);

	/**
	 * Returns the value of the '<em><b>Software Element</b></em>' reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.unit.DeploymentUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Element</em>' reference list.
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getSoftwareElementsType_SoftwareElement()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='softwareElement'"
	 * @generated
	 */
	List<DeploymentUnitType> getSoftwareElementList();

} // SoftwareElementsType
