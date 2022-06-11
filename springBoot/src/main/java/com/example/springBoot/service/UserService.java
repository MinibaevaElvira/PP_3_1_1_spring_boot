package com.example.springBoot.service;

import com.example.springBoot.model.User;

import java.util.List;

public interface UserService {
    public List<User> showAllUsers();
    public void createUser (User user);
    public User findUserById (int id);
    public  void  update(int id, User user);
    public void deleteById(int id);


}
