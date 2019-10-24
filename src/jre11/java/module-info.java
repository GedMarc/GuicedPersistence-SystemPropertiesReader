import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.guicedee.guicedpersistence.readers.systemproperties.SystemEnvironmentModuleExclusions;
import com.guicedee.guicedpersistence.readers.systemproperties.SystemEnvironmentVariablesPropertiesReader;
import com.guicedee.guicedpersistence.services.IPropertiesEntityManagerReader;

module com.guicedee.guicedpersistence.readers.systemproperties {
	requires com.guicedee.guicedpersistence;
	requires com.google.common;
	requires com.guicedee.guicedinjection;
	requires java.validation;

	provides IPropertiesEntityManagerReader with SystemEnvironmentVariablesPropertiesReader;
	provides IGuiceScanModuleExclusions with SystemEnvironmentModuleExclusions;
	provides IGuiceScanJarExclusions with SystemEnvironmentModuleExclusions;

}
