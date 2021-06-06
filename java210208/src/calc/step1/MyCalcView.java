package calc.step1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalcView extends JFrame{      
	   //선언부   
	   private JTextField jtf_result = null;   
	   private JButton jbt_one = null;   
	   private JButton jbt_two = null;   
	   private JButton jbt_plus = null;   
	   private JButton jbt_equals = null;   
	   private JButton jbt_clear = null;   
	   private JPanel jp_pad = null;   
	   MyCalcLogic myLogic = null;
	   MyCalcLogic myEventHandler = null;   
	   //생성자   
	   public MyCalcView(){   
	      initDisplay();
	   }   
	   //화면처리부   
	   public void initDisplay()   
	   {   
	      jtf_result = new JTextField();
	      jtf_result.setHorizontalAlignment(JTextField.RIGHT);
	      jbt_one = new JButton("1");
	      jbt_two = new JButton("2");
	      jbt_plus = new JButton("+");
	      jbt_equals = new JButton("=");
	      jbt_clear = new JButton("C");
	      myLogic = new MyCalcLogic(this);
	      jtf_result.addActionListener(myLogic);
	      jbt_one.addActionListener(myLogic);
	      jbt_two.addActionListener(myLogic);
	      jbt_plus.addActionListener(myLogic);
	      jbt_equals.addActionListener(myLogic);
	      jbt_clear.addActionListener(myLogic);
	      jp_pad = new JPanel(new GridLayout(1,5,2,2));
	      jp_pad.add(jbt_one);
	      jp_pad.add(jbt_two);
	      jp_pad.add(jbt_plus);
	      jp_pad.add(jbt_equals);
	      jp_pad.add(jbt_clear);
	      this.getContentPane().add("North",jtf_result);
	      this.getContentPane().add("Center",jp_pad);
	      this.setTitle("전자계산기");
	      this.setSize(300,150);
	      this.setVisible(true);
	   }   
	   //main메소드   
	   public static void main(String[] args) {   
	      new MyCalcView();
	   }
	   public JTextField getJtf_result() {
	      return jtf_result;
	   }
	   public JButton getJbt_one() {
	      return jbt_one;
	   }
	   public JButton getJbt_two() {
	      return jbt_two;
	   }
	   public JButton getJbt_plus() {
	      return jbt_plus;
	   }
	   public JButton getJbt_equals() {
	      return jbt_equals;
	   }
	   public JButton getJbt_clear() {
	      return jbt_clear;
	   }
	   public JPanel getJp_pad() {
	      return jp_pad;
	   }
	   public MyCalcLogic getMyLogic() {
	      return myLogic;
	   }
	   public MyCalcLogic getMyEventHandler() {
	      return myEventHandler;
	   }   
	      
	}      