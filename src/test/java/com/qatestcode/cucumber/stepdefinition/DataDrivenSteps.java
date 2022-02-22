package com.qatestcode.cucumber.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;

public class DataDrivenSteps {
	private String result="";

	@Given("^User enters text \"([^\"]*)\"$")
	public void enterInTextBox(String text) throws Throwable {
		result=result+text;
	    System.out.println("User Entered : "+text);
	}

	@When("^Entry is combined$")
	public void combineTextInput() throws Throwable {
		System.out.println("Combined entry is : "+result);
	}

	@Then("^Output should be \"([^\"]*)\"$")
	public void displayText(String text) throws Throwable {
		System.out.println("Checking displayed text");
	    Assert.assertEquals(result, text);
	}

	@Then("^\"([^\"]*)\" message is displayed$")
	public void message_is_displayed(String text) throws Throwable {
	    System.out.println("Text displayed is : "+text);
	}

	
}