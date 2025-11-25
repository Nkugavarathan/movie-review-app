package com.cinebook.cinebook.service;

import com.cinebook.cinebook.dto.TheaterDetailDTO;
import com.cinebook.cinebook.dto.TheaterRequest;
import com.cinebook.cinebook.model.Theater;
import com.cinebook.cinebook.repository.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TheaterService {
//    List<Theater> listTheaters();
//    TheaterDetailDTO getTheaterDetail(Long theaterId);
//    Theater createTheater(Theater theater);
//    TheaterDetailDTO addTheater(TheaterDetailDTO dto);

//    TheaterDetailDTO updateTheater(Long id, TheaterDetailDTO dto);

//    void deleteTheater(Long id);

    private final TheaterRepository theaterRepository;

    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    public Theater getTheaterById(Long id) {
        return theaterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Theater not found"));
    }

    public Theater addTheater(TheaterRequest req) {
        Theater theater = Theater.builder()
                .name(req.getName())
                .city(req.getCity())
                .address(req.getAddress())
                .build();

        return theaterRepository.save(theater);
    }

    public Theater updateTheater(Long id, TheaterRequest req) {
        Theater theater = getTheaterById(id);

        theater.setName(req.getName());
        theater.setCity(req.getCity());
        theater.setAddress(req.getAddress());

        return theaterRepository.save(theater);
    }

    public void deleteTheater(Long id) {
        if (!theaterRepository.existsById(id)) {
            throw new RuntimeException("Theater does not exist");
        }
        theaterRepository.deleteById(id);
    }

}
