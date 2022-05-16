package com.yliad.diary.repository;

import com.yliad.diary.dto.response.CalendarResponseDto;

import java.util.List;

public interface DiaryQueryRepository {

    List<CalendarResponseDto> findDiaryByDiaryDateAndUserIDOrderByDiaryDate(Long userid, int month);
}