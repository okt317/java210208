package di.step;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MapController extends AbstractController {
	private Map<String,String> mapBean = null;
	//mybatis의 경우 java가 아니고 자바코드는 jar의 형태로 주입되므로
	//constructor 주입법으로 처리한다
	//DB커넥션 풀도 자바 표준에서 제공하는 것은 아니니까
	//생성자 객체 주입법으로 처리해야 할 것이다.(xml에서 처리하는 것) 
	//setter객체주입법 - java

	public void setMapBean(Map<String,String> mapBean) {
		this.mapBean = mapBean;
	}
	public ModelAndView handleRequestInternal(HttpServletRequest req
			, HttpServletResponse res) {
		System.out.println(mapBean.get("prop1"));
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	

}
