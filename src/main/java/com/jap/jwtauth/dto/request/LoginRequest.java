package com.jap.jwtauth.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author jap
 */

@Data
public class LoginRequest {
    @NotNull
    private String username;
    @NotNull
    private String password;
}
