package athread.talk2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

public class TomatoServerThread  extends Thread {
		TomatoServer ts = null;
		Socket client = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String chatName = null;//현재 서버에 입장한 클라이언트 스레드 닉네임 저장
		public TomatoServerThread(TomatoServer ts) {
			this.ts = ts;
			
			this.client = ts.socket;
			try {
				oos = new ObjectOutputStream(client.getOutputStream());
				ois = new ObjectInputStream(client.getInputStream());
				//130#처음들어온사람[청취]
				String msg = (String)ois.readObject(); //듣기
				ts.jta_log.append(msg+"\n");//서버에 출력
				StringTokenizer st = new StringTokenizer(msg,"#"); //자르기
				st.nextToken();//130
				chatName = st.nextToken();//은영님
				ts.jta_log.append(chatName+"님이 입장하였습니다.\n");
				for(TomatoServerThread tst:ts.globalList) {
				//이전에 입장해 있는 친구들 정보 받아내기
					//String currentName = tst.chatName;
					this.send(Protocol.ROOM_IN+"#"+tst.chatName);
				}
				//현재 서버에 입장한 클라이언트 스레드 추가하기
				ts.globalList.add(this); //앞에 for문은 안타고 thread 추가됨 
				this.broadCasting(msg);//방송 - 1명에게만 전송
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}////end of TomatoServerThread
		
		//현재 입장해 있는 친구들 모두에게 메시지 전송하기 구현
		public void broadCasting(String msg) {
			for(TomatoServerThread tst:ts.globalList) {//globalList.size()=1 -> 2
				tst.send(msg);//나한테만 , 희태님 //this.send를 쓰면 희태한테만 간다
			}
		}
		//클라이언트에게 말하기 구현
		public void send(String msg) {
			try {
				oos.writeObject(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void run() {
			String msg = null;
			boolean isStop = false;
			try {
				//while(true) {//무한루프에 빠질 수 있다.
				run_start:
				while(!isStop) {
					msg = (String)ois.readObject();
					ts.jta_log.append(msg+"\n");
					ts.jta_log.setCaretPosition
					(ts.jta_log.getDocument().getLength());
					StringTokenizer st = null;
					int protocol = 0;//100|200|201|202|500
					if(msg !=null) {
						st = new StringTokenizer(msg,"#");
						protocol = Integer.parseInt(st.nextToken());//100
					}
					switch(protocol) {
						case Protocol.MESSAGE:{
							String nickName = st.nextToken();
							String message = st.nextToken();
							broadCasting(201
									   +"#"+nickName
									   +"#"+message);
						}break;
						case Protocol.CHANGE:{//300#하하#하늘소
							String nickName = st.nextToken();
							String afterName = st.nextToken();
							String msg1 = st.nextToken();
							this.chatName = afterName;//서버측 이름과 동기화 주의할 것
							broadCasting(Protocol.CHANGE
									+Protocol.seperator+nickName
									+Protocol.seperator+afterName
									+Protocol.seperator+msg1
									);
							
						}break;
						case Protocol.ROOM_OUT:{
							String nickName = st.nextToken();
							ts.globalList.remove(this);
							broadCasting(500
									+"#"+nickName);
						}break run_start;
					}/////////////end of switch
				}/////////////////end of while			
			} catch (Exception e) {
				// TODO: handle exception
			}
		}/////////////////////////end of run
		
}
