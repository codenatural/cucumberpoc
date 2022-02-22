package com.qatestcode.cucumber.stepdefinition;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**This Class contains all the step definition relating to Calculator,
 methodNames can be changed as per user*/
public class CalculateSteps {
	private double result;
	private double sqrt;
	
	
	@When("^User adds number (.*) and number (.*)$")
	public void addNumbers(double n1, double n2) throws Throwable {
	    result = n1+n2;
	    System.out.println("Addition of numbers : "+result);
	}

	@Then("^Calculator displays (.*)$")
	public void calculator_displays(double output) throws Throwable {
	    Assert.assertEquals(output, result);
	}

	@When("^User subtract number (\\d+) from (\\d+)$")
	public void subtractNumbers(double n1, double n2) throws Throwable {
		result = n2-n1;
		System.out.println("Subtraction of numbers : "+result);
	}

	@When("^User multiplies number (\\d+) and (\\d+)$")
	public void multiplyNumbers(double n1, double n2) throws Throwable {
		result = n1*n2;
		System.out.println("Multiplication of numbers : "+result);
	}

	@When("^User divides number (\\d+) by (\\d+)$")
	public void divideNumbers(double n1, double n2) throws Throwable {
		result = n1/n2;
		System.out.println("Division of numbers : "+result);
	}
	
	@When("^User enters two numbers$")
	public void userEntersNumbers(DataTable numbers) throws Throwable {
		//Write the code to handle Data Table
		List<List<String>> data = numbers.raw();
		result = Double.parseDouble(data.get(0).get(0))+
				Double.parseDouble(data.get(0).get(1));
	}

	@When("^Sum Calculate SQRT$")
	public void sum_Calculate_SQRT() throws Throwable {
	    sqrt = Math.sqrt(result);
	}

	@Then("^Display \"([^\"]*)\"$")
	public void display(String text) throws Throwable {
	   if(sqrt>10) {
		  System.out.println("SQRT is > 10");
		  Assert.assertEquals("SUCCESS", text);
	   }else {
		   System.out.println("SQRT is <= 10");
		   Assert.assertEquals("FAIL", text);
	   }
	}
	
	@When("^User enters full name$")
	public void user_enters_full_name(DataTable fullname) throws Throwable {
		//Write the code to handle Data Table
		String fname = null,mname = null,lname = null;
		for (Map<String, String> data : fullname.asMaps(String.class, String.class)) {
			fname = data.get("fistname");
			mname = data.get("middlename");
			lname = data.get("lastname");
		}
		System.out.println("Complete Name is : "+fname+mname+lname);
	}

	@Then("^Do Nothing$")
	public void do_Nothing() throws Throwable {
	    System.out.println("Did Nothing");
	}
	
	@When("^User enters address$")
	public void user_enters_address(DataTable address) throws Throwable {
	   
	}
}
