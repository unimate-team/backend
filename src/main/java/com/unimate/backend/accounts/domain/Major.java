package com.unimate.backend.accounts.domain;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "major")
@Getter
@Setter
@NoArgsConstructor
public class Major {

    @Id
    @Column(name = "major_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long majorId;

    @Column(name = "major_name")
    private String majorName;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;
}
