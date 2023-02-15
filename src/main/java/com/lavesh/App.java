package com.lavesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lavesh.bean.MyClass;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Javaconfig.class);

		MyClass myClass = applicationContext.getBean(MyClass.class);

		myClass.check(0);
	}
}
