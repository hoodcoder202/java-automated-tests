Feature: Database validation Clients
  I want to use this template for my feature file

  Background: 
    Given user connets to expected database

  @Smoketest_database 

  Scenario: Database validation on John column
    When user queries "Select * from Clients" Clients table for available John records

  Scenario: Database validation on Payment column
    When user queries "Select * from Clients" Clients table for available Payment records

  Scenario: Database validation on Purchase column
    When user queries "Select * from Clients" Clients table for available Purchase records
