/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.software.product.impl;

import es.itecban.deployment.model.software.product.ProductPackage;
import es.itecban.deployment.model.software.product.WarrantyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warranty Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.WarrantyTypeImpl#getWarrantyDuration <em>Warranty Duration</em>}</li>
 *   <li>{@link es.itecban.deployment.model.software.product.impl.WarrantyTypeImpl#getWarrantyStartDate <em>Warranty Start Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarrantyTypeImpl extends EObjectImpl implements WarrantyType {
	/**
	 * The default value of the '{@link #getWarrantyDuration() <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String WARRANTY_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarrantyDuration() <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyDuration()
	 * @generated
	 * @ordered
	 */
	protected String warrantyDuration = WARRANTY_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarrantyStartDate() <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String WARRANTY_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarrantyStartDate() <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyStartDate()
	 * @generated
	 * @ordered
	 */
	protected String warrantyStartDate = WARRANTY_START_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarrantyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.WARRANTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarrantyDuration() {
		return warrantyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarrantyDuration(String newWarrantyDuration) {
		String oldWarrantyDuration = warrantyDuration;
		warrantyDuration = newWarrantyDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WARRANTY_TYPE__WARRANTY_DURATION, oldWarrantyDuration, warrantyDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarrantyStartDate() {
		return warrantyStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarrantyStartDate(String newWarrantyStartDate) {
		String oldWarrantyStartDate = warrantyStartDate;
		warrantyStartDate = newWarrantyStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WARRANTY_TYPE__WARRANTY_START_DATE, oldWarrantyStartDate, warrantyStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.WARRANTY_TYPE__WARRANTY_DURATION:
				return getWarrantyDuration();
			case ProductPackage.WARRANTY_TYPE__WARRANTY_START_DATE:
				return getWarrantyStartDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.WARRANTY_TYPE__WARRANTY_DURATION:
				setWarrantyDuration((String)newValue);
				return;
			case ProductPackage.WARRANTY_TYPE__WARRANTY_START_DATE:
				setWarrantyStartDate((String)newValue);
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
			case ProductPackage.WARRANTY_TYPE__WARRANTY_DURATION:
				setWarrantyDuration(WARRANTY_DURATION_EDEFAULT);
				return;
			case ProductPackage.WARRANTY_TYPE__WARRANTY_START_DATE:
				setWarrantyStartDate(WARRANTY_START_DATE_EDEFAULT);
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
			case ProductPackage.WARRANTY_TYPE__WARRANTY_DURATION:
				return WARRANTY_DURATION_EDEFAULT == null ? warrantyDuration != null : !WARRANTY_DURATION_EDEFAULT.equals(warrantyDuration);
			case ProductPackage.WARRANTY_TYPE__WARRANTY_START_DATE:
				return WARRANTY_START_DATE_EDEFAULT == null ? warrantyStartDate != null : !WARRANTY_START_DATE_EDEFAULT.equals(warrantyStartDate);
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
		result.append(" (warrantyDuration: ");
		result.append(warrantyDuration);
		result.append(", warrantyStartDate: ");
		result.append(warrantyStartDate);
		result.append(')');
		return result.toString();
	}

} //WarrantyTypeImpl
