package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnswerDTO {
    private String eventId;
    private String message;
}
