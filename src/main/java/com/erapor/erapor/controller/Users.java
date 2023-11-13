package com.erapor.erapor.controller;

import com.erapor.erapor.model.DTO.RegisterDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Users {

    @PostMapping("/register")
    public void register(RegisterDTO registerDTO){

    }

}
