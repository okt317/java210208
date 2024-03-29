package mvc.address;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ModifyDialog extends JDialog {

	// 입력, 수정, 조회 화면에 사용할 컴포넌트를 선언합니다.
	private JLabel labelName;
	private JTextField txtName;
	private JLabel labelAddr;
	private JTextField txtAddress;
	private JLabel labelTel;
	private JTextField txtTel;
	private JLabel labelRel;
	private JTextField txtRelationShip;
	private JLabel labelGender;
	private JComboBox comboGender;
	private JLabel labelBirth;
	private JTextField txtBirthDay;
	private JLabel labelComment;
	private JTextArea txtComment;
	private JLabel labelRegDate;
	private JTextField txtRegDate;
	private JScrollPane scrollPane;
	private JScrollPane scrollComment;
	private JPanel panel;
	private JPanel panelBtn;
	private Font font;

	private Frame parent;
	private String title;

	private JButton btnOk;
	private JButton btnCancel;

	private JOptionPane optionDlg;
	public AddressVO avo = null;
	public static AddressBook abook = null;
	private boolean isCancel;
	// 생성자는 컴포넌트들을 초기화하는 작업만 합니다.
	public ModifyDialog(){
		initComponents();
	}
	public ModifyDialog(JFrame frm) {
		initComponents();
	}

	// 컴포넌트들을 설정하고 배치합니다.
	private void initComponents() {
		// 데이터 칼럼명을 보여줄 레이블을 정의합니다.
		labelName = new JLabel("이름(필수입력) ");
		labelAddr = new JLabel("주소 ");
		labelTel = new JLabel("전화번호 ");
		labelRel = new JLabel("관계 ");
		labelGender = new JLabel("성별 ");
		labelBirth = new JLabel("생일(YYYYMMDD) ");
		labelComment = new JLabel("비고 ");
		labelRegDate = new JLabel("수정일 ");

		labelName.setFont(font);
		labelAddr.setFont(font);
		labelTel.setFont(font);
		labelRel.setFont(font);
		labelGender.setFont(font);
		labelBirth.setFont(font);
		labelComment.setFont(font);
		labelRegDate.setFont(font);

		// 데이터를 보여줄 텍스트 필드등을 정의합니다.
		txtName = new JTextField(20);
		txtAddress = new JTextField(20);
		txtTel = new JTextField(20);
		txtRelationShip = new JTextField(20);
		txtBirthDay = new JTextField(20);
		txtComment = new JTextArea(3, 20);
		scrollComment = new JScrollPane(txtComment);
		txtRegDate = new JTextField(20);

		String [] genderList= {"남자", "여자"};
		comboGender = new JComboBox(genderList);

		// 버튼을 정의합니다.
		btnOk= new JButton("확인");
		btnOk.setFont(font);
		btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	System.out.println("확인 버튼");
                btnOkayActionPerformed(evt);
            }
        });

		btnCancel = new JButton("취소");
		btnCancel.setFont(font);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println("취소 버튼");
				btnCancelActionPerformed(evt);
			}
		});

		panel = new JPanel();
		// Layout manager를 사용하지 않고 직접 컴포넌트들의 위치를 정해줍니다.
		panel.setLayout(null);

		labelName.setBounds(20,20, 100,20);
		txtName.setBounds(120,20, 150,20);

		labelAddr.setBounds(20, 45, 100,20);
		txtAddress.setBounds(120,45, 150,20);

		labelTel.setBounds(20,70, 100,20);
		txtTel.setBounds(120,70, 150, 20);

		labelRel.setBounds(20,95, 100,20);
		txtRelationShip.setBounds(120,95, 150,20);

		labelGender.setBounds(20,120, 100,20);
		comboGender.setBounds(120, 120, 150,20);
  		comboGender.setFont(new java.awt.Font("굴림", 0, 12));

		labelBirth.setBounds(20,145, 100,20);
		txtBirthDay.setBounds(120,145, 150,20);

		labelComment.setBounds(20, 170, 100,20);
		scrollComment.setBounds(120,170, 250,60);

		labelRegDate.setBounds(20, 235, 100,20);
		txtRegDate.setBounds(120,235, 150,20);
		txtRegDate.setEditable(false);

		// 컴포넌트들을 패널에 붙입니다.
		panel.add(labelName);
		panel.add(txtName);
		panel.add(labelAddr);
		panel.add(txtAddress);
		panel.add(labelTel);
		panel.add(txtTel);
		panel.add(labelRel);
		panel.add(txtRelationShip);
		panel.add(labelGender);
		panel.add(comboGender);
		panel.add(labelBirth);
		panel.add(txtBirthDay);
		panel.add(labelComment);
		panel.add(scrollComment);
		panel.add(labelRegDate);
		panel.add(txtRegDate);

		panel.add(btnOk);
		panel.add(btnCancel);

		panelBtn= new JPanel();

		panelBtn.add(btnOk);
		panelBtn.add(btnCancel);

		scrollPane = new JScrollPane(panel);

		setTitle(title);

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		getContentPane().add(panelBtn, BorderLayout.SOUTH);

		setSize(430,400);
		setVisible(true);
	}


	// 확인버튼 선택시 작업을 정의합니다.
  	private void btnOkayActionPerformed(ActionEvent evt) {

	}

	public void setValue(AddressVO vo) {

	}

	// 취소버튼 선택시 작업을 정의합니다.
	private void btnCancelActionPerformed(ActionEvent evt) {

	}

	// 각 컬럼의 값들을 설정하거나 읽어오는 getter/setter 메쏘드입니다.
	public String getName() { return txtName.getText(); }
	public void setName(String strName) { txtName.setText(strName); }
	public String getAddress() { return txtAddress.getText(); }
	public void setAddress(String strAddress) { txtAddress.setText(strAddress); }
	public String getTel() { return txtTel.getText(); }
	public void setTel(String strTel) { txtTel.setText(strTel); }
	public String getRelationShip() { return txtRelationShip.getText(); }
	public void setRelationShip(String strRelation) { txtRelationShip.setText(strRelation); }
	public String getBirthDay() { return txtBirthDay.getText(); }
	public void setBirthDay(String strBirth) { 	txtBirthDay.setText(strBirth); }
	public void setRegDate(String strReg) { txtRegDate.setText(strReg); }
	public String getGender() {
		if (comboGender.getSelectedItem().equals("남자")) return "1";
		else return "2";
	}
	public void setGender(String strGender) {
		if (strGender.equals("1"))  comboGender.setSelectedItem("남자");
		else comboGender.setSelectedItem("여자");
	}
	public String getComment() { return txtComment.getText(); }
	public void setComment(String strComment) { txtComment.setText(strComment); }
	public String getRegDate() { return txtRegDate.getText(); }
	
}
