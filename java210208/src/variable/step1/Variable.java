package variable.step1;

public class Variable {
	//선언부
	
	//메소드 선언
	void methodA(int x) {
		System.out.println(x);
	}
	double methodB(int x) {
		System.out.println(x);
		return 3.14;
	}
	//메인메소드 - exe파일로 만들수 잇다
	/************************
	 * 문제해결능력 키움
	 * @return void이다 - 비어있다 - 돌려 받을 수 있는 값이 없다 - 이것때문에 에러가 발생할 수 있다
	 * @param args
	 ************************/
	public static void main(String[] args) {
		//system:너의 컴퓨터 out속성:출력장치(하드웨어 - 모니터_프린터..) , print():이건 안됨, print(int i), print(double pi)..
		Variable v = new Variable();
		System.out.print(v.methodB(1));
		//System.out.print(v.methodA(1););// 반환안됨
		//메소드 선언할대는 좌중괄호 우중괄호를 사용하고
		//메소드 호출할때는 ;
		//API, xxx.jar 이 안(클래스안에 객체[결정되지 않았다] 안에)있는 것을 꺼내 쓴다
		//print메소드는 여러개이다 - 같은 이름의 메소드를 여러개로 만들 수 있다
		//System.out.print();//줄바꿈 안됨
		System.out.print(5);//줄바꿈 안됨
		System.out.println(5+5+5);//줄바꿈 추가된 메소드
	}

}
