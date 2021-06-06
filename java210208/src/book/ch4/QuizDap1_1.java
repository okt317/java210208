package book.ch4;

public class QuizDap1_1 {
	void methodA(int soo) {
		for(int a= 1;a <= soo;a++) {
			switch(a) {
					
			case 35: case 70:
				System.out.println("fizzbuzz");
				break;
			case 5: 
				System.out.println("fizz");
				break;
			case 7:
				System.out.println("buzz");
				break;
			default:
				System.out.println(a);
				break;
				
			}
			
		}//end of for
		
	}

	public static void main(String[] args) {
		QuizDap1_1 dap = new QuizDap1_1();
		dap.methodA(100);
		
	}//end of main

}//end of class
