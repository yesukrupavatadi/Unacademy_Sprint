Feature: Login
Scenario Outline: Verify Unacademy login functionality with valid data
    Given Chrome is opened and Unacademy app is opened
    Then user navigates on landing page
    When User click on login button
    Then User navigates on to login page
    When User enter mobilenumber "8179306455"
    And  User click on log in button
    When User enter otp 
    And  User click on verify otp button
    Then It shows home page
 
    Examples: 
    | mobile number           | otp        |
    | 8179306455              |            |
 
    
  Scenario Outline: Verify Unacademy login functionality with invalid data
    Given Chrome is opened and Unacademy app is opened
    Then user navigates on landing page
    When User click on login button
    Then User navigates on to login page
    When User enter mobilenumber "8179306455"
    And  User click on log in button
    When User enter otp 
    And  User click on the verify otp button
    Then It shows error message
    Examples: 
     | mobile number     | otp      |
     | 8179306455        |          |
      