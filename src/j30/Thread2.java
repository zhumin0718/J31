package j30;

public class Thread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("b"+i);
			
		}
	}
}
