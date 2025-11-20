package com.cinebook.cinebook.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalAmount;

    @ManyToOne
    private User user;

    @ManyToOne
    private ShowTime showTime;

    @ManyToMany
    private List<Seat> seats;

    private String paymentId; // Stripe payment ID
    private boolean paymentSuccess;
}

