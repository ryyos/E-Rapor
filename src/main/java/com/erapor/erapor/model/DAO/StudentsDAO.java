package com.erapor.erapor.model.DAO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "students")
public class StudentsDAO {

    @Id
    @NotBlank
    @Size(max = 50)
    private String id;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    private Date dob;

    @NotBlank
    @Size(max = 20)
    private String nisn;

    @NotBlank
    @Size(max = 20)
    private String major;

    @NotBlank
    @Size(max = 50)
    private String gender;

    @NotBlank
    @Size(max = 100)
    private String city;

    @NotBlank
    @Size(max = 100)
    private String country;

    @JsonIgnoreProperties("student")
    @OneToOne(mappedBy = "student")
    private ValuesDAO valuesDAO;

    @JsonIgnoreProperties("student")
    @OneToOne(mappedBy = "student")
    private AccountsDAO accountsDAO;
}
