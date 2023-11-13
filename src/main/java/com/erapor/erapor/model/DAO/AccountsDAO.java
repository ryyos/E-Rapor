package com.erapor.erapor.model.DAO;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "accounts")
public class AccountsDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(max = 36)
    private String email;

    @NotBlank
    @Size(max = 36)
    private String password;

    @NotBlank
    @Size(max = 36)
    private String username;

    @Size(max = 100)
    private String token;

    @Column(name = "token_expired")
    private Long tokenExpired;
}
