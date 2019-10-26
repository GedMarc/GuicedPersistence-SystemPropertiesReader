module com.guicedee.guicedpersistence.readers.systemproperties {
	requires com.guicedee.guicedpersistence;
	requires com.google.common;
	requires com.guicedee.guicedinjection;
	requires java.validation;

	provides com.guicedee.guicedpersistence.services.IPropertiesEntityManagerReader with com.guicedee.guicedpersistence.readers.systemproperties.SystemEnvironmentVariablesPropertiesReader;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.guicedee.guicedpersistence.readers.systemproperties.SystemEnvironmentModuleExclusions;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.guicedee.guicedpersistence.readers.systemproperties.SystemEnvironmentModuleExclusions;

}
