package JDBC;
// Showing Normal Table 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_P1 {
	public static void main(String[] args) {
		try {
			// s-1 = loading Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// s-2 = Creating Connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB",
					"sandip");
			// s-3 = Preparing Statemnet
			Statement stmStatement = connection.createStatement();
			// s-4 = Excuting query
			ResultSet rSet = stmStatement.executeQuery("select * from HYDB");
			System.out.println("-----------------------Employee Details------------------------------");
			while (rSet.next()) {
				System.out.println(rSet.getInt(1) + "\t" + rSet.getString(2)+"\t"+rSet.getString(3)+"\t"
						+ rSet.getString(4) + "\t" + rSet.getLong(5));

			} // End loop
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
