package book.ch8;

public class Super {
	String title = null;
	public Super() {
		System.out.println("super() 호출 성공");
	}
	public Super(String title) {
		System.out.println("super(spring) 호출 성공");
		this.title = title;
	}
	public void methodA() {
		System.out.println("super methodA 호출 성공");
	}
}
