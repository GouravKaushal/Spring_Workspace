package com.zensar.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.zensar.spring.beans.Student;

public class App {
	public static void main(String[] args) {
		// ApplicationContext context=new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context;
		Resource resource = new FileSystemResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Student student = (Student) beanFactory.getBean("student");
		System.out.println(student);
		System.out.println(student.hashCode());

		Student student1 = (Student) beanFactory.getBean("student");
		System.out.println(student1);
		System.out.println(student1.hashCode());
	}
}
