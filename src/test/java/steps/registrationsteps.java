package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;
//datatable import taken from 2nd method

public class registrationsteps {

	@Given("User should be at registration page")
	public void user_should_be_at_registration_page() {
	    System.out.println("Given statement");
	}

	@When("user enters following information")
	public void user_enters_following_information(DataTable dataTable) {
	  
		List<List<String>> data = dataTable.asLists(String.class);
		
		for(List<String> listvalue:data)
		{
			System.out.println(listvalue);
		}
		
		List<String> L1 = data.get(0);
		String value = L1.get(2);
		System.out.println(value);
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	   System.out.println("When statement for submit button");
	}

	@Then("user gets created")
	public void user_gets_created() {
	 System.out.println("Then statement");
	}
}
