package book.ch7;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObjectArray {

	public static void main(String[] args) {
		//JFrame은 윈도우 운영체제에서 창을 띄울때 사용하는 클래스이다
		JFrame jf = new JFrame();
		//그 창(화면)안에 버튼을 배치하기 위해서 Layout에 대한 설정이 필요하다
		//똑같은 크기의 방이 10개가 필요하다 -행렬적인 느낌
		GridLayout gl = new GridLayout(1,10);
		jf.setLayout(new GridLayout(2,5)); // (로우수, 컬럼수)
		//jf.setLayout(gl);
		//버튼의 갯수가 10개이므로 객체 배열의 크기를 10으로 하였다
		JButton jbtns[] = new JButton[10];
		//버튼의 숫자값을 출력해야 하는데 배열을 사용하면 반복적인 코드를 줄일 수 있으므로 굳이 JButton[]정의함
		//버튼에 들어갈 숫자문자열을 일일이 써주어야 하나요?
		String jbtn_label[] = {"0","1","2","3","4","5","6","7","8","9"};
		JButton jbtn = null;
		for(int i=0;i<jbtns.length;i++) {
			//22번에서 생성 및 초기화된 문자열 배열을 JButton객체를 생성할 때 생성자의 파라미터로 사용하여 버튼의 라벨을 출력하엿다
			jbtn=new JButton(jbtn_label[i]);
			jf.add(jbtn);
			}
		
		jf.setTitle("객체배열실습");
		jf.setSize(400, 300);
		jf.setVisible(true);
	}

}
