package com.saucedemo.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	
	
	features="src/test/resources/features/", 
	
	tags= "@Smoketest",
	
	glue="com.saucedemo.steps")






	
	public class cukksrunner {}
