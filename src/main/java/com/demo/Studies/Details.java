package com.demo.Studies;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Details {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) context.getBean("personBean1");
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAddress());
		System.out.println(person.getNumber());
		File file = new File("src/main/resources/beans.xml");
		System.out.println(file);

	}
}
