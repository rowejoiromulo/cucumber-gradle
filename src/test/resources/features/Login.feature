@login
Feature: Swaglabs Login

  Background: User is at the login page
    Given I am at the login page

  @valid
  Scenario: Successful Login
    Given I entered these credentials
      | username      | password     |
      | standard_user | secret_sauce |
    When I click on log in button
    Then Product inventory is shown

  @invalid
  Scenario: Unsuccessful Login
    Given I entered these credentials
      | username        | password     |
      | invalid_user    | secret_sauce |
    When I click on log in button
    Then Error message is shown

# TODO: Combine scenarios of unsuccessful login with a locked out account
#  @invalid
#  Scenario: Unsuccessful Login
#    Given I entered these credentials
#      | username        | password     |
#      | invalid_user    | secret_sauce |
#      | locked_out_user | secret_sauce |
#    When I click on log in button
#    Then Error message is shown
#      | error_message      |
#      | invalid_message    |
#      | locked_out_message |