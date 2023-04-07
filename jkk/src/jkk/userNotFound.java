package jkk;
import java.io.*;

import com.exception.UserNotException;

import java.util.Scanner;

class userNotFound
{
	public static void main(String[] args) throws IOException
	{
	
		try{
		String uname=null;
		String pwd = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Username:");
		uname=br.readLine();
		System.out.println("Enter password:");
		pwd= br.readLine();

		if(uname.equals("deeps") && pwd.equals("pass"))
		{
			System.out.println("Welcome " + uname);
			EmployeeInterface ec = new employeeController();
			Scanner sc = new Scanner(System.in);
			String choice = null;
			do {
				System.out.println("Enter your choice");
				System.out.println("1. Add Employee");
				System.out.println("2. View Employee");
				int ch = sc.nextInt();
				switch (ch) {
				case 1: {
					ec.addEmployee();
					break;
				}
				case 2: {
					ec.viewEmployee();
					break;
				}
				default: {
					System.out.println("Enter right choice");
					break;
				}
				}
				System.out.println("Do u want to continue Y or y");
				choice = sc.next();
			} while (choice.equals("Y") || choice.equals("y"));
			System.out.println("Exited");
			System.exit(0);
		}
		else{
			throw new UserNotException();
		
		}
		}
		catch(UserNotException unf)
		{
			System.out.println(unf);
		}

	}
}
