package com.demo.spring.core09;

import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserBean user1=  context.getBean("user1", UserBean.class);
        UserBean user2=  context.getBean("user2", UserBean.class);

        System.out.println(user1);
        System.out.println(user2);
    }
}
