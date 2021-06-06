package athread.talk2;

import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;

/*****
 * 이벤트 핸들러의 역할은 말하기이고
 * 클라이언트 측의 스레드 역할은 듣기이다
 * @author 111
 */
public class TomatoClientThread extends Thread {
	TomatoClientVer2 tc = null;
	public TomatoClientThread(TomatoClientVer2 tc) {
		this.tc = tc;
	}
	@Override
	public void run() {
		
		boolean isStop = false;
		while(!isStop) {
			try {
				String msg = "";//100#apple
				msg = (String)tc.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;//100|200|201|202|500
				if(msg !=null) {
					st = new StringTokenizer(msg,"#");
					protocol = Integer.parseInt(st.nextToken());//100
				}
				switch(protocol) {
					case Protocol.ROOM_IN:{//100#apple
						String nickName = st.nextToken();
//						tc.jta_display.append(nickName+"님이 입장하였습니다.\n");
						MutableAttributeSet attr = new SimpleAttributeSet();
						try {
							tc.sd_display.insertString(tc.sd_display.getLength(), nickName+ "님이 입장했슴다. \n", attr);
						} catch (Exception e) {
							e.printStackTrace();
						}
						Vector<String> v = new Vector<>();
						v.add(nickName);
						tc.dtm.addRow(v);
					}break;
					case Protocol.MESSAGE:{
						String nickName = st.nextToken();
						String message = st.nextToken();
						MutableAttributeSet attr = new SimpleAttributeSet();
						try {
							tc.sd_display.insertString(tc.sd_display.getLength(), "["+nickName+"]"+message+"\n", attr);
						} catch (Exception e) {
							e.printStackTrace();
						}
						//새로 메세지가 들어올 때 자동으로 포서크 이동처리
						tc.jtp_display.setCaretPosition
						(tc.sd_display.getLength());	
						

					}break;
					//300#하하#하늘소#하하가 하늘소로 대화명 변경
					case Protocol.CHANGE:{
						String nickName = st.nextToken();
						String afterName = st.nextToken();
						String msg1 = st.nextToken();
						for(int i=0;i<tc.dtm.getRowCount();i++) {
							//기존 대화명 가져오기
							String currentName = (String)tc.dtm.getValueAt(i, 0);
							if(currentName.equals(nickName)) {
								//테이블의 defaulttablemodel 갱신처리
								tc.dtm.setValueAt(afterName, i, 0);
								break;
							}
								
							}
						try {
							tc.sd_display.insertString(tc.sd_display.getLength(), msg1+"\n", null);
						} catch (Exception e) {
							e.printStackTrace();
							// TODO: handle exception
						}
						tc.jtp_display.setCaretPosition(tc.sd_display.getLength());
						if(nickName.equals(tc.nickName)) {
							tc.setTitle(afterName+"님의 대화창");
							tc.nickName = afterName;//동기화 할것..중요
						}

					}break;
					case Protocol.ROOM_OUT:{
						String nickName = st.nextToken();
						MutableAttributeSet attr = new SimpleAttributeSet();
						try {
							tc.sd_display.insertString(tc.sd_display.getLength(), nickName+"님이 퇴장 하였습니다.\n", attr);
						} catch (Exception e) {
							e.printStackTrace();
						}
						tc.jtp_display.setCaretPosition
						(tc.sd_display.getLength());	
						for(int i=0;i<tc.dtm.getRowCount();i++) {
							String n =(String)tc.dtm.getValueAt(i, 0);
							if(n.equals(nickName)) {
								tc.dtm.removeRow(i);
							}
						}
					}break;
				}////////////end of switch
			} catch (Exception e) {
				// TODO: handle exception
			}
		}////////////////////end of while		
	}
}
