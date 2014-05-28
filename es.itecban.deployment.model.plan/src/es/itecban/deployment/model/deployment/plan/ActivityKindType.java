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
 * A representation of the literals of the enumeration '<em><b>Activity Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getActivityKindType()
 * @model extendedMetaData="name='ActivityKindType'"
 * @generated
 */
public enum ActivityKindType implements Enumerator {
	/**
	 * The '<em><b>INSTALLDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTALLDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLDEPLOYMENTUNIT(0, "INSTALLDEPLOYMENTUNIT", "INSTALL_DEPLOYMENT_UNIT"),

	/**
	 * The '<em><b>UPDATEDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATEDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATEDEPLOYMENTUNIT(1, "UPDATEDEPLOYMENTUNIT", "UPDATE_DEPLOYMENT_UNIT"),

	/**
	 * The '<em><b>CONFIGUREDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGUREDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGUREDEPLOYMENTUNIT(2, "CONFIGUREDEPLOYMENTUNIT", "CONFIGURE_DEPLOYMENT_UNIT"),

	/**
	 * The '<em><b>UNINSTALLDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNINSTALLDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNINSTALLDEPLOYMENTUNIT(3, "UNINSTALLDEPLOYMENTUNIT", "UNINSTALL_DEPLOYMENT_UNIT"),

	/**
	 * The '<em><b>STARTDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	STARTDEPLOYMENTUNIT(4, "STARTDEPLOYMENTUNIT", "START_DEPLOYMENT_UNIT"),

	/**
	 * The '<em><b>STOPDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	STOPDEPLOYMENTUNIT(5, "STOPDEPLOYMENTUNIT", "STOP_DEPLOYMENT_UNIT"),

	/**
	 * The '<em><b>ADDCONTAINERRESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDCONTAINERRESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	ADDCONTAINERRESOURCE(6, "ADDCONTAINERRESOURCE", "ADD_CONTAINER_RESOURCE"),

	/**
	 * The '<em><b>REMOVECONTAINERRESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVECONTAINERRESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVECONTAINERRESOURCE(7, "REMOVECONTAINERRESOURCE", "REMOVE_CONTAINER_RESOURCE"),

	/**
	 * The '<em><b>CONFIGURECONTAINERRESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURECONTAINERRESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURECONTAINERRESOURCE(8, "CONFIGURECONTAINERRESOURCE", "CONFIGURE_CONTAINER_RESOURCE"),

	/**
	 * The '<em><b>CONFIGURECONTAINERPROPERTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURECONTAINERPROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURECONTAINERPROPERTY(9, "CONFIGURECONTAINERPROPERTY", "CONFIGURE_CONTAINER_PROPERTY"),

	/**
	 * The '<em><b>CONFIGUREUNITRESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGUREUNITRESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGUREUNITRESOURCE(10, "CONFIGUREUNITRESOURCE", "CONFIGURE_UNIT_RESOURCE");

	/**
	 * The '<em><b>INSTALLDEPLOYMENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSTALLDEPLOYMENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTALLDEPLOYMENTUNIT
	 * @model literal="INSTALL_DEPLOYMENT_UNIT"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLDEPLOYMENTUNIT_VALUE = 0;

	/**
	 * The '<em><b>UPDATEDEPLOYMENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATEDEPLOYMENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATEDEPLOYMENTUNIT
	 * @model literal="UPDATE_DEPLOYMENT_UNIT"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATEDEPLOYMENTUNIT_VALUE = 1;

	/**
	 * The '<em><b>CONFIGUREDEPLOYMENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIGUREDEPLOYMENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGUREDEPLOYMENTUNIT
	 * @model literal="CONFIGURE_DEPLOYMENT_UNIT"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGUREDEPLOYMENTUNIT_VALUE = 2;

	/**
	 * The '<em><b>UNINSTALLDEPLOYMENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNINSTALLDEPLOYMENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNINSTALLDEPLOYMENTUNIT
	 * @model literal="UNINSTALL_DEPLOYMENT_UNIT"
	 * @generated
	 * @ordered
	 */
	public static final int UNINSTALLDEPLOYMENTUNIT_VALUE = 3;

	/**
	 * The '<em><b>STARTDEPLOYMENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTDEPLOYMENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTDEPLOYMENTUNIT
	 * @model literal="START_DEPLOYMENT_UNIT"
	 * @generated
	 * @ordered
	 */
	public static final int STARTDEPLOYMENTUNIT_VALUE = 4;

	/**
	 * The '<em><b>STOPDEPLOYMENTUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOPDEPLOYMENTUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOPDEPLOYMENTUNIT
	 * @model literal="STOP_DEPLOYMENT_UNIT"
	 * @generated
	 * @ordered
	 */
	public static final int STOPDEPLOYMENTUNIT_VALUE = 5;

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
	public static final int ADDCONTAINERRESOURCE_VALUE = 6;

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
	public static final int REMOVECONTAINERRESOURCE_VALUE = 7;

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
	public static final int CONFIGURECONTAINERRESOURCE_VALUE = 8;

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
	public static final int CONFIGURECONTAINERPROPERTY_VALUE = 9;

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
	public static final int CONFIGUREUNITRESOURCE_VALUE = 10;

	/**
	 * An array of all the '<em><b>Activity Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityKindType[] VALUES_ARRAY =
		new ActivityKindType[] {
			INSTALLDEPLOYMENTUNIT,
			UPDATEDEPLOYMENTUNIT,
			CONFIGUREDEPLOYMENTUNIT,
			UNINSTALLDEPLOYMENTUNIT,
			STARTDEPLOYMENTUNIT,
			STOPDEPLOYMENTUNIT,
			ADDCONTAINERRESOURCE,
			REMOVECONTAINERRESOURCE,
			CONFIGURECONTAINERRESOURCE,
			CONFIGURECONTAINERPROPERTY,
			CONFIGUREUNITRESOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Activity Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivityKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityKindType get(int value) {
		switch (value) {
			case INSTALLDEPLOYMENTUNIT_VALUE: return INSTALLDEPLOYMENTUNIT;
			case UPDATEDEPLOYMENTUNIT_VALUE: return UPDATEDEPLOYMENTUNIT;
			case CONFIGUREDEPLOYMENTUNIT_VALUE: return CONFIGUREDEPLOYMENTUNIT;
			case UNINSTALLDEPLOYMENTUNIT_VALUE: return UNINSTALLDEPLOYMENTUNIT;
			case STARTDEPLOYMENTUNIT_VALUE: return STARTDEPLOYMENTUNIT;
			case STOPDEPLOYMENTUNIT_VALUE: return STOPDEPLOYMENTUNIT;
			case ADDCONTAINERRESOURCE_VALUE: return ADDCONTAINERRESOURCE;
			case REMOVECONTAINERRESOURCE_VALUE: return REMOVECONTAINERRESOURCE;
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
	private ActivityKindType(int value, String name, String literal) {
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
	
} //ActivityKindType
