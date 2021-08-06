#Autor: Eduardo Dudley
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @Scenario1
  Scenario: Search for automation course
    Given than Eduardo wants to learn automation
      |strUser|strPassword  |
      |8920232|Choucair2021*|
    When he search for the course Analista Financial
    Then he finds the course Cap. 5 - Identificar y Mapear
