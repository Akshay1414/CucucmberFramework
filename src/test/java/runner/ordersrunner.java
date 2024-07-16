package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\applicationtest\\orders.feature"},
		
		glue = {"steps"},
		
		plugin= {"pretty"}
		
		)




public class ordersrunner extends AbstractTestNGCucumberTests{

}
