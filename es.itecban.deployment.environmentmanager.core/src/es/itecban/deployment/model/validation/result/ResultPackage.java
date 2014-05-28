/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.validation.result;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.validation.result.ResultFactory
 * @model kind="package"
 * @generated
 */
public interface ResultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "result";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.deployment.itecban.es/ValidationResult";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "result";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultPackage eINSTANCE = es.itecban.deployment.model.validation.result.impl.ResultPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.validation.result.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.validation.result.impl.DocumentRootImpl
	 * @see es.itecban.deployment.model.validation.result.impl.ResultPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESULT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.validation.result.impl.PlanValidationResultImpl <em>Plan Validation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.validation.result.impl.PlanValidationResultImpl
	 * @see es.itecban.deployment.model.validation.result.impl.ResultPackageImpl#getPlanValidationResult()
	 * @generated
	 */
	int PLAN_VALIDATION_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_VALIDATION_RESULT__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_VALIDATION_RESULT__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Plan Validation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_VALIDATION_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.itecban.deployment.model.validation.result.ResultKind <em>Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.validation.result.ResultKind
	 * @see es.itecban.deployment.model.validation.result.impl.ResultPackageImpl#getResultKind()
	 * @generated
	 */
	int RESULT_KIND = 2;

	/**
	 * The meta object id for the '<em>Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.itecban.deployment.model.validation.result.ResultKind
	 * @see es.itecban.deployment.model.validation.result.impl.ResultPackageImpl#getResultKindObject()
	 * @generated
	 */
	int RESULT_KIND_OBJECT = 3;


	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.validation.result.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.itecban.deployment.model.validation.result.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.itecban.deployment.model.validation.result.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.itecban.deployment.model.validation.result.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.validation.result.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.itecban.deployment.model.validation.result.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.itecban.deployment.model.validation.result.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.itecban.deployment.model.validation.result.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.itecban.deployment.model.validation.result.DocumentRoot#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see es.itecban.deployment.model.validation.result.DocumentRoot#getResult()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Result();

	/**
	 * Returns the meta object for class '{@link es.itecban.deployment.model.validation.result.PlanValidationResult <em>Plan Validation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Validation Result</em>'.
	 * @see es.itecban.deployment.model.validation.result.PlanValidationResult
	 * @generated
	 */
	EClass getPlanValidationResult();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.validation.result.PlanValidationResult#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see es.itecban.deployment.model.validation.result.PlanValidationResult#getResult()
	 * @see #getPlanValidationResult()
	 * @generated
	 */
	EAttribute getPlanValidationResult_Result();

	/**
	 * Returns the meta object for the attribute '{@link es.itecban.deployment.model.validation.result.PlanValidationResult#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see es.itecban.deployment.model.validation.result.PlanValidationResult#getMessage()
	 * @see #getPlanValidationResult()
	 * @generated
	 */
	EAttribute getPlanValidationResult_Message();

	/**
	 * Returns the meta object for enum '{@link es.itecban.deployment.model.validation.result.ResultKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind</em>'.
	 * @see es.itecban.deployment.model.validation.result.ResultKind
	 * @generated
	 */
	EEnum getResultKind();

	/**
	 * Returns the meta object for data type '{@link es.itecban.deployment.model.validation.result.ResultKind <em>Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kind Object</em>'.
	 * @see es.itecban.deployment.model.validation.result.ResultKind
	 * @model instanceClass="es.itecban.deployment.model.validation.result.ResultKind"
	 *        extendedMetaData="name='ResultKind:Object' baseType='ResultKind'"
	 * @generated
	 */
	EDataType getResultKindObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultFactory getResultFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.validation.result.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.validation.result.impl.DocumentRootImpl
		 * @see es.itecban.deployment.model.validation.result.impl.ResultPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESULT = eINSTANCE.getDocumentRoot_Result();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.validation.result.impl.PlanValidationResultImpl <em>Plan Validation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.validation.result.impl.PlanValidationResultImpl
		 * @see es.itecban.deployment.model.validation.result.impl.ResultPackageImpl#getPlanValidationResult()
		 * @generated
		 */
		EClass PLAN_VALIDATION_RESULT = eINSTANCE.getPlanValidationResult();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_VALIDATION_RESULT__RESULT = eINSTANCE.getPlanValidationResult_Result();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_VALIDATION_RESULT__MESSAGE = eINSTANCE.getPlanValidationResult_Message();

		/**
		 * The meta object literal for the '{@link es.itecban.deployment.model.validation.result.ResultKind <em>Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.validation.result.ResultKind
		 * @see es.itecban.deployment.model.validation.result.impl.ResultPackageImpl#getResultKind()
		 * @generated
		 */
		EEnum RESULT_KIND = eINSTANCE.getResultKind();

		/**
		 * The meta object literal for the '<em>Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.itecban.deployment.model.validation.result.ResultKind
		 * @see es.itecban.deployment.model.validation.result.impl.ResultPackageImpl#getResultKindObject()
		 * @generated
		 */
		EDataType RESULT_KIND_OBJECT = eINSTANCE.getResultKindObject();

	}

} //ResultPackage
