package com.qatestcode.cucumber.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrdersStep {
	
	@When("^User clicks on orders link$")
	public void user_clicks_on_orders_link() throws Throwable {
	    System.out.println("Clicked on Orders Link");
	}

	@Then("^User navigates to orders page$")
	public void user_navigates_to_orders_page() throws Throwable {
	   System.out.println("User navigated to Orders Page");
	}

}
