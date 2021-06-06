package book.ch6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;

class Outter{
	Logger logger = LogManager.getLogger(Outter.class);
	int i = 5;
	Outter(){
		System.out.println("Outer 호출");
	}
	
	
	class Inner{
		int j = 10;
		public void go() {
			logger.info("go 호출");
			System.out.println("go 호출");
		
		}
	}
	public void print() {
		logger.info("pring() 호출");
		System.out.println("pring() 호출");
	}
}
public class OutterInnerTest {
	
	public static void main(String[] args) {
		System.setProperty
		(XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY, "C:\\git_java202108\\java210208\\java210208\\log4j.xml");
		Logger logger = LogManager.getLogger(OutterInnerTest.class);
		Outter outter = new Outter();
		outter.print();
		Outter.Inner inner = outter.new Inner();
		inner.go();
		
	}
	

}
