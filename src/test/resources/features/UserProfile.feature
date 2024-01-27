@RegressionProfile
Feature: Validating User Profile

  Background:Setup User profile test
    Then Click on Login button
    And Login with valid user "supervisor" and password "tek_supervisor"
    And Click on Sign in button
    And validate user navigate to Customer Service Portal
    And click on profile button

  @Profile_Test
  Scenario: Login with valid CSR credentials and profile must be same as entry
    And all profile side drawer must be correct "STATUS:Active, USER TYPE:CSR, FULL NAME:Supervisor, USERNAME:supervisor, AUTHORITIES:admin"

  @Logout
  Scenario: After login navigate to profile and logout should be successful
    Then click on logout button and home page must display









