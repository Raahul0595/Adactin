Feature: Edit event for React application

Scenario: User logs in to the homepage
    Given User launches the application
    When User enters "qa+attd@reach24.net" as username
    And User enters "welcome123" as password
    Then User verfies the valid username and password

Scenario: User is editing the event for React application 
	Given User selects the Equipment type
	When User enters Chasis number as "BEST561255" 
	And User enters Equipment provider as "1066480 BC LTD"
	And User enters Vehicle type and color as "Blue"
	And User selects the departed terminals
	And User enters the departed date as "03/10/2021 7:00 PM"
	And User enters the associated power unit as "Tractor"
	And User enters the associated container as "Container"
	And User enters the Unit available as "3/10/2021 7:00 PM"
	And User selects the Driver
	And User selects the Unit
	And User selects the location type as "Roadside"
	And User enters the repair time as "3/10/2021 7:00 PM"
	And User ticks the loaded field
	And User enters the address as "Velachery, Chennai, Tamil Nadu, India"
	And User enters the breakdown location notes as "AAAA"
	And User enters the Reported by "Raahul"
	And User enters the phone number as "1234567890"
	Then User verifies all the details and clicks save 