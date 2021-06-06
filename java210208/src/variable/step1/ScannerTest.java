package variable.step1;

public class ScannerTest {
	
	void MethodA(double a) {
		System.out.println(a*0.17);
	}
	double moon = 0.0;
	double earth = 0.0;

	public static void main(String[] args) {
		ScannerTest sc = new ScannerTest();
		sc.MethodA(5);
		
		ScannerTest sc2 = new ScannerTest();
		sc.moon = 5;
		sc.moon = sc.earth*0.17;
		System.out.println(sc.moon);
		
		int hap = 0;
		int n = 10;
		for(int i=1;i<=n;i=i+1) {
			if(i<=n) {
				hap = hap+i;
			}
		
			
		}
		System.out.println(hap);

	}
}