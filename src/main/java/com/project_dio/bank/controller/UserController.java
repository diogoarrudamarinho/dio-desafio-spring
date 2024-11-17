package com.project_dio.bank.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project_dio.bank.dto.UserDTO;
import com.project_dio.bank.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService service){
        this.userService = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id)); 
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO newUser) {
        
        var userCreated = userService.create(newUser);
        
        URI location =  ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(userCreated.getId())
                        .toUri();

        return ResponseEntity.created(location).body(userCreated);
    }
    

}
