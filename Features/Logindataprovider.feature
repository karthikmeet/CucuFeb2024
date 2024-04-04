Feature: DP Fb site login

  Scenario: DP Login scenario1
    Given DP Open facebook and launch the application
    When DP Enter the username and password
      | Username | Password |
      | Bala     | PP |
      | Karthik  | PP |
      | Saranya  | PP |
      | Divya    | PP |
    Then DP Test execution completed
