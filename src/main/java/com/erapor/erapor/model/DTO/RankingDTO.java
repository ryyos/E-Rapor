package com.erapor.erapor.model.DTO;

import com.erapor.erapor.model.DAO.StudentsDAO;
import lombok.Data;

@Data
public class RankingDTO {


    private Integer ranking;
    private String name;
    private String major;
    private Integer MTK;
    private Integer IPA;
    private Integer IPS;
    private Integer total_value;

    public RankingDTO(StudentsDAO studentsDAO) {
        this.name = studentsDAO.getName();
        this.major = studentsDAO.getMajor();
        this.MTK = studentsDAO.getValuesDAO().getMTK();
        this.IPA = studentsDAO.getValuesDAO().getIPA();
        this.IPS = studentsDAO.getValuesDAO().getIPS();
        this.total_value = studentsDAO.getValuesDAO().getTOTAL();

    }

    public RankingDTO(StudentsDAO studentsDAO, Integer ranking) {
        this.name = studentsDAO.getName();
        this.major = studentsDAO.getMajor();
        this.MTK = studentsDAO.getValuesDAO().getMTK();
        this.IPA = studentsDAO.getValuesDAO().getIPA();
        this.IPS = studentsDAO.getValuesDAO().getIPS();
        this.total_value = studentsDAO.getValuesDAO().getTOTAL();
        this.ranking = ranking;


    }

}
