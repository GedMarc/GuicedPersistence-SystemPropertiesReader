package com.jwebmp.guicedpersistence.jpa;

import com.jwebmp.guicedinjection.GuiceContext;
import com.jwebmp.guicedpersistence.db.AsyncPostStartup;
import com.jwebmp.logger.LogFactory;
import com.jwebmp.logger.logging.LogColourFormatter;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

class GuicedPersistenceBindingTest
{
	@Test
	public void testMe() throws InterruptedException
	{
		System.setProperty("customvalue", "false");

		LogFactory.configureConsoleSingleLineOutput(Level.FINE);
		LogColourFormatter.setRenderBlack(false);
		GuiceContext.inject();

		AsyncPostStartup.getExecutionService()
		                .awaitTermination(10, TimeUnit.MINUTES);

	}
}
