package jkk;
import java.io.*;
public class Serialize {


	public static void main(String[] aaa) throws IOException
	{
		try{
		
	
		FileInputStream fis = new FileInputStream("dedalus.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		employee emp = (employee)ois.readObject();
		System.out.println("DeSerilized from file dedalus.txt");
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		ois.close();
		fis.close();
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("No file");
		}
		catch(ClassNotFoundException cnf)
		{
			System.out.println("No Emp class");
		}

	}
}
















