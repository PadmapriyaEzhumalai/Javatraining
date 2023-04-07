package jkk;

public class mouter {

	int x =10;
	public void OuterMethod()
	{
		int j=90;
		  abstract class MinnerClass 
		{
			public void minnerMethod()
			{
			System.out.println("Hello ..." + x + j);
			}
		}
		 class Newclass extends MinnerClass{
			 int x2=10;
		 }
		 
		Newclass mic = new Newclass();
		mic.minnerMethod();	
		System.out.println(mic.x2);
		
	}
	public static void main(String[] a)
	{
		mouter moc = new mouter();
		moc.OuterMethod();		
	
		//MinnerClass mic = new MinnerClass();
		//mic.minnerMethod();
	}
}
