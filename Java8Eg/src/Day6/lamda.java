package Day6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lamda {

//	public void connect() {
//		System.out.println("connected........");
//	}
//	

public static void main(String[] args) {
	// java 7 syntax 1
//	lamda l = new lamda();
//	l.connect();
	
//java syntax 2
//		Runnable r = new mytaskthread();
//		Thread thread = new Thread(r);
//		thread.start();
	
	//java syntax 3
//	Runnable r = new Runnable() {
//		public void run() {
//		lamda task  = new lamda();
//		task.connect();
//		}
//};
//	Thread t1 = new Thread(r);
//	t1.start();
	
	//java8 syntax 1
//	Runnable r =() ->{
//	lamda task =  new lamda();
//        task.connect();
//
//    };
//    Thread t1 = new Thread(r);
//    t1.start();
	
	//java syntax2
//	Thread th1 = new Thread(() ->{
//		lamda task =  new lamda();
//        task.connect();
//	});
//	th1.start();
	//java8 synt3
//	new Thread(() ->{
//		new lamda().connect();
//	}).start();
	//jav8 synt4
//	
//	new Thread(new lamda()::connect).start();
	
	User u1 = new User(11,"nik","nil@gmail.com");
	User u2 = new User(22,"pik","pil@gmail.com");
	User u3 = new User(33,"cik","cil@gmail.com");
	
	List<User> li = new ArrayList<User>();
	li.add(u1);
	li.add(u2);
	li.add(u3);
	
	System.out.println("User List :" +li);
	
//	Iterator<User> i = li.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
	 //li.forEach(lis ->System.out.println(lis));
	li.forEach(System.out::println);
	}
	
	}


