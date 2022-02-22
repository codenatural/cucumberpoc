package com.qatestcode.cucumber.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	@Given("^User opens Login Page$")
	public void user_opens_Login_Page() throws Throwable {
	   System.out.println("Login page opened");
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
	    System.out.println("Username entered");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
		System.out.println("Password entered");
	}
	
	@When("^User clicks Login button$")
	public void user_clicks_Login_button() throws Throwable {
		System.out.println("Login button clicked");
	}

	@Then("^User navigates to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
		System.out.println("Navigated to Home Page");
	}
	
	@Then("^User gets Login Error Message$")
	public void user_gets_Login_Error_Message() throws Throwable {
		System.out.println("User thrown error message");
	}
}
