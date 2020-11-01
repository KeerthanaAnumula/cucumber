Feature:Amazon Login
  Scenario: Verify the login functionality of amazon login page
    Given I enter Valid username.I click on continue.I enter valid password
    When I click on login
    Then I verify the account is looged in succesfully
    And close browser.