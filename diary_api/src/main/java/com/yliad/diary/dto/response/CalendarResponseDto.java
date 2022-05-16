package com.yliad.diary.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CalendarResponseDto {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd")
    LocalDateTime day;
    String emotion;

    @Builder
    public CalendarResponseDto(LocalDateTime day, String emotion) {
        this.day = day;
        this.emotion = emotion;
    }
}
