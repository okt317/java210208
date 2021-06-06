package design.duck;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	@Override
	public void display() {
		System.out.println("고무오리 임니다");

	}

}
