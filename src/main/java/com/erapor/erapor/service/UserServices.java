package com.erapor.erapor.service;

import com.erapor.erapor.exception.ApiException;
import com.erapor.erapor.model.DAO.AccountsDAO;
import com.erapor.erapor.model.DTO.RegisterDTO;
import com.erapor.erapor.repository.AccountsRepository;
import com.erapor.erapor.security.BCrypt;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class UserServices {

    @Autowired
    AccountsRepository accountsRepository;

    @Autowired
    Validator validator;


    @Transactional
    public void register(RegisterDTO registerDTO){
        Set<ConstraintViolation<RegisterDTO>> constraintViolation = validator.validate(registerDTO);

        if(constraintViolation.isEmpty()){
            throw new ConstraintViolationException(constraintViolation);
        }

        if(accountsRepository.findByEmail(registerDTO.getEmail())){
            throw new ApiException("email already exist!");
        }

        AccountsDAO accountsDAO = new AccountsDAO();
        accountsDAO.setEmail(registerDTO.getEmail());
        accountsDAO.setPassword(BCrypt.hashpw(registerDTO.getPassword(),BCrypt.gensalt()));
        accountsDAO.setUsername(registerDTO.getName());
        accountsDAO.setPhone(registerDTO.getPhone());

        accountsRepository.save(accountsDAO);

    }
}





























