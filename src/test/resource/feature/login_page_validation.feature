Feature: Login ARP Application
	This feature deals with ARP application login module

Scenario: Login ARP Application with Valid Credentials
	Given User opens Login Page
	When User enters username
	And User enters password
	And User clicks Login button 
	Then User navigates to home page
	
	
Scenario: Login ARP Application with Invalid Credentials
	Given User opens Login Page
	When User enters username
	And User enters password
	And User clicks Login button 
	Then User gets Login Error Message
	

