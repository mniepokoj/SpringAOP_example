package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserService userService = (UserService) context.getBean("userService");

        User user = new User();
        user.setId(1);
        user.setName("John");

        userService.createUser(user);
        System.out.println();
        userService.updateUser(user);
        System.out.println();
        userService.deleteUser(1);
    }

}
