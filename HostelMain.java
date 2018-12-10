package client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import entity.Entities;

public class HostelMain {
	public static void main(String[] args) throws SQLException {
		Scanner scanner=new Scanner(System.in);
		Entities entities=new Entities();
		String customerName=new String();
		long phoneNumber;
		String customerMail=new String();
		String address=new String();
		String workingPlace=new String();
		int choice;
		char iterator;
		do {
			System.out.println("************WELCOME TO PG MANAGEMENT************");
			System.out.println("1.view the available pg");
			System.out.println("2.book the pg");
			System.out.println("3.view the customer details");
			System.out.println("4.exit");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				//Displaying the details of that particular pg
				entities.display();
				break;
			case 2:
				//booking that particular pg
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String dbURL="jdbc:oracle:thin:@10.219.34.3:1521/orcl";
					String userName="trg714";
					String password = "training714";
				
					Connection con=DriverManager.getConnection(dbURL,userName,password);
					PreparedStatement pst=con.prepareStatement("insert into customer_details values(?,?,?,?,?)");
				
				System.out.println("Enter your Name");
				customerName=scanner.next();
				pst.setString(1, customerName);
				System.out.println("Enter your Phone Number");
				phoneNumber=scanner.nextLong();
				pst.setLong(2,phoneNumber);
				System.out.println("Enter your E-Mail ID");
				customerMail=scanner.next();
				pst.setString(3,customerMail);
				System.out.println("Enter your Address");
				address=scanner.next();
				pst.setString(4,address);
				System.out.println("Enter Your Working Place");
				workingPlace=scanner.next();
				pst.setString(5, workingPlace);
				pst.executeUpdate();
				
				}
				catch(ClassNotFoundException se) {

						se.printStackTrace();
				}
				break;
			case 3:
				//to exit the application
				System.exit(0);
				break;
				default:
					System.out.println("Wrong menu is selected");
					break;
			}
			System.out.println("Do you want to continue(y/n): ");
			iterator=scanner.next().toLowerCase().charAt(0);
		}while(iterator =='y');
		scanner.close();
	}

}
