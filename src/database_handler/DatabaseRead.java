package database_handler;

/*
	This interface holds the blue prints for reading an object to a database
*/

public interface DatabaseRead {
	public void connectToDatabase();
	public void closeDatabaseConnection();
	public void readDatabase();
}
