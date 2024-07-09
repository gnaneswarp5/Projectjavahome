Feature: login

  @Amazon01
  Scenario: login validation
    Given user navigates to login page
    When user enter the username
    And user click the login button
    Then verify user is at homepage

  @Amazon02 @abc
  Scenario: error message validation
    Given user navigates to login page of error
    When users enter the username
    And user click the login buttons
    Then verify the error message

  @Amazon03 @abc
  Scenario Outline: login function
    Given user navigates to Amazon login page
    When user enter the product name "<product name>"
    Then user validate the product
    Examples:
      | product name |
      | Mobile       |
      | Camera       |
      | Airpods      |

    @dropdown
    Scenario: Dropdown
      Given user enter the login page
      When search the values in the dropdownlist
