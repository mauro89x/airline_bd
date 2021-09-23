package com.bd.airline.model;

import java.util.List;

public class Passenger extends Traveler {

    private Long id;

    private String phone;

    private String address;

    private List<Reservation> reservations;
}
