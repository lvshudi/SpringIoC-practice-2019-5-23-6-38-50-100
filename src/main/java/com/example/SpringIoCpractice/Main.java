package com.example.SpringIoCpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
	public static void main(String[] args) {
        
        // 创建 Spring 的 IOC 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        // 使用 getBean() 方法, 通过传入刚才的 id 名,来获取 bean, 但是这里返回的是一个 Object 对象, 所以要转型
        Person person = (Person) ctx.getBean("person");
        // 打印 person
        System.out.println(person);
	}
}
