package JDBC_EXAM;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// s-2 = Creating Connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB",
					"sandip");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into empinfo values (?,?,?,?,?,?)");
			System.out.println("Enter Details...");
			System.out.println("Enter Employee Id: ");
			Integer idString=Integer.parseInt(scanner.nextLine());
			System.out.println("Enter Employee Name : ");
			String nameString = scanner.nextLine();
			System.out.println("Enter employee Adress :  ");
			String addString = scanner.nextLine();
			System.out.println("Enter employee Mail id  :  ");
			String mailString = scanner.nextLine();
			System.out.println("Enter employee Phone no :  ");
			long phn = scanner.nextLong();
			System.out.println("Enter employee reume file name  :  ");
			
		     File re=new File(scanner.nextLine());
				
			
			
			
			preparedStatement.setInt(1, idString);
			preparedStatement.setString(2, nameString);
			preparedStatement.setString(3, addString);
			preparedStatement.setString(4, mailString);
			preparedStatement.setLong(5, phn);
	//		preparedStatement.setf(6, re);
			
			
			int k = preparedStatement.executeUpdate();
			if(k>0)
			{
				System.out.println("Added Succefully...");
			}
			else {
				System.out.println(" Not Added Succefully...");
			}
				
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
