package com.example.springapp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DSgarden;
import com.example.springapp.repository.Repo;


@Service
public class Sservice {
    @Autowired
    private  Repo repo;
    public List<DSgarden> ListAll(){
        return repo.findAll();
    }
    public User createnewuser(User user) {
        throw new UnsupportedOperationException("Unimplemented method 'createnewuser'");
    }
    public Optional<User> getModelByEmail(String email) {
        throw new UnsupportedOperationException("Unimplemented method 'getModelByEmail'");
    }
    public List<User> getAllusers() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllusers'");
    }
    public User updateUser(String email, User updateRequest) {
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }
    public void removeUser(Integer userId) {
        throw new UnsupportedOperationException("Unimplemented method 'removeUser'");
    }

}