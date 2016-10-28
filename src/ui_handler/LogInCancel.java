//package ui_handler;

/*
	A class for cancelling the login form
*/

public class LogInCancel {
	private ControllerGUI logIn;

	public LogInCancel(ControllerGUI logIn) {
		this.logIn = logIn;
	}

	public void execute() {
		logIn.cancelForm();
	}
}
