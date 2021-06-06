package book.ch4;

enum Dogs {collie, harrier, shepherd};

public class Ocjp52 {
	void m() {
		String name = "이순신";
		//switch안에 String 타입 가능함.
		switch (name) {
		case "이순신":
			System.out.println("이순신");
			break;
		case "김유신":  
			System.out.println("김유신 ");
			break;
		
	}
	}
		
	public static void main(String[] args) {
		Ocjp52 q = new Ocjp52();
		q.m();
		
		 Dogs myDog = Dogs.shepherd;
		 switch (myDog) {
			 case collie:
				 System.out.print("collie ");
			 case shepherd:  
				 System.out.print("retriever ");
			 case harrier:
				 System.out.print("harrier ");
			 
		 }//end of switch
	 }//////end of main
}///////////end of class