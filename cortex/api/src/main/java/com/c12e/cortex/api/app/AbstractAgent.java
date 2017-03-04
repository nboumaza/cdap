package com.c12e.cortex.api.app;

import com.c12e.cortex.api.spark.Model;

import co.cask.cdap.api.Config;
import co.cask.cdap.api.app.AbstractApplication;


@SuppressWarnings("rawtypes")
public abstract class AbstractAgent<T extends Config> extends AbstractApplication {

  private AgentConfigurer configurer;
  
  /**
   * @see AgentConfigurer#addModel(Model)
   */
  protected void addModel(Model model) {
    configurer.addModel(model);
  }

}
    
 
