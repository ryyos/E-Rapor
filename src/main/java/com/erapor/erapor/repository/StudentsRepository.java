package com.erapor.erapor.repository;

import com.erapor.erapor.model.DAO.StudentsDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentsRepository extends JpaRepository<StudentsDAO, String> {

    @Query("SELECT s FROM StudentsDAO s JOIN s.valuesDAO val ORDER BY val.TOTAL DESC")
    List<StudentsDAO> findRanking();

}

/*SELECT
        s.name,
        (v.MTK + v.IPS + v.IPA) AS total_value,
        v.MTK,
        v.IPS,
        v.IPA
FROM students AS s
JOIN `values` AS v
        ON s.id = v.student_id
ORDER BY total_value DESC LIMIT 10 ;
*/
