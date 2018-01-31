package J31;

public class Ticket implements Runnable {
	int count=10;
	Object lock=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(count>0) {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName()+"Âô³öµÚ"+count+"ÕÅÆ±");
				count--;
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

