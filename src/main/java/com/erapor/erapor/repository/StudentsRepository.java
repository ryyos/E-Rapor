package com.erapor.erapor.repository;

import com.erapor.erapor.model.DAO.StudentsDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<StudentsDAO, String> {
}
