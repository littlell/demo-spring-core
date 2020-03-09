package com.demo.spring.core02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    HelloBean helloBean = context.getBean("helloBean", HelloBean.class);
    HelloBean helloRenameBean = context.getBean("helloRenameBean", HelloBean.class);
    System.out.println(helloBean);
    System.out.println(helloRenameBean);
  }
}
