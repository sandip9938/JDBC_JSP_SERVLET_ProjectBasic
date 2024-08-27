package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_P8 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB",
					"sandip");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
