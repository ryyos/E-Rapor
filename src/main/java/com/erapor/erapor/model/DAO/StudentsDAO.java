package com.erapor.erapor.model.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "students")
public class StudentsDAO {

    @Id
    private String uuid;
    private String name;
    private Date dob;
    private String NISN;
    private String majors;
    private String gender;
    private String city;
    private String country;
}
