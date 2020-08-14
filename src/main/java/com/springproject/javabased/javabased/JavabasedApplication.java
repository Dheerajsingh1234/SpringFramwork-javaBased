package com.springproject.javabased.javabased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
public class JavabasedApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavabasedApplication.class, args);
		ApplicationContext contecxt=new AnnotationConfigApplicationContext(JavabasedApplication.class);
		message msg= contecxt.getBean(message.class);
		msg.mes1();
	}

}
