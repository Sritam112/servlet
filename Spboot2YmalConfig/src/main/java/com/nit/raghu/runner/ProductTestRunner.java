package com.nit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.raghu.Product;
@Component
public class ProductTestRunner implements CommandLineRunner{

	@Autowired 
	private Product pro;
	
	public void run(String... args) throws Exception {
		System.out.println(pro);
	}

}
