package book.ch14;

import javax.swing.JFrame;

public class CalendarPage extends JFrame {
	
	/***************
	 * 
	 * @param mm 0~11 사이의 숫자를 받는다
	 * @param yy 출력하고자 하는 달력의 년도 입력 받기
	 */
	public void print(int mm, int yy) {
		System.out.println("print 호츌");
		if(mm<0||mm>11) {
			throw new IllegalArgumentException("must be 0~11");
		}
	}
	public static void main(String[] args) {
		CalendarPage cp = new CalendarPage();
		if(args.length==2) {
			try {
				cp.print(Integer.parseInt(args[0])-1, Integer.parseInt(args[1]));
				System.out.println("달과 년도를 입력하세요");
			} catch (NumberFormatException e) {
				System.out.println("NumberFormatException=> "+e.getMessage());
				// TODO: handle exception
				e.printStackTrace();
			}
			catch (Exception e) {
				System.out.println("Exception=> "+e.getMessage());
				e.printStackTrace();
			}
		}else {
			return;
		}
		
	}

}
