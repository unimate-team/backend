package com.unimate.backend.accounts.dto;

import com.unimate.backend.accounts.domain.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AccountResponseDto {
    private Long id;
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

    public AccountResponseDto(Account entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.password = entity.getPassword();
        this.email = entity.getEmail();
        this.role = entity.getRole();
        this.useAgree = entity.isUseAgree();
        this.informationAgree = entity.isInformationAgree();
        this.major = entity.getMajor();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
        this.withdrawStatus = entity.getWithdrawStatus();
    }
}
