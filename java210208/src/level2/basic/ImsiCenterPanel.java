package level2.basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ImsiCenterPanel extends JPanel {
	JButton jbtn1 = new JButton("회원가입");
	JButton jbtn2 = new JButton("로그인");
	
	public void initDisplay() {
//		JPanel jp = new ImsiCenterPanel();
		this.setBackground(Color.green);
		//jpanel은 flowlayout이 기본이다
		//가운데서 양쪽으로 펼쳐지면서 페이지가 그려짐.
		this.add(jbtn1);
		this.add(jbtn2);
		
	}
}
