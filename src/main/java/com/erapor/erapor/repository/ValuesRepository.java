package com.erapor.erapor.repository;

import com.erapor.erapor.model.DAO.ValuesDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValuesRepository extends JpaRepository<ValuesDAO, String> {
}
