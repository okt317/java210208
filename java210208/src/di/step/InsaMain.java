package di.step;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaMain {

	public static void main(String[] args) {
		ApplicationContext context2 = 
				new ClassPathXmlApplicationContext
				("di\\step\\insaBean.xml");
		InsaList insaList = (InsaList)context2.getBean("insa");
		InsaMap insaMap = (InsaMap)context2.getBean("insaMap");
		System.out.println("insaMap ==> "+insaMap);
		System.out.println(insaList);
		System.out.println(insaList.insaBean);
		for(String s:insaList.insaBean) {
			System.out.println(s);
		}
		InsaList insaList2 = new InsaList();
		System.out.println(insaList2);
		System.out.println(insaList2.insaBean);
	}


}
