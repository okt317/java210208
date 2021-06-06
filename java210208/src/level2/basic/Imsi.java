package level2.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Imsi extends JFrame{
	JPanel jp_north = new JPanel();
	JButton jbtn_o = new JButton("북1");
	JButton jbtn_t = new JButton("북2");
	JButton jbtn_th = new JButton("북3");
	JLabel	jlb = new JLabel("시간",JLabel.CENTER);
	Container cont = this.getContentPane();
	ImsiCenterPanel jp = new ImsiCenterPanel();
	
	public Imsi() {
		jp_north.setLayout(new GridLayout(1,3,3,3));
		jp_north.add(jbtn_o);
		jp_north.add(jbtn_t);
		jp_north.add(jbtn_th);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jbtn_o.addActionListener(new ActionListener() {
			
			@Override
			//내부 클래스면서 익명클래스 (안드로이드에서 쓰임)
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 호출 성공");
				viewUpdate(e);
				// TODO Auto-generated method stub
				
			}
		});
		jbtn_t.addActionListener(new ActionListener() {
			
			@Override
			//내부 클래스면서 익명클래스 (안드로이드에서 쓰임)
			public void actionPerformed(ActionEvent e) {
				System.out.println("전체화면 변경하기");
				viewAllUpdate(e);
				// TODO Auto-generated method stub
				
			}
		});
		jbtn_th.addActionListener(new ActionListener() {
			
			@Override
			//내부 클래스면서 익명클래스 (안드로이드에서 쓰임)
			public void actionPerformed(ActionEvent e) {
				System.out.println("초록패널을 빨강패널로 변경하기");
				threeUpdate(e);
				
			}
		});
		this.add("North",jp_north);
		this.add("South",jlb);
		this.setSize(500,400);
		this.setVisible(true);
	}
	protected void threeUpdate(ActionEvent e) {
		if(jp!=null) {
			jp.remove(jp.jbtn1);
			jp.remove(jp.jbtn2);
		}
		JPanel jp2 =new JPanel();
		jp2.setBackground(Color.red);
		this.add("Center",jp2);
		cont.revalidate();
		
	}
	protected void viewAllUpdate(ActionEvent e) {
		//선언부와 생성부를 다르게 하여 인스턴스화를 하면 인스턴스 변수로는 부모타입에서 제공되는
		//메소드만 사용할 수 있다
		//즉 자녀 클래스의 메소드는 호출 불가함
//		JPanel jp = new ImsiCenterPanel();
		jp.initDisplay();
		this.add("Center",jp);
		cont.revalidate();
//		this.revalidate();
//		this.repaint();
		// TODO Auto-generated method stub
	}
	public void viewUpdate(ActionEvent e) {
		System.out.println("viewUpdate 호출성공");
		cont.remove(jlb);
		cont.revalidate();
		this.remove(jbtn_o);
		this.revalidate();
		this.repaint();
	}
	public static void main(String[] args) {
		new Imsi();
		// TODO Auto-generated method stub

	}

}
