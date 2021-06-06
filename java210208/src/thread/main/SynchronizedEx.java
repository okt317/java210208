package thread.main;

public class SynchronizedEx {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread ey = new Thread(atm,"ey");
		Thread ht = new Thread(atm,"ht");
		ey.start();
		ht.start();
		// TODO Auto-generated method stub

	}

}
