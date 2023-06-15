Feature: BingSearch

  Basic bing search tests that should validate that site is up and running and user has possibility to search something

  @SMOKE
  @TC_5645
  Scenario Outline: Search normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "<searchFor>"
    Then First three results contains "<expectedResult>"

    Examples:
      | searchFor  | expectedResult |
      | light beer | light beer     |
      | dark beer  | dark beer      |




