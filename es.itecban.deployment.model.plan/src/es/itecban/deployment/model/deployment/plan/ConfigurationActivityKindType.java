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
 * A representation of the literals of the enumeration '<em><b>Configuration Activity Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getConfigurationActivityKindType()
 * @model extendedMetaData="name='ConfigurationActivityKindType'"
 * @generated
 */
public enum ConfigurationActivityKindType implements Enumerator {
	/**
	 * The '<em><b>CONFIGURECONTAINERRESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURECONTAINERRESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURECONTAINERRESOURCE(0, "CONFIGURECONTAINERRESOURCE", "CONFIGURE_CONTAINER_RESOURCE"),

	/**
	 * The '<em><b>CONFIGURECONTAINERPROPERTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURECONTAINERPROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURECONTAINERPROPERTY(1, "CONFIGURECONTAINERPROPERTY", "CONFIGURE_CONTAINER_PROPERTY"),

	/**
	 * The '<em><b>CONFIGUREUNITRESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGUREUNITRESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGUREUNITRESOURCE(2, "CONFIGUREUNITRESOURCE", "CONFIGURE_UNIT_RESOURCE");

	/**
	 * The '<em><b>CONFIGURECONTAINERRESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIGURECONTAINERRESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURECONTAINERRESOURCE
	 * @model literal="CONFIGURE_CONTAINER_RESOURCE"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURECONTAINERRESOURCE_VALUE = 0;

	/**
	 * The '<em><b>CONFIGURECONTAINERPROPERTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIGURECONTAINERPROPERTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURECONTAINERPROPERTY
	 * @model literal="CONFIGURE_CONTAINER_PROPERTY"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURECONTAINERPROPERTY_VALUE = 1;

	/**
	 * The '<em><b>CONFIGUREUNITRESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIGUREUNITRESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGUREUNITRESOURCE
	 * @model literal="CONFIGURE_UNIT_RESOURCE"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGUREUNITRESOURCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Configuration Activity Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConfigurationActivityKindType[] VALUES_ARRAY =
		new ConfigurationActivityKindType[] {
			CONFIGURECONTAINERRESOURCE,
			CONFIGURECONTAINERPROPERTY,
			CONFIGUREUNITRESOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Configuration Activity Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConfigurationActivityKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Configuration Activity Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationActivityKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfigurationActivityKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Configuration Activity Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationActivityKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConfigurationActivityKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Configuration Activity Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationActivityKindType get(int value) {
		switch (value) {
			case CONFIGURECONTAINERRESOURCE_VALUE: return CONFIGURECONTAINERRESOURCE;
			case CONFIGURECONTAINERPROPERTY_VALUE: return CONFIGURECONTAINERPROPERTY;
			case CONFIGUREUNITRESOURCE_VALUE: return CONFIGUREUNITRESOURCE;
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
	private ConfigurationActivityKindType(int value, String name, String literal) {
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
	
} //ConfigurationActivityKindType
