package JDBC;
// Showing Phone Number 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_P3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB",
					"sandip");
			Statement stmStatement = connection.createStatement();
			System.out.println("Enter ther User PhoneNo : ");
			long PHN = scanner.nextLong();
			ResultSet rSet = stmStatement.executeQuery("select * from user65 where PHN = " + PHN + " ");
			if (rSet.next()) {
				System.out.println(rSet.getString(1) + "\t" + rSet.getLong(2) + "\t" + rSet.getString(3));
			} else {
				System.out.println("INVALID PHONE NO .......");
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
