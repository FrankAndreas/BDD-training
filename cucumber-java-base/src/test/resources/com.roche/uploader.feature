Feature: Result ftp uploader

  Scenario: CSV file upload via ftp
    Given a new "result.csv" input file produced by system XY
    When the file is received in our inbound folder
    Then the file is moved to the remote server

  Scenario: Normalize file names
    Given a new "result.csv" existing input file produced by system XY
    When the file is received in our inbound folder
    Then the filename is normalized by adding the account number and timestamp

  Scenario: Non CSV file received
    Given a new "result.xml" input file produced by system XY
    When the file is received in our inbound folder
    Then the file is discarded

  Scenario: Remote server is down when posting
    Given a new "file1.csv" input file produced by system XY
    When the file is received in our inbound folder
    And the remote server is not available
    Then the system should retry to send it after 10 minutes
