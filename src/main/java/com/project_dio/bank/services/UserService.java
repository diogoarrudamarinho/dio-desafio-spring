package com.project_dio.bank.services;

import com.project_dio.bank.dto.UserDTO;

public interface UserService {
    
    UserDTO findById (Long id);

    UserDTO create(UserDTO newUser);
}
