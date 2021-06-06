package design.duck;

public class WoodDuck extends Duck {
	public WoodDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		System.out.println("나무오리 임니다");
		// TODO Auto-generated method stub

	}

}
