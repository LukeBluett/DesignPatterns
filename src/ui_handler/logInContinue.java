//package ui_handler;

/*
	A class that executes the command for logging in
*/

public class logInContinue implements {
	private ControllerGUI logIn;

	public logInContinue(ControllerGUI logIn) {
		this.logIn = logIn;
	}

	public void execute() {
		logIn.continueForm();
	}
}
