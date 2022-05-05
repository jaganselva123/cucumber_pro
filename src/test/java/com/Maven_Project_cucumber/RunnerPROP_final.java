package com.Maven_Project_cucumber;

import org.openqa.selenium.WebDriver;

import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class RunnerPROP_final extends BaseClass {
	
	
public static WebDriver driver = browserLaunch("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		
		launchUrl(url);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();	

		passInput(pom.getInstanceLogin().getUsername(),username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();

		passInput(pom.getInstanceLogin().getPassword(), password);
		
		clickOnElement(pom.getInstanceLogin().getLogin());
		
		
		//second page
		
		dropdown1(pom.getInstanceLogin().getLocation(),"Los Angeles");
		dropdown1(pom.getInstanceLogin().getHotels(), "Hotel Sunshine");
		dropdown1(pom.getInstanceLogin().getRoom_type(), "Super Deluxe");
		dropdown1(pom.getInstanceLogin().getRoom_nos(), "3 - Three");
		dropdown1(pom.getInstanceLogin().getAdult_room(), "2 - Two");
		dropdown1(pom.getInstanceLogin().getChild_room(), "1 - One");
		clickOnElement(pom.getInstanceLogin().getSubmit());
		
		
		//third page
		
		clickOnElement(pom.getInstanceLogin().getButton());
		clickOnElement(pom.getInstanceLogin().getNextcontinue());
		
		//final page
		
		String fn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirstname();
		passInput(pom.getInstanceLogin().getFirst_name(), fn);
		
		String ln = File_Reader_Manager.getInstanceFRM().getInstanceCR().getlastname();
		passInput(pom.getInstanceLogin().getLast_name(), ln);
		
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceLogin().getAddress(), address);
		
		String getccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getccnum();
		passInput(pom.getInstanceLogin().getCc_num(), getccnum);
		
		dropdown1(pom.getInstanceLogin().getCc_type(), "VISA");
		dropdown1(pom.getInstanceLogin().getCc_exp_month(), "September");
		dropdown1(pom.getInstanceLogin().getCc_exp_year(), "2022");
		
		String getcvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcvv();
		passInput(pom.getInstanceLogin().getCc_cvv(), getcvv);
		
		clickOnElement(pom.getInstanceLogin().getBook_now());
		
		implicitWaitMethod(3000);
		
		screenshotMethod("C:\\Users\\Jegan\\eclipse-workspace\\Maven_Project_cucumber\\Screenshot\\Adactin.png");
		
		
		clickOnElement(pom.getInstanceLogin().getLogout());
		
	}

}
