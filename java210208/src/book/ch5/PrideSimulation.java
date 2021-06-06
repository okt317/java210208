package book.ch5;

public class PrideSimulation {

	public static void main(String[] args) {
		//private으로 했을 경우 인캡슐레이션이 적용되는 것이다
		//생성자를 선언할 때 private으로 선언했으므로 디폴트 생성자를 활용하고
		//싶다면 싱글톤패턴으로 정의하여 사용해야한다
		//Pride mycar = new Pride();
		Pride hercar = new Pride(100);
		Pride himcar = new Pride(1000,6);
		Pride.wheelNum = 10;
		hercar.wheelNum = 110;
		himcar.wheelNum = 1101;
		hercar.speed = 20;
		himcar.speed = 50;
		//Pride.change();
		System.out.println(hercar.wheelNum);
		System.out.println(himcar.wheelNum);
		System.out.println(Pride.wheelNum);
		hercar.speedUp();
		System.out.println(hercar.speed);
		System.out.println(himcar.speed);
		
			
		

	}

}
