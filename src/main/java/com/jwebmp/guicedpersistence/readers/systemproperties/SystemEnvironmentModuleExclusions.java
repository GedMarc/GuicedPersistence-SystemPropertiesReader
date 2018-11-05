package com.jwebmp.guicedpersistence.readers.systemproperties;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class SystemEnvironmentModuleExclusions
		implements IGuiceScanModuleExclusions<SystemEnvironmentModuleExclusions>,
				           IGuiceScanJarExclusions<SystemEnvironmentModuleExclusions>
{
	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("guiced-persistence-systemproperties-reader-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.guicedpersistence.readers.systemproperties");
		return strings;
	}
}
