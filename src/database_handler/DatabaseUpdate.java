package database_handler;

/*
	This interface has the blue prints for updating a database
*/

public interface DatabaseUpdate {
	public void connectToDatabase();
	public void closeDatabaseConnection();
	public void updateDatabase();
}
