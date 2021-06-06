package common.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.util.DBConnectionMgr;

public class MemberDao {
	Connection			con		= null;
	CallableStatement	cstmt	= null;
	DBConnectionMgr dbmgr = null;
	public String login(String p_id, String p_pw) {
		dbmgr = DBConnectionMgr.getInstance();
		String msg = "";
		try {
			con = dbmgr.getConnection();
			cstmt = con.prepareCall("{call proc_login80(?,?,?)}");
			cstmt.setString(1, p_id);
			cstmt.setString(2, p_pw);
			cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
			int result = 0;
			result = cstmt.executeUpdate();
			System.out.println(result);
			if(result==1) {
				msg = cstmt.getString(3);
			}
			System.out.println(cstmt.getString(3));
		} catch (SQLException se) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			dbmgr.freeConnection(con, cstmt);
		}
		return msg;
	}
	public String gaip(String p_id, String p_pw) {
		dbmgr = DBConnectionMgr.getInstance();
		String msg = "";
		try {
			con = dbmgr.getConnection();
			cstmt = con.prepareCall("{call proc_gaip(?,?,?)}");
			cstmt.setString(1, p_id);
			cstmt.setString(2, p_pw);
			cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
			int result = 0;
			result = cstmt.executeUpdate();
			if(result==1) {
				msg = cstmt.getString(3);
			}
			System.out.println(cstmt.getString(3));
		} catch (SQLException se) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			dbmgr.freeConnection(con, cstmt);
		}
		return msg;
	}
	public static void main(String[] args) {
		MemberDao md = new MemberDao();
		md.login("test", "123");
	}
}
