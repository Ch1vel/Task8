package org.example.web.service;

import org.example.web.entity.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserServiceInterface {
    void save(User user);

    void removeUser(long id);

    User findUser(long id);

    List<User> getAllUser();

    void editUser(User user);
}
