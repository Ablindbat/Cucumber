Feature: Searching test and purchares test

  @Test3 @smoke
  Scenario Outline: Vaild searching test on automation practice website
    Given Open browser and  navigate website
    And Type searching "<text>"
    When Click on search button
    Then Searching complete.

    Examples: 
      | text  |
      | dress |

  @Test4 @smoke
  Scenario Outline: Invaild searching test on automation practice website
    Given Open browser and  navigate website
    And Type searching "<text>"
    When Click on search button
    Then Searching not complete.

    Examples: 
      | text   |
      | iphone |