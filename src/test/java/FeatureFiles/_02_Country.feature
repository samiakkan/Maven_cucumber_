Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And Navigate to Country page


  Scenario: Create Country
  #  Given Navigate to Campus
  #  When Enter username and password
  #  And Click on Login Button
  #  Then User should login successfully
  #  And Navigate to Country page
    When Create a new country
    Then Success message should be displayed

    # ADD edit country scenario

    Scenario: Delete Country
   #   Given Navigate to Campus
   #   When Enter username and password
   #   And Click on Login Button
   #   Then User should login successfully
   #   And Navigate to Country page
      When Delete country
      Then Success message should be displayed

      Scenario:
        And Click on add button
        When Enter country name as "USA19111164" and code as "u111117"
        And Click on save button
        Then Success message should be displayed

  Scenario: Delete Country
    When Delete country
    Then Success message should be displayed


    # "USA19111164"
  #"u111117"