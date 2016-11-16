/*
	This java class handles the starting up of the application and the 
	interactions between different packages 
*/

public class LoanDriver {
	public static void main(String[] args) {
		//StartGUI
		//AddactionListeners to login
	}

	public static void loginStart() {
		//get the single instance of the Login Gui
		//and set visible
	}

	public static void loginAddActionListeners() {
		//add action listeners to all buttons in the login gui
	}

	public static void mainGuiStart() {
		//get the single instance of the Login Gui
		//and set Visible
	}

	public static void mainGuiAddActionListeners() {
		//add action listeners to all buttons in the main gui
	}

	public static String getTextFromTextfield(JTextField textfield) {
		return textfield.getText();
	}

	public static DAO getDatabaseObject(DAO dao) {
		//Retrieve a database object based on the dao given
	}

	public static void setDatabase(String username) {
		//set a database object based on the username given
	}

	public static void makeLoan(LoanType loan) {
		//Make a loan based on the loan type specified
	}

	public static void assessRisk(DAO daoOfClient, LoanType loan) {
		//Send clients information to risk assessment handler to verify they are 
		//able to get a loan based off of certain criteria
	}

	public static void registerForFeedback(DAO person, String email, String address, String phoneNumber) {
		//Add client to feedback handler package after they have signed up for a loan
	}
}
