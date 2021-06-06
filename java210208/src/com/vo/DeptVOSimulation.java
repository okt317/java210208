package com.vo;

public class DeptVOSimulation {
	void methodB() {//반환값이 전혀 역할을 못함
		
	}
	DeptVO methodA() {//반환값이 3가지가 가능함
		
		return new DeptVO();
	}
	DeptVO[] methodC() {//반환값이 3가지 종류에 대해서 n개 로우까지도 가능함
		
		return new DeptVO[3];
		
	}
	

	public static void main(String[] args) {
		DeptVOSimulation dv = new DeptVOSimulation();
		
		DeptVO a = dv.methodA();
	//	DeptVO dvo = new DeptVO();
		//int myDeptNo = dvo.Deptno(); 안됨
		a.setDeptno(30);//생성자로 처리
		//int x = dvo.setDeptno(30);
		//boolean isok = dvo.setDeptno(30); void니까
		int myDeptNo = a.getDeptno();//0출력
		//insert here - 부서번호 30을 출력하도록 코드를 추가하시오
		String myname = a.getDname();//null
		String myLoc = a.getLoc();//null
		System.out.println(myDeptNo);
		//DeptVO dvo = new DeptVO();
		a = new DeptVO();
		a.setDeptno(300);
		myDeptNo = a.getDeptno();//0출력
		System.out.println(myDeptNo);//300
		
		
		
	}

}
