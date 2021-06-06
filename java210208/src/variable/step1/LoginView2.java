package variable.step1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginView2 extends JFrame implements ActionListener {//인터페이스 이다. 결합도를 낮추는 코드를 작성할 때 필요함. -클래스 설계시 필요함. 복습할 필요가 없는 이유는 요즘은 웹기반으로 처리하니까..
	//java.lang에 있는 패키지가 아니므로 별도로 import해야함
	//ctrl+shift+o
	JButton jbtn_login = new JButton("로그인");
	//화면 그리기 구현
	public void initDisplay() {
		//내 자신이 이벤트 처리를 담당하는 핸들러 클래스이다 라는 의미로 this를 사용하기도 한다
		jbtn_login.addActionListener(this);//이벤트 소스와 이벤트 처리를 담당하는 클래스 연결.매칭 - 콜백함수가 호출됨
		this.setTitle("네이버 로그인");
		this.add("North",jbtn_login);
		this.setSize(500,400);
		this.setVisible(true);//true:화면을 보여줄게, false:비활성화 해줄게
	}
	//내안에 있는 메소드 이지만 static영역안에서 non-static을 접근할 수 없으므로 인스턴스화를 해서 해결을 할 수 있다
	public static void main(String[] args) {
		LoginView view = new LoginView();
		view.initDisplay();
	}
	//같은 이름의 메소드를 여러개 정의할 수 있다. - 뒷바침하는 개념이 메소드 오버로딩과 오버라이딩(메소드이름이 같고 서로 상속관계)이다
	//어노테이션이다
	@Override
	public void actionPerformed(ActionEvent e) {
		//로그인 버튼을 누른거야?
		if(jbtn_login==e.getSource()) {//이벤트 감지는 컴터가 하고 버튼의 주번은 내가 정의함. 주소번지가 같니?
			System.out.println("이순신님 환영합니다");
		}
		
	}

}
