package com.quiz0222;

class Q39_1 {
	Q39 a1 = new Q39();
	Q39 a2 = new Q39();
	Q39 a3 = new Q39();
	
	
}
	public class Q39{
		private int counter = 0;
		private static int stop = 0;
		public static int getInstanceCoung() {
			//return counter;
			return stop;
		}
		public Q39() {
			counter++;
		}
	public static void main(String[] args) {
		System.out.println("static main");

	}
}
