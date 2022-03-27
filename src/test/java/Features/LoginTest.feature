Feature: To login test on automationpractice website.

  @Test1 @smoke
  Scenario Outline: Valid Login test of automation website.
    Given Open browser and  navigate url
    And I click the Sign in text
    Given I enter my "<email>"
    And I also enter my "<password>"
    When I click the Sign in button
    Then I signin successfully

    Examples: 
      | email             | password |
      | abc.xyz@gmail.com |    12345 |

  @Test2 @smoke
  Scenario Outline: Invalid Login test of automation website.
    Given Open browser and  navigate url
    And I click the Sign in text
    Given I enter my "<email>"
    And I also enter my "<password>"
    When I click the Sign in button
    Then I signin not successfully

    Examples: 
      | email              | password |
      | alphabat@gmail.com |    98765 |
