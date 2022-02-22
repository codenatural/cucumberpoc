Feature: Orders Page ARP Application
	This feature deals with ARP application Orders module

Scenario: Logged in user is able to navigate to Orders Page
	Given User opens Login Page
	When User enters username
	And User enters password
	And User clicks Login button 
	Then User navigates to home page
	When User clicks on orders link
	Then User navigates to orders page
	

