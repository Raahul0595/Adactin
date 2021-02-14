Feature: Login functionality for Adactin application 

Scenario: User enters username and password 
	Given User launches the application 
	When User enters "Raahul0595" as username 
	And User enters "Raahul@05051995" as password 
	Then User verifies the valid username and password 
	
	
Scenario: User searches the hotel
	Given User searches the hotel 
	When User selects the location as "New York" 
	And User selects the hotel as "Hotel Sunshine" 
	And User selects the room type as "Deluxe" 
	And User selects the number of rooms as "2 - Two" 
	And User enters the check in date as "18/02/2021" 	
	And User enters the check out date as "22/02/2021" 
	And User selects the adults per room
	And User selects the children per room 
	Then User finalizes everything and gives search 
	
	
Scenario: User selects the hotel
    Given User selects the hotel
    When User chooses the selected hotel
    And User Chooses the hotel and clicks it
    Then User gives continue
    
    
Scenario: User books the hotel
    Given User books the hotel
    When User enters "Raahul" as first name
    And User enters "TJ" as last name
    And User enters Billing address as "47B, MGR Nagar, 5th main road, Velachery, Chennai-600042"
    And User enters Credit card number as "4578485625456258"
    And User selects the credit card type
    And User selects the expiry month of the credit card
    And User selects the expiry year of the credit card
    And User enters the CVV number as "147"
    Then User finalizes everything and gives book now
    
Scenario: User logs out from the site
    Given User logs out from the site
    When User logs out from the hotel booking app
    And User clicks log out button
    Then User comes out from the app
