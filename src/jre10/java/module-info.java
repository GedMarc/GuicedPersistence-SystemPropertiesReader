import com.jwebmp.guicedpersistence.readers.systemproperties.SystemEnvironmentVariablesPropertiesReader;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.systemproperties {
	requires transitive com.jwebmp.guicedpersistence;
	exports com.jwebmp.guicedpersistence.readers.systemproperties;

	provides PropertiesEntityManagerReader with SystemEnvironmentVariablesPropertiesReader;

}
