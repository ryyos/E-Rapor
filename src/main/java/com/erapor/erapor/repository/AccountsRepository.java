package com.erapor.erapor.repository;

import com.erapor.erapor.model.DAO.AccountsDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<AccountsDAO, Integer> {

    Boolean findByEmail(String email);
}
