package com.news.user.service;

import com.news.user.model.User;
import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}