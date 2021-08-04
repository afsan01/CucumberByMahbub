package com.qa.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\User\\git\\CucumberByMahbub\\src\\main\\java\\Features\\login.feature",//the path of the feature files
		glue = {"com.qa.stepdefinition"},//the path of the step definition files
		format = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun = false,//to check the mapping is proper between feature file and step def file
		monochrome= true//,
		//tags = {"@Afsan"}
		)
public class TestRunner {

}
