package org.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@./src/test/resources/failedtests.txt", glue = {
		"org.stepdef" },
		plugin = {"json:./src/test/resources/samplereport.json","rerun:./src/test/resources/failedtests.txt"})
public class Rerunner {

}
