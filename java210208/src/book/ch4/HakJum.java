package book.ch4;

import javax.swing.JOptionPane;

public class HakJum {

	public static void main(String[] args) {
		String  s_junsu = JOptionPane.showInputDialog("점수를 입력하세요");
		int		i_junsu = Integer.parseInt(s_junsu);
		System.out.println("당신이 입력한 점수는 "+s_junsu+"입니다");
		System.out.printf("당신이 입력한 점수는 %s %n 입니다",s_junsu);
		switch(i_junsu/10) {
			case 9: case 10:
				System.out.println("A학점 입니다");
				break;
			case 8:
				System.out.println("B학점 입니다");
				break;
			case 7:
				System.out.println("C학점 입니다");
				break;
			case 5:
				System.out.println("D학점 입니다");
				break;
			default:
				System.out.println("F학점 입니다");
				break;
			}
	}

}
