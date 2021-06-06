package level2.basic;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//JLabel은 ActionListener를 지원하지 않는다
public class A extends JFrame implements MouseListener {
	JLabel jlb = null;
	JButton jbtn = null;
	boolean isView = false;
	B b = null;//타입만 결정 되었으므로 시점에 따라 nullpointerexception 방지 해야함
	C c = new C();// A가 컴파일 될 때 같이 메모리에 상주
//	B b = new B(this);
	public A() {
		initDisplay();
	}
	public A(boolean isView) {
		this.isView = isView;
		initDisplay();
		jbtn.setText("전송5");//동기화 처리가 되고 있어서 괜찮다
		
	}
	public void initDisplay() {
		b = new B(this);
		jlb = new JLabel("ooo");
		jbtn = new JButton("전송1");
		jbtn.addActionListener(b);
		jlb.addMouseListener(this);
		this.add("South",jlb);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add("Center",jbtn);
		this.setSize(500,300);
		this.setVisible(isView);
		
	}

	public static void main(String[] args) {
		
		new A(true);

	}
	@Override
	public void mouseClicked(MouseEvent me) {
		System.out.println("jlabel");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
