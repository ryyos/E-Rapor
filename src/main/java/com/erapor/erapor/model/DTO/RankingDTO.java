package com.erapor.erapor.model.DTO;

import com.erapor.erapor.model.DAO.StudentsDAO;
import com.erapor.erapor.model.DAO.ValuesDAO;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class RankingDTO {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ranking;
    private String name;
    private String major;
    private Integer MTK;
    private Integer IPA;
    private Integer IPS;
    private Integer total_value;

    public RankingDTO(StudentsDAO studentsDAO, ValuesDAO valuesDAO){
        this.name = studentsDAO.getName();
        this.major = studentsDAO.getMajor();
        this.MTK = valuesDAO.getMTK();
        this.IPA = valuesDAO.getIPA();
        this.IPS = valuesDAO.getIPS();
        this.total_value = valuesDAO.getTOTAL();

    }

}
