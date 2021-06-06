package book.ch4;

import java.util.Random;
import java.util.Scanner;

public class Dap {
	void MethodA(){
	}
	public static void main(String[] args) {
		Random r = new Random();
		int dap = r.nextInt(10);
		//int ch = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println(dap);
		int ans = sc.nextInt();
		int ch = 0;
		System.out.println("입력하시오");
		for(;ch!=0;) {
			if(ch<3) {
			if(ans==dap) {
				System.out.println("맞다");
				break;
			}
			else if(ans>dap) {
				ch++;
				System.out.println("높다");
			}
			else if(ans<dap) {
				ch++;
				System.out.println("낮다");
			}
			else {
				System.out.println("바보");
				
			}
			}
		}
			
	
			
		

		
		}//end main method
		}//end class
	


