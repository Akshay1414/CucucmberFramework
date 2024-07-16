package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\backgroundWithScenarioOutline.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"}
		
		)

public class backgrounScenarioOutlineRunner extends AbstractTestNGCucumberTests {

}
