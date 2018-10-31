import com.jwebmp.guicedpersistence.readers.systemproperties.SystemEnvironmentVariablesPropertiesReader;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.systemproperties {
	requires com.jwebmp.guicedpersistence;
	requires com.google.common;
	exports com.jwebmp.guicedpersistence.readers.systemproperties;

	provides PropertiesEntityManagerReader with SystemEnvironmentVariablesPropertiesReader;

}
