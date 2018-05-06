package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, 
features = "Features",
glue = "StepDefinitions",
plugin = {"json:target/cucumber.json","html:target/cucumber","rerun:target/rerun.txt"}, 
tags = {"@Regression1"})

public class TestRunner {

}
