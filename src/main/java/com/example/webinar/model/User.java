package com.example.webinar.model;


import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String nickname;
    private String email;
    private String hashPassword;
    private Integer trys = -1;

    @Transient
    private String password;

}
