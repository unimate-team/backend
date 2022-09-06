package com.unimate.backend.accounts.domain;

import javax.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
@Getter
@NoArgsConstructor
public class University {

    @Id
    @Column(name = "university_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "university_name")
    private String universityName;

    @OneToMany(mappedBy = "university")
    private List<Major> major = new ArrayList<>();

    @Builder
    public University(String universityName, List<Major> major) {
        this.universityName = universityName;
        this.major = major;
    }
}