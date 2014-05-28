/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Activity Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getResourceActivityKindType()
 * @model extendedMetaData="name='ResourceActivityKindType'"
 * @generated
 */
public enum ResourceActivityKindType implements Enumerator {
	/**
	 * The '<em><b>ADDCONTAINERRESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDCONTAINERRESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	ADDCONTAINERRESOURCE(0, "ADDCONTAINERRESOURCE", "ADD_CONTAINER_RESOURCE"),

	/**
	 * The '<em><b>REMOVECONTAINERRESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVECONTAINERRESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVECONTAINERRESOURCE(1, "REMOVECONTAINERRESOURCE", "REMOVE_CONTAINER_RESOURCE");

	/**
	 * The '<em><b>ADDCONTAINERRESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADDCONTAINERRESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDCONTAINERRESOURCE
	 * @model literal="ADD_CONTAINER_RESOURCE"
	 * @generated
	 * @ordered
	 */
	public static final int ADDCONTAINERRESOURCE_VALUE = 0;

	/**
	 * The '<em><b>REMOVECONTAINERRESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOVECONTAINERRESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVECONTAINERRESOURCE
	 * @model literal="REMOVE_CONTAINER_RESOURCE"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVECONTAINERRESOURCE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Resource Activity Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceActivityKindType[] VALUES_ARRAY =
		new ResourceActivityKindType[] {
			ADDCONTAINERRESOURCE,
			REMOVECONTAINERRESOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Activity Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceActivityKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Activity Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceActivityKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceActivityKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Activity Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceActivityKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceActivityKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Activity Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceActivityKindType get(int value) {
		switch (value) {
			case ADDCONTAINERRESOURCE_VALUE: return ADDCONTAINERRESOURCE;
			case REMOVECONTAINERRESOURCE_VALUE: return REMOVECONTAINERRESOURCE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ResourceActivityKindType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ResourceActivityKindType
