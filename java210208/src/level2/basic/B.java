package level2.basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B implements ActionListener{
	A a = null;
	public B(A a) {
		System.out.println("B(A a) 생성자 호출 성공");
		this.a = a;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent ae) {//콜백 메소드이다. 자동호출
		
		System.out.println("actionPerformed 호출 성공");
		Object obj = ae.getSource();
		Object c = ae.getSource().getClass();
		if(c==a.jbtn.getClass()) {
			System.out.println("버튼 이벤트 밸생했을 때 실행");
			String msg = a.c.methodA();
			System.out.println("메소드 처리결과:"+msg);
		}
		// TODO Auto-generated method stub
		
	}

}
