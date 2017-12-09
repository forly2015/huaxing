package com.huaxing.springboot.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huaxing.springboot.properties.HuaxingProperties;

/**
 * 创建处理器用于测试springBoot的初次运行
 * @author Administrator
 *
 */
//该注解是一个组合注解 相当于@ResponseBody ＋ @Controller合在一起的作用。
//返回值是直接转换为json数据输出而不是返回视图
@RestController
@EnableConfigurationProperties(HuaxingProperties.class)//引入配置类
public class HelloController {
	
	
	/**
	 * 注入读取配置文件对象
	 */
	@Autowired
	private Environment environment;
	
	/**
	 * sayHello方法
	 * @return
	 * 
	 * 测试配置文件的读取方式一
	 */
	@RequestMapping("/test1")
	public String sayHello(){
		
		//读取配置文件方式一
		System.out.println("a配置文件为"+environment.getProperty("a-name"));
		System.out.println("b配置文件为"+environment.getProperty("b-name"));
		
		
		return "hello world";
	}
	/**
	 * @return
	 * 
	 * 测试配置文件的读取方式二
	 * 使用@value注解
	 */
	@Value("${a-name}")
	private String aName;
	@Value("${b-name}")
	private String bName;
	
	
	@RequestMapping("/test2")
	public String test2(){
		
		//读取配置文件方式一
		System.out.println("a配置文件为"+aName);
		System.out.println("b配置文件为"+bName);
		return "hello world";
	}
	
	
	
	/**
	 * @return
	 * 
	 * 测试配置文件的读取方式三
	 * 使用配置类的方式将配置文件转化为类
	 * 需要注入配置类
	 */
	@Autowired
	private HuaxingProperties properties;
	
	
	@RequestMapping("/test3")
	public String test3(){
		
		//读取配置文件方式一
		System.out.println("配置文件"+properties.getUrl());
		System.out.println("b配置文件为"+properties.getUsername());
		
		
		return "正在测试读取配置类文件方式三,清查看控制台输出的数据";
	}
	
	
	/**
	 * 配置文件总结
	 * springboot默认会读取resource文件夹下面的application.properties/yml配置文件
	 * 两种文件只能选择一种  如果同时存在默认会读取properties文件
	 * 
	 * yml只是文件格式不一样  
	 * 
	 * 读取配置文件的三种方式
	 * 1.在容器中获取environment对象来通过方法获取配置文件内容
	 * 2.使用"@Value"将配置文件的值注入
	 * 3.使用配置类的方式将配置文件的内容转到实体类上面在调用实体类获得
	 */
	
	
}
