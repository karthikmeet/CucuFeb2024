package org.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {
		"org.stepdef" }, 
		plugin = {"json:./src/test/resources/samplereport.json", "rerun:./src/test/resources/failedtests.txt"})
public class Runner {

}
