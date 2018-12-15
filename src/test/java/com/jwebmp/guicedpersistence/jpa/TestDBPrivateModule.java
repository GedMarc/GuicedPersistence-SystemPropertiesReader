package com.jwebmp.guicedpersistence.jpa;

import com.jwebmp.guicedpersistence.db.DatabaseModule;
import com.jwebmp.guicedpersistence.db.ConnectionBaseInfo;
import com.oracle.jaxb21.PersistenceUnit;

import javax.validation.constraints.NotNull;
import java.lang.annotation.Annotation;
import java.util.Properties;

public class TestDBPrivateModule
		extends DatabaseModule<TestDBPrivateModule>
{

	@NotNull
	@Override
	protected String getPersistenceUnitName()
	{
		return "guiceinjectionh2test";
	}

	@Override
	protected @NotNull ConnectionBaseInfo getConnectionBaseInfo(PersistenceUnit unit, Properties filteredProperties)
	{
		return new JPAConnectionBaseInfo().setPersistenceUnitName(unit.getName());
	}

	@NotNull
	@Override
	protected String getJndiMapping()
	{
		return "jdbc/jndi";
	}

	@NotNull
	@Override
	protected Class<? extends Annotation> getBindingAnnotation()
	{
		return TestCustomPersistenceLoader.class;
	}
}
