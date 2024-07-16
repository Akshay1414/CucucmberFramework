package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class campaignstatussteps {

	@Given("User is at campaign page")
	public void user_is_at_campaign_page() {
	   System.out.println("Given statement for campaign page");
	}

	@When("user click on create campaign button")
	public void user_click_on_create_campaign_button() {
	   System.out.println("When statement for click on campaign button");
	}

	@When("User enters the information")
	public void user_enters_the_information() {
	   System.out.println("When statement to enter the information");
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() {
	   System.out.println("When statement to click on save");
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
	   System.out.println("Then to create the campaign");
	}

	@When("user click on edit campaign button")
	public void user_click_on_edit_campaign_button() {
	 System.out.println("When statemnt to edit the campaign");
	}

	@When("User clicks on Schedule button")
	public void user_clicks_on_schedule_button() {
	   System.out.println("When statement for sending the information"); 
	}

	@Then("campaign should get scheduled")
	public void campaign_should_get_scheduled() {
	 System.out.println("Then for scheduling");
	}

	@When("user click on sent campaign button")
	public void user_click_on_sent_campaign_button() {
	   System.out.println("When for sent");
	}

}
