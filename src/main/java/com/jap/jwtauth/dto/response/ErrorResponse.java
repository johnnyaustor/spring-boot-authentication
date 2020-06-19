package com.jap.jwtauth.dto.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ErrorResponse {
    private List<FieldErrorValidation> errors = new ArrayList<>();
}
