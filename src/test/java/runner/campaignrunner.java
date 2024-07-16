package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\campaignStatus.feature"},
		
		glue = {"steps", },
		
		plugin= {"pretty"},
		
	//	tags = "@regression or @sanity"
		//tags = "not @sanity"
		//tags = "@regression and @sanity"
		//tags = "@feature1" - tag at feature level
		
		dryRun = true
		
		)

public class campaignrunner extends AbstractTestNGCucumberTests{

}
