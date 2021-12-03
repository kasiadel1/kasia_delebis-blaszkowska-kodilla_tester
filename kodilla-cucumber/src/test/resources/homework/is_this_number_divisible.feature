# new feature
# Tags: optional

Feature: Is this number divisible by ?

  Scenario Outline: This number can be or can not be divisible by given number
    Given My number is  <number>
    When I'm checking if my number is divisible by 3 and 5
    Then I should be told and <answer>
    Examples:
      | number | answer     |
      | 27     | "Fizz"     |
      | 15     | "FizzBuzz" |
      | 25      | "Buzz"     |
      | 13     | "None"     |
