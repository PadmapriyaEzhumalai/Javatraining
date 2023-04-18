package jkk;

class ThreadA extends Thread{
	public void run() {
		System.out.println("method strted");
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println("i = " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("menthod ended");
	}
}

public class Threadrs {

	public static void main(String[] args){
		System.out.println("main started");
		ThreadA th = new ThreadA();
	    th.start();
	    System.out.println("main ended");
	}
}
