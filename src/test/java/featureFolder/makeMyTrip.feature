Feature: Testing For MakeMyTrip Website

  Scenario Outline:Book Cheapest Bus In MakeMyTrip
    Given Enter The URL
    Then Click The Buses Menu
    Then Enter Pickup Location "<PickUp>"
    Then Enter DropTo Location "<DropTo>"
    And Select Date And Search The Buses
    Then Filter The Buses
    Then Click Cheapest And Get The Lowest Price Bus
    And Click Select Seat
    Then Select Any Berth to Reserve The Seat And Click Continue
    Then Enter The Traveller Details "<Name>" "<Age>" "<Email Id>" "<Mobile Number>"
    And Click Continue To Payment Page
    Examples:
      | PickUp  | DropTo    | Name | Age | Email Id              | Mobile Number |
      | Chennai | Bangalore | Raji | 27  | rajeswari67@gmail.com | 7865975868    |

