package com.fintech.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class BvnValidationResponse {
    private boolean isValid;
    private String message;

}
