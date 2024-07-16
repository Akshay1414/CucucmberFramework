package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath= "//*[@class='a-link-normal']//img[@alt='A2']")
	private WebElement summerdealcarouse;
	
	@FindBy(xpath= "//*[@id='nav-cart-count']")
	private WebElement carticon;
	
	//xpath locator
	//customization of xpath locator --> contains(),text(), normalize text
	//xpath axes
	
	@FindBy(xpath= "//*[@id='nav-link-accountList-nav-line-1']")
	private WebElement accountsignin;
	
	@FindBy (xpath= "//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-signin-button']")
	private WebElement Signinhoverbutton;
	
	@FindBy (xpath= "//*[@id='ap_email']")
	private WebElement emailfield;
	
	@FindBy (xpath= "//input[@id='continue']")
	private WebElement continuebutton;
	
	@FindBy (xpath= "//*[@id='ap_password']")
	private WebElement password;
	
	@FindBy (xpath= "//*[@id='signInSubmit']")
	private WebElement finalsignin;
	
	WebDriverWait wait;
	
	public HomePage(WebDriver driver)
	{
	this.driver	= driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	}
	
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyCart()
	{
		boolean isdisplay = carticon.isDisplayed();
		
		return isdisplay;
	}
	
	public void goToSignPage()
	{
		Actions act = new Actions(driver);
		act.moveToElement(accountsignin).perform();
		Signinhoverbutton.click();
		
	}
	
	public void enterusername(String uname)
	{
		emailfield.sendKeys(uname);
		continuebutton.click();
	}
	
	public void finalSignin(String pwd)
	{
		password.sendKeys(pwd);
		finalsignin.click();
	}
	
	public void entertoSummerDeals()
	{
		wait.until(ExpectedConditions.visibilityOf(summerdealcarouse));
		summerdealcarouse.click();
	}
}
