package com.unimate.backend.accounts.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @JsonIgnore
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "username is empty")
    @Column(name = "username", length = 30, unique = true)
    private String username;

    @NotBlank(message = "password is empty")
    @Column(name = "password", length = 100)
    private String password;

    @NotBlank(message = "email is empty")
    @Email
    @Column(name = "email", length = 200, unique = true)
    private String email;

    @NotBlank(message = "role is empty")
    private RoleType role;

//    @Column(name = "activated")
//    private boolean activated;

    @NotBlank(message = "use agree is empty")
    @Column(name = "use_agree")
    private boolean useAgree;

    @NotBlank(message = "information agree is empty")
    @Column(name = "information_agree")
    private boolean informationAgree;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "university")
    private University university;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "major")
    private Major major;

    @Column(name = "nickname", length = 200)
    private String nickname;

    @Column(name = "phone_nm", length = 80)
    private String phoneNm;

    @Column(name = "birth", length = 80)
    private Date birth;

    @Column(name = "introducing", length = 255)
    private String introducing;

    @Email
    @Column(name = "school_email", length = 200, nullable = true)
    private String schoolEmail;

    @CreationTimestamp
    @Column(name = "create_at", nullable = false, length = 20, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "update_at", length = 20)
    private LocalDateTime updatedAt;
}
