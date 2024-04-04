@execute
Feature: Fb site login

  Background: Login background
    Given Open facebook and launch the application
    When Enter the username and password
    Then Test execution completed

  Scenario: Login scenario1
    Given Open facebook and launch the application
    When Enter the username and password
    Then Test execution completed

  Scenario: Login scenario2
    Given Open facebook and launch the application
    When Enter the username and password
    And supporting statement1
    Then Test execution completed
