/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage
 * @generated
 */
public interface ReportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportFactory eINSTANCE = es.itecban.deployment.model.deployment.plan.report.impl.ReportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activities Execution Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activities Execution Report Type</em>'.
	 * @generated
	 */
	ActivitiesExecutionReportType createActivitiesExecutionReportType();

	/**
	 * Returns a new object of class '<em>Activity Exec Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Exec Report Type</em>'.
	 * @generated
	 */
	ActivityExecReportType createActivityExecReportType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Execution Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Report Type</em>'.
	 * @generated
	 */
	ExecutionReportType createExecutionReportType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReportPackage getReportPackage();

} //ReportFactory
