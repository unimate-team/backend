package com.unimate.backend.accounts.domain;

import javax.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "college")
@Getter
@NoArgsConstructor
public class College {

    @Id
    @Column(name = "college_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "college_name")
    private String collegeName;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @OneToMany(mappedBy = "college")
    private List<Major> major = new ArrayList<>();

    @Builder
    public College(String collegeName, University university, List<Major> major) {
        this.collegeName = collegeName;
        this.university = university;
        this.major = major;
    }
}
