package com.properties;

public class File_Reader_Manager {

	private File_Reader_Manager() {

		// we can't create object in another class

	}

	// static method
	public static File_Reader_Manager getInstanceFRM() {

		File_Reader_Manager frm = new File_Reader_Manager();

		return frm;

	}

	// non static method
	public Configuration_Reader getInstanceCR() throws Throwable {

		Configuration_Reader cr = new Configuration_Reader();

		return cr;

	}

}
