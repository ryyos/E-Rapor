package com.erapor.erapor.model.DAO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "`values`")
public class ValuesDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer IPA;
    private Integer IPS;
    private Integer MTK;
    private Integer TOTAL;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "student_id", nullable = false, updatable = false)
    private StudentsDAO student;
}
