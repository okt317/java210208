package book.ch4;
//
public class ForTest1 {
	
	public static void main(String[] args) {
		int i = 0;
		int hap = 0;//짝수
		int hap1= 0;//홀수
		for(i=1;i<=10;i=i+1) {
			//System.out.println(i); 출력하는 문장이 for문 안에 있는 경우 10번 반복 출력되니까
			if(i%2==0) {
				hap = hap +i;
			}
			else { // =if(i%2==1)
				hap1 = hap1+i;
			}
			//if(hap>20) {
				//System.out.println("1부터 10까지 짝수 합은" + hap);
			//}
			//else if(hap1>20) {
				//System.out.println("1부터 10까지 홀수 합은" + hap1);
			//}
				
		}
		System.out.println("홀수합은"+hap1+"짝수합은"+hap);
		//나는 for문 밖에서 한번만 30을 출력하고 싶어요
	}

}