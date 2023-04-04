package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

public class SpringormApplication {

	public static void main(String[] args) {
		System.out.println("hello world");
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Student student = new Student(1122, "keshav koli", "pune");

		int r = studentDao.insert(student);

		System.out.println("Done" + r);
	}
}
