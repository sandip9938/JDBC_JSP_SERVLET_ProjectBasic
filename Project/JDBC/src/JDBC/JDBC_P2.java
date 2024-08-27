package JDBC;
// Showing BookDetails....
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_P2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try (scanner;) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB",
						"sandip");
				// Opreation-1
				PreparedStatement pStatement1 = connection
						.prepareStatement("insert into Bookdetails65 values(?,?,?,?,?)");
				// Opreation-2
				PreparedStatement pStatement2 = connection.prepareStatement("select * from Bookdetails65");
				// Opertaion-3
				PreparedStatement pStatement3 = connection.prepareStatement("select * from Bookdetails65 where code=?");
				// Opreation-4
				PreparedStatement pStatement4 = connection
						.prepareStatement("update Bookdetails65 set price=?,qty=qty+? where code=?");
				// Opreation-5
				PreparedStatement pStatement5 = connection.prepareStatement("delete Bookdetails65  where code=?");
				while (true) {
					System.out.println("*****Choice******");
					System.out.println(
							"\t1.AddBookDetails" + "\n\t2.ViewAllbookDetails" + "\n\t3.ViewAllbookDetailsByCode"
									+ "\n\t4.EditBookDetailsByCode" + "\n\t5.DeletebookDetailsByCode" + "\n\t6.Exit");
					System.out.println("Enter Your Choice : ");
					int choice = Integer.parseInt(scanner.nextLine());
					switch (choice) {
					case 1: {
						System.out.println("------------BookDetails------------");
						System.out.println("Enter Book Code: ");
						String code = scanner.nextLine();
						System.out.println("Enter Book name: ");
						String name = scanner.nextLine();
						System.out.println("Enter Book Author Name: ");
						String author = scanner.nextLine();
						System.out.println("Enter Book Price: ");
						float price =Float.parseFloat(scanner.nextLine());
						System.out.println("Enter Book Qty: ");
						int qty = Integer.parseInt(scanner.nextLine());
						pStatement1.setString(1, code);
						pStatement1.setString(2, name);
						pStatement1.setString(3, author);
						pStatement1.setFloat(4, price);
						pStatement1.setInt(5, qty);
						int k = pStatement1.executeUpdate();
						if (k > 0) {
							System.out.println("BookDetails Added Successfully...");
						}
						break;

					}
					// Case1 is finished--------------------------------
					case 2: {
						ResultSet rSet = pStatement2.executeQuery();
						System.out.println("----------BookDetails---------------");
						while (rSet.next()) {
							System.out.println(rSet.getString(1) + "\t " + rSet.getString(2) + "\t" + rSet.getString(3)
									+ "\t" + rSet.getFloat(4) + "\t" + rSet.getInt(5));
						}
						break;
					}
					case 3: {
						System.out.println("Enter Book code to display the Deatils: ");
						String bc = scanner.nextLine();
						pStatement3.setString(1, bc);
						ResultSet rSet2 = pStatement3.executeQuery();
						if (rSet2.next()) {
							System.out.println(rSet2.getString(1) + "\t " + rSet2.getString(2) + "\t"
									+ rSet2.getString(3) + "\t" + rSet2.getFloat(4) + "\t" + rSet2.getInt(5));
						} else {
							System.out.println("Invalid BookCode..... ");
						}
						break;
					}
					case 4: {
						System.out.println("Enter Book code which is update :  ");
						String bc2 = scanner.nextLine();
						pStatement3.setString(1, bc2);
						ResultSet rSet2 = pStatement3.executeQuery();
						if (rSet2.next()) {
							System.out.println("Enter old Price Book:  " + rSet2.getFloat(4));
							System.out.println("Enter new price of Book: ");
							float nprice = Float.parseFloat(scanner.nextLine());
							System.out.println("Existing book Qty:  " + rSet2.getInt(5));
							System.out.println("Enter new Book Qty: ");
							int nqty = Integer.parseInt(scanner.nextLine());

							pStatement4.setFloat(1, nprice);
							pStatement4.setInt(2, nqty);
							pStatement4.setString(3, bc2);

							int k2 = pStatement4.executeUpdate();
							System.out.println("The Value K2= " + k2);
							if (k2 > 0) {
								System.out.println("BookDeatils Update Succesfully.....");
							} else {
								System.out.println("Invalid BookCode....");
							}
							break;
						}

					}
					case 5: {
						System.out.println("Enter the book code to perform delete opreation: ");
						String bc3 = scanner.nextLine();
						pStatement3.setString(1, bc3);
						ResultSet rSet3 = pStatement3.executeQuery();
						if (rSet3.next()) {
							pStatement5.setString(1, bc3);
							int k4 = pStatement5.executeUpdate();
							System.out.println("The value in k4 is : " + k4);
							if (k4 > 0) {
								System.out.println("Book Details Deleted Sucessfully.....");
							} else {
								{
									System.out.println("Invalid Book Code");
								}
								break;
							}
						}

					}
					case 6: {
						System.out.println("Program Terminated...");
						System.exit(0);

					}
					default:
						System.out.println("Invalid Choice");
						throw new IllegalArgumentException("Unexpected value: " + choice);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
