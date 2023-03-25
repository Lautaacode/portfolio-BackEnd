package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SUser {
    public User createUser(User user);

    public List<User> getUsers();

    public User getUser(long id);

    public void deleteUser(long id);

    public User updateUser(User user, long id);
}