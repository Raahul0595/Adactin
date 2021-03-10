$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality for Adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enters username and password",
  "description": "",
  "id": "login-functionality-for-adactin-application;user-enters-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"Raahul0595\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Raahul@05051995\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User verifies the valid username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 8146323400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raahul0595",
      "offset": 13
    }
  ],
  "location": "LoginStepdefinition.user_enters_as_username(String)"
});
formatter.result({
  "duration": 2294519600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raahul@05051995",
      "offset": 13
    }
  ],
  "location": "LoginStepdefinition.user_enters_as_password(String)"
});
formatter.result({
  "duration": 405641800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefinition.user_verifies_the_valid_username_and_password()"
});
formatter.result({
  "duration": 4159194200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User searches the hotel",
  "description": "",
  "id": "login-functionality-for-adactin-application;user-searches-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User searches the hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User selects the location as \"New York\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User selects the hotel as \"Hotel Sunshine\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects the room type as \"Deluxe\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User selects the number of rooms as \"2 - Two\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters the check in date as \"18/02/2021\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters the check out date as \"22/02/2021\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User selects the adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User selects the children per room",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User finalizes everything and gives search",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotel_Stepdefinition.user_searches_the_hotel()"
});
formatter.result({
  "duration": 215900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 30
    }
  ],
  "location": "SearchHotel_Stepdefinition.user_selects_the_location_as(String)"
});
formatter.result({
  "duration": 1334651900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 27
    }
  ],
  "location": "SearchHotel_Stepdefinition.user_selects_the_hotel_as(String)"
});
formatter.result({
  "duration": 346565600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deluxe",
      "offset": 31
    }
  ],
  "location": "SearchHotel_Stepdefinition.user_selects_the_room_type_as(String)"
});
formatter.result({
  "duration": 332415900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 37
    }
  ],
  "location": "SearchHotel_Stepdefinition.user_selects_the_number_of_rooms_as(String)"
});
formatter.result({
  "duration": 296426600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "18/02/2021",
      "offset": 34
    }
  ],
  "location": "SearchHotel_Stepdefinition.user_enters_the_check_in_date_as(String)"
});
formatter.result({
  "duration": 671374800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22/02/2021",
      "offset": 35
    }
  ],
  "location": "SearchHotel_Stepdefinition.user_enters_the_check_out_date_as(String)"
});
formatter.result({
  "duration": 381516200,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotel_Stepdefinition.user_selects_the_adults_per_room()"
});
formatter.result({
  "duration": 3615492500,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotel_Stepdefinition.user_selects_the_children_per_room()"
});
formatter.result({
  "duration": 321802000,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotel_Stepdefinition.user_finalizes_everything_and_gives_search()"
});
formatter.result({
  "duration": 1505644000,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User selects the hotel",
  "description": "",
  "id": "login-functionality-for-adactin-application;user-selects-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User selects the hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User chooses the selected hotel",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User Chooses the hotel and clicks it",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User gives continue",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectHotel_Stepdefinition.user_selects_the_hotel()"
});
formatter.result({
  "duration": 115900,
  "status": "passed"
});
formatter.match({
  "location": "SelectHotel_Stepdefinition.user_chooses_the_selected_hotel()"
});
formatter.result({
  "duration": 77100,
  "status": "passed"
});
formatter.match({
  "location": "SelectHotel_Stepdefinition.user_Chooses_the_hotel_and_clicks_it()"
});
formatter.result({
  "duration": 311499700,
  "status": "passed"
});
formatter.match({
  "location": "SelectHotel_Stepdefinition.user_gives_continue()"
});
formatter.result({
  "duration": 1286382600,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "User books the hotel",
  "description": "",
  "id": "login-functionality-for-adactin-application;user-books-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "User books the hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "User enters \"Raahul\" as first name",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User enters \"TJ\" as last name",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User enters Billing address as \"47B, MGR Nagar, 5th main road, Velachery, Chennai-600042\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enters Credit card number as \"4578485625456258\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User selects the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User selects the expiry month of the credit card",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User selects the expiry year of the credit card",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User enters the CVV number as \"147\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User finalizes everything and gives book now",
  "keyword": "Then "
});
formatter.match({
  "location": "BookHotel_Stepdefinition.user_books_the_hotel()"
});
formatter.result({
  "duration": 152000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raahul",
      "offset": 13
    }
  ],
  "location": "BookHotel_Stepdefinition.user_enters_as_first_name(String)"
});
formatter.result({
  "duration": 236996500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TJ",
      "offset": 13
    }
  ],
  "location": "BookHotel_Stepdefinition.user_enters_as_last_name(String)"
});
formatter.result({
  "duration": 237061100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "47B, MGR Nagar, 5th main road, Velachery, Chennai-600042",
      "offset": 32
    }
  ],
  "location": "BookHotel_Stepdefinition.user_enters_Billing_address_as(String)"
});
formatter.result({
  "duration": 404041600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4578485625456258",
      "offset": 35
    }
  ],
  "location": "BookHotel_Stepdefinition.user_enters_Credit_card_number_as(String)"
});
formatter.result({
  "duration": 159994600,
  "status": "passed"
});
formatter.match({
  "location": "BookHotel_Stepdefinition.user_selects_the_credit_card_type()"
});
formatter.result({
  "duration": 164150000,
  "status": "passed"
});
formatter.match({
  "location": "BookHotel_Stepdefinition.user_selects_the_expiry_month_of_the_credit_card()"
});
formatter.result({
  "duration": 176549000,
  "status": "passed"
});
formatter.match({
  "location": "BookHotel_Stepdefinition.user_selects_the_expiry_year_of_the_credit_card()"
});
formatter.result({
  "duration": 167408300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "147",
      "offset": 31
    }
  ],
  "location": "BookHotel_Stepdefinition.user_enters_the_CVV_number_as(String)"
});
formatter.result({
  "duration": 142267600,
  "status": "passed"
});
formatter.match({
  "location": "BookHotel_Stepdefinition.user_finalizes_everything_and_gives_book_now()"
});
formatter.result({
  "duration": 109316000,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "User logs out from the site",
  "description": "",
  "id": "login-functionality-for-adactin-application;user-logs-out-from-the-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "User logs out from the site",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "User logs out from the hotel booking app",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "User clicks log out button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User comes out from the app",
  "keyword": "Then "
});
formatter.match({
  "location": "Logout_Stepdefinition.user_logs_out_from_the_site()"
});
formatter.result({
  "duration": 121500,
  "status": "passed"
});
formatter.match({
  "location": "Logout_Stepdefinition.user_logs_out_from_the_hotel_booking_app()"
});
formatter.result({
  "duration": 25100,
  "status": "passed"
});
formatter.match({
  "location": "Logout_Stepdefinition.user_clicks_log_out_button()"
});
formatter.result({
  "duration": 6723797300,
  "status": "passed"
});
formatter.match({
  "location": "Logout_Stepdefinition.user_comes_out_from_the_app()"
});
formatter.result({
  "duration": 56500,
  "status": "passed"
});
});