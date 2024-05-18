package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionPro {
	
	private ConnectionPro(){}
	
	static Connection con=null;
	
	public synchronized static Connection getConnection() {
		
		if (con==null) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			try {con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","nikhil@630");
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return con;
		}else {
			return con;
		}
	}
}
