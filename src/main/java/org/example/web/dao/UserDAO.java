package org.example.web.dao;


import org.example.web.entity.User;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(User user) {
        entityManager.persist(user);
    }
    public void revoveUser(User user) {
        entityManager.remove(user);
    }


    public List<User> getAllUser() {
        return entityManager.createQuery("from User",User.class).getResultList();
    }
}
