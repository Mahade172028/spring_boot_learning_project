package com.example.learningjpa.service;

import com.example.learningjpa.repository.UserRepository;
import com.example.learningjpa.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoService {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    UserRepository userRepository;

    public long insert(Users users){
        entityManager.persist(users);
        return users.getId();
    }
}
