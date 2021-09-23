package com.bd.airline.model;

import java.util.List;

public class Pilot extends Traveler {

    private Long id;

    private String category;

    private int numberOfFlights;

    private int yearsInService;

    private List<Flight> flight;

}
