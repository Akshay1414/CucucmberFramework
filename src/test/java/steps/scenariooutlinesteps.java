package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenariooutlinesteps {

	@Given("User is at the signup page")
	public void user_is_at_the_signup_page() {
	    System.out.println("Given statement");
	}

	@When("User enters {string} on form")
	public void user_enters_on_form(String uname) {
	   System.out.println("Name entered is" + uname);
	}

	@When("user enters {string} inside the form")
	public void user_enters_inside_the_form(String age) {
	    System.out.println("Age entered is" + age);
	}

	@When("user select the {string}")
	public void user_select_the(String gender) {
	   System.out.println("User selects the genderas" + gender);
	}
	
	@When("user select the server as {int}")
	public void user_select_the_server_as(Integer server) {
	    System.out.println("user selects the server" + server);
	}

	@Then("user should get created")
	public void user_should_get_created() {
	    System.out.println("Then statement for user creation");
	}
}
