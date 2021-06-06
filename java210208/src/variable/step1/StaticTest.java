package variable.step1;

public class StaticTest {
	/**
	 * non-static타입은 static영역에서 접근불가, 호출안됨
	 **/
	static void avg() {//사용자 정의 메소드
		System.out.println("avg호출 성공");
		
		
	}
	public static void main(String[] args) {
		if(args.length==0) {//방의 개수
			//아래 문장은 조건에 따라 한 번도 실행기회를 못 가질 수도 있다
			System.out.println("입력해야지");
			return;//main메소드 탈출하기
		}
		System.out.println(args[0]+10);//20출력되도록 코드를 수정하시오
		int imsi = Integer.parseInt(args[0]);//주소번지.XXX(args[0]);
		System.out.println(imsi+10);//20출력되도록 코드를 수정하시오
		System.out.println("->"+imsi+10);//20출력되도록 코드를 수정하시오
		//주소번지 없이도 호출할 수 있는 메소드가 있다. 메소드 이름앞에 static이 있다면
		//main메소드는 자바가 제공하는 메소드 입니다 
		//사용자 정의 메소드도 가능하다
		//내가 필요한 메소드는 문자열을 집어 (파라미터로)넣으면 int타입으로 변환(리턴, 대입연산자를 받을 수)하여서 반환해주는 메소드가 필요함
		// = parseInt()
		avg();
		StaticTest.avg();//원칙상
		//주소번지 대신에 타입이 필요하다
		//run configuration 의 결과에 따라 결과값이 다르네
	}

}
