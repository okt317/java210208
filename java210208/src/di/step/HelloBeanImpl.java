package di.step;

public class HelloBeanImpl implements HelloBean {
	private String msg = null;
	//setter객체 주입법이다.(자바코드 적용)
	//생성자 객체 주입법(xml코드)-초보
	public void setMsg(String msg) {
		this.msg = msg;
	}
	//msg = new String("안녕! 나....");
	@Override
	public String getGreeting(String msg) {
		return "Spring "+this.msg;
	}
	//Bean이 초기화 된 후 호출되는 메소드
	public void initMethod() {
		System.out.println("initMethod 호출 성공");
	}
	//Bean이 소멸되기 전에 호출되는 메소드
	public void destroyMethod() {
		System.out.println("destroyMethod 호출 성공");
	}

}