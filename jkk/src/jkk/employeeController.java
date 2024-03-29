package jkk;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.function.Predicate;

import Day8.EmployeeDaoImpl;

public class employeeController implements EmployeeInterface {
	employee emp;
	List emplist = new ArrayList();
	EmployeeDaoImpl dao =new EmployeeDaoImpl();
	public void addEmployee()
	{	
		emp = new employee();
        //Predicate<employee> auth= u->u.eid.equals("101") && u.ename.equals("padma");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid");
		int eid= sc.nextInt();
		emp.setEid(eid);
		
		System.out.println("Enter Ename");
		String ename= sc.next();
		emp.setEname(ename);
	//emplist.add(emp);
		dao.insertEmployee(emp);
//		  if(auth.test(emp)){
//	            System.out.println("Valid User"); 
//	        }
//	        else
//	         System.out.println("Invalid user");
//	    }
		System.out.println("Employee Added Succesfully");
	}
	
	public void viewEmployee() {
		//System.out.println(emp);
//		Iterator i = emplist.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}

		emplist.forEach(lis ->System.out.println(lis));
		
	}

	@Override
	public void serial() throws IOException {
		// TODO Auto-generated method stub
		try{
		    FileOutputStream fos = new FileOutputStream("dedalus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Serilized to file dedalus.txt");
			oos.close();
			fos.close();
			}
		catch(Exception fnf) {
			System.out.println("No file");
	}
	}

	@Override
		public void deserial() {
		// TODO Auto-generated method stub
			}
	@Override
	public void sortByEid() {
		Collections.sort(emplist);
		System.out.println("After sorting by EID");
		System.out.println(emplist);
	}

	@Override
	public void sortByEname() {
		Collections.sort(emplist, employee.NameComparator);
		System.out.println(emplist);
		
	}
}

			