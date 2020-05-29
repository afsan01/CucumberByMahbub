Feature: Free CRM login Feature

#Without Examples keyword
#@Test
#Scenario: Free CRM Login Test Scenario

#Given User is already on Login Page
#When Title of Login page is Free CRM
#Then User clicks on login button
#Then User enters "afsan0403@gmail.com" and "Al112101"
#Then User clicks on submit button
#Then user is on home page
#Then close the browser

#With Examples keyword
@Test
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When Title of Login page is Free CRM
Then User clicks on login button
Then User enters "<username>" and "<password>"
Then User clicks on submit button
Then user is on home page
Then close the browser

Examples:
 |username| password|
 |afsan0403@gmail.com| Al112101|
 |tomm| |test456|

@Ahfaz
Scenario: Free CRM Login Test Scenario
Given user is already on home page
When user click on contact link
Then user click on New link
Then user enters firstname and lastname
Then user clicks on save button
Then verify new contact created