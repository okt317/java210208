package com.base;

import java.util.Random;

public class Arraykt1 {
	
	void methodA(int num) {
		int gong[] = null;
		Random r = new Random();
		gong = new int[num+1];
		System.out.println("이번주 추천 넘버는");
		for(int i = 1;i<num+1;i++) {
			gong[i]=r.nextInt(45);
			if(gong[i]!=gong[i-1]&&gong[i]!=0) {
				System.out.printf("%3d", gong[i]);
			
			}
	}
	}
	
	void methodB{
		
	}
	
	public static void main(String[] args) {
		Arraykt1 lot = new Arraykt1();
		lot.methodA(6);
		

	}
}