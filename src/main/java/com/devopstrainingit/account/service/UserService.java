package com.devopstrainingit.account.service;

import java.util.List;

import com.devopstrainingit.account.model.User;

/** {@author sagar}!*/
public interface UserService {
	/** {@inheritDoc}} !*/
    void save(User user);
    /** {@inheritDoc}} !*/
    User findByUsername(String username);
    User findById(long id);
    /*public void updateUser(User user);*/
    public List <User> getList();
}
