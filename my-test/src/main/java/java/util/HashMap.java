package java.util;

import org.springframework.stereotype.Component;

@Component
public class HashMap {

	public HashMap(){
		ClassLoader classLoader = this.getClass().getClassLoader();
		System.out.println(classLoader);
	}
}
