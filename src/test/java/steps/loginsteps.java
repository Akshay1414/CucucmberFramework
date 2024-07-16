package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	
	
	@Given("user is at the login screen")
	public void precondition()
	{
		System.out.println("Precondition for given statement");
	}

	@When("user enters username")
	public void enteringusername()
	{
		System.out.println("Entering Username");
	}
	
	@When("user enters password")
	public void enteringpassword()
	{
		System.out.println("Entering password");
	}
	
	@When("user clicks on login button")
	public void loginbutton()
	{
		System.out.println("Click on login button");
	}
	
	@Then("User should get logged in")
	public void loggedin()
	{
		System.out.println("User got logged in");
	}
	
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
	    System.out.println("Given statement for title verification");
	}

	@Then("Title of page should be pagetitle")
	public void title_of_page_should_be_pagetitle() {
	  System.out.println("Statement for title verification");
	}

}
