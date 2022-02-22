package com.qatestcode.cucumber.poc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/feature",glue={"com.qatestcode.cucumber.stepdefinition","com.qatestcode.cucumber.utils"},
plugin = { "pretty","html:target/cucumber-reports"},monochrome = true,
dryRun=false,tags= {"@DemoHooks"})
/**
When a class is annotated with @RunWith or extends a class
annotated with @RunWith, 
JUnit will invoke the class it references to run the tests
in that class instead of the runner built into JUnit.

@CucumberOptions enables us to do all the things that we could have
done if we have used cucumber command line.

features : Features Options helps Cucumber to locate the Feature file
in the project folder structure

glue : It helps Cucumber to locate the Step Definition file.

dryRun - option can either set as true or false.
If it is set as true, it means that Cucumber will only check
that every Step mentioned in the Feature File has corresponding code written in Step Definition file or not. 
All the test are skipped on running TestRunner class

monochrome  : This option can either set as true or false. 
If it is set as true, it means that the console output 
for the Cucumber test are much more readable. It removes formating issues.


 */
public class TestRunner {
	

}
