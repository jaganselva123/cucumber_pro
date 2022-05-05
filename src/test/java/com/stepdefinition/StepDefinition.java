package com.stepdefinition;

import java.io.IOException;

import com.Maven_Project_cucumber.BaseClass;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario name :" + name);
	}
	@After
	public void afterHooks(Scenario s) throws IOException {
		String status = s.getStatus();
		System.out.println("Scenario status :" + status);
		
		
		if (s.isFailed()) {
			
			screenshotMethod("C:\\Users\\Jegan\\eclipse-workspace\\Maven_Project_cucumber\\Screenshot\\Adactin.png");
			
		}

	}
	
	//login page
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		
		launchUrl(url);
	   
	}
	@When("^user Enter The \"([^\"]*)\" In The Username field$")
	public void user_Enter_The_In_The_Username_field(String username) throws Throwable {
	    
		passInput(pom.getInstanceLogin().getUsername(), username);
	}
	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
	    
		passInput(pom.getInstanceLogin().getPassword(), password);
	}


	@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	   
		clickOnElement(pom.getInstanceLogin().getLogin());
	}

	//second page
	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
	  
		dropdown1(pom.getInstanceLogin().getLocation(),"Los Angeles");
	}

	@When("^user Select The Hotel In The Hotel field$")
	public void user_Select_The_Hotel_In_The_Hotel_field() throws Throwable {
		
		dropdown1(pom.getInstanceLogin().getHotels(), "Hotel Sunshine");
	    
	}

	@When("^user Select The Room In The Room Type field$")
	public void user_Select_The_Room_In_The_Room_Type_field() throws Throwable {
		
		dropdown1(pom.getInstanceLogin().getRoom_type(), "Super Deluxe");
	   
	}

	@When("^user Select The Number In The Number of Rooms Field$")
	public void user_Select_The_Number_In_The_Number_of_Rooms_Field() throws Throwable {
		
		dropdown1(pom.getInstanceLogin().getRoom_nos(), "3 - Three");
	
	}

	@When("^user Select The Number In The Adults per Room Filed$")
	public void user_Select_The_Number_In_The_Adults_per_Room_Filed() throws Throwable {
		
		dropdown1(pom.getInstanceLogin().getAdult_room(), "2 - Two");
	  
	}

	@When("^user Select The Number In The Children per Room Filed$")
	public void user_Select_The_Number_In_The_Children_per_Room_Filed() throws Throwable {
		
		dropdown1(pom.getInstanceLogin().getChild_room(), "1 - One");
	  
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		
		clickOnElement(pom.getInstanceLogin().getSubmit());
	  
	}

	//third page
	@When("^user Click The Radio Button Of Hotel Sunshine$")
	public void user_Click_The_Radio_Button_Of_Hotel_Sunshine() throws Throwable {
		
		clickOnElement(pom.getInstanceLogin().getButton());
	
	}

	@Then("^user Click THe Continue Button And It Navigates To The Book A Hotel Page$")
	public void user_Click_THe_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
		
		clickOnElement(pom.getInstanceLogin().getNextcontinue());
	   
	}

	
	//final page
	@When("^user Enter The firstname In The First Name Field$")
	public void user_Enter_The_firstname_In_The_First_Name_Field() throws Throwable {
		
		String fn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirstname();
		passInput(pom.getInstanceLogin().getFirst_name(), fn);
	
	}

	@When("^user Enter The lastname In The Last Name Field$")
	public void user_Enter_The_lastname_In_The_Last_Name_Field() throws Throwable {
		
		String ln = File_Reader_Manager.getInstanceFRM().getInstanceCR().getlastname();
		passInput(pom.getInstanceLogin().getLast_name(), ln);
	 
	}

	@When("^user Enter The address In The Billing Address Field$")
	public void user_Enter_The_address_In_The_Billing_Address_Field() throws Throwable {
		
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceLogin().getAddress(), address);
	
	}

	@When("^user Enter The ccnum In THe Credit Card Number Field$")
	public void user_Enter_The_ccnum_In_THe_Credit_Card_Number_Field() throws Throwable {
		
		String getccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getccnum();
		passInput(pom.getInstanceLogin().getCc_num(), getccnum);
	   
	}

	@When("^user Select The Credit Card Type In The Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
		
		dropdown1(pom.getInstanceLogin().getCc_type(), "VISA");
	  
	}

	@When("^user Select The Month In The Expiry Date Field$")
	public void user_Select_The_Month_In_The_Expiry_Date_Field() throws Throwable {

		dropdown1(pom.getInstanceLogin().getCc_exp_month(), "September");
	}

	@When("^user Select The Year In The Expiry Date Field$")
	public void user_Select_The_Year_In_The_Expiry_Date_Field() throws Throwable {
		
		dropdown1(pom.getInstanceLogin().getCc_exp_year(), "2022");
	 
	}

	@When("^user Enter The cvv In The CVV Number Field$")
	public void user_Enter_The_cvv_In_The_CVV_Number_Field() throws Throwable {
		
		String getcvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcvv();
		passInput(pom.getInstanceLogin().getCc_cvv(), getcvv);
	  
	}

	@Then("^user Click The Book Now Button And It Navigates To The Logout Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
		
		clickOnElement(pom.getInstanceLogin().getBook_now());
	   
	}

}
