package com.erapor.erapor.model.DAO;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "accounts")
public class AccountsDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(max = 100)
    private String email;

    @NotBlank
    @Size(max = 100)
    private String password;

    @NotBlank
    @Size(max = 100)
    private String username;

    @NotBlank
    @Size(max = 50)
    private Integer phone;

    @Size(max = 100)
    private String token;

    @Column(name = "token_expired")
    private Long tokenExpired;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private StudentsDAO student;
}
