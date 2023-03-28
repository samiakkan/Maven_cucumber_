Feature: Citizenship with ApachePOI

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    Given Navigate to Citizenships page

  Scenario: Create a new citizenship
    Then Create a citizenship by Apache POI