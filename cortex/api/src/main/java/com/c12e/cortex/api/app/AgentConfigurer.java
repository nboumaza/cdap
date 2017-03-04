package com.c12e.cortex.api.app;

import com.c12e.cortex.api.spark.Model;

import co.cask.cdap.api.app.ApplicationConfigurer;

public interface AgentConfigurer extends ApplicationConfigurer {

	/**
	 * Adds a custom {@link Model} to the Application.
	 *
	 * @param model
	 *            The model to include in the Application
	 */
	void addModel(Model model);

}
