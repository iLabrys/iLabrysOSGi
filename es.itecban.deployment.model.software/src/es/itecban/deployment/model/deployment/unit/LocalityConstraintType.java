/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.unit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Locality Constraint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         		The locality constraint type can be used to determine
 *         		the distribution of dependent deployment units.
 *         	
 * <!-- end-model-doc -->
 * @see es.itecban.deployment.model.deployment.unit.UnitPackage#getLocalityConstraintType()
 * @model extendedMetaData="name='LocalityConstraintType'"
 * @generated
 */
public enum LocalityConstraintType implements Enumerator {
	/**
	 * The '<em><b>SAMENODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMENODE_VALUE
	 * @generated
	 * @ordered
	 */
	SAMENODE(0, "SAMENODE", "SAMENODE"),

	/**
	 * The '<em><b>SAMENODESAMEPROCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMENODESAMEPROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SAMENODESAMEPROCESS(1, "SAMENODESAMEPROCESS", "SAMENODESAMEPROCESS"),

	/**
	 * The '<em><b>ANYNODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYNODE_VALUE
	 * @generated
	 * @ordered
	 */
	ANYNODE(2, "ANYNODE", "ANYNODE");

	/**
	 * The '<em><b>SAMENODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAMENODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMENODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAMENODE_VALUE = 0;

	/**
	 * The '<em><b>SAMENODESAMEPROCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAMENODESAMEPROCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMENODESAMEPROCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAMENODESAMEPROCESS_VALUE = 1;

	/**
	 * The '<em><b>ANYNODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANYNODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANYNODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYNODE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Locality Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LocalityConstraintType[] VALUES_ARRAY =
		new LocalityConstraintType[] {
			SAMENODE,
			SAMENODESAMEPROCESS,
			ANYNODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Locality Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LocalityConstraintType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Locality Constraint Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocalityConstraintType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocalityConstraintType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Locality Constraint Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocalityConstraintType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocalityConstraintType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Locality Constraint Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocalityConstraintType get(int value) {
		switch (value) {
			case SAMENODE_VALUE: return SAMENODE;
			case SAMENODESAMEPROCESS_VALUE: return SAMENODESAMEPROCESS;
			case ANYNODE_VALUE: return ANYNODE;
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
	private LocalityConstraintType(int value, String name, String literal) {
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
	
} //LocalityConstraintType
