
Feature: Sandbox
  @Smoke
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
    And User get the countries by population in sorted table
    And User selects "25" as entries in sortable table
    Then User verify number of rows displayed
  
  Scenario: Calendars - Enter Date
    Given User is on sandbox web site
    When User clicks on "Calendars" button
    And User enters the date "March 24, 2022" in text field
    And User clicks on submit button
    Then User verify the entered date
  @Calendars
  Scenario: Calendars - Select Date
    Given User is on sandbox web site
    When User clicks on "Calendars" button
    And User selects the date "10" in calendar
    And User clicks on submit button
    Then User verify the selected date

  Scenario: PopUps - Alert popup
    Given User is on sandbox web site
    When User clicks on "Popups" button
    And User clicks on "alert" popup
    And User gets the text from the alert popup
    And User verify the text on the alert popup
    And User clicks on OK button

  Scenario: PopUps - confirm popup
    Given User is on sandbox web site
    When User clicks on "Popups" button
    And User clicks on "confirm" popup
    And User clicks on OK button
    Then User verify the text after clicking OK button
    And User clicks on "confirm" popup
    And User clicks on Cancel button
    Then User verify the text after clicking Cancel button
 
  Scenario: PopUps - Prompt popup
    Given User is on sandbox web site
    When User clicks on "Popups" button
    And User clicks on "prompt" popup
    And User enters "Ramkumar" in prompt popup  text field
    And User clicks on "prompt" popup
    And User clicks on Cancel button
    Then User get the prompt result after clicking Cancel button

  Scenario: Modals - Simple Modal
    Given User is on sandbox web site
    When User clicks on "Modals" button
    And User clicks on "simpleModal" button in Modals
    Then User verify the simple modal title and text

  Scenario: Modals - Form Modal
    Given User is on sandbox web site
    When User clicks on "Modals" button
    And User clicks on "formModal" button in Modals
    And User enters "name" as "Ramkumar" in contact info
    And User enters "email" as "ramkumardlr@gmail.com" in contact info
    And User enters message as "Hi Hello hoe are you" in contact info
    And User clicks on submit button in modal form

  Scenario: Hover - Mouse Over Me
    Given User is on sandbox web site
    When User clicks on "Hover" button
    And User move to mouse over me button
    Then User get the mouse over out put message
  @Search
  Scenario: Search Boxes - Search
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Search Boxes" button
    And user enters "Selenium" in search box
    And User clicks on search button
    Then User verify entry header

  Scenario: File Download - Normal Download
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "File Download" button
    And User clicks on download button in normal download
    And User enters the path to download in window based popup
  @Download
  Scenario: File Download - Password Protected Download
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "File Download" button
    And User clicks on download button in Password Protected Download
    And User enters "automateNow" password
    Then User verify the file is downloaded

  Scenario: Windows Operations - Click New Tab
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Window Operations" button
    And User clicks on "New Tab" in window operations
    Then Verify the new tab is opened

  Scenario: Windows Operations - Click Replace window
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Window Operations" button
    And User clicks on "Replace Window" in window operations
    Then Verify that the window is replaced

  Scenario: Windows Operations - New window
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Window Operations" button
    And User scroll to New Window
    And User clicks on "New Window" in window operations
    Then Verify that the New Window is opened

  Scenario: File Upload - Text File
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "File Upload" button
    And User clicks on Choose file button
    And User selects the file to upload
    And User clicks on Upload button

  Scenario: Gestures - Drag
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Gestures" button
    And User drags on the map

  Scenario: Gestures - Full Screen
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Gestures" button
    And User clicks on full screen

  Scenario: Gestures - Zoom In
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Gestures" button
    And User clicks on Zoom In button
    Then User verify the Zoom In functionality working successfully

  Scenario: Gestures - Zoom Out
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Gestures" button
    And User clicks on Zoom Out button
    Then User verify the Zoom Out functionality working successfully

  Scenario: IFrames - First IFrame
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "IFrames" button
    And User switch to iframe and gets the header

  Scenario: IFrames - Second IFrame
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "IFrames" button
    And User scroll down to second frame
    And User switch to second iframe and gets the header

  Scenario: Broken Images
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Broken Images" button
    Then User verify the broken images

  Scenario: Accordions
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Accordions" button
    And User clicks on Click to see more
    Then User verify the accordion message

  Scenario: Broken Links
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Broken Links" button
    Then User verify the broken links

  Scenario: Ads
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Ads" button
    Then Verify Ads open after five seconds

  Scenario: Slider
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Slider" button
    And User slids the bar
    Then Verify the value of slider

  Scenario: Click Events
    Given User is on sandbox web site
    When User scroll to search boxes button
    When User clicks on "Click Events" button
    And User clicks on "cat" button in click events
    Then Verify the "cat" sound "Meow!" text
    And User clicks on "dog" button in click events
    Then Verify the "dog" sound "Woof!" text
    And User clicks on "pig" button in click events
    Then Verify the "pig" sound "Oink!" text
    And User clicks on "cow" button in click events
    Then Verify the "cow" sound "Moo!" text

  Scenario: FormFields - Excel Data
    Given User is on sandbox web site
    When User clicks on "Form Fields" button
    And User pass the Input field from excel sheet
    And User clicks on "Option 1" check box
    And User scroll down to radio button
    And User selects the FirstBlue in radio button
    And User scroll down to dropdown menu
    And User selects the "Decimal" from drop down menu
    And User gets the list of items
    And User pass the email and Input box from excel sheet
    And User scroll down to submit button
    And User clicks on submit button
    Then User verifies Contact Form Submission Message