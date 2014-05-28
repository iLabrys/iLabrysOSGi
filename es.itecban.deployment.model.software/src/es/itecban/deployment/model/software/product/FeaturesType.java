/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.FeaturesType#getFeatureList <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.software.product.ProductPackage#getFeaturesType()
 * @model extendedMetaData="name='features_._type' kind='elementOnly'"
 * @generated
 */
public interface FeaturesType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareFeatureType[] getFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareFeatureType getFeature(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getFeatureLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setFeature(SoftwareFeatureType[] newFeature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setFeature(int index, SoftwareFeatureType element);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link es.itecban.deployment.model.software.product.SoftwareFeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see es.itecban.deployment.model.software.product.ProductPackage#getFeaturesType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature'"
	 * @generated
	 */
	List<SoftwareFeatureType> getFeatureList();

} // FeaturesType
