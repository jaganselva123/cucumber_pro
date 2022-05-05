Feature: Checking The Hotel Booking Functionality Of An Adactin Application

Scenario Outline: Login Functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username field 
And user Enter The "<password>" In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|abc|123|
|xyz|7654|
|jaganselva123|Vennila@1995|

Scenario: Search Hotel Functionality
When user Select The Location In The Location Field
And user Select The Hotel In The Hotel field
And user Select The Room In The Room Type field
And user Select The Number In The Number of Rooms Field
And user Select The Number In The Adults per Room Filed
And user Select The Number In The Children per Room Filed
Then user Click The Search Button And It Navigates To The Select Hotel Page

Scenario: Select Hotel Functionality
When user Click The Radio Button Of Hotel Sunshine
Then user Click THe Continue Button And It Navigates To The Book A Hotel Page

Scenario: Search Book A Hotel Functionality
When user Enter The firstname In The First Name Field
And user Enter The lastname In The Last Name Field
And user Enter The address In The Billing Address Field 
And user Enter The ccnum In THe Credit Card Number Field
And user Select The Credit Card Type In The Credit Card Type Field
And user Select The Month In The Expiry Date Field
And user Select The Year In The Expiry Date Field
And user Enter The cvv In The CVV Number Field
Then user Click The Book Now Button And It Navigates To The Logout Page