package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_P6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB",
					"sandip");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from empinfo65");
			System.out.println("------------------ Employee Details -----------------------");

			ResultSet rSet = preparedStatement.executeQuery();
			while (rSet.next()) {
				System.out.println(
						rSet.getInt(1) + "\t" + rSet.getString(2) + "\t" + rSet.getInt(3) + "\t" + rSet.getFloat(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}