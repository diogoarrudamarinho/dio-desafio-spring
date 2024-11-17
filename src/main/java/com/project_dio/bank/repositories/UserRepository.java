package com.project_dio.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project_dio.bank.dto.UserDTO;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {
    
}
