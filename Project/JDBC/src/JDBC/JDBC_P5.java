package JDBC;

// Product Details.......
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_P5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB",
					"sandip");
			// Compilation-1
			PreparedStatement preparedStatement1 = connection
					.prepareStatement("insert into productdetails65 values(?,?,?,?)");
			// Compilation-2
			PreparedStatement preparedStatement2 = connection.prepareStatement("select * from productdetails65");
			// Compilation-3
			PreparedStatement preparedStatement3 = connection
					.prepareStatement("select * from productdetails65 where PCODE = ?");
			// Compilation-4
			PreparedStatement preparedStatement4 = connection
					.prepareStatement("update productdetails65 set PPRICE=? , PQTY=PQTY+? where PCODE=? ");
			// Compilation-5
			PreparedStatement preparedStatement5 = connection
					.prepareStatement("delete from producdetails where PCODE=?");

			while (true) {
				System.out.println("++++++++++++++++CHOICE+++++++++++++++++");
				System.out.println("\t1.ADDProduct.." + "\n\t2.ViewAllProducts.." + "\n\t3.ViewProductsByCode.."
						+ "\n\t4.EditProductsByCode...." + "\n\t5.DeleteProductByCode....");
				System.out.println("Enter Your Choice:    ");
				int choice = Integer.parseInt(scanner.nextLine());
				switch (choice) {
				// Case -1 Add product details
				case 1: {
					System.out.println("_____ProductDtails_______");
					System.out.println("Enter Product Code: ");
					String codeString = scanner.nextLine();
					System.out.println("Enter Product Name: ");
					String nameString = scanner.nextLine();
					System.out.println("Enter Product Price: ");
					Float priceFloat = Float.parseFloat(scanner.nextLine());
					System.out.println("Enter Product Qty: ");
					Integer qtyInteger = Integer.parseInt(scanner.nextLine());
					// Set the productdetails.....................................
					preparedStatement1.setString(1, codeString);
					preparedStatement1.setString(2, nameString);
					preparedStatement1.setFloat(3, priceFloat);
					preparedStatement1.setInt(4, qtyInteger);

					int k = preparedStatement1.executeUpdate();
					if (k > 0) {
						System.out.println("Prodcut Details Added Successfully ....................");
					}
					break;

				}
				// Case -2 Product Details Showing
				case 2: {

					ResultSet resultSet = preparedStatement2.executeQuery();
					System.out.println("________________ProductDetails________________");
					while (resultSet.next()) {
						System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t"
								+ resultSet.getFloat(3) + "\t" + resultSet.getInt(4));
					}

					break;

				}
				// Case-3 Select The product Details By Code.....
				case 3: {
					System.out.println("Enter th product code: ");
					String productcodeString = scanner.nextLine();
					preparedStatement3.setString(1, productcodeString);

					ResultSet resultSet = preparedStatement3.executeQuery();
					if (resultSet.next()) {
						System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t"
								+ resultSet.getFloat(3) + "\t" + resultSet.getInt(4));
					}

					break;

				}

				// Case-4 Edit Product By Prodect Code.....
				case 4: {
					System.out.println("Enter the Code which is want to Edit :   ");
					String ProoductCode1 = scanner.nextLine();
					preparedStatement3.setString(1, ProoductCode1);

					ResultSet resultSet1 = preparedStatement3.executeQuery();
					if (resultSet1.next()) {
						System.out.println("Product old price is : " + resultSet1.getFloat(3));
						System.out.println("Enter Product Price:   ");
						Float ppriceFloat = Float.parseFloat(scanner.nextLine());

						System.out.println("Product older Qty is : " + resultSet1.getInt(4));
						System.out.println("Enter Product Qty:    ");
						Integer pqtyInteger = Integer.parseInt(scanner.nextLine());

						preparedStatement4.setFloat(1, ppriceFloat);
						preparedStatement4.setInt(2, pqtyInteger);

						int k2 = preparedStatement4.executeUpdate();
						System.out.println("The value of K2 : " + k2);
						if (k2 > 0) {
							System.out.println("Product Updated Succesfully.....");
						} else {
							System.out.println("Product code Is Invalid...........");
						}
					}
					break;
				}

				// Case-5 Delete The Product Details By Code.....
				case 5:
					System.out.println("Enter the Code which is want to Delete :   ");
					String pcodeString = scanner.nextLine();
					preparedStatement3.setString(1, pcodeString);
					ResultSet resultSet3 = preparedStatement5.executeQuery();
					if (resultSet3.next()) {
						preparedStatement5.setString(1, pcodeString);
						int k3 = preparedStatement5.executeUpdate();
						if (k3 > 0) {
							System.out.println("Product Deleted Sucessfully....");
						}
					} else {
						System.out.println("Invalid Product Code...");
					}

					break;

				default: {
					System.out.println("Program Terminated ");
					System.exit(0);

				}

				}
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}
