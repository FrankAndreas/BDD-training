Feature: Bank

  Scenario: Bank usage
    Given a client makes a deposit of 1000 on "10-01-2012"
    And a client makes a deposit of 2000 on "13-01-2012"
    And a withdrawal of 500 on "14-01-2012"
    When they print their bank statement
    Then they would see: "Date | Amount | Balance\n14/01/2012 | -500 | 2500\n13/01/2012 | 2000 | 3000\n10/01/2012 | 1000 | 1000"