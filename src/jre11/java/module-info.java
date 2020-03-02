module com.guicedee.guicedpersistence.readers.systemproperties {
	requires com.guicedee.guicedpersistence;
	requires com.google.common;
	requires com.guicedee.guicedinjection;
	requires java.validation;

	provides com.guicedee.guicedpersistence.services.IPropertiesEntityManagerReader with com.guicedee.guicedpersistence.readers.systemproperties.SystemEnvironmentVariablesPropertiesReader;

}
