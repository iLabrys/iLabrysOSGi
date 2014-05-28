/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.itecban.deployment.model.configuration.impl;

import es.itecban.deployment.model.configuration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationFactoryImpl extends EFactoryImpl implements ConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationFactory init() {
		try {
			ConfigurationFactory theConfigurationFactory = (ConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://model.deployment.itecban.es/Configuration"); 
			if (theConfigurationFactory != null) {
				return theConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigurationPackage.CONFIGURATION_CONTAINER_TYPE: return createConfigurationContainerType();
			case ConfigurationPackage.CONFIGURATION_FILES_TYPE: return createConfigurationFilesType();
			case ConfigurationPackage.CONFIGURATION_FILE_TYPE: return createConfigurationFileType();
			case ConfigurationPackage.CONFIGURATION_PROPERTIES_TYPE: return createConfigurationPropertiesType();
			case ConfigurationPackage.CONTAINERS_TYPE: return createContainersType();
			case ConfigurationPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ConfigurationPackage.ENVIRONMENT_PROPERTY_TYPE: return createEnvironmentPropertyType();
			case ConfigurationPackage.ENVIRONMENT_TYPE: return createEnvironmentType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigurationPackage.IS_MANDATORY:
				return createIsMandatoryFromString(eDataType, initialValue);
			case ConfigurationPackage.IS_MANDATORY_OBJECT:
				return createIsMandatoryObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigurationPackage.IS_MANDATORY:
				return convertIsMandatoryToString(eDataType, instanceValue);
			case ConfigurationPackage.IS_MANDATORY_OBJECT:
				return convertIsMandatoryObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationContainerType createConfigurationContainerType() {
		ConfigurationContainerTypeImpl configurationContainerType = new ConfigurationContainerTypeImpl();
		return configurationContainerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFilesType createConfigurationFilesType() {
		ConfigurationFilesTypeImpl configurationFilesType = new ConfigurationFilesTypeImpl();
		return configurationFilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFileType createConfigurationFileType() {
		ConfigurationFileTypeImpl configurationFileType = new ConfigurationFileTypeImpl();
		return configurationFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPropertiesType createConfigurationPropertiesType() {
		ConfigurationPropertiesTypeImpl configurationPropertiesType = new ConfigurationPropertiesTypeImpl();
		return configurationPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersType createContainersType() {
		ContainersTypeImpl containersType = new ContainersTypeImpl();
		return containersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentPropertyType createEnvironmentPropertyType() {
		EnvironmentPropertyTypeImpl environmentPropertyType = new EnvironmentPropertyTypeImpl();
		return environmentPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType createEnvironmentType() {
		EnvironmentTypeImpl environmentType = new EnvironmentTypeImpl();
		return environmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsMandatory createIsMandatoryFromString(EDataType eDataType, String initialValue) {
		IsMandatory result = IsMandatory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsMandatoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsMandatory createIsMandatoryObjectFromString(EDataType eDataType, String initialValue) {
		return createIsMandatoryFromString(ConfigurationPackage.Literals.IS_MANDATORY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsMandatoryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIsMandatoryToString(ConfigurationPackage.Literals.IS_MANDATORY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage getConfigurationPackage() {
		return (ConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationPackage getPackage() {
		return ConfigurationPackage.eINSTANCE;
	}

} //ConfigurationFactoryImpl
