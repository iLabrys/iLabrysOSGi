/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report.impl;

import es.itecban.deployment.model.deployment.plan.report.ActivitiesExecutionReportType;
import es.itecban.deployment.model.deployment.plan.report.ActivityExecReportType;
import es.itecban.deployment.model.deployment.plan.report.ReportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activities Execution Report Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.plan.report.impl.ActivitiesExecutionReportTypeImpl#getActivityExecutionReport <em>Activity Execution Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivitiesExecutionReportTypeImpl extends EObjectImpl implements ActivitiesExecutionReportType {
	/**
	 * The cached value of the '{@link #getActivityExecutionReport() <em>Activity Execution Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityExecutionReport()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityExecReportType> activityExecutionReport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivitiesExecutionReportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.ACTIVITIES_EXECUTION_REPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityExecReportType> getActivityExecutionReport() {
		if (activityExecutionReport == null) {
			activityExecutionReport = new EObjectContainmentEList<ActivityExecReportType>(ActivityExecReportType.class, this, ReportPackage.ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT);
		}
		return activityExecutionReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportPackage.ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT:
				return ((InternalEList<?>)getActivityExecutionReport()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT:
				return getActivityExecutionReport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportPackage.ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT:
				getActivityExecutionReport().clear();
				getActivityExecutionReport().addAll((Collection<? extends ActivityExecReportType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReportPackage.ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT:
				getActivityExecutionReport().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReportPackage.ACTIVITIES_EXECUTION_REPORT_TYPE__ACTIVITY_EXECUTION_REPORT:
				return activityExecutionReport != null && !activityExecutionReport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivitiesExecutionReportTypeImpl
