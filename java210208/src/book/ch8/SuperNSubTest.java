package book.ch8;

public class SuperNSubTest {
	//자녀 클래스의 인스턴스화 시 어떻게 부모의 메소드 원형을 알고 있는 것일까
	//자녀 클래스의 인스턴스화를 했다고 해도 부모 생성자가 항상 우선하여 먼저 실행된다.
	public static void main(String[] args) {  
		Super sup = new Super("아");
		Super sup2 = new Sub("아");
//		Sub sub2 = new Super();
		Sub sub = new Sub("아");
		
		sup.methodA();
		//자녀 클래스의 메소드만 호충됨. 이럴 경우 부모 메소드는 쉐도우 메소드가 되는 것임.
		sup2.methodA();
		sub.methodA();
		sub.methodB();
//		sup2.methodB();
		
		
	}
		   
	   
}
