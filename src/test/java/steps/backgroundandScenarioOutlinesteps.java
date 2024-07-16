package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class backgroundandScenarioOutlinesteps {

	@Given("User should be at profile page")
	public void user_should_be_at_profile_page() {
	    System.out.println("Given statement");
	}

	@When("user enter firstname as {string}")
	public void user_enter_firstname_as(String firstname) {
	   System.out.println("When statement for firstname" + firstname); 
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String lastname) {
		System.out.println("When statement for firstname" + lastname); 
	}

	@When("user enters city name as {string}")
	public void user_enters_city_name_as(String city) {
		System.out.println("When statement for firstname" + city); 
	}

	@Then("profile should get created")
	public void profile_should_get_created() {
	   System.out.println("Then Statement");
	}
}
