package com.project_dio.bank.services.implementation;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_dio.bank.entities.User;
import com.project_dio.bank.repositories.UserRepository;
import com.project_dio.bank.services.UserService;

@Service
public class UserServiceImp implements UserService{
    
    @Autowired
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository repository){
        this.userRepository = repository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User newUser) {
        if (newUser.getId() != null && userRepository.existsById(newUser.getId()))
            throw new IllegalArgumentException("User ID already exists");

        return userRepository.save(newUser);
    }


}
