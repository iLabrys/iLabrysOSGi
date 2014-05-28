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
 * A representation of the model object '<em><b>Supported Packages Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.target.SupportedPackagesType#getContainerPackage <em>Container Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getSupportedPackagesType()
 * @model extendedMetaData="name='supportedPackages_._type' kind='elementOnly'"
 * @generated
 */
public interface SupportedPackagesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Container Package</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.deployment.target.SupportedPackageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Package</em>' containment reference list.
	 * @see es.itecban.deployment.model.deployment.target.TargetPackage#getSupportedPackagesType_ContainerPackage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='containerPackage'"
	 * @generated
	 */
	EList<SupportedPackageType> getContainerPackage();

} // SupportedPackagesType
