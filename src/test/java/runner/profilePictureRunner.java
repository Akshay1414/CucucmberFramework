package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\profilePicture.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty"}
		
		
		)

public class profilePictureRunner extends AbstractTestNGCucumberTests {

}
