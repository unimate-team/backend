package com.unimate.backend.accounts.domain;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "college")
@Getter
@Setter
@NoArgsConstructor
public class College {
    @Id
    @Column(name = "college_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long collegeId;

    @Column(name = "college_name")
    private String collegeName;
}
