package com.qatestcode.cucumber.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;


/**An important thing to note about the after hook is that even in case of test fail, 
 * after hook will execute for sure.
 * Method name can be anything, need not to be beforeScenario() or
 * afterScenario(). 
 * can also be named as setUp() and tearDown().
 * Make sure that the package import statement should be
 * import cucumber.api.java.After;
 * & import cucumber.api.java.Before*/
public class Hooks {

	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
	}
	
	
	@Before("@First")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }	

	@Before("@Second")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }	

	@Before("@Third")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
    }

	@After("@First")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");   
    }	

	@After("@Second")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");   
    }	

	@After("@Third")
    public void afterThird(){
        System.out.println("This will run only after the Third Scenario");   
    }
	
	@Before("@First,@Third") // Before First and Third
    public void beforeFirstAndThird(){
        System.out.println("This will run before both First & Third Scenario");
    }
	
	@Before(order=0) // Like Priority in TestNG
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }	
	
	@After(order=0)
    public void afterScenarioFinish(){
        System.out.println("-----------------End of Scenario-----------------");
    }	

}
