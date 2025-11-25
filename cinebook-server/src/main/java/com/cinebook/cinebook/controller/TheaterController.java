package com.cinebook.cinebook.controller;

import com.cinebook.cinebook.dto.TheaterDetailDTO;
import com.cinebook.cinebook.model.Theater;
import com.cinebook.cinebook.service.TheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/theaters")
@RequiredArgsConstructor
public class TheaterController {

    private final TheaterService theaterService;

    @GetMapping
    public List<Theater> getAll() {
        return theaterService.getAllTheaters();
    }

    @GetMapping("/{id}")
    public Theater get(@PathVariable Long id) {
        return theaterService.getTheaterById(id);
    }

}
