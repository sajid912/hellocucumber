Feature: Is it Friday yet?
  Everybody wants to know when it's friday


  Scenario: Sunday isn't Friday
    Given today is Sunday
    When asked whether it's friday yet
    Then answer is "Nope"

  Scenario: Friday is Friday
    Given today is Friday
    When asked whether it's friday yet
    Then answer is "Yes"

  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When asked whether it's friday yet
    Then answer is "<answer>"

    Examples:
      | day     | answer |
      | Sunday  | Nope   |
      | Friday  | Yes    |
      | Tuesday | Nope   |
