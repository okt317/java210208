package mvc.address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.util.DBConnectionMgr;

public class RetrieveEntity {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
//오버로딩에 리턴타입은 영향이 없다.
	/**
	 * 
	 * @param pavo - pavo.getId();
	 * @return AddressVO (or Map)
	 * select id,name, address, telephone, gender
	 * 		, relationship, birthday, comments, registedate
		from mkaddrtb
		where id =:x
	 */
	public AddressVO select(AddressVO pavo) {//무조건 1개 로우만 가능함
		System.out.println("RetrieveEntity select(vo) 호출성공");
		// TODO Auto-generated method stub
		return null;
	}
	public Map<String,Object> selectMap(AddressVO vo) {//조건검색을 할수없다 n개 로우 가능함
		System.out.println("RetrieveEntity select(vo) 호출성공");
		// TODO Auto-generated method stub
		return null;
	}
	public AddressVO[] select() {//n개 로우 가능함
		
		System.out.println("RetrieveEntity selectList() 호출성공");
		StringBuilder sql = new StringBuilder();
		sql.append("select id,name,address,telephone, gender      ");
		sql.append(" , relationship,birthday,comments,registedate ");
		sql.append(" from mkaddrtb                                ");
		DBConnectionMgr dbmgr = DBConnectionMgr.getInstance();
		Vector<AddressVO> v = new Vector<>();
		AddressVO[] aVOS = null;
		try {
			con = dbmgr.getConnection();
//			pstmt = con.prepareStatement(sql.toString());
			pstmt = con.prepareStatement(String.valueOf(sql));
			rs = pstmt.executeQuery();
			AddressVO aVO = null;
			while(rs.next()) {
				aVO = new AddressVO();
				aVO.setId(rs.getInt("id"));
				aVO.setName(rs.getString("name"));
				aVO.setAddress(rs.getString("address"));
				aVO.setTelephone(rs.getString("telephone"));
				aVO.setGender(rs.getString("gender"));
				aVO.setRelationship(rs.getString("relationship"));
				aVO.setBirthday(rs.getString("birthday"));
				aVO.setComments(rs.getString("comments"));
				aVO.setRegistedate(rs.getString("registedate"));
				v.add(aVO);
			}
			aVOS = new AddressVO[v.size()];
			v.copyInto(aVOS);
		} catch (SQLException se) {
			// TODO: handle exception
		} finally {
			dbmgr.freeConnection(con, pstmt, rs);
		}
		
		return aVOS;
	}
	public List<AddressVO> selectList(AddressVO vo) {//n개 로우 가능함
		System.out.println("RetrieveEntity selectList() 호출성공");
		// TODO Auto-generated method stub
		return null;
	}

}
