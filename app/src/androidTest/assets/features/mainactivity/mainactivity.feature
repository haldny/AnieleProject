Feature: MainActivity
  # Tests for the main activity

  # Main Activity scenarios
  Scenario: User should see Main Activity when opened the app
    Given The app started
    Then I see Main Activity screen

  Scenario: User should exit the app when pressing back in main screen
    Given The app started
    And I see Main Activity screen
    When I press back in Main Activity
    Then I should exit the app

  Scenario: User should navigate to screen 2 when pressing button 2 in main screen
    Given The app started
    And I see Main Activity screen
    When I press button 2 in Main Activity
    Then I should navigate to screen 2

  Scenario: User should navigate to screen 3 when pressing button 3 in main screen
    Given The app started
    And I see Main Activity screen
    When I press button 3 in Main Activity
    Then I should navigate to screen 3

  Scenario: User should navigate to screen 4 when pressing button 4 in main screen
    Given The app started
    And I see Main Activity screen
    When I press button 4 in Main Activity
    Then I should navigate to screen 4
