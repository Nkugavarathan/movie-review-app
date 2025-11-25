package com.cinebook.cinebook.controller;

import com.cinebook.cinebook.dto.MovieRequestDTO;
import com.cinebook.cinebook.model.Movie;
import com.cinebook.cinebook.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/movies")
@RequiredArgsConstructor
public class AdminMovieController {

    private  final MovieService movieService;
    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Movie createMovie(@RequestBody MovieRequestDTO dto){
        return  movieService.createMovie(dto);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.ok("Movie deleted successfully");
    }
    @PutMapping("/{id}")
    public Movie update(@PathVariable Long id, @RequestBody MovieRequestDTO dto) {
        return movieService.updateMovie(id,dto);
    }
}
