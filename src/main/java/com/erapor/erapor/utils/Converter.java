package com.erapor.erapor.utils;

import com.erapor.erapor.model.DAO.StudentsDAO;
import com.erapor.erapor.model.DTO.StudentsDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



public class Converter {

    public List<StudentsDTO> listDaoToDto(List<StudentsDAO> studentsDAOS){
        List<StudentsDTO> results = new ArrayList<>();

        for (StudentsDAO raw:studentsDAOS) {
            results.add(new StudentsDTO(raw));
        }

        return results;
    }
}
