package variable.step1;
//오버로드이다
public class MethodOverloading {
	//메소드 이름은 같은데 서로 다른 메소르도 인지함
	void go() {
		System.out.println("파라미터가 없는 go() 호출 성공");
	}
	void go(int i) {//값에 의한 호출이다. i에는 메소드가 호출할 때 파라미터로 넘어오는 10이 복사됨
		System.out.println("파라미터가 int인 go(10) 호출 성공"+i);// 원시형 타입을 부르는 거니까 출력됨
		
	}
	void go(String name) {
		System.out.println("파라미터가 String인 go(smith) 호출 성공");
		
	}

	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.go();
		mol.go(10);//그 값은 여기서 결정됨. 메소드 호출할 때 결정됨. - 파라미터이다
		mol.go("Smith");//참조형 타입이니까 참조에 의한 호출이다 - String만 예외이다. 호출할 때 주소번지가 아니라 값이 출력된다는 점에서

	}

}
