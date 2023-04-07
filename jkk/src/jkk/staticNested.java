package jkk;

public class staticNested {
	
		static int i =10;
		public void method()
		{
			System.out.println("i == " + ++i);
		}	
		 public class InnerClass
		{
			public void display()
			{
				System.out.println("i == " + i);
			}
		}
		
		public static void main(String[] a)
	        {
		

		staticNested oc = new staticNested();
		oc.method();
		
		staticNested.InnerClass ic = oc.new InnerClass();
		ic.display();
		}
	}

