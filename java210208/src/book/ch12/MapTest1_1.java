package book.ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest1_1 {
	void methodA(){//List
		List<String> li = new ArrayList<>();
		li.add(0,"딸기");
		li.add("포도");
		li.add("키위");
		for(String fruit:li) {
			System.out.println(fruit);
			
		}
	}
	void methodB(){//Map
		Map<String,Object> map = new HashMap<>();
		map.put("one","딸기");
		map.put("two","포도");
		map.put("three","키위");
		Object keys[] = null;
		Set set = map.keySet();
		keys = set.toArray();
//		System.out.println(keys);
		for(int i = 0;i<keys.length;i++) {
			String key = (String)keys[i];
			String val = String.valueOf(map.get(key));
			System.out.println(key+", "+val);
		}
	}

	public static void main(String[] args) {
		MapTest1_1 mt1 = new MapTest1_1();
		mt1.methodA();
		mt1.methodB();
		// TODO Auto-generated method stub

	}

}
