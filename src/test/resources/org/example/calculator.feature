Feature: Calculator
  I want to use a calculator to add numbers
  Scenario: Add two numbers 2 & 3
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5


  Scenario: Add two numbers 6 & 3
    Given I have a calculator
    When I add 6 and 3
    Then the result should be 9

  Scenario: Multiply two numbers 6 & 3
    Given I have a calculator
    When I multiply 6 and 3
    Then the result should be 18
