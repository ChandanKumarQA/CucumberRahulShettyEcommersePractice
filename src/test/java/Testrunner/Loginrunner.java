package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/login.feature",

glue= {"Stepdefinition","hooks"},

plugin= { "pretty","html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},


         monochrome = true
		
	
			)

public class Loginrunner {

}
