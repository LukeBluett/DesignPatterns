package database_handler;

/*
	This class is an interface for holding the blue prints of connecting to the Database
	and executing the database command	

*/

public interface DatabaseConnections {
	public void connectToDatabase();
	public void closeDatabase();
}


