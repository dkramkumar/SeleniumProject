Feature: Sandbox
	 @Table
  Scenario: FormFields
    Given User is on sandbox web site
    When User clicks on "Form Fields" button
    And User enters "Ramkumar" in input field
    And User clicks on "Option 1" check box
    And User scroll down to radio button
    And User selects the FirstBlue in radio button
    And User scroll down to dropdown menu
    And User selects the "Decimal" from drop down menu
    And User gets the list of items
    And User enters "ramkumardkr@gmail.com" as email id
    And User enters the message "Welcome" in input box
    And User scroll down to submit button
    And User clicks on submit button
    Then User verifies Contact Form Submission Message
 
  Scenario: Table - Item Prices
    Given User is on sandbox web site
    When User clicks on "Tables" button
    And User get the item details and price from simple table
