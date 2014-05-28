/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.deployment.plan.report;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activity Result Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.plan.report.ReportPackage#getActivityResultKindType()
 * @model extendedMetaData="name='ActivityResultKindType'"
 * @generated
 */
public enum ActivityResultKindType implements Enumerator {
	/**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(0, "OK", "OK"),

	/**
	 * The '<em><b>TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEOUT(1, "TIMEOUT", "TIMEOUT"),

	/**
	 * The '<em><b>CONNECTIONPROBLEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTIONPROBLEM_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTIONPROBLEM(2, "CONNECTIONPROBLEM", "CONNECTION_PROBLEM"),

	/**
	 * The '<em><b>CONFIGURATIONPROBLEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATIONPROBLEM_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATIONPROBLEM(3, "CONFIGURATIONPROBLEM", "CONFIGURATION_PROBLEM"),

	/**
	 * The '<em><b>UNAVAILABLEUNITS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLEUNITS_VALUE
	 * @generated
	 * @ordered
	 */
	UNAVAILABLEUNITS(4, "UNAVAILABLEUNITS", "UNAVAILABLE_UNIT(S)"),

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(5, "UNKNOWN", "UNKNOWN");

	/**
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 0;

	/**
	 * The '<em><b>TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEOUT_VALUE = 1;

	/**
	 * The '<em><b>CONNECTIONPROBLEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECTIONPROBLEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTIONPROBLEM
	 * @model literal="CONNECTION_PROBLEM"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTIONPROBLEM_VALUE = 2;

	/**
	 * The '<em><b>CONFIGURATIONPROBLEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIGURATIONPROBLEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATIONPROBLEM
	 * @model literal="CONFIGURATION_PROBLEM"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATIONPROBLEM_VALUE = 3;

	/**
	 * The '<em><b>UNAVAILABLEUNITS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNAVAILABLEUNITS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLEUNITS
	 * @model literal="UNAVAILABLE_UNIT(S)"
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLEUNITS_VALUE = 4;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Activity Result Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityResultKindType[] VALUES_ARRAY =
		new ActivityResultKindType[] {
			OK,
			TIMEOUT,
			CONNECTIONPROBLEM,
			CONFIGURATIONPROBLEM,
			UNAVAILABLEUNITS,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Activity Result Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivityResultKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Result Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityResultKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityResultKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Result Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityResultKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityResultKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Result Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityResultKindType get(int value) {
		switch (value) {
			case OK_VALUE: return OK;
			case TIMEOUT_VALUE: return TIMEOUT;
			case CONNECTIONPROBLEM_VALUE: return CONNECTIONPROBLEM;
			case CONFIGURATIONPROBLEM_VALUE: return CONFIGURATIONPROBLEM;
			case UNAVAILABLEUNITS_VALUE: return UNAVAILABLEUNITS;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private ActivityResultKindType(int value, String name, String literal) {
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
	
} //ActivityResultKindType
