package com.demo.spring.core14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    OrderService orderService = context.getBean("orderService", OrderService.class);

    System.out.println(orderService);
  }
}
