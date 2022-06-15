@smoke
  Feature: F05 Hover on category | user should be able to choose sub-category by hovering on the main category and choose the sub-category

    Scenario: user hovers on category on homepage
      When user hovers on category and select subcategory
      Then user is redirected to the subcategory page with title equals to subcategory value and url contains desktop