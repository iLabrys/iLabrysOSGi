/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.dependency.graph.impl;

import es.itecban.deployment.model.dependency.graph.Cause;
import es.itecban.deployment.model.dependency.graph.Dependency;
import es.itecban.deployment.model.dependency.graph.GraphPackage;
import es.itecban.deployment.model.dependency.graph.Node;

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
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.impl.DependencyImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.impl.DependencyImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.impl.DependencyImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.impl.DependencyImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link es.itecban.deployment.model.dependency.graph.impl.DependencyImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends EObjectImpl implements Dependency {
	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected EList<Cause> cause;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Node destination;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected String locality = LOCALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Node source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Cause> getCause() {
		if (cause == null) {
			cause = new BasicInternalEList<Cause>(Cause.class);
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Node newDestination) {
		destination = newDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocality(String newLocality) {
		locality = newLocality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Node newSource) {
		source = newSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.DEPENDENCY__CAUSE:
				return ((InternalEList<?>)getCause()).basicRemove(otherEnd, msgs);
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
			case GraphPackage.DEPENDENCY__CAUSE:
				return getCause();
			case GraphPackage.DEPENDENCY__DESTINATION:
				return getDestination();
			case GraphPackage.DEPENDENCY__ID:
				return getId();
			case GraphPackage.DEPENDENCY__LOCALITY:
				return getLocality();
			case GraphPackage.DEPENDENCY__SOURCE:
				return getSource();
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
			case GraphPackage.DEPENDENCY__CAUSE:
				getCause().clear();
				getCause().addAll((Collection<? extends Cause>)newValue);
				return;
			case GraphPackage.DEPENDENCY__DESTINATION:
				setDestination((Node)newValue);
				return;
			case GraphPackage.DEPENDENCY__ID:
				setId((String)newValue);
				return;
			case GraphPackage.DEPENDENCY__LOCALITY:
				setLocality((String)newValue);
				return;
			case GraphPackage.DEPENDENCY__SOURCE:
				setSource((Node)newValue);
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
			case GraphPackage.DEPENDENCY__CAUSE:
				getCause().clear();
				return;
			case GraphPackage.DEPENDENCY__DESTINATION:
				setDestination((Node)null);
				return;
			case GraphPackage.DEPENDENCY__ID:
				setId(ID_EDEFAULT);
				return;
			case GraphPackage.DEPENDENCY__LOCALITY:
				setLocality(LOCALITY_EDEFAULT);
				return;
			case GraphPackage.DEPENDENCY__SOURCE:
				setSource((Node)null);
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
			case GraphPackage.DEPENDENCY__CAUSE:
				return cause != null && !cause.isEmpty();
			case GraphPackage.DEPENDENCY__DESTINATION:
				return destination != null;
			case GraphPackage.DEPENDENCY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GraphPackage.DEPENDENCY__LOCALITY:
				return LOCALITY_EDEFAULT == null ? locality != null : !LOCALITY_EDEFAULT.equals(locality);
			case GraphPackage.DEPENDENCY__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return getSource().getUnit().getName() + " -->" +getDestination().getUnit().getName();
	}
	/**
	 * @generated NOT
	 */
	public void addCause(Cause cause) {
		if (!this.getCause().contains(cause))
			this.cause.add(cause);
	}
	
	/**
	 * @generated NOT
	 */

	@Override
	public boolean equals(Object obj) {
				
		if (obj instanceof DependencyImpl) {
			DependencyImpl d = (DependencyImpl) obj;
			Node ds = d.getSource();
			Node ts = this.getSource();
			Node dd = d.getDestination();
			Node td = this.getDestination();
			if (ds.equals(ts) && dd.equals(td)) {
				return true;
			}
		}
		return false;
	}

} //DependencyImpl
