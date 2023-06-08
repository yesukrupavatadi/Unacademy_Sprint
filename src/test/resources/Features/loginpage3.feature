Feature: Login
Scenario Outline: Verifying Unacadamey login functionality on chrome
Given Chrome is launched and Unacadamey application is launched
When User click on login button
When User fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
And  User clicks on log in button
When User enter otp 
And  User click on verify otp button
Then It shows home page

Examples:
    |  SheetName  | RowNumber |
    |  Sheet1     |     0     |
    |  Sheet1     |     1     |