package org.example.web.service;

import org.example.web.dao.UserDAO;
import org.example.web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    @Transactional
    public void add(User user) {
        userDAO.save(user);
    }


    public void revoveUser() {

    }


    public List<User> getAllUser() {
        return null;
    }
}
