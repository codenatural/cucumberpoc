Feature: Data Driven Testing
	This describes data driven approach in Cucumber

Scenario: Parameterization without Example Keyword
	Given User enters text "user001"
	And User enters text "pass123"
	When Entry is combined
	Then Output should be "user001pass123"
	And "Token generated successfully" message is displayed

@E2E
Scenario Outline: Parameterization with Example Keyword
	Given User enters text "<username>"
	And User enters text "<password>"
	When Entry is combined
	Then Output should be "<combined>"
	And "<message>" message is displayed
	
Examples:
	| username   | password  | combined           | message     |
	|   ashwani  |  pass123  | ashwanipass123     | Matching    |
	|   avyukt   |  pass124  | avyuktpass124      | NotMatching |
	


	
	

