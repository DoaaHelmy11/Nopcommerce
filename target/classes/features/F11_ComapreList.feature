@smoke
Feature: F11_CompareList | User can add products to the compare list

  Scenario: success message is displayed after adding product to compare list
    When user add product to compare list
    Then success message notification is visible for compare list

    Scenario: check that compare table is not empty and has at least one product
      When user add product to compare list
      Then user opens compare list page
      And compare list page has clear list button
      And comparison table is displayed