package com.lavesh.bean;

import org.springframework.stereotype.Component;

@Component
public class MyClass {

	public void check(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("0 or less than 0 detected");
		}
	}
}
