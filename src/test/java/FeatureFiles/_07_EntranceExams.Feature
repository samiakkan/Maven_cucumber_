Feature: Entrance Exams Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario Outline: Create an Entrance Exam
    Given Go to Entrance Exams page
    And Click on add button
    And Fill the Create Exam form
      |<Exam Name>|
    And Create a description
      |<Description>|
    And Create a note
      |<Note>|
    When Click on save button
    Then Success message should be displayed

    Examples:
      | Exam Name      | Description           | Note                          |
      | Batch 7 Exam 1 | Batch 7 is the best   | We are coming soon            |
#      | Batch 7 Exam 2 | Batch 7 rocks         | Get prepared                  |
#      | Batch 7 Exam 3 | Batch 7 is fun        | We are having fun             |
#      | Batch 7 Exam 4 | Batch 7 don't give up | We can do it                  |
#      | Batch 7 Exam 5 | We are almost ready   | But we are better than anyone |
