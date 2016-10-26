package database_handler;

/*
	This interface holds the blue prints for deleting a database
*/

public interface DatabaseDelete {
	public void connectToDatabase();
	public void closeDatabaseConnection();
	public void deleteDatabase();
}
