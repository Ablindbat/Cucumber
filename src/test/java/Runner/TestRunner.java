package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = "src/test/java/Features" ,
		glue = "StepDefinations",
		tags = {"@smoke"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
