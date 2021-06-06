package book.ch4;

public class ForTest {
	public static void main(String[] args) {
		
		int hap = 0;
		for(int i=1;i<=10;i=i+1) {
			//System.out.println(i); 출력하는 문장이 for문 안에 있는 경우 10번 반복 출력되니까
			if(i%2==0) {
				hap = hap +i;
			}
			if(hap==30) {
			System.out.println("1부터 10까지 짝수 합은" + hap);
			}
				
		}
		//나는 for문 밖에서 한번만 30을 출력하고 싶어요
	}

}