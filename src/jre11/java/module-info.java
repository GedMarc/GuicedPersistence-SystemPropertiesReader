module com.jwebmp.guicedpersistence.readers.systemproperties {
	requires com.jwebmp.guicedpersistence;
	requires com.google.common;
	requires com.jwebmp.guicedinjection;
	requires java.validation;

	provides com.jwebmp.guicedpersistence.services.IPropertiesEntityManagerReader with com.jwebmp.guicedpersistence.readers.systemproperties.SystemEnvironmentVariablesPropertiesReader;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.guicedpersistence.readers.systemproperties.SystemEnvironmentModuleExclusions;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.guicedpersistence.readers.systemproperties.SystemEnvironmentModuleExclusions;

}
