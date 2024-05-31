package org.example;

import org.example.employee.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
        Employee emp =(Employee) context.getBean("emp");
        System.out.println(emp);
    }
}