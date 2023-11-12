package com.erapor.erapor.model.DTO;

import com.erapor.erapor.model.DAO.ValuesDAO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class ValuesDTO {

    private String id;
    private Integer IPA;
    private Integer MTK;
    private Integer IPS;
    private Integer TOTAL;
    private String student_id;

    public ValuesDTO(ValuesDAO valuesDAO){
        this.id = valuesDAO.getId();
        this.IPA = valuesDAO.getIPA();
        this.IPS = valuesDAO.getIPS();
        this.MTK = valuesDAO.getMTK();
        this.TOTAL = valuesDAO.getTOTAL();
    }
}
