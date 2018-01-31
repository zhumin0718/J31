package j30;

public class text {
	public static void main(String[] args) {
	Thread t1=new Thread1();
	Thread t2=new Thread2();
	Runnable r=new Thread3();
	Thread t3=new Thread(r);
	t1.start();
	t2.start();
	t3.start();
	}
}
