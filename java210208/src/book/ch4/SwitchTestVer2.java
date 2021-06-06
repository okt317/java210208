package book.ch4;

import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwitchTestVer2 extends JFrame {
	
	public static void main(String[] args) {
		SwitchTestVer2 stv = new SwitchTestVer2();
		int    protocol   = 0;//로그인
		String nickName	  = "tomato";
		String inputValue = "오늘 스터디 할까?";
		String msg 		  = 300+"#"+nickName+"#"+inputValue;
		StringTokenizer st = new StringTokenizer(msg,"#");
		protocol = Integer.parseInt(st.nextToken());
		String s_nickName = st.nextToken();
		String s_inputValue = st.nextToken();//동기화를 하려면 서버를 경유 해야한다 그래서 붙임
		switch(protocol) {//원시형 타입 + String타입
			case 100:
				//실행문
				System.out.println("0입니다");
				break;
			case 200:
				//실행문
				System.out.println("10입니다");
				break;
			case 300:
				//실행문
				System.out.println("["+s_nickName+"]"+s_inputValue);
				break;
			default:
				JOptionPane.showMessageDialog(stv,"잘못된 메시지");
				break;
		}///end of switch
		System.out.println("끝");
	}

}
