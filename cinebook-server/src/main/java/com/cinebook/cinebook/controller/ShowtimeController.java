package com.cinebook.cinebook.controller;

import com.cinebook.cinebook.dto.ShowtimeResponseDTO;
import com.cinebook.cinebook.model.ShowTime;
import com.cinebook.cinebook.service.ShowtimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/showtime")
@RequiredArgsConstructor
public class ShowtimeController {
    private final ShowtimeService showTimeService;
    @PostMapping("/{movieId}/{screenId}")
    public ShowTime addShowTime(
            @PathVariable Long movieId,
            @PathVariable Long screenId,
            @RequestBody ShowTime showTime) {
        return showTimeService.addShowTime(movieId, screenId, showTime);
    }
}