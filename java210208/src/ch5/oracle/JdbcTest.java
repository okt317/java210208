package ch5.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vo.EmpVO;

/*
 * 물리적으로 떨어져 있는 서버에 접속하려고 한다
 * 서버 컴터의 오라클 제품에 접속하려면 해당 회사가 제공하는 드라이버 클래스가 있어야 한다
 * 따라서 우리는 ojdbc6.jar를 주입 받을 수 있도록 등록하였다
 * build path - C:\app\111\product\11.1.0\db_1\jdbc\lib
 */
public class JdbcTest {
	//선언부
	static final String _DRIVER = "oracle.jdbc.driver.OracleDdriver";
	static final String _URL	= "jdbc:oracle:thin:@172.30.1.30:1521:orcl11";
	String				_USER	= "scott";
	String				_PW		= "tiger";
	//물리적으로 떨어져있는 서버에 연결 통로 만들기
	Connection			con	 	= null;
	//24번 서버에 내가 작성한 select문을 전달해줄 객체 선언
	PreparedStatement 	pstmt 	= null;
	//오라클의 커서를 조작하는 객체 선언
	ResultSet			rs		= null;
	//생성자
	public JdbcTest() {
		String sql = "SELECT empno, ename, sal FROM emp";
		try {
			//오라클 드라이버 클래스 로딩하기
			Class.forName(JdbcTest._DRIVER);
			//연결통로 확보하기
			con = DriverManager.getConnection(_URL, _USER, _PW);
			//오라클 서버에 select문을 전달할 전령 객체 생성
			pstmt = con.prepareStatement(sql);
			//오라클에 살고 있는 커서 조작 위해서 자바가 제공하는 객체 생성
			rs = pstmt.executeQuery();
			EmpVO eVO = null;
			while(rs.next()) {
				eVO = new EmpVO();
				eVO.setEmpno(rs.getInt("empno"));
				eVO.setEname(rs.getString("ename"));
				eVO.setSal(rs.getDouble("sal"));
				//int 	rempno 		 = rs.getInt("empno");//숫자보단 직관적이라서
				//String  rename 	 = rs.getString("ename");
				//Double  sal		 = rs.getDouble("sal");
				System.out.println(eVO.getEmpno()+" , "+eVO.getEname()+" + "+eVO.getSal());
			}
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 클래스 로딩실패");
			return;
		}catch (SQLException se) {
			//부적합한 식별자입니다. 라는 오류가 올 수 있다
			System.out.println("SQLException:"+se.getMessage());//좀 더 구체적인 예외처리 클래스 정보를 알 수 있다
		}
		System.out.println("요기");
	}
	//오라클 서버 접속
	public static void main(String[] args) {
		JdbcTest jt = new JdbcTest();//생성자 호출도 동시에 일어납니다
	}

}
