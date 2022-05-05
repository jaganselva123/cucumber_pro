$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking The Hotel Booking Functionality Of An Adactin Application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cusername\u003e\" In The Username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;1"
    },
    {
      "cells": [
        "abc",
        "123"
      ],
      "line": 11,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;2"
    },
    {
      "cells": [
        "xyz",
        "7654"
      ],
      "line": 12,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;3"
    },
    {
      "cells": [
        "jaganselva123",
        "Vennila@1995"
      ],
      "line": 13,
      "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8043200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"abc\" In The Username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"123\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 8430435900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_field(String)"
});
formatter.result({
  "duration": 202993500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 179478900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 451551800,
  "status": "passed"
});
formatter.after({
  "duration": 359300,
  "status": "passed"
});
formatter.before({
  "duration": 107300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"xyz\" In The Username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"7654\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 337386900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_field(String)"
});
formatter.result({
  "duration": 117608000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7654",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 101133900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 498543500,
  "status": "passed"
});
formatter.after({
  "duration": 227600,
  "status": "passed"
});
formatter.before({
  "duration": 165800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"jaganselva123\" In The Username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Vennila@1995\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 338682800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jaganselva123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Username_field(String)"
});
formatter.result({
  "duration": 141934300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vennila@1995",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 98102100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1057101100,
  "status": "passed"
});
formatter.after({
  "duration": 361200,
  "status": "passed"
});
formatter.before({
  "duration": 264400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user Select The Location In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Select The Hotel In The Hotel field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The Room In The Room Type field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Number In The Number of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Number In The Adults per Room Filed",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number In The Children per Room Filed",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Click The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Location_In_The_Location_Field()"
});
formatter.result({
  "duration": 189887200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_In_The_Hotel_field()"
});
formatter.result({
  "duration": 145960300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_In_The_Room_Type_field()"
});
formatter.result({
  "duration": 189602100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_In_The_Number_of_Rooms_Field()"
});
formatter.result({
  "duration": 156831100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_In_The_Adults_per_Room_Filed()"
});
formatter.result({
  "duration": 149858300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_In_The_Children_per_Room_Filed()"
});
formatter.result({
  "duration": 137131100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 739979200,
  "status": "passed"
});
formatter.after({
  "duration": 113200,
  "status": "passed"
});
formatter.before({
  "duration": 137700,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user Click The Radio Button Of Hotel Sunshine",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Click THe Continue Button And It Navigates To The Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Radio_Button_Of_Hotel_Sunshine()"
});
formatter.result({
  "duration": 58883900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_THe_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 735884600,
  "status": "passed"
});
formatter.after({
  "duration": 259200,
  "status": "passed"
});
formatter.before({
  "duration": 146100,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Search Book A Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adactin-application;search-book-a-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "user Enter The firstname In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Enter The lastname In The Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter The address In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter The ccnum In THe Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select The Credit Card Type In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The Month In The Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The Year In The Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The cvv In The CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Click The Book Now Button And It Navigates To The Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_firstname_In_The_First_Name_Field()"
});
formatter.result({
  "duration": 100565700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_lastname_In_The_Last_Name_Field()"
});
formatter.result({
  "duration": 109892100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_address_In_The_Billing_Address_Field()"
});
formatter.result({
  "duration": 88037000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_ccnum_In_THe_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 123992800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 214416500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Month_In_The_Expiry_Date_Field()"
});
formatter.result({
  "duration": 153365900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Year_In_The_Expiry_Date_Field()"
});
formatter.result({
  "duration": 211715700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_cvv_In_The_CVV_Number_Field()"
});
formatter.result({
  "duration": 146213500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Logout_Page()"
});
formatter.result({
  "duration": 89597000,
  "status": "passed"
});
formatter.after({
  "duration": 430700,
  "status": "passed"
});
});