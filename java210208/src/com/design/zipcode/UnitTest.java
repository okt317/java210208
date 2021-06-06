package com.design.zipcode;

import java.util.ArrayList;

public class UnitTest {

	public static void main(String[] args) {
		ZipCodeDao zcd = new ZipCodeDao();
		ArrayList<ZipCodeVO> zipcodelist = null;
		zipcodelist = zcd.getZipCodeList("가산동");
		zipcodelist = zcd.getZipCodeList("당산동");
		zipcodelist = zcd.getZipCodeList("개봉동");
		System.out.println(zipcodelist);
		// TODO Auto-generated method stub

	}

}
