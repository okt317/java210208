package com.design.zipcode;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import com.util.DBConnectionMgr;

public class ZipCodeSearchConsole {
	//선언부
	String zdo = null;
	//생성자
	public ZipCodeSearchConsole() {
		
	}
	//조회된 우편번호 출력하기
	public void printZipCode(ArrayList<ZipCodeVO> zipcode) {
		for(ZipCodeVO zcVO:zipcode) {
			System.out.println(zcVO.getAddress()+" 그리고  "+zcVO.getZipcode());
		}
		
	}
	
	//사용자로부터 동을 입력 받는 메소드를 구현하시오 - 도스창에서 입력받는다
	public String userInput() {//스캐너를 통해서
		String userDong = null;
		Scanner scan = new Scanner(System.in);
		userDong = scan.nextLine();
		return userDong;
	}
	
	//메인메소드
	public static void main(String[] args) {
		System.out.println("동을 입력하세요");
		String userDong = null;
		ZipCodeSearchConsole zcs = new ZipCodeSearchConsole();
		userDong = zcs.userInput();
		ZipCodeDao zcDao = new ZipCodeDao();
		ArrayList<ZipCodeVO> a1 = zcDao.getZipCodeList(userDong);
		zcs.printZipCode(a1);
	}
	public void refreshData(String zdo, String dong) {
		System.out.println("zdo:"+zdo+", dong:"+dong);
		try {
		
		} catch (Exception e) {
			System.out.println(e.toString());			
		}
		
	}
}////////////end of ZipCodeSearchConsole
