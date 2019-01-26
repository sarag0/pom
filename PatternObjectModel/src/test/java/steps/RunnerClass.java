package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\CreateLEad.feature",
					glue="steps", 
					tags= {"@Smoke","@Regression"},
					monochrome=true)


public class RunnerClass {

}
