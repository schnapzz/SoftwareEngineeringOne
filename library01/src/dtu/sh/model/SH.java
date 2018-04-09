package dtu.sh.model;

import java.util.ArrayList;
import java.util.List;

public class SH {
	private static String loggedInEmployee;
	private static List<Employee> employees = new ArrayList<>();
	
	
	
	//Helena
	public static Boolean isEmployeed(String username) {
		for (Employee e: employees) {
			if (e.getID().equals(username)) {
				return true;
			}
		}
		return false;
		//throw new OperationNotAllowedException("Wrong username, try again");
	}
	
	public static boolean isValidUsername(String username) {
		if (username.length() == 4) {
			return true;
		}
		else return false;
	}

	public static void logInEmployee(String username) {
		loggedInEmployee = username;
		
	}
	
	public static String getLoggedInEmployee() {
		return loggedInEmployee;
	}
	
	
	
	
	
}
