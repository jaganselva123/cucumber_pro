package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\Jegan\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\properties\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String geturl() throws Throwable {

		String url = p.getProperty("url");

		return url;

	}

	public String getUsername() throws IOException {

		String username = p.getProperty("username");

		return username;

	}

	public String getPassword() throws IOException {

		String password = p.getProperty("password");

		return password;

	}

	public String getfirstname() {

		String firstname = p.getProperty("firstname");

		return firstname;
	}

	public String getlastname() {

		String lastname = p.getProperty("lastname");

		return lastname;

	}

	public String getAddress() {

		String address = p.getProperty("address");

		return address;
	}

	public String getccnum() {

		String ccnum = p.getProperty("ccnum");

		return ccnum;
	}

	public String getcvv() {

		String cvv = p.getProperty("cvv");

		return cvv;
	}

}
