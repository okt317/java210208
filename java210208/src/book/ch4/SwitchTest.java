package book.ch4;

public class SwitchTest {

	public static void main(String[] args) {
		int protocol = 100;//로그인
		protocol = 200;//입장하기
		protocol = 300;//다자간 대화
		protocol = 301;//귓속말 1:1채팅
		String id = "tomato";
		String input = "오늘 스터디 할까?";
		String msg = protocol+"#"+id+"#"+input;
		//제어문의 역할은 업무 순서에 대한 흐름을 바꾼다
		//순서에 대한 정보를 바탕으로 의사를 결정할 수 있는 것은 팀장, 차장, 부장 선택자
		//선택(비즈니스 로직계층-model계층)에 따라 다른 방향으로 진행
		//break <-> continue
		//break
		//for문, while문... 무한루프를 방지하기 위해서
		//if문 break 대신에 return이다. 리턴은 메소드를 탈출한다.
		//switch문에서 break는 switch문을 탈출
		switch(protocol) {//원시형 타입 + String타입
			case 0:
				//실행문
				System.out.println("0입니다");
				break;
			case 10:
				//실행문
				System.out.println("10입니다");
				break;
			case 100:
				//실행문
				System.out.println("100입니다");
				break;
			default:
				System.out.println("디폴트 입니다");
				break;
		}///end of switch
		System.out.println("여기");
	}

}
