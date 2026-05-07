package com.example.demo;

import com.example.Loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        // Greeting Bean
        greetingService greetingService =
                (greetingService) context.getBean("myBean");

        greetingService.sayHello();

        // UserService Bean
        UserService userService =
                (UserService) context.getBean("userService");

        userService.notifyUser("whats up");
    }
}