@Pin
Feature: Yo como usuario quiero validar todas las funcionalides de pin

  @HU002 @Regresion
  Scenario Outline: add employer
    Given open the browser
    And the user fill out user <userName> password <password>
    And the user select option add employed
    When the user out first name <firstName> middle <middleName> lastName <lastName>
    Then the user validate create <firstName> <lastName>



    Examples:
      | userName | password | firstName | middleName | lastName |
      | Admin    | admin123 | Pablo     | Andres     | Padilla  |
