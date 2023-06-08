Feature: Login1
Scenario: Validate navigation of login page
Given Chrome is opened and Unacademy app is opened
Then user navigates on landing page
When User click on login button
Then User navigates on to login page

Scenario: Validate UI of login page
Given Chrome is opened and Unacademy app is opened
Then user navigates on landing page
When User click on login button
Then It shows elements of Unacademy login page

Scenario: Validate login page fields(loginbutton is clikable)
Given Chrome is opened and Unacademy app is opened
Then user navigates on landing page
When User click on login button
Then User navigates on to login page
And elements are enabled on login page

Scenario: Validate login page  Main functionality
 Given Chrome is opened and Unacademy app is opened
 Then user navigates on landing page
 When User click on login button
 Then User navigates on to login page
 When User enter mobilenumber "8179306455"
 And  User click on log in button
 When User enter otp 
 And  User click on verify otp button
 Then It shows home page
