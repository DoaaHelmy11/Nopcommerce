@smoke
Feature: F08_Wishlist | User can add products to the wishlist

  Scenario: success message is displayed after adding product to wishlist
    When user add product to wishlist
    Then success message notification is visible

  Scenario: number of items in wishlist icon on homepage is increased (not equal zero)
    When user add product to wishlist
    Then success message notification is visible
     And user gets the number of wishlist items after adding the product
     And number of items in wishlist is increased

  Scenario: item is added to wishlist page
    When user add product to wishlist
    And user clicks on wishlist link
    Then user is redirected to wishlist page
    And the product exists in wishlist page
    And quantity attribute is larger than zero