package com.erapor.erapor.service;

import com.erapor.erapor.model.DAO.StudentsDAO;
import com.erapor.erapor.model.DAO.ValuesDAO;
import com.erapor.erapor.model.DTO.RankingDTO;
import com.erapor.erapor.model.DTO.StudentsDTO;
import com.erapor.erapor.repository.StudentsRepository;
import com.erapor.erapor.repository.ValuesRepository;
import com.erapor.erapor.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    ValuesRepository valuesRepository;

    @Autowired
    Converter converter;

    public List<StudentsDTO> ranking(){
        List<StudentsDTO> studentsDTOS = converter.listDaoToDto(studentsRepository.findRanking());
        return studentsDTOS;
    }

}
