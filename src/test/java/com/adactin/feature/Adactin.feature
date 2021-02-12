Feature: Login functionality for Adactin application 

Scenario: User enters username and password 
	Given User launches the application 
	When User enters "Raahul0595" as username 
	And User enters "Raahul@05051995" as password 
	Then User verifies the valid username and password 
	
	
Scenario: User selects the preferred location, hotel, room type, number of rooms, check in date, check out date, adults per room and children per room
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
	
