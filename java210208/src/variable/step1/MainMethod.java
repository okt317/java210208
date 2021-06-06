package variable.step1;

public class MainMethod {
/***********
 * 
 * @param args - 파라미터의 타입은 배열입니다.
 * String args[] = new String[3];
 * main메소드는 좀 특별한 경우라서 따로 설명
 * 오늘의 학습목표
 * main메소드에 대해 설명할 수 있다
 **********/
	public static void main(String[] args) {
		//만일 숫자라면 20 출력
		//만일 문자라면 1010 출력
		//int + int = int
		//int + String = 붙여쓰기이다
		System.out.println(args[0]+10);
		//타입이 뭐니
		//타입을 체크할 수 있는 연산자가 있다 -왜냐면 자바는 컴파일할 때 타입을 따지니까
		if(args[0] instanceof String) {
			System.out.println("나는 문자열이야");
		}
			else {
				System.out.println("나는 문자열이 아닌데");
			}
		if(true) {//else를 실행할 경우는 죽어도 없다 왜? 상수니까 
			System.out.println("참입니다");
		}else {
			System.out.println("거짓입니다");
		}
		for(int i=0;i<5;i=i+1) {
			//if(true) {
				System.out.println("또참입니다");
		
			//}
			
		}
	}

}
