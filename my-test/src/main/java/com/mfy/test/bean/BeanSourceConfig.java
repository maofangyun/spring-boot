package com.mfy.test.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration(proxyBeanMethods = false)
@PropertySource("classpath:/bean.properties")
public class BeanSourceConfig {

	@Bean
	@ConfigurationProperties("bean")
	public BeanProperties getBeanProperties(){
		return new BeanProperties();
	}
}
