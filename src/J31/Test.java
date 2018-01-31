package J31;

public class Test {
	public static void main(String[] args) {
		Runnable ticket=new Ticket();
		Thread t1=new Thread(ticket);
		Thread t2=new Thread(ticket);
		t1.start();
		t2.start();
	}
}
