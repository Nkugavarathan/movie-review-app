package com.cinebook.cinebook.controller;

import com.cinebook.cinebook.dto.TheaterRequest;
import com.cinebook.cinebook.model.Theater;
import com.cinebook.cinebook.service.TheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/theaters")
@RequiredArgsConstructor
public class AdminTheaterController {
    private final TheaterService theaterService;

    // GET ALL
    @GetMapping
    public List<Theater> getAll() {
        return theaterService.getAllTheaters();
    }

    // GET ONE
    @GetMapping("/{id}")
    public Theater getOne(@PathVariable Long id) {
        return theaterService.getTheaterById(id);
    }

    // ADD THEATER
    @PostMapping
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Theater addTheater(@RequestBody TheaterRequest req) {
        return theaterService.addTheater(req);
    }

    // UPDATE THEATER
    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Theater updateTheater(@PathVariable Long id, @RequestBody TheaterRequest req) {
        return theaterService.updateTheater(id, req);
    }

    // DELETE THEATER
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> deleteTheater(@PathVariable Long id) {
        theaterService.deleteTheater(id);
        return ResponseEntity.ok("Theater deleted successfully");
    }
}
