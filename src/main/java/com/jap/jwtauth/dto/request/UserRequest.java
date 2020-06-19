package com.jap.jwtauth.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author jap
 */

@Data
public class UserRequest {
    private Long id;
    @NotNull
    private String fullName;
    @NotNull
    private String username;
    @NotNull
    private String password;
}
