package com.c12e.cortex.api.spark;

import co.cask.cdap.api.spark.Spark;
import co.cask.cdap.api.spark.SparkConfigurer;

/**
 * Defines an interface for a Cortex ML Model.
 */
public interface Model extends Spark{

	  /**
	   * Configures a {@link Model} job using the given {@link SparkConfigurer}.
	   */
	  void configure(SparkConfigurer configurer);
	    
	  //Dev would be responsible for implementing this
	  void fit();
	 
	  
}
