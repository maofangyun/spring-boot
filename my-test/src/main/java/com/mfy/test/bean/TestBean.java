package com.mfy.test.bean;

import com.mfy.custom.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
public class TestBean {

	@Autowired
	private BeanService beanService;

	private HashMap hashMap = new HashMap();

	public TestBean() {
		ClassLoader classLoader = hashMap.getClass().getClassLoader();
		System.out.println("hashMap:" + classLoader);
		System.out.println("TestBean:" + this.getClass().getClassLoader());
	}

	@PostConstruct
	public void show(){
		beanService.show();
	}
}
