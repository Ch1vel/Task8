package org.example.web.service;

import org.example.web.dao.UserDAO;
import org.example.web.dao.UserDAOInterface;
import org.example.web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    private UserDAOInterface userDAO;
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional
    public void removeUser(long id) {
        userDAO.removeUser(id);

    }
    @Transactional
    public User findUser(long id) {
        return userDAO.findUser(id);
    }

    @Transactional
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }
    @Transactional
    public void editUser(User user) {
        userDAO.editUser(user);
    }
}
