package kr.co.itcen.aoptest;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public void hello() {
		System.out.println("Hello World");
	}
}
