package com.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {
	int age = 20;
	List<String> li;
	Map<String, Object> m = new HashMap<>();
	public void methodA() {
//		li.add(0,"딸기");
//		li.add("포도");
		m.put("one","딸기");
		m.put("two","포도");
//		System.out.println(li.toArray());
		System.out.println(m.get("one"));
		System.out.println(m.isEmpty());
		
	}
	public HelloWorld() {
		methodA();
	}
	
	public static void main(String[] args) {
		new HelloWorld();
//		HelloWorld hw = new HelloWorld();
//		hw.age = 30;
//		System.out.println("당신의 나이는 "+hw.age+" 입니다");
	}

}
