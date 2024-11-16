package com.project_dio.bank.services;

import com.project_dio.bank.entities.User;

public interface UserService {
    
    User findById (Long id);

    User create(User newUser);
}
