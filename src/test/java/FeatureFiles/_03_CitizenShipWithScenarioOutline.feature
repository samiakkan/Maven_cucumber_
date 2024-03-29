Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    Given Navigate to Citizenships page

  Scenario Outline: Create a Citizenship
    And Click on add button
    And Enter citizenship name as "<CitizenshipName>" and citizenship short name as "<CitizenshipShortName>"
    When Click on save button
    Then Success message should be displayed
    Examples:
      | CitizenshipName | CitizenshipShortName |
      | SAM11            | SA11                  |
      | SAM22            | SA22                  |
      | SAM33            | SA33                  |
      | SAM44            | SA44                  |

  Scenario Outline: Delete Citizenship
    And Search for Citizenship with name as "<CitizenshipName>" nad short name as "<CitizenshipShortName>"
    And Delete citizenship
    Then Success message should be displayed
    Examples:
      | CitizenshipName | CitizenshipShortName |
      | SAM11            | SA11                  |
      | SAM22            | SA22                  |
      | SAM33            | SA33                  |
      | SAM44            | SA44                  |

