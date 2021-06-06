package thread.main;

import javax.swing.JFrame;

public class MainDisplay extends Thread {
	JFrame jf = null;
	
	public void initDisplay() {
		System.out.println("initDisplay호출 성공");
		jf = new JFrame();
		jf.setTitle("화면출력");
		jf.setSize(500,300);
		jf.setVisible(true);
	}
	public void run() {
		System.out.println("run 호출성공");
		try {
			sleep(5000);
			for(double d = 0;d<100;d++) {
				//지연시키기
				System.out.println("d=====>" +d);
				if(jf != null){
					jf.setTitle("run 메소드경유함");
					jf.revalidate();
				}
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
			
		}
		
	}

	public static void main(String[] args) {
		MainDisplay md = new MainDisplay();
		md.initDisplay();
		md.run();

	}

}
