package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	private DBConnection () {}
	
	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Anhee");
		
	}
}
