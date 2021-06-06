package ch5.singleton;

public class Sonata {
	private static Sonata myCar = null;
	int speed = 0;
	
	public void stop() {
		System.out.println("stop메소드 호출 성공");
		speed = speed -1;
	}
	private Sonata() {
		
	}
	
	public static synchronized Sonata getinstance(){
		
		if(myCar == null) {
			myCar = new Sonata();
		 }
		return new Sonata();
		}
		

}
