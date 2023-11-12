package com.erapor.erapor.utils;

import com.erapor.erapor.model.DAO.StudentsDAO;
import com.erapor.erapor.model.DTO.RankingDTO;
import com.erapor.erapor.model.DTO.StudentsDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



public class Converter {

    public List<StudentsDTO> toListStudentsDTO(List<StudentsDAO> studentsDAOS){
        List<StudentsDTO> results = new ArrayList<>();

        for (StudentsDAO raw:studentsDAOS) {
            results.add(new StudentsDTO(raw));
        }

        return results;
    }

    public List<RankingDTO> toListRankingDTO(List<StudentsDAO> studentsDAOS, Integer page, Integer size){
        List<RankingDTO> results = new ArrayList<>();

        Integer start = (page * size);
        Integer end = size;

        for (StudentsDAO raw:studentsDAOS) {
            start++;
            results.add(new RankingDTO(raw, start));
        }

        return results;
    }
}
