@smoke
Feature: F06_HomeSlider | user will be able to open sliders on the homepage

  Scenario: user tries to open first slider on homepage (Nokia slider)
    When user clicks on first slider
    Then relative product for first slider is displayed

  Scenario: user tries to open second slider on homepage (Iphone slider)
    When user clicks on second slider
    Then relative product for second slider is displayed