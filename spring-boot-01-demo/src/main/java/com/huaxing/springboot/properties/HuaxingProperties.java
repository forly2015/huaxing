package com.huaxing.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置类  把配置文件的信息，读取并自动封装成实体类
 * @author Administrator
 *prefix属性: 表示忽略配置文件中的前缀  比如:spring.datasource.url  在实体类中直接写url 如果不忽略需要写全名才能接收到值
 *ignoreUnknownFields:表示忽略文件中但是本类又没有属性对应的情况
 */
@ConfigurationProperties(prefix="spring.datasource",ignoreUnknownFields=true)
public class HuaxingProperties {
	private String url;
	
	private String username;

	public HuaxingProperties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "HuaxingProperties [url=" + url + ", username=" + username + "]";
	}
	
	
}
