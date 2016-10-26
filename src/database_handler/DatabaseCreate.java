package database_handler;

/*
	This class is an interface that has the blueprints for inserting 
	information into databases
*/

public interface DatabaseCreate {
	public void connectToDatabase();
	public void closeDatabaseConnection();
	public void createDatabase();
}


