package com.design.zipcode;

import java.util.List;
import java.util.Vector;

	/*
	 * 자료구조의 종류
	 * 1) List계열
	 *	arraylist - 싱글스레드 안전, 동기화 처리 생략, 속도 빠르다
	 *	vector - 멀티스레드 안전, 동기화 처리, 속도 느린편
	 * 2) Map계열(해시태그)
	 * 
	 * 3) set계열(빈도낮음) - 집합
	 */
public class ZipCodeList {
	
	public static void main(String[] args) {
		//꺽쇠: 제네릭이라고 함. 생성부에는 타입없이 다이아몬드 연산자만 붙임.
		Vector<ZipCodeVO> v = new Vector<>();//다형성을 누릴 수 없다
		List<ZipCodeVO> v2 = new Vector<>();//다형성 누린다
		ZipCodeVO zcVO = null;
		ZipCodeVO zcVOs[] = null;
		int i = 0;
		while(i<3)	{
			zcVO = new ZipCodeVO();
			zcVO.setAddress("서울시");
			System.out.println("zcVO주소번지 바뀐다 ==>"+zcVO.getAddress());
			v.add(zcVO);
			zcVO.setAddress("인천시");//원본도 바뀐다
			i++;
		}
		for(int x = 0;x<v.size();x++) {
			ZipCodeVO zVO = v.get(x);//25번에서 만들어진 VO와는 다른것이다.
			System.out.println(zVO);//같은 주소번지가 출력된다
		}
		zcVOs = new ZipCodeVO[v.size()];//객체배열이 3개 만들어진다
		System.out.println("배열의 크기는"+zcVOs.length);//3이 출력됨
		v.copyInto(zcVOs);//벡터에 담긴것을 배열에 담아준다
		for(int y = 0;y<zcVOs.length;y++) {
			System.out.println(zcVOs[y]);//객체 배열의 주소번지가 3개 출력된다.
			System.out.println(zcVOs[y].getAddress());
		}
	}

}
