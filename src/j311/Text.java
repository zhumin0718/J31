package j311;

import J31.Ticket;

public class Text {
	
		public static void main(String[] args) {
			Runnable ticket=new Ticket();
			Thread t1=new Thread(ticket);
			Thread t2=new Thread(ticket);
			t1.start();
			t2.start();
		}
	}

