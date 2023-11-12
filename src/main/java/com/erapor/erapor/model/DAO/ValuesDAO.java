package com.erapor.erapor.model.DAO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "`values`")
public class ValuesDAO {

    @Id
    private String id;
    private Integer IPA;
    private Integer IPS;
    private Integer MTK;
    private Integer TOTAL;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "student_id", nullable = false, updatable = false)
    private StudentsDAO student;
}
