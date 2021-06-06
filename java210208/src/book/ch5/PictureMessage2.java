package book.ch5;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class PictureMessage2 extends JDialog {
	//선언부
	String imgPath = "C:\\git_java202108\\java210208\\java210208\\src\\images\\";
	JPanel jp_emoticon 		= new JPanel();
	GridLayout gl_emoticon 	= new GridLayout(1,5,2,2);
	JButton pic0 = new JButton();
	JButton pic1 = new JButton();
	JButton pic2 = new JButton();
	JButton pic3 = new JButton();
	JButton pic4 = new JButton();
	String imgFile[] = {"lion11.png","lion22.png","lion33.png","lion44.png","lion55.png"};
	JButton imgButton[] = {pic0,pic1,pic2,pic3,pic4};
	ImageIcon img[] = new ImageIcon[imgButton.length];
	//생성자
	public PictureMessage2() {
		
	}
	//화면처리부
	public void initDisplay() {
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp_emoticon.setLayout(gl_emoticon);
		for(int i=0;i<imgFile.length;i++) {
			img[i] = new ImageIcon(imgPath+imgFile);
			imgButton[i].setIcon(img[i]);
			jp_emoticon.add(imgButton[i]);
		}
		this.add("Center",jp_emoticon);
		this.setResizable(false);
		this.setSize(500, 200);
		this.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		PictureMessage2 pm = new PictureMessage2();
		pm.initDisplay();
		// TODO Auto-generated method stub

	}

}
