Feature: Bank

  Scenario: Bank usage
    Given an account is created
    When they print their bank statement
    Then they would see: "Date | Amount | Balance"