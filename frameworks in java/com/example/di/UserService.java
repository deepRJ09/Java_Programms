package com.example.di;

public interface UserService {
    @LogExecutionTime
    void registrationUser(String username);
}
