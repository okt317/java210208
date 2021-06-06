package com.swing.exam;

public class Answer2_2 {
	int a = 1;
	void methodA(int soo) {
		while(a<=soo) {
			if(a%5==0|a%7==0) {
				if(a%5==0&a%7==0) {
					System.out.println("fizzbuzz");
				}
				else if(a%5==0) {
					System.out.println("fizz");
				}
				else if(a%7==0) {
					System.out.println("buzz");
					}
				
			}
			else {
				System.out.println(a);
			}
			a++;
		}
	}
	public static void main(String[] args) {
		Answer2_2 dap = new Answer2_2();
		dap.methodA(100);
	}//end of main
}
