package jkk;
import static java.lang.Math.*;
public class Array {
	void arr() {
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;	
		arr[2]=3;

		for(int i =0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		for(int a : arr)
		{
			System.out.println(a);
		}

		employee e1 = new employee();
		e1.setEname("Malar");
		employee e2 = new employee();
		e2.setEname("Bala");

		employee[] empArr = new employee[2];
		
		empArr[0]=e1;
		empArr[1]=e2;

		for(employee emp : empArr)
		{
			System.out.println(emp);
		}


		System.out.println(PI);
		}

	}


