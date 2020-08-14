package com.springproject.javabased.javabased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springproject.javabased.javabased.beanannoataion.TextEditor;
import com.springproject.javabased.javabased.beanannoataion.TextEditorConfig;
import com.springproject.javabased.javabased.binaryimplement.Binaryimplement;


@ComponentScan("com.springproject.javabased.javabased.beanannoataion")
public class JavabasedbeanApplication3 {

	public static void main(String[] args) {
		//SpringApplication.run(JavabasedApplication.class, args);
		ApplicationContext contecxt=new AnnotationConfigApplicationContext(TextEditorConfig.class);
		
		TextEditor te =contecxt.getBean(TextEditor.class);
	     // te.spellCheck();
	}
}
