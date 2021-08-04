package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Cucumber option:
//dryRun =true/false
//feature=feature file path
//glue= stepDefination path//step definition package name
//tags= (or="@test,@test1")(and="@test,@test1")(ignore= "-@test"
//monochrome= true (Display the out put in readable format)
//format = which format you like to get the output.
//strict = true/false (if any undefined step is there the execution will happen but missing step will show.

//Hooks= @Before and @After(Global Hooks)
//Tagged Hooks = @Before("@First"), @After("@First") (Local Hooks)

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\alvee\\eclipse-workspace\\CucumberByMahbubbur\\src\\main\\java\\Features\\dealsMap.feature",//the path of the feature files
		glue = {"stepDefinition"},//the path of the step definition files
		format = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun = false,//to check the mapping is proper between feature file and step def file
		monochrome= true,
		tags = {"@Afsan"}
		)

public class TestRunner {

}


