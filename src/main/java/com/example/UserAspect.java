package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
public class UserAspect {

    @Before("execution(* com.example.UserService.createUser(..)) && args(user)")
    public void beforeCreateUser(User user) {
        System.out.println("Aspekt: Próba utworzenia użytkownika: " + user.getName());
    }

    @After("execution(* com.example.UserService.createUser(..)) && args(user)")
    public void afterCreateUser(User user) {
        System.out.println("Aspekt: Po utworzeniu użytkownika: " + user.getName());
    }

    @Before("execution(* com.example.UserService.updateUser(..)) && args(user)")
    public void beforeUpdateUser(User user) {
        System.out.println("Aspekt: Próba aktualizacji użytkownika: " + user.getName());
    }

    @After("execution(* com.example.UserService.updateUser(..)) && args(user)")
    public void afterUpdateUser(User user) {
        System.out.println("Aspekt: Zaktualizowano użytkownika: " + user.getName());
    }

    @Before("execution(* com.example.UserService.deleteUser(..)) && args(userId)")
    public void beforeDeleteUser(int userId) {
        System.out.println("Aspekt: Próba usunięcia użytkownika o id: " + userId);
    }

    @AfterReturning("execution(* com.example.UserService.deleteUser(..)) && args(userId)")
    public void afterDeleteUser(int userId) {
        System.out.println("Aspekt: Usunięto użytkownika o id: " + userId);
    }
}