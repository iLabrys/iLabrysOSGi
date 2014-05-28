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
 * A representation of the literals of the enumeration '<em><b>Deployment Activity Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.itecban.deployment.model.deployment.plan.PlanPackage#getDeploymentActivityKindType()
 * @model extendedMetaData="name='DeploymentActivityKindType'"
 * @generated
 */
public enum DeploymentActivityKindType implements Enumerator {
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
	 * The '<em><b>UNINSTALLDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNINSTALLDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNINSTALLDEPLOYMENTUNIT(2, "UNINSTALLDEPLOYMENTUNIT", "UNINSTALL_DEPLOYMENT_UNIT"),

	/**
	 * The '<em><b>STARTDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	STARTDEPLOYMENTUNIT(3, "STARTDEPLOYMENTUNIT", "START_DEPLOYMENT_UNIT"),

	/**
	 * The '<em><b>STOPDEPLOYMENTUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPDEPLOYMENTUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	STOPDEPLOYMENTUNIT(4, "STOPDEPLOYMENTUNIT", "STOP_DEPLOYMENT_UNIT");

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
	public static final int UNINSTALLDEPLOYMENTUNIT_VALUE = 2;

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
	public static final int STARTDEPLOYMENTUNIT_VALUE = 3;

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
	public static final int STOPDEPLOYMENTUNIT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Deployment Activity Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeploymentActivityKindType[] VALUES_ARRAY =
		new DeploymentActivityKindType[] {
			INSTALLDEPLOYMENTUNIT,
			UPDATEDEPLOYMENTUNIT,
			UNINSTALLDEPLOYMENTUNIT,
			STARTDEPLOYMENTUNIT,
			STOPDEPLOYMENTUNIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Deployment Activity Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeploymentActivityKindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployment Activity Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentActivityKindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentActivityKindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Activity Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentActivityKindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentActivityKindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Activity Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentActivityKindType get(int value) {
		switch (value) {
			case INSTALLDEPLOYMENTUNIT_VALUE: return INSTALLDEPLOYMENTUNIT;
			case UPDATEDEPLOYMENTUNIT_VALUE: return UPDATEDEPLOYMENTUNIT;
			case UNINSTALLDEPLOYMENTUNIT_VALUE: return UNINSTALLDEPLOYMENTUNIT;
			case STARTDEPLOYMENTUNIT_VALUE: return STARTDEPLOYMENTUNIT;
			case STOPDEPLOYMENTUNIT_VALUE: return STOPDEPLOYMENTUNIT;
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
	private DeploymentActivityKindType(int value, String name, String literal) {
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
	
} //DeploymentActivityKindType
