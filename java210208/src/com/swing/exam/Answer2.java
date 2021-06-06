package com.swing.exam;

public class Answer2 {
	void methodA(int soo) {
		for(int a= 1;a <= soo;a++) {
			if(a%5==0|a%7==0) {
				if(a%5==0&a%7==0) {
					System.out.println("fizzbuzz");
					continue;
				}
				else if(a%5==0) {
					System.out.println("fizz");
					continue;
				}
				else {
					System.out.println("buzz");
					continue;
					}
			}//end of if 1
			System.out.println(a);
		}//end of for
	}
	int i = 1;
	void methodB(int soo) {
		while(i<=soo) {
			if(i%5==0|i%7==0) {
				if(i%5==0&i%7==0) {
					System.out.println("fizzbuzz");
				}
				else if(i%5==0) {
					System.out.println("fizz");
				}
				else if(i%7==0) {
					System.out.println("buzz");
					}
			}
			else {
				System.out.println(i);
			}
			i++;
		}
	}
	public static void main(String[] args) {
		Answer2 dap = new Answer2();
		dap.methodA(100);
		dap.methodB(100);
	}//end of main
}
