package com.unimate.backend.accounts.domain;

import javax.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "major")
@Getter
@NoArgsConstructor
public class Major {
    @Id
    @Column(name = "major_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "major_name")
    private String majorName;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    @Builder
    public Major(String majorName, University university, College college) {
        this.majorName = majorName;
        this.university = university;
        this.college = college;
    }
}