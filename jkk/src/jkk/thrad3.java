package jkk;

	class thrad {

		public  void print1_5() {
			System.out.println("Method started");
			synchronized(this) {
			try {
				for (int i = 1; i <= 5; i++) {
					Thread.sleep(1000);
					System.out.println("i = " + i);
				}
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			}
			System.out.println("Method ended");
		}

	}

	class Threa2 extends Thread {

		thrad t1;

		public Threa2(thrad t1) {
			this.t1 = t1;
		}

		public void run() {
			t1.print1_5();

		}

	}

	public class thrad3 {

		public static void main(String[] args) {
			System.out.println("Main started");
			thrad t1 = new thrad();
		

			Threa2 t2a = new Threa2(t1);
			Threa2 t2b = new Threa2(t1);
			t2a.start();
			t2b.start();
			System.out.println("Main ended");
		}

	}

