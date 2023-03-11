#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: BMI computation
As a user I want to calculate my BMI so that I will know if I have a healthy weight.

  @tag1
  Scenario Outline: The weight is invalid
    Given I have a bmi calculator
    When I input an invalid weight equal to <n>
    And I input a height equal to <h>
		And I calculate the bmi of an invalid value
    Then The calculator throws an exception
    
    Examples:
    |n|h|
    |0.0|1.6|
    |-1.0|1.8|
    |-70.0|1.99|
    |800.01|2.2|

  @tag2
  Scenario Outline: The height is invalid
    Given I have a bmi calculator
    When I input an invalid height equal to <n>
    And I input a weight equal to <w>
		And I calculate the bmi of an invalid value
    Then The calculator throws an exception

    Examples: 
      | n |w|
      | 0.0 | 70.42|
      | -1.0 |65.3|
      |3.01|100.0|
      |-1.72|45.0|
      |5.0|98.0|
   
   @tag3
   Scenario Outline: Both input values are correct
   Given I have a bmi calculator
   When I input a weight equal to <w> 
   And I input a height equal to <h>
   And I calculate the bmi
   Then The calculator returns <v>
   
   Examples: 
   |w|h|v|
   |65.0|1.6|25.390625|
   |70.0|1.85|20.4528853|
