@Regression_Create
  Feature: Create Account functionality test

    Background: Setup test for create account
      When Click on Create Primary Account button
      Then Click on Create Account button


@Title_Test
    Scenario: Validate title of Create Primary Account Page
      Then Create Primary Account Holder should be the title

    @Positive
    Scenario: Create valid new account
      #When Click on Create Primary Account button
      When Fill Create Primary Account Holder form from DataTable
      |email  |   murtaza001@gmail.com  |
      |title  |     Mr.   |
      |firstName  |   Murtaza  |
      |lastName  |   Heidary  |
      |gender  |   MALE  |
      |maritalStatus  |  Married   |
      |employmentStatus  |   Student  |
      |dateOfBirth |  12/12/1990  |
     Then Click on Create Account button
     And Validate user is on 'Sign up your account'
     Then Display email must be same as entry

@Negative
    Scenario: Validate existing email address error message
     # When Click on Create Primary Account button
      When Re-registering from dataTable with existing email must gave error message
        |Email  |   murtaza001@gmail.com  |
        |title  |     Mr.   |
        |firstName  |   Murtaza  |
        |lastName  |   Heidary  |
        |gender  |   MALE  |
        |maritalStatus  |  Married   |
        |employmentStatus  |   Student  |
        |dateOfBirth |  12/12/1990  |
      Then Click on Create Account button
      Then Error message should pup up "Account with email murtaza001@gmail.com is exist"


