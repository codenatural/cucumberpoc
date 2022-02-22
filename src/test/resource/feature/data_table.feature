Feature: Testing using data table
	This describes data table approach in Cucumber
		

Scenario: Accept two numbers from user and display SUCCESS when sum square root > 10
	When User enters two numbers
	|100 |21|
	And Sum Calculate SQRT
	Then Display "SUCCESS"
	
	
Scenario: Accept two numbers from user and display FAIL when sum square root < 10
	When User enters two numbers
	|11|70|
	And Sum Calculate SQRT
	Then Display "FAIL"
	
Scenario: DataTables with Header Demo1
	When User enters full name
	| firstname | middlename | lastname |
	|  Ashwani  | Kumar      | Sharma   |
	Then Do Nothing


	
