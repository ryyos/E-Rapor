package com.erapor.erapor.service;

import com.erapor.erapor.model.DAO.StudentsDAO;
import com.erapor.erapor.model.DAO.ValuesDAO;
import com.erapor.erapor.model.DTO.RankingDTO;
import com.erapor.erapor.model.DTO.StudentsDTO;
import com.erapor.erapor.repository.StudentsRepository;
import com.erapor.erapor.repository.ValuesRepository;
import com.erapor.erapor.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class StudentsService {

    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    ValuesRepository valuesRepository;

    @Autowired
    Converter converter;

    public List<RankingDTO> ranking(Integer page, Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return converter.toListRankingDTO(studentsRepository.findRanking(pageable), page, size);
    }

    public RankingDTO byName(String name){
        List<StudentsDAO> students = studentsRepository.findRanking();
        StudentsDAO student = studentsRepository.findByName(name);
        return new RankingDTO(student,students.indexOf(student) + 1 );
    }


}
