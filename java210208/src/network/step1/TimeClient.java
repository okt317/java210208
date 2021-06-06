package network.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JLabel;

import book.ch5.AddressBook2;

public class TimeClient extends Thread{
	String timeStr = null;
	JLabel jlb_time = null;
	TimeClient() {
	}
	public TimeClient(JLabel jlb_time) {
		this.jlb_time = jlb_time;
	}
	@Override
	public void run() {//콜백 메소드 - 사용자가 아니라 시스템 레벨에서 자동 호출되는 메소드
		System.out.println("run 호출 성공");
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader br = null;
		boolean isFlag = false;
		try {
			socket = new Socket("172.30.1.51",1127);//local port 1127
			out = new PrintWriter(socket.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//InputStream is = new InputStream(socket.getInputStream()); 나중에
			//내 소켓에 대한 포트번호는 따로 할당이 된다
			while(!isFlag) {
				while((timeStr=br.readLine())!=null) {
					System.out.println(timeStr);
					jlb_time.setText(timeStr);//디폴트 생성자를 경유하므로 jlb_time은 null이다
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("누구야");
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/*
	public static void main(String[] args) {
		TimeClient tc = new TimeClient();
		tc.start();//run 메소드 호출해줌
	}
	*/
	

}

