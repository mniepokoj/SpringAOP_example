package com.example;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(User user) {
        System.out.println("Tworzenie użytkownika: " + user.getName());
    }

    public void updateUser(User user) {
        System.out.println("Aktualizacja użytkownika: " + user.getName());
    }

    public void deleteUser(int userId) {
        System.out.println("Usuwanie użytkownika o id: " + userId);
    }
}