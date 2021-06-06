package thread.basic;
class C extends Thread{
	@Override
	public void run() {
		for(int i= 0; i<300;i++) {
			System.out.print("-");
		}
		System.out.println("[[[ A스레드 run  ]]] ");
	}
}

class D implements Runnable{
	@Override
	public void run() {
		for(int i= 0; i<300;i++) {
			System.out.print("|");
		}
		System.out.println("[[[ B스레드 run  ]]] ");
	}
}	
class ThreadEx13_Runnable {
	
	static long startTime = 0;
	/*
	 29[main thread시작] - 30[2:스레드 로딩-ready-go->32[대기중]]-31-32[A run call] - 33[B run call]
	 4-5-6(------|||||-----|||----------
	 14-15-16(||||||||||||-----|||||||
	 42*/
	public static void main(String args[]) {
		C th1 = new C();
		D th = new D();
		Thread th2 = new Thread(th);
		th2.start();
		th1.start();
		//시간을 계산함
		startTime = System.currentTimeMillis();
		/*
		try {
			th1.join();	// th1의 작업이 끝날 때까지 기다린다.
			th2.join();	// th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}
		*/
		System.out.print("소요시간:" + (System.currentTimeMillis() - ThreadEx13.startTime));
	} // main
		

}