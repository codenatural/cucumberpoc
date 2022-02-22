Feature: Calculator functionality
	This feature deals with Calculator module

Scenario: User is able to add two numbers
	When User adds number 3 and number 5
	Then Calculator displays 8
	
Scenario: User is able to subtract two numbers
	When User subtract number 10 from 25
	Then Calculator displays 15
	
Scenario: User is able to multiply two numbers
	When User multiplies number 5 and 10
	Then Calculator displays 50
	
Scenario: User is able to divide two numbers
	When User divides number 50 by 10
	Then Calculator displays 5
	
	

