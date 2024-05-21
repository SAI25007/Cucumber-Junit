
Feature: To find the page objects


#Background:
#Given user need to login the page (personal account)
#When enter username and password
#Then user entered the website

  @PageObject
  Scenario: Find the Page Objects
    Given User loged into the greenKart WebSite
    When User Entered vegies <name> in search box
    Then Results has been displayed
Examples:
|name|
|tom |