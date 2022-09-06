package com.unimate.backend.accounts.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Getter
@Table(name = "account")
@NoArgsConstructor
@Entity
public class Account {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 30, unique = true)
    private String username;

    @Column(name = "password", length = 100)
    private String password;

    @Email
    @Column(name = "email", length = 200, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private RoleType role;

    @Column(name = "use_agree")
    private boolean useAgree;

    @Column(name = "information_agree")
    private boolean informationAgree;

    @OneToOne
    @JoinColumn(name = "major_id")
    private Major major;

    @CreationTimestamp
    @Column(name = "create_at", nullable = false, length = 20, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "update_at", length = 20)
    private LocalDateTime updatedAt;

    @Column(name = "withdraw_status")
    private String withdrawStatus;


    @Builder

    public Account(String username, String password, String email, RoleType role,
                   boolean useAgree, boolean informationAgree, Major major,
                   LocalDateTime createdAt, LocalDateTime updatedAt, String withdrawStatus) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.useAgree = useAgree;
        this.informationAgree = informationAgree;
        this.major = major;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.withdrawStatus = withdrawStatus;
    }
}
