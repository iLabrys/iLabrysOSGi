/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.validation.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Validation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.validation.result.PlanValidationResult#getResult <em>Result</em>}</li>
 *   <li>{@link es.itecban.deployment.model.validation.result.PlanValidationResult#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.itecban.deployment.model.validation.result.ResultPackage#getPlanValidationResult()
 * @model extendedMetaData="name='PlanValidationResult' kind='elementOnly'"
 * @generated
 */
public interface PlanValidationResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link es.itecban.deployment.model.validation.result.ResultKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see es.itecban.deployment.model.validation.result.ResultKind
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #setResult(ResultKind)
	 * @see es.itecban.deployment.model.validation.result.ResultPackage#getPlanValidationResult_Result()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='result'"
	 * @generated
	 */
	ResultKind getResult();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.validation.result.PlanValidationResult#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see es.itecban.deployment.model.validation.result.ResultKind
	 * @see #isSetResult()
	 * @see #unsetResult()
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ResultKind value);

	/**
	 * Unsets the value of the '{@link es.itecban.deployment.model.validation.result.PlanValidationResult#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResult()
	 * @see #getResult()
	 * @see #setResult(ResultKind)
	 * @generated
	 */
	void unsetResult();

	/**
	 * Returns whether the value of the '{@link es.itecban.deployment.model.validation.result.PlanValidationResult#getResult <em>Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result</em>' attribute is set.
	 * @see #unsetResult()
	 * @see #getResult()
	 * @see #setResult(ResultKind)
	 * @generated
	 */
	boolean isSetResult();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see es.itecban.deployment.model.validation.result.ResultPackage#getPlanValidationResult_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link es.itecban.deployment.model.validation.result.PlanValidationResult#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // PlanValidationResult
