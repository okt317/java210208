package book.ch5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class SalaryMgr implements ActionListener {
	//선언부 
	JFrame 			  jf_sal 	= null;
	//DefaultTableModel(DataSet역할:data[][],header[])+JTable => 테이블
	String 			  cols[] 	= {"사원명","부서명"};
	String			  data[][]  = new String[0][2];
	JTable			  jtb_sal 	= null;//화면, 양식, 폼을 그린다
	DefaultTableModel dtm_sal 	= null;
	JScrollPane		  jsp_sal	= null;
	JTableHeader	  jth_sal	= null;
	JButton			  jbtns[]	= null;
	JButton			  jbtn		= null;
	String			  jbtns_label[] = {"조회","입력","수정","삭제","종료"};
	JPanel			  jp_north	= null;//이벤트 소스들이다
	//생성자
	public SalaryMgr() {
		jf_sal  = new JFrame();//선언과 생성을 분리해본다 - 차이 - 메모리 로딩(점유)
		//테이블 안에 면에 데이터를 매칭하는데 필요한 클래스 선언(DataSet의 역할을 함 - SELECT문 혹은 저장 프로시저와 연계할 클래스임)
		//웹에서는 JSON의 역할을 수행하는 클래스임
		dtm_sal = new DefaultTableModel(data,cols);
		//테이블의 양식을 작성하는 클래스 생성임
		jtb_sal = new JTable(dtm_sal);
		//JTable에 스크롤 바를 그려줄 속지 클래스 생성
		jsp_sal = new JScrollPane(jtb_sal);
		//메소드를 통해서 객체를 주입받을 수 있다 - 잘하는 사람, 같이 밥먹자
		//테이블의 헤더를 그려줄 클래스 생성
		jth_sal = jtb_sal.getTableHeader();
		//버튼 추가
		jp_north = new JPanel();
		jp_north.setLayout(new GridLayout(1,4,3,3));
		jbtns = new JButton[jbtns_label.length];
		for(int i = 0;i<jbtns_label.length;i++) {
			jbtn = new JButton(jbtns_label[i]);
			jbtns[i] = jbtn;//버튼 객체 배열과 동기화 처리하기
			jp_north.add(jbtn);
			//이벤트 소스와 이벤트 처리 핸들러 메소드 매칭
			jbtns[i].addActionListener(this);//this는 현재 활성화된 객체 주소번지 SalaryMgr
			
		}
		initDisplay();
	}
	
	//화면처리부
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
		jth_sal.setBackground(Color.green);//API활용 능력 키워준다
		//컬럼의 순서 바뀌지 않도록 설정하기
		jth_sal.setReorderingAllowed(false);
		jf_sal.add("Center", jsp_sal);
		jf_sal.add("North", jp_north);
		jf_sal.setTitle("급여명세서");
		jf_sal.setSize(400,300);
		jf_sal.setVisible(true);
	}
	
	//main
	public static void main(String[] args) {
		new SalaryMgr();
	}
	public void getEmpDetail(int pempno) {
		EmpVO eVO = new EmpVO();
		eVO.setEname("이순신");
		DeptVO dVO = new DeptVO();
		dVO.setDname("개발1팀");
		eVO.setdVO(dVO);//issue
		//java.util에서 제공되는 클래스로 타입에 대한 제약없이 늘었다 줄었다함
		//연관있는 레코드를 한번에 밀어넣기 위해서 사용함
		
		Vector oneRow = new Vector();
		oneRow.addElement(eVO.getEname());
		oneRow.addElement(eVO.getdVO().getDname());//확인
		dtm_sal.addRow(oneRow);
		
		/*for(int r;r<1;r++) {
		dtm_sal.setValueAt(eVO.getEname(), r, 0);
		dtm_sal.setValueAt(eVO.getdVO().getDname(), r, 1);
		dtm_sal.setValueAt(eVO.getDname(), r, 1);
		}
		 */
		
	}///////end of getEmpDetaol

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj=ae.getSource();//버튼의 주소번지를 출력함
		String command = ae.getActionCommand();//버튼의 라벨값을 출력함
		//너 종료 버튼 누른거야? 네
		if("종료".equals(command)) {
		//if(jbtns[4]==obj) {
			System.out.println("종료버튼 이벤트 감지됨");
			//자바 가상머신과의 연결고리 끊어줌 - 가비지 컬렉터에 의해서 Candidate상태로 빠짐
			System.exit(0);
			//System.gc();//쓰레기값 청소해주세요; 호출하더라도 스레드에 의해 순서대로 처리됨. 즉시 처리안됨
		}
		else if("조회".equals(command)) {
			System.out.println("조회버튼 이벤트 감지됨");
			getEmpDetail(7566);

			
		}
	}//////// end of actionPerformed /////////

}
