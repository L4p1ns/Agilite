package com.iam.gesconsspring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProjetException extends RuntimeException {
    public ProjetException(String message) {
        super(message);
    }
}
