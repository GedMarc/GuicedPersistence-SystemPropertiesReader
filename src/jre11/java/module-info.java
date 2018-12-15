import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.guicedpersistence.readers.systemproperties.SystemEnvironmentModuleExclusions;
import com.jwebmp.guicedpersistence.readers.systemproperties.SystemEnvironmentVariablesPropertiesReader;
import com.jwebmp.guicedpersistence.services.IPropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.readers.systemproperties {
	requires com.jwebmp.guicedpersistence;
	requires com.google.common;
	requires com.jwebmp.guicedinjection;
	requires java.validation;

	provides IPropertiesEntityManagerReader with SystemEnvironmentVariablesPropertiesReader;
	provides IGuiceScanModuleExclusions with SystemEnvironmentModuleExclusions;
	provides IGuiceScanJarExclusions with SystemEnvironmentModuleExclusions;

}
