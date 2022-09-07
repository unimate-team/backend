package com.unimate.backend.accounts.dto;

import com.unimate.backend.accounts.domain.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class AccountSaveRequestDto {
    private String username;
    private String password;
    private String email;
    private RoleType role;
    private boolean useAgree;
    private boolean informationAgree;
    private Major major;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String withdrawStatus;

    @Builder
    public AccountSaveRequestDto(String username, String password, String email, RoleType role,
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

    public Account toEntity(){
        return Account.builder()
                .username(username)
                .password(password)
                .email(email)
                .role(role)
                .useAgree(useAgree)
                .informationAgree(informationAgree)
                .major(major)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .withdrawStatus(withdrawStatus)
                .build();
    }
}