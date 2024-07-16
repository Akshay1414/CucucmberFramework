package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class profilepicturesteps {

	@Given("User should be at home page")
	public void user_should_be_at_home_page() {
	   System.out.println("Given Statement");
	}

	@When("User clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
	    System.out.println("When statement for add button");
	}

	@When("Upload the image")
	public void upload_the_image() {
	    System.out.println("When statement for add image");
	}

	@Then("profile should be added")
	public void profile_should_be_added() {
	    System.out.println("Then statement for add button");
	}

	@When("User clicks on Update profile button")
	public void user_clicks_on_update_profile_button() {
	    System.out.println("When statement for update button");
	}

	@Then("profile should be updated")
	public void profile_should_be_updated() {
	    System.out.println("Then statement for update button");
	}

	@When("User clicks on delete profile button")
	public void user_clicks_on_delete_profile_button() {
	    System.out.println("When statement for delete button");
	}

	@Then("profile should be deleted")
	public void profile_should_be_deleted() {
	    System.out.println("Then statement for delete button");
	}
}
