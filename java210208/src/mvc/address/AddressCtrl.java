package mvc.address;

import java.util.List;

public class AddressCtrl {

	private AddressVO returnVO = new AddressVO();
	//아래와 비교되는 값들은 모두 addressBook에서 받아오거나 또는 ModifyDialog에서 받아와야 한다
	//ModifyDialog에서는 입력 , 수정만 처리한다
	//Insert Into addDB(컬럼명,,,) Values(?,?,,,)
	
	//삭제는 addressBook 의 JTable에서 직접 처리한다. Delete from addrDB Where ano = 5;
	//command = delete;
	//ano = 5;
	private static String _DEL = "delete";
	private static String _INS = "insert";
	private static String _MOD = "update";
	private static String _SEL = "select";
	private static String _ALL = "selectall";

	public AddressCtrl() {
	}
	/**
	 * 입력, 수정, 삭제, 상세조회
	 * @param vo - 사용자가 선택하거나 개발자가 필요로하는 값을 넘길 수 있다
	 * @return returnVO - 입력성공: 1(입력성공), 0(입력실패)
	 * @throws Exception
	 */
	public AddressVO send(AddressVO vo) throws Exception {
		String command = vo.getCommand();
		if(_DEL.equals(command)) {
			DeleteEntity del = new DeleteEntity();
			returnVO = del.delete(vo);
		}else if(_INS.equals(command)) {
			RegisterEntity regi = new RegisterEntity();
			returnVO = regi.insert(vo);
		}else if(_MOD.equals(command)) {
			ModifyEntity modi = new ModifyEntity();
			returnVO = modi.update(vo);
		}else if(_SEL.equals(command)) {
			RetrieveEntity ret = new RetrieveEntity();
			returnVO = ret.select(vo);
		}
		return returnVO;
	}

	public AddressVO[] send() throws Exception {
		AddressVO[] returnVOs = null;
		System.out.println("send () 호출성공 - 반환타입이 AddressVO[]");
		return returnVOs;
	}
	public List<AddressVO> sendAll() throws Exception {
		System.out.println("sendAll () 호출성공 - 반환타입이 List<AddressVO[]>");
		List<AddressVO> selectAll = null;
		return selectAll;
	}	
}
