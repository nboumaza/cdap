package com.c12e.cortex.api.app;

import co.cask.cdap.api.app.ApplicationSpecification;
import co.cask.cdap.api.spark.SparkSpecification;
import java.util.Map;


/**
 * Application Specification used in core code.
 */
public interface AgentSpecification extends ApplicationSpecification {
	
	  /**
	   * @return An immutable {@link Map} from {@link Model} name to
	   * {@link ModelSpecification} for an ML {@link Model} jobs configured for the Application.
	   */
	  Map<String, SparkSpecification> getModel();

}
