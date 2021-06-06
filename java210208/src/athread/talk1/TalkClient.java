package athread.talk1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TalkClient extends JFrame implements ActionListener {
	//////////속지 추가//////
	JPanel jp_first	= null;
	JPanel jp_second = null;
	JPanel jp_thied = null;
	//////////통신과 관련된 전역변수 추가//////
	Socket				socket	= null;
	//직렬화 누릴 수 있다
	ObjectOutputStream	oos		= null;
	ObjectInputStream	ois		= null;
	//닉네임
	String nickname				= null;//oh, ky, ung, 
	///////////화면 관련 전역변수 추가/////////
	JTextArea	jta_display	= new JTextArea();
	JScrollPane	jsp_display = new JScrollPane(jta_display);
	JPanel		jp_south	= new JPanel();
	JTextField	jtf_msg		= new JTextField();
	JButton		jbtn_send	= new JButton("전송");
	
	//소켓관련 초기화
	public void init() {
		try {
			//소켓 생성하기 - ip, port 필요 - 서버측 serversocket에 연결된다
			socket = new Socket("172.30.1.51", 3000);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			oos.writeObject(100+"#"+nickname);
			TalkClientThread tct = new TalkClientThread(this);
			tct.start();//run()호출
		} catch (Exception e) {
			System.out.println(e.toString());

		}
	}
	public void initDisplay() {
		nickname = JOptionPane.showInputDialog("닉네임을 입력하세요");
		jtf_msg.addActionListener(this);
		jta_display.setEditable(false);
		jp_south.setLayout(new BorderLayout());
		jp_south.add("Center",jtf_msg);
		jp_south.add("East",jbtn_send);
		this.add("Center",jsp_display);
		this.add("South",jp_south);
		this.setTitle(nickname+"님의 창");
		this.setSize(500,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		TalkClient tc = new TalkClient();
		tc.initDisplay();
		tc.init();//소켓처리

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String msg = jtf_msg.getText();
		if(jtf_msg == obj) {
			try {
				oos.writeObject(200
						+"#"+nickname
						+"#"+msg);
				jtf_msg.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
