package ch5.oracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.util.DBConnectionMgr;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;

/**************************************************************************************
 * 대량의 정보를 조회시 오라클에서 제공하는 REFCURSOR를 활용할 수 있다
 * @author 111
 * create or replace procedure gobuk.proc_temp_list(p_temp OUT sys_refcursur)
	is
	begin
    	open p_temp
    	for select EMP_ID, EMP_NAME, LEV from temp;
	end;
	JDBC연동 기술은 공통된 관심사이다
	매번 동시 접속자 수가 많을 수 있고 다중 처리를 해야 하므로 DB커넥션 풀링을 고려해야 한다 - tomcat에서 제공되는 풀링이 있다
 ***************************************************************************************/
public class REFCursorTest {
	Connection 					con 	= null;
	CallableStatement 			cstmt	= null;
	OracleCallableStatement 	ocstmt 	= null;
	ResultSet 					rs 		= null;
	DBConnectionMgr 			dbMgr   = null;
	public void init() {
		dbMgr = DBConnectionMgr.getInstance();//#3 싱글톤
	}
	public List<Map<String,Object>> getTempList(){
		List<Map<String,Object>> list = new ArrayList<>();
		try {
			con = dbMgr.getConnection();
			cstmt = con.prepareCall("{call proc_temp_list(?)}");
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.execute();
			ocstmt = (OracleCallableStatement)cstmt;
			rs = ocstmt.getCursor(1);
			Map<String,Object> rmap = null;
			while(rs.next()) {
				rmap = new HashMap<>();
				rmap.put("emp_id",rs.getInt("emp_id"));
				rmap.put("emp_name",rs.getString("emp_name"));
				rmap.put("lev",rs.getString("lev"));
				list.add(rmap);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}
	public static void main(String[] args) {
		REFCursorTest rt = new REFCursorTest();
		rt.init();
		List<Map<String,Object>> list = rt.getTempList();
		for(Map<String,Object> pMap:list) {
			System.out.println(pMap);
		}
	}
}