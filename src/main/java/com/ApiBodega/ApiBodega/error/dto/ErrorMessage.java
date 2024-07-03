package com.ApiBodega.ApiBodega.error.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ErrorMessage {

    private HttpStatus status;
    private String message;
}

