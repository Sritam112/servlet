package com.nit.raghu;

import java.util.Arrays;
import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@ConfigurationProperties(prefix="my.app")
@Component
@Data

public class Product {
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + ", pcost=" + pcost + ", models=" + Arrays.toString(models)
				+ ", clients=" + clients + "]";
	}

	private Integer pid;
	private String pcode;
	private Double pcost;
private String[] models;
	
	private Properties clients;
	//private Map<String,String> clients;
	
	//private LicenceInfo lob;//HAS-A
}
