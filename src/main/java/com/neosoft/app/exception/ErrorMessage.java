package com.neosoft.app.exception;

import lombok.Data;

@Data
public class ErrorMessage {
    private int status;
    private String error;
}
