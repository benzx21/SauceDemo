Feature: Login

  @LoginTest

  Scenario Outline: Testing the logon
    Given As a user i launch the sauce demo webpage
    And   I enter"<username>"
    And   I type "<password>"
    And   I click logon
    And   I add the cheapest product
    And   I add the second costliest product
    And   I click cart
    And   I click checkout
    And   I enter the "<firstname>"
    And   I entered the "<lastname>"
    And   I type the "<postalcode>"
    And   I click continue
    And   I click finish
    And   I verify the "<lastpage>"




    Examples:
      | username    |password    |firstname|lastname|postalcode|lastpage                |
      |standard_user|secret_sauce| Takura  | Marlon  | MK78Lr  |THANK YOU FOR YOUR ORDER|