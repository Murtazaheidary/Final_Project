@RegressionLogin_Test
Feature: Login Functionality tests

Background:Setup test for Login
  Then Click on Login button


  @Positive_Test
  Scenario: Login with Valid CSR credentials
    And Login with valid user "supervisor" and password "tek_supervisor"
    And Click on Sign in button
    And validate user navigate to Customer Service Portal

  @Negative_Test
  Scenario: Login with invalid username credential
    Then Login with invalid user credentials "supervisor1" and "tek_supervisor"
    And Click on Sign in button
    And Validate error message as expected "User supervisor1 not found"

  @Negative_Test_One
  Scenario: Login with invalid password credential
    Then Login with invalid user credentials "supervisor" and "tek_supervisor1"
    And Click on Sign in button
    And Validate error message as expected "Password not matched"




