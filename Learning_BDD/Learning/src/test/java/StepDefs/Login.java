package StepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.util.HashMap;
import java.util.Map;
import io.cucumber.core.cli.Main;




public class Login {

	@Given("I navigate to login page")
	public void navigate_to_loginpage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("login page");
	}


	@When("I enter username")
	public void i_enter_username() {
		// Write code here that turns the phrase abothrow new cucumber.api.PendingException();
		
	}

	@When("I enter password")
	public void i_enter_password() {
		System.out.println("password");
		// Write code here that turns the phrase above into concrete actions
		

	}
	@Then("I need to be in homepage")
	public void i_need_to_be_in_homepage() {
		System.out.println("homepage");
		// Write code here that turns the phrase above into concrete actions
		
	}
	
}
