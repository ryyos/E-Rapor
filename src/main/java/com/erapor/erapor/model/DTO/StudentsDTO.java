package com.erapor.erapor.model.DTO;

import com.erapor.erapor.model.DAO.StudentsDAO;
import com.erapor.erapor.model.DAO.ValuesDAO;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
public class StudentsDTO {

    private String UUID;
    private String name;
    private Date dob;
    private String NISN;
    private String majors;
    private String gender;
    private String city;
    private String country;

    private ValuesDAO values;

    public StudentsDTO(StudentsDAO studentsDAO){
        this.UUID = studentsDAO.getId();
        this.name = studentsDAO.getName();
        this.dob = studentsDAO.getDob();
        this.NISN = studentsDAO.getNISN();
        this.majors = studentsDAO.getMajor();
        this.gender = studentsDAO.getGender();
        this.city = studentsDAO.getCity();
        this.country = studentsDAO.getCountry();
        this.values = studentsDAO.getValuesDAO();
    }
}
