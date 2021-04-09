#encoding UTF-8
#Email:
#Author: Carlos Almeida

@login
Feature: Login at Nuacom
  As a registered user I want to perform Login into the Nuacom Platform

  @nuaconLogin
  Scenario Outline: login at Nuacom Page
    Given the user is placed in the home page
    And set the username "<email>"
    And set the Password "<password>"
    When Click in Login button
    Then the application should not perform the login displaying the message "Login failed. Make sure you insert the right credentials, if you forgot them, then you can reset the password."

    Examples:
      |email                 |password   |
      |toma.igor.ie@gmail.com |toma.igor.ie@gmail.comA1|
