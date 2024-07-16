package appfeatures;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.Driverfactory;

public class AppsHooks {

	Driverfactory df;
	WebDriver driver;
	 
	@Before
	public void launchBrowser() throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		 df = new Driverfactory();
		df.initBrowser("browsername");
		
	WebDriver driver= 	df.initBrowser(browsername);
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown()
	{
			driver.quit();
		//driver.close();
	}
	
	
}
