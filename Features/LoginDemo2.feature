Feature: Fb site login

  Scenario Outline: Login scenario1
    Given Open facebook and launch the application
    When Enter the username as "<arg1>" and password as "<arg2>"
    Then Test execution completed

    Examples: 
      | arg1        | arg2 |
      | Ravi        | rx   |
      | Saranya     | sx   |
      | Divya       | dx   |
      | Karthikeyan | kx   |
