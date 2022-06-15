@smoke
  Feature: F07 Follow us | user should be able to follow the website from different social media websites and be redirected to its social media website

    Background: user could login with valid email and password
      Given user go to login page
      When user login with email "doaa@example.com" and password "P@ssw0rd"
      And user press on login button
      Then user login to the system successfully

    Scenario: user can follow the website on facebook
      When user clicks on facebook icon
      Then user is redirected to the facebook page of the website

    Scenario: user can follow the website on twitter
      When user clicks on twitter icon
      Then user is redirected to the twitter page of the website

    Scenario: user can follow the website on news rss
      When user clicks on news rss icon
      Then user is redirected to the news rss page of the website

    Scenario: user can follow the website on youtube
      When user clicks on youtube icon
      Then user is redirected to the youtube channel of the website