package JDBC;

// Insert Values in Table....
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_P4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB",
					"sandip");
			Statement statement = connection.createStatement();
			System.out.println("Enter User Name : "); // name
			String nameString = scanner.nextLine();
			System.out.println("Enter User Phone No : ");
			Long pLong = scanner.nextLong();
			System.out.println("Enter User City : "); // city
			String cityString = scanner.nextLine();
			int k = statement.executeUpdate(
					"insert into  user65 values ('" + nameString + "'," + pLong + ",'" + cityString + "')");
			System.out.println("Value of K is " + k);
			if (k > 0) {
				System.out.println("User add Sucessfully....");
			}
			connection.close();
		} // end try
		catch (SQLIntegrityConstraintViolationException se) {
			System.out.println("User already Available....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end try

}
