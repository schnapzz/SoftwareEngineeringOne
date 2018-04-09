package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class SH {
	private static String loggedInEmployee;
	private static List<Employee> employees = new ArrayList<>();

	public static Boolean isEmployeed(String username) {
		Boolean isEmployed = false;
		for (Employee e: employees) {
			if (e.getID().equals(username)) {
				isEmployed = true;
			}
		}
		return isEmployed;
	}

	public static void loginEmployee(String username) {
		loggedInEmployee = username;
		
	}
	
	
	
	
	
	
	
}
