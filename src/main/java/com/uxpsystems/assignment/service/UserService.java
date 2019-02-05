package com.uxpsystems.assignment.service;

import com.uxpsystems.assignment.dao.UserDao;
import com.uxpsystems.assignment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser(Long id) {
        return userDao.findById(id);
    }

    public void addUser(User user) {
        userDao.persist(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public void deleteUser(Long id) {
        userDao.delete(getUser(id));
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void deleteAllUsers() {
        userDao.deleteAll();
    }
}
