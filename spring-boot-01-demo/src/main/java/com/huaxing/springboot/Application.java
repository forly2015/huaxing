package com.huaxing.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * springBoot引导类
 * @author Administrator
 */

//@SpringBootApplication默认根据入口类的所在位置扫描包以及入口类所在位置以及子包范围
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

}
