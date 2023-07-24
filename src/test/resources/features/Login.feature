#Proyecto de pruebas y cargado en Github
#27/01/2020
#Pablo Padilla
Feature: Yo como usuario quiero validar el Login

  @HU001 @Regresion
  Scenario Outline: Login exitoso
    Given open the browser
    When the user fill out user <userName> password <password>


    Examples:
      | userName |password|
      | Admin    |admin123|
