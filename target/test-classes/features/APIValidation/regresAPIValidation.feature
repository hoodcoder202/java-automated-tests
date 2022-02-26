




Scenario: Verify api request as expect PUT Request
     Given I submit a post request
     And post request is accepted by server and returns 201 status code
     Then I should be able to validate post request



@API_Validation
#Create and delete repository
  Scenario Outline: verify Create Repo API
    Given Starting Test Case "Verify Create Repo API"
    Given Create Repo Payload name "<name>" amd description "<description>"
    When User calls Create API "/users/2" Post API Call
    Then API Call got Successful with Status Code 201
    And Verify Repository "name" is "<name>"
    And Verify Repository "description" is "<description>"
    And Ending TestCase
    
    Examples: 
      | name        | description                     |
      | descOne     | This is Data Driven Test Repo 1 |
      | kevin       | This is Data Driven Test Repo 2 |
      | winner      | This is Data Driven Test Repo 3 |
	
  Scenario Outline: Verify Delete Repo API
    Given Starting Test Case "Verify Delete Repo API"
    Given Create Repo Payload name "<name>" amd description "<description>"
    When User calls Delete API "/users/2" Delete Call
    Then API Call got Successful with Status Code 204
    And Ending TestCase
    
    Examples: 
      | name            | description                     |
      | kevinExample    | This is Data Driven Test Repo 1 |
      | kevin           | This is Data Driven Test Repo 2 |
      | ScottExample    | This is Data Driven Test Repo 3 |
