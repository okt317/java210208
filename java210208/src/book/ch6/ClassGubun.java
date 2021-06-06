package book.ch6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassGubun extends JFrame {
	JButton jbtn_serch = new JButton("조회");
	JButton jbtn_exit = new JButton("나가기");
	public void start() {
		jbtn_serch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("조회버튼");
			}
			
		});
		jbtn_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("나가기버튼");
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	public void initDisplay() {
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(jbtn_serch);
		this.add(jbtn_exit);
		this.setSize(500,300);
		this.setVisible(true);
	}
	
	public static void main(String[] srgs) {
		ClassGubun cg = new ClassGubun();
		cg.start();
		cg.initDisplay();
	}

}
