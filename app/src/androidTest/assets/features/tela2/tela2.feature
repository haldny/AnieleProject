Feature: Tela2
  # Tests for the Tela 2

  Background: Navigate to Tela2
    Given The app started
    And I see Main Activity screen
    When I press button 2 in Main Activity
    Then I should navigate to screen 2

  # Tela2 scenarios
  Scenario: User should see Tela2 with 13 elements in list
    Then I see Tela2 screen with 13 elements

  Scenario Outline: User can click in all elements in list
    Given I see Tela2 screen with 13 elements
    And Navigate to element <position>
    Then I see "<name>" in title
    Then I see "<surname>" in description
    Examples:
      | name     | surname  | position |
      | Haldny   | Santos   | 0        |
      | Aniele1  | Aquino1  | 1        |
      | Aniele2  | Aquino2  | 2        |
      | Aniele3  | Aquino3  | 3        |
      | Aniele4  | Aquino4  | 4        |
      | Aniele5  | Aquino5  | 5        |
      | Aniele6  | Aquino6  | 6        |
      | Aniele6  | Aquino7  | 7        |
      | Aniele8  | Aquino8  | 8        |
      | Aniele9  | Aquino9  | 9        |
      | Aniele10 | Aquino10 | 10       |
      | Aniele11 | Aquino11 | 11       |
      | Aniele12 | Aquino12 | 12       |
