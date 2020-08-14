package com.springproject.javabased.javabased.xmlbased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springproject.javabased.javabased.binaryimplement.Binaryimplement;
import com.springproject.javabased.javabased.xmlbased.xmlBinaryimplement;


public class xmlbinaryApplication3 {

	public static void main(String[] args) {
		//SpringApplication.run(JavabasedApplication.class, args);
		ApplicationContext contecxt=new ClassPathXmlApplicationContext("Bean.xml");
		//xmlBinaryimplement msg= (xmlBinaryimplement) contecxt.getBean("binaryimplement");
		//int num=msg.binary(new int[] {1, 2,3},2);
		//System.out.println(num);
		
	}

}
