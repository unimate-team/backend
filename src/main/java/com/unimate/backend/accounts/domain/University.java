package com.unimate.backend.accounts.domain;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "university")
@Getter
@Setter
@NoArgsConstructor
public class University {

    @Id
    @Column(name = "university_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long universityId;

    @Column(name = "university_name")
    private String universityName;

}
