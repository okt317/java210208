package book.ch4;

public class QuizDap {
	void methodA(int soo) {
		for(int a= 1;a <= soo;a++) {
			if(a%5==0|a%7==0) {
				if(a%5==0&a%7==0) {
					System.out.println("fizzbuzz"+a);
					
				}
				else if(a%5==0) {
					System.out.println("fizz"+a);
				}
				else {
					System.out.println("buzz"+a);
					}
				
				
			}//end of if 1
			System.out.println(a);
			
		}//end of for
		
	}

	public static void main(String[] args) {
		QuizDap dap = new QuizDap();
		dap.methodA(100);
		
	}//end of main

}//end of class
