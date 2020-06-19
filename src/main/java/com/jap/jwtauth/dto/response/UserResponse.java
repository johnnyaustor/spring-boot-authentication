package com.jap.jwtauth.dto.response;

import lombok.Data;

/**
 * @author jap
 */

@Data
public class UserResponse {
    private Long id;
    private String fullName;
    private String username;
}
