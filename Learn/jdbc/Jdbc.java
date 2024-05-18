package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
		
		/*to connect the java program with database -> 
		 * Register the Driver with Driver manager.
		 * */
		try {
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		/*Establish the connection by using getConnection method
		 * of Connection interface.
		 * */
		Connection c = null;
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","nikhil@630");
			System.out.println(c);
			
			//now we get the object of statement;
			Statement statement = c.createStatement();
			//now we can insert,update or delete data using statement object.
			int i=statement.executeUpdate("insert into student values(3, 'Shyam', 20)");
			System.out.println(i);
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		//close the connection;
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
