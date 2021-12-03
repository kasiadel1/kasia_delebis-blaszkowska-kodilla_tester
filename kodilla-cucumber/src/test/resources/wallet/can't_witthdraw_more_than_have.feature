# new feature
# Tags: optional

Feature: Can user withdraw more money than his balance
  Scenario:User is trying to withdraw more money than bank account balance
    Given User's balance is $500
    When User withdraws $1000
    Then no money is dispensed
    And User should be told that has not enough money