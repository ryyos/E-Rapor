package com.erapor.erapor.controller;

import com.erapor.erapor.model.DTO.RegisterDTO;
import com.erapor.erapor.response.Response;
import com.erapor.erapor.service.UserServices;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Users {

    @Autowired
    UserServices userServices;

    @PostMapping(
            path = "/register",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Response<String> register(@RequestBody RegisterDTO registerDTO){
        userServices.register(registerDTO);
        return Response.<String>builder()
                .data("ok")
                .build();
    }

}
