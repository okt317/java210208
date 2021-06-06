package book.ch7;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObjectArray2 {

   public static void main(String[] args) {
      JFrame jf = new JFrame();
      jf.setLayout(new GridLayout(1,3));
      JButton jbtn_first = new JButton();
      jbtn_first.setText("0");
      jf.add(jbtn_first);
      JButton jbtn_second = new JButton();
      jbtn_second.setText("1");
      jf.add(jbtn_second);
      JButton jbtn_third = new JButton();
      jbtn_third.setText("2");
      jf.add(jbtn_third);
      jf.setSize(300, 200);
      jf.setVisible(true);
   }
}
