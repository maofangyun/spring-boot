package com.mfy.test.bean;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class TestBean {
	private HashMap hashMap = new HashMap();
	public TestBean(){
		ClassLoader classLoader = hashMap.getClass().getClassLoader();
		System.out.println("hashMap:"+classLoader);
		System.out.println("TestBean:"+this.getClass().getClassLoader());
	}
}
