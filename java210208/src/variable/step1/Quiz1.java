package variable.step1; 
 
public class Quiz1 {
	int x;
	//메소드에는 2가지 종류가 있다
	//JVM에서 제공되는 메소드와 사용자 정의 메소드
	// 메소드 선언 순서는 리턴타입 메소드이름(){실행문;} - 기초가 있다
	//메소드 선언할때 리턴타입과 반환타입을 결정할 수 있다 - 기초가 아니다 코딩해봐야한다
		
	public static void main(String[] args) {
		Quiz1 q = new Quiz1();
		q.methodA(); 
		q.methodA(5); 
		//System.out.println(x);//static 내에서는 쓸 수 없다
		System.out.println(q.x);
	}
	//methodA의 호출이 선언 앞에 오더라도 에러가 아님
	//왜냐하면 자바는 절차지향의 프로그램 언어가 아니니까
	//왜냐하면 객체지향 언어이므로 호출순서와는 상관이 없다
	//자바에서는 같은 이름의 메소드를 중복하여 선언할 수 있다
	//이것을 가능하게 하는 규칙은 메소드 오버로딩이다
	//메소드 오버로딩은 반드시 파라미터의 타입이 다르거나 파라미터의 갯수가 달라야 한다
	//주의사항:리턴타입이 있고 없고는 영향을 주지 않는다
	private void methodA() {//private으로 하면 내안에서만 사용 사능 - 외부에서 접근 불가 - 호출, 재사용 불가
	System.out.println("methodA호출 성공");
	}
	private void methodA(int x) {//private으로 하면 내안에서만 사용 사능 - 외부에서 접근 불가 - 호출, 재사용 불가
		System.out.println(x);	
	}
	private int methodA(String y) {//private으로 하면 내안에서만 사용 사능 - 외부에서 접근 불가 - 호출, 재사용 불가
		System.out.println(x);	
		return 8;
	}

}
