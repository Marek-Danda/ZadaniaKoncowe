Feature: SecondTask

  Scenario: user can buy a chosen product
    Given user at main shop page
    When user login to his account dklwo@xyz.aa, zdt369
    And user select product size M and quantity 5
    And user select delivery and payment options
    Then user's order should be confirmed by text your order is confirmed
    And make a screenshot