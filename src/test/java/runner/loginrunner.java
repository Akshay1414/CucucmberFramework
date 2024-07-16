package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features = {"src\\test\\resources\\applicationtest\\login.feature"},
	
	glue = {"steps"},
		
//	publish=true, // to generate HTML report - created new file cucumberproperties
	
	plugin = {"pretty"} // to get output in sorted way
	// if console is not in a proper way download additional plugin from eclipse marketplace as ANSI Escape in console
		
		)

public class loginrunner extends AbstractTestNGCucumberTests
{

	
}
