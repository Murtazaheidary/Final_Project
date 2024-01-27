@RegressionPlans
  Feature: Validating User Plans Page


    Background: Setup Plans Page Test
      Then Click on Login button
      And Login with valid user "supervisor" and password "tek_supervisor"
      And Click on Sign in button
      And validate user navigate to Customer Service Portal
      When Clicking on Plans

      @PlansPage
      Scenario: Validating User Plans Page and 4 Rows of data must be present
        #Then Four rows should be visible
        Then 5 data rows must display

        @CreateDate
        Scenario:Validate plans page's Create Date and Expire Date
          Then Validate Create Date
          And Validate Expire Date

