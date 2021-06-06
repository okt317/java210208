package book.ch7;

public class TwoArray {

	public static void main(String[] args) {
		//2는 로우, 3은 컬럼
		int is[][] = new int[2][3];
		System.out.println(is[1].length);
		for(int i=0;i<is.length;i++) {
			for(int j=0;j<is[i].length;j++) {
				System.out.println("is["+i+"]["+j+"]="+is[i][j]);
				
			}//end of inner for
		}//end of outer for

	}

}
