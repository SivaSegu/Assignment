package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/features",
			glue = {"com.cucumber"},
			plugin = {"pretty", "html:target/cumcumber"}
)			
	public class LoginUIRunner {
}

