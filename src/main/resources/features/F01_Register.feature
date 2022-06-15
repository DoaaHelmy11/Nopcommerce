@smoke
  Feature: F01_Register | user can create new account

    Scenario: guest user could register with valid data successfully
      Given user go to register page
      When user select gender type
      And user enter first name "automation" and last name "tester"
      And user enter date of birth
      And user enter email field "doaa@example.com"
      And user fills Password fields "P@ssw0rd" "P@ssw0rd"
      And user clicks on register button
      Then success message is displayed

