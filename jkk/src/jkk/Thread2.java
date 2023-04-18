package jkk;

class Threadsvv implements Runnable{
	public void run() {
		System.out.println("method strt");
		try {
			for(int i=0;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println("i ="+i);
			}
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("method ended");
	
	}
}
	public class Thread2{
		
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			System.out.println("Main started");
			Threadsvv ta = new Threadsvv();
			Thread t = new Thread(ta);
			t.start();
			System.out.println("Main ended");
		}
	}

