// package loan_handler;
/*
	This class handles the interactions between the database package and the loan package
 */

public class LoanDatabaseProxy {
	
	private Account account;

	public LoanDatabaseProxy() {
	
	}

	public void setAccount(Account account) {
		
	}

	public Account getAccountById(int id) {
		// Check if account exists with that id
		boolean validAccountid;
		Account account;
		if (validAccountid) {
			return account;
		} else {
			return null;
		}
	}
}
