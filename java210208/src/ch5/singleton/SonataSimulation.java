package ch5.singleton;

public class SonataSimulation {

	public static void main(String[] args) {
		Sonata yourCar = Sonata.getinstance();//싱글톤
		Sonata meCar = Sonata.getinstance();//싱글톤
		Sonata gnomCar = Sonata.getinstance();//싱글톤
		System.out.println(yourCar);
		System.out.println(meCar);
		System.out.println(gnomCar);
	//	Sonata car = new Sonata();

	}

}
