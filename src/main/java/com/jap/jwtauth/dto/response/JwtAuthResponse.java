package com.jap.jwtauth.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jap
 */

@Data
@AllArgsConstructor
public class JwtAuthResponse {
    private String token;
}
