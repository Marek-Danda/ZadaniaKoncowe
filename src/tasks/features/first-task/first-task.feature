Feature: FirstTask

 // Scenario: user can add new address

    Scenario Outline: user can add new address
      Given user at main page
      When user login to his account dklwo@xyz.aa, zdt369
      And user add new address <alias>, <address>, <city>, <postal_code>, <phone> is entered in input fields
      Then address fields  should contain <expectedAlias>, <expectedAddress>, <expectedCity>, <expectedPostal_code>, <expectedPhone>

      Examples:
      |alias|expectedAlias|address|expectedAddress|city|expectedCity|postal_code|expectedPostal_code|phone|expectedPhone|
      |tt   |tt           |prosta4|prosta4        |londek|londek    |123-45         |123-45                 |987654321|987654321|