package com.erapor.erapor.repository;

import com.erapor.erapor.model.DAO.StudentsDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentsRepository extends JpaRepository<StudentsDAO, String> {

    @Query("SELECT s FROM StudentsDAO s JOIN FETCH s.valuesDAO val ORDER BY val.TOTAL DESC")
    List<StudentsDAO> findRanking();

}
