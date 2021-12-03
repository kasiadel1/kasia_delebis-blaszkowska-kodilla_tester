# new feature
# Tags: optional

Feature: Checking account balance
  Scenario: User wants to check account balance
    Given User has $0 on bank account
    When When user is checking balance
    Then Should be displayed $0