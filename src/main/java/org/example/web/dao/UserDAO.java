package org.example.web.dao;


import org.example.web.entity.User;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAO implements UserDAOInterface{
    @PersistenceContext
    private EntityManager entityManager;

    public void save(User user) {
        entityManager.persist(user);
    }
    public void removeUser(long id) {
        entityManager.remove(findUser(id));
    }

    public void editUser(User user) {
        entityManager.merge(user);
    }
    public List<User> getAllUser() {
        return entityManager.createQuery("from User",User.class).getResultList();
    }

    public User findUser(long id) {
        return entityManager.find(User.class,id);
    }
}
