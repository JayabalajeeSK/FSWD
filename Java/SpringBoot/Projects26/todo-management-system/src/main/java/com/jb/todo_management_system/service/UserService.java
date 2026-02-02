package com.jb.todo_management_system.service;

import java.util.List;

import com.jb.todo_management_system.entity.User;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
