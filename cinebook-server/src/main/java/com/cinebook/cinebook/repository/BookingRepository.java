package com.cinebook.cinebook.repository;

import com.cinebook.cinebook.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByUserId(Long userId);

    // native query to get booked seat ids for a showtime (assumes join table name booking_seats)
    @Query(value = "SELECT bs.seat_id FROM booking_seats bs INNER JOIN booking b ON bs.booking_id = b.id WHERE b.show_time_id = :showTimeId AND b.payment_success = true", nativeQuery = true)
    List<Long> findBookedSeatIdsByShowTime(Long showTimeId);
}
