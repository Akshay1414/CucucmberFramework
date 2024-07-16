package appfeatures;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.Driverfactory;

public class HomePageSteps {

	 HomePage homepage = new HomePage(Driverfactory.getDriver());
	 
	@Given("User is at the landing page")
	public void user_is_at_the_landing_page() {
		WebDriver driver = Driverfactory.getDriver();
	    driver.get("https://amazon.in");
	}

	@Then("Page title should contains {string}")
	public void page_title_should_contains(String titlestring) {
	   
	   String title = homepage.getTitleOfPage();
	   
	  boolean ispresent = title.contains(titlestring);
	  
	  Assert.assertTrue(ispresent);
	}

	@Then("Cart icon should get display")
	public void cart_icon_should_get_display() {
	 boolean isdisplay = homepage.verifyCart();
	 
	 Assert.assertTrue(isdisplay);
	}

	@When("User click on summer section deal")
	public void user_click_on_summer_section_deal() {
	   
		homepage.entertoSummerDeals();
	}

	@When("User click on signin button")
	public void user_click_on_signin_button() {
	   homepage.goToSignPage();
	}

	@When("User enters username for login as {string}")
	public void user_enters_username_for_login_as(String uname) {
	   homepage.enterusername(uname);
	}

	@When("User enters password as {string} with signin")
	public void user_enters_password_as_with_signin(String pwd) {
	   homepage.finalSignin(pwd);
	}

	
}
