package com.design.zipcode;

import java.util.ArrayList;

public class A {
	/*
	 * 컬렉션 프레임워크에서 제공하는 클래스 중에 하나이다
	 * 여기에 담을 수 잇는 것들은 기본적으로 object급이다
	 * 원시형 타입은 담을 수가 없다
	 * 
	 * 배열과는 무엇이 다른가
	 * 늘었다가 줄어다가 한다
	 * 객체타입이면 무엇이든 담을 수 있다
	 * 끼워넣기가 가능하다 중간에
	 * 
	 */

	public static void main(String[] args) {
		ArrayList f1 = new ArrayList();
		f1.add("수박");
		f1.add("딸기");
		f1.add("키위");
		//제네릭이 없는 경우이므로 타입을 확인할 수 없다. object인것 까지만 확인가능하다
		/*
		for(String str:f1) {//쓰려면 String->Object
			System.out.println(str);
		}
		*/
		//타입을 정확이 맞추지 않는 것은 트렌드에도 맞지 않다
		//var i = 10;
		//var j = "안녕"; 타입스크립트(SSR, CSR 처리에 안전하다) 
		String my = (String)f1.get(0);
		Object obj = f1.get(2);
		System.out.println(my);
		System.out.println(obj);
		System.out.println("===========[아래]============");
		ArrayList<String> f2 = new ArrayList<String>();
		f2.add("수박");
		f2.add("딸기");
		f2.add("키위");
		f2.add(1,"바나나");//수박 바나나 딸기 키위
		for(String str:f2) {
			System.out.println(str);
		}
		String my2 = (String)f2.get(0);
		Object obj2 = f2.get(2);
		System.out.println(my2);
		System.out.println(obj2);
		ArrayList<ZipCodeVO> f3 = new ArrayList<>();//뒤엔 지워도됨
		ZipCodeVO zVO = new ZipCodeVO();
		zVO.setZipcode(21356);
		zVO.setAddress("서울시 마포구 공덕동 246번지");
		f3.add(zVO);
		zVO = new ZipCodeVO();
		zVO.setZipcode(21357);
		zVO.setAddress("서울시 영등포구 공덕동");
		f3.add(zVO);
		zVO = new ZipCodeVO();
		zVO.setZipcode(21358);
		zVO.setAddress("서울시 구로구 공덕동 ");
		f3.add(zVO);
		for(ZipCodeVO rzVO:f3) {
			System.out.println(rzVO);
		}
		System.out.println("주소번지를 두 번 접근이 무슨말?");
		for(ZipCodeVO rzVO:f3) {
			String addr = rzVO.getAddress();
			System.out.println(addr);
		}
		
		// TODO Auto-generated method stub

	}

}
