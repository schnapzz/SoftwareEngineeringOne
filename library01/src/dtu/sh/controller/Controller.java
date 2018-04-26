package dtu.sh.controller;

import javax.swing.JFrame;

import dtu.sh.main.LoggedIn;
import dtu.sh.main.Main;
import dtu.sh.model.SH;

public class Controller {
	private JFrame frame;
	private LoggedIn loginWindow;
	private Main mainWindow;
	private SH sh;
	
	public Controller() {
		this.loginWindow = new LoggedIn();
		this.mainWindow = new Main();
	}
	
//	public Controller(SH sh) {
//		this.loginWindow = new LoggedIn();
//		this.mainWindow = new Main();
//		this.sh = sh;
//	}
	
//	public void login(){
//		frame.dispose();
//		LoggedIn log = new LoggedIn();
//		log.setVisible(true);
//	}

	public void login() {
		// TODO Auto-generated method stub
		frame.dispose();
		LoggedIn log = new LoggedIn();
		log.setVisible(true);
		//sh.logInEmployee(username);
	}

	
	
}
