package com.rbp.movieapp.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class MessageResponse {
    private String message;

    public MessageResponse(String s) {

    }
}