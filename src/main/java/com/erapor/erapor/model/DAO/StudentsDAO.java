package com.erapor.erapor.model.DAO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "students")
public class StudentsDAO {

    @Id
    private String id;
    private String name;
    private Date dob;
    private String NISN;
    private String major;
    private String gender;
    private String city;
    private String country;

    @JsonIgnoreProperties("student")
    @OneToOne(mappedBy = "student")
    private ValuesDAO valuesDAO;
}
