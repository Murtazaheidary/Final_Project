@RegressionAccounts
  Feature: Navigate to Accounts and verify 5 rows are page's default

    Background:Setup Accounts Page Test
      Then Click on Login button
      And Login with valid user "supervisor" and password "tek_supervisor"
      And Click on Sign in button
      And validate user navigate to Customer Service Portal
      When Clicking on Accounts

     @FiveRows
      Scenario: Validating accounts page is 5 rows are page's default
       When "5" data rows are default
       Then 5 data rows must display

       @Second_Scenario
       Scenario: Validate Account page to 10, 25, 50 rows and validate table records per page according to selected show per page.
         When change Data to "10" rows per page
         Then 10 data rows must display
         When change Data to "25" rows per page
         Then 25 data rows must display
         When change Data to "50" rows per page
         Then 50 data rows must display

    @Third_Scenario
    Scenario Outline: Change Account page to 10, 25, 50 rows and validate table records per page according to selected show per page.
      When Page row is "<pageRows>" data should be same as rows
      Examples:
      |   pageRows    |
      |    Show 10    |
      |    Show 25    |
      |    Show 50    |

