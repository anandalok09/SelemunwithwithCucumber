package com.cumberBDD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("== io.cucumber.java.PendingException");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("== io.cucumber.java.PendingException");
	    System.out.println("======this is username=="+username);
	    System.out.println("=============this is password=="+password);
	    
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("== io.cucumber.java.PendingException");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("== io.cucumber.java.PendingException");
	}

}
