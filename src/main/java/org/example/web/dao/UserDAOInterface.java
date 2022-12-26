package org.example.web.dao;

import org.example.web.entity.User;

import java.util.List;

public interface UserDAOInterface {

    void save(User user);
    void removeUser(long id);

    void editUser(User user);
    List<User> getAllUser();

    User findUser(long id);

}
