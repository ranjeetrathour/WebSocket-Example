package com.example.modle;

import lombok.Data;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
public class Message {
    private LocalDateTime localDateTime;
    private String message;
}
