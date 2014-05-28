/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import es.itecban.deployment.model.deployment.unit.DependenciesType;
import es.itecban.deployment.model.deployment.unit.DependencyType;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependencies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DependenciesTypeImpl#getDependencyExpression <em>Dependency Expression</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.DependenciesTypeImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependenciesTypeImpl extends EObjectImpl implements DependenciesType {
	/**
	 * The default value of the '{@link #getDependencyExpression() <em>Dependency Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENCY_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependencyExpression() <em>Dependency Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyExpression()
	 * @generated
	 * @ordered
	 */
	protected String dependencyExpression = DEPENDENCY_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<DependencyType> dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenciesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitPackage.Literals.DEPENDENCIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependencyExpression() {
		return dependencyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyExpression(String newDependencyExpression) {
		dependencyExpression = newDependencyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DependencyType> getDependency() {
		if (dependency == null) {
			dependency = new BasicInternalEList<DependencyType>(DependencyType.class);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
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
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY_EXPRESSION:
				return getDependencyExpression();
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY:
				return getDependency();
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
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY_EXPRESSION:
				setDependencyExpression((String)newValue);
				return;
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends DependencyType>)newValue);
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
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY_EXPRESSION:
				setDependencyExpression(DEPENDENCY_EXPRESSION_EDEFAULT);
				return;
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY:
				getDependency().clear();
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
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY_EXPRESSION:
				return DEPENDENCY_EXPRESSION_EDEFAULT == null ? dependencyExpression != null : !DEPENDENCY_EXPRESSION_EDEFAULT.equals(dependencyExpression);
			case UnitPackage.DEPENDENCIES_TYPE__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dependencyExpression: ");
		result.append(dependencyExpression);
		result.append(')');
		return result.toString();
	}

} //DependenciesTypeImpl
