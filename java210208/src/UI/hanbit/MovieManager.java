package UI.hanbit;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MovieManager extends JFrame {
	JPanel jp_west = new JPanel();
	JPanel jp_center = new JPanel(new GridLayout(3,1));
	JPanel movie_west = new JPanel();
	JPanel movie_center = new JPanel();
	JPanel movie_center1 = new JPanel();
	JPanel movie_center2 = new JPanel();
	JButton a = new JButton("a");
	JButton b = new JButton("b");
	JButton c = new JButton("c");
	JButton d = new JButton("d");
	
	void initDisplay(){
		movie_center.add(a);
		movie_center1.add(b);
		movie_center2.add(c);
		jp_west.add(d);
		jp_west.add(movie_west);
		jp_center.add(movie_center);
//		jp_center.add(a);
		jp_center.add(movie_center1);
		jp_center.add(movie_center2);
//		jp_center.add(b);
//		jp_center.add(c);
		this.add("West",jp_west);
		this.add("Center",jp_center);
		this.setSize(500,500);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		MovieManager mm = new MovieManager();
		mm.initDisplay();
		// TODO Auto-generated method stub

	}

}
