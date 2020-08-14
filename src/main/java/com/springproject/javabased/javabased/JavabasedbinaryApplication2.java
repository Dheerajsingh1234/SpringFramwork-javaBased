package com.springproject.javabased.javabased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springproject.javabased.javabased.binaryimplement.Binaryimplement;

@Configuration
@ComponentScan("com.springproject.javabased.javabased.binaryimplement")
public class JavabasedbinaryApplication2 {

	public static void main(String[] args) {
		//SpringApplication.run(JavabasedApplication.class, args);
		ApplicationContext contecxt=new AnnotationConfigApplicationContext(JavabasedbinaryApplication2.class);
		Binaryimplement msg= contecxt.getBean(Binaryimplement.class);
		int num=msg.binary(new int[] {1, 2,3},2);
		System.out.println(num);
	}

}
