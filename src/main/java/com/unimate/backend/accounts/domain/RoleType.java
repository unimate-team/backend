package com.unimate.backend.accounts.domain;

import lombok.*;

import javax.persistence.Table;

@Getter
@Table(name = "roll_type")
@AllArgsConstructor
@NoArgsConstructor
public enum RoleType {
    ROLE_USER(0, "ROLE_USER"),
    ROLE_ADMIN(1, "ROLE_ADMIN");

    private Integer codeRole;
    private String strRole;

    public static RoleType getRoleType(Integer codeRole) {
        if(codeRole == null) {
            return  null;
        }

        switch (codeRole) {
            case 0 :
                return RoleType.ROLE_USER;
            case 1:
                return RoleType.ROLE_ADMIN;
            default:
                return null;
        }
    }

    public static RoleType getRoleType(String strRole) {
        if(strRole == null) {
            return null;
        }

        switch(strRole) {

            case "ROLE_USER":
                return RoleType.ROLE_USER;
            case "ROLE_ADMIN":
                return RoleType.ROLE_ADMIN;
            default:
                return null;
        }
    }
}
