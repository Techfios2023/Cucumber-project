package runner;

/*
 * Author: Sudip
 * Project: CucumberBDD with MS SQL Data
 */

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//make sure to import jUnit library as well along with RunWith import

@CucumberOptions(
		features = "src\\test\\resources\\features", 
       glue = "steps",
		tags= "@DBScenerio1",
		monochrome = true, 
		dryRun = false,
				strict = true,

		plugin = { "pretty", "html:target/reports/cucumber.html", "json:target/reports/cucumber.json" }
// plugin is for different types of reporting

)

public class LoginRunner {

}
