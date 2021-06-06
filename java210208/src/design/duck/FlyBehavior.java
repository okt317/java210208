package design.duck;
/* 생성자 올 수 없다
 * 일반 변수는 올 수 없다
 * 메소드 이름 앞에 abstract 생략 가능
 * 메소드 뒤에 세미콜론으로 끝난다
 */
public interface FlyBehavior {
//	static final int i = 0;
//	public FlyBehavior() {};
	public void fly();
	
}
