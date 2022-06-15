@smoke
  Feature: F03_Currencies | user should be able to choose the currency he wants the product to be displayed in

    Scenario: user chooses euro currency from the list and price of products is changed to euro sign
      When user choose euro from currencies list
      Then the price of four products on home page is changed to euro
