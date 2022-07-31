# Autor: Alejandro Betancur

  @stories
  Feature: Register in uTest
    I am a user, I want to register on the uTest platform.
  @scenario1
  Scenario: Register for Alejandro in uTest page.
    Given than Alejandro wants to register in utest
    When the user enters the required data
      | strFirstName | strLastName | strEmail                 | strBirthMonth | strBirthDay | strBirthYear | strCity  | strZip | strCountry | strBrand | strModel        | strOS         | strPassword  |
      | Alejandro    | Betancur    | alejobetancur2@gmail.com | June          | 2           | 1991         | Medellín | 050047 | Colombia   | Samsung  | Galaxy Note 10  | Android 12    | AleJo345216* |
    Then registration is completed
      | strCompleteSetup |
      | Complete Setup   |