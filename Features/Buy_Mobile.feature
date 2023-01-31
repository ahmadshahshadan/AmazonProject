Feature: Testing Login Feature
I want to validate login functionality with different sets of user name and passwrod 
  
Scenario: Valid username and password
Given  user is on saucedemo login page
when user enters "username" and "password"
And user click login button
Then user should be on homepage
And close the browser
  