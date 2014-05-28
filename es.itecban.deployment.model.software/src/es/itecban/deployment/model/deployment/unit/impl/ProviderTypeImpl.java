/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit.impl;

import es.itecban.deployment.model.deployment.unit.ProviderType;
import es.itecban.deployment.model.deployment.unit.UnitPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.ProviderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.ProviderTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.deployment.unit.impl.ProviderTypeImpl#getHomeUrl <em>Home Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderTypeImpl extends EObjectImpl implements ProviderType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeUrl() <em>Home Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeUrl() <em>Home Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeUrl()
	 * @generated
	 * @ordered
	 */
	protected String homeUrl = HOME_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitPackage.Literals.PROVIDER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHomeUrl() {
		return homeUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeUrl(String newHomeUrl) {
		homeUrl = newHomeUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnitPackage.PROVIDER_TYPE__NAME:
				return getName();
			case UnitPackage.PROVIDER_TYPE__ID:
				return new Integer(getId());
			case UnitPackage.PROVIDER_TYPE__HOME_URL:
				return getHomeUrl();
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
			case UnitPackage.PROVIDER_TYPE__NAME:
				setName((String)newValue);
				return;
			case UnitPackage.PROVIDER_TYPE__ID:
				setId(((Integer)newValue).intValue());
				return;
			case UnitPackage.PROVIDER_TYPE__HOME_URL:
				setHomeUrl((String)newValue);
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
			case UnitPackage.PROVIDER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnitPackage.PROVIDER_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case UnitPackage.PROVIDER_TYPE__HOME_URL:
				setHomeUrl(HOME_URL_EDEFAULT);
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
			case UnitPackage.PROVIDER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnitPackage.PROVIDER_TYPE__ID:
				return id != ID_EDEFAULT;
			case UnitPackage.PROVIDER_TYPE__HOME_URL:
				return HOME_URL_EDEFAULT == null ? homeUrl != null : !HOME_URL_EDEFAULT.equals(homeUrl);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", homeUrl: ");
		result.append(homeUrl);
		result.append(')');
		return result.toString();
	}

} //ProviderTypeImpl
