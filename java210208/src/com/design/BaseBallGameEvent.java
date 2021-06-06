package com.design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BaseBallGameEvent implements ActionListener {
	BaseBallGameView bbgView = null;
	BaseBallGameLogic bbgLogic = null;
	public BaseBallGameEvent(BaseBallGameView bbgView) {
		this.bbgView = bbgView;
	}
	
		public BaseBallGameEvent(BaseBallGameView bbgView, BaseBallGameLogic bbgLogic) {
			this.bbgView = bbgView;
			this.bbgLogic = bbgLogic;
	}
	
	//ActionListener a1 = new BaseBallGameEvent();
	//인터페이스는 반드시 구현체 클래스가 필요하다
	//왜 그래야 actionperformed라는 추상 메소드를 구현할 수 잇으니까
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		// 라벨값으로 처리하고 싶으면
		String label = ae.getActionCommand(); //새게임,지우기
		System.out.println("event label:"+label);
		if(obj == bbgView.jtf_input){
			String input =  bbgView.jtf_input.getText().trim();
			
			//만일 숫자가 아닌 값이 있을 때도 고려해야 한다.
			try {
				Integer.parseInt(input);//356			
			} catch (NumberFormatException nfe) {
				bbgView.jop.showMessageDialog( bbgView.jf, "숫자만 입력하세요", "Error", JOptionPane.ERROR_MESSAGE);
				bbgView.jtf_input.setText("");
				bbgView.jtf_input.requestFocus();				
				return ;
			}
			
			if(input.length()!=3){
				return;
			}
			else{
				bbgView.jta_display.append(++bbgView.cnt+"."+ bbgView.jtf_input.getText()+":"+bbgLogic.call(input)+"\n");
				bbgView.jtf_input.setText("");
			}
		}
		else if("지우기".equals(label)){
			bbgView.jta_display.setText("");
			bbgView.jtf_input.requestFocus();
		}
		else if("종료".equals(label)){
			System.exit(0);// 자바 가상머신과의 연결고리를 끊는다.
		}
		else if(obj ==  bbgView.jmi_dap){
			bbgView.jta_display.append("정답은 "+ bbgLogic.com[0]+ bbgLogic.com[1]+ bbgLogic.com[2]+"\n");
			bbgLogic.nanSu();
		}
		else if(obj ==  bbgView.jbtns[1]){
			bbgView.jta_display.append("정답은 "+ bbgLogic.com[0]+ bbgLogic.com[1]+ bbgLogic.com[2]+"\n");
			bbgLogic.nanSu();
		}
		//새게임
		else if(obj ==  bbgView.jbtns[0]){
			bbgView.cnt = 0;
			bbgLogic.nanSu();
			 bbgView.jta_display.setText("");
			 bbgView.jtf_input.setText("");
			 bbgView.jtf_input.requestFocus();
		}
	}

}
