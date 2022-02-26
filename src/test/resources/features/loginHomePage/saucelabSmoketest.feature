@Smoketest
Feature: User access and checkout

  Scenario: user navigates to homepage
    Given open browser
    And user send keys to login
    When user send keys to password
    Then user clicks login

  
  Scenario: User completes a purchase successfully
    Given user navigates to saucelabs application
    When user enters username
    And user enters password
    And user clicks login
    When user selects an item
    Then navigate to cart for checkout
    And clicks checkout
    Then enters first name
    Then enters last name
    And user enters valid postal code
    And clicks continue
    Then clicks finish
    Then user should see success message

    
    
     Scenario Outline: User complete a purchase successfully
    Given user navigates to saucelabs application
    Then validate expected title as basic user
    When user enters valid username "<username>" as basic user
    And user enter "<password>" user password 
    And user clicks login
    When user selects a red tshirt
    And navigate to cart from redtshirt product page
    Then click checkout on your product page
    Then enters "<first_name>" first name on contact info page
    Then enters last name "<last_name>"
    And user enters vaild "<zip code>" postal code
    And clicks continue
    Then clicks finish
    Then user should see success message 
    
    Examples:
    |username     |password     |first_name     |last_name    |
    |standard_user|secret_sauce |firstnamevalue |lastnamevalue|
    
    
    
    
    