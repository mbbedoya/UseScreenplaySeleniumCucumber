@Feature1
Feature: savings simulator of car and motorcycle bancolombia's web page 
I as customer, need that form's savings simulator, was working right for can know my savings and investment plan

Background: find the form Bancolombia's savings and investment simulator
Given User is on form Bancolombia's savings and investment simulator
  
@Scenario1
Scenario: empty form
When User is on form Bancolombia's savings and investment simulator without fill it any field
Then check that each form's field show a message the "field is obligatory" and button is disabled

@Scenario2
Scenario: check the elements form's field why do you want to savings?
When user has got form's fields  why do you want to savings
Then check that are found  the amount and names of the elements of such field are right 

@Scenario3
Scenario: without error message
When user have entered one correct data on form's field "why do you want to savings"
Then form's field "why do you want to savings" don't show error message

@Scenario4
Scenario: check funtionatilly form 
When user have type one correct data on form's field "how many months would  you like reach your goal"
Then form's field "how many months would  you like reach your goal" won't show error message

@Scenario5
Scenario: fully form's elements
When user had typing one correct data on form's field "select product"
Then form's field "select product" would haven't error message 
