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
    Then validate application login functinality

    Examples:
      |email                 |password   |
      |toma.igor.ie@gmail.com |toma.igor.ie@gmail.comA1|
      |carlosta@gmail.com |Solrac@6879 |