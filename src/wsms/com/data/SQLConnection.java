package wsms.com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	
	public static Connection DbConnector() {
		try {
			java.sql.Connection conn = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/kusakidb?useSSL=false", "root", "root");
			return conn;
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
